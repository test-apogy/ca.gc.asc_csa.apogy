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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EParameter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.ui.forms.widgets.FormToolkit;


public class EOperationsComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private org.eclipse.emf.ecore.EClass eClass;
	private Tree tree;
	private TreeViewer treeViewer;
	private ISelectionChangedListener treeViewerSelectionChangedListener;
	private boolean parametersVisible = false;
	private EOperation defaultSelectedEOperation;
	private final FormToolkit toolkit = new FormToolkit(Display.getCurrent());

	
	public EOperationsComposite(Composite parent, int style) {
		super(parent, SWT.NONE);
		setLayout(new FillLayout());
		
		treeViewer = new TreeViewer(this, SWT.BORDER);
		tree = treeViewer.getTree();		
		tree.setLinesVisible(true);
		
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);		
		treeViewer.setContentProvider(getContentProvider());
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));
	}
	
	/**
	 * Sets the visibility of the parameters.  By default they are not shown.
	 * @param visible True means the parameters will be displayed as children under expanded operations.
	 */
	public void showParameters(boolean visible){
		this.parametersVisible  = visible;
	}
	
	@Override
	public void dispose() {
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}		
		toolkit.dispose();
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
		super.dispose();		
	}
	
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null){
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					EOperationsComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}

	/** 
	 * This method is called when a new selection is made in the parentComposite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection){		
	}	
	
	/**
	 * Returns the selected {@link EOperation}.
	 * @return Reference to the {@link EOperation}.
	 */
	public EOperation getSelectedEOperation(){
		return (EOperation) ((TreeSelection)treeViewer.getSelection()).getFirstElement();
	}

	public EClass getEClass() {
		return eClass;
	}

	/**
	 * Sets the {@link EClass} that contains the list of {@link EOperation}.  This method invokes {@link #setEClass(EClass, EOperation)} 
	 * and sets the default selected {@link EOperation} to null.  
	 * @param newEClass Reference to the {@link EClass} that contains the list of {@link EOperation}.
	 */	
	public void setEClass(EClass newEClass) {
		setEClass(newEClass, null);
	}

	/**
	 * Sets the {@link EClass} that contains the list of {@link EOperation}.  The Viewer sets the default selection to the 
	 * specified defaultEOperation.  
	 * @param newEClass Reference to the {@link EClass} that contains the list of {@link EOperation}.
	 * @param defaultEOperation Reference to the {@link EOperation} to be selected by default.
	 */
	public void setEClass(EClass newEClass, EOperation defaultEOperation) {
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());	
		
		eClass = newEClass;
		defaultSelectedEOperation = defaultEOperation;
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		m_bindingContext = initDataBindings();
		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
	
	protected DataBindingContext initDataBindings(){
		return initDataBindingsCustom();
	}
	
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		treeViewer.setInput(getEClass());
			
		
		if (defaultSelectedEOperation != null) {
			try {
				TreeSelection treeSelection = new TreeSelection(new TreePath(new EOperation[]{defaultSelectedEOperation}));
				treeViewer.setSelection(treeSelection, true);
			} catch (Throwable t) {
				t.printStackTrace();
			}
		}		
		
		return bindingContext;
	}	
	
	private ITreeContentProvider getContentProvider()
	{
		ITreeContentProvider provider = new ITreeContentProvider() 
		{
			@Override
			public void dispose() {
			}
			
			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}
			
			@Override
			public Object[] getElements(Object inputElement) 
			{				
				if(inputElement instanceof EClass)
				{
					EClass eclass = (EClass) inputElement;					
					List<EOperation> eOperations = new ArrayList<EOperation>();
					eOperations.addAll(eclass.getEOperations());
					
					// Explores all super Classes.
					List<EClass> superClasses = eclass.getEAllSuperTypes();
					for(EClass superEClass : superClasses)
					{
						eOperations.addAll(superEClass.getEOperations());
					}
				
					return eOperations.toArray();
				}
				return null;
			}

			@Override
			public Object[] getChildren(Object parentElement) 
			{
				if(parentElement instanceof EClass)
				{
					EClass eclass = (EClass) parentElement;					
					List<EOperation> eOperations = new ArrayList<EOperation>();
					eOperations.addAll(eclass.getEOperations());
					
					// Explores all super Classes.
					List<EClass> superClasses = eclass.getEAllSuperTypes();
					for(EClass superEClass : superClasses)
					{
						eOperations.addAll(superEClass.getEOperations());
					}
				
					return eOperations.toArray();
				}
				else if(parametersVisible && parentElement instanceof EOperation)
				{
					EOperation eOperation = (EOperation) parentElement;
					return eOperation.getEParameters().toArray();
				}
				return null;
			}

			@Override
			public Object getParent(Object element) 
			{
				if(element instanceof EClass)
				{
					return null;
				}
				else if (element instanceof EOperation)
				{
					EOperation eOperation = (EOperation) element;
					return eOperation.eContainer();
				}
				else if(element instanceof EParameter)
				{
					EParameter eParameter = (EParameter) element;
					return eParameter.eContainer();
				}
				return null;
			}

			@Override
			public boolean hasChildren(Object element) 
			{
				if(element instanceof EClass)
				{
					EClass eClass = (EClass) element;
					return eClass.getEOperations().size() > 0;
				}
				else if (parametersVisible && element instanceof EOperation)
				{
					EOperation eOperation = (EOperation) element;
					return eOperation.getEParameters().size() > 0;
				}
				else
				{
					return false;
				}
			}
		};		
		return provider;
	}	
}