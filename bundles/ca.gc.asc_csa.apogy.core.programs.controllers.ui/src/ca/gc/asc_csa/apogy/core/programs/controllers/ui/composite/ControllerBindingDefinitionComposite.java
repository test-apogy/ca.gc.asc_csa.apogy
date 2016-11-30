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
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.jface.viewers.ColumnViewer;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.viewers.EditingSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectListComposite;
import ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFactory;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.Trigger;
import net.java.games.input.Event;
import net.java.games.input.EventQueue;

public class ControllerBindingDefinitionComposite extends ScrolledComposite {

//	private TreeViewer treeViewer;
//	private Tree treeInstance;
//	private TreeViewerColumn treeViewerParameterColumn;
//
	private Composite composite;
	private EObjectListComposite triggersListComposite;
	
	private Composite eComponentComposite;
//
//	boolean readOnly;

	private OperationCallControllerBinding operationCallControllerBinding;

//	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
//			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;
//
	private DataBindingContext m_bindingContext;

	/**
	 * Create the parentComposite.
	 * 
	 * @param parent
	 *            Reference to the parent parentComposite.
	 * @param style
	 *            Composite style.
	 */
	public ControllerBindingDefinitionComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);

		composite = new Composite(this, SWT.None);
		composite.setLayout(new GridLayout(2, true));
		
		triggersListComposite = new EObjectListComposite(composite, SWT.None) {
			@Override
			protected void newSelection(TreeSelection selection) {
				EObject eObject = ApogyCoreProgramsControllersFactory.eINSTANCE.create((EClass)getSelectedEObject());
				operationCallControllerBinding.setTrigger((Trigger) eObject);
				setEComponentComposite();
				ControllerBindingDefinitionComposite.this.newSelection(selection);
			}
			
			@Override
			protected StyledCellLabelProvider getLabelProvider() {
				return new StyledCellLabelProvider() {
					@Override
					public void update(ViewerCell cell) {
						if (cell.getElement() instanceof EClass) {
							cell.setText(((EClass) cell.getElement()).getName());
						}
					}
				};
			}
		};
		triggersListComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		eComponentComposite = new Composite(composite, SWT.None);
		eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
//get button pressed
//		compositeArguments = new Composite(this, SWT.None);
//		compositeArguments.setLayout(new GridLayout(2, false));

