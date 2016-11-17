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

import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ui.Activator;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallEOperationsWizardPage;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.VariableFeatureReferenceWizardPage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

public class NewControllerBindingWizard extends Wizard {

	private VariableFeatureReferenceWizardPage variableFeatureReferenceWizardPage;
	private OperationCallEOperationsWizardPage operationCallEOperationsWizardPage;
	private NamedDescribedWizardPage namedDescribedWizardPage;
	private ControllerComponentWizardPage controllerComponentWizardPage;

	private ControllersConfiguration controllersConfiguration;
	private WritableValue<OperationCallControllerBinding> controllerBinding;

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
		controllerBinding = new WritableValue<>();
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {	
		if (getNamedDescribedWizardPage() != null){
			addPage(getNamedDescribedWizardPage());
		}
		
		if (getVariableFeatureReferenceWizardPage() != null){
			addPage(getVariableFeatureReferenceWizardPage());
		}
		
		if (getOperationCallEOperationWizardPage() != null){
			addPage(getOperationCallEOperationWizardPage());
		}
		if (getControllerComponentWizardPage() != null) {
			addPage(getControllerComponentWizardPage());
		}
	
	}
	
	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if(page == getOperationCallEOperationWizardPage()){
			if(getControllerBinding().getArgumentsList() != null){
				return getControllerComponentWizardPage();
			}
		}
		return super.getNextPage(page);
	}
	
	@Override
	public boolean canFinish() {
		// TODO
		return super.canFinish();
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
	 * Returns the {@link VariableFeatureReferenceWizardPage}. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected VariableFeatureReferenceWizardPage getVariableFeatureReferenceWizardPage() {
		if (variableFeatureReferenceWizardPage == null) {
			variableFeatureReferenceWizardPage = new VariableFeatureReferenceWizardPage(
					ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getVariablesList(),
					getControllerBinding());
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
			operationCallEOperationsWizardPage = new OperationCallEOperationsWizardPage(getControllerBinding());
		}
		return operationCallEOperationsWizardPage;
	}

	/**
	 * Returns the {@link ControllerComponentWizardPage}. If null is returned,
	 * the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected ControllerComponentWizardPage getControllerComponentWizardPage() {
		if (controllerComponentWizardPage == null) {
			controllerComponentWizardPage = new ControllerComponentWizardPage();
		}
		return controllerComponentWizardPage;
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
		if (controllerBinding.getValue() == null) {
			controllerBinding.setValue(ApogyCoreProgramsControllersFactory.eINSTANCE.createOperationCallControllerBinding());
			controllerBinding.getValue().setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(
					getControllersConfiguration(),
					getControllerBinding(), 
					ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
		}
		return controllerBinding.getValue();
	}
	
	public WritableValue<OperationCallControllerBinding> getCreatedControllerBinding(){
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