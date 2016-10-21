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

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
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
import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory;
import ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings;

public class NewScriptBasedProgramWizard extends Wizard implements INewWizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private NewScriptBasedProgramWizardPage newScriptedBasedProgramWizardPage;
	private ProgramsGroup programsGroup;
	private NewProgramSettings newProgramSettings;

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
		if (getNamedDescribedWizardPage() != null) {
			addPage(getNamedDescribedWizardPage());
		}
		if (getNewScriptedBasedProgramWizardPage() != null) {
			addPage(getNewScriptedBasedProgramWizardPage());
		}
	}

	/**
	 * Returns the {@link NewScriptBasedProgramWizardPage }. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NewScriptBasedProgramWizardPage getNewScriptedBasedProgramWizardPage() {
		if (newScriptedBasedProgramWizardPage == null) {
			if (programsGroup != null) {
				newScriptedBasedProgramWizardPage = new NewScriptBasedProgramWizardPage(programsGroup,
						ApogyCoreInvocatorPackage.Literals.SCRIPT_BASED_PROGRAM, getNewProgramSettings());
			} else {
				newScriptedBasedProgramWizardPage = new NewScriptBasedProgramWizardPage(
						ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList(),
						ApogyCoreInvocatorPackage.Literals.SCRIPT_BASED_PROGRAM, getNewProgramSettings());
			}

		}
		return newScriptedBasedProgramWizardPage;
	}

	/**
	 * Returns the {@link NamedDescribedWizardPage}. If null is returned, the
	 * page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected WizardPage getNamedDescribedWizardPage() {// Named named,
														// Described described){
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getNewProgramSettings().getProgramSettings(),
					getNewProgramSettings().getProgramSettings());
		}
		return namedDescribedWizardPage;
	}

	@Override
	public boolean performFinish() {

		ProgramFactory factory = ProgramFactoriesRegistry.INSTANCE.getFactory(newScriptedBasedProgramWizardPage.getProgramType());
		programsGroup = newScriptedBasedProgramWizardPage.getProgramsGroup();
		Program program = factory.createProgram();
		factory.applySettings(program, getProgramSettings());
		setProgramsGroup(newScriptedBasedProgramWizardPage.getProgramsGroup());

		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(programsGroup.getProgramsList());

		/** Check if there is a domain. */
		if (editingDomain != null) {
			/** Use the command stack. */
			AddCommand command = new AddCommand(editingDomain, programsGroup,
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, program);
			editingDomain.getCommandStack().execute(command);

			return true;
		}
		return false;

	}

	protected NewProgramSettings getNewProgramSettings() {
		if (newProgramSettings == null) {
			newProgramSettings = ApogyCoreInvocatorUIFactory.eINSTANCE.createNewProgramSettings();
			newProgramSettings.setProgramSettings(ApogyCoreInvocatorFactory.eINSTANCE.createProgramSettings());
			if (programsGroup != null) {
				newProgramSettings.getProgramSettings().setName(ApogyCommonEMFFacade.INSTANCE
						.getDefaultName(programsGroup, ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
			} else {
				newProgramSettings.getProgramSettings().setName("NewProgram");
			}
		}

		return newProgramSettings;
	}

	protected ProgramSettings getProgramSettings() {
		return getNewProgramSettings().getProgramSettings();
	}

	public void setProgramsGroup(ProgramsGroup programsGroup) {
		this.programsGroup = programsGroup;
	}

}