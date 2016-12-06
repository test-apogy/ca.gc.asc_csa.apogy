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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ui.composites.SubClassesListComposite;
import ca.gc.asc_csa.apogy.common.ui.composites.NoContentComposite;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.programs.controllers.AbstractInputConditioning;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource;

public class ConditionningComposite extends ScrolledComposite {

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private TableViewer argumentsTableViewer;
	private Composite infosComposite;
	private Composite subClassesListComposite;
	private AbstractInputConditioningResponsePlotComposite plotComposite;

	private OperationCallControllerBinding operationCallControllerBinding;
	private List<ControllerValueSource> controllerValueSources;

	private Adapter adapter;
	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ConditionningComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.None);
		composite.setLayout(new FillLayout(SWT.HORIZONTAL));
		
		infosComposite = new Composite(composite, SWT.None);
		infosComposite.setLayout(new GridLayout(1, false));
		
		argumentsTableViewer = new TableViewer(infosComposite,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		Table table = argumentsTableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);

		TableViewerColumn tableViewerArgumentColumn = new TableViewerColumn(argumentsTableViewer, SWT.NONE);
		TableColumn tableclmnArgument = tableViewerArgumentColumn.getColumn();
		tableclmnArgument.setWidth(100);
		tableclmnArgument.setText("Parameter");

		TableViewerColumn tableViewerValueColumn = new TableViewerColumn(argumentsTableViewer, SWT.NONE);
		TableColumn tableclmnValue = tableViewerValueColumn.getColumn();
		tableclmnValue.setWidth(100);
		tableclmnValue.setText("Value source");

		TableViewerColumn tableViewerConditionningColumn = new TableViewerColumn(argumentsTableViewer, SWT.NONE);
		TableColumn tableclmnConditionning = tableViewerConditionningColumn.getColumn();
		tableclmnConditionning.setWidth(100);
		tableclmnConditionning.setText("Conditionning");
		
		setSubClassesListComposite(true);
		
//		Composite conditionningComposite = new Composite(infosComposite, SWT.BORDER);
//		conditionningComposite
		
		
		plotComposite = new AbstractInputConditioningResponsePlotComposite(composite, SWT.None);
		plotComposite.setAbstractInputConditioning(null);
		
		argumentsTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				setSubClassesListComposite(event.getSelection().isEmpty());
				if(!event.getSelection().isEmpty()){
					plotComposite.setAbstractInputConditioning(((ControllerValueSource)((StructuredSelection)event.getSelection()).getFirstElement()).getConditioning());
					plotComposite.layout();
				}else{
					plotComposite.setAbstractInputConditioning(null);
				}
				newSelection(event.getSelection());
			}
		});
		


		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		m_bindingContext = customDataBindings();
	}
	
	private void setSubClassesListComposite(Boolean empty){
		if(subClassesListComposite != null){
			subClassesListComposite.dispose();
		}
		if(empty){
			subClassesListComposite = new NoContentComposite(infosComposite, SWT.None){
				protected String getMessage() {
					return "Select a parameter to start";
				}
			};
		}else{
			ControllerValueSource controllerValueSource = (ControllerValueSource) argumentsTableViewer
					.getStructuredSelection().getFirstElement();
			subClassesListComposite = new SubClassesListComposite(infosComposite, SWT.None) {
				@Override
				protected void newSelection(TreeSelection selection) {
					if (!selection.isEmpty()) {
						AbstractInputConditioning abstractInputConditioning = (AbstractInputConditioning) EcoreUtil
								.create((EClass) selection.getFirstElement());
						controllerValueSource.setConditioning(abstractInputConditioning);
						plotComposite.setAbstractInputConditioning(controllerValueSource.getConditioning());
					}
				}
			};
			((SubClassesListComposite) subClassesListComposite)
					.setSuperClass(ApogyCoreProgramsControllersPackage.Literals.ABSTRACT_INPUT_CONDITIONING);
			if (controllerValueSource.getConditioning() != null) {
				((SubClassesListComposite) subClassesListComposite).setSelectedEClass(
						((ControllerValueSource) argumentsTableViewer.getStructuredSelection().getFirstElement())
								.getConditioning().eClass());
			}

			subClassesListComposite.setLayoutData(new GridData(SWT.FILL, SWT.TOP, true, false, 1, 1));
		}
		infosComposite.layout();
	}
	
	protected void packColumns(){
		for (TableColumn column : argumentsTableViewer.getTable().getColumns()) {
			column.pack();
		}
	}

	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if(controllerValueSources != null){
			for(ControllerValueSource controllerValueSource: controllerValueSources){
				controllerValueSource.eAdapters().remove(getAdapter());
			}
			controllerValueSources.removeAll(controllerValueSources);
		}
		
		if(this.operationCallControllerBinding != null){
			operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		for(Argument argument : operationCallControllerBinding.getArgumentsList().getArguments()){
			if(argument instanceof BindedEDataTypeArgument){
				BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument)argument;
				if(bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource){
					controllerValueSources.add((ControllerValueSource)bindedEDataTypeArgument.getValueSource());
				}
			}
		}
		
		argumentsTableViewer.setInput(controllerValueSources);
		
		operationCallControllerBinding.eAdapters().add(getAdapter());
		for(ControllerValueSource controllerValueSource: controllerValueSources){
			controllerValueSource.eAdapters().add(getAdapter());
		}
		packColumns();
		infosComposite.layout();
	}

	protected void newSelection(ISelection selection) {

	}

	private DataBindingContext customDataBindings() {
		m_bindingContext = new DataBindingContext();

		controllerValueSources = new ArrayList<ControllerValueSource>();
		
		argumentsTableViewer.setContentProvider(new ArgumentsContentProvier(adapterFactory));
		argumentsTableViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));
		
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
			@SuppressWarnings("unchecked")
			List<ControllerValueSource> objects = (List<ControllerValueSource>)object;
			return objects.toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
		}		
	}

	/**
	 * Label provider for the arguments.
	 */
	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {

		private static final int ARGUMENT_COLUMN_ID = 0;
		private static final int VALUE_ID = 1;
		private static final int CONDITIONNING_ID = 2;	

		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			ControllerValueSource valueSource = (ControllerValueSource) object;
			switch (columnIndex) {
			case ARGUMENT_COLUMN_ID:
				str = valueSource.getBindedEDataTypeArgument().getEParameter().getName();
				if(str.length() > 2){
					str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
				}
				
				break;
			case VALUE_ID:
				str = valueSource.getEComponentQualifier().getEControllerName() + "." + valueSource.getEComponentQualifier().getEComponentName();
				break;
			case CONDITIONNING_ID:
				str = super.getColumnText(valueSource.getConditioning(), columnIndex);
				break;
			default:
				break;
			}
			return str;
		}
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			if(columnIndex == CONDITIONNING_ID){
				return super.getColumnImage(((ControllerValueSource) object).getConditioning(), columnIndex);
			}
			return null;
		}
	}

	
	
	
	
	/**
	 * Adapter that updates the treeViewer input if the {@link ArgumentsList} is changed.
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new EContentAdapter() {
				@Override
				public void notifyChanged(Notification notification) {
					System.out.println(notification.getFeature());
					if (notification.getFeature() == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__CONDITIONING ||
							notification.getFeature() == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE__ECOMPONENT_QUALIFIER) {
						argumentsTableViewer.refresh();
						packColumns();
					}
					if (notification
							.getFeature() == ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE) {
						setOperationCallControllerBinding(
								(OperationCallControllerBinding) ((ValueSource) notification.getNewValue())
										.getBindedEDataTypeArgument().getOperationCall());
					}
				}
			};
		}
		return adapter;
	}

	// /**
	// * @return
	// */
	// public Adapter getAdapter() {
	// if (adapter == null) {
	// adapter = new AdapterImpl() {
	// @Override
	// public void notifyChanged(Notification msg) {
	// if(msg.getFeature() != null){
	// if(msg.getFeature() !=
	// ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER){
	// triggersListComposite.refreshTreeViewer();
	// }else{
	// setEComponentComposite();
	// }
	//
	// }
	// }
	// };
	// }
	// return adapter;
	// }

	// @Override
	// public void dispose() {
	// if (this.operationCallControllerBinding != null) {
	// this.operationCallControllerBinding.eAdapters().remove(getAdapter());
	// }
	// super.dispose();
	// }

}