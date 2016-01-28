package ca.gc.asc_csa.apogy.addons.ros.ui.wizards;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.ros.internal.message.GenerateInterfaces;

public class GenerateJavaClassForROSWizard extends Wizard implements INewWizard
{
	private GenerateJavaClassForROSWizardDestinationPage pageOne;
	
	public GenerateJavaClassForROSWizard()
	{
		super();
		setWindowTitle("Create ROS Java classes.");
	}
	
	@Override
	public boolean canFinish() 
	{			
		boolean rosPackageDefined = pageOne.getROSPackagePath() != null && pageOne.getROSPackagePath().length() > 0;
		boolean destinationPathDefined = pageOne.getPath() != null && pageOne.getPath().length() > 0;
		return rosPackageDefined && destinationPathDefined;
	}
	
	@Override
	public boolean performFinish() 
	{		
		String[] args = new String[]{pageOne.getPath()};
		GenerateInterfaces.main(args);		
		return true;
	}
	
	@Override
	public void addPages() 
	{
		pageOne = new GenerateJavaClassForROSWizardDestinationPage("");
		addPage(pageOne);
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection)
	{
		
	}
}
