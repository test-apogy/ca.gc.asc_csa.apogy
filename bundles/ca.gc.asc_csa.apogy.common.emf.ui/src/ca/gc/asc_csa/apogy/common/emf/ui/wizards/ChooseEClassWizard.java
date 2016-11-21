package ca.gc.asc_csa.apogy.common.emf.ui.wizards;
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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;

public class ChooseEClassWizard extends Wizard {

	private ChooseEClassImplementationWizardPage chooseEClassImplementationWizardPage;
	private EReference eReference;
	private EObject parent;
	private EClass eClass;
	

	
	public ChooseEClassWizard(EReference eReference, EObject parent, EClass eClass) {
		super();
		setWindowTitle("New Child");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/emf_new_child.png");
		setDefaultPageImageDescriptor(image);
		this.eReference = eReference;
		this.parent = parent;
		this.eClass = eClass;
	}


	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getChooseEClassImplementationWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getChooseEClassImplementationWizardPage(), 0.5);
	}

	/**
	 * Returns the {@link SubClassesWizardPage}. If null is returned, the page
	 * is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected ChooseEClassImplementationWizardPage getChooseEClassImplementationWizardPage() {
		if (chooseEClassImplementationWizardPage == null) {
			chooseEClassImplementationWizardPage  = new ChooseEClassImplementationWizardPage(getEReference(), getEClass());
		}
		return chooseEClassImplementationWizardPage ;
	}
	
	public EReference getEReference() {
		return eReference;
	}
	
	public EClass getEClass() {
		return eClass;
	}
	
	public EObject getParent() {
		return parent;
	}

	@Override
	public boolean performFinish() {
		// TODO
		return false;
	}
	

}