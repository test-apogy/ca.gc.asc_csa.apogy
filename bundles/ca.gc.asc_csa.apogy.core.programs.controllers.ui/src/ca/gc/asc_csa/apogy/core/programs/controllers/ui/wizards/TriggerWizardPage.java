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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.CreateResultsComposite;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.TriggerComposite;

public class TriggerWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.TriggerWizardPage";

	private OperationCallControllerBinding operationCallControllerBinding;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public TriggerWizardPage(OperationCallControllerBinding operationCallControllerBinding) {
		super(WIZARD_PAGE_ID);
		setTitle("Trigger");
		setDescription("Select the trigger");
		
		this.operationCallControllerBinding = operationCallControllerBinding;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));
		((GridLayout)container.getLayout()).horizontalSpacing = 0;

		CreateResultsComposite createResultsComposite = new CreateResultsComposite(container, SWT.None);
		createResultsComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		createResultsComposite.setOperationCallControllerBinding(operationCallControllerBinding);
		
		TriggerComposite triggerComposite = new TriggerComposite(container,
				SWT.H_SCROLL | SWT.V_SCROLL){
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
		};
		triggerComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		triggerComposite.setOperationCallControllerBinding(operationCallControllerBinding);

		setControl(container);
		
		validate();
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		String errorTriggerStr = null;

		
//		TODO
//		Diagnostic diagnosticContext = Diagnostician.INSTANCE.validate(operationCallControllerBinding.getTrigger());
//		if (diagnosticContext.getSeverity() != Diagnostic.OK) {
//			System.out.println(diagnosticContext.getMessage());
//			System.out.println(diagnosticContext.getSeverity());
//			errorTriggerStr = "Please select a trigger";
//		}

		setErrorMessage(errorTriggerStr);
		setPageComplete(errorTriggerStr == null);
	}
	
	
	@Override
	public void dispose() {
		super.dispose();
	}
}