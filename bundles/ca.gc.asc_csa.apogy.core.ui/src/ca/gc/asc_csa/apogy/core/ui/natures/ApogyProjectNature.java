package ca.gc.asc_csa.apogy.core.ui.natures;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;

public class ApogyProjectNature implements IProjectNature {

	public static final String NATURE_ID = "ca.gc.asc_csa.apogy.core.ui.natures.ApogyNature";
	
	@Override
	public void configure() throws CoreException {
	}

	@Override
	public void deconfigure() throws CoreException {
	}

	@Override
	public IProject getProject() {
		return null;
	}

	@Override
	public void setProject(IProject project) {
	}
}