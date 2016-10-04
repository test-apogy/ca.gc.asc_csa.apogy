package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.ScrolledForm;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.forms.widgets.TableWrapData;
import org.eclipse.ui.forms.widgets.TableWrapLayout;
import org.eclipse.wb.swt.SWTResourceManager;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

public class SessionStatusComposite extends ScrolledComposite {

	private static final String NO_ACTIVE_SESSION_STR = "No Active Session";
	private static final String SESSION_ACTIVE_STR = "Session Active";
	private static final String INITIALIZED_STR = "Variables instantiated";
	private static final String DISPOSED_STR = "Variables disposed";

	private DataBindingContext m_bindingContext;
	private WritableValue invocatorFacadeBinder;
	private final FormToolkit formToolKit = new FormToolkit(Display.getDefault());
	
	private Text txtStatusConnexion;
	private Combo comboContext;
	private Button btnResetInstances;
	private Button btnClearInstance;
	private Text txtInstanceStatus;
	private Section sctnInstance;
	private Section sctnContext;
	private Composite compositeConnexion;
	private Composite compositeInstance;
	private Composite compositeContext;
	private ScrolledForm scrolledForm;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SessionStatusComposite(Composite parent, int style) {
		super(parent, style);
		

		this.addDisposeListener(new DisposeListener()

		{
			@Override
			public void widgetDisposed(DisposeEvent e) {
				m_bindingContext.dispose();
			}

		});
		{
			TableWrapLayout tableWrapLayout = new TableWrapLayout();
			setLayout(tableWrapLayout);
		}


		scrolledForm = formToolKit.createScrolledForm(this);
		scrolledForm.setLayoutData(new TableWrapData(TableWrapData.FILL_GRAB, TableWrapData.TOP, 1, 1));
		formToolKit.paintBordersFor(scrolledForm);
		scrolledForm.getBody().setLayout(new GridLayout(1, false));
		

		Section sctnSessionStatus = formToolKit.createSection(scrolledForm.getBody(), Section.TITLE_BAR);
		sctnSessionStatus.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.paintBordersFor(sctnSessionStatus);
		sctnSessionStatus.setText("Session");

		compositeConnexion = formToolKit.createComposite(sctnSessionStatus, SWT.NONE);
		formToolKit.paintBordersFor(compositeConnexion);
		sctnSessionStatus.setClient(compositeConnexion);
		compositeConnexion.setLayout(new GridLayout(2, false));

		txtStatusConnexion = new Text(compositeConnexion, SWT.NONE);
		txtStatusConnexion.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		txtStatusConnexion.setText(NO_ACTIVE_SESSION_STR);
		txtStatusConnexion.setBackground(SWTResourceManager.getColor(SWT.COLOR_RED));
		formToolKit.adapt(txtStatusConnexion, true, true);
		txtStatusConnexion.setEditable(false);

		sctnContext = formToolKit.createSection(scrolledForm.getBody(), Section.TITLE_BAR);
		sctnContext.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.paintBordersFor(sctnContext);
		sctnContext.setText("Context");

		compositeContext = formToolKit.createComposite(sctnContext, SWT.NONE);
		formToolKit.paintBordersFor(compositeContext);
		sctnContext.setClient(compositeContext);
		compositeContext.setLayout(new GridLayout(1, false));

		comboContext = new Combo(compositeContext, SWT.NONE);
		comboContext.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(comboContext);
		formToolKit.paintBordersFor(comboContext);
		comboContext.setText("Context");

		sctnInstance = formToolKit.createSection(scrolledForm.getBody(), Section.TITLE_BAR);
		sctnInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.paintBordersFor(sctnInstance);
		sctnInstance.setText("Status");

		compositeInstance = formToolKit.createComposite(sctnInstance, SWT.NONE);
		formToolKit.paintBordersFor(compositeInstance);
		sctnInstance.setClient(compositeInstance);
		compositeInstance.setLayout(new GridLayout(2, false));

		txtInstanceStatus = formToolKit.createText(compositeInstance, "New Text", SWT.CENTER);
		txtInstanceStatus.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 2, 1));
		txtInstanceStatus.setText("Status");
		txtInstanceStatus.setEditable(false);

		btnResetInstances = new Button(compositeInstance, SWT.NONE);
		btnResetInstances.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolKit.adapt(btnResetInstances, true, true);
		btnResetInstances.setText("Reset Instances");

		btnClearInstance = new Button(compositeInstance, SWT.NONE);
		btnClearInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		formToolKit.adapt(btnClearInstance, true, true);
		btnClearInstance.setText("Clear Instances");

		// Create the listener that disposes the variables of the environment
		// when the button is selected. This is to clear the instances
		btnClearInstance.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null) {
					if (!ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
							.getVariablesList().getVariables().isEmpty()) {
						ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances(
								ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
					}
				}
			}
		});

		// Create the listener that initiates the variables of the environment
		// when the button is selected. This is to reset the instances.
		btnResetInstances.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession() != null) {
					if (ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment()
							.getActiveContext().isVariablesInstantiated()) {
						ApogyCoreInvocatorFacade.INSTANCE.disposeVariableInstances(
								ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
					}
					ApogyCoreInvocatorFacade.INSTANCE.initVariableInstances(
							ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment());
				}
			}
		});
		
		this.setExpandHorizontal(true);
		this.setExpandVertical(true);
		this.setContent(scrolledForm);
		this.setMinSize(scrolledForm.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_bindingContext = customInitDataBindings();
	}
	
	/**
	 * Disposes the actual composite.
	 */
	@Override
	public void dispose() {
		m_bindingContext.dispose();
		super.dispose();
	}

	/**
	 * Creates and returns the data bindings associated with the active session.
	 * 
	 * @return Reference to the bindings.
	 */
	protected DataBindingContext customInitDataBindings() {

		m_bindingContext = new DataBindingContext();

		invocatorFacadeBinder = new WritableValue();
		// Get the Invocator facade for the binder
		invocatorFacadeBinder.setValue(ApogyCoreInvocatorFacade.INSTANCE);		
		

		/** Data binding to know if there is an active session */
		IObservableValue observeTextStatusConnexionObserveWidget = WidgetProperties.text().observe(txtStatusConnexion);
		IObservableValue obeserveBackGroundColorStatusConnexionObserveWidget = WidgetProperties.background().observe(txtStatusConnexion);	
		IObservableValue invocatorFacadeActiveInvocatorSessionObserveValue = EMFProperties
				.value(ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION)
				.observeDetail(invocatorFacadeBinder);
		
		m_bindingContext.bindValue(observeTextStatusConnexionObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? NO_ACTIVE_SESSION_STR : SESSION_ACTIVE_STR;

					}
				}));

		m_bindingContext.bindValue(obeserveBackGroundColorStatusConnexionObserveWidget,
				invocatorFacadeActiveInvocatorSessionObserveValue, null,
				new UpdateValueStrategy().setConverter(new Converter(InvocatorSession.class, Color.class) {

					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? SWTResourceManager.getColor(SWT.COLOR_RED) : SWTResourceManager.getColor(SWT.COLOR_GREEN);
					}
				}));
		
		/** Data binding for the different elements of the UI to be enabled/disabled if there is an active session or not */
		IObservableValue observeEnabledResetInstancesObserveWidget = WidgetProperties.enabled().observe(btnResetInstances);
		m_bindingContext.bindValue(observeEnabledResetInstancesObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledClearInstancesObserveWidget = WidgetProperties.enabled().observe(btnClearInstance);
		m_bindingContext.bindValue(observeEnabledClearInstancesObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledComboContextObserveWidget = WidgetProperties.enabled().observe(comboContext);
		m_bindingContext.bindValue(observeEnabledComboContextObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		IObservableValue observeEnabledTxtInstanceStatusObserveWidget = WidgetProperties.enabled().observe(txtInstanceStatus);
		m_bindingContext.bindValue(observeEnabledTxtInstanceStatusObserveWidget, invocatorFacadeActiveInvocatorSessionObserveValue, null, new InvocatorInstanceToBooleanUpdateValueStrategy());
		
		
		/** Data binding to get the name of the contexts or the combo box */
		IObservableList observeComboContextItemsObserveWidget = WidgetProperties.items().observe(comboContext);
		IObservableList invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
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
		IObservableValue observeComboContextSingleSelectionIndexObserveWidget = WidgetProperties.singleSelectionIndex()
				.observe(comboContext);
		IObservableValue invocatorFacadeEnvironmentActiveContextObserveValue = EMFProperties
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
		
		IObservableValue observeTextInstanceStatusObserveWidget = WidgetProperties.text().observe(txtInstanceStatus);
		IObservableValue observeBackgroundInstanceStatusObserveWidget = WidgetProperties.background().observe(txtInstanceStatus);
		IObservableValue invocatorFacadeActiveContextCreationDateValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__ENVIRONMENT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLES_INSTANTIATED))					
				.observeDetail(invocatorFacadeBinder);
		m_bindingContext.bindValue(observeTextInstanceStatusObserveWidget,
				invocatorFacadeActiveContextCreationDateValue, null,
				new UpdateValueStrategy().setConverter(new Converter(Boolean.class, String.class) {
					@Override
					public Object convert(Object fromObject) {
						return ((Boolean)fromObject).booleanValue() ? INITIALIZED_STR : DISPOSED_STR;
					}
				}));
		m_bindingContext.bindValue(observeBackgroundInstanceStatusObserveWidget,
				invocatorFacadeActiveContextCreationDateValue, null,
				new UpdateValueStrategy().setConverter(new Converter(Context.class, Color.class) {
					@Override
					public Object convert(Object fromObject) {
						if (((ApogyCoreInvocatorFacade) invocatorFacadeBinder.getValue()).getActiveInvocatorSession()
								.getEnvironment().getActiveContext().isVariablesInstantiated()) {
							return SWTResourceManager.getColor(SWT.COLOR_GREEN);
						} else {
							return SWTResourceManager.getColor(SWT.COLOR_RED);
						}
					}
				}));

		return m_bindingContext;
	}
	
	/**
	 * This class is used to convert a InvocatorSession to a boolean if there is an InvocatorSession instance active
	 */
	private class InvocatorInstanceToBooleanUpdateValueStrategy extends UpdateValueStrategy {
		public InvocatorInstanceToBooleanUpdateValueStrategy() {
			setConverter(new Converter(InvocatorSession.class, Boolean.class) {
				@Override
				/**
				 * @return true if there is an Invocator Session, false otherwise       
				 */
				public Object convert(Object fromObject) {
					return fromObject != null;
				}
			});
		}
	}
}
