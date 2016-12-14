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
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NamedDescribedWizardPage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
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
						CloseOnCancelDialog dialog = new CloseOnCancelDialog(getShell(), "Closing wizard", null,
								"Progress will be lost if the wizard is colsed.\nAre you sure you want to close the wizard?",
								MessageDialog.QUESTION, new String[] { "Yes", "No" }, 1);
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

		ApogyCommonUiFacade.INSTANCE.adjustWizardPage(namedDescribedWizardPage, 0.8);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		if (page == getOperationCallControllerBindingDetailsWizardPage()) {
			if (getControllerBinding().getEOperation() != null && getControllerBinding().getArgumentsList() != null) {
				if (!Arrays.asList(getPages()).contains(getBindedEDataTypeArgumentsWizardPage())) {
					addPage(getBindedEDataTypeArgumentsWizardPage());
				} else {
					return getBindedEDataTypeArgumentsWizardPage();
				}
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
		getControllerBinding().eResource().getResourceSet().getResources().remove(getControllerBinding().eResource());
		TransactionUtil.disconnectFromEditingDomain(getControllerBinding().eResource());
		EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getControllersConfiguration());

		/** Check if there is a domain. */
		if (editingDomain == null) {
			/** No Domain */
			getControllersConfiguration().getOperationCalls().add(getControllerBinding());
		} else {
			/** Use the command stack. */
			AddCommand command = new AddCommand(editingDomain, getControllersConfiguration(),
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
			ApogyCommonEmfTransactionFacade.INSTANCE.addInTempTransactionalEditingDomain(controllerBinding);
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(controllerBinding,
					ApogyCommonEMFPackage.Literals.NAMED__NAME,
					ApogyCommonEMFFacade.INSTANCE.getDefaultName(getControllersConfiguration(), getControllerBinding(),
							ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
		}

		return controllerBinding;
	}

//	@Override
//	public boolean performCancel() {
//		/**
//		 * Confirmation dialog
//		 */
//		// TODO replace with general confirmation dialog
//		String[] buttons = { "Yes", "No" };
//		CloseOnCancelDialog dialog = new CloseOnCancelDialog(getShell(), "Closing wizard", null,
//				"Progress will be lost if the wizard is colsed.\nAre you sure you want to close the wizard?",
//				MessageDialog.QUESTION, buttons, 0);
//		dialog.open();
//		return dialog.getCancel();
//	}

	// TODO move to common.ui
	private class CloseOnCancelDialog extends MessageDialog {

		private boolean cancel = true;

		public CloseOnCancelDialog(Shell parentShell, String dialogTitle, Image dialogTitleImage, String dialogMessage,
				int dialogImageType, String[] dialogButtonLabels, int defaultIndex) {
			super(parentShell, dialogTitle, dialogTitleImage, dialogMessage, dialogImageType, dialogButtonLabels,
					defaultIndex);
		}

		@Override
		protected void buttonPressed(int buttonId) {
			if (buttonId == 1) {
				cancel = false;
			}
			this.close();
			switch (buttonId) {
			case 0:
				ControllerBindingWizard.this.getShell().setVisible(false);
				ControllerBindingWizard.this.dispose();
				this.close();
				break;
			case 1:
				cancel = false;
				this.cancelPressed();
				break;
			default:
				break;
			}
		}

		public boolean getCancel() {
			return cancel;
		}

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