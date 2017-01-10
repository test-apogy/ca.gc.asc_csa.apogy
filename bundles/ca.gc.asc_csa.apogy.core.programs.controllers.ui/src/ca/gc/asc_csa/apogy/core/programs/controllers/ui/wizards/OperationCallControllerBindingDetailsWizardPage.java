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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.jface.dialogs.IDialogPage;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite.OperationCallControllerBindingsDetailsComposite;

public class OperationCallControllerBindingDetailsWizardPage extends WizardPage {

	private final static String WIZARD_PAGE_ID = "ca.gc.asc_csa.apogy.core.invocator.ui.wizards.OperationCallControllerBindingDetailsWizardPage";
	private OperationCallControllerBindingsDetailsComposite composite;

	protected OperationCallControllerBinding operationCallControllerBinding;
	protected AdapterImpl adapter;

	/**
	 * Constructor for the WizardPage.
	 * 
	 * @param pageName
	 * @wbp.parser.constructor
	 */
	public OperationCallControllerBindingDetailsWizardPage() {
		super(WIZARD_PAGE_ID);
		setTitle("Controller binding details definition");
		setDescription("Select the Variable/Type/Feature, Operation and Trigger");
	}

	public OperationCallControllerBindingDetailsWizardPage(
			OperationCallControllerBinding operationCallControllerBinding) {
		this();

		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}

		this.operationCallControllerBinding = operationCallControllerBinding;

		operationCallControllerBinding.eAdapters().add(getAdapter());
	}

	protected Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					validate();
				}
			};
		}
		return adapter;
	}

	/**
	 * @see IDialogPage#createControl(Composite)
	 */
	public void createControl(Composite parent) {
		ScrolledComposite container = new ScrolledComposite(parent, SWT.H_SCROLL | SWT.V_SCROLL);
		container.setLayout(new FillLayout());
		container.setExpandHorizontal(true);
		container.setExpandVertical(true);

		composite = new OperationCallControllerBindingsDetailsComposite(container, SWT.None) {
			@Override
			protected void newSelection(ISelection selection) {
				validate();
			}
		};
		composite.setOperationCallControllerBinding(operationCallControllerBinding);

		container.setContent(composite);
		container.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		container.addListener(SWT.Resize, new Listener() {

			@Override
			public void handleEvent(Event event) {
				container.setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
			}
		});
		setControl(container);

		validate();
	}

	/**
	 * This method is invoked to validate the content.
	 */
	protected void validate() {
		String errorVariable = "";
		String errorEOperation = "";
		String errorTrigger = "";

		if (this.operationCallControllerBinding.getVariable() == null) {
			errorVariable = " <variable>";
		}
		if (this.operationCallControllerBinding.getEOperation() == null) {
			errorEOperation = " <operation>";
		}

		if (operationCallControllerBinding.getTrigger() != null) {
			Diagnostic diagnosticContext = Diagnostician.INSTANCE.validate(operationCallControllerBinding.getTrigger());
			if (diagnosticContext.getSeverity() != Diagnostic.OK) {
				errorTrigger = " <trigger>";
			}
		} else {
			errorTrigger = " <trigger>";
		}

		if (errorVariable != "" || errorEOperation != "" || errorTrigger != "") {
			setErrorMessage(errorVariable + errorEOperation + errorTrigger + " must be provided");
		} else {
			setErrorMessage(null);
		}

		setPageComplete(getErrorMessage() == null);
	}
}