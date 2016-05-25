package ca.gc.asc_csa.apogy.rcp;

import java.net.URL;

import org.eclipse.core.runtime.Platform;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.application.IWorkbenchConfigurer;
import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchAdvisor;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;
import org.eclipse.ui.ide.IDE;
import org.eclipse.ui.internal.ide.IDEWorkbenchPlugin;
import org.osgi.framework.Bundle;

/**
 * This workbench advisor creates the window advisor, and specifies
 * the perspective id for the initial window.
 */
@SuppressWarnings("restriction")
public class ApplicationWorkbenchAdvisor extends WorkbenchAdvisor {
	
    public WorkbenchWindowAdvisor createWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        return new ApplicationWorkbenchWindowAdvisor(configurer);
    }

	public String getInitialWindowPerspectiveId() {
		return "ca.gc.asc_csa.apogy.rcp.perspective.overview";
	} 
	
	@Override
	public void initialize(IWorkbenchConfigurer configurer) {
	    super.initialize(configurer);

	    // inserted: register workbench adapters
	    IDE.registerAdapters();
	 
	    // inserted: register images for rendering explorer view
	    final String ICONS_PATH = "icons/full/";
	    final String PATH_OBJECT = ICONS_PATH + "obj16/";
		Bundle ideBundle = Platform.getBundle(IDEWorkbenchPlugin.IDE_WORKBENCH);
	    declareWorkbenchImage(configurer, ideBundle,
	        IDE.SharedImages.IMG_OBJ_PROJECT, PATH_OBJECT + "prj_obj.gif", true);
	    declareWorkbenchImage(configurer, ideBundle,
	        IDE.SharedImages.IMG_OBJ_PROJECT_CLOSED, PATH_OBJECT + "cprj_obj.gif", true);
	}
	 
	private void declareWorkbenchImage(IWorkbenchConfigurer configurer_p,
	        Bundle ideBundle, String symbolicName, String path, boolean shared) {
	    URL url = ideBundle.getEntry(path);
	    ImageDescriptor desc = ImageDescriptor.createFromURL(url);
	    configurer_p.declareImage(symbolicName, desc, shared);
	}
}