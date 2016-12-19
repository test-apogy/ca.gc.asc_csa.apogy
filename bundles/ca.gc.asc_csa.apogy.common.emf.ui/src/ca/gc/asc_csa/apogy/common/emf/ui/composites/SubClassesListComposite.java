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

import java.util.Comparator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;

public class SubClassesListComposite extends Composite implements ISelectionProvider {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private EClass eClass;

	private TreeViewer treeViewerSubClasses;
	private ISelectionChangedListener treeViewerSelectionChangedListener;

	public SubClassesListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());

		treeViewerSubClasses = new TreeViewer(this, SWT.BORDER);
		Tree treeTypes = treeViewerSubClasses.getTree();
		treeTypes.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(treeViewerSubClasses);

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewerSubClasses, SWT.NONE);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setWidth(100);

		treeViewerSubClasses.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection((TreeSelection)event.getSelection());
			}
		});
		treeViewerSubClasses.setContentProvider(getContentProvider());
		treeViewerSubClasses.setLabelProvider(getLabelProvider());
	}

	/**
	 * Method that can be overwritten to specify a label provider
	 */
	protected StyledCellLabelProvider getLabelProvider(){
		return new TypesLabelProvider();
	}
	
	/**
	 * Method that can be overwritten to specify a content provider
	 */
	protected AdapterFactoryContentProvider getContentProvider() {
		return new typeContentProvider(adapterFactory);
	}
	/**
	 * Label provider for the treeViewer
	 */
	private class TypesLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof EClass) {
				cell.setText(((EClass) cell.getElement()).getName());
			}
		}

		@Override
		public String getToolTipText(Object element) {
			if (element instanceof EClass) {
				return ((EClass) element).getInstanceClassName();
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
	private class typeContentProvider extends AdapterFactoryContentProvider {

		public typeContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (eClass != null) {
				List<EClass> subClasses = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(eClass);
				subClasses.sort(new Comparator<EClass>() {
					@Override
					public int compare(EClass arg0, EClass arg1) {
						return String.CASE_INSENSITIVE_ORDER.compare(arg0.getName(), arg1.getName());
					}
				});
				return subClasses.toArray();
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
	 * Sets the superClass to displays it's subClasses
	 * @param superClass reference to the {@link EClass}
	 */
	public void setSuperClass(EClass superClass) {
		this.eClass = superClass;

		if (superClass != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	public void setSelectedEClass(EClass eClass){
		for (TreeItem item : treeViewerSubClasses.getTree().getItems()) {
			if (item == eClass) {
				treeViewerSubClasses.setSelection(new StructuredSelection(eClass));
			}
		}
	}

	public EClass getSuperClass() {
		return this.eClass;
	}
	
	public EClass getSelectedSubClass(){
		return (EClass) treeViewerSubClasses.getStructuredSelection().getFirstElement();
	}

	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}

	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (eClass != null) {
			if (!treeViewerSubClasses.getTree().isDisposed()) {
				treeViewerSubClasses.setInput(eClass);
			}
		}
		return bindingContext;
	}

	/**
	 * Selection provider methods
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewerSelectionChangedListener = listener;
		treeViewerSubClasses.addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		return treeViewerSubClasses.getSelection();
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewerSubClasses.removeSelectionChangedListener(treeViewerSelectionChangedListener);
	}

	@Override
	public void setSelection(ISelection selection) {
		eClass = (EClass) selection;
	}
	
	public void refresh(){
		treeViewerSubClasses.refresh();
	}
}