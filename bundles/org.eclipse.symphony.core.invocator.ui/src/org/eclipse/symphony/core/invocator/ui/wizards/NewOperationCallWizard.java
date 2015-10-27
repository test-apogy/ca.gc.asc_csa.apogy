package org.eclipse.symphony.core.invocator.ui.wizards;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallsList;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.VariablesList;
import org.eclipse.symphony.core.invocator.ui.Activator;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

public class NewOperationCallWizard extends Wizard implements INewWizard {

	private OperationCallsListWizardPage operationCallsListWizardPage;
	private VariableFeatureReferenceWizardPage variableFeatureReferenceWizardPage;
	private OperationCallEOperationsWizardPage operationCallEOperationsWizardPage;
	private NamedDescribedWizardPage namedDescribedWizardPage;
	private OperationCall operationCall;
	
	/**
	 * Constructor for NewSymphonySessionWizard.
	 */
	public NewOperationCallWizard() {
		super();
		setWindowTitle("New Operation Call");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(
				Activator.ID, "icons/wizban/symphony_new_operation_call.png");
		setDefaultPageImageDescriptor(image);		
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
		if (getOperationCallsListWizardPage() != null){
			addPage(getOperationCallsListWizardPage());	
		}
		
		if (getNamedDescribedWizardPage() != null){
			addPage(getNamedDescribedWizardPage());
		}
		
		if (getVariableFeatureReferenceWizardPage() != null){
			addPage(getVariableFeatureReferenceWizardPage());
		}
		
		if (getOperationCallEOperationWizardPage() != null){
			addPage(getOperationCallEOperationWizardPage());
		}
	}

	/**
	 * Returns the {@link OperationCallsListWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */
	protected OperationCallsListWizardPage getOperationCallsListWizardPage(){
		if (operationCallsListWizardPage == null){
			operationCallsListWizardPage = new OperationCallsListWizardPage(getProgramsList());	
		}		
		return operationCallsListWizardPage;
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
	 * Returns the {@link VariableFeatureReferenceWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */	
	protected VariableFeatureReferenceWizardPage getVariableFeatureReferenceWizardPage(){
		if (variableFeatureReferenceWizardPage == null){
			variableFeatureReferenceWizardPage = new VariableFeatureReferenceWizardPage(getVariablesList(), getOperationCall());	
		}
		return variableFeatureReferenceWizardPage;
	}
	
	/**
	 * Returns the {@link OperationCallEOperationsWizardPage}.  If null is returned, the page is not added to the wizard.
	 * @return Reference to the page.
	 */	
	protected OperationCallEOperationsWizardPage getOperationCallEOperationWizardPage(){
		if (operationCallEOperationsWizardPage == null){
			operationCallEOperationsWizardPage = new OperationCallEOperationsWizardPage(getOperationCall()); 
		}
		return operationCallEOperationsWizardPage;
	}	
	
	@Override
	public boolean performFinish() {
			
		OperationCallsList operationCallsList = getOperationCallsListWizardPage().getSelectedOperationCallsList();		
		EditingDomain editingDomain = AdapterFactoryEditingDomain
				.getEditingDomainFor(operationCallsList);
		
		/** Check if there is a domain. */
		if (editingDomain == null){
			/** No Domain */
			operationCallsList.getOperationCalls().add(getOperationCall());	
		}else{
			/** Use the command stack. */
			AddCommand command = new AddCommand(
					editingDomain,
					operationCallsList,
					Symphony__CoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
					getOperationCall());
			editingDomain.getCommandStack().execute(command);			
		}
				
		return true;
	}
		
	/** 
	 * Returns the list of programs to display.  Override this method to provide custom getter implementation.  The default 
	 * implementation returns the list of programs available in the active session.
	 * @return List of programs.
	 */
	protected ProgramsList getProgramsList(){
		return EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() == null ? 
				null : 
				EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getProgramsList();
	}
	
	/** 
	 * Create and returns the instance of the {@link OperationCall} to be set within the several wizard pages.  
	 * This method uses the lazy loading pattern.
	 * @return Reference to the {@link OperationCall}. 
	 */
	protected OperationCall getOperationCall(){
		if (operationCall == null){		
			operationCall = Symphony__CoreInvocatorFactory.eINSTANCE.createOperationCall();
			operationCall.setName("New Operation Call");
		}
		return operationCall;
	}
	
	/** 
	 * Returns the {@link VariablesList}.  
	 * @return Reference to the {@link VariablesList}. 
	 */
	protected VariablesList getVariablesList(){
		VariablesList variablesList = null;
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if (session != null){
			variablesList = session.getEnvironment() == null ? null : session.getEnvironment().getVariablesList();			
		}
		return variablesList;
	}
}