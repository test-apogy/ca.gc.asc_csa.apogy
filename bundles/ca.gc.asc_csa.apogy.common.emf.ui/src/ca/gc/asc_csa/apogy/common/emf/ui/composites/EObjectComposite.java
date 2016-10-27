package ca.gc.asc_csa.apogy.common.emf.ui.composites;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.window.ToolTip;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import org.eclipse.ui.forms.widgets.FormToolkit;

public class EObjectComposite extends Composite {
	private DataBindingContext m_bindingContext;

	private FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	private TreeViewer instanceViewer;

	private ISelectionChangedListener selectionChangedListener;

	private EObject eObject;

	public EObjectComposite(Composite parent, int style,
			EObject eObject) {
		this(parent, style);
	}

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public EObjectComposite(Composite parent, int style) {
		super(parent, SWT.NONE);

		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				toolkit.dispose();
			}
		});

		toolkit.adapt(this);
		toolkit.paintBordersFor(this);
		setLayout(new GridLayout(1, true));
	
		instanceViewer = new TreeViewer(this, SWT.BORDER
				| SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);

		ColumnViewerToolTipSupport.enableFor(instanceViewer,
				ToolTip.NO_RECREATE);
		Tree treeInstance = instanceViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeInstance.setLinesVisible(true);
		toolkit.paintBordersFor(treeInstance);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		instanceViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		instanceViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
		
		instanceViewer.addSelectionChangedListener(getSelectionChangedListener());
		instanceViewer.addDoubleClickListener(new IDoubleClickListener() {
			
			@Override
			public void doubleClick(DoubleClickEvent event) {
					IStructuredSelection selection = (IStructuredSelection) event.getSelection();		
					Object selectedObject = selection.getFirstElement();
					if(instanceViewer.getExpandedState(selectedObject)){
						instanceViewer.collapseToLevel(selectedObject, AbstractTreeViewer.ALL_LEVELS);
					}else{
						instanceViewer.expandToLevel(selectedObject, 1);
					}
			}
		});
	}

	/**
	 * Binds the {@link EObject} with the composite.
	 * 
	 * @param eObject Reference to the list of eObject.
	 */
	public void setEObject(EObject eObject) {
		setEObject(eObject, true);
	}

	/**
	 * Sets the {@link EObject}.
	 * 
	 * @param eObject
	 *            Reference to the EObject.
	 * @param update
	 *            If true then data bindings are created.
	 */
	private void setEObject(EObject eObject, boolean update) {
		this.eObject = eObject;
		if (update) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
				m_bindingContext = null;
			}

			if (eObject != null) {
				m_bindingContext = initDataBindings();
			}
		}
	}

	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}	
	
	/**
	 * Creates and returns the data bindings.
	 * 
	 * @return Reference to the data bindings.
	 */
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();
		EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
		eObjectReference.setEObject(eObject);
		instanceViewer.setInput(eObjectReference);						
		return bindingContext;
	}

	@Override
	public void dispose() {
		super.dispose();
		toolkit.dispose();
		instanceViewer.removeSelectionChangedListener(getSelectionChangedListener());
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
	}

	/**
	 * Listener used to listen {{@link #instanceViewer} selection changes.
 	 * @return Reference to the listener (Lazy Loaded).
	 */
	private ISelectionChangedListener getSelectionChangedListener() {
		if (selectionChangedListener == null){
			selectionChangedListener = new ISelectionChangedListener() {				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}		
		return selectionChangedListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}
	
	/**
	 * Returns the selected {@link EObject}.
	 * 
	 * @return Reference to the {@link EObject}.
	 */
	public EObject getSelectedEObject() {
		IStructuredSelection selection = (IStructuredSelection) instanceViewer.getSelection();
		return (EObject) selection.getFirstElement();
	}
}