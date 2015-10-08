package org.eclipse.symphony.core.ui.wizards;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.net.URL;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.presentation.CustomEMFEcoreInvocatorEditor;
import org.eclipse.symphony.core.ui.Activator;
import org.eclipse.symphony.core.ui.NewSymphonyProjectSettings;
import org.eclipse.symphony.core.ui.NewSymphonySessionSettings;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFacade;
import org.eclipse.symphony.core.ui.SymphonyCoreUiFactory;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;
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

public class NewSymphonyProjectWizard extends Wizard implements INewWizard {
	private NewSymphonyProjectSettings newSymphonyProjectSettings;
	private NewSymphonySessionSettings newSymphonySessionSettings;
	private SymphonyResourceSettings symphonyResourceSettings;
	private IWorkbench workbench;
	private NewSymphonyProjectWizardPage newSymphonyProjectWizardPage;
	private NewSymphonySessionWizardPage newSymphonySessionWizardPage;
	private ImportRegisteredSymphonyProjectWizardPage importRegisteredSymphonyProjectWizardPage;

	/** The following member is used by performFinish(). */
	private IFolder symphonyFolder;

	/**
	 * Constructor for NewSymphonySessionWizard.
	 */
	public NewSymphonyProjectWizard() {
		super();
		setWindowTitle("New Symphony Project");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/symphony_new_project.png");
		setDefaultPageImageDescriptor(image);

		newSymphonyProjectWizardPage = new NewSymphonyProjectWizardPage(
				getNewSymphonyProjectSettings(), getSymphonyResourceSettings());

		newSymphonySessionWizardPage = new NewSymphonySessionWizardPage(
				getNewSymphonySessionSettings(), getSymphonyResourceSettings());

		importRegisteredSymphonyProjectWizardPage = new ImportRegisteredSymphonyProjectWizardPage();
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		addPage(newSymphonyProjectWizardPage);
		addPage(newSymphonySessionWizardPage);
		addPage(importRegisteredSymphonyProjectWizardPage);
	}

	private SymphonyResourceSettings getSymphonyResourceSettings() {

		if (symphonyResourceSettings == null) {
			symphonyResourceSettings = SymphonyCoreUiFactory.eINSTANCE
					.createSymphonyResourceSettings();
		}
		return symphonyResourceSettings;
	}

	private NewSymphonySessionSettings getNewSymphonySessionSettings() {
		if (newSymphonySessionSettings == null) {
			newSymphonySessionSettings = SymphonyCoreUiFactory.eINSTANCE
					.createNewSymphonySessionSettings();
		}
		return newSymphonySessionSettings;
	}

	private NewSymphonyProjectSettings getNewSymphonyProjectSettings() {
		if (newSymphonyProjectSettings == null) {
			newSymphonyProjectSettings = SymphonyCoreUiFactory.eINSTANCE
					.createNewSymphonyProjectSettings();
			newSymphonyProjectSettings.setDefaultValues();
		}
		return newSymphonyProjectSettings;
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation createSymphonyProjectOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				SymphonyCoreUiFacade.INSTANCE
						.createSymphonyProject(getNewSymphonyProjectSettings());
				symphonyFolder = SymphonyCoreUiFacade.INSTANCE
						.createSymphonySessionFolder(getNewSymphonyProjectSettings());

				if (getNewSymphonyProjectSettings().isImportRegisteredProject()) {
					/**
					 * Import Registered Session.
					 */
					try {
						URL url = new URL(importRegisteredSymphonyProjectWizardPage
								.getSessionContributor().uri.toString());
						InputStream inputStream = url.openConnection()
								.getInputStream();
						IFile newFile = symphonyFolder.getFile(getNewSymphonySessionSettings().getFilename());
						newFile.create(inputStream, true,
								new NullProgressMonitor());
					} catch (MalformedURLException e1) {
						e1.printStackTrace();
					} catch (IOException e) {
						e.printStackTrace();
					} finally{
						monitor.done();
					}
				} else {
					/**
					 * Create a new Session.
					 */
					SymphonyCoreUiFacade.INSTANCE
							.createSymphonyProject(getNewSymphonyProjectSettings());
					IFolder folder = SymphonyCoreUiFacade.INSTANCE
							.createSymphonySessionFolder(getNewSymphonyProjectSettings());

					InvocatorSession session = null;
					String filename = null;

					session = SymphonyCoreUiFacade.INSTANCE
							.createSymphonySession(getNewSymphonySessionSettings());
					filename = getNewSymphonySessionSettings().getFilename();
					try {
						SymphonyCoreUiFacade.INSTANCE
								.createSymphonySessionFile(folder, filename,
										session);
					} catch (Exception e) {
						e.printStackTrace();
					} finally {
						monitor.done();
					}
				}
			}
		};

		/**
		 * Execute Jobs.
		 */
		try {
			getContainer().run(false, false, createSymphonyProjectOperation);

			/**
			 * Selects the current file in the current view and open the editor.
			 */
			IFile modelFile = SymphonyCoreUiFacade.INSTANCE
					.getSymphonySessionFile(
							(IFolder) getSymphonyResourceSettings()
									.getResourceContainer(),
							getNewSymphonySessionSettings().getFilename());

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

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		IWizardPage nextPage = null;

		if (page.equals(newSymphonyProjectWizardPage)) {
			nextPage = getNewSymphonyProjectSettings()
					.isImportRegisteredProject() ? importRegisteredSymphonyProjectWizardPage
					: newSymphonySessionWizardPage;
		}
		return nextPage;
	}

	@Override
	public boolean canFinish() {
		return getNewSymphonyProjectSettings().isImportRegisteredProject() ? newSymphonyProjectWizardPage
				.isPageComplete()
				&& importRegisteredSymphonyProjectWizardPage.isPageComplete()
				: newSymphonyProjectWizardPage.isPageComplete()
						&& newSymphonySessionWizardPage.isPageComplete();
	}
}