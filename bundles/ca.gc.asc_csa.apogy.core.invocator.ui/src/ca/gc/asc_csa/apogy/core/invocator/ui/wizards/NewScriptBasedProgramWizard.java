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
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ScriptBasedProgram;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewScriptBasedProgramWizard extends Wizard implements INewWizard {

	private NewProgramWizardPage newProgramWizardPage;
	private ProgramsGroup programsGroup;
	private ProgramSettings programSettings;

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
		addPage(getNewProgramWizardPage());
		
		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getNewProgramWizardPage(), 0.8);
		setForcePreviousAndNextButtons(true);

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
					ApogyCoreInvocatorPackage.Literals.SCRIPT_BASED_PROGRAM, getProgramSettings());
		}
		return newProgramWizardPage;
	}

	/**
	 * This method should be overwritten to create the {@link ScriptBasedProgram} with a transaction.
	 */
	@Override
	public boolean performFinish() {
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
	
	protected ProgramsGroup getCreationProgramsGroup(){
		return newProgramWizardPage.getProgramsGroup();
	}
	
	protected ProgramSettings getProgramSettings(){
		if (programSettings == null) {
			programSettings = ApogyCoreInvocatorFactory.eINSTANCE.createProgramSettings();
		}
		return programSettings;
	}
	
	protected EClass getProgramType(){
		return newProgramWizardPage.getProgramType();
	}
	
}