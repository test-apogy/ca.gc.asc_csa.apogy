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
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.DataProductsListsContainerComposite;

public class DataProductsListWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.DataProductsListWizardPage";
	private DataProductsListsContainerComposite dataProductsListsContainerComposite;
	private Adapter adapter; 
	private Context context;
	private DataProductsListsContainer dataProductsListsContainer;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public DataProductsListWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Data Products List");
		setDescription("Set a data product list.");
	}

	public DataProductsListWizardPage(
			Context context, DataProductsListsContainer dataProductsListsContainer) {
		this();
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}
		if (this.dataProductsListsContainer != null){
			this.dataProductsListsContainer.eAdapters().remove(getAdapter());
		}
		
		this.dataProductsListsContainer = dataProductsListsContainer;
		this.context = context;
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

		dataProductsListsContainerComposite = new DataProductsListsContainerComposite(container, SWT.None);
		dataProductsListsContainerComposite.setContext(context);
		dataProductsListsContainerComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		dataProductsListsContainerComposite.setDataProductsListsContainer(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getDataProductsListContainer());
		
		setControl(container);
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.context != null){
			this.context.eAdapters().remove(getAdapter());
		}	
		if (this.dataProductsListsContainer != null){
			this.dataProductsListsContainer.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStr1 = null;
		String errorStr2 = null;
		
		if (context.getDataProductsList() == null){
			errorStr1 = "A Data Products List must be selected.";
		}
		
		/*if (dataProductsListsContainer != null || dataProductsListsContainer.getDataProductsList().size() < 1){
			errorStr2 = "A Data Products List must be created.";
		}	*/

		//setMessage(errorStr1);
		setErrorMessage(errorStr1);
		setPageComplete(errorStr1 == null);
	}
}