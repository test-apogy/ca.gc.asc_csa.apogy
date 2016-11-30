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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.swt.widgets.TreeItem;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger;
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
	
	private ControllersConfiguration controllersConfiguration;
	
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
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		tree.addListener(SWT.Expand, new Listener() {
			public void handleEvent(Event e) {
			TreeItem treeItem = (TreeItem)e.item;
		      TreeColumn[] treeColumns = treeItem.getParent().getColumns();
		      getDisplay().asyncExec(new Runnable() {

		         @Override
		         public void run() {
		            for (TreeColumn treeColumn : treeColumns)
		                 treeColumn.pack();
		         }
		      });
				
			}
		});
		ApogyCommonUiFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);
		
		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
		treeclmnAction.setWidth(100);
		treeclmnAction.setText("Name");
		
		TreeViewerColumn treeViewerIconColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnIcon = treeViewerIconColumn.getColumn();
		treeclmnIcon.setWidth(100);
		
		TreeViewerColumn treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
		treeclmnParameter.setWidth(100);
		// TODO name and parameters names
		treeclmnParameter.setText("NameTBD");

		TreeViewerColumn treeViewerControllerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnController = treeViewerControllerColumn.getColumn();
		treeclmnController.setWidth(100);
		treeclmnController.setText("i");
		
		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
