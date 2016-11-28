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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.wizards.NewControllerBindingWizard;

public class ControllerBindingsComposite extends Composite {

	private ISelectionChangedListener selectionChangedListener;
	private DataBindingContext m_bindingContext;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;
	
	private OperationCallContainer operationCallContainer;
	
	private TreeViewer treeViewer;

	/**
	 * Creates the parentComposite.
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
		
		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
		treeclmnAction.setWidth(100);
		treeclmnAction.setText("Action");
		
		TreeViewerColumn treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
		treeclmnParameter.setWidth(100);
		treeclmnParameter.setText("Parameter");

		TreeViewerColumn treeViewerControllerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnController = treeViewerControllerColumn.getColumn();
		treeclmnController.setWidth(100);
		treeclmnController.setText("Controller");

		TreeViewerColumn treeViewerTypeColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnType = treeViewerTypeColumn.getColumn();
		treeclmnType.setWidth(100);
		treeclmnType.setText("Type");	
		
		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
//				NewControllerBindingWizard newControllerBindingWizard = new NewControllerBindingWizard(controllersConfiguration);
				// Listener that sets the new child as the selected item
//				newControllerBindingWizard.getCreatedControllerBinding().addChangeListener(new IChangeListener() {
//					@SuppressWarnings("unchecked")
//					@Override
//					public void handleChange(ChangeEvent event) {
//						treeViewer.setSelection(new StructuredSelection(((WritableValue<OperationCallControllerBinding>)event.getObservable()).getValue()));
//					}
//				});
//				WizardDialog dialog = new WizardDialog(getShell(), newControllerBindingWizard);
//
//				dialog.open();
//				System.out.println("ControllerBindingsComposite.ControllerBindingsComposite() BTN NEW");
		}});
		
		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				System.out.println("ControllerBindingsComposite.ControllerBindingsComposite() BTN DELETE");
			}});
		
		Button btnEdit = new Button(this, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnEdit.setText("Edit");
		btnEdit.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				System.out.println("ControllerBindingsComposite.ControllerBindingsComposite() BTN EDIT");
			}});
		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
		
		m_bindingContext = initDataBindings();
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
	
	public void setOperationCallContainer(OperationCallContainer operationCallContainer) {
		if (this.operationCallContainer != null) {
			this.operationCallContainer .eAdapters().remove(getAdapter());
		}
		this.operationCallContainer = operationCallContainer;
//
//		if (this.operationCall.getArgumentsList() != null) {
//			EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
//			eObjectReference.setEObject(operationCall);
//			
//			treeViewer.setInput(eObjectReference);
//			treeViewer.expandAll();
//			// Adjust columns
//			for (TreeColumn column : treeViewer.getTree().getColumns()) {
//				column.pack();
//			}
//		} else {
//			treeViewer.setInput(null);
//		}
//
//		this.operationCall.eAdapters().add(getArgumentsListAdapter());
	}
	
	public OperationCallControllerBinding getOperationCallControllerBinding(){
		return (OperationCallControllerBinding) treeViewer.getStructuredSelection().getFirstElement();
	}
	
	protected DataBindingContext initDataBindings() {
		m_bindingContext = new DataBindingContext();

		treeViewer.setContentProvider(new ControllerBindingsContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new ControllerBindingsLabelProvider(adapterFactory));

		return m_bindingContext;
	}
	
	/**
	 * Adapter that updates the treeViewer input if the {@link OperationCallControllerBinding} is changed.
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification notification) {
					if (notification
							.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS) {
						if (notification.getNewValue() != null) {
							setOperationCallContainer(((OperationCall) notification.getNewValue()).getOperationCallContainer());
							}

					}
				}
			};
		}
		return adapter;
	}
	
	/**
	 * Label provider for the TreeViewer
	 */
	private class ControllerBindingsLabelProvider extends
			AdapterFactoryLabelProvider implements ITableLabelProvider{

		public ControllerBindingsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int NAME_COLUMN_ID = 0;
		private static final int PARAMETER_COLUMN_ID = 1;
		private static final int CONTROLLER_COLUMN_ID = 2;
		private static final int TYPE_COLUMN_ID = 3;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				if(object instanceof OperationCallControllerBinding){
					str = ((OperationCallControllerBinding) object).getName();
				}else if(object instanceof BindedEDataTypeArgument){
					str = "Parameter";
				}
				break;
			case PARAMETER_COLUMN_ID:
				if(object instanceof OperationCallControllerBinding){
					str = ((OperationCallControllerBinding) object).getEOperation().getName();
				}else if(object instanceof BindedEDataTypeArgument){
					str = ((BindedEDataTypeArgument)object).getEParameter().getName();
				}
				break;
			case CONTROLLER_COLUMN_ID:
				if (object instanceof OperationCallControllerBinding) {
					str = "";
				} else if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
						str = ((FixedValueSource) bindedEDataTypeArgument.getValueSource()).getValue();
					} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
						str = ApogyCoreProgramsControllersFacade.INSTANCE
								.getToggleValueSourceString((ToggleValueSource) bindedEDataTypeArgument);
					} else {
						str = ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
								.getEComponentQualifier().getEControllerName() + "."
								+ ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
										.getEComponentQualifier().getEComponentName();
					}
				}
				break;
			case TYPE_COLUMN_ID:
				if(object instanceof OperationCallControllerBinding){
					str = "";
				}else if (object instanceof BindedEDataTypeArgument){
					str = ((BindedEDataTypeArgument)object).getEParameter().getEType().getName();
				}
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
	private class ControllerBindingsContentProvider extends
			AdapterFactoryContentProvider {

		public ControllerBindingsContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		@Override
		public Object[] getChildren(Object object) {
			return ((OperationCallControllerBinding)object).getArgumentsList().getArguments().toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			return object instanceof OperationCallControllerBinding
					? (((OperationCallControllerBinding) object).getArgumentsList() != null) : false;
		}
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}