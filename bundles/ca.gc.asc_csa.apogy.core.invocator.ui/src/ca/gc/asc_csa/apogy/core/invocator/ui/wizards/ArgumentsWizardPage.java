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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ArgumentsComposite;

public class ArgumentsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.ArgumentsWizardPage";
	private ArgumentsComposite argumentsComposite;
	private Adapter adapter; 
	private OperationCall operationCall;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ArgumentsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Data Products List");
		setDescription("Set a data product list.");
	}

	public ArgumentsWizardPage(
			OperationCall operationCall){
		this();
		if (this.operationCall != null){
			this.operationCall.eAdapters().remove(getAdapter());
		}
		
		this.operationCall = operationCall;
		
		operationCall.eAdapters().add(getAdapter());
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

		argumentsComposite = new ArgumentsComposite(container, SWT.None, false);
		argumentsComposite.setOperationCall(operationCall);
		argumentsComposite.setLayoutData((new GridData(SWT.FILL, SWT.FILL, true, true)));
	
		setControl(container);
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
		String errorArgumentStr = null;
	
		if(operationCall.getArgumentsList() != null){
			Diagnostic diagnosticContext = Diagnostician.INSTANCE.validate(operationCall.getArgumentsList());
			if (diagnosticContext.getSeverity() != Diagnostic.OK){
				errorArgumentStr = "Please enter a value for each argument";
			}	
		}
		setErrorMessage(errorArgumentStr);
		setPageComplete(errorArgumentStr == null);
		
	}
}