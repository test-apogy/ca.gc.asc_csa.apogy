package ca.gc.asc_csa.apogy.workspace.ui.composites;
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
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry;
import ca.gc.asc_csa.apogy.workspace.ui.Activator;

public class RegisteredProjectsListComposite extends Composite {
	private TableViewer viewer;
	private Button btnImport;
	private DataBindingContext m_bindingContext;

	public RegisteredProjectsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		viewer = new TableViewer(this, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Table table = viewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		table.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableViewerColumn tableViewerColumnItem_Name = new TableViewerColumn(viewer, SWT.NONE);
		TableColumn trclmnItemName = tableViewerColumnItem_Name.getColumn();
		trclmnItemName.setWidth(200);
		
		btnImport = new Button(this, SWT.NONE);
		btnImport.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					ApogyWorkspaceFacade.INSTANCE.importApogyProject(getSelectedBundle());
				} catch (Exception e) {
					Logger.INSTANCE.log(Activator.ID, "Unable to import the project <" + getSelectedBundle().getSymbolicName() +">", EventSeverity.ERROR, e);
				}
			}
		});
		btnImport.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		btnImport.setText("Import");
		new Label(this, SWT.NONE);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				Bundle bundle = (Bundle) element;				
				return bundle.getSymbolicName();
			}
		});
		viewer.setInput(ProjectProvidersRegistry.INSTANCE.getApogyProjectProviders().toArray());
		m_bindingContext = customInitDataBindings();
	}

	
	public void setApogyProjectProviders(List<Bundle> bundles){		
	}
	
	/**
	 * This method is invoked a when a new selection is selected.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link IProject}.
	 * @return Reference to the project or null if no project is selected.
	 */
	public Bundle getSelectedBundle() {
		return (Bundle) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
	}
	
	protected DataBindingContext customInitDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();
		
		/* Import Button Enabled. */ 
		IObservableValue<?> observeEnabledBtnImportObserveWidget = WidgetProperties.enabled().observe(btnImport);
		IObservableValue<?> observeSingleSelectionViewer = ViewerProperties.singleSelection().observe(viewer);
		bindingContext.bindValue(observeEnabledBtnImportObserveWidget, observeSingleSelectionViewer, null, new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(Bundle.class, Boolean.class){
			@Override
			public Object convert(Object fromObject) {
				return fromObject != null;
			}			
		}));
		//
		return bindingContext;
	}
	
	@Override
	public void dispose() {
		if (m_bindingContext != null){
			m_bindingContext.dispose();
		}
		super.dispose();
	}	
}