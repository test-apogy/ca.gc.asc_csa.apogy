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

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewProgramsGroupWizard extends Wizard implements INewWizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private ProgramsGroup programsGroup;
	private WritableValue<ProgramsGroup> createdGroup;

	/**
	 * Constructor for NewProgramsGroupWizard.
	 */
	public NewProgramsGroupWizard() {
		super();
		setWindowTitle("New Programs Group");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/apogy_new_programs_group.png");
		setDefaultPageImageDescriptor(image);
		createdGroup = new WritableValue<>();
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
		addPage(getNamedDescribedWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getNamedDescribedWizardPage(), 0.8);
	}

	/**
	 * Returns the {@link NamedDescribedWizardPage}. If null is returned, the
	 * page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage() {
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getProgramsGroup(), getProgramsGroup());
		}
		return namedDescribedWizardPage;
	}

	/**
	 * This method should be overwritten to create the {@link ProgramsGroup} with a transaction.
	 */
	@Override
	public boolean performFinish() {
		return true;
	}

	/**
	 * Create and returns the instance of the {@link ProgramsGroup} to be set
	 * within the several wizard pages. This method uses the lazy loading
	 * pattern.
	 * 
	 * @return Reference to the {@link ProgramsGroup}.
	 */
	protected ProgramsGroup getProgramsGroup() {
		if (programsGroup == null) {
			programsGroup = ApogyCoreInvocatorFactory.eINSTANCE.createProgramsGroup();
			programsGroup.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(getProgramsList(), programsGroup,
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS));
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
	
	public WritableValue<ProgramsGroup> getCreatedProgramsGroup(){
		return createdGroup;
	}
}