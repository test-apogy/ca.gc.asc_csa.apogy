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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NewProgramComposite;

public class NewProgramWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";
	private NewProgramComposite newProgramComposite;
	private Adapter adapter; 
	private ProgramsGroup programsGroup;
	private EClass programSuperClass;
	private EClass programsType;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public NewProgramWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Program");
		setDescription("Select the programs's group and type.");
	}

	public NewProgramWizardPage(
			ProgramsGroup programsGroup, EClass programSuperClass) {
		this();
		if (this.programsGroup != null){
			this.programsGroup.eAdapters().remove(getAdapter());
		}
		if (this.programSuperClass != null){
			this.programSuperClass.eAdapters().remove(getAdapter());
		}
		
		this.programSuperClass = programSuperClass;
		programSuperClass.eAdapters().add(getAdapter());
		
		if(programsGroup != null){
			this.programsGroup = programsGroup;
			programsGroup.eAdapters().add(getAdapter());
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
	
	public EClass getProgramType(){
		return this.programsType;
	}
	
	public ProgramsGroup getProgramsGroup(){
		return this.programsGroup;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */	
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.None);
		container.setLayout(new GridLayout(1, false));

		newProgramComposite = new NewProgramComposite(container, SWT.None);
		if(programsGroup != null){
			newProgramComposite.setProgramsList(programsGroup.getProgramsList(), programsGroup);
		}else{
			newProgramComposite.setProgramsList(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList(), null);
		}
		newProgramComposite.setProgramSuperClass(programSuperClass);
		newProgramComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		newProgramComposite.getComboProgramsGroups().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				NewProgramWizardPage.this.programsGroup = (ProgramsGroup) ((StructuredSelection) event.getSelection()).getFirstElement();
				validate();
			}
		});
		newProgramComposite.getComboProgramsType().addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				NewProgramWizardPage.this.programsType = (EClass) ((StructuredSelection) event.getSelection()).getFirstElement();
				validate();
			}
		});

		setControl(container);
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.programsGroup != null){
			this.programsGroup.eAdapters().remove(getAdapter());
		}		
		if (this.programSuperClass != null){
			this.programSuperClass.eAdapters().remove(getAdapter());
		}
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {	
		String errorGroup = null;
		String errorType = null;
		
		if(programsGroup == null){
			errorGroup = "A group must be provided.";
		}
		if(programsType == null){
			errorType = " A type must be provided.";
		}
		
		
		if(errorGroup != null && errorType != null){
			setErrorMessage("A group and a type must be provided");
		}else if(errorGroup != null && errorType == null){
			setErrorMessage(errorGroup);
		}else if(errorGroup == null && errorType != null){
			setErrorMessage(errorType);
		}else{
			setErrorMessage(null);
		};
		setPageComplete(errorGroup == null && errorType == null);
	}
	
	@Override
	public void setPageComplete(boolean complete) {
		super.setPageComplete(complete);
	}
}