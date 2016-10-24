package ca.gc.asc_csa.apogy.common.emf.ui.wizards;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class ChooseSubClassWizardPage extends WizardPage {

private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.ChooseSubClassWizardPage";
	
	//private ChildsListComposite ChildsListComposite;
	
	private Adapter adapter; 
	private EClass superClass;
	private EClass selectedEClass;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ChooseSubClassWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Program");
		setDescription("Select the programs's group and type.");
	}

	public ChooseSubClassWizardPage(
			EClass superClass) {
		this();
		if (this.superClass != null){
			this.superClass.eAdapters().remove(getAdapter());
		}
		
		this.superClass = superClass;
		superClass.eAdapters().add(getAdapter());
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
	
	public EClass getSelectedClass(){
		return selectedEClass;
	}
	
	public void setSelectedClass(EClass eClass){
		this.selectedEClass = eClass;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));
		
//		subClassesListComposite = new SubClassesListComposite(container, SWT.None);
//		subClassesListComposite.setSuperClass(superClass);
//		subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//		subClassesListComposite.addSelectionChangedListener(new ISelectionChangedListener() {
//			
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				setSelectedClass((EClass) ((TreeSelection) event.getSelection()).getFirstElement());
//				validate();
//			}
//		});
		
		setControl(container);
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.superClass != null){
			this.superClass.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {	
		String errorSubClass = "";
		
		if(selectedEClass == null){
			errorSubClass = "A valid subClass must be selected";
		}
		
		if(selectedEClass != null){
			setErrorMessage(errorSubClass);
			setPageComplete(false);
		}else{
			setErrorMessage(null);
			setPageComplete(true);
		}
	}

}