//				MessageBox dialog = new MessageBox(getShell());
//				dialog.setText("TODO");
//				dialog.open();
				
				NewControllerBindingWizard newControllerBindingWizard = new NewControllerBindingWizard(controllersConfiguration){
					@Override
					public boolean performFinish() {
						// TODO
						return super.performFinish();
					}
				};
				WizardDialog dialog = new WizardDialog(getShell(), newControllerBindingWizard);
				dialog.open();
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
				MessageBox dialog = new MessageBox(getShell());
				dialog.setText("TODO");
				dialog.open();
			}});
		
		Button btnEdit = new Button(this, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnEdit.setText("Edit");
		btnEdit.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				MessageBox dialog = new MessageBox(getShell());
				dialog.setText("TODO");
				dialog.open();
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
	
	public void setControllersConfiguration(ControllersConfiguration controllersConfiguration) {
		if (this.controllersConfiguration != null) {
			this.controllersConfiguration.eAdapters().remove(getAdapter());
		}
		this.controllersConfiguration = controllersConfiguration;
		
		if (this.controllersConfiguration.getOperationCalls() != null) {
			EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
			eObjectReference.setEObject(controllersConfiguration);
			
			treeViewer.setInput(eObjectReference);
//			treeViewer.expandAll();
			// Adjust columns
			for (TreeColumn column : treeViewer.getTree().getColumns()) {
				column.pack();
			}
		} else {
			treeViewer.setInput(null);
		}

		this.controllersConfiguration.eAdapters().add(getAdapter());
	}
	
	public OperationCallControllerBinding getOperationCallControllerBinding(){
		try{
		return (OperationCallControllerBinding) treeViewer.getStructuredSelection().getFirstElement();
		}catch (Exception e) {
			// TODO
			return null;
		}
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
		if(adapter == null){
			adapter = new EContentAdapter(){
				List<EStructuralFeature> features;

				@Override
				public void notifyChanged(Notification notification) {
					if (getEStructuralFeature().contains(notification.getFeature())) {
						treeViewer.refresh();
						for (TreeColumn column : treeViewer.getTree().getColumns()) {
							column.pack();
						}
						setControllersConfiguration(ControllerBindingsComposite.this.controllersConfiguration);
					}
				}
				
				private List<EStructuralFeature> getEStructuralFeature() {
					if (features == null) {
						features = new ArrayList<EStructuralFeature>();
						features.add(ApogyCommonEMFPackage.Literals.NAMED__NAME);
						
						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS);
						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION);
						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);
						
						features.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE);
						features.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
						features.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);
						
						features.add(ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);
						
						features.add(ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
						
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__COMPONENT);
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
						features.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
						features.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECONTROLLER_NAME);
					}
					return features;
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
		private static final int ICON_COLUMN_ID = 1;
		private static final int TYPE_COLUMS_ID = 2;
		private static final int EOPERATION_VALUE_COLUMN_ID = 3;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				if (object instanceof OperationCallControllerBinding) {
					str = ((OperationCallControllerBinding)object).getName();
				} else if (object instanceof BindedEDataTypeArgument) {
					str = ((BindedEDataTypeArgument) object).getEParameter().getName();
				} else if(object instanceof ControllerTrigger){
					if(object instanceof ControllerEdgeTrigger){
						str = ((ControllerEdgeTrigger) object).getEdgeType().getLiteral();					
					}if(object instanceof ControllerStateTrigger){
						str = "State";
					}
					
					
//					str = ((ControllerTrigger) object).getName();
				}
				break;
			case TYPE_COLUMS_ID:
				if (object instanceof OperationCallControllerBinding) {
					str = ApogyCoreInvocatorFacade.INSTANCE
							.getOperationCallString((OperationCallControllerBinding) object, true);
				} else if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
						str = ((FixedValueSource) bindedEDataTypeArgument.getValueSource()).getValue();
					} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
						str = ApogyCoreProgramsControllersFacade.INSTANCE
								.getToggleValueSourceString((ToggleValueSource) bindedEDataTypeArgument);
					} else if ((bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource)) {
						str = ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
								.getEComponentQualifier().getEControllerName() + "."
								+ ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
										.getEComponentQualifier().getEComponentName();
					}
				} else if (object instanceof ControllerTrigger) {
					str = ((ControllerTrigger) object).getComponentQualifier().getEControllerName() + "."
							+ ((ControllerTrigger) object).getComponentQualifier().getEComponentName();
				}
				break;
			default:
				str = "";
				break;
			}
			return str;
		}
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			Image image = null;

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				if (object instanceof BindedEDataTypeArgument || object instanceof ControllerTrigger) {
					image = super.getColumnImage(object, columnIndex);
				}
				break;
			case ICON_COLUMN_ID:
				if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
						image = super.getColumnImage(((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
								.getEComponentQualifier(), columnIndex);
					}
				}if (object instanceof ControllerTrigger) {
					image = super.getColumnImage(((ControllerTrigger) object).getComponentQualifier(), columnIndex);
				}
				break;
			case EOPERATION_VALUE_COLUMN_ID:
				if (object instanceof OperationCallControllerBinding) {
					image = super.getColumnImage(((OperationCallControllerBinding) object).getTrigger(), columnIndex); 
				} else if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
						image = super.getColumnImage(((ControllerValueSource) ((BindedEDataTypeArgument) object).getValueSource())
								.getConditioning(), columnIndex);
					} 
				}
				break;
			default:
				break;
			}
			return image;
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
		public Object[] getElements(Object object) {
			if(object instanceof EObjectReference){
				return ((ControllersConfiguration)((EObjectReference)object).getEObject()).getOperationCalls().toArray();
			}
			return null;
		}
		
		@Override
		public Object[] getChildren(Object object) {
			OperationCallControllerBinding operationCallControllerBinding = (OperationCallControllerBinding) object;
			if (operationCallControllerBinding.getArgumentsList() != null) {
				return operationCallControllerBinding.getArgumentsList().getArguments().toArray();
			}
			if (operationCallControllerBinding.getTrigger() != null
					&& operationCallControllerBinding.getTrigger() instanceof ControllerTrigger) {
				Object[] trigger = {operationCallControllerBinding.getTrigger()};
				return trigger;
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object object) {
			return object instanceof OperationCallControllerBinding;
		}
	}

	@Override
	public void dispose() {
		if(this.controllersConfiguration != null){
			controllersConfiguration.eAdapters().remove(getAdapter());
		}
		super.dispose();
	}
}