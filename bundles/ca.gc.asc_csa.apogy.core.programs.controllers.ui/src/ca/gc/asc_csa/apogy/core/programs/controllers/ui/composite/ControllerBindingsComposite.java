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

import org.eclipse.core.databinding.observable.ChangeEvent;
import org.eclipse.core.databinding.observable.IChangeListener;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.Viewer;
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
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ui.wizards.NewChildWizard;
import ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation;
import ca.gc.asc_csa.apogy.core.invocator.Argument;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.edit.EMFEcoreInvocatorEditUtilities;
import ca.gc.asc_csa.apogy.core.programs.controllers.BindedEDataTypeArgument;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerEdgeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger;
import ca.gc.asc_csa.apogy.core.programs.controllers.ui.wizards.NewControllerBindingWizard;

public class ControllerBindingsComposite extends Composite {

	private ISelectionChangedListener selectionChangedListener;
	
	private ControllersConfiguration controllersConfiguration;
	
	private TableViewer tableViewer;

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
		
		tableViewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		TableViewerColumn tableViewerActionColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnAction = tableViewerActionColumn.getColumn();
		tblclmnAction.setWidth(100);
		tblclmnAction.setText("Action");
		tableViewerActionColumn.setLabelProvider(new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});
		
		TableViewerColumn tableViewerParameterColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnParameter = tableViewerParameterColumn.getColumn();
		tblclmnParameter.setWidth(100);
		tblclmnParameter.setText("Parameter");
		tableViewerParameterColumn.setLabelProvider(new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});
	
		TableViewerColumn tableViewerControllerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnController = tableViewerControllerColumn.getColumn();
		tblclmnController.setWidth(100);
		tblclmnController.setText("Controller");
		tableViewerControllerColumn.setLabelProvider(new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});

		TableViewerColumn tableViewerTypeColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnType = tableViewerTypeColumn.getColumn();
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");
		tableViewerTypeColumn.setLabelProvider(new ColumnLabelProvider(){
			@Override
			public String getText(Object element) {
				// TODO Auto-generated method stub
				return super.getText(element);
			}
		});

//		TreeViewer treeViewer = new TreeViewer(this, SWT.BORDER);
//		Tree tree = treeViewer.getTree();
//		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
//		
//		TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn trclmnNewColumnName = treeViewerColumnName.getColumn();
//		trclmnNewColumnName.setWidth(100);
//		trclmnNewColumnName.setText("Name");
//		
//		TreeViewerColumn treeViewerColumnParameters = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn trclmnNewColumnParameters = treeViewerColumnParameters.getColumn();
//		trclmnNewColumnParameters.setWidth(100);
//		trclmnNewColumnParameters.setText("Parameters");
//		
//		TreeViewerColumn treeViewerColumnControllerBinding = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn trclmnNewColumnControllerBinding = treeViewerColumnControllerBinding.getColumn();
//		trclmnNewColumnControllerBinding.setWidth(100);
//		trclmnNewColumnControllerBinding.setText("Controller Binding");
//		
//		TreeViewerColumn treeViewerColumnType = new TreeViewerColumn(treeViewer, SWT.NONE);
//		TreeColumn trclmnNewColumnType = treeViewerColumnType.getColumn();
//		trclmnNewColumnType.setWidth(100);
//		trclmnNewColumnType.setText("Type");		
		
		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				NewControllerBindingWizard newControllerBindingWizard = new NewControllerBindingWizard(controllersConfiguration);
				// Listener that sets the new child as the selected item
				newControllerBindingWizard.getCreatedControllerBinding().addChangeListener(new IChangeListener() {
					@SuppressWarnings("unchecked")
					@Override
					public void handleChange(ChangeEvent event) {
						tableViewer.setSelection(new StructuredSelection(((WritableValue<OperationCallControllerBinding>)event.getObservable()).getValue()));
					}
				});
				WizardDialog dialog = new WizardDialog(getShell(), newControllerBindingWizard);

				dialog.open();
				System.out.println("ControllerBindingsComposite.ControllerBindingsComposite() BTN NEW");
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
		
		tableViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
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
		this.controllersConfiguration = controllersConfiguration;
	}
	
	public OperationCallControllerBinding getOperationCallControllerBinding(){
		return (OperationCallControllerBinding) tableViewer.getStructuredSelection().getFirstElement();
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
				}else if(object instanceof Argument){
					((BindedEDataTypeArgument)object).getOperationCall().getName();
				}
				break;
			case PARAMETER_COLUMN_ID:
				str = ((OperationCallControllerBinding)object).getArgumentsList().getArguments().get(0).getEParameter().getEOperation().getName();
				break;
			case CONTROLLER_COLUMN_ID:
				if(object instanceof ControllerTrigger){
					str = ((ControllerStateTrigger)object).getComponentQualifier().getEControllerName() + "." + ((ControllerTrigger)object).getComponentQualifier().getEComponentName();
					if(object instanceof ControllerEdgeTrigger){
						str += "." + ((ControllerEdgeTrigger)object).getEdgeType().getLiteral();
					}
				}else if(object instanceof TimeTrigger){
					str = Long.toString(((TimeTrigger)object).getRefreshPeriod()) + " ms";
				}
				break;
			case TYPE_COLUMN_ID:
				if(object instanceof Variable){
					str = ((Variable)object).getName();
					if(((Variable) object).eContainer() instanceof Variable){
						str = new StringBuilder(new StringBuilder(str).insert(0, ".").toString()).insert(0, ((Variable)((Variable) object).eContainer()).getName()).toString();
					}
				}else if(object instanceof TypeMemberReference){
					str = ((TypeMember)object).getName();
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
	private class ControllerBindingsContentProvider implements
			ITreeContentProvider {

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public void dispose() {
		}

		@Override
		public boolean hasChildren(Object element) {
			return (!((AbstractTypeImplementation) element)
					.getTypeMemberImplementations().isEmpty());
		}

		@Override
		public Object getParent(Object element) {
			/** Not used. */
			return null;
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return null; //TODO: Get elements
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			AbstractTypeImplementation abstractTypeImplementation = (AbstractTypeImplementation) parentElement;
			return abstractTypeImplementation.getTypeMemberImplementations()
					.toArray();
		}
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}