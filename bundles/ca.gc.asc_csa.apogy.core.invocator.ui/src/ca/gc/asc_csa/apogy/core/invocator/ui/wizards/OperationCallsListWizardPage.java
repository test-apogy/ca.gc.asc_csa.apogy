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

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ProgramsListComposite;

public class OperationCallsListWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallsListWizardPage";
	private ProgramsGroup programsGroup;
	private OperationCallsList operationCallsList;
	
	private ProgramsListComposite programsListComposite; 

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 * @Deprecated The constructor OperationCallsListWizardPage(ProgramsGroup,
	 *             OperationCallsList) should be used because a ProgramsGroup
	 *             must be specified.
	 */
	@Deprecated
	public OperationCallsListWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Program Selection");
		setDescription("Select the Program.");
	}
	
	/**
	 * Constructor for the WizardPage.
	 */
	public OperationCallsListWizardPage(ProgramsGroup programsGroup) {
		super(WIZARD_PAGE_ID);
		setTitle("Program Selection");
		setDescription("Select the Program.");
		this.programsGroup = programsGroup;
	}

	/**
	 * Constructor for the WizardPage that specifies a default
	 * {@link OperationCallsList} to set as selection.
	 */
	public OperationCallsListWizardPage(ProgramsGroup programsGroup, OperationCallsList operationCallsList) {
		this(programsGroup);
		this.operationCallsList = operationCallsList;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
		programsListComposite = new ProgramsListComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				operationCallsList = (OperationCallsList) ((StructuredSelection)selection).getFirstElement();
				validate();
			}
			@Override
			protected boolean isApplicable(Object object) {
				// TODO Only keep the OperationCallsList
				return true;
			}
		};
		programsListComposite.setProgramsGroup(programsGroup);
		programsListComposite.setSelectedProgram(operationCallsList);
		setControl(programsListComposite);
		validate();
	}
	
	/** 
	 * Returns the reference to the selected {@link OperationCallsList}.
	 * @return Reference to the {@link OperationCallsList}.
	 */
	public OperationCallsList getOperationCallsList(){
		return this.operationCallsList;
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String str = null;
		if (getOperationCallsList() == null){
			str = "One program must be selected.";
		}
		
		setErrorMessage(str);
		setPageComplete(str == null);
	}	
}