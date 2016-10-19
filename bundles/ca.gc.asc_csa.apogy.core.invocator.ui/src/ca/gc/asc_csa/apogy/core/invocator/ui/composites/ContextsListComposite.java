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

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.fieldassist.ControlDecoration;
import org.eclipse.jface.fieldassist.FieldDecoration;
import org.eclipse.jface.fieldassist.FieldDecorationRegistry;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.layout.RowLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewContextWizard;

public class ContextsListComposite extends Composite {
	private final String DECORATION_STR = "No variable available";
	
	private DataBindingContext m_bindingContext;
	private WritableValue<Environment> environmentBinder;
	private ObservableListContentProvider listContentProvider;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Table tableContexts;

	private CheckboxTableViewer contextsListViewer;
	private Button btnNew; 
	private Composite composite;

	/**
	 * Returns the {@link Context} list viewer.
	 * 
	 * @return Reference to the viewer.
	 */
	public CheckboxTableViewer getContextsListViewer() {
		return contextsListViewer;
	}

	private AdapterImpl sessionAdapter;

	private EditingDomain editingDomain;
	
	private ISelectionChangedListener contextsListViewerSelectionListener;
	private ControlDecoration controlDecoration;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ContextsListComposite(Composite parent, int style) {
		super(parent, style);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));

		contextsListViewer = CheckboxTableViewer.newCheckList(this, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		contextsListViewer.getTable().setLinesVisible(true);
		contextsListViewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}

			@Override
			public boolean isChecked(Object element) {
				boolean checked = false;
				if (element instanceof Context && getEnvironment() != null) {
					checked = getEnvironment().getActiveContext() == element;
				}
				return checked;
			}
		});
		contextsListViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object element = ((IStructuredSelection)event.getSelection()).getFirstElement();
				if (contextsListViewer.getChecked(element)){
					contextsListViewer.setChecked(element, false);
					setCheckedElements(element, false);
				} else {
					contextsListViewer.setChecked(element, true);
					setCheckedElements(element, true);
				}
			}
		});
		contextsListViewer.addCheckStateListener(new ICheckStateListener() {
			@Override
			public void checkStateChanged(CheckStateChangedEvent event) {
				if (event.getChecked()) {
					setCheckedElements(event.getElement(), true);
				} else {
					setCheckedElements(event.getElement(), false);
				}
			}
		}); 

		listContentProvider = new ObservableListContentProvider();
		contextsListViewer.setContentProvider(listContentProvider);

		tableContexts = contextsListViewer.getTable();
		tableContexts.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.paintBordersFor(tableContexts);

		composite = new Composite(this, SWT.NONE);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		RowLayout rl_composite = new RowLayout(SWT.HORIZONTAL);
		rl_composite.marginLeft = 8;
		composite.setLayout(rl_composite);

		/**
		 * Adds a selection listener to the newContext button
		 */
		btnNew = new Button(composite, SWT.NONE);
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
		btnNew.setText("New");
		toolkit.adapt(btnNew, true, true);
		
		/**
		 * Adds a control decoration if there is no variable
		 */
		if(getEnvironment() != null 
				&& getEnvironment().getVariablesList() != null 
				&& getEnvironment().getVariablesList().getVariables() != null 
				&& getEnvironment().getVariablesList().getVariables().size() < 1){
			replaceControlDecoration();
		}

		Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setToolTipText("Not implemented yet!!!"); // TODO: Delete Button
		btnDelete.setEnabled(false);
		btnDelete.setText("Delete");
		toolkit.adapt(btnDelete, true, true);
		
		m_bindingContext = initDataBindingsCustom();
	}
	
	private void setCheckedElements(Object object, boolean checked){
		
		if (checked) {
			SetCommand command = new SetCommand(editingDomain, getEnvironment(),
					ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT, object);
			editingDomain.getCommandStack().execute(command);
		
			Object[] checkedElements = contextsListViewer.getCheckedElements();
			for (int i = 0; i < checkedElements.length; i++) {
				if (checkedElements[i] == object) {
					Object[] checkedElement = { object };
					contextsListViewer.setCheckedElements(checkedElement);
					break;
				}
			}
		} else {
			SetCommand command = new SetCommand(editingDomain, getEnvironment(),
					ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__ACTIVE_CONTEXT, null);
			editingDomain.getCommandStack().execute(command);
		}	
	}

	/**
	 * Returns the environment that contains the {@link ContextsList}.
	 * 
	 * @return Reference to the environment.
	 */
	private Environment getEnvironment() {
		if (environmentBinder != null && environmentBinder.getValue() != null) {
			return environmentBinder.getValue();
		}
		return null;
		// return contextsList == null ? null : contextsList.getEnvironment();
	}

	/**
	 * Sets the {@link Environment}.
	 * 
	 * @param Environment
	 *            Reference to the Environment.
	 */
	public void setEnvironment(Environment environment) {
		if (environmentBinder == null) {
			environmentBinder = new WritableValue<Environment>();
		}
		environmentBinder.setValue(environment);
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(environment.getContextsList());

	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext m_bindingContext = new DataBindingContext();

		if (environmentBinder == null) {
			environmentBinder = new WritableValue<Environment>();
		}

		/**
		 * Bind contexts list.
		 */
		IObservableList<?> invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS))
				.observeDetail(environmentBinder);

		ViewerSupport.bind(contextsListViewer, invocatorFacadeEnvironmentContextsListContextsObserveValue,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));
		
		/**
		 * Bind variable list with the newContext button
		 */
		IObservableValue<?> observeBtnCreateEnabledObserveWidget = WidgetProperties.enabled().observe(btnNew);
		IObservableValue<?> environmentVariablesListVariablesObserveValue = EMFProperties
				.value(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__VARIABLES_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.VARIABLES_LIST__VARIABLES))
				.observeDetail(environmentBinder);
		m_bindingContext.bindValue(observeBtnCreateEnabledObserveWidget, environmentVariablesListVariablesObserveValue, 
				null, 
				new UpdateValueStrategy().setConverter(new Converter(List.class, Boolean.class) {
					@SuppressWarnings("rawtypes")
					@Override
					public Object convert(Object arg0) {
						/**
						 * If there is no variable
						 */
						if(((List)arg0).isEmpty()){
							replaceControlDecoration();
							return false;
						/**
						 * Otherwise if there is a variable
						 */
						}else{
							if(controlDecoration != null){
								controlDecoration.hide();
						}
						return true;
						}
					}
				}));

		/**
		 * Selects the first context if there is no active context
		 */
		if(getEnvironment() != null){
			Context defaultSelectedContext = getEnvironment().getActiveContext();
			if (defaultSelectedContext == null
					&& getEnvironment().getContextsList().getContexts().isEmpty()) {
				defaultSelectedContext = getEnvironment().getContextsList()
						.getContexts().get(0);
			}
			contextsListViewer.setSelection(new StructuredSelection(
					defaultSelectedContext), true);
			
		}

		/**
		 * Listens to selection changed.
		 */
		contextsListViewer.removeSelectionChangedListener(getContextsListViewerSelectionListener());
		contextsListViewer.addSelectionChangedListener(getContextsListViewerSelectionListener());

		return m_bindingContext;
	}
	
	private void replaceControlDecoration(){
		controlDecoration = new ControlDecoration(composite, SWT.LEFT | SWT.TOP);
		ControlDecoration controlDecoration = new ControlDecoration(btnNew, SWT.LEFT | SWT.TOP);
		controlDecoration.setDescriptionText(DECORATION_STR);
		FieldDecoration fieldDecoration = FieldDecorationRegistry.getDefault()
				.getFieldDecoration(FieldDecorationRegistry.DEC_ERROR);
		controlDecoration.setImage(fieldDecoration.getImage());
		controlDecoration.setShowOnlyOnFocus(false);
		controlDecoration.show();
	}

	private ISelectionChangedListener getContextsListViewerSelectionListener() {
		if (contextsListViewerSelectionListener == null) {
			contextsListViewerSelectionListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return contextsListViewerSelectionListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected context.
	 * 
	 * @return Reference to the context.
	 */
	public Context getSelectedContext() {
		IStructuredSelection selection = (IStructuredSelection) contextsListViewer.getSelection();
		return (Context) selection.getFirstElement();
	}


	/**
	 * This adapter listens {@link Environment#setActiveContext(Context)}
	 * changes.
	 * 
	 * @return Reference to the adapter.
	 */
	private Adapter getInvocatorSessionAdapter() {
		if (sessionAdapter == null) {
			sessionAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeatureID(
							InvocatorSession.class) == ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT) {
						contextsListViewer.refresh();
					}
				}
			};
		}
		return sessionAdapter;
	}
	
	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		getEnvironment().eAdapters().remove(getInvocatorSessionAdapter());
	}
}