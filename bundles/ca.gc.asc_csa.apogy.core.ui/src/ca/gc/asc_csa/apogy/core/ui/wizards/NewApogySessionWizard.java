package ca.gc.asc_csa.apogy.core.ui.wizards;

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
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.presentation.CustomApogyCoreInvocatorEditor;
import ca.gc.asc_csa.apogy.core.ui.Activator;
import ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFactory;
import ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings;
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

public class NewApogySessionWizard extends Wizard implements INewWizard {
	private NewApogySessionWizardPage page;
	private ISelection selection;
	private NewApogySessionSettings newApogySessionSettings;
	private IWorkbench workbench;
	private ApogyResourceSettings apogyResourceSettings;

	/**
	 * Constructor for NewApogySessionWizard.
	 */
	public NewApogySessionWizard() {
		super();
		setWindowTitle("New Apogy Session");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_project.png");
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
		page = new NewApogySessionWizardPage(getNewApogySessionSettings(), getApogyResourceSettings());
		addPage(page);
	}
	
	private ApogyResourceSettings getApogyResourceSettings() {		
		if (apogyResourceSettings == null) {
			apogyResourceSettings = ApogyCoreUIFactory.eINSTANCE
					.createApogyResourceSettings();			
			apogyResourceSettings.setResourceContainer(getResourceContainer(this.selection));
			apogyResourceSettings.setResourceProject(getResourceContainer(this.selection).getProject());			
		}
		return apogyResourceSettings;
	}

	private NewApogySessionSettings getNewApogySessionSettings() {
		if (newApogySessionSettings == null) {
			newApogySessionSettings = ApogyCoreUIFactory.eINSTANCE
					.createNewApogySessionSettings();
			newApogySessionSettings.setDefaultValues(getResourceContainer(this.selection));
		}
		return newApogySessionSettings;
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
				InvocatorSession session = ApogyCoreUIFacade.INSTANCE
						.createApogySession(getNewApogySessionSettings());
				try {
					ApogyCoreUIFacade.INSTANCE
							.createApogySessionFile(container,
									getNewApogySessionSettings().getFilename(), session);
				} catch (Exception e) {
					e.printStackTrace();
				} finally {
					monitor.done();
				}
			}
		};

		try {
			getContainer().run(false, false, operation);

			IFile modelFile = ApogyCoreUIFacade.INSTANCE.getApogySessionFile(getApogyResourceSettings().getResourceContainer(), getNewApogySessionSettings().getFilename()); 
			
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
						CustomApogyCoreInvocatorEditor.ID);
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