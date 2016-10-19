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
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactoriesRegistry;
import ca.gc.asc_csa.apogy.core.invocator.ProgramFactory;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewScriptBasedProgramWizard extends Wizard implements INewWizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private NewProgramWizardPage newProgramWizardPage;
	private ProgramsGroup programsGroup;
	private Program program;

	/**
	 * Constructor for NewProgramsGroupWizard.
	 */
	public NewScriptBasedProgramWizard(ProgramsGroup programsGroup) {
		super();
		setWindowTitle("New Script Based Program");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/apogy_new_script_based_program.png");
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
		if (getNewProgramWizardPage() != null) {
			addPage(getNewProgramWizardPage());
			this.setForcePreviousAndNextButtons(true);
		}
		/*if (getNamedDescribedWizardPage() != null) {
			addPage(getNamedDescribedWizardPage());
		}*/
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == newProgramWizardPage
				&& newProgramWizardPage.getProgramType() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST) {
			addPage(getNamedDescribedWizardPage());
			return getNamedDescribedWizardPage();
		}
		return super.getNextPage(page);
	}

	/**
	 * Returns the {@link NewProgramWizardPage }. If null is returned, the page
	 * is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NewProgramWizardPage getNewProgramWizardPage() {
		if (newProgramWizardPage == null) {
			newProgramWizardPage = new NewProgramWizardPage(getProgramsGroup(),
					ApogyCoreInvocatorPackage.Literals.SCRIPT_BASED_PROGRAM);
		}
		return newProgramWizardPage;
	}

	/**
	 * Returns the {@link NamedDescribedWizardPage}. If null is returned, the
	 * page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected WizardPage getNamedDescribedWizardPage() {// Named named, Described described){
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getProgram(), getProgram());
		}
		return namedDescribedWizardPage;
	}

	@Override
	public boolean performFinish() {

		ProgramsGroup programsGroup = getProgramsGroup();
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getProgramsList());

		/** Check if there is a domain. */
		if (editingDomain == null) {
			/** No Domain */
			getProgramsList().getProgramsGroups().add(programsGroup);
		} else {
			/** Use the command stack. */
			AddCommand command = new AddCommand(editingDomain, getProgramsGroup(),
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, getProgram());
			editingDomain.getCommandStack().execute(command);
		}
		
		
		// Test.
		ProgramFactory factory = ProgramFactoriesRegistry.INSTANCE.getFactory(ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST);
		System.out.println("NewScriptBasedProgramWizard.performFinish()" +  factory.createProgram());		

		return true;
	}

	/**
	 * Create and returns the instance of the {@link ProgramsGroup} that the new
	 * program will be contained.
	 * 
	 * @return Reference to the {@link ProgramsGroup}.
	 */
	protected ProgramsGroup getProgramsGroup() {
		if(programsGroup == null && newProgramWizardPage != null){
			return newProgramWizardPage.getProgramsGroup();
		}
		return programsGroup;
	}

	/**
	 * Returns the list of programs to display. Override this method to provide
	 * custom getter implementation. The default implementation returns the list
	 * of programs available in the active session.
	 * 
	 * @return List of programs.
	 */
	protected ProgramsList getProgramsList() {
		return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null ? null
				: ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList();
	}

	protected Program getProgram() {
		if (program == null) {
			// TODO
			if (newProgramWizardPage.getProgramType() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST) {
				setWindowTitle("New Operation Calls List");
				program = (Program) ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallsList();
				program.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(getProgramsGroup(), program, ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
//			}else if(newProgramWizardPage.getProgramType() != ApogyCoreJavaScriptProgramsPackage.Literals){ 
//				//TODO Javascript
//				//program = (Program) ApogyCoreJavaScriptProgramsPackage.Literals
//				program = null;
			}else{
				program = null;
			}
		}
		return program;
	}
}