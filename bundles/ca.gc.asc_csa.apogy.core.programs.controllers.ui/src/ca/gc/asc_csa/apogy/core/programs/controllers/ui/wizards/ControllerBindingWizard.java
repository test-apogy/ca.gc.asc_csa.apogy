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

import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.common.ui.dialogs.CloseWizardEscapeDialog;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.Activator;

public class ControllerBindingWizard extends Wizard {

	private NamedDescribedWizardPage namedDescribedWizardPage;
	private OperationCallControllerBindingDetailsWizardPage operationCallControllerBindingDetailsWizardPage;
	private BindedEDataTypeArgumentsWizardPage bindedEDataTypeArgumentsWizardPage;

	private ControllersConfiguration controllersConfiguration;
	private OperationCallControllerBinding controllerBinding;

	/**
	 * Constructor for NewContextWizard.
	 */
	public ControllerBindingWizard(ControllersConfiguration controllersConfiguration) {
		setWindowTitle("New Controller Binding");
		setNeedsProgressMonitor(true);
		ImageDescriptor image = AbstractUIPlugin.imageDescriptorFromPlugin(Activator.ID,
				"icons/wizban/apogy_new_controller_binding.png");
		setDefaultPageImageDescriptor(image);
		this.controllersConfiguration = controllersConfiguration;
	}

	@Override
	public void createPageControls(Composite pageContainer) {
		super.createPageControls(pageContainer);

		/**
		 * Overrides the default behavior of a excape keyPress in the wizrd
		 */
		getShell().addListener(SWT.Traverse, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if (event.detail == SWT.TRAVERSE_ESCAPE) {
					if (event.doit) {
						CloseWizardEscapeDialog dialog = new CloseWizardEscapeDialog(ControllerBindingWizard.this);
						int result = dialog.open();
						if (result == 0) {
							performCancel();
						}
						event.doit = false;
					}
				}
			}
		});
	}

	/**
	 * Add the page to the wizard.
	 */
	public void addPages() {
		addPage(getNamedDescribedWizardPage());
		addPage(getOperationCallControllerBindingDetailsWizardPage());
		addPage(getBindedEDataTypeArgumentsWizardPage());

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(namedDescribedWizardPage, 0.8);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == getOperationCallControllerBindingDetailsWizardPage()) {
			if (getControllerBinding().getEOperation() != null && getControllerBinding().getArgumentsList() != null) {
				return getBindedEDataTypeArgumentsWizardPage();
			} else {
				return null;
			}
		}
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
					getControllerBinding());
		}
		return operationCallControllerBindingDetailsWizardPage;
	}

	/**
	 * Returns the {@link BindedEDataTypeArgumentsWizardPage}. If null is
	 * returned, the page is not added to the wizard.
	 * 
	 * @return Reference to the page.
	 */
	protected BindedEDataTypeArgumentsWizardPage getBindedEDataTypeArgumentsWizardPage() {
		if (bindedEDataTypeArgumentsWizardPage == null) {
			bindedEDataTypeArgumentsWizardPage = new BindedEDataTypeArgumentsWizardPage(getControllerBinding());
		}
		return bindedEDataTypeArgumentsWizardPage;
	}

	@Override
	public boolean performFinish() {
		return false;
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
			ApogyCommonEmfTransactionFacade.INSTANCE.addInTempTransactionalEditingDomain(controllerBinding);
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(controllerBinding,
					ApogyCommonEMFPackage.Literals.NAMED__NAME,
					ApogyCommonEMFFacade.INSTANCE.getDefaultName(getControllersConfiguration(), getControllerBinding(),
							ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
		}

		return controllerBinding;
	}

	@Override
	public boolean performCancel() {
		// Stops the controller state thread if the state is active.
		if (getControllerBinding().getTrigger() instanceof ControllerStateTrigger) {
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(getControllerBinding().getTrigger(),
					ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD, new Long(-1));
		}
		// Removes the adapter on the EControllerEnvironment for a
		// ControllerTrigger or stops the TimeTrigger thread
		ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(getControllerBinding(),
				ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, null);

		// Remove the controllerBinding from it's EditingDomain.
		getControllerBinding().eResource().getResourceSet().getResources().remove(getControllerBinding().eResource());
		TransactionUtil.disconnectFromEditingDomain(getControllerBinding().eResource());

		return super.performCancel();
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