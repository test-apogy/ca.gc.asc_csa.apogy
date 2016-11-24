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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationEvent;
import org.eclipse.jface.viewers.ColumnViewerEditorActivationStrategy;
import org.eclipse.jface.viewers.ComboBoxViewerCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.IBaseLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.TreeViewerEditor;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;

public class OperationCallArgumentsComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private OperationCall operationCall;
	private Tree tree;
	private TreeViewer treeViewer;
	private ISelectionChangedListener treeViewerSelectionChangedListener;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Style of the parentComposite.
	 */
	public OperationCallArgumentsComposite(Composite parent, int style) {
		super(parent, SWT.NONE);

		GridLayout gridLayout = new GridLayout(1, false);
		setLayout(gridLayout);

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL | SWT.FULL_SELECTION);
		tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setLinesVisible(true);
		tree.setHeaderVisible(true);

		TreeViewerColumn treeViewerColumnParameter = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn columnParameter = treeViewerColumnParameter.getColumn();
		columnParameter.setWidth(80);
		columnParameter.setText("Parameter");

		TreeViewerColumn treeViewerColumnValue = new TreeViewerColumn(
				treeViewer, SWT.NONE);
		TreeColumn columnValue = treeViewerColumnValue.getColumn();
		columnValue.setWidth(50);
		columnValue.setText("Value");;

		EditingSupport editingSupport = new ParameterEditingSupport(
				treeViewerColumnValue.getViewer());
		treeViewerColumnValue.setEditingSupport(editingSupport);
		TreeViewerEditor.create(treeViewer,
				new ColumnViewerEditorActivationStrategy(treeViewer) {
					@Override
					protected boolean isEditorActivationEvent(
							ColumnViewerEditorActivationEvent event) {
						return event.eventType == ColumnViewerEditorActivationEvent.MOUSE_CLICK_SELECTION;
					}
				}, SWT.NONE);

		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
				ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		treeViewer.setLabelProvider(new ParameterTreeViewerLabelProvider(
				adapterFactory));
		treeViewer.setContentProvider(new ParameterTreeViewerContentProvider());
		
	}

	/**
	 * Disposes the parentComposite.
	 */
	@Override
	public void dispose() {
		super.dispose();
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		treeViewer
				.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}

	/**
	 * Returns a reference to a tree viewer listener used to bind with {
	 * {@link #treeViewer}.
	 * 
	 * @return Reference to the listener.
	 */
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null) {
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					OperationCallArgumentsComposite.this
							.newSelection((TreeSelection) event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}

	/**
	 * This method is called when a new selection is made in the parentComposite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}

	/**
	 * Returns the reference to the {@link OperationCall} bound with the
	 * parentComposite.
	 * 
	 * @return Reference to the {@link OperationCall}.
	 */
	public OperationCall getOperationCall() {
		return operationCall;
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setOperationCall(OperationCall newOperationCall) {
		treeViewer
		.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());

		operationCall = newOperationCall;
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
			m_bindingContext = null;
		}
		m_bindingContext = initDataBindings();
		
		treeViewer
		.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}

	/**
	 * Invokes {@link #initDataBindingsCustom()}
	 * 
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	/**
	 * Custom implementation of data bindings. Use this pattern to prevent
	 * Window Pro builder to override the code.
	 * 
	 * @return Reference to the data bindings.
	 */
	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		treeViewer.setInput(getOperationCall());
		treeViewer.expandAll();

		return bindingContext;
	}

	
	/**
	 * 
	 * Label Provider for the Parameter Tree Viewer.
	 * 
	 */
	private final class ParameterTreeViewerLabelProvider extends
			AdapterFactoryLabelProvider implements ITableLabelProvider {

		public ParameterTreeViewerLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_COLUMN_ID = 1;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";
			
			Argument argument = (Argument) object;			
			
			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				str = argument.getEParameter().getName();
				break;
			case VALUE_COLUMN_ID:
				str = argument.getParameterValue() == null ? "null" : argument.getParameterValue().toString();
				break;

			default:
				break;
			}

			return str;
		}
	}

	/**
	 * 
	 * Content Provider for the Parameter Tree Viewer.
	 * 
	 */
	private class ParameterTreeViewerContentProvider implements
			ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean hasChildren(Object element) {
			return false;
		}

		@Override
		public Object getParent(Object element) {
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {	
			Object [] elements = 			
				getOperationCall().getArgumentsList() == null ||  
				   getOperationCall().getArgumentsList().getArguments().isEmpty() ? 
					new Object[0] : 
					getOperationCall().getArgumentsList().getArguments().toArray();
					
			return elements;
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			return new Object[0];
		}
	}	
	
	
	/**
	 * 
	 * @author rlarcheveque
	 *
	 */
	private final class ParameterEditingSupport extends
			EditingSupport {

		private ColumnViewer viewer = null;

		private IBaseLabelProvider labelProvider = new LabelProvider() {
			@Override
			public String getText(Object element) {
				return ((EClass) element).getInstanceTypeName();
			}
		};

		private IStructuredContentProvider contentProvider = new IStructuredContentProvider() {

			@Override
			public void inputChanged(Viewer viewer, Object oldInput,
					Object newInput) {
			}

			@Override
			public void dispose() {
			}

			@Override
			public Object[] getElements(Object inputElement) {
				Object[] elements = null;
				if (inputElement instanceof VariableImplementation) {
					VariableImplementation variableImplementation = (VariableImplementation) inputElement;

					if (variableImplementation.getVariable().getVariableType() != null) {
						EClass interfaceClass = variableImplementation
								.getVariable().getVariableType()
								.getInterfaceClass();
						elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
								interfaceClass).toArray();
					}
				}
				if (inputElement instanceof TypeMemberImplementation) {
					TypeMemberImplementation typeMemberImplementation = (TypeMemberImplementation) inputElement;

					if (typeMemberImplementation.getTypeMember()
							.getMemberType() != null) {
						EClass interfaceClass = typeMemberImplementation
								.getTypeMember().getMemberType()
								.getInterfaceClass();
						elements = ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
								interfaceClass).toArray();
					}
				}

				return elements;
			}
		};

		public ParameterEditingSupport(ColumnViewer viewer) {
			super(viewer);
			this.viewer = viewer;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			ComboBoxViewerCellEditor cellEditor = null;
			cellEditor = new ComboBoxViewerCellEditor((Composite) getViewer()
					.getControl(), SWT.READ_ONLY);
			cellEditor.setLabelProvider(labelProvider);
			cellEditor.setContentProvider(contentProvider);
			cellEditor.setInput(element);
			return cellEditor;
		}

		@Override
		protected boolean canEdit(Object element) {
			return true;
		}

		@Override
		protected Object getValue(Object element) {
			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;
			return implementation.getImplementationClass() == null ? null
					: implementation.getImplementationClass()
							.getInstanceTypeName();
		}

		@Override
		protected void setValue(Object element, Object value) {
//			EClass eClass = (EClass) value;
//			AbstractTypeImplementation implementation = (AbstractTypeImplementation) element;
//
//			SetCommand command = new SetCommand(
//					editingDomain,
//					implementation,
//					ApogyCoreInvocatorPackage.Literals.ABSTRACT_TYPE_IMPLEMENTATION__IMPLEMENTATION_CLASS,
//					eClass);
//			editingDomain.getCommandStack().execute(command);
			this.viewer.refresh();
			for(TreeColumn column: tree.getColumns()){
				column.pack();
			}
		}
	}
}