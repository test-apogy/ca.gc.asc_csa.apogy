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

import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.VariableWizard;

public class VariablesListComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private Adapter adapter;
	
	private TreeViewer treeViewer;
	private Button btnDelete;
//	private WritableValue<VariablesList> variablesListBinder = new WritableValue<>();
	
	private VariablesList variablesList;
	
	public VariablesListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.V_SCROLL);
		Tree tree = treeViewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		tree.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(treeViewer);
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
			}
		});
			
		TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(treeViewer, SWT.NONE);		
		TreeColumn trclmnName = treeViewerColumnName.getColumn();
		trclmnName.setText("Name");
		trclmnName.setWidth(150);
		
		TreeViewerColumn treeViewerColumnInterface = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnInterface = treeViewerColumnInterface.getColumn();
		trclmnInterface.setWidth(100);
		trclmnInterface.setText("Interface");

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				new WizardDialog(parent.getShell(), new VariableWizard(variablesList)).open();
			}
		});
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnNew.setSize(74, 29);
		btnNew.setText("New");

		btnDelete = new Button(composite, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				ApogyCoreInvocatorUIFacade.INSTANCE.deleteVariables(variablesList, getSelectedVariables());
			}
		});
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnDelete.setSize(74, 29);
		btnDelete.setText("Delete");
		m_bindingContext = customInitDataBindings();
	}
	
	/**
	 * This method is invoked a when a new selection is selected.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link Variable}.
	 * 
	 * @return Reference to the list of {@link Variable}.
	 */
	@SuppressWarnings("unchecked")
	public List<Variable> getSelectedVariables() {
		return ((IStructuredSelection) treeViewer.getSelection()).toList();
	}
	
	public VariableFeatureReference getSelectedVariableFeatureReference(){
		VariableFeatureReference variableFeatureReference = ApogyCoreInvocatorFactory.eINSTANCE.createVariableFeatureReference();
		ITreeSelection selection = treeViewer.getStructuredSelection();

		if (selection.getFirstElement() instanceof Variable) {
			variableFeatureReference.setVariable((Variable) selection.getFirstElement());
		} else if (selection.getFirstElement() instanceof TypeMember) {
			variableFeatureReference.setVariable((Variable) selection.getPaths()[0].getFirstSegment());

			TypeMemberReferenceListElement typeMemberReferenceListElement = ApogyCoreInvocatorFactory.eINSTANCE
					.createTypeMemberReferenceListElement();
			typeMemberReferenceListElement.setTypeMember((TypeMember) selection.getPaths()[0].getLastSegment());
			variableFeatureReference.setTypeMemberReferenceListElement(typeMemberReferenceListElement);
		}
		
		return variableFeatureReference;
	}
	
	public Variable getSelectedVariable(){
		return (Variable) treeViewer.getStructuredSelection().getPaths()[0].getFirstSegment();
	}

	protected DataBindingContext customInitDataBindings() {
		
		DataBindingContext bindingContext = new DataBindingContext();
		

		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory){
			@Override
			public Object[] getElements(Object object) {
				return super.getElements(((EObjectReference) object).getEObject());
			}
			@Override
			public Object[] getChildren(Object object) {
				if(object instanceof Variable){
					return ((Variable) object).getVariableType().getMembers().toArray();
				}
				return super.getChildren(object);
			}
			@Override
			public Object getParent(Object object) {
				return super.getParent(object);
			}
			@Override
			public boolean hasChildren(Object object) {
				if(object instanceof Variable || object instanceof VariablesList){
					return true;
				}
				return false;
			}
		});
		
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory){
			private final int NAME_COLUMN_ID = 0;
			private final int INTERFACE_COLUMN_ID = 1;
			
			@Override
			public String getColumnText(Object object, int columnIndex) {
				String str = "<undefined>";
				
				switch (columnIndex){
					case NAME_COLUMN_ID:
						if(object instanceof Variable){
							str = ((Variable) object).getName();
						}else if(object instanceof TypeMember){
							str = ((TypeMember) object).getName();
						}
						break;
					case INTERFACE_COLUMN_ID:
						if(object instanceof Variable){
							str = ((Variable) object).getVariableType().getInterfaceClass().getInstanceTypeName();
						}else if(object instanceof TypeMember){
							str = ((TypeMember) object).getMemberType().getInterfaceClass().getInstanceClassName();
						}
						break;
					default:
						break;
				}
				
				return str;
				}
		});
		
		/* 
		 * Delete Button Enabled Binding. 
		 */
		IObservableValue<?> observeSingleSelectionViewer = ViewerProperties.singleSelection().observe(treeViewer);
		
		IObservableValue<?> enabledBtnDeleteObserveWidget = WidgetProperties.enabled().observe(btnDelete);
		bindingContext.bindValue(enabledBtnDeleteObserveWidget, observeSingleSelectionViewer, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}
						}));
		
		return bindingContext;
	}
	
	/**
	 * Sets the {@link VariablesList} in the parentComposite.
	 * @param variablesList Reference the list of {@link Variable}.
	 */
	public void setVariablesList(VariablesList variablesList) {
		if(this.variablesList != null){
			this.variablesList.eAdapters().remove(getAdapter());
			this.variablesList.getEnvironment().eAdapters().remove(getAdapter());
		}
		this.variablesList = variablesList;
		
		EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
		eObjectReference.setEObject(variablesList);
		treeViewer.setInput(eObjectReference);
		treeViewer.expandAll();
		for(TreeColumn column: treeViewer.getTree().getColumns()){
			column.pack();
		}
		variablesList.eAdapters().add(getAdapter());
		variablesList.getEnvironment().eAdapters().add(getAdapter());
	}
	
	private Adapter getAdapter(){
		if(adapter == null){
			adapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if(msg.getNotifier() instanceof Environment)
					{
						if (msg.getFeatureID(
								Environment.class) == ApogyCoreInvocatorPackage.ENVIRONMENT__VARIABLES_LIST) {
							if(msg.getNewValue() != null){
								setVariablesList(((VariablesList)msg.getNewValue()));
							}else{
								treeViewer.setInput(null);
							}
							
						}
					}
					if(msg.getNotifier() instanceof VariablesList)
					{
						if (msg.getFeatureID(
								VariablesList.class) == ApogyCoreInvocatorPackage.VARIABLES_LIST__VARIABLES) {
							setVariablesList(variablesList);
						}
					}
				}
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {		
		if(variablesList != null){
			this.variablesList.eAdapters().remove(getAdapter());
		}
		m_bindingContext.dispose();
		super.dispose();
	}
}