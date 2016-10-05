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
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.DescribedComposite;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.NamedComposite;

public class DataProductsListWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NamedDescribedWizardPage";
	private NamedComposite namedComposite;
	private DescribedComposite describedComposite;
	private Adapter adapter; 
	private Named named;
	private Described described;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public DataProductsListWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Name and Description");
		setDescription("Enter a name and a description (optional).");
	}

	public DataProductsListWizardPage(
			Named name, Described description) {
		this();
		if (this.named != null){
			this.named.eAdapters().remove(getAdapter());
		}
		
		if (this.described != null){
			this.described.eAdapters().remove(getAdapter());
		}
		
		this.named = name;
		this.described = description;
		
		name.eAdapters().add(getAdapter());
		description.eAdapters().add(getAdapter());
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

		namedComposite = new NamedComposite(container, SWT.None);
		namedComposite.setNamed(named);		
		namedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		describedComposite = new DescribedComposite(container, SWT.None);
		describedComposite.setDescribed(described);
		describedComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));	
		
		setControl(container);
		
		namedComposite.setFocus();
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.named != null){
			this.named.eAdapters().remove(getAdapter());
		}
		if (this.described != null){
			this.described.eAdapters().remove(getAdapter());
		}		
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStr = null;
		String infoStr = null;
		
		if (named == null || named.getName() == null || named.getName().isEmpty()){
			errorStr = "A name must be provided.";
		}
		
		if (described == null || described.getDescription() == null || described.getDescription().isEmpty()){
			infoStr = "It is recommended to enter a description.";
		}	

		setMessage(infoStr);
		setErrorMessage(errorStr);
		setPageComplete(errorStr == null);
	}
}