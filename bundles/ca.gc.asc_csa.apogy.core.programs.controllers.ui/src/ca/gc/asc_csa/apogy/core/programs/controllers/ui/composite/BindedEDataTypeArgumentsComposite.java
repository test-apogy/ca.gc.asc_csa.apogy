package ca.gc.asc_csa.apogy.core.programs.controllers.ui.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.observable.list.DecoratingObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.notify.impl.NotificationImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.ComboBoxCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.FocusAdapter;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.EDataTypeArgument;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.FixedValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;
import ca.gc.asc_csa.apogy.core.programs.controllers.ValueSource;

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


public class BindedEDataTypeArgumentsComposite extends Composite {	
	private TableViewer tableViewer;
	private Table table;

	private Composite compositeArguments;

	boolean readOnly;

	private WritableValue<ArgumentsList> argumentsListBinder;
	private OperationCall operationCall;

	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter argumentsListAdapter;
	private Adapter argumentAdapter;

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
		
		tableViewer = new TableViewer(compositeArguments,
				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
		table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2));
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableViewerColumn tableViewerActionColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableclmnAction = tableViewerActionColumn.getColumn();
		tableclmnAction.setWidth(100);
		tableclmnAction.setText("Parameter");

		TableViewerColumn tableViewerValueSourceColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableclmnValueSource = tableViewerValueSourceColumn.getColumn();
		tableclmnValueSource.setWidth(175);
		tableclmnValueSource.addListener(SWT.Resize, new Listener() {
			@Override
			public void handleEvent(Event event) {
				if(tableclmnValueSource.getWidth() < 150){
					tableclmnValueSource.setWidth(150);	
				}
			}
		});
		tableclmnValueSource.setText("Value source");
		tableViewerValueSourceColumn.setEditingSupport(new ValueSourceEditor(tableViewer));

		TableViewerColumn tableViewerValueColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tableclmnValue = tableViewerValueColumn.getColumn();
		tableclmnValue.setWidth(100);
		tableclmnValue.setText("Value");
		
		tableViewerValueColumn.setEditingSupport(new ValueEditor(tableViewer));		
		
		m_bindingContext = initDataBindingsCustom();
	}

	protected void packColumns(){
		for (TableColumn column : tableViewer.getTable().getColumns()) {
			column.pack();
		}
	}
	
	
	/**
	 * EditingSupport for the Arguments table. Depending on the type of
	 * argument, the editingSupport is different.
	 */
	private class ValueSourceEditor extends EditingSupport {

		List<EClass> valueSourcesEClassesBoolean;
		List<EClass> valueSourcesEClasses;

		public ValueSourceEditor(ColumnViewer viewer) {
			super(viewer);
			valueSourcesEClassesBoolean = ApogyCommonEMFFacade.INSTANCE
					.getAllSubEClasses(ApogyCoreProgramsControllersPackage.Literals.VALUE_SOURCE);

			valueSourcesEClasses = ApogyCommonEMFFacade.INSTANCE
					.getAllSubEClasses(ApogyCoreProgramsControllersPackage.Literals.VALUE_SOURCE);
			valueSourcesEClasses.remove(ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE);
		}

		@Override
		protected void setValue(Object element, Object value) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (getValue(element) != value) {
				if (getList(bindedEDataTypeArgument)
						.get((int) value) == ApogyCoreProgramsControllersPackage.Literals.FIXED_VALUE_SOURCE) {
					(bindedEDataTypeArgument)
							.setValueSource(ApogyCoreProgramsControllersFactory.eINSTANCE.createFixedValueSource());
				} else if (getList(bindedEDataTypeArgument)
						.get((int) value) == ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE) {
					(bindedEDataTypeArgument)
							.setValueSource(ApogyCoreProgramsControllersFactory.eINSTANCE.createToggleValueSource());
				} else if (getList(bindedEDataTypeArgument)
						.get((int) value) == ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_VALUE_SOURCE) {
					(bindedEDataTypeArgument).setValueSource(
							ApogyCoreProgramsControllersFactory.eINSTANCE.createControllerValueSource());
				}
			}
		}

		@Override
		protected Object getValue(Object element) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (bindedEDataTypeArgument.getValueSource() != null) {
				return getList(bindedEDataTypeArgument)
						.indexOf(((BindedEDataTypeArgument) element).getValueSource().eClass());
			}
			return -1;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			String[] items = new String[getList(bindedEDataTypeArgument).size()];
			for (int i = 0; i < getList(bindedEDataTypeArgument).size(); i++) {
				items[i] = getList(bindedEDataTypeArgument).get(i).getName();
			}
			return new ComboBoxCellEditor(tableViewer.getTable(), items);
		}

		@Override
		protected boolean canEdit(Object element) {
			if (element instanceof BindedEDataTypeArgument) {
				return true;
			}
			return false;
		}

		private List<EClass> getList(BindedEDataTypeArgument bindedEDataTypeArgument) {
			return bindedEDataTypeArgument.getEParameter().getEType() == EcorePackage.Literals.EBOOLEAN
					? valueSourcesEClassesBoolean : valueSourcesEClasses;
		}
	}

	/**
	 * EditingSupport for the Arguments table. Depending on the type of
	 * argument, the editingSupport is different.
	 */
	private class ValueEditor extends EditingSupport {

		String[] toggleStringValues = new String[2];
		Adapter adapter;

		public ValueEditor(ColumnViewer viewer) {
			super(viewer);

			toggleStringValues[0] = "Initial : true, Current : false";
			toggleStringValues[1] = "Initial : false, Current : true";
		}

		@Override
		protected void setValue(Object element, Object value) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
				((FixedValueSource) bindedEDataTypeArgument.getValueSource()).setValue((String) value);
//				((FixedValueSource) bindedEDataTypeArgument.getValueSource()).eAdapters().remove(getAdapter());
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
				if((int)value == 0){
					((ToggleValueSource)bindedEDataTypeArgument.getValueSource()).setInitialValue(true);
					((ToggleValueSource)bindedEDataTypeArgument.getValueSource()).setCurrentValue(false);
				}else{
					((ToggleValueSource)bindedEDataTypeArgument.getValueSource()).setCurrentValue(true);
					((ToggleValueSource)bindedEDataTypeArgument.getValueSource()).setInitialValue(false);
				}
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
				((ControllerValueSource)bindedEDataTypeArgument.getValueSource()).setEComponentQualifier((EComponentQualifier)value);
			}
		}

		@Override
		protected Object getValue(Object element) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource ) {
				FixedValueSource fixedValueSource = (FixedValueSource)bindedEDataTypeArgument.getValueSource();
//				fixedValueSource.eAdapters().add(getAdapter());
				if(fixedValueSource.getValue() != null){
					return ((FixedValueSource)bindedEDataTypeArgument.getValueSource()).getValue();
				}else{
					return "";
				}
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
				return ((ToggleValueSource)bindedEDataTypeArgument.getValueSource()).isInitialValue() ? 1 : 0;
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
				return ((ControllerValueSource)bindedEDataTypeArgument.getValueSource()).getEComponentQualifier();
			}
			return null;
		}

		@Override
		protected CellEditor getCellEditor(Object element) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (bindedEDataTypeArgument.getValueSource() instanceof FixedValueSource) {
				return new TextCellEditor(((TableViewer)getViewer()).getTable());
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ToggleValueSource) {
				return new ComboBoxCellEditor(tableViewer.getTable(), toggleStringValues);
			} else if (bindedEDataTypeArgument.getValueSource() instanceof ControllerValueSource) {
				return new ControllerCellEditor(((TableViewer)getViewer()).getTable());
			}
			return null;
		}

		@Override
		protected boolean canEdit(Object element) {
			BindedEDataTypeArgument bindedEDataTypeArgument = (BindedEDataTypeArgument) element;
			if (bindedEDataTypeArgument.getValueSource() != null) {
				return true;
			}
			return false;
		}
		
//		private Adapter getAdapter(){
//			if (adapter == null) {
//				adapter = new EContentAdapter() {
//					@Override
//					public void notifyChanged(Notification notification) {
//						if(notification.getFeature() == ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE){
//							setOperationCall(operationCall);
//						}
//						System.out.println("1:" + notification.getFeature());
//					}
//				};
//			}
//			return argumentsListAdapter;
//
//		}
	}
	
	private class ControllerCellEditor extends CellEditor{
		Text controllerText;
		EComponentQualifier eComponentQualifier;
		
		public ControllerCellEditor(Composite parent) {
			super(parent);
		}		
		
		@Override
		protected Control createControl(Composite parent) {
			controllerText = new Text(parent, SWT.None);
			controllerText.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					ApogyCommonIOJInputFacade.INSTANCE.addSelectComponentAdapter(eComponentQualifier);
				}
			});
			controllerText.addFocusListener(new FocusAdapter(){
				@Override
				public void focusLost(FocusEvent e) {
					ApogyCommonIOJInputFacade.INSTANCE.forceStopSelectComponent(eComponentQualifier);
				}
			});
			return controllerText;
		}

		@Override
		protected Object doGetValue() {
			return eComponentQualifier;
		}

		@Override
		protected void doSetFocus() {
			if(controllerText != null){
				controllerText.setFocus();
			}
		}

		@Override
		protected void doSetValue(Object value) {
			eComponentQualifier = (EComponentQualifier)value;
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
		return (EObject) tableViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Returns the reference to the {@link ArgumentsList}.
	 * 
	 * @return Reference to the {@link ArgumentsList}.
	 */
	public ArgumentsList getArgumentsList() {
		return operationCall.getArgumentsList();
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
	@SuppressWarnings("unchecked")
	public void setOperationCall(OperationCall operationCall) {
		if (this.operationCall != null) {
			this.operationCall.eAdapters().remove(getArgumentsListAdapter());
		}
		this.operationCall = operationCall;

		tableViewer.setInput(EMFProperties.list(ApogyCoreInvocatorPackage.Literals.ARGUMENTS_LIST__ARGUMENTS).observe(operationCall.getArgumentsList()));
		
		packColumns();

		this.operationCall.eAdapters().add(getArgumentsListAdapter());
	}

	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();
		
		if(argumentsListBinder == null){
			argumentsListBinder = new WritableValue<>();
		}

		tableViewer.setContentProvider(new ArgumentsContentProvier(adapterFactory));
		tableViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));

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
			List<Object> objects = new ArrayList<>();
			for(Iterator<?> ite = ((DecoratingObservableList<?>) object).listIterator(); ite.hasNext();){
				System.out.println(ite.next());
			}
			for (Object object1 : ((DecoratingObservableList<?>) object)) {
				System.out.println(object);
				if (object1 instanceof BindedEDataTypeArgument) {
					System.out.println(object1);
					objects.add(object1);
				}
			}
			return objects.toArray();
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
		}
		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			packColumns();
		}
		
	}

	/**
	 * Label provider for the arguments.
	 * XXX
	 */
	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {

		private static final int PARAMETER_COLUMN_ID = 0;
		private static final int VALUE_SOURCE_ID = 1;
		private static final int VALUE_ID = 2;	

		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			ValueSource valueSource = ((BindedEDataTypeArgument) object).getValueSource();
			switch (columnIndex) {
			case PARAMETER_COLUMN_ID:
				str = super.getColumnText(object, 0);
				// Cut the values from the return of the itemProvider labels
				if (str.contains("(")) {
					str = str.substring(0, str.indexOf("("));
				}
				break;
			case VALUE_SOURCE_ID:
				if(valueSource != null){
					str = valueSource.eClass().getName();
				}
				break;
			case VALUE_ID:
				if (valueSource instanceof FixedValueSource) {
					str = ((FixedValueSource) valueSource).getValue();
				} else if (valueSource instanceof ToggleValueSource) {
					str = "Initial : " + String.valueOf(((ToggleValueSource) valueSource).isInitialValue()) + ", Current : " + String.valueOf(((ToggleValueSource) valueSource).isCurrentValue());
				} else if (valueSource instanceof ControllerValueSource) {
					EComponentQualifier qualifier = ((ControllerValueSource) valueSource).getEComponentQualifier();
					str = qualifier.getEControllerName() + "." + qualifier.getEComponentName();
				}
				break;
			default:
				break;
			}
			return str;
		}
		
		@Override
		public Image getColumnImage(Object object, int columnIndex) {
			return null;
		}
		

	}

	/**
	 * Adapter that updates the treeViewer input if the {@link ArgumentsList} is changed.
	 * @return
	 */
	public Adapter getArgumentsListAdapter() {
		if (argumentsListAdapter == null) {
			argumentsListAdapter = new EContentAdapter() {
				@Override
				public void notifyChanged(Notification notification) {
					System.out.println("2:" + notification.getFeature());
					if (notification
							.getFeature() == ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__ARGUMENTS_LIST) {
						if (notification.getNewValue() != null) {
							setOperationCall(((ArgumentsList) notification.getNewValue()).getOperationCall());
							System.out.println(tableViewer.getInput());;
						}
					}
					
					if(notification.getFeature() == ApogyCoreProgramsControllersPackage.Literals.BINDED_EDATA_TYPE_ARGUMENT__VALUE_SOURCE){
						if(notification.getOldValue() != null){
							((EObject)notification.getOldValue()).eAdapters().remove(getArgumentsListAdapter());
						}
						((EObject)notification.getNewValue()).eAdapters().add(getArgumentsListAdapter());
						setOperationCall(((EDataTypeArgument)((EObject) notification.getNewValue()).eContainer()).getOperationCall());
					
					}if(notification.getFeature() == ApogyCoreInvocatorPackage.Literals.EDATA_TYPE_ARGUMENT__VALUE){
						// TODO
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