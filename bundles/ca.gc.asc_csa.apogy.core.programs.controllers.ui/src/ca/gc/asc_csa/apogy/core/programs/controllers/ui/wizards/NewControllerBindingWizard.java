package ca.gc.asc_csa.apogy.core.programs.controllers.ui.wizards;
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

import java.util.Arrays;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallEOperationsWizardPage;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.VariableFeatureReferenceWizardPage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.Activator;

public class NewControllerBindingWizard extends Wizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private OperationCallControllerBindingDetailsWizardPage operationCallControllerBindingDetailsWizardPage;
	private VariableFeatureReferenceWizardPage variableFeatureReferenceWizardPage;
	private OperationCallEOperationsWizardPage operationCallEOperationsWizardPage;
	private TriggerWizardPage triggerWizardPage;
	private BindedEDataTypeArgumentsWizardPage bindedEDataTypeArgumentsWizardPage;
	private ConditionningWizardPage conditionningWizardPage;

	private ControllersConfiguration controllersConfiguration;
	private OperationCallControllerBinding controllerBinding;

	/**
	 * Constructor for NewContextWizard.
	 */
	public NewControllerBindingWizard(ControllersConfiguration controllersConfiguration) {
		setWindowTitle("New Controller Binding");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/apogy_new_controller_binding.png");
		setDefaultPageImageDescriptor(image);
		this.controllersConfiguration = controllersConfiguration;
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {	
		addPage(getNamedDescribedWizardPage());
		addPage(getOperationCallControllerBindingDetailsWizardPage());
//		addPage(getVariableFeatureReferenceWizardPage());
//		addPage(getOperationCallEOperationWizardPage());
//		addPage(getTriggerWizardPage());
		
		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(namedDescribedWizardPage, 0.8);
	}
	
	@Override
	public boolean canFinish() {
		return true;
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {	
		if (page == getOperationCallControllerBindingDetailsWizardPage()) {
			if(getControllerBinding().getEOperation() != null && getControllerBinding().getArgumentsList() != null){
				if (!Arrays.asList(getPages()).contains(getBindedEDataTypeArgumentsWizardPage())) {
					addPage(getBindedEDataTypeArgumentsWizardPage());
				} else {				
					return getBindedEDataTypeArgumentsWizardPage();
				}
			}else{
				return null;
			}
			
		}
		
//		else if (page == getBindedEDataTypeArgumentsWizardPage()) {
//			if(getControllerBinding().getEOperation() != null && getControllerBinding().getArgumentsList() != null){
//				if (!Arrays.asList(getPages()).contains(getConditionningWizardPage())) {
//					addPage(getConditionningWizardPage());
//				} else {
//					return getConditionningWizardPage();
//				}
//			}else{
//				return null;
//			}
//			
//		}
		return super.getNextPage(page);
	}

	/**
	 * Returns the {@link NamedDescribedWizardPage}. If null is returned, the
	 * page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected NamedDescribedWizardPage getNamedDescribedWizardPage() {
		if (namedDescribedWizardPage == null) {
			namedDescribedWizardPage = new NamedDescribedWizardPage(getControllerBinding(), getControllerBinding());
		}
		return namedDescribedWizardPage;
	}

	/**
	 * Returns the {@link OperationCallControllerBindingDetailsWizardPage}. If
	 * null is returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected OperationCallControllerBindingDetailsWizardPage getOperationCallControllerBindingDetailsWizardPage() {
		if (operationCallControllerBindingDetailsWizardPage == null) {
			operationCallControllerBindingDetailsWizardPage = new OperationCallControllerBindingDetailsWizardPage(
					getControllerBinding()) {
				@Override
				protected void resetOperationCall() {
					getBindedEDataTypeArgumentsWizardPage().setOperationCallControllerBinding(getControllerBinding());
				}
			};
		}
		return operationCallControllerBindingDetailsWizardPage;
	}
	
	/**
	 * Returns the {@link VariableFeatureReferenceWizardPage}. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected VariableFeatureReferenceWizardPage getVariableFeatureReferenceWizardPage() {
		if (variableFeatureReferenceWizardPage == null) {
			variableFeatureReferenceWizardPage = new VariableFeatureReferenceWizardPage(
					ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList(),
					getControllerBinding()){
				@Override
				protected void resetOperationCall() {
					getControllerBinding().setArgumentsList(null);
					getControllerBinding().setEOperation(null);
					getBindedEDataTypeArgumentsWizardPage().setOperationCallControllerBinding(getControllerBinding());
				}
			};
		}
		return variableFeatureReferenceWizardPage;
	}

	/**
	 * Returns the {@link OperationCallEOperationsWizardPage}. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected OperationCallEOperationsWizardPage getOperationCallEOperationWizardPage() {
		if (operationCallEOperationsWizardPage == null) {
			operationCallEOperationsWizardPage = new OperationCallEOperationsWizardPage(getControllerBinding()){
				@Override
				protected void newSelection() {
					super.newSelection();
					if(getOperationCall().getArgumentsList() != null){
						for(int i = 0; i <  getOperationCall().getArgumentsList().getArguments().size(); i++){
							getOperationCall().getArgumentsList().getArguments().set(i, ApogyCoreProgramsControllersFactory.eINSTANCE.createBindedEDataTypeArgument());
						}
					}
					getBindedEDataTypeArgumentsWizardPage().setOperationCallControllerBinding(getControllerBinding());
					validate();
				}
			};
		}
		return operationCallEOperationsWizardPage;
	}
	
	/**
	 * Returns the {@link TriggerWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected TriggerWizardPage getTriggerWizardPage() {
		if (triggerWizardPage == null) {
			triggerWizardPage = new TriggerWizardPage(getControllerBinding());
		}
		return triggerWizardPage;
	}
	
	/**
	 * Returns the {@link BindedEDataTypeArgumentsWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected BindedEDataTypeArgumentsWizardPage getBindedEDataTypeArgumentsWizardPage() {
		if (bindedEDataTypeArgumentsWizardPage == null) {
			bindedEDataTypeArgumentsWizardPage = new BindedEDataTypeArgumentsWizardPage(getControllerBinding());
		}
		return bindedEDataTypeArgumentsWizardPage;
	}
	
	/**
	 * Returns the {@link ConditionningWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected ConditionningWizardPage getConditionningWizardPage() {
		if (conditionningWizardPage == null) {
			conditionningWizardPage  = new ConditionningWizardPage (getControllerBinding());
		}
		return conditionningWizardPage;
	}

	@Override
	public boolean performFinish() {
			
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getControllersConfiguration());
		
		/** Check if there is a domain. */
		if (editingDomain == null){
			/** No Domain */
			getControllersConfiguration().getOperationCalls().add(getControllerBinding());
		}else{
			/** Use the command stack. */
			AddCommand command = new AddCommand(
					editingDomain,
					getControllersConfiguration(),
					ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
					getControllerBinding());
			editingDomain.getCommandStack().execute(command);	
		}
		return true;
	}

	/**
	 * Create and returns the instance of the
	 * {@link OperationCallControllerBinding} to be set within the several
	 * wizard pages. This method uses the lazy loading pattern.
	 * 
	 * @return Reference to the {@link OperationCallControllerBinding}.
	 */
	protected OperationCallControllerBinding getControllerBinding() {
		if (controllerBinding == null) {
			controllerBinding = ApogyCoreProgramsControllersFactory.eINSTANCE.createOperationCallControllerBinding();
			controllerBinding.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(
					getControllersConfiguration(),
					getControllerBinding(), 
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
		}
		return controllerBinding;
	}
	
	/**
	 * Returns the {@link ControllersConfiguration}.
	 * 
	 * @return Reference to the {@link ControllersConfiguration}.
	 */
	public ControllersConfiguration getControllersConfiguration() {
		return controllersConfiguration;
	}
}