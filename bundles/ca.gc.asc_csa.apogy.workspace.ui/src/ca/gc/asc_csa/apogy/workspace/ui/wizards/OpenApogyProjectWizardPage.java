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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.workspace.ui.composites.ApogyProjectsListComposite;

public class OpenApogyProjectWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.workspace.ui.wizards.OpenApogySessionWizardPage";
	private ApogyProjectsListComposite composite;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public OpenApogyProjectWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Apogy Project");
		setDescription("Select the Apogy project to open");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		composite = new ApogyProjectsListComposite(parent, SWT.NONE) {
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
		};
		setControl(composite);
		composite.setFocus();
		validate();
	}

	public IProject getSelectedProject() {
		return composite.getSelectedProject();
	}

	private String validate() {
		String message = composite.getSelectedProject() == null ? "You must select a project" : null;
		setErrorMessage(message);
		setPageComplete(message == null);
		return message;
	}
}