//		treeViewer = new TreeViewer(compositeArguments,
//				SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.SINGLE);
//		treeInstance = treeViewer.getTree();
//		treeInstance.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 2, 2));
//		treeInstance.setLinesVisible(true);
//		treeInstance.setHeaderVisible(true);
//		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
//			@Override
//			public void selectionChanged(SelectionChangedEvent event) {
//				newSelection(event.getSelection());
//			}
//		});
//
//		TreeViewerColumn treeViewerActionColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn treeclmnAction = treeViewerActionColumn.getColumn();
//		treeclmnAction.setWidth(100);
//		treeclmnAction.setText("Parameter");
//
//		treeViewerParameterColumn = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn treeclmnParameter = treeViewerParameterColumn.getColumn();
//		treeclmnParameter.setWidth(100);
//		treeclmnParameter.setText("Value");
//		treeViewerParameterColumn.setEditingSupport(new ArgumentsEditor(treeViewer));
//
//		ApogyCommonEMFUIFacade.INSTANCE.addExpandOnDoubleClick(treeViewer);
//		m_bindingContext = initDataBindingsCustom();
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}
	
	private void setEComponentComposite(){
		
		if(eComponentComposite != null){
			eComponentComposite.dispose();
		}
		
		Trigger trigger = this.operationCallControllerBinding.getTrigger();
		
		if(trigger instanceof TimeTrigger){
			eComponentComposite = new BindedEDataTypeArgumentsComposite(composite, SWT.None);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			
		}else if(trigger instanceof ControllerEdgeTrigger){
			ControllerEdgeTrigger controllerEdgeTrigger = (ControllerEdgeTrigger) trigger;
			eComponentComposite = new Composite(composite, SWT.None);
			eComponentComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
			eComponentComposite.setLayout(new FillLayout(SWT.VERTICAL));
			
			EObjectListComposite edgeTypesComposite = new EObjectListComposite(eComponentComposite, SWT.None){
				@Override
				protected void newSelection(TreeSelection selection) {
					// TODO
					super.newSelection(selection);
				}
				@Override
				protected StyledCellLabelProvider getLabelProvider() {
					return new StyledCellLabelProvider() {
						@Override
						public void update(ViewerCell cell) {
							if (cell.getElement() instanceof EEnumLiteral) {
								cell.setText(((EEnumLiteral) cell.getElement()).getLiteral());
							}
						}
					};
				}
			};
			edgeTypesComposite.setEObjectsList(ApogyCoreProgramsControllersPackage.Literals.EDGE_TYPE.getELiterals());

			Composite controllerComposite = new Composite(eComponentComposite, SWT.None);
			controllerComposite.setLayout(new GridLayout(2, false));
			
			Label label = new Label(controllerComposite, SWT.None);
			label.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
			label.setText("Controller component:");
			
			Button button = new Button(controllerComposite, SWT.None);
			button.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
			button.setText("Select");
			button.addSelectionListener(new SelectionAdapter() {
				boolean continueRun = false;
				
				@Override
				public void widgetSelected(SelectionEvent e) {
					continueRun = true;

					MessageDialog dialog = new MessageDialog(getShell(), "Information", null, "Getting List From Server", MessageDialog.INFORMATION, new String[]{"OK", "Cancel"}, 0);
					dialog.open();
					
					Runnable runnable = new Runnable() {
						@Override
						public void run() {
							ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().getControllers().get(0).getPojoController().poll();
							EventQueue queue = ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().getControllers().get(0).getPojoController().getEventQueue();
							
							Event event = new Event(); 
							System.out.println("TEST");
							while(queue.getNextEvent(event)) {
								System.out.println(event.getComponent());
								controllerEdgeTrigger.getComponentQualifier().setEComponentName(event.getComponent().getName());
								controllerEdgeTrigger.getComponentQualifier().setEControllerName(ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().getControllers().get(0).getName());
								continueRun = false;
//								ControllerEdgeTrigger test = ApogyCoreProgramsControllersFactory.eINSTANCE.createControllerEdgeTrigger();
								dialog.close();
//								if(event.getComponent())
								
								
							}
						}
					};

					while(continueRun){
						runnable.run();
						
						try{
							Thread.sleep(500);
						}catch(InterruptedException error){
							error.printStackTrace();
						}
					}
					
				}
			});
			
			
			composite.layout();
			
			//			button.addSelectionListener(new SelectComponentSelectionAdapter(text, controllerEdgeTrigger));
			
			
			
		}else if(trigger instanceof ControllerStateTrigger){
			
		}
		composite.layout();		
	}

	private class SelectComponentSelectionAdapter extends SelectionAdapter{
		
		final String prompt = "Activate the controller component";
		
		Text text;
		ControllerTrigger controllerTrigger;
		
		Adapter controllerAdapter;
		
		public SelectComponentSelectionAdapter(Text text, ControllerTrigger controllerTrigger) {
			super();
			this.text = text;
			this.controllerTrigger = controllerTrigger;
		}

		@Override
		public void widgetSelected(SelectionEvent e) {
			text.addKeyListener(new KeyAdapter() {

				@Override
				public void keyPressed(KeyEvent e) {
					System.out.println("TEST");
					if (e.keyCode == SWT.ESC) {
						if (text.getText() == prompt) {
							if (controllerTrigger.getComponentQualifier() != null) {
								text.setText(controllerTrigger.getComponentQualifier().getEControllerName() + "."
										+ controllerTrigger.getComponentQualifier().getEComponentName());
							} else {
								text.setText("Click here");

							}
						}
						text.setEnabled(false);
						text.removeKeyListener(this);
						text.removeSelectionListener(SelectComponentSelectionAdapter.this);
					}
				}
			});
			
//			ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().eAdapters().add(getControllerAdapter());
			
			text.setEnabled(true);
			text.setText(prompt);
			
			
		}
		
		private Adapter getControllerAdapter(){
			if (controllerAdapter == null) {
				controllerAdapter = new AdapterImpl() {
					@Override
					public void notifyChanged(Notification notification) {
						Display.getDefault().asyncExec(new Runnable() {
							@Override
							public void run() {
							}
						});
					}

					@Override
					public Notifier getTarget() {
						return null;
					}
				};
			}
			return controllerAdapter;
		}
		
		
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

//	public boolean isReadOnly() {
//		return readOnly;
//	}

	public EObject getSelectedEObject() {
		return null;
//		return (EObject) treeViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Returns the reference to the {@link ArgumentsList}.
	 * 
	 * @return Reference to the {@link ArgumentsList}.
	 */
	public ArgumentsList getArgumentsList() {
		return null;
//		return (ArgumentsList) treeViewer.getInput();
	}

	/**
	 * Gets the {@link EList} of {@link Argument} in the {@link ArgumentsList}.
	 * 
	 * @return List of {@link Argument}.
	 */
	public EList<Argument> getArguments() {
		return null;
//		return operationCall.getArgumentsList().getArguments();
	}

	/**
	 * Binds the {@link OperationCall} with the UI components.
	 * 
	 * @param operationCall
	 *            Reference to the {@link OperationCall}.
	 */
	public void setOperationCallControllerBinding(OperationCallControllerBinding operationCallControllerBinding) {
		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
		this.operationCallControllerBinding = operationCallControllerBinding;
		
		/**
		 * Set the triggers to select
		 */
		EList<EObject> eObjectsEClassList = new BasicEList<EObject>();
		eObjectsEClassList.addAll(ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(
				ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER
						.getEReferenceType()));
		triggersListComposite.setEObjectsList(eObjectsEClassList);
		
		setEComponentComposite();

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

		this.operationCallControllerBinding.eAdapters().add(getAdapter());
	}

	protected DataBindingContext initDataBindingsCustom() {
		m_bindingContext = new DataBindingContext();

//		treeViewer.setContentProvider(new ArgumentsContentProvier(adapterFactory));
//		treeViewer.setLabelProvider(new ArgumentsLabelProvider(adapterFactory));

		return m_bindingContext;
	}

	/**
	 * Content provider for the arguments.
	 * 
	 */
//	private class ArgumentsContentProvier extends AdapterFactoryContentProvider {
//
//		public ArgumentsContentProvier(AdapterFactory adapterFactory) {
//			super(adapterFactory);
//		}
//
//		@Override
//		public Object[] getElements(Object object) {
//			if (object instanceof EObjectReference) {
//				return ((OperationCallControllerBinding) ((EObjectReference) object).getEObject()).getArgumentsList()
//						.getArguments().toArray();
//			}
//			return super.getElements(object);
//		}
//
//		@Override
//		public Object[] getChildren(Object object) {
//			if (object == operationCall) {
//				// Only returns the arguments as children of the operationCall input.
//				if (((OperationCall) object).getArgumentsList() != null) {
//					return ((OperationCall) object).getArgumentsList().getArguments().toArray();
//				}
//				return new Object[]{};
//			}
//			return super.getChildren(object);
//		}
//
//		@Override
//		public boolean hasChildren(Object object) {
//			if (object == operationCall) {
//				return true;
//			}
//			return false;
//		}
//	}
//
//	/**
//	 * Label provider for the arguments.
//	 * 
//	 */
//	private class ArgumentsLabelProvider extends AdapterFactoryLabelProvider {
//
//		private static final int PARAMETER_COLUMN_ID = 0;
//		private static final int VALUE_ID = 1;
//
//		public ArgumentsLabelProvider(AdapterFactory adapterFactory) {
//			super(adapterFactory);
//		}
//
//		@Override
//		public String getColumnText(Object object, int columnIndex) {
//			String str = "<undefined>";
//
//			switch (columnIndex) {
//			case PARAMETER_COLUMN_ID:
//				if (getArguments().contains(object)) {
//					str = super.getColumnText(object, 0);
//					// Cut the values from the return of the itemProvider labels
//					if (str.contains("(")) {
//						str = str.substring(0, str.indexOf("("));
//					}
//					break;
//				}
//				str = object.getClass().getName();
//				break;
//			case VALUE_ID:
//				if (getArguments().contains(object)) {
//					if (object instanceof EDataTypeArgument) {
//						str = ((EDataTypeArgument) object).getValue();
//					} else if (object instanceof EClassArgument) {
//						EClassArgument eClassArgumentObject = (EClassArgument) object;
//						if (eClassArgumentObject.getValue() != null) {
//							str = ((EClassArgument) object).getValue().getClass().getName();
//						}
//					} else if (object instanceof EEnumArgument) {
//						str = ((EEnumArgument) object).getEEnumLiteral().getLiteral();
//					}
//				} else {
//					str = super.getText(object);
//				}
//				break;
//			default:
//				break;
//			}
//			return str;
//		}
//	}

	/**
	 * TODO
	 * @return
	 */
	public Adapter getAdapter() {
		if (adapter == null) {
			adapter = new AdapterImpl() {
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {
		if (this.operationCallControllerBinding != null) {
			this.operationCallControllerBinding.eAdapters().remove(getAdapter());
		}
//		adapterFactory.dispose();
		super.dispose();
	}

}