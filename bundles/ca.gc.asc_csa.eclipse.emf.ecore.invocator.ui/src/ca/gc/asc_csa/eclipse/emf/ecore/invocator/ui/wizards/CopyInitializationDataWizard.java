package ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.wizards;

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.Activator;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ui.EMFEcoreInvocatorUiFacade;
import ca.gc.asc_csa.eclipse.utils.log.EventSeverity;
import ca.gc.asc_csa.eclipse.utils.log.Logger;

public class CopyInitializationDataWizard extends Wizard implements INewWizard {
	private CopyInitializationDataWizardPage page;

	/**
	 * Constructor for CopyInitializationDataWizard.
	 */
	public CopyInitializationDataWizard() {
		super();
		setWindowTitle("Copy Symphony Initialization Data");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID,
				"icons/wizban/symphony_copy_initialization_data.png");
		setDefaultPageImageDescriptor(image);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new CopyInitializationDataWizardPage();
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		try {
			EMFEcoreInvocatorUiFacade.INSTANCE.copyInitializationData(page.getSourceContext(), page.getDestinationContext());
			return true;
		} catch (Exception e) {
			Logger.INSTANCE.log(Activator.ID, this, "Contexts <" + page.getSourceContext().getName() + "> and <" + page.getDestinationContext().getName() + "> are not consistent.", EventSeverity.ERROR, e);
			return false;
		}
	}
}