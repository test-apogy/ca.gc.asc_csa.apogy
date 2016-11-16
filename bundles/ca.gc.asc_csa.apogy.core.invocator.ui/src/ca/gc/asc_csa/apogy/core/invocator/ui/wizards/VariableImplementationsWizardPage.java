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
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementationsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableImplementationsComposite;

public class VariableImplementationsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.VariableImplementationsWizardPage";
	private VariableImplementationsComposite variableImplementationsComposite;
	private Adapter adapter; 
	private Context context;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 * @wbp.parser.constructor
	 */
	public VariableImplementationsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Variable implementation");
		setDescription("Select a variable implementation");
	}

	public VariableImplementationsWizardPage(Context context) {
		this();
		
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}		
		this.context = context;
	
		context.getVariableImplementationsList().getVariableImplementations().get(0).eAdapters().add(getAdapter());
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
		variableImplementationsComposite = new VariableImplementationsComposite(parent, SWT.None);
		variableImplementationsComposite.setContext(context);
		variableImplementationsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		setControl(variableImplementationsComposite);
		
		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(this);
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}		
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorVariableStr = null;
				
		VariableImplementationsList variableImplementationsList = context.getVariableImplementationsList();		
		
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(variableImplementationsList);
		
		if (diagnostic.getSeverity() != Diagnostic.OK){
			errorVariableStr = "A variable implementation must be selected";
		}	

		setErrorMessage(errorVariableStr);
		setPageComplete(errorVariableStr == null);
	}
}