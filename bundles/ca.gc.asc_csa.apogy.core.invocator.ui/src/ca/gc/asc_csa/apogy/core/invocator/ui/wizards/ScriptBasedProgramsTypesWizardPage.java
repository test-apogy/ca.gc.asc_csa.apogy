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

import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.NewProgramComposite;

public class ScriptBasedProgramsTypesWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.ScriptBasedProgramsTypeWizardPage";
	private NewProgramComposite newProgramComposite;
	private Adapter adapter; 
	private ProgramsList programsList;
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public ScriptBasedProgramsTypesWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Name and Description");
		setDescription("Enter a name and a description (optional).");
	}

	public ScriptBasedProgramsTypesWizardPage(
			ProgramsList programsList) {
		this();
		if (this.programsList != null){
			this.programsList.eAdapters().remove(getAdapter());
		}
		
		this.programsList = programsList ;
		
		programsList.eAdapters().add(getAdapter());
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

		newProgramComposite = new NewProgramComposite(container, SWT.None);
		newProgramComposite.setProgramsList(programsList);		
		newProgramComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false));
		
		setControl(container);
		
		newProgramComposite.setFocus();
		
		validate();
	}
	
	@Override
	public void dispose() {
		super.dispose();
		if (this.programsList != null){
			this.programsList.eAdapters().remove(getAdapter());
		}	
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String errorStrGroup = null;
		String errorStrType = null;
		
		if (newProgramComposite.getSelectedProgramGroup() == null){
			errorStrGroup = "A program group must be selected.";
		}
		
		if (newProgramComposite.getSelectedProgramTypes() == null){
			errorStrType = "A program type must be selected.";
		}	

		setErrorMessage(errorStrGroup + " " + errorStrType);
		setPageComplete(errorStrGroup == null && errorStrType == null);
	}
}