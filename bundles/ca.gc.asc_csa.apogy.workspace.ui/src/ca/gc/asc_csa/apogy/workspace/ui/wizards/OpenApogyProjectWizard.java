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

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.workspace.ui.Activator;

public class OpenApogyProjectWizard extends Wizard {

	private OpenApogyProjectWizardPage openApogyProjectWizardPage;

	/**
	 * Constructor for NewApogySessionWizard.
	 */
	public OpenApogyProjectWizard() {
		super();
		setWindowTitle("Open Apogy Project");
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(
				ApogyCommonUiFacade.INSTANCE.getImageDescriptor(Activator.ID + "/icons/wizban/apogy_open_project.png"));

		openApogyProjectWizardPage = new OpenApogyProjectWizardPage();
	}

	/**
	 * Adding the page to the wizard.
	 */
	public void addPages() {
		addPage(openApogyProjectWizardPage);
	}

	@Override
	public boolean performFinish() {
		
		WorkspaceModifyOperation createApogyProjectOperation = new WorkspaceModifyOperation() {
			@Override
			protected void execute(IProgressMonitor monitor)
					throws CoreException, InvocationTargetException, InterruptedException {
				try {
					// Open the project.
//					ApogyWorkspaceFacade.INSTANCE.createApogyProject(getNewApogyProjectSettings().getName(), getNewApogyProjectSettings().getDescription());
				} catch (Exception e) {
					Logger.INSTANCE.log(Activator.ID, this, "Problems occured while opening project <" + "!!!!FIXME!!!!" + ">",
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
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while opening project <" + "!!!!FIXME!!!!" + ">",
					EventSeverity.ERROR, e);
		} catch (InterruptedException e) {
			Logger.INSTANCE.log(Activator.ID, this, "Problems occured while opening project <" + "!!!!FIXME!!!!" + ">",
					EventSeverity.ERROR, e);
		}
		return true;
	}
}