package ca.gc.asc_csa.apogy.rcp;

import org.eclipse.ui.application.IWorkbenchWindowConfigurer;
import org.eclipse.ui.application.WorkbenchWindowAdvisor;

public class ApplicationWorkbenchWindowAdvisor extends WorkbenchWindowAdvisor {

    public ApplicationWorkbenchWindowAdvisor(IWorkbenchWindowConfigurer configurer) {
        super(configurer);
    }

//    public ActionBarAdvisor createActionBarAdvisor(IActionBarConfigurer configurer) {
//        return new ApplicationActionBarAdvisor(configurer);
//    }
    
//    public void preWindowOpen() {
//        IWorkbenchWindowConfigurer configurer = getWindowConfigurer();
//        configurer.setInitialSize(new Point(600, 400));
//        configurer.setShowCoolBar(true);
//        configurer.setShowStatusLine(false);
//    }    
}