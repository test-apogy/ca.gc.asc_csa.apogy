package ca.gc.asc_csa.apogy.workspace.ui.wizards;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;

import ca.gc.asc_csa.apogy.workspace.ui.Activator;

public class NewApogyProjectWizard extends Wizard{
//	private NewApogyProjectSettings newApogyProjectSettings;
//	private NewApogySessionSettings newApogySessionSettings;
//	private ApogyResourceSettings apogyResourceSettings;
//	private IWorkbench workbench;
//	private NewApogyProjectWizardPage newApogyProjectWizardPage;
//	private NewApogySessionWizardPage newApogySessionWizardPage;
//	private ImportRegisteredApogyProjectWizardPage importRegisteredApogyProjectWizardPage;
//
//	/** The following member is used by performFinish(). */
//	private IFolder apogyFolder;

	/**
	 * Constructor for NewApogySessionWizard.
	 */
	public NewApogyProjectWizard() {
		super();
		setWindowTitle("New Apogy Project");
		setNeedsProgressMonitor(true);
//		ImageDescriptor image = Activator.getImageDescriptor(
//				Activator.ID + "/icons/wizban/apogy_new_project.png");
//		setDefaultPageImageDescriptor(image);

//		newApogyProjectWizardPage = new NewApogyProjectWizardPage(
//				getNewApogyProjectSettings(), getApogyResourceSettings());
//
//		newApogySessionWizardPage = new NewApogySessionWizardPage(
//				getNewApogySessionSettings(), getApogyResourceSettings());
//
//		importRegisteredApogyProjectWizardPage = new ImportRegisteredApogyProjectWizardPage();
	}


	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
//		addPage(newApogyProjectWizardPage);
//		addPage(newApogySessionWizardPage);
//		addPage(importRegisteredApogyProjectWizardPage);
	}


	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		return false;
	}

//	private ApogyResourceSettings getApogyResourceSettings() {
//
//		if (apogyResourceSettings == null) {
//			apogyResourceSettings = ApogyCoreUIFactory.eINSTANCE
//					.createApogyResourceSettings();
//		}
//		return apogyResourceSettings;
//	}
//
//	private NewApogySessionSettings getNewApogySessionSettings() {
//		if (newApogySessionSettings == null) {
//			newApogySessionSettings = ApogyCoreUIFactory.eINSTANCE
//					.createNewApogySessionSettings();
//		}
//		return newApogySessionSettings;
//	}
//
//	private NewApogyProjectSettings getNewApogyProjectSettings() {
//		if (newApogyProjectSettings == null) {
//			newApogyProjectSettings = ApogyCoreUIFactory.eINSTANCE
//					.createNewApogyProjectSettings();
//			newApogyProjectSettings.setDefaultValues();
//		}
//		return newApogyProjectSettings;
//	}
//
//	@Override
//	public boolean performFinish() {
//		WorkspaceModifyOperation createApogyProjectOperation = new WorkspaceModifyOperation() {
//			@Override
//			protected void execute(IProgressMonitor monitor)
//					throws CoreException, InvocationTargetException,
//					InterruptedException {
//				ApogyCoreUIFacade.INSTANCE
//						.createApogyProject(getNewApogyProjectSettings());
//				apogyFolder = ApogyCoreUIFacade.INSTANCE
//						.createApogySessionFolder(getNewApogyProjectSettings());
//
//				if (getNewApogyProjectSettings().isImportRegisteredProject()) {
//					/**
//					 * Import Registered Session.
//					 */
//					try {
//						URL url = new URL(importRegisteredApogyProjectWizardPage
//								.getSessionContributor().uri.toString());
//						InputStream inputStream = url.openConnection()
//								.getInputStream();
//						IFile newFile = apogyFolder.getFile(getNewApogySessionSettings().getFilename());
//						newFile.create(inputStream, true,
//								new NullProgressMonitor());
//					} catch (MalformedURLException e1) {
//						e1.printStackTrace();
//					} catch (IOException e) {
//						e.printStackTrace();
//					} finally{
//						monitor.done();
//					}
//				} else {
//					/**
//					 * Create a new Session.
//					 */
//					ApogyCoreUIFacade.INSTANCE
//							.createApogyProject(getNewApogyProjectSettings());
//					IFolder folder = ApogyCoreUIFacade.INSTANCE
//							.createApogySessionFolder(getNewApogyProjectSettings());
//
//					InvocatorSession session = null;
//					String filename = null;
//
//					session = ApogyCoreUIFacade.INSTANCE
//							.createApogySession(getNewApogySessionSettings());
//					filename = getNewApogySessionSettings().getFilename();
//					try {
//						ApogyCoreUIFacade.INSTANCE
//								.createApogySessionFile(folder, filename,
//										session);
//					} catch (Exception e) {
//						e.printStackTrace();
//					} finally {
//						monitor.done();
//					}
//				}
//			}
//		};
//
//		/**
//		 * Execute Jobs.
//		 */
//		try {
//			getContainer().run(false, false, createApogyProjectOperation);
//
//			/**
//			 * Selects the current file in the current view and open the editor.
//			 */
//			IFile modelFile = ApogyCoreUIFacade.INSTANCE
//					.getApogySessionFile(
//							(IFolder) getApogyResourceSettings()
//									.getResourceContainer(),
//							getNewApogySessionSettings().getFilename());
//
//			// Select the new file resource in the current view.
//			//
//			IWorkbenchWindow workbenchWindow = workbench
//					.getActiveWorkbenchWindow();
//			IWorkbenchPage page = workbenchWindow.getActivePage();
//			final IWorkbenchPart activePart = page.getActivePart();
//			if (activePart instanceof ISetSelectionTarget) {
//				final ISelection targetSelection = new StructuredSelection(
//						modelFile);
//				getShell().getDisplay().asyncExec(new Runnable() {
//					public void run() {
//						((ISetSelectionTarget) activePart)
//								.selectReveal(targetSelection);
//					}
//				});
//			}
//
//			// Open an editor on the new file.
//			//
//			try {
//				page.openEditor(new FileEditorInput(modelFile),
//						CustomApogyCoreInvocatorEditor.ID);
//			} catch (PartInitException exception) {
//				exception.printStackTrace();
//				return false;
//			}
//
//		} catch (InvocationTargetException e1) {
//			e1.printStackTrace();
//		} catch (InterruptedException e1) {
//			e1.printStackTrace();
//		}
//		return true;
//	}
//
//	@Override
//	public IWizardPage getNextPage(IWizardPage page) {
//		IWizardPage nextPage = null;
//
//		if (page.equals(newApogyProjectWizardPage)) {
//			nextPage = getNewApogyProjectSettings()
//					.isImportRegisteredProject() ? importRegisteredApogyProjectWizardPage
//					: newApogySessionWizardPage;
//		}
//		return nextPage;
//	}
//
//	@Override
//	public boolean canFinish() {
//		return getNewApogyProjectSettings().isImportRegisteredProject() ? newApogyProjectWizardPage
//				.isPageComplete()
//				&& importRegisteredApogyProjectWizardPage.isPageComplete()
//				: newApogyProjectWizardPage.isPageComplete()
//						&& newApogySessionWizardPage.isPageComplete();
//	}
}