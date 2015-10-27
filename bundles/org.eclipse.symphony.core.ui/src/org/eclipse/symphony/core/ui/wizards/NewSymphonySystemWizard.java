package org.eclipse.symphony.core.ui.wizards;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.invocator.presentation.CustomEMFEcoreInvocatorEditor;
import org.eclipse.symphony.core.ui.NewSymphonySystemSettings;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.Symphony__CoreUIFactory;
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

public class NewSymphonySystemWizard extends Wizard implements INewWizard {
	private NewSymphonySystemWizardPage page;
	private ISelection selection;
	private NewSymphonySystemSettings newSymphonySystemSettings;
	private IWorkbench workbench;

	/**
	 * Constructor for NewSymphonySessionWizard.
	 */
	public NewSymphonySystemWizard() {
		super();
		setNeedsProgressMonitor(true);
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
		page = new NewSymphonySystemWizardPage(getNewSymphonySystemSettings());
		addPage(page);
	}

	private NewSymphonySystemSettings getNewSymphonySystemSettings() {
		if (this.newSymphonySystemSettings == null) {
			this.newSymphonySystemSettings = Symphony__CoreUIFactory.eINSTANCE
					.createNewSymphonySystemSettings();
			IContainer container = getResourceContainer(this.selection);
			if (container != null) {

				// Make up a unique new name here.
				String defaultModelBaseFilename = "default";
				String defaultModelFilenameExtension = "ss";

				String modelFilename = defaultModelBaseFilename + "."
						+ defaultModelFilenameExtension;
				for (int i = 1; container.findMember(modelFilename) != null; ++i) {
					modelFilename = defaultModelBaseFilename + i + "."
							+ defaultModelFilenameExtension;
				}
				this.newSymphonySystemSettings.setFolder(container
						.getFullPath().toString());
				this.newSymphonySystemSettings.setFilename(modelFilename);
			}
		}
		return this.newSymphonySystemSettings;
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

	/**
	 * This method is called when 'Finish' button is pressed in the wizard. We
	 * will create an operation and run it using wizard as execution context.
	 */
	public boolean performFinish() {

		try {
			// Remember the file.
			//
			final IFile modelFile = getModelFile();

			// Do the work within an operation.
			//
			WorkspaceModifyOperation operation = new WorkspaceModifyOperation() {
				@Override
				protected void execute(IProgressMonitor progressMonitor) {
					try {
						// Create a resource set
						//
						ResourceSet resourceSet = new ResourceSetImpl();

						// Get the URI of the model file.
						//
						URI fileURI = URI.createPlatformResourceURI(modelFile
								.getFullPath().toString(), true);

						// Create a resource for this file.
						//
						Resource resource = resourceSet.createResource(fileURI);

						// Add the initial model object to the contents.
						//
						SymphonySystem system = SymphonyCoreUiFacade.INSTANCE
								.createSymphonySystem(newSymphonySystemSettings);
						if (system != null) {
							resource.getContents().add(system);
						}

						// Save the contents of the resource to the file system.
						//
						Map<Object, Object> options = new HashMap<Object, Object>();
						options.put(XMLResource.OPTION_ENCODING, "UTF-8");
						resource.save(options);
					} catch (Exception exception) {
						// FIXME Use Log
						exception.printStackTrace();
					} finally {
						progressMonitor.done();
					}
				}
			};

			getContainer().run(false, false, operation);

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
				page.openEditor(
						new FileEditorInput(modelFile), CustomEMFEcoreInvocatorEditor.ID);
			} catch (PartInitException exception) {
				// FIXME Use Log
				exception.printStackTrace();
				return false;
			}

			return true;
		} catch (Exception exception) {
			// FIXME Use Log
			exception.printStackTrace();
			return false;
		}
	}

	private IFile getModelFile() {
		return ResourcesPlugin
				.getWorkspace()
				.getRoot()
				.getFile(
						new Path(newSymphonySystemSettings.getFolder() + Path.SEPARATOR
								+ newSymphonySystemSettings.getFilename()));
	}
}