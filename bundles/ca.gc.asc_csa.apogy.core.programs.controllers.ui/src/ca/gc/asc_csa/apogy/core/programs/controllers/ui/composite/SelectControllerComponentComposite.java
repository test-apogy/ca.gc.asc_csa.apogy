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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;

public class SelectControllerComponentComposite extends Composite {

	private ISelectionChangedListener selectionChangedListener;
	private ArgumentsList argumentsList;
	
	private Adapter adapter;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public SelectControllerComponentComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});
		setLayout(new GridLayout(2, false));

		TableViewer tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));

		TableViewerColumn tableViewerActionColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnArgument = tableViewerActionColumn.getColumn();
		tblclmnArgument.setWidth(100);
		tblclmnArgument.setText("Argument");
		tableViewerActionColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				if(element instanceof Argument){
					return ((Argument)element).toString();
				}
				return "";
			}
		});

		TableViewerColumn tableViewerParameterColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnControllerComponent = tableViewerParameterColumn.getColumn();
		tblclmnControllerComponent.setAlignment(SWT.CENTER);
		tblclmnControllerComponent.setWidth(100);
		tblclmnControllerComponent.setText("Controller - Component");
		tableViewerParameterColumn.setLabelProvider(new ColumnLabelProvider() {
			@Override
			public String getText(Object element) {
				return "Click here";
			}
		});
		
		DialogCellEditor cellEditor = new DialogCellEditor(this) {
			
			@Override
			protected Object openDialogBox(Control cellEditorWindow) {
				MessageBox dialog = new MessageBox(getShell(), SWT.ICON_QUESTION | SWT.CANCEL);
				dialog.setText("Select component");
				dialog.setMessage("Please activate the desired controller component.");
				return dialog.open();
			}
		};
		
		tableViewer.setCellEditors(new CellEditor[]{null, cellEditor});
	}
	

//	protected void newSelection(ISelection selection) {
//		this.selectedControllerConfiguration = (ControllersConfiguration) selection;
//	}
	
	public void setArgumentsList(ArgumentsList argumentsList) {
		if(this.argumentsList != null){
			argumentsList.eAdapters().remove(getArgumentListAdapter());
		}
		this.argumentsList = argumentsList;
		this.argumentsList.eAdapters().add(getArgumentListAdapter());
	}
	
	private Adapter getArgumentListAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					// TODO
				}
			};
		}
		return adapter;
	}
	
	@Override
	public void dispose() {
		super.dispose();
//		if (selectionChangedListener != null) {
//			controllersConfigsComposite.removeListener(SWT.Selection, (Listener) selectionChangedListener);
//		}
		if(adapter != null){
			argumentsList.eAdapters().remove(getArgumentListAdapter());
		}
	}

}