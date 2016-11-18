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
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.SubClassesListComposite;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ProgramsGroupsComposite;

public class NewScriptBasedProgramWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramWizardPage";
	
	private SubClassesListComposite subClassesListComposite;
	private ProgramsGroupsComposite programsGroupsComposite;
	
	
	private Adapter adapter; 
	private ProgramsGroup programsGroup;
	private ProgramsList programsList;
	private EClass programSuperClass;
	private NewProgramSettings newProgramSettings;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public NewScriptBasedProgramWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("New Program");
		setDescription("Select the programs's group and type.");
	}

	public NewScriptBasedProgramWizardPage(
			ProgramsList programsList, EClass programSuperClass, NewProgramSettings newProgramSettings) {
		this();
		if (this.programsGroup != null){
			this.programsGroup.eAdapters().remove(getAdapter());
		}
		if (this.programSuperClass != null){
			this.programSuperClass.eAdapters().remove(getAdapter());
		}
		if (this.newProgramSettings != null){
			this.newProgramSettings.eAdapters().remove(getAdapter());
		}
		
		this.programSuperClass = programSuperClass;
		programSuperClass.eAdapters().add(getAdapter());
		
		this.newProgramSettings = newProgramSettings;
		newProgramSettings.eAdapters().add(getAdapter());
		
		this.programsList = programsList;
		programsList.eAdapters().add(getAdapter());
	}
	
	public NewScriptBasedProgramWizardPage(
			ProgramsGroup programsGroup, EClass programSuperClass, NewProgramSettings newProgramSettings) {
		this(programsGroup.getProgramsList(), programSuperClass, newProgramSettings);
		this.programsGroup = programsGroup;
		
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
		return (EClass) this.newProgramSettings.eGet(ApogyCoreInvocatorUIPackage.Literals.NEW_PROGRAM_SETTINGS__ECLASS);
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
		
		programsGroupsComposite = new ProgramsGroupsComposite(container, SWT.None);
		if(programsGroup != null){
			programsGroupsComposite.setProgramsList(programsList, programsGroup);
		}else{
			programsGroupsComposite.setProgramsList(programsList);
		}
		programsGroupsComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		programsGroupsComposite.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				NewScriptBasedProgramWizardPage.this.programsGroup = (ProgramsGroup) ((TreeSelection) event.getSelection()).getFirstElement();
				validate();
			}
		});
		
		subClassesListComposite = new SubClassesListComposite(container, SWT.None);
		subClassesListComposite.setProgramSuperClass(programSuperClass);
		subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		subClassesListComposite.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				EClass eClass = (EClass) ((TreeSelection) event.getSelection()).getFirstElement();
				System.out.println(
						"NewProgramWizardPage.createControl(...).new ISelectionChangedListener() {...}.selectionChanged() : SubClass");
				newProgramSettings.eSet(ApogyCoreInvocatorUIPackage.Literals.NEW_PROGRAM_SETTINGS__ECLASS, eClass);
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
		String errorGroup = "";
		String errorType = "";
		
		if(programsGroup == null){
			errorGroup = " <group>";
		}
		if(newProgramSettings == null || newProgramSettings.eGet(ApogyCoreInvocatorUIPackage.Literals.NEW_PROGRAM_SETTINGS__ECLASS) == null){
			errorType = " <type>";
		}

		if(errorGroup != "" || errorType != ""){
			setErrorMessage(errorGroup + errorType + " must be provided");
			setPageComplete(false);
		}else{
			setErrorMessage(null);
			setPageComplete(true);
		}
	}
	
	@Override
	public void setPageComplete(boolean complete) {
		super.setPageComplete(complete);
	}
}