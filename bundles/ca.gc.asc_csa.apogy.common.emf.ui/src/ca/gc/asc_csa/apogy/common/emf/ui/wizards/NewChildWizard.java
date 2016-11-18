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

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ui.Activator;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;

public class NewChildWizard extends Wizard {

	private ChooseChildEReferenceWizardPage chooseSubClassWizardPage;
	private EList<EReference> eReferencesList;
	private EObject parent;
	private WritableValue<EObject> createdChild;
	
	/**
	 * Constructor for NewContextWizard.
	 */
	public NewChildWizard(EList<EReference> eReferencesList, EObject parent) {
		super();
		initWizard(eReferencesList, parent);
	}
	
	public NewChildWizard(EReference eReference, EObject parent) {
		super();
		EList<EReference> eReferencesList = new BasicEList<EReference>();
		eReferencesList.add(eReference);
		initWizard(eReferencesList, parent);
	}
	
	private void initWizard(EList<EReference> eReferencesList, EObject parent){
		setWindowTitle("New Child");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/emf_new_child.png");
		setDefaultPageImageDescriptor(image);
		this.eReferencesList = eReferencesList;
		this.parent = parent;
		createdChild = new WritableValue<>();
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getChooseSubClassWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getChooseSubClassWizardPage(), 0.5);
	}

	/**
	 * Returns the {@link SubClassesWizardPage}. If null is returned, the page
	 * is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected ChooseChildEReferenceWizardPage getChooseSubClassWizardPage() {
		if (chooseSubClassWizardPage == null) {
			chooseSubClassWizardPage = new ChooseChildEReferenceWizardPage(eReferencesList);
		}
		return chooseSubClassWizardPage;
	}

	@Override
	public boolean performFinish() {
		// Get the editing domain of the parent
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(parent);

		if (editingDomain != null) {
			Command command = null;
			EObject eObject = EcoreUtil.create(chooseSubClassWizardPage.getSelectedEClass());
			// If the selected reference is a list
			if (chooseSubClassWizardPage.getSelectedEReference().isMany()) {
				// Add the new eObject to the list
				command = new AddCommand(editingDomain, parent, chooseSubClassWizardPage.getSelectedEReference(),
						eObject);
			}
			// Otherwise, if the reference is not a list
			else {
				// Set the corresponding EReference of the parent to the new
				// eObject
				command = new SetCommand(editingDomain, parent, chooseSubClassWizardPage.getSelectedEReference(),
						eObject);
			}
			editingDomain.getCommandStack().execute(command);
			createdChild.setValue(eObject);
			return true;
		}
		return false;
	}
	
	public WritableValue<EObject> getCreatedChild(){
		return createdChild;
	}
}