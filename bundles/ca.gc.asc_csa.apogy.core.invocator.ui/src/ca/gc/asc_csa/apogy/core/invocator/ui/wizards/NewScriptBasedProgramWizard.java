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
 *     Olivier L. Larouche (OLivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewScriptBasedProgramWizard extends Wizard implements INewWizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private NewProgramWizardPage newProgramWizardPage;
	private ProgramsGroup programsGroup;
	private Program program;

	private EClass programType;
	
	/**
	 * Constructor for NewProgramsGroupWizard.
	 */
	public NewScriptBasedProgramWizard(ProgramsGroup programsGroup) {
		super();
		setWindowTitle("New Script Based Program");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_script_based_program.png");
		setDefaultPageImageDescriptor(image);		
		this.programsGroup = programsGroup;
	}

	/**
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		if(getNewProgramWizardPage() != null){
			addPage(getNewProgramWizardPage());
		}
		/*if (getNamedDescribedWizardPage() != null){
			addPage(getNamedDescribedWizardPage());
		}*/
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page == newProgramWizardPage && programType == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL){
			return getNamedDescribedWizardPage();
		}
		return super.getNextPage(page);
	}


	/**
	 * Returns the {@link NewProgramWizardPage }.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected NewProgramWizardPage getNewProgramWizardPage(){
		if (newProgramWizardPage == null){
			newProgramWizardPage = new NewProgramWizardPage(getProgramsGroup(), ApogyCoreInvocatorPackage.Literals.SCRIPT_BASED_PROGRAM, programType);	
		}
		return newProgramWizardPage;
	}
	
	/**
	 * Returns the {@link NamedDescribedWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage(){//Named named, Described described){
		if (namedDescribedWizardPage == null){
			namedDescribedWizardPage = new NamedDescribedWizardPage(getProgram(), getProgram());	
		}
		return namedDescribedWizardPage;
	}
	
	@Override
	public boolean performFinish() {
			
		ProgramsGroup programsGroup = getProgramsGroup();		
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(getProgramsList());
		
		/** Check if there is a domain. */
		if (editingDomain == null){
			/** No Domain */
			getProgramsList().getProgramsGroups().add(programsGroup);
		}else{
			/** Use the command stack. */
			AddCommand command = new AddCommand(
					editingDomain,
					getProgramsList(),
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS,
					getProgramsGroup());
			editingDomain.getCommandStack().execute(command);			
		}
				
		return true;
	}
	
	/** 
	 * Create and returns the instance of the {@link ProgramsGroup} that the new program will be contained.  
	 * @return Reference to the {@link ProgramsGroup}. 
	 */
	protected ProgramsGroup getProgramsGroup(){
		return programsGroup;
	}
		
	/** 
	 * Returns the list of programs to display.  Override this method to provide custom getter implementation.  The default 
	 * implementation returns the list of programs available in the active session.
	 * @return List of programs.
	 */
	protected ProgramsList getProgramsList(){
		return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null ? 
				null : 
				ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList();
	}
	
	protected Program getProgram() {
		if (program == null) {

			if (programType == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL) {
				program = (Program) ApogyCoreInvocatorFactory.eINSTANCE.createOperationCall();
				program.setName("New Operation Call");

			} else {
				program = null;
			}
		}
		return program;
	}
}