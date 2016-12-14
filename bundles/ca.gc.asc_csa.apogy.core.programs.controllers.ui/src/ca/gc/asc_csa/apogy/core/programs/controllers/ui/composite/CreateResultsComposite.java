package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.edit.EMFEditProperties;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

public class CreateResultsComposite extends Composite {

	private Button checkBox;

	private WritableValue<OperationCallControllerBinding> operationCallControllerBindingBinder;
	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public CreateResultsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());

		checkBox = new Button(this, SWT.CHECK);
		checkBox.setText("Create results");

		operationCallControllerBindingBinder = new WritableValue<>();
	}

	/**
	 * Gets the controllerBinding displayed by the composite.
	 * 
	 * @return reference to the {@link OperationCallControllerBinding}
	 */
	public OperationCallControllerBinding getOperationCallControllerBinding() {
		return operationCallControllerBindingBinder.getValue();
	}

	/**
	 * Sets the controllerBinding displayed by the composite.
	 * 
	 * @param operationCallControllerBinding
	 *            reference to the {@link OperationCallControllerBinding} to
	 *            display
	 */
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if (operationCallControllerBindingBinder == null) {
			operationCallControllerBindingBinder = new WritableValue<>();
		}
		operationCallControllerBindingBinder.setValue(operationCallControllerBinding);
		
		customDataBinding();
	}
	
	@SuppressWarnings("unchecked")
	private DataBindingContext customDataBinding(){
		
		if(m_bindingContext != null){
			m_bindingContext.dispose();
		}
		
		m_bindingContext = new DataBindingContext();
		/**
		 * CheckBox data binding.
		 */
		IObservableValue<?> observeOperationCallControllerBindingCreateResult = EMFEditProperties
				.value(TransactionUtil.getEditingDomain(getOperationCallControllerBinding()),
						ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT)
				.observeDetail(operationCallControllerBindingBinder);
		IObservableValue<?> observeCheckBoxChecked = WidgetProperties.selection().observe(checkBox);

		m_bindingContext.bindValue(observeCheckBoxChecked, observeOperationCallControllerBindingCreateResult,
				new UpdateValueStrategy(), new UpdateValueStrategy());
		
		return m_bindingContext;
	}

}