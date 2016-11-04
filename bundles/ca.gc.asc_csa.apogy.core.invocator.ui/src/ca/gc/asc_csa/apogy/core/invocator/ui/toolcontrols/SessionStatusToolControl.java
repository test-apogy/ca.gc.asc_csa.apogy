package ca.gc.asc_csa.apogy.core.invocator.ui.toolcontrols;
/**
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
 *     Olivier L. Larouche (Olivier.llarouche@canada.ca,
 *     Canadian Space Agency (CSA) - Initial API and implementation
 **/

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class SessionStatusToolControl {

	private DataBindingContext m_bindingContext;
	private WritableValue<ApogyCoreInvocatorFacade> invocatorFacadeBinder;
	private Combo comboContext;
	private Button btnResetInstances;
	private Button btnClearInstance;
	private Text txtInstanceStatus;

	@PostConstruct
	public void createControls(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new GridLayout(4, false));

		comboContext = new Combo(composite, SWT.NONE);
		GridData gd_comboContext = new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1);
		gd_comboContext.widthHint = 250;
		gd_comboContext.minimumWidth = 250;
		comboContext.setLayoutData(gd_comboContext);
		comboContext.setText("Context");

		btnResetInstances = new Button(composite, SWT.NONE);
		btnResetInstances.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		btnResetInstances.setText("Reset");

		// Create the listener that initiates the variables of the environment
		// when the button is selected. This is to reset the instances.
		btnResetInstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances();
			}
		});

		btnClearInstance = new Button(composite, SWT.NONE);
		btnClearInstance.setLayoutData(new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1));
		btnClearInstance.setText("Clear");

		// Create the listener that disposes the variables of the environment
		// when the button is selected. This is to clear the instances
		btnClearInstance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances();
			}
		});

		txtInstanceStatus = new Text(composite, SWT.BORDER | SWT.READ_ONLY);
		txtInstanceStatus.setBackground(SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT));
		GridData gd_txtInstanceStatus = new GridData(SWT.LEFT, SWT.FILL, false, false, 1, 1);
		gd_txtInstanceStatus.widthHint = 16;
		txtInstanceStatus.setLayoutData(gd_txtInstanceStatus);
		txtInstanceStatus.setEditable(false);

		m_bindingContext = customInitDataBindings();
	}

	
	/**
	 * Disposes the actual composite.
	 */
	@PreDestroy
	public void dispose() {
		m_bindingContext.dispose();
	}

	/**
	 * Creates and returns the data bindings associated with the active session.
	 * 
	 * @return Reference to the bindings.
	 */
	@SuppressWarnings("unchecked")
	protected DataBindingContext customInitDataBindings() {

		m_bindingContext = new DataBindingContext();
		invocatorFacadeBinder = new WritableValue<ApogyCoreInvocatorFacade>();
		invocatorFacadeBinder.setValue(ApogyCoreInvocatorFacade.INSTANCE);
		IObservableValue<?> invocatorFacadeActiveInvocatorSessionObserveValue = EMFProperties
				.value(ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
				.observeDetail(invocatorFacadeBinder);

		/**
		 * Data binding for the different elements of the UI to be
		 * enabled/disabled if there is an active session or not
		 */
		IObservableValue<?> observeEnabledResetInstancesObserveWidget = WidgetProperties.enabled()
				.observe(btnResetInstances);
		m_bindingContext.bindValue(observeEnabledResetInstancesObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue<?> observeEnabledClearInstancesObserveWidget = WidgetProperties.enabled()
				.observe(btnClearInstance);
		m_bindingContext.bindValue(observeEnabledClearInstancesObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue<?> observeEnabledComboContextObserveWidget = WidgetProperties.enabled().observe(comboContext);
		m_bindingContext.bindValue(observeEnabledComboContextObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue<?> observeEnabledTxtInstanceStatusObserveWidget = WidgetProperties.enabled()
				.observe(txtInstanceStatus);
		m_bindingContext.bindValue(observeEnabledTxtInstanceStatusObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new InvocatorInstanceToBooleanUpdateValueStrategy());

		/** Data binding to get the name of the contexts or the combo box */
		IObservableList<?> observeComboContextItemsObserveWidget = WidgetProperties.items().observe(comboContext);
		IObservableList<?> invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS))
				.observeDetail(invocatorFacadeBinder);
		m_bindingContext.bindList(observeComboContextItemsObserveWidget,
				invocatorFacadeEnvironmentContextsListContextsObserveValue, null,
				new UpdateListStrategy().setConverter(new Converter(Context.class, String.class) {
					@Override
					public Object convert(Object arg0) {
						return ((Context) arg0).getName() == null ? "null" : ((Context) arg0).getName();
					}
				}));

		/**
		 * Data binding to set the text value of the combo box to the active
		 * context
		 */
		IObservableValue<?> observeComboContextSingleSelectionIndexObserveWidget = WidgetProperties.singleSelectionIndex()
				.observe(comboContext);
		IObservableValue<?> invocatorFacadeEnvironmentActiveContextObserveValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT))
				.observeDetail(invocatorFacadeBinder);

		m_bindingContext.bindValue(observeComboContextSingleSelectionIndexObserveWidget,
				invocatorFacadeEnvironmentActiveContextObserveValue,
				new UpdateValueStrategy().setConverter(new Converter(Integer.class, Context.class) {

					@Override
					public Object convert(Object fromObject) {
						if (!ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
								.getContextsList().getContexts().get((Integer) fromObject).equals(null)) {

							return ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
									.getContextsList().getContexts().get((Integer) fromObject);
						} else {
							return null;
						}
					}

				}), new UpdateValueStrategy().setConverter(new Converter(Context.class, Integer.class) {
					@Override
					public Object convert(Object arg0) {
						for (int i = 0; i < comboContext.getItemCount(); i++) {
							if (((Context) arg0).getName().equals(comboContext.getItem(i))) {
								return i;
							}
						}
						return -1;
					}
				}));

		IObservableValue<?> observeBackgroundInstanceStatusObserveWidget = WidgetProperties.background()
				.observe(txtInstanceStatus);
		IObservableValue<?> invocatorFacadeActiveContextCreationDateValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLES_INSTANTIATED))
				.observeDetail(invocatorFacadeBinder);
		m_bindingContext.bindValue(observeBackgroundInstanceStatusObserveWidget,
				invocatorFacadeActiveContextCreationDateValue, null,
				new UpdateValueStrategy().setConverter(new Converter(Context.class, Color.class) {
					@Override
					public Object convert(Object fromObject) {
						if (invocatorFacadeBinder.getValue().getActiveInvocatorSession()
								.getEnvironment().getActiveContext().isVariablesInstantiated()) {
							return SWTResourceManager.getColor(SWT.COLOR_GREEN);
						} else {
							return SWTResourceManager.getColor(SWT.COLOR_TRANSPARENT);
						}
					}
				}));

		return m_bindingContext;
	}

	/**
	 * This class is used to convert a InvocatorSession to a boolean if there is
	 * an InvocatorSession instance active
	 */
	private class InvocatorInstanceToBooleanUpdateValueStrategy extends UpdateValueStrategy {
		public InvocatorInstanceToBooleanUpdateValueStrategy() {
			setConverter(new Converter(InvocatorSession.class, Boolean.class) {
				@Override
				/**
				 * @return true if there is an Invocator Session, false
				 *         otherwise
				 */
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});
		}
	}
}