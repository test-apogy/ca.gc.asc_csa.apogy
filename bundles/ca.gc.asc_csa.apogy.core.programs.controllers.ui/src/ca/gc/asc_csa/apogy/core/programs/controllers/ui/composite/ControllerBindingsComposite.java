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
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.common.emf.FeaturePathAdapter;
import ca.gc.asc_csa.apogy.common.emf.impl.FeaturePathAdapterImpl;
import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.ApogyCommonEMFUIFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage;
import ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.wizards.ControllerBindingWizard;

public class ControllerBindingsComposite extends Composite {

	private DataBindingContext m_bindingContext;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;

	private ControllersConfiguration controllersConfiguration;

	private TreeViewer treeViewer;
	private Button btnDelete;
	
	private FeaturePathAdapter featurePathAdapter;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ControllerBindingsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));

		ApogyCommonUiFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);

		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
		treeclmnAction.setWidth(100);
		treeclmnAction.setText("Name");

		TreeViewerColumn treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
		treeclmnParameter.setWidth(100);
		treeclmnParameter.setText("Binding");

		TreeViewerColumn treeViewerControllerColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn treeclmnController = treeViewerControllerColumn.getColumn();
		treeclmnController.setWidth(100);
		treeclmnController.setText("Conditionning");

		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ControllerBindingWizard newControllerBindingWizard = new ControllerBindingWizard(
						controllersConfiguration) {
					@Override
					public boolean performFinish() {	
						getControllerBinding().eResource().getResourceSet().getResources()
								.remove(getControllerBinding().eResource());
						TransactionUtil.disconnectFromEditingDomain(getControllerBinding().eResource());

						ApogyCommonEmfTransactionFacade.INSTANCE.basicAdd(controllersConfiguration,
								ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
								getControllerBinding());
						treeViewer.setSelection(new StructuredSelection(getControllerBinding()));
						return true;
					}
				};
				WizardDialog dialog = new WizardDialog(getShell(), newControllerBindingWizard);
				dialog.open();
			}
		});

		btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				EObject eObject = getSelectedEObject();
				if (eObject instanceof OperationCallControllerBinding) {
					treeViewer.setSelection(null);
					ApogyCommonEMFUIFacade.INSTANCE.openDeleteNamedDialog((OperationCallControllerBinding) eObject);
				}
			}
		});

		Button btnEdit = new Button(this, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnEdit.setText("Edit");
		btnEdit.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				MessageBox dialog = new MessageBox(getShell());
				dialog.setText("TODO");
				dialog.open();
			}
		});

		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		m_bindingContext = initDataBindings();
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

	/**
	 * Sets the controllers configuration to display in the {@link Composite}.
	 * 
	 * @param controllersConfiguration
	 */
	public void setControllersConfiguration(ControllersConfiguration controllersConfiguration) {
		if (this.controllersConfiguration != null) {
			this.controllersConfiguration.eAdapters().remove(getAdapter());
		}
		this.controllersConfiguration = controllersConfiguration;

		if (this.controllersConfiguration.getOperationCalls() != null) {
			EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
			eObjectReference.setEObject(controllersConfiguration);

			treeViewer.setInput(eObjectReference);
			// Adjust columns
			for (TreeColumn column : treeViewer.getTree().getColumns()) {
				column.pack();
			}
		} else {
			treeViewer.setInput(null);
		}
		
		getFeaturePathAdapter().init(controllersConfiguration);
		
//		this.controllersConfiguration.eAdapters().add(getAdapter());	
	}

	public EObject getSelectedEObject() {
		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
	}
	
	private FeaturePathAdapter getFeaturePathAdapter() {
		if(this.featurePathAdapter == null){
			featurePathAdapter = new FeaturePathAdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					treeViewer.refresh();	
					System.out.println(featurePathAdapter.getEObjectAdaptersMap().size());
//					Object test = null;
					Iterator<?> ite = featurePathAdapter.getEObjectAdaptersMap().keySet().iterator();
					while(ite.hasNext()){
						System.out.println(ite.next());
					}
//					System.out.println(test);
				}

				@Override
				public List<? extends EStructuralFeature> getFeatureList() {
					List<EStructuralFeature> featurePath = new ArrayList<EStructuralFeature>();
					featurePath.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS);
					featurePath.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);
					featurePath.add(ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS);
					featurePath.add(ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);
					featurePath.add(
							ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
					featurePath.add(ApogyCommonIOJInputPackage.Literals.ECOMPONENT_QUALIFIER__ECOMPONENT_NAME);
					return featurePath;
				}
			};
		}
		return featurePathAdapter;
	}

	protected DataBindingContext initDataBindings() {
		m_bindingContext = new DataBindingContext();

		treeViewer.setContentProvider(new ControllerBindingsContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new ControllerBindingsLabelProvider(adapterFactory));

		IObservableValue<?> observeSingleSelection = ViewerProperties.singleSelection().observe(treeViewer);
		IObservableValue<?> observeEnableDeleteButton = WidgetProperties.enabled().observe(btnDelete);

		m_bindingContext.bindValue(observeEnableDeleteButton, observeSingleSelection, null,
				new UpdateValueStrategy().setConverter(new Converter(EObject.class, boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						return fromObject instanceof OperationCallControllerBinding ? true : false;
					}
				}));

		return m_bindingContext;
	}

	/**
	 * Adapter that updates the treeViewer input if the
	 * {@link OperationCallControllerBinding} is changed.
	 * 
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new EContentAdapter() {
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

				/**
				 * Provides a list of the structural features that should
				 * refresh the treeViewer. This method implements a pattern of
				 * lazy loading.
				 */
				private List<EStructuralFeature> getEStructuralFeature() {
					if (features == null) {
						features = new ArrayList<EStructuralFeature>();

						features.add(ApogyCommonEMFPackage.Literals.NAMED__NAME);

						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS);
						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION);
						features.add(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST);

						features.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE);
						features.add(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__FEATURE_ROOT);
						features.add(
								ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__TYPE_MEMBER_REFERENCE_LIST_ELEMENT);

						features.add(
								ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER);

						features.add(
								ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE);

						features.add(ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__COMPONENT);
						features.add(
								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER);
						features.add(
								ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING);
						features.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__CURRENT_VALUE);
						features.add(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE__INITIAL_VALUE);
						features.add(ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE);
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
	private class ControllerBindingsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider {

		public ControllerBindingsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		private static final int NAME_COLUMN_ID = 0;
		private static final int BINDING_COLUMS_ID = 1;
		private static final int CONDITIONNING_COLUMN_ID = 2;

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			switch (columnIndex) {
			case NAME_COLUMN_ID:
				if (object instanceof OperationCallControllerBinding) {
					str = ((OperationCallControllerBinding) object).getName();
				} else if (object instanceof BindedEDataTypeArgument) {
					str = ((BindedEDataTypeArgument) object).getEParameter().getName();
				}
				break;
			case BINDING_COLUMS_ID:
				if (object instanceof OperationCallControllerBinding) {
					str = ApogyCoreInvocatorFacade.INSTANCE
							.getOperationCallString((OperationCallControllerBinding) object, true);
				} else if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;

					if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
						str = ((FixedValueSource) bindedEDataTypeArgument.getValueSource()).getValue();

					} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
						str = ApogyCoreProgramsControllersFacade.INSTANCE.getToggleValueSourceString(
								(ToggleValueSource) bindedEDataTypeArgument.getValueSource());

					} else if ((bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource)) {
						str = ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
								.getEComponentQualifier().getEControllerName() + "."
								+ ((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
										.getEComponentQualifier().getEComponentName();
					}
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
				if (object instanceof OperationCallControllerBinding) {
					image = super.getColumnImage(((OperationCallControllerBinding) object).getTrigger(), columnIndex);
				}
				if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
						image = super.getColumnImage(((ControllerValueSource) bindedEDataTypeArgument.getValueSource())
								.getEComponentQualifier(), columnIndex);
					} else {
						image = super.getColumnImage((bindedEDataTypeArgument.getValueSource()), columnIndex);
					}
				}
				break;
			case CONDITIONNING_COLUMN_ID:
				if (object instanceof BindedEDataTypeArgument) {
					BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) object;
					if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
						image = super.getColumnImage(
								((ControllerValueSource) ((BindedEDataTypeArgument) object).getValueSource())
										.getConditioning(),
								columnIndex);
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
	private class ControllerBindingsContentProvider extends AdapterFactoryContentProvider {

		public ControllerBindingsContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object object) {
			if (object instanceof EObjectReference) {
				return ((ControllersConfiguration) ((EObjectReference) object).getEObject()).getOperationCalls()
						.toArray();
			}
			return null;
		}

		@Override
		public Object[] getChildren(Object object) {
			OperationCallControllerBinding operationCallControllerBinding = (OperationCallControllerBinding) object;
			if (operationCallControllerBinding.getArgumentsList() != null) {
				return operationCallControllerBinding.getArgumentsList().getArguments().toArray();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object object) {
			if (object instanceof OperationCallControllerBinding) {
				return ((OperationCallControllerBinding) object).getArgumentsList() != null;
			}
			return false;
		}
	}

	@Override
	public void dispose() {
		if (this.controllersConfiguration != null) {
			controllersConfiguration.eAdapters().remove(getAdapter());
		}
		super.dispose();
	}
}