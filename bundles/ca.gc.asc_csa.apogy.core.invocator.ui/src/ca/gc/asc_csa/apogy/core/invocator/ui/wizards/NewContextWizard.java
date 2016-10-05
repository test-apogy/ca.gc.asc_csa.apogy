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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class NewContextWizard extends Wizard{//implements INewWizard {
	
	private Context context;
	private NameContextWizardPage nameContextWizardPage;
	private ContextDefinitionWizardPage contextDefinitionWizardPage;
	private DataProductsListWizardPage dataProductsListWizardPage;
	
	/**
	 * Constructor for NewContextWizard.
	 */
	public NewContextWizard() {
		super();
		setWindowTitle("New Context");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_context.png");
		setDefaultPageImageDescriptor(image);		
	}

	/** TODO: See if needed
	 * We will accept the selection in the workbench to see if we can initialize
	 * from it.
	 * 
	 * @see IWorkbenchWizard#init(IWorkbench, IStructuredSelection)
	 */ 
	/*public void init(IWorkbench workbench, IStructuredSelection selection) {
	}*/

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		if(getNameContextWizardPage() != null){
			addPage(getNameContextWizardPage());
		}
		if(getContextDefinitionWizardPage() != null){
			addPage(getContextDefinitionWizardPage());
		}
		if(getDataProductsListWizardPage() != null){
			addPage(getDataProductsListWizardPage());
		}
	}

	/**
	 * Returns the {@link NameContextWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected NameContextWizardPage getNameContextWizardPage(){
		if (nameContextWizardPage == null){
			nameContextWizardPage = new NameContextWizardPage(); 
		}		
		return nameContextWizardPage;
	}
	
	/**
	 * Returns the {@link ContextDefinitionWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected ContextDefinitionWizardPage getContextDefinitionWizardPage(){
		if (contextDefinitionWizardPage == null){
			contextDefinitionWizardPage = new ContextDefinitionWizardPage();
		}		
		return contextDefinitionWizardPage;
	}
	
	/**
	 * Returns the {@link DataProductsListWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected DataProductsListWizardPage getDataProductsListWizardPage(){
		if (dataProductsListWizardPage == null){
			dataProductsListWizardPage = new DataProductsListWizardPage();
		}		
		return dataProductsListWizardPage ;
	}	

	@Override
	public boolean performFinish() {
		
//		OperationCallsList operationCallsList = null;// TODO = getContextDefinitionWizardPage().getSelectedOperationCallsList();		
//		EditingDomain editingDomain = AdapterFactoryEditingDomain
//				.getEditingDomainFor(operationCallsList);
//		
//		/** Check if there is a domain. */
//		if (editingDomain == null){
//			/** No Domain */
//			operationCallsList.getOperationCalls().add(getOperationCall());	
//		}else{
//			/** Use the command stack. */
//			AddCommand command = new AddCommand(
//					editingDomain,
//					operationCallsList,
//					ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
//					getOperationCall());
//			editingDomain.getCommandStack().execute(command);			
//		}
				
		return true;
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
	
	/** 
	 * Create and returns the instance of the {@link Context} to be set within the several wizard pages.  
	 * This method uses the lazy loading pattern.
	 * @return Reference to the {@link Context}. 
	 */
	protected Context getContext() {
		if (context == null) {
			context = ApogyCoreInvocatorFactory.eINSTANCE.createBasicContext();
			context.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(
					(EObject) ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
							.getContextsList().getContexts(),
					ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS));
		}
		return context;
	}
	
	/** 
	 * Returns the {@link VariablesList}.  
	 * @return Reference to the {@link VariablesList}. 
	 */
	protected VariablesList getVariablesList(){
		VariablesList variablesList = null;
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			variablesList = session.getEnvironment() == null ? null : session.getEnvironment().getVariablesList();			
		}
		return variablesList;
	}
}