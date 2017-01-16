package ca.gc.asc_csa.apogy.core.invocator.ui.wizards;
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
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.OperationCallComposite;

public class OperationCallDetailsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallDetailsWizardPage";
	private OperationCallComposite operationCallComposite;
	private OperationCall operationCall;
	private AdapterImpl adapter;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public OperationCallDetailsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Select the Operation");
		setDescription("Select the operation to execute.");		
	}

	public OperationCallDetailsWizardPage(OperationCall operationCall) {
		this();
		
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getAdapter());
		}
		
		this.operationCall = operationCall;
		
		this.operationCall.eAdapters().add(getAdapter());
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
		operationCallComposite = new OperationCallComposite(parent, SWT.None, false){
			@Override
			protected void newSelection(TreeSelection selection) {
				validate();
			}
		};
		operationCallComposite.setOperationCall(operationCall);
		setControl(operationCallComposite);
		
		validate();
	}
	
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorVariable = "";
		String errorEOperation = "";

		if (this.operationCall.getVariable() == null) {
			errorVariable = " <variable>";
		}
		if (this.operationCall.getEOperation() == null) {
			errorEOperation = " <operation>";
		}

		if (errorVariable != "" || errorEOperation != "") {
			setErrorMessage(errorVariable + errorEOperation + " must be provided");
		} else {
			setErrorMessage(null);
		}

		setPageComplete(getErrorMessage() == null);
	}	
}