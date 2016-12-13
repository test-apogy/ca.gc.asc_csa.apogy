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
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
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
		
		validate();
	}
	
	public Adapter getAdapter(){
		if(adapter ==  null){
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

		bindedEDataTypeArgumentsComposite = new BindedEDataTypeArgumentsComposite(container, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
		};
		bindedEDataTypeArgumentsComposite.setOperationCallControllerBinding(operationCallControllerBinding);
	
		setControl(container);
		
		validate();
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		String errorStr = null;

		if (operationCallControllerBinding.getArgumentsList() != null) {
			Diagnostic diagnosticContext = Diagnostician.INSTANCE.validate(operationCallControllerBinding);
			if (diagnosticContext.getSeverity() != Diagnostic.OK) {
				errorStr = "Please complete the  for each argument";
			}
		}
		setErrorMessage(errorStr);
		setPageComplete(getErrorMessage() == null);
	}
	
	
	@Override
	public void dispose() {
		if(this.operationCallControllerBinding != null){
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		super.dispose();
	}
}