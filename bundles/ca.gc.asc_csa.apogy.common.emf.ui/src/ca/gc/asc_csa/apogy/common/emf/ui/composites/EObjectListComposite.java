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
 *     Olivier L. Larouche (Olivier.LLarouche@canad.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.AbstractTreeViewer;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

public class EObjectListComposite extends Composite {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private EList<EObject> eObjectsList;

	private TreeViewer treeViewerEObjectsList;
	private ISelectionChangedListener treeViewerSelectionChangedListener;

	public EObjectListComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		setLayout(gridLayout);

		Label lblEObjectTypeName = new Label(this, SWT.NONE);
		lblEObjectTypeName.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblEObjectTypeName.setText(getTitle());

		treeViewerEObjectsList = new TreeViewer(this, SWT.BORDER);
		Tree treeEObjectsList = treeViewerEObjectsList.getTree();
		treeEObjectsList.setLinesVisible(true);
		treeEObjectsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeEObjectsList.setHeaderVisible(false);
		ColumnViewerToolTipSupport.enableFor(treeViewerEObjectsList);
		treeViewerEObjectsList.addSelectionChangedListener(getTreeViewerSelectionChangedListener());

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewerEObjectsList, SWT.NONE);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setWidth(200);

		treeViewerEObjectsList.setContentProvider(new EObjectContentProvider(adapterFactory));
		treeViewerEObjectsList.setLabelProvider(getLabelProvider());
	}
	
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null) {
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					EObjectListComposite.this.newSelection((TreeSelection) event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}


	public EObject getSelectedEObject() {
		IStructuredSelection selection = (IStructuredSelection) treeViewerEObjectsList.getSelection();
		return (EObject) selection.getFirstElement();
	}
	
	public void setSelectedEObject(EObject eObject){
		if(eObjectsList.contains(eObject));
		treeViewerEObjectsList.setSelection((IStructuredSelection) eObject);
	}

	protected StyledCellLabelProvider getLabelProvider(){
		return new EObjectEClassNameLabelProvider();
	}
	
	protected String getTitle(){
		return "EObject";
	}
	
	/**
	 * Label provider for the treeViewer
	 */
	private class EObjectEClassNameLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof EObject) {
				cell.setText(((EObject) cell.getElement()).eClass().getName());
			}
		}

		@Override
		public String getToolTipText(Object element) {
			if (element instanceof EObject) {
				return ((EObject) element).eClass().getName();
			}
			return super.getToolTipText(element);
		}

		@Override
		public Point getToolTipShift(Object object) {
			return new Point(5, 5);
		}

		@Override
		public int getToolTipDisplayDelayTime(Object object) {
			return 500;
		}

		@Override
		public int getToolTipTimeDisplayed(Object object) {
			return 5000;
		}

	}

	/**
	 * Content provider for the treeViewer
	 */
	private class EObjectContentProvider extends AdapterFactoryContentProvider {

		public EObjectContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (eObjectsList != null) {
				return eObjectsList.toArray();
			}
			Object[] objects = new Object[0];
			return objects;
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
		}
	}

	/**
	 * Sets the eClasses List to displays it's content
	 * 
	 * @param eObjectsList
	 *            reference to the {@link EList<EObject>}
	 */
	public void setEObjectsList(EList<EObject> eObjectsList) {
		this.eObjectsList = eObjectsList;

		if (eObjectsList != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	public EList<EObject> getEObjectsList() {
		return this.eObjectsList;
	}


	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (eObjectsList != null) {
			if (!treeViewerEObjectsList.getTree().isDisposed()) {
				treeViewerEObjectsList.setInput(eObjectsList);
				
				if (treeViewerEObjectsList.getTree().getItemCount() > 0){
						TreePath treePath = new TreePath(new Object[]{eObjectsList.get(0)});		
						ITreeSelection defaultElementSelected = new TreeSelection(treePath);
						treeViewerEObjectsList.setSelection(defaultElementSelected, true);
					}
				
				
//				if (treeViewerEObjectsList.getTree().getItemCount() > 0) {
//					TreePath featuresTreePath = new TreePath(treeViewerEObjectsList.getTree().getItems());//new TreePath(treeViewerEObjectsList.getTree().getItems()[0]);
//					treeViewerEObjectsList.setSelection(new TreeSelection(featuresTreePath));
//							//treeViewerEObjectsList.getTree().getItems()[0]));
//							//defaultSelectedContext(ISelection) treeViewerEObjectsList.getTree().getItems()[0]);
//					System.out.println("EObjectListComposite.initDataBindingsCustom()");
//				}

			}
		}

		return bindingContext;
	}
}