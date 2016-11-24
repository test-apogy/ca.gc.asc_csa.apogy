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
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFactory;
import ca.gc.asc_csa.apogy.common.emf.EObjectReference;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;
import ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.VariableWizard;

public class VariablesListComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private Adapter adapter;
	private TableViewer tableViewer;
	private Button btnDelete;
//	private WritableValue<VariablesList> variablesListBinder = new WritableValue<>();
	private VariablesList variablesList;
	
	public VariablesListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		tableViewer = new TableViewer(this, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.V_SCROLL);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		table.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(tableViewer);
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});
			
		TableViewerColumn tableViewerColumnItem_Name = new TableViewerColumn(tableViewer, SWT.NONE);		
		TableColumn trclmnName = tableViewerColumnItem_Name.getColumn();
		trclmnName.setText("Variable/Type");
		trclmnName.setWidth(150);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(tableViewer, SWT.NONE);
		TableColumn tblclmnType = tableViewerColumn.getColumn();
		tblclmnType.setWidth(100);
		tblclmnType.setText("Interface");

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//				new WizardDialog(parent.getShell(), new VariableWizard(variablesListBinder.getValue())).open();
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
//				ApogyCoreInvocatorUIFacade.INSTANCE.deleteVariables(variablesListBinder.getValue(), getSelectedVariables());
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
		return ((IStructuredSelection) tableViewer.getSelection()).toList();
	}

	protected DataBindingContext customInitDataBindings() {
		
		DataBindingContext bindingContext = new DataBindingContext();
		
		/*
		 * Bind variables list.
		 */
//		@SuppressWarnings("unchecked")
//		IObservableList<?> variablesListObserveList = EMFProperties
//				.list(ApogyCoreInvocatorPackage.Literals.VARIABLES_LIST__VARIABLES)
//				.observeDetail(variablesListBinder);
//
//		ViewerSupport.bind(tableViewer, variablesListObserveList,
//				EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME), EMFProperties.value(ApogyCommonEMFPackage.Literals.DESCRIBED__DESCRIPTION));
		
		IObservableValue<?> observeSingleSelectionViewer = ViewerProperties.singleSelection().observe(tableViewer);
		
		/* 
		 * Delete Button Enabled Binding. 
		 */
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
			this.variablesList.getEnvironment().eAdapters().remove(getAdapter());
		}
		this.variablesList = variablesList;
		
		EObjectReference eObjectReference = ApogyCommonEMFFactory.eINSTANCE.createEObjectReference();
		eObjectReference.setEObject(variablesList);
		tableViewer.setInput(eObjectReference);
//		treeViewer.expandAll();
		variablesList.getEnvironment().eAdapters().add(getAdapter());
//		variablesListBinder.setValue(variablesList);
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
								setVariablesList((VariablesList)msg.getNewValue());
							}else{
								tableViewer.setInput(null);
							}
							
						}
					}
				}
			};
		}
		return adapter;
	}

	@Override
	public void dispose() {		
		m_bindingContext.dispose();
		super.dispose();
	}
}