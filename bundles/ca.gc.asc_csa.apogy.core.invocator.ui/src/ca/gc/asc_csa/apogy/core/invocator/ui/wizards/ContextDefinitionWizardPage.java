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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.Form;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;

import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NamedComposite;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableFeatureReferenceComposite;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableImplementationsComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.graphics.Point;

public class ContextDefinitionWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.ContextDefinitionWizardPage";
	private VariableImplementationsComposite variableImplementationsComposite;
	private FormToolkit formToolKit = new FormToolkit(Display.getCurrent());
	private Adapter adapter; 
	private Context context;
//	private ScrolledForm form;
//	private ScrolledComposite composite;
	private Form form;
	private Composite composite;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 * @wbp.parser.constructor
	 */
	public ContextDefinitionWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Name and activate");
		setDescription("TODO");
	}

	public ContextDefinitionWizardPage(Context context) {
		this();
		
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}		
		this.context = context;
	
		context.eAdapters().add(getAdapter());
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
		setControl(variableImplementationsComposite);
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
				
		if (context == null || context.getVariableImplementationsList() == null){
			errorVariableStr = "A variable implementation must be provided";
		}	

		setErrorMessage(errorVariableStr);
		setPageComplete(errorVariableStr == null);
	}
}