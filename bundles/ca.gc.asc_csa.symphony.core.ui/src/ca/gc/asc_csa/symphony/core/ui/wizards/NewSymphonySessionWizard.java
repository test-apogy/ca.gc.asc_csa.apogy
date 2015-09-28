package ca.gc.asc_csa.symphony.core.ui.wizards;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.ui.part.ISetSelectionTarget;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.presentation.CustomEMFEcoreInvocatorEditor;
import ca.gc.asc_csa.symphony.core.ui.Activator;
import ca.gc.asc_csa.symphony.core.ui.NewSymphonySessionSettings;
import ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade;
import ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFactory;
import ca.gc.asc_csa.symphony.core.ui.SymphonyResourceSettings;

public class NewSymphonySessionWizard extends Wizard implements INewWizard {
	private NewSymphonySessionWizardPage page;
	private ISelection selection;
	private NewSymphonySessionSettings newSymphonySessionSettings;
	private IWorkbench workbench;
	private SymphonyResourceSettings symphonyResourceSettings;

	/**
	 * Constructor for NewSymphonySessionWizard.
	 */
	public NewSymphonySessionWizard() {
		super();
		setWindowTitle("New Symphony Session");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/symphony_new_project.png");
		setDefaultPageImageDescriptor(image);
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.selection = selection;
		this.workbench = workbench;
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		page = new NewSymphonySessionWizardPage(getNewSymphonySessionSettings(), getSymphonyResourceSettings());
		addPage(page);
	}
	
	private SymphonyResourceSettings getSymphonyResourceSettings() {		
		if (symphonyResourceSettings == null) {
			symphonyResourceSettings = SymphonyCoreUiFactory.eINSTANCE
					.createSymphonyResourceSettings();			
			symphonyResourceSettings.setResourceContainer(getResourceContainer(this.selection));
			symphonyResourceSettings.setResourceProject(getResourceContainer(this.selection).getProject());			
		}
		return symphonyResourceSettings;
	}

	private NewSymphonySessionSettings getNewSymphonySessionSettings() {
		if (newSymphonySessionSettings == null) {
			newSymphonySessionSettings = SymphonyCoreUiFactory.eINSTANCE
					.createNewSymphonySessionSettings();
			newSymphonySessionSettings.setDefaultValues(getResourceContainer(this.selection));
		}
		return newSymphonySessionSettings;
	}

	private IContainer getResourceContainer(ISelection selection) {
		IContainer result = null;
		if (selection != null && selection.isEmpty() == false
				&& selection instanceof IStructuredSelection) {
			IStructuredSelection ssel = (IStructuredSelection) selection;
			Object obj = ssel.getFirstElement();
			if (obj instanceof IResource) {
				if (obj instanceof IContainer) {
					result = (IContainer) obj;
				} else {
					result = ((IResource) obj).getParent();
				}
			}
		}
		return result;
	}

	@Override
	public boolean performFinish() {

		WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {

			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				IContainer container = getResourceContainer(selection);
				InvocatorSession session = SymphonyCoreUiFacade.INSTANCE
						.createSymphonySession(getNewSymphonySessionSettings());
				try {
					SymphonyCoreUiFacade.INSTANCE
							.createSymphonySessionFile(container,
									getNewSymphonySessionSettings().getFilename(), session);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);

			IFile modelFile = SymphonyCoreUiFacade.INSTANCE.getSymphonySessionFile(getSymphonyResourceSettings().getResourceContainer(), getNewSymphonySessionSettings().getFilename()); 
			
			// Select the new file resource in the current view.
			//
			IWorkbenchWindow workbenchWindow = workbench
					.getActiveWorkbenchWindow();
			IWorkbenchPage page = workbenchWindow.getActivePage();
			final IWorkbenchPart activePart = page.getActivePart();
			if (activePart instanceof ISetSelectionTarget) {
				final ISelection targetSelection = new StructuredSelection(
						modelFile);
				getShell().getDisplay().asyncExec(new Runnable() {
					public void run() {
						((ISetSelectionTarget) activePart)
								.selectReveal(targetSelection);
					}
				});
			}

			// Open an editor on the new file.
			//
			try {
				page.openEditor(new FileEditorInput(modelFile),
						CustomEMFEcoreInvocatorEditor.ID);
			} catch (PartInitException exception) {
				// FIXME Logger
				exception.printStackTrace();
				return false;
			}

		} catch (InvocationTargetException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		return true;
	}


}