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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.actions.WorkspaceModifyOperation;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ui.Activator;
import ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFactory;
import ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings;

public class ImportRegisteredProjectWizard extends Wizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private NewProjectSettings newProjectSettings;
	private Bundle selectedBundle;

	public ImportRegisteredProjectWizard(Bundle selectedBundle) {
		super();
		this.selectedBundle = selectedBundle;
		setWindowTitle("New Apogy Project");
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(
				ApogyCommonUiFacade.INSTANCE.getImageDescriptor("platform:/plugin/" + Activator.ID + "/icons/wizban/apogy.png"));

		namedDescribedWizardPage = new NamedDescribedWizardPage(getNewApogyProjectSettings(),
				getNewApogyProjectSettings()){
			@Override
			protected void validate() {
				super.validate();				
				if (ApogyWorkspaceFacade.INSTANCE.isProjectExists(getNewApogyProjectSettings().getName())){				
					setErrorMessage("A project with the same name already exists");
					setPageComplete(false);
				}
			}
		};		
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		addPage(namedDescribedWizardPage);
	}

	private NewProjectSettings getNewApogyProjectSettings() {
		if (newProjectSettings == null) {
			newProjectSettings = ApogyWorkspaceUiFactory.eINSTANCE.createNewProjectSettings();
			
			/* Find an available name. */
			String name = selectedBundle.getSymbolicName();			
			int i = 1;
			while (ApogyWorkspaceFacade.INSTANCE.isProjectExists(name)){
				name = selectedBundle.getSymbolicName() + "_" + i;
				i++;
			}			
			newProjectSettings.setName(name);
		}
		return newProjectSettings;
	}

	@Override
	public boolean performFinish() {
		WorkspaceModifyOperation createApogyProjectOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				try {
					// Create the project.
					ApogyWorkspaceFacade.INSTANCE.importApogyProject(selectedBundle, getNewApogyProjectSettings().getName());
				} catch (Exception e) {
					Logger.INSTANCE.log(Activator.ID, this, "Problems occured while importing project <" + getNewApogyProjectSettings().getName() + ">",
							EventSeverity.ERROR, e);
				} finally {
					monitor.done();
				}
			}
		};

		/**
		 * Execute Jobs.
		 */
		try {
			getContainer().run(false, false, createApogyProjectOperation);
		} catch (InvocationTargetException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while importing project <" + getNewApogyProjectSettings().getName() + ">",
					EventSeverity.ERROR, e);
		} catch (InterruptedException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while importing project <" + getNewApogyProjectSettings().getName() + ">",
					EventSeverity.ERROR, e);
		}
		return true;
	}
}