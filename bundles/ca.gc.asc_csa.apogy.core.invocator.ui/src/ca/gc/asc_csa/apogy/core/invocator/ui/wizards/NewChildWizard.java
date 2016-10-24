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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ui.wizards.ChooseSubClassWizardPage;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class NewChildWizard extends Wizard{
	
	private ChooseSubClassWizardPage chooseSubClassWizardPage;
	private EClass parent;
	
	/**
	 * Constructor for NewContextWizard.
	 */
	public NewChildWizard(EClass parent) {
		super();
		setWindowTitle("New Child");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_child.png");
		setDefaultPageImageDescriptor(image);		
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
	protected ChooseSubClassWizardPage geChooseSubClassWizardPage(){
		if (chooseSubClassWizardPage == null){
			System.out.println("NewChildWizard.geChooseSubClassWizardPage()");
			chooseSubClassWizardPage = new ChooseSubClassWizardPage(parent); 
		}		
		return chooseSubClassWizardPage;
	}
	


	@Override
	public boolean performFinish() {
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
}