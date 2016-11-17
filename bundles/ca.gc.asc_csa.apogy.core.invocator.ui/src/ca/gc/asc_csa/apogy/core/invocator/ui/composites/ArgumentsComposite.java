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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.ControlListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

public class ArgumentsComposite extends Composite {

	private TreeViewer treeViewer;
	private TreeViewerColumn treeViewerParameterColumn;

	private TextCellEditor cellEditor;
	private boolean readOnly;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);



	/**
	 * Create the composite.
	 * 
	 * @param parent
	 *            Reference to the parent composite.
	 * @param style
	 *            Composite style.
	 */
	public ArgumentsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		Tree treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeInstance.setLinesVisible(true);
		treeInstance.setHeaderVisible(true);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
		treeclmnAction.setWidth(100);
		treeclmnAction.setText("Parameter");

		treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
		treeclmnParameter.setWidth(100);
		treeclmnParameter.setText("Value");

		// To set width of the column to tree width
		treeViewer.getControl().addControlListener(new ControlListener() {
			@Override
			public void controlResized(ControlEvent e) {
				treeViewerParameterColumn.getColumn().setWidth(((Tree) e.getSource()).getBounds().width);
			}

			@Override
			public void controlMoved(ControlEvent e) {
			}
		});

		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory) {
		});
		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);
		
		readOnly = false;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	protected void setReadOnly(boolean readOnly) {
		if (this.readOnly != readOnly) {
			this.readOnly = readOnly;
			if (!readOnly) {
				cellEditor = new TextCellEditor(treeViewer.getTree());

				treeViewerParameterColumn.setEditingSupport(new EditingSupport(treeViewer) {
					@Override
					protected void setValue(Object element, Object value) {
						EDataTypeArgument elementArgument = (EDataTypeArgument) element;

						// FIXME Move to core + UI facade
						EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(elementArgument);

						/** Use the command stack. */
						SetCommand command = new SetCommand(editingDomain, elementArgument,
								ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE, value);
						editingDomain.getCommandStack().execute(command);
						treeViewer.update(element, null);
					}

					@Override
					protected Object getValue(Object element) {
						return ((EDataTypeArgument) element).getValue();
					}

					@Override
					protected TextCellEditor getCellEditor(Object element) {
						return cellEditor;
					}

					@Override
					protected boolean canEdit(Object element) {
						if (element instanceof EDataTypeArgument) {
							return true;
						}
						return false;
					}
				});
			} else {
				cellEditor = null;
			}
		}

	}

	protected boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * Returns the reference to the {@link ArgumentsList}.
	 * 
	 * @return Reference to the {@link ArgumentsList}.
	 */
	public ArgumentsList getArgumentsList() {
		return (ArgumentsList) treeViewer.getInput();
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setArgumentsList(ArgumentsList argumentsList) {
		initDataBindingsCustom(argumentsList);
	}

	/**
	 * Custom implementation of data bindings. Use this pattern to prevent
	 * Window Pro builder to override the code.
	 * 
	 * @return Reference to the data bindings.
	 */
	protected void initDataBindingsCustom(ArgumentsList argumentsList) {
		treeViewer.setInput(argumentsList);
		for (TreeColumn column : treeViewer.getTree().getColumns()) {
			column.pack();
		}
	}

	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider {

		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_ID = 1;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				str = getText(object);
				if (str.contains("(")) {
					str = str.substring(0, str.indexOf("("));
				}
				break;
			case VALUE_ID:
				if (object instanceof EDataTypeArgument) {
					str = ((EDataTypeArgument) object).getValue();
				} else {
					str = object.getClass().getName();
				}
				break;
			default:
				break;
			}

			return str;
		}
	}

	public EObject getSelectedEObject() {
		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
	}

	@Override
	public void dispose() {
		adapterFactory.dispose();
		super.dispose();
	}

}