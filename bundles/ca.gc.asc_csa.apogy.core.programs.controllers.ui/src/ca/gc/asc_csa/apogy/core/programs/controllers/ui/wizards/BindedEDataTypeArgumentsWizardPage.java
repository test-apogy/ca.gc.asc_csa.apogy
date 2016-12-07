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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.BindedEDataTypeArgumentsComposite;

public class BindedEDataTypeArgumentsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.BindedEDataTypeArgumentsWizardPage";
	
	private OperationCallControllerBinding operationCallControllerBinding;
	private BindedEDataTypeArgumentsComposite bindedEDataTypeArgumentsComposite;
	
	private Adapter adapter; 

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public BindedEDataTypeArgumentsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Arguments");
		setDescription("Choose the argument(s) source(s) and value(s)");
	}
	
	public BindedEDataTypeArgumentsWizardPage(OperationCallControllerBinding operationCallControllerBinding){
		this();
		if (this.operationCallControllerBinding != null){
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		operationCallControllerBinding.eAdapters().add(getAdapter());
	}
	
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if (this.operationCallControllerBinding != null){
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		operationCallControllerBinding.eAdapters().add(getAdapter());
		
		if(bindedEDataTypeArgumentsComposite != null){
			bindedEDataTypeArgumentsComposite.setOperationCallControllerBinding(operationCallControllerBinding);
		}
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
		container.setLayout(new FillLayout());

		bindedEDataTypeArgumentsComposite = new BindedEDataTypeArgumentsComposite(container, SWT.None);
		bindedEDataTypeArgumentsComposite.setOperationCallControllerBinding(operationCallControllerBinding);
	
		setControl(container);
		
		validate();
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		String errorStr = null;

		if(operationCallControllerBinding.getArgumentsList() != null){
			Diagnostic diagnosticContext = Diagnostician.INSTANCE.validate(operationCallControllerBinding.getArgumentsList());
			if (diagnosticContext.getSeverity() != Diagnostic.OK){
				errorStr  = "Please enter a value for each argument";
			}	
		}
		setErrorMessage(errorStr );
		setPageComplete(errorStr  == null);
	}

}