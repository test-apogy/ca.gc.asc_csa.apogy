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

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.workspace.ui.composites.RegisteredApogyProjectsListComposite;

public class ImportRegisteredApogyProjectWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.workspace.ui.wizards.ImportRegisteredApogyProjectWizardPage";
	private RegisteredApogyProjectsListComposite composite;
	private String filter;

	/**
	 * Constructor for SampleNewWizardPage.
	 * 
	 * @param pageName
	 */
	public ImportRegisteredApogyProjectWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Apogy Project");
		setDescription("Select the Apogy project to import");
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		composite = new RegisteredApogyProjectsListComposite(parent, SWT.NONE) {
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
			
			@Override
			protected String getProjectNameFilter() {
				return ImportRegisteredApogyProjectWizardPage.this.filter;
			}
		};
		setControl(composite);
		composite.setFocus();
		validate();
	}

	public Bundle getSelectedBundle() {
		return composite.getSelectedBundle();
	}

	private String validate() {
		String message = composite.getSelectedBundle() == null ? "You must select a project" : null;
		setErrorMessage(message);
		setPageComplete(message == null);
		return message;
	}

	public void setProjectNameFilter(String filter) {
		this.filter = filter;
	}
}