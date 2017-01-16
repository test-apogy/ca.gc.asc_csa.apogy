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

import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;

public class OperationCallWizard extends Wizard implements INewWizard {
	private NamedDescribedWizardPage namedDescribedWizardPage;
	private OperationCallDetailsWizardPage operationCallDetailsWizardPage;
	private ArgumentsWizardPage argumentsWizardPage;
	
	private OperationCallsList operationCallsList;
	private OperationCall operationCall;
	
	/**
	 * Constructor for NewApogySessionWizard.
	 */	
	public OperationCallWizard(OperationCallsList operationCallsList){
		super();
		this.operationCallsList = operationCallsList;
		initialize(operationCallsList.getProgramsGroup());
	}
	
	private void initialize(ProgramsGroup programsGroup){
		setWindowTitle("New Operation Call");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/apogy_new_operation_call.png");
		setDefaultPageImageDescriptor(image);	;
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getNamedDescribedWizardPage());
		addPage(getOperationCallDetailsWizardPage());
		addPage(getArgumentsWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(getNamedDescribedWizardPage(), 0.8);
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == getOperationCallDetailsWizardPage()) {
			if (getOperationCall().getEOperation() != null && getOperationCall().getArgumentsList() != null) {
				return getArgumentsWizardPage();
			} else {
				return null;
			}
		}
		return super.getNextPage(page);
	}

	/**
	 * Returns the {@link NamedDescribedWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage(){
		if (namedDescribedWizardPage == null){
			namedDescribedWizardPage = new NamedDescribedWizardPage(getOperationCall(), getOperationCall());	
		}
		return namedDescribedWizardPage;
	}
	
	/**
	 * Returns the {@link NamedDescribedWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected OperationCallDetailsWizardPage getOperationCallDetailsWizardPage(){
		if (operationCallDetailsWizardPage == null){
			operationCallDetailsWizardPage = new OperationCallDetailsWizardPage(getOperationCall());	
		}
		return operationCallDetailsWizardPage;
	}

	/**
	 * Returns the {@link OperationCallEOperationsWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */	
	protected ArgumentsWizardPage getArgumentsWizardPage(){
		if (argumentsWizardPage == null){
			argumentsWizardPage = new ArgumentsWizardPage(getOperationCall()); 
		}
		return argumentsWizardPage;
	}	
	@Override
	public boolean performFinish() {
		return false;
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
	 * Create and returns the instance of the {@link OperationCall} to be set within the several wizard pages.  
	 * This method uses the lazy loading pattern.
	 * @return Reference to the {@link OperationCall}. 
	 */
	protected OperationCall getOperationCall() {
		if (operationCall == null) {
			operationCall = ApogyCoreInvocatorFactory.eINSTANCE.createOperationCall();
			ApogyCommonEmfTransactionFacade.INSTANCE.addInTempTransactionalEditingDomain(operationCall);
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(operationCall, ApogyCommonEMFPackage.Literals.NAMED__NAME,
					ApogyCommonEMFFacade.INSTANCE.getDefaultName(
							operationCallsList, operationCall,
							ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS));
		}
		return operationCall;
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

	@Override
	public boolean performCancel() {
		getOperationCall().eResource().getResourceSet().getResources().remove(getOperationCall().eResource());
		TransactionUtil.disconnectFromEditingDomain(getOperationCall().eResource());

		return super.performCancel();
	}
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
	}
}