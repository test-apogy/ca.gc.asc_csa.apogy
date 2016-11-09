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
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
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

import ca.gc.asc_csa.apogy.core.invocator.Variable;
import ca.gc.asc_csa.apogy.core.invocator.VariablesList;

public class VariablesListComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private TableViewer viewer;
	private Button btnDelete;
	private VariablesList variablesList;

	public VariablesListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		viewer = new TableViewer(this, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
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
		TableColumn trclmnName = tableViewerColumnItem_Name.getColumn();
		trclmnName.setText("Name");
		trclmnName.setWidth(150);
		
		TableViewerColumn tableViewerColumn = new TableViewerColumn(viewer, SWT.NONE);
		TableColumn tblclmnType = tableViewerColumn.getColumn();
		tblclmnType.setWidth(100);
		tblclmnType.setText("Type");

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//				new WizardDialog(parent.getShell(), new NewProjectWizard()).open();
			}
		});
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnNew.setSize(74, 29);
		btnNew.setText("New");

		btnDelete = new Button(composite, SWT.NONE);
//		btnDelete.addSelectionListener(new SelectionAdapter() {
//			@Override
//			public void widgetSelected(SelectionEvent event) {
//				String projectToDeleteMessage = "";
//
//				Iterator<IProject> projects = getSelectedProjects().iterator();
//				while (projects.hasNext()) {
//					IProject project = projects.next();
//					projectToDeleteMessage = projectToDeleteMessage + project.getName();
//
//					if (projects.hasNext()) {
//						projectToDeleteMessage = projectToDeleteMessage + ", ";
//					}
//				}
//
//				MessageDialog dialog = new MessageDialog(null, "Delete the selected project", null,
//						"Are you sure to delete these projects: " + projectToDeleteMessage, MessageDialog.QUESTION,
//						new String[] { "Yes", "No" }, 1);
//				int result = dialog.open();
//				if (result == 0) {
//					for (IProject project : getSelectedProjects()) {
//						try {
//							ApogyWorkspaceFacade.INSTANCE.deleteApogyProject(project);
//						} catch (Exception e) {
//							Logger.INSTANCE.log(Activator.ID,
//									"Unable to delete the project <"
//											+ ApogyWorkspaceFacade.INSTANCE.getActiveProject().getName() + ">",
//									EventSeverity.ERROR, e);
//						}
//					}
//				}
//			}
//		});
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnDelete.setSize(74, 29);
		btnDelete.setText("Delete");
		new Label(this, SWT.NONE);

		viewer.setContentProvider(ArrayContentProvider.getInstance());
//		viewer.setLabelProvider(new LabelProvider() {
//			@Override
//			public String getText(Object element) {
//
//				IProject project = ((IProject) element);
//				String result = project.getName();
//				if (project == ApogyWorkspaceFacade.INSTANCE.getActiveProject()) {
//					result = "<Active> " + result;
//				}
//				return result;
//			}
//		});
		m_bindingContext = customInitDataBindings();

//		viewer.setInput(ApogyWorkspaceFacade.INSTANCE.getWorkspaceApogyProjects().toArray());
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
	public List<Variable> getSelectedVariable() {
		return ((IStructuredSelection) viewer.getSelection()).toList();
	}

	protected DataBindingContext customInitDataBindings() {
		
		DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue<?> observeSingleSelectionViewer = ViewerProperties.singleSelection().observe(viewer);

		/* Delete Button Enabled Binding. */
		IObservableValue<?> observeEnabledBtnDeleteObserveWidget = WidgetProperties.enabled().observe(btnDelete);
		bindingContext.bindValue(observeEnabledBtnDeleteObserveWidget, observeSingleSelectionViewer, null,
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
	 * Sets the {@link VariablesList} in the composite.
	 * @param variablesList Reference the list of {@link Variable}.
	 */
	public void setVariablesList(VariablesList variablesList) {
		this.variablesList = variablesList;

		if (variablesList != null) {
			if (m_bindingContext != null) {
				m_bindingContext.dispose();
			}
			m_bindingContext = customInitDataBindings();
		}
	}
	

	@Override
	public void dispose() {		
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
		}
		super.dispose();
	}
}