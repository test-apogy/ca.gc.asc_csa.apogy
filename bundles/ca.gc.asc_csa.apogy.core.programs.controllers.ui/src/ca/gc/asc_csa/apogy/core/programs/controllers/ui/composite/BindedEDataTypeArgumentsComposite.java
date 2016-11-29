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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EClassArgument;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.EEnumArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

public class BindedEDataTypeArgumentsComposite extends Composite {

	private TreeViewer treeViewer;
	private Tree treeInstance;
	private TreeViewerColumn treeViewerParameterColumn;

	private Composite compositeArguments;

	boolean readOnly;

	private OperationCall operationCall;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter argumentsListAdapter;

	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public BindedEDataTypeArgumentsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());

		this.readOnly = true;

		compositeArguments = new Composite(this, SWT.None);
		compositeArguments.setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(compositeArguments,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		treeInstance = treeViewer.getTree();
		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2));
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
		treeViewerParameterColumn.setEditingSupport(new ArgumentsEditor(treeViewer));

		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);
		m_bindingContext = initDataBindingsCustom();
	}

	/**
	 * EditingSupport for the Arguments table. Depending on the type of
	 * argument, the editingSupport is different.
	 */
	private class ArgumentsEditor extends EditingSupport {

		public ArgumentsEditor(ColumnViewer viewer) {
			super(viewer);
		}

		@Override
		protected void setValue(Object element, Object value) {
			if (element instanceof BindedEDataTypeArgument) {
				// TODO
			}
		}

		@Override
		protected Object getValue(Object element) {
			if (element instanceof BindedEDataTypeArgument) {
				// TODO
			}
			return null;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			if (element instanceof BindedEDataTypeArgument) {
				return new DialogCellEditor() {
					@Override
					protected Object openDialogBox(Control cellEditorWindow) {
						// TODO Auto-generated method stub
						return null;
					}
				};
			}
			return null;

		}

		@Override
		protected boolean canEdit(Object element) {
			if (element instanceof BindedEDataTypeArgument) {
				return true;
			}
			return false;
		}
	}

	/**
	 * This method is called when a new selection is made in the
	 * parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}

	public boolean isReadOnly() {
		return readOnly;
	}

	public EObject getSelectedEObject() {
		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
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
	 * Gets the {@link EList} of {@link Argument} in the {@link ArgumentsList}.
	 * 
	 * @return List of {@link Argument}.
	 */
	public EList<Argument> getArguments() {
		return operationCall.getArgumentsList().getArguments();
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setOperationCall(OperationCall operationCall) {
		if (this.operationCall != null) {
			this.operationCall.eAdapters().remove(getArgumentsListAdapter());
		}
		this.operationCall = operationCall;

		if (this.operationCall.getArgumentsList() != null) {
			EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
			eObjectReference.setEObject(operationCall);
			
			treeViewer.setInput(eObjectReference);
			treeViewer.expandAll();
			// Adjust columns
			for (TreeColumn column : treeViewer.getTree().getColumns()) {
				column.pack();
			}
		} else {
			treeViewer.setInput(null);
		}

		this.operationCall.eAdapters().add(getArgumentsListAdapter());
	}

	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

		treeViewer.setContentProvider(new ArgumentsContentProvier(adapterFactory));
		treeViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));

		return m_bindingContext;
	}

	/**
	 * Content provider for the arguments.
	 * 
	 */
	private class ArgumentsContentProvier extends AdapterFactoryContentProvider {

		public ArgumentsContentProvier(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) {
			if (object instanceof EObjectReference) {
				return ((OperationCallControllerBinding) ((EObjectReference) object).getEObject()).getArgumentsList()
						.getArguments().toArray();
			}
			return super.getElements(object);
		}

		@Override
		public Object[] getChildren(Object object) {
			if (object == operationCall) {
				// Only returns the arguments as children of the operationCall input.
				if (((OperationCall) object).getArgumentsList() != null) {
					return ((OperationCall) object).getArgumentsList().getArguments().toArray();
				}
				return new Object[]{};
			}
			return super.getChildren(object);
		}

		@Override
		public boolean hasChildren(Object object) {
			if (object == operationCall) {
				return true;
			}
			return false;
		}
	}

	/**
	 * Label provider for the arguments.
	 * 
	 */
	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_ID = 1;

		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				if (getArguments().contains(object)) {
					str = super.getColumnText(object, 0);
					// Cut the values from the return of the itemProvider labels
					if (str.contains("(")) {
						str = str.substring(0, str.indexOf("("));
					}
					break;
				}
				str = object.getClass().getName();
				break;
			case VALUE_ID:
				if (getArguments().contains(object)) {
					if (object instanceof EDataTypeArgument) {
						str = ((EDataTypeArgument) object).getValue();
					} else if (object instanceof EClassArgument) {
						EClassArgument eClassArgumentObject = (EClassArgument) object;
						if (eClassArgumentObject.getValue() != null) {
							str = ((EClassArgument) object).getValue().getClass().getName();
						}
					} else if (object instanceof EEnumArgument) {
						str = ((EEnumArgument) object).getEEnumLiteral().getLiteral();
					}
				} else {
					str = super.getText(object);
				}
				break;
			default:
				break;
			}
			return str;
		}
	}

	/**
	 * Adapter that updates the treeViewer input if the {@link ArgumentsList} is changed.
	 * @return
	 */
	public Adapter getArgumentsListAdapter() {
		if (argumentsListAdapter == null) {
			argumentsListAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					if (notification
							.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST) {
						if (notification.getNewValue() != null) {
							setOperationCall(((ArgumentsList) notification.getNewValue()).getOperationCall());
						}

					}
				}
			};
		}
		return argumentsListAdapter;
	}

	@Override
	public void dispose() {
		if (this.operationCall != null) {
			this.operationCall.eAdapters().remove(getArgumentsListAdapter());
		}
		adapterFactory.dispose();
		super.dispose();
	}

}