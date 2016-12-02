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
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.TriggerComposite;

public class TriggerWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";

	private OperationCallControllerBinding operationCallControllerBinding;
	private TriggerComposite composite;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public TriggerWizardPage(OperationCallControllerBinding operationCallControllerBinding) {
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

		composite = new TriggerComposite(container,
				SWT.H_SCROLL | SWT.V_SCROLL);
		composite.setOperationCallControllerBinding(operationCallControllerBinding);

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