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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

public class TriggerWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";
	
	private OperationCallControllerBinding operationCallControllerBinding;
	
	private Adapter adapter; 

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public TriggerWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Trigger");
		setDescription("Choose the trigger for the operationCall");
	}
	
	public TriggerWizardPage(OperationCallControllerBinding operationCallControllerBinding){
		this();
		if (this.operationCallControllerBinding != null){
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		operationCallControllerBinding.eAdapters().add(getAdapter());
	}
	
	private Adapter getAdapter() {
		if (adapter == null){
			adapter = new AdapterImpl(){
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}				
		return adapter;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));

		Composite composite = new Composite(container, SWT.None);
		composite.setLayout(new GridLayout(1, false));

		Label label = new Label(composite, SWT.None);
		label.setText("TODO");
		label.setLayoutData(new GridData(SWT.CENTER, SWT.CENTER, true, true));

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