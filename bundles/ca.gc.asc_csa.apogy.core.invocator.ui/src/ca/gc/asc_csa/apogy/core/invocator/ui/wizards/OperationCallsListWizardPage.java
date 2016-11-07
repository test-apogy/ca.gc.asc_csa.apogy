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
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.composites.ScriptBasedProgramsListComposite;

public class OperationCallsListWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallsListWizardPage";
	private ProgramsList programsList;
	private ScriptBasedProgramsListComposite programsListComposite; 
	
	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 */
	public OperationCallsListWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Program Selection");
		setDescription("Select the Program.");
	}

	public OperationCallsListWizardPage(ProgramsList programsList) {
		this();
		this.programsList = programsList;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {		
		programsListComposite = new ScriptBasedProgramsListComposite(parent, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
			@Override
			protected boolean isApplicable(Program program) {
				// Just display OperationCallsList program type.
				return program instanceof OperationCallsList;
			}
		};
		programsListComposite.setProgramsList(programsList);
		setControl(programsListComposite);
		validate();
	}
	
	/** 
	 * Returns the reference to the selected {@link Program}.
	 * @return Reference to the {@link Program}.
	 */
	public OperationCallsList getSelectedOperationCallsList(){
		return (OperationCallsList) programsListComposite.getSelectedProgram();
	}
	
	/** 
	 * This method is invoked to validate the content. 
	 */
	protected void validate() {
		String str = null;
		if (programsListComposite.getSelectedProgram() == null){
			str = "One program must be selected.";
		}
		
		setErrorMessage(str);
		setPageComplete(str == null);
	}	
}