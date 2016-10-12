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
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
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
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResultsList;

public class DataProductsListsContainerComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private Context context;
	private WritableValue invocatorSessionBinder;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Table tableDataProductsContainer;
	private ObservableListContentProvider listContentProvider;
	private CheckboxTableViewer dataProductsListsContainerViewer;
	
	private ISelectionChangedListener dataProductsListsContainerViewerSelectionListener;

	/**
	 * Returns the {@link Context} list viewer.
	 * 
	 * @return Reference to the viewer.
	 */
	public CheckboxTableViewer getDataProductsListsContainerViewer() {
		return dataProductsListsContainerViewer;
	}

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public DataProductsListsContainerComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL);
		scrolledComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		toolkit.adapt(scrolledComposite);
		toolkit.paintBordersFor(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);

		Composite compositeCheckboxViewer = new Composite(scrolledComposite, SWT.NONE);
		toolkit.adapt(compositeCheckboxViewer);
		toolkit.paintBordersFor(compositeCheckboxViewer);
		compositeCheckboxViewer.setLayout(new GridLayout(1, false));

		dataProductsListsContainerViewer = CheckboxTableViewer.newCheckList(compositeCheckboxViewer,
				SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		dataProductsListsContainerViewer.getTable().setLinesVisible(true);
		dataProductsListsContainerViewer.setCheckStateProvider(new ICheckStateProvider() {
			@Override
			public boolean isGrayed(Object element) {
				return false;
			}

			@Override
			public boolean isChecked(Object element) {
				/**
				 * Unchecks the Data Products Lists not selected
				 */
				boolean checked = false;
				if (element instanceof DataProductsList) {
					if (getContext() != null && getContext().getDataProductsList() != null) {
						checked = getContext().getDataProductsList() == element;
					}
				}
				return checked;
			}
		});
		dataProductsListsContainerViewer.addDoubleClickListener(new IDoubleClickListener() {
			@Override
			public void doubleClick(DoubleClickEvent event) {
				Object element = ((IStructuredSelection) event.getSelection()).getFirstElement();
				if (dataProductsListsContainerViewer.getChecked(element)) {
					dataProductsListsContainerViewer.setChecked(element, false);
					setCheckedElements(element, false);
				} else {
					System.out.println(
							"ContextsListComposite.ContextsListComposite(...).new IDoubleClickListener() {...}.doubleClick()");
					dataProductsListsContainerViewer.setChecked(element, true);
					setCheckedElements(element, true);
				}
			}
		});
		dataProductsListsContainerViewer.addCheckStateListener(new ICheckStateListener() {
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
		dataProductsListsContainerViewer.setContentProvider(listContentProvider);

		tableDataProductsContainer = dataProductsListsContainerViewer.getTable();
		tableDataProductsContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tableDataProductsContainer.setSize(83, 83);
		toolkit.paintBordersFor(tableDataProductsContainer);
		scrolledComposite.setContent(compositeCheckboxViewer);
		scrolledComposite.setMinSize(compositeCheckboxViewer.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		/**
		 * Listener that checks the element if double clicked
		 */
					

		

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		toolkit.adapt(composite);
		toolkit.paintBordersFor(composite);
		composite.setLayout(new GridLayout(1, false));

		Button btnNew = new Button(composite, SWT.NONE);
		/**
		 * Creates a Data Products List if the button is pressed
		 */
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println(
						"DataProductsListsContainerComposite.DataProductsListsContainerComposite(...).new SelectionAdapter() {...}.widgetSelected()");
				DataProductsList productList = ApogyCoreInvocatorFactory.eINSTANCE.createDataProductsList();
				productList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(
						getInvocatorSession().getDataProductsListContainer(),
						ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST));

				OperationCallResultsList operationCallResultsList = ApogyCoreInvocatorFactory.eINSTANCE
						.createOperationCallResultsList();
				operationCallResultsList.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(operationCallResultsList,
						ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LIST__OPERATION_CALL_RESULTS_LIST));

				productList.setOperationCallResultsList(operationCallResultsList);
			}
		});
		btnNew.setText("New");
		toolkit.adapt(btnNew, true, true);

		m_bindingContext = initDataBindingsCustom();
	}

	private void setCheckedElements(Object object, boolean checked) {	
		if (checked) {
			
			getContext().setDataProductsList((DataProductsList) object);

			Object[] checkedElements = dataProductsListsContainerViewer.getCheckedElements();
			for (int i = 0; i < checkedElements.length; i++) {
				if (checkedElements[i] == object) {
					Object[] checkedElement = { object };
					dataProductsListsContainerViewer.setCheckedElements(checkedElement);
					break;
				}
			}
		} else {
			getContext().setDataProductsList(null);
		}
	}
	
	/**
	 * Returns the {@link Context} that is manipulated by this composite.
	 * 
	 * @return Reference to the context.
	 */
	public Context getContext(){
		return context;
	}
	
	/**
	 * Binds the {@link Context} with the composite.
	 * 
	 * @param context
	 *            Reference to the context.
	 */
	public void setContext(Context context){
		this.context = context;
	}
	
	/**
	 * Returns the {@link InvocatorSession} that contains the {@link DataProductsListsContainer}.
	 * 
	 * @return Reference to the InvocatorSession.
	 */
	public InvocatorSession getInvocatorSession(){
		if(invocatorSessionBinder != null && invocatorSessionBinder.getValue() != null){
			return (InvocatorSession) invocatorSessionBinder.getValue();
		}
		return null;
	}
	
	/**
	 * Binds the {@link InvocatorSession} with the composite.
	 * 
	 * @param invocatorSession
	 *            Reference to the invocator session.
	 */
	public void setInvocatorSession(InvocatorSession invocatorSession){
		this.invocatorSessionBinder.setValue(invocatorSession);
	}
	
	/**
	 * Returns the {@link DataProductsListsContainer}.
	 * 
	 * @return Reference to the DataProductsListsContainer.
	 */
	public DataProductsListsContainer getDataProductsListsContainer(){
		if (getInvocatorSession() != null && getInvocatorSession().getDataProductsListContainer() != null){
			return getInvocatorSession().getDataProductsListContainer() ;
		}
		return null;
	}

	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext m_bindingContext = new DataBindingContext();

		if (invocatorSessionBinder == null) {
			invocatorSessionBinder = new WritableValue();
		}

		/**
		 * Bind data products list.
		 */
		IObservableList invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER,
						ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST))
				.observeDetail(invocatorSessionBinder);

		ViewerSupport.bind(dataProductsListsContainerViewer, invocatorFacadeEnvironmentContextsListContextsObserveValue,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));

		/**
		 * Listens to selection changed.
		 */
		dataProductsListsContainerViewer.removeSelectionChangedListener(getDataProductsListsContainerViewerSelectionListener());
		dataProductsListsContainerViewer.addSelectionChangedListener(getDataProductsListsContainerViewerSelectionListener());
		
		/**
		 * TODO : AutoSelect first
		 */

		return m_bindingContext;
	}

	private ISelectionChangedListener getDataProductsListsContainerViewerSelectionListener() {
		if (dataProductsListsContainerViewerSelectionListener == null) {
			dataProductsListsContainerViewerSelectionListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return dataProductsListsContainerViewerSelectionListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}
}