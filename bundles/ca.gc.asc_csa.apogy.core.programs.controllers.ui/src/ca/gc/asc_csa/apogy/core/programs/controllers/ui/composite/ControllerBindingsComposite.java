package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;
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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.edit.EMFEcoreInvocatorEditUtilities;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

public class ControllerBindingsComposite extends Composite {

	private ISelectionChangedListener selectionChangedListener;
	
	private ControllersConfiguration controllersConfiguration;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ControllerBindingsComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});
		setLayout(new GridLayout(2, false));
		
		TreeViewer treeViewer = new TreeViewer(this, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnName = treeViewerColumnName.getColumn();
		trclmnNewColumnName.setWidth(100);
		trclmnNewColumnName.setText("Name");
		
		TreeViewerColumn treeViewerColumnParameters = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnParameters = treeViewerColumnParameters.getColumn();
		trclmnNewColumnParameters.setWidth(100);
		trclmnNewColumnParameters.setText("Parameters");
		
		TreeViewerColumn treeViewerColumnControllerBinding = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnControllerBinding = treeViewerColumnControllerBinding.getColumn();
		trclmnNewColumnControllerBinding.setWidth(100);
		trclmnNewColumnControllerBinding.setText("Controller Binding");
		
		TreeViewerColumn treeViewerColumnType = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnType = treeViewerColumnType.getColumn();
		trclmnNewColumnType.setWidth(100);
		trclmnNewColumnType.setText("Type");		
		
		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				System.out.println(
						"ControllerBindingsComposite.ControllerBindingsComposite(...).new Listener() {...}.handleEvent()" + controllersConfiguration);}
		});
		
		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		
		Button btnEdit = new Button(this, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnEdit.setText("Edit");
		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
	
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (selectionChangedListener == null) {
			selectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return selectionChangedListener;
	}

	protected void newSelection(ISelection selection) {
	}
	
	public void setControllersConfiguration(ControllersConfiguration controllersConfiguration) {
		this.controllersConfiguration = controllersConfiguration;
	}
	
	/**
	 * Label provider for the TreeViewer
	 */
	private class VariableImplementationLabelProvider extends
			AdapterFactoryLabelProvider implements ITableLabelProvider{

		public VariableImplementationLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int FEATURE_COLUMN_ID = 0;
		private static final int INTERFACE_COLUMN_ID = 1;
		private static final int IMPLEMENTATION_COLUMN_ID = 2;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case FEATURE_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getName((AbstractTypeImplementation) object);
				break;
			case INTERFACE_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getInterfaceName((AbstractTypeImplementation) object, false);
				break;

			case IMPLEMENTATION_COLUMN_ID:
				str = EMFEcoreInvocatorEditUtilities.getImplementationName((AbstractTypeImplementation) object, false);
				break;

			default:
				break;
			}

			return str;
		}
	}	
	
	/**
	 * Content provider for the TreeViewer
	 */
	private class VariableImplementationContentProvider implements
			ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean hasChildren(Object element) {
			return (!((AbstractTypeImplementation) element)
					.getTypeMemberImplementations().isEmpty());
		}

		@Override
		public Object getParent(Object element) {
			/** Not used. */
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return null; //TODO: Get elements
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation) parentElement;
			return abstractTypeImplementation.getTypeMemberImplementations()
					.toArray();
		}
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}