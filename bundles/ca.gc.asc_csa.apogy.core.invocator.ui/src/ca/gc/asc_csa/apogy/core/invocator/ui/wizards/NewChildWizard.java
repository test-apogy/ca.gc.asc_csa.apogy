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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ui.wizards.ChooseChildEReferenceWizardPage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewChildWizard extends Wizard{
	
	private ChooseChildEReferenceWizardPage chooseSubClassWizardPage;
	private EList<EReference> eReferencesList;
	private EObject parent;
	
	/**
	 * Constructor for NewContextWizard.
	 */
	public NewChildWizard(EList<EReference> eReferencesList, EObject parent) {
		super();
		setWindowTitle("New Child");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_child.png");
		setDefaultPageImageDescriptor(image);		
		this.eReferencesList = eReferencesList;
		this.parent = parent;
	}
	
	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		if(geChooseSubClassWizardPage() != null){
			addPage(geChooseSubClassWizardPage());
		}
	}

	/**
	 * Returns the {@link SubClassesWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected ChooseChildEReferenceWizardPage geChooseSubClassWizardPage(){
		if (chooseSubClassWizardPage == null){
			chooseSubClassWizardPage = new ChooseChildEReferenceWizardPage(eReferencesList); 
		}		
		return chooseSubClassWizardPage;
	}
	


	@Override
	public boolean performFinish() {
		EObject eObject = EcoreUtil.create(chooseSubClassWizardPage.getSelectedEClass());
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(parent);
		
		if(editingDomain != null){
			Command command = null;
			if (chooseSubClassWizardPage.getSelectedEReference().isMany()) {
				command = new AddCommand(editingDomain, parent, chooseSubClassWizardPage.getSelectedEReference(), eObject);
			} else {
				command = new SetCommand(editingDomain, parent, chooseSubClassWizardPage.getSelectedEReference(), eObject);
			}

			editingDomain.getCommandStack().execute(command);
			System.out.println();
			return true;
		}
		
		
//		EObject eObject = EcoreUtil.create(chooseSubClassWizardPage.getSelectedEReference());
//	//	ListFeatureNode test1 = (ListFeatureNode) parent;
//		
//
//		// TODO
//		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(parent);
//
////		System.out.println("NewChildWizard.performFinish() parent " + parent);
////		System.out.println("NewChildWizard.performFinish() eObject " + eObject);
//		/** Check if there is a domain. */
//		if (editingDomain != null) {
//			/** Use the command stack. */
//		
////			System.out.println(ApogyCoreInvocatorPackage.Literals.PROGRAMS_LIST__PROGRAMS_GROUPS);
////			System.out.println(getChildEReference(parent.eClass(), eObject.eClass()));
//		
//			System.out.println();
//			
//			EReference eReference = getChildEReference(parent.eClass(), eObject.eClass());
//			
//			System.out.println("PARENT: " + parent);
//			System.out.println("--ICI----------");
//			System.out.println(eObject.eClass().eContainmentFeature());
//			System.out.println(eReference);
//			System.out.println(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);
//			System.out.println("--ICI----------");
//			//System.out.println("REFERENCE: " + eObject.eClass().eContainingFeature());
//			
//			Command command = null;
////			AddCommand command = new AddCommand(editingDomain, parent,
////					getChildEReference(parent.eClass(), eObject.eClass()), eObject);
//			if (eReference.isMany()){
//				command = new AddCommand(editingDomain, parent,
//						eReference, eObject);
//			}else{
//				command = new SetCommand(editingDomain, parent, eReference, eObject);
//			}
//			
//			editingDomain.getCommandStack().execute(command);
//			System.out.println();
//			return true;
//		}		
		return false;
		
		
//		/*
//		 *  Create a compound command to execute addContext and the addDataProducts if needed
//		 */
//		StrictCompoundCommand compoundCommand = new StrictCompoundCommand();
//		
//		/*
//		 * Create the command to add the new context
//		 */
//		EditingDomain editingDomain = AdapterFactoryEditingDomain
//				.getEditingDomainFor(getInvocatorSession().getEnvironment().getContextsList());			
//		AddCommand addContextcommand = new AddCommand(editingDomain, getInvocatorSession().getEnvironment().getContextsList(),
//				ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS, context);
//		compoundCommand.append(addContextcommand);
//		
//		/*
//		 * Verify if the context's dataProductsList is in the invocatorSession's
//		 * dataProductsListsContainer to know if the DataProductsList is already
//		 * existing or a new one
//		 */
//		boolean newDataProductsList = false;
//		for(int i = 0; i < invocatorSession.getDataProductsListContainer().getDataProductsList().size(); i++){
//			if(context.getDataProductsList() == invocatorSession.getDataProductsListContainer().getDataProductsList().get(i)){
//				newDataProductsList = true;
//			}
//		}
//		
//		/*
//		 * If the dataProductsList was not found in the invocatorSession's
//		 * dataProductsListsContainer
//		 */
//		if(!newDataProductsList){
//			/*
//			 * Create the command to add the new DataProductsList
//			 */
//			editingDomain = AdapterFactoryEditingDomain
//					.getEditingDomainFor(getInvocatorSession());			
//			AddCommand addDataProductsListCommand = new AddCommand(editingDomain, getInvocatorSession().getDataProductsListContainer(),
//					ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER, context.getDataProductsList());
//			compoundCommand.append(addDataProductsListCommand);
//		}
//		
//		/*
//		 * Execure the command
//		 */
//		editingDomain.getCommandStack().execute(compoundCommand);
//						
//		return true;
	}
	
	private EReference getChildEReference(EClass parent, EClass child){
			
		EList<EReference> parentEReferences = child.getEAllReferences();
		EList<EReference> possibleChildrenWhatever = parent.getEAllContainments();
		
		System.out.println(parentEReferences);
		System.out.println(possibleChildrenWhatever);

		System.out.println("-----------");
		
		System.out.println(parentEReferences);
		System.out.println(possibleChildrenWhatever);
		//System.out.println(test12);
		
		/*for(int i = 0; i < possibleChildrenWhatever.size(); i++){
			if(test1 == possibleChildrenWhatever.get(i)){
				return possibleChildrenWhatever.get
			}
		}*/
		
		for(int i = 0; i < possibleChildrenWhatever.size(); i++){
			for(int j = 0; j < parentEReferences.size(); j++){
				if(possibleChildrenWhatever.get(i) == parentEReferences.get(j)){
					System.out.println("FOUND" + parentEReferences.get(j));
					return parentEReferences.get(j);
				}
			}
			
		}
		return null;
	}
}