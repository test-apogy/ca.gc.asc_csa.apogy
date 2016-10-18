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
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Table;
import org.eclipse.ui.forms.widgets.FormToolkit;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;

public class DataProductsListsContainerComposite extends Composite {
	
	private DataBindingContext m_bindingContext;

	private WritableValue contextBinder;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private Table tableDataProductsContainer;
	private ObservableListContentProvider listContentProvider;
	private TableViewer dataProductsListsContainerViewer;

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
		
		dataProductsListsContainerViewer = new TableViewer(compositeCheckboxViewer);
		dataProductsListsContainerViewer.getTable().setLinesVisible(true);
		
		listContentProvider = new ObservableListContentProvider(){
			@Override
			public Object[] getElements(Object inputElement) {
				// TODO Auto-generated method stub
				return super.getElements(inputElement);
			}
		};
		dataProductsListsContainerViewer.setContentProvider(listContentProvider);
		
		tableDataProductsContainer = dataProductsListsContainerViewer.getTable();
		tableDataProductsContainer.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tableDataProductsContainer.setSize(83, 83);
		toolkit.paintBordersFor(tableDataProductsContainer);
		scrolledComposite.setContent(compositeCheckboxViewer);
		scrolledComposite.setMinSize(compositeCheckboxViewer.computeSize(SWT.DEFAULT, SWT.DEFAULT));					

		m_bindingContext = initDataBindingsCustom();
	}
	
	/**
	 * Returns the {@link Context} that is manipulated by this composite.
	 * 
	 * @return Reference to the context.
	 */
	public Context getContext(){
		if(contextBinder != null){
			return (Context) contextBinder.getValue();
		}
		return null;
	}
	
	/**
	 * Binds the {@link Context} with the composite.
	 * Detail
	 * @param context
	 *            Reference to the context.
	 */
	public void setContext(Context context){
		if(context != null && context.getDataProductsList() == null){
			context.setDataProductsList((DataProductsList) dataProductsListsContainerViewer.getElementAt(0));
		}
		
		if(contextBinder == null){
			contextBinder = new WritableValue();
		}
		contextBinder.setValue(context);
	}	
		
	/**
	 * Creates and returns the data bindings context that takes care of the
	 * Contexts List Viewer.
	 * 
	 * @return Reference to the data bindings context.
	 */
	private DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();
		
		if (contextBinder == null) {
			contextBinder = new WritableValue();
		}

		
		/**
		 * Bind data products list.
		 */		
		IObservableList invocatorFacadeEnvironmentContextsListContextsObserveValue = EMFProperties
				.list(FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER,
						ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST))
				.observe(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		
		ViewerSupport.bind(dataProductsListsContainerViewer, invocatorFacadeEnvironmentContextsListContextsObserveValue,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));
		
		/**
		 * Bind the selection to the context's data products list
		 */
		IObservableValue observeDataProductsListsContainerViewerSingleSelection = ViewerProperties.singleSelection().observe(dataProductsListsContainerViewer);
		IObservableValue observeContextDataProductListObserveValue = EMFProperties.value(ApogyCoreInvocatorPackage.Literals.CONTEXT__DATA_PRODUCTS_LIST).observeDetail(contextBinder);
		
		m_bindingContext.bindValue(observeDataProductsListsContainerViewerSingleSelection, observeContextDataProductListObserveValue);	

		return m_bindingContext;
	}
}