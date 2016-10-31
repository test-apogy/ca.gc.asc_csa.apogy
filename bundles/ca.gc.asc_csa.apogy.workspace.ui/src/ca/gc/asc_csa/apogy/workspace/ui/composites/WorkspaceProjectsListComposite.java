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

import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
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
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade;
import ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage;
import ca.gc.asc_csa.apogy.workspace.ui.Activator;
import ca.gc.asc_csa.apogy.workspace.ui.wizards.NewProjectWizard;

public class WorkspaceProjectsListComposite extends Composite {
	private DataBindingContext m_bindingContext;
	private TableViewer viewer;
	private Button btnOpen;
	private Button btnDelete;
	private Button btnExport;
	private Adapter workspaceAdapter;
	private Button btnClose;

	public WorkspaceProjectsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(2, false));

		viewer = new TableViewer(this, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
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

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		composite.setLayout(new GridLayout(1, false));

		btnOpen = new Button(composite, SWT.NONE);
		btnOpen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					ApogyWorkspaceFacade.INSTANCE.openApogyProject(getSelectedProjects().get(0));
				} catch (Exception e) {
					Logger.INSTANCE.log(Activator.ID,
							"Unable to open project <" + getSelectedProjects().get(0).getName() + ">",
							EventSeverity.ERROR, e);
				}
			}
		});
		btnOpen.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnOpen.setText("Open");

		btnClose = new Button(composite, SWT.NONE);
		btnClose.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				try {
					ApogyWorkspaceFacade.INSTANCE.closeApogyProject();
				} catch (Exception e) {
					if (ApogyWorkspaceFacade.INSTANCE.getActiveProject() == null) {
						Logger.INSTANCE.log(Activator.ID, "There is no active project to close.",
								EventSeverity.WARNING);
					} else {
						Logger.INSTANCE.log(Activator.ID,
								"Unable to close the project <"
										+ ApogyWorkspaceFacade.INSTANCE.getActiveProject().getName() + ">",
								EventSeverity.ERROR, e);
					}
				}
			}
		});
		btnClose.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnClose.setSize(64, 29);
		btnClose.setText("Close");

		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setSize(64, 2);

		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				new WizardDialog(parent.getShell(), new NewProjectWizard()).open();
			}
		});
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnNew.setSize(74, 29);
		btnNew.setText("New");

		btnDelete = new Button(composite, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent event) {
				String projectToDeleteMessage = "";

				Iterator<IProject> projects = getSelectedProjects().iterator();
				while (projects.hasNext()) {
					IProject project = projects.next();
					projectToDeleteMessage = projectToDeleteMessage + project.getName();

					if (projects.hasNext()) {
						projectToDeleteMessage = projectToDeleteMessage + ", ";
					}
				}

				MessageDialog dialog = new MessageDialog(null, "Delete the selected project", null,
						"Are you sure to delete these projects: " + projectToDeleteMessage, MessageDialog.QUESTION,
						new String[] { "Yes", "No" }, 1);
				int result = dialog.open();
				if (result == 0) {
					for (IProject project : getSelectedProjects()) {
						try {
							ApogyWorkspaceFacade.INSTANCE.deleteApogyProject(project);
						} catch (Exception e) {
							Logger.INSTANCE.log(Activator.ID,
									"Unable to delete the project <"
											+ ApogyWorkspaceFacade.INSTANCE.getActiveProject().getName() + ">",
									EventSeverity.ERROR, e);
						}
					}
				}
			}
		});
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnDelete.setSize(74, 29);
		btnDelete.setText("Delete");

		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setLayout(new GridLayout(1, false));
		composite_1.setLayoutData(new GridData(SWT.FILL, SWT.BOTTOM, false, false, 1, 1));

		Button btnImport = new Button(composite_1, SWT.NONE);
		btnImport.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnImport.setText("Import");

		btnExport = new Button(composite_1, SWT.NONE);
		btnExport.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		btnExport.setSize(74, 29);
		btnExport.setText("Export");

		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(new LabelProvider() {
			@Override
			public String getText(Object element) {

				IProject project = ((IProject) element);
				String result = project.getName();
				if (project == ApogyWorkspaceFacade.INSTANCE.getActiveProject()) {
					result = "<Active> " + result;
				}
				return result;
			}
		});
		m_bindingContext = customInitDataBindings();

		viewer.setInput(ApogyWorkspaceFacade.INSTANCE.getWorkspaceApogyProjects().toArray());
	}

	/**
	 * This method is invoked a when a new selection is selected.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link IProject}.
	 * 
	 * @return Reference to the project or null if no project is selected.
	 */
	@SuppressWarnings("unchecked")
	public List<IProject> getSelectedProjects() {
		return ((IStructuredSelection) viewer.getSelection()).toList();
	}

	protected DataBindingContext customInitDataBindings() {
		DataBindingContext bindingContext = new DataBindingContext();

		IObservableValue<?> observeSingleSelectionViewer = ViewerProperties.singleSelection().observe(viewer);
		IObservableValue<?> observeMultipleSelectionViewer = ViewerProperties.singleSelection().observe(viewer);

		/* Open Button Enabled Binding. */
		IObservableValue<?> observeEnabledBtnOpenObserveWidget = WidgetProperties.enabled().observe(btnOpen);
		bindingContext.bindValue(observeEnabledBtnOpenObserveWidget, observeSingleSelectionViewer, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}

						}));

		/* Close Button Enabled Binding. */
		@SuppressWarnings("unchecked")
		IObservableValue<?> observeEnabledWorspaceActiveProject = EMFProperties
				.value(ApogyWorkspacePackage.Literals.APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT)
				.observe(ApogyWorkspaceFacade.INSTANCE);
		IObservableValue<?> observeEnabledBtnCloseObserveWidget = WidgetProperties.enabled().observe(btnClose);
		bindingContext.bindValue(observeEnabledBtnCloseObserveWidget, observeEnabledWorspaceActiveProject, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}
						}));

		/* Delete Button Enabled Binding. */
		IObservableValue<?> observeEnabledBtnDeleteObserveWidget = WidgetProperties.enabled().observe(btnDelete);
		bindingContext.bindValue(observeEnabledBtnDeleteObserveWidget, observeMultipleSelectionViewer, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}
						}));

		/* Export Button Enabled Binding. */
		IObservableValue<?> observeEnabledBtnExportObserveWidget = WidgetProperties.enabled().observe(btnExport);
		bindingContext.bindValue(observeEnabledBtnExportObserveWidget, observeMultipleSelectionViewer, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(IProject.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}
						}));

		ApogyWorkspaceFacade.INSTANCE.eAdapters().add(getWorkspaceAdapter());
		//
		return bindingContext;
	}

	private Adapter getWorkspaceAdapter() {
		if (workspaceAdapter == null) {
			workspaceAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					viewer.setInput(ApogyWorkspaceFacade.INSTANCE.getWorkspaceApogyProjects().toArray());
				}
			};
		}
		return workspaceAdapter;
	}

	@Override
	public void dispose() {
		ApogyWorkspaceFacade.INSTANCE.eAdapters().remove(getWorkspaceAdapter());
		if (m_bindingContext != null) {
			m_bindingContext.dispose();
		}
		super.dispose();
	}
}