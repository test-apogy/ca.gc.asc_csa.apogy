package ca.gc.asc_csa.apogy.core.ui.wizards;

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
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.presentation.CustomApogyCoreInvocatorEditor;
import ca.gc.asc_csa.apogy.core.ui.Activator;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
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

public class NewApogyProjectWizard extends Wizard implements INewWizard {
	private NewApogyProjectSettings newApogyProjectSettings;
	private NewApogySessionSettings newApogySessionSettings;
	private ApogyResourceSettings apogyResourceSettings;
	private IWorkbench workbench;
	private NewApogyProjectWizardPage newApogyProjectWizardPage;
	private NewApogySessionWizardPage newApogySessionWizardPage;
	private ImportRegisteredApogyProjectWizardPage importRegisteredApogyProjectWizardPage;

	/** The following member is used by performFinish(). */
	private IFolder apogyFolder;

	/**
	 * Constructor for NewApogySessionWizard.
	 */
	public NewApogyProjectWizard() {
		super();
		setWindowTitle("New Apogy Project");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_project.png");
		setDefaultPageImageDescriptor(image);

		newApogyProjectWizardPage = new NewApogyProjectWizardPage(
				getNewApogyProjectSettings(), getApogyResourceSettings());

		newApogySessionWizardPage = new NewApogySessionWizardPage(
				getNewApogySessionSettings(), getApogyResourceSettings());

		importRegisteredApogyProjectWizardPage = new ImportRegisteredApogyProjectWizardPage();
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
		addPage(newApogyProjectWizardPage);
		addPage(newApogySessionWizardPage);
		addPage(importRegisteredApogyProjectWizardPage);
	}

	private ApogyResourceSettings getApogyResourceSettings() {

		if (apogyResourceSettings == null) {
			apogyResourceSettings = ApogyCoreUIFactory.eINSTANCE
					.createApogyResourceSettings();
		}
		return apogyResourceSettings;
	}

	private NewApogySessionSettings getNewApogySessionSettings() {
		if (newApogySessionSettings == null) {
			newApogySessionSettings = ApogyCoreUIFactory.eINSTANCE
					.createNewApogySessionSettings();
		}
		return newApogySessionSettings;
	}

	private NewApogyProjectSettings getNewApogyProjectSettings() {
		if (newApogyProjectSettings == null) {
			newApogyProjectSettings = ApogyCoreUIFactory.eINSTANCE
					.createNewApogyProjectSettings();
			newApogyProjectSettings.setDefaultValues();
		}
		return newApogyProjectSettings;
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation createApogyProjectOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException,
					InterruptedException {
				ApogyCoreUIFacade.INSTANCE
						.createApogyProject(getNewApogyProjectSettings());
				apogyFolder = ApogyCoreUIFacade.INSTANCE
						.createApogySessionFolder(getNewApogyProjectSettings());

				if (getNewApogyProjectSettings().isImportRegisteredProject()) {
					/**
					 * Import Registered Session.
					 */
					try {
						URL url = new URL(importRegisteredApogyProjectWizardPage
								.getSessionContributor().uri.toString());
						InputStream inputStream = url.openConnection()
								.getInputStream();
						IFile newFile = apogyFolder.getFile(getNewApogySessionSettings().getFilename());
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
					ApogyCoreUIFacade.INSTANCE
							.createApogyProject(getNewApogyProjectSettings());
					IFolder folder = ApogyCoreUIFacade.INSTANCE
							.createApogySessionFolder(getNewApogyProjectSettings());

					InvocatorSession session = null;
					String filename = null;

					session = ApogyCoreUIFacade.INSTANCE
							.createApogySession(getNewApogySessionSettings());
					filename = getNewApogySessionSettings().getFilename();
					try {
						ApogyCoreUIFacade.INSTANCE
								.createApogySessionFile(folder, filename,
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
			getContainer().run(false, false, createApogyProjectOperation);

			/**
			 * Selects the current file in the current view and open the editor.
			 */
			IFile modelFile = ApogyCoreUIFacade.INSTANCE
					.getApogySessionFile(
							(IFolder) getApogyResourceSettings()
									.getResourceContainer(),
							getNewApogySessionSettings().getFilename());

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

		if (page.equals(newApogyProjectWizardPage)) {
			nextPage = getNewApogyProjectSettings()
					.isImportRegisteredProject() ? importRegisteredApogyProjectWizardPage
					: newApogySessionWizardPage;
		}
		return nextPage;
	}

	@Override
	public boolean canFinish() {
		return getNewApogyProjectSettings().isImportRegisteredProject() ? newApogyProjectWizardPage
				.isPageComplete()
				&& importRegisteredApogyProjectWizardPage.isPageComplete()
				: newApogyProjectWizardPage.isPageComplete()
						&& newApogySessionWizardPage.isPageComplete();
	}
}