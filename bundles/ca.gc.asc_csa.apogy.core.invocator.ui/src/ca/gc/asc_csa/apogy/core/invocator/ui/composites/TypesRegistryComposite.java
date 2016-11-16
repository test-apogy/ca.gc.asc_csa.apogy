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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypesRegistry;

public class TypesRegistryComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private TableViewer viewer;
	private WritableValue<TypesRegistry> typesRegistryBinder = new WritableValue<>();
	
	public TypesRegistryComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, false));

		viewer = new TableViewer(this, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION | SWT.V_SCROLL);
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		table.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});
			
		TableViewerColumn tableViewerColumnItem_Name = new TableViewerColumn(viewer, SWT.NONE);		
		TableColumn trclmnName = tableViewerColumnItem_Name.getColumn();
		trclmnName.setText("Name");
		trclmnName.setWidth(150);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(viewer, SWT.NONE);
		TableColumn tblclmnType = tableViewerColumn.getColumn();
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");
		
		m_bindingContext = customInitDataBindings();
	}
	
	/**
	 * This method is invoked a when a new selection is selected.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link Type}.
	 * 
	 * @return Reference to the list of {@link Type}.
	 */
	public Type getSelectedType() {		
		return (Type) (((IStructuredSelection)viewer.getSelection()).getFirstElement());
	}

	protected DataBindingContext customInitDataBindings() {
		
		DataBindingContext bindingContext = new DataBindingContext();
		
		/*
		 * Bind variables list.
		 */
		@SuppressWarnings("unchecked")
		IObservableList<?> typesListObserveList = EMFProperties
				.list(ApogyCoreInvocatorPackage.Literals.TYPES_REGISTRY__TYPES)
				.observeDetail(typesRegistryBinder);

		ViewerSupport.bind(viewer, typesListObserveList,
				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME), EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION));
	
		typesRegistryBinder.setValue(TypesRegistry.INSTANCE);
		
		return bindingContext;
	}
		
	@Override
	public void dispose() {		
		m_bindingContext.dispose();
		super.dispose();
	}
}