package ca.gc.asc_csa.apogy.core.invocator.ui.composites;
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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewContextWizard;

public class ContextsListComposite extends ScrolledComposite {
	private DataBindingContext m_bindingContext;
	private WritableValue<Environment> environmentBinder;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter activeContextAdapter;

	private Button btnNew;
	private Button btnActivate;
	private Button btnDelete;

	private TableViewer tableViewer;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ContextsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, false));

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(false);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 4));
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setText("Name");

		btnNew = new Button(composite, SWT.NONE);
		btnNew.setText("New");
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				/**
				 * Creates and opens the wizard to create a valid context
				 */
				NewContextWizard newContextWizard = new NewContextWizard(getEnvironment().getInvocatorSession());
				WizardDialog dialog = new WizardDialog(getShell(), newContextWizard);

				dialog.open();
			}
		});

		btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// FIXME Move to core + UI facade
				EditingDomain editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(environmentBinder.getValue());

				RemoveCommand command = new RemoveCommand(editingDomain, environmentBinder.getValue().getContextsList(),
						ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS, getSelectedContext());
				editingDomain.getCommandStack().execute(command);
			}
		});

		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));

		btnActivate = new Button(composite, SWT.NONE);
		btnActivate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnActivate.setText("Activate");
		btnActivate.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// FIXME Move to core + UI facade
				EditingDomain editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(environmentBinder.getValue());

				SetCommand command = new SetCommand(editingDomain, environmentBinder.getValue(),
						ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT, getSelectedContext());
				editingDomain.getCommandStack().execute(command);
			}
		});

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_bindingContext = initDataBindingsCustom();
	}

	/**
	 * Returns the environment that contains the {@link ContextsList}.
	 * 
	 * @return Reference to the environment.
	 */
	private Environment getEnvironment() {
		return environmentBinder.getValue();
	}

	/**
	 * Sets the {@link Environment}.
	 * 
	 * @param Environment
	 *            Reference to the Environment.
	 */
	public void setEnvironment(Environment environment) {
		if(environmentBinder.getValue() != null){
			environmentBinder.getValue().eAdapters().remove(getActiveContextAdapter());
		}
		environmentBinder.setValue(environment);
		for (TableColumn column : tableViewer.getTable().getColumns()) {
			column.pack();
		}
		environment.eAdapters().add(getActiveContextAdapter());
	}

	public Context getSelectedContext() {
		return (Context) tableViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	@SuppressWarnings("unchecked")
	private DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		if (environmentBinder == null) {
			environmentBinder = new WritableValue<Environment>();
		}

		
		/**
		 * Context list binding
		 */
		IObservableList<?> environmentContextListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS))
				.observeDetail(environmentBinder);

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(
				new ObservableMapLabelProvider(Properties.observeEach(contentProvider.getKnownElements(),
						EMFProperties.value(ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT),
						EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME))) {

					private AdapterFactoryLabelProvider adapterLabelProvider;
					private final static int NAME_COLUMN_ID = 0;

					@Override
					public String getColumnText(Object element, int columnIndex) {
						String str = "<undefined>";

						if (element instanceof Context) {
							switch (columnIndex) {
							case NAME_COLUMN_ID:
								str = getAdapterLabelProvider().getText(element);
								break;
							}
						}
						return str;
					}

					public AdapterFactoryLabelProvider getAdapterLabelProvider() {
						if (adapterLabelProvider == null) {
							adapterLabelProvider = new AdapterFactoryLabelProvider(adapterFactory) {
								@Override
								public String getText(Object object) {
									Context context = (Context) object;
									String str = context.getName();

									if (environmentBinder.getValue() != null
											&& environmentBinder.getValue().getActiveContext() == context) {
										str += " <Active>";
									}

									return str;
								}
							};
						}
						return adapterLabelProvider;
					}
				});
		tableViewer.setInput(environmentContextListContextsObserveValue);

		/**
		 * Binding to enable the newButton when there is a VariableList
		 */
		IObservableValue<?> observeBtnCreateEnabledObserveWidget = WidgetProperties.enabled().observe(btnNew);
		IObservableValue<?> environmentVariablesListVariablesObserveValue = EMFProperties
				.value(ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__VARIABLES_LIST).observeDetail(environmentBinder);

		m_bindingContext.bindValue(observeBtnCreateEnabledObserveWidget, environmentVariablesListVariablesObserveValue,
				null, new UpdateValueStrategy().setConverter(new Converter(VariablesList.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject instanceof VariablesList
								? !((VariablesList) fromObject).getVariables().isEmpty() : false;
					}
				}));

		/**
		 * Binding to enable the deleteButton when there is an active session
		 */
		IObservableValue<?> observeSingleSelectionTableViewer = ViewerProperties.singleSelection().observe(tableViewer);
		IObservableValue<?> observeEnabledBtnDeleteObserveWidget = WidgetProperties.enabled().observe(btnDelete);

		m_bindingContext.bindValue(observeEnabledBtnDeleteObserveWidget, observeSingleSelectionTableViewer, null,
				new UpdateValueStrategy().setConverter(new Converter(Object.class, Boolean.class) {

					@Override
					public Object convert(Object fromObject) {
						return fromObject != null;
					}

				}));
		
		/**
		 * Binding to disable the activateButton when the variables are instantiated
		 */
		IObservableValue<?> observeEnabledBtnActivateObserveWidget = WidgetProperties.enabled().observe(btnActivate);
		IObservableValue<?> invocatorEnvironmentActiveContextVariablesInstantiated = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXT__VARIABLES_INSTANTIATED))
				.observeDetail(environmentBinder);
		m_bindingContext.bindValue(observeEnabledBtnActivateObserveWidget,
				invocatorEnvironmentActiveContextVariablesInstantiated, null,
				new UpdateValueStrategy().setConverter(new Converter(Boolean.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject == null ? false : !(Boolean) fromObject;
					}
				}));

		return m_bindingContext;
	}

	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * This methods gets an adapter to change the labels if the active context is changed.
	 */
	private Adapter getActiveContextAdapter() {
		if (activeContextAdapter == null) {
			activeContextAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() == ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT) {
						tableViewer.refresh();
					}
				}
			};
		}
		return activeContextAdapter;
	}

	@Override
	public void dispose() {
		adapterFactory.dispose();
		super.dispose();
		if (environmentBinder != null) {
			environmentBinder.getValue().eAdapters().remove(getActiveContextAdapter());
			environmentBinder.dispose();
		}
	}
}