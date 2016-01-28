package org.eclipse.symphony.core.invocator.ui.wizards;

import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.symphony.core.invocator.Program;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.ui.composites.ProgramsListComposite;

public class OperationCallsListWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "org.eclipse.symphony.core.invocator.ui.wizards.OperationCallsListWizardPage";
	private ProgramsList programsList;
	private ProgramsListComposite programsListComposite; 
	
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
		programsListComposite = new ProgramsListComposite(parent, SWT.None){
			@Override
			protected void newSelection(TreeSelection selection) {
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