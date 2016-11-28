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

import org.eclipse.jface.wizard.Wizard;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;

public class VariableWizard extends Wizard{

	private SetVariableTypeWizardPage setVariableTypeWizardPage;
	
	private Variable variable;
	private VariablesList variablesList;

	private NamedDescribedWizardPage namedDescribedWizardPage;

	/**
	 * Constructor for NewProgramsGroupWizard.
	 */
	public VariableWizard(VariablesList variablesList) {
		super();
		setWindowTitle("New Variable");
		setNeedsProgressMonitor(true);
		setDefaultPageImageDescriptor(ApogyCommonUiFacade.INSTANCE.getImageDescriptor("platform:/plugin/" + Activator.ID + "/icons/wizban/apogy.png"));
		this.variablesList = variablesList;
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getNamedDescribedWizardPage());
		addPage(getSetVariableTypeWizardPage());
		
		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getNamedDescribedWizardPage(), 0.8);
	}	

	/**
	 * Returns the {@link NamedDescribedContextWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage() {
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getVariable(), getVariable());
		}
		return namedDescribedWizardPage;
	}	

	/**
	 * Returns the {@link SetVariableTypeWizardPage}. If null is returned, the page
	 * is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected SetVariableTypeWizardPage getSetVariableTypeWizardPage() {
		if (setVariableTypeWizardPage == null) {
			setVariableTypeWizardPage = new SetVariableTypeWizardPage(getVariable());
		}
		return setVariableTypeWizardPage;
	}

	@Override
	public boolean performFinish() {		
		ApogyCoreInvocatorUIFacade.INSTANCE.addVariable(variablesList, getVariable());
		return true;
	}
	
	private Variable getVariable(){
		if(this.variable == null){
			variable = ApogyCoreInvocatorFactory.eINSTANCE.createVariable();
			variable.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(variablesList, variable, ApogyCoreInvocatorPackage.Literals.VARIABLES_LIST__VARIABLES));
		}
		return this.variable;
	}
}