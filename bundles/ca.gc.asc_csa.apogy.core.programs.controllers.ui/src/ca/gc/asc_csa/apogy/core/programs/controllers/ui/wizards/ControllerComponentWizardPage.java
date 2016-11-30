package ca.gc.asc_csa.apogy.core.programs.controllers.ui.wizards;
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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.ControllerBindingDefinitionComposite;

public class ControllerComponentWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";

	private OperationCallControllerBinding operationCallControllerBinding;
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ControllerComponentWizardPage(OperationCallControllerBinding operationCallControllerBinding) {
		super(WIZARD_PAGE_ID);
		setTitle("New Program");
		setDescription("Select the bindings");
		
		this.operationCallControllerBinding = operationCallControllerBinding;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new FillLayout());

		ControllerBindingDefinitionComposite composite = new ControllerBindingDefinitionComposite(container,
				SWT.H_SCROLL | SWT.V_SCROLL);
		composite.setOperationCallControllerBinding(operationCallControllerBinding);
		
//		Composite composite = new Composite(container, SWT.None);
//		composite.setLayout(new GridLayout(1, false));

//		Label label = new Label(composite, SWT.None);
//		label.setText("TODO");
//		label.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));

		setControl(container);

		validate();
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		setErrorMessage(null);
		setPageComplete(true);
	}

}