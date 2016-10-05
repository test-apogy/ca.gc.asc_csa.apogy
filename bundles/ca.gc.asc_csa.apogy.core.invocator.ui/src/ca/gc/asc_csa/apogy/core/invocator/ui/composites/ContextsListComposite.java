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

import java.util.EventObject;
import java.util.Timer;
import java.util.TimerTask;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateListStrategy;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.beans.BeanProperties;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFObservables;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.internal.databinding.viewers.ViewerCheckedElementsProperty;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTableViewer;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ICheckStateProvider;
import org.eclipse.jface.viewers.ICheckable;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.ContextsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

import org.eclipse.ui.forms.widgets.FormToolkit;

public class ContextsListComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private WritableValue environmentBinder;
	private ObservableListContentProvider listContentProvider;
	private LabelProvider labelProvider;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private ContextsList contextsList;
	private Table tableContexts;

	private CheckboxTableViewer contextsListViewer;

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

	/*
	 * public ContextsListComposite(Composite parent, int style, ContextsList
	 * contextsList) { this(parent, style); setContextsList(contextsList); }
	 */

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
					System.out.println(
							"ContextsListComposite.ContextsListComposite(...).new IDoubleClickListener() {...}.doubleClick()");
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

		// EditingSupport editingSupport = new ContextsListEditingSupport(
		// contextsListViewer);
		//
		// tableContexts.getColumns()[0].setEditingSupport(editingSupport);

		// ListViewerEditor.create(contextsListViewer,
		// new ColumnViewerEditorActivationStrategy(
		// contextsListViewer) {
		// @Override
		// protected boolean isEditorActivationEvent(
		// ColumnViewerEditorActivationEvent event) {
		// return event.eventType ==
		// ColumnViewerEditorActivationEvent.MOUSE_DOUBLE_CLICK_SELECTION;
		// }
		// }, SWT.NONE);

		Composite composite = new Composite(this, SWT.NONE);
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new RowLayout(SWT.HORIZONTAL));

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				Context basicContext = ApogyCoreInvocatorFactory.eINSTANCE.createBasicContext();
				basicContext.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(getContextsList(),
						ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS));

				if(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession()
						.getDataProductsListContainer().getDataProductsList().size() != 0){
					basicContext.setDataProductsList(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession()
							.getDataProductsListContainer().getDataProductsList().get(0));
				}else{
					DataProductsList productList = ApogyCoreInvocatorFactory.eINSTANCE.createDataProductsList();
					productList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(ApogyCoreInvocatorFactory.eINSTANCE.createDataProductsList(),
							ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST));
					
					OperationCallResultsList opsCallResultList = ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallResultsList();
					productList.setOperationCallResultsList(opsCallResultList);
					opsCallResultList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(opsCallResultList,
							ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST));
					

					//EditingDomain dataProductListEditingDomain  = getEditingDomain(getContextsList().getEnvironment().getInvocatorSession().getDataProductsListContainer());

					AddCommand command = new AddCommand(editingDomain, getContextsList().getEnvironment().getInvocatorSession().getDataProductsListContainer(),
							ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST, productList);
					editingDomain.getCommandStack().execute(command);
					
					basicContext.setDataProductsList(productList);
				}
		
				/*DataProductsList productList = ApogyCoreInvocatorFactory.eINSTANCE.createDataProductsList();
				productList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(productList,
						ApogyCoreInvocatorPackage.Literals.CONTEXT__DATA_PRODUCTS_LIST));
				
				OperationCallResultsList opsCallResultList = ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallResultsList();
				productList.setOperationCallResultsList(opsCallResultList);
				opsCallResultList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(opsCallResultList,
						ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST));
				
				basicContext.setDataProductsList(productList);*/
				
				//EditingDomain contextListEditingDomain = getEditingDomain(getContextsList());
				AddCommand command = new AddCommand(editingDomain, getContextsList(),
						ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS, basicContext);
				editingDomain.getCommandStack().execute(command);
				
				if(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().getActiveContext() == null){
					ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession().getEnvironment().setActiveContext(basicContext);
				}
			}
		});
		btnNew.setText("New");
		toolkit.adapt(btnNew, true, true);

		Button btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setToolTipText("Not implemented yet!!!");
		btnDelete.setEnabled(false);
		btnDelete.setText("Delete");
		toolkit.adapt(btnDelete, true, true);
		
		m_bindingContext = initDataBindingsCustom();
	}
	
	private void setCheckedElements(Object object, boolean checked){
		
		System.out.println(
				"ContextsListComposite.ContextsListComposite(...).new ICheckStateListener() {...}.checkStateChanged()"
						+ getEnvironment().getActiveContext());
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
		System.out.println(
				"ContextsListComposite.ContextsListComposite(...).new ICheckStateListener() {...}.checkStateChanged()"
						+ getEnvironment().getActiveContext());
		
	}

	/**
	 * Returns the environment that contains the {@link ContextsList}.
	 * 
	 * @return Reference to the environment.
	 */
	private Environment getEnvironment() {
		if (environmentBinder != null && environmentBinder.getValue() != null) {
			return (Environment) environmentBinder.getValue();
		}
		return null;
		// return contextsList == null ? null : contextsList.getEnvironment();
	}

	/**
	 * Binds the {@link ContextsList} with the composite.
	 * 
	 * @param context
	 *            Reference to the list of contexts.
	 */
	/*
	 * public void setContextsList(ContextsList contextsList) {
	 * setContextsList(contextsList, true); }
	 */

	public void setEnvironment(Environment environment) {
		if (environmentBinder == null) {
			environmentBinder = new WritableValue();
		}
		environmentBinder.setValue(environment);
		editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(environment.getContextsList());

	}

	/**
	 * Sets the {@link ContextsList}.
	 * 
	 * @param contextsList
	 *            Reference to the list of context.
	 * @param update
	 *            If true then data bindings are created.
	 */
	/*
	 * private void setContextsList(ContextsList contextsList, boolean update) {
	 * this.contextsList = contextsList; editingDomain =
	 * AdapterFactoryEditingDomain .getEditingDomainFor(contextsList); if
	 * (update) { if (m_bindingContext != null) { m_bindingContext.dispose();
	 * m_bindingContext = null; }
	 * 
	 * if (contextsList != null) { m_bindingContext = initDataBindings(); } } }
	 */

	/**
	 * Use this to prevent Window Pro Builder code analysis to fail with the
	 * complex data bindings code. Invokes
	 * {@link ContextsListComposite#initDataBindingsCustom()}.
	 * 
	 * @return Reference to the data bindings context.
	 * @see ContextsListComposite#initDataBindingsCustom()
	 */
	private DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
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
			environmentBinder = new WritableValue();
		}

		/**
		 * Bind contexts list.
		 */
		IObservableList invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.ENVIRONMENT__CONTEXTS_LIST,
						(EStructuralFeature) ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS))
				.observeDetail(environmentBinder);

		ViewerSupport.bind(contextsListViewer, invocatorFacadeEnvironmentContextsListContextsObserveValue,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Bind contexts list.
		 */
		/*
		 * ViewerSupport.bind(contextsListViewer, EMFObservables.observeList(
		 * contextsList,
		 * ApogyCoreInvocatorPackage.Literals.CONTEXTS_LIST__CONTEXTS),
		 * EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));
		 */

		/**
		 * Set the default selection to the active context if any or the first
		 * item.
		 */
		
		if(environmentBinder.getValue() != null){
			if(getEnvironment().getActiveContext() == null && getContextsList().getContexts().isEmpty()){
				contextsListViewer.setSelection(new StructuredSelection(getContextsList().getContexts().get(0)));
			}
			contextsListViewer.setSelection(new StructuredSelection(getEnvironment().getActiveContext()));
		}
		/*Context defaultSelectedContext = getEnvironment().getActiveContext();
		if (defaultSelectedContext == null && getEnvironment().getContextsList().getContexts().isEmpty()) {
			defaultSelectedContext = getEnvironment().getContextsList().getContexts().get(0);
		}
		contextsListViewer.setSelection(new StructuredSelection(defaultSelectedContext), true);*/

		/**
		 * Listens to selection changed.
		 */
		contextsListViewer.removeSelectionChangedListener(getContextsListViewerSelectionListener());
		contextsListViewer.addSelectionChangedListener(getContextsListViewerSelectionListener());

		return m_bindingContext;
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

	private ContextsList getContextsList() {
		if (environmentBinder == null || environmentBinder.getValue() == null
				|| ((Environment) environmentBinder.getValue()).getContextsList() == null) {
			return null;
		} else {
			return ((Environment) environmentBinder.getValue()).getContextsList();
		}
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

	// private final class ContextsListEditingSupport extends
	// EditingSupport {
	//
	// private ColumnViewer viewer = null;
	//
	// private IBaseLabelProvider labelProvider = new LabelProvider();
	//
	// private IStructuredContentProvider contentProvider = new
	// IStructuredContentProvider() {
	//
	// @Override
	// public void inputChanged(Viewer viewer, Object oldInput,
	// Object newInput) {
	// }
	//
	// @Override
	// public void dispose() {
	// }
	//
	// @Override
	// public Object[] getElements(Object inputElement) {
	// Object[] elements = null;
	// if (inputElement instanceof VariableImplementation) {
	// VariableImplementation variableImplementation = (VariableImplementation)
	// inputElement;
	//
	// if (variableImplementation.getVariable().getVariableType() != null) {
	// EClass interfaceClass = variableImplementation
	// .getVariable().getVariableType()
	// .getInterfaceClass();
	// elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
	// interfaceClass).toArray();
	// }
	// }
	// if (inputElement instanceof TypeMemberImplementation) {
	// TypeMemberImplementation typeMemberImplementation =
	// (TypeMemberImplementation) inputElement;
	//
	// if (typeMemberImplementation.getTypeMember()
	// .getMemberType() != null) {
	// EClass interfaceClass = typeMemberImplementation
	// .getTypeMember().getMemberType()
	// .getInterfaceClass();
	// elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
	// interfaceClass).toArray();
	// }
	// }
	//
	// return elements;
	// }
	// };
	//
	// public ContextsListEditingSupport(ColumnViewer viewer) {
	// super(viewer);
	// this.viewer = viewer;
	// }
	//
	// @Override
	// protected CellEditor getCellEditor(Object element) {
	// ComboBoxViewerCellEditor cellEditor = null;
	// cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
	// .getControl(), SWT.READ_ONLY);
	// cellEditor.setLabelProvider(labelProvider);
	// cellEditor.setContentProvider(contentProvider);
	// cellEditor.setInput(element);
	// return cellEditor;
	// }
	//
	// @Override
	// protected boolean canEdit(Object element) {
	// return true;
	// }
	//
	// @Override
	// protected Object getValue(Object element) {
	// AbstractTypeImplementation implementation = (AbstractTypeImplementation)
	// element;
	// return implementation.getImplementationClass() == null ? null
	// : implementation.getImplementationClass()
	// .getInstanceTypeName();
	// }
	//
	// @Override
	// protected void setValue(Object element, Object value) {
	// EClass eClass = (EClass) value;
	// AbstractTypeImplementation implementation = (AbstractTypeImplementation)
	// element;
	//
	// SetCommand command = new SetCommand(
	// editingDomain,
	// implementation,
	// ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
	// eClass);
	// editingDomain.getCommandStack().execute(command);
	//
	// this.viewer.refresh();
	// }
	// }
	//
	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		getEnvironment().eAdapters().remove(getInvocatorSessionAdapter());
		/*
		 * contextsListViewer TODO: Change listener
		 * .removeSelectionChangedListener(
		 * getContextsListViewerSelectionListener());
		 */
	}
}