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
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.VariableImplementationsComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.graphics.Point;

public class NewContextWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NameContextWizardPage";
	private VariableImplementationsComposite variableImplementationsComposite;
	private FormToolkit formToolKit = new FormToolkit(Display.getCurrent());
	private NamedComposite namedComposite;
	private Adapter adapter; 
	private Context context;
	private Environment environment;
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
	public NewContextWizardPage(Environment environment) {
		super(WIZARD_PAGE_ID);
		setTitle("Name and activate");
		if (environment.getContextsList() == null && environment.getContextsList().getContexts().size() > 1) {
			setDescription("Enter a name and and activate (optional).");
		} else {
			setDescription("Enter a name");
		}

	}

	public NewContextWizardPage(
			Context context, Environment environment) {
		this(environment);
		
		if (this.environment != null){
			this.environment.eAdapters().remove(getAdapter());
		}
		this.environment = environment;
		
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}		
		this.context = context;
		

		
		environment.eAdapters().add(getAdapter());
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
		namedComposite = new NamedComposite(parent, SWT.None);
		namedComposite.setNamed(context);
		setControl(namedComposite);
		validate();
		
//		//parent.setLayout(new TableWrapLayout());
//		//parent.setLayout(new GridLayout(1, false));
//		//parent.computeSize(SWT.DEFAULT, SWT.DEFAULT);
//		composite = new Composite(parent, SWT.None);
//		composite.setLayout(new TableWrapLayout());// GridLayout(1, false));
//		
//		//form = formToolKit.createScrolledForm(composite);
//		form = formToolKit.createForm(composite);
//		form.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));//new GridData(SWT.FILL, SWT.TOP, true, true, 1, 1));
//		/*form.setExpandHorizontal(false);
//		form.setExpandVertical(false);*/
//		form.getBody().setLayout(new GridLayout(1, false));
//		
//		Section sctnNamed = formToolKit.createSection(form.getBody(), Section.NO_TITLE);
//		sctnNamed.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
//		formToolKit.paintBordersFor(sctnNamed);
//		
//		namedComposite = new NamedComposite(sctnNamed, SWT.None);
//		sctnNamed.setClient(namedComposite);
//		formToolKit.adapt(namedComposite);
//		formToolKit.paintBordersFor(namedComposite);
//		namedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
//		namedComposite.setNamed((Named) context);
//		
//		Section sctnVariableImplementations = formToolKit.createSection(form.getBody(), Section.NO_TITLE);
//		sctnVariableImplementations.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		formToolKit.paintBordersFor(sctnVariableImplementations);
//		sctnVariableImplementations.setText("Variable Implementations");		
//		
//		variableImplementationsComposite = new VariableImplementationsComposite(sctnVariableImplementations, SWT.NONE);
//		sctnVariableImplementations.setClient(variableImplementationsComposite);
//		formToolKit.adapt(variableImplementationsComposite);
//		formToolKit.paintBordersFor(variableImplementationsComposite);
//		variableImplementationsComposite.setContext(context);
//
//		namedComposite.setFocus();
//		//form.computeSize(SWT.DEFAULT, SWT.DEFAULT);
//		//setControl(form);
//		//composite.setContent(form);
//		//composite.computeSize(SWT.DEFAULT, SWT.DEFAULT);
//		setControl(composite);
//		//composite.setMinSize(new Point(1000, 1000));
//		/*final org.eclipse.swt.graphics.Point newSize = parent.computeSize(SWT.DEFAULT, SWT.DEFAULT, true);  
//		getShell().setSize(newSize);*/
//		
//		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.environment != null){
			this.environment.eAdapters().remove(getAdapter());
		}
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}		
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorNameStr = null;
		String errorVariableStr = null;
		
		if (context == null || context.getName() == null || context.getName().isEmpty()){
			errorNameStr = "A name must be provided.";
		}
		
		if (context == null || context.getVariableImplementationsList() == null){
			errorVariableStr = "A variable implementation must be provided";
		}	

		setErrorMessage(errorNameStr);
		setErrorMessage(errorVariableStr);
		setPageComplete(errorNameStr == null && errorVariableStr == null);
	}
}