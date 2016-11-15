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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.databinding.FeaturePath;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewOperationCallWizard;

public class OperationCallsListComposite extends ScrolledComposite {
	private DataBindingContext m_currentDataBindings;

	private WritableValue<OperationCallsList> operationCallsListBinder;

	private TableViewer tableViewer;
	private Button btnDelete;
	private Button btnNew;

	public OperationCallsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));

		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");

		TableColumn tblclmnFeature = new TableColumn(table, SWT.NONE);
		tblclmnFeature.setWidth(100);
		tblclmnFeature.setText("Feature");

		TableColumn tblclmnCommand = new TableColumn(table, SWT.NONE);
		tblclmnCommand.setWidth(100);
		tblclmnCommand.setText("Command");

		btnNew = new Button(composite, SWT.NONE);
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.setText("New");
		btnNew.setEnabled(false);
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				NewOperationCallWizard newOperationCallWizard = new NewOperationCallWizard(operationCallsListBinder.getValue()) {
					@Override
					public boolean performFinish() {
						// FIXME Move to core + UI facade
						EditingDomain editingDomain = AdapterFactoryEditingDomain
								.getEditingDomainFor(operationCallsListBinder.getValue());

						/** Use the command stack. */
						AddCommand command = new AddCommand(editingDomain, operationCallsListBinder.getValue(),
								ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
								getOperationCall());
						editingDomain.getCommandStack().execute(command);

						OperationCallsListComposite.this.tableViewer.setSelection(new StructuredSelection(getOperationCall()));
						packColumns();
						return true;
					}
				};
				WizardDialog dialog = new WizardDialog(getShell(), newOperationCallWizard);
				dialog.open();
			}
		});

		btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.CENTER, SWT.TOP, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.setEnabled(false);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// FIXME Move to core + UI facade
				EditingDomain editingDomain = AdapterFactoryEditingDomain
						.getEditingDomainFor(operationCallsListBinder.getValue());

				RemoveCommand command = new RemoveCommand(editingDomain, operationCallsListBinder.getValue(),
						ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS,
						getSelectedOperationCall());
				editingDomain.getCommandStack().execute(command);
			}
		});

		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		m_currentDataBindings = initDataBindingsCustom();
	}

	/**
	 * Returns the selected {@link OperationCall}.
	 * 
	 * @return Reference to the selected {@link OperationCall}.
	 */
	public OperationCall getSelectedOperationCall() {
		return (OperationCall) tableViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(ISelection selection) {
	}
	
	/**
	 * This methods packs the columns to adjust their widths
	 */
	private void packColumns(){
		for (TableColumn column : tableViewer.getTable().getColumns()) {
			column.pack();
		}
	}

	/**
	 * Sets the {@link OperationCallsList} in the composite
	 * @param operationCallsList
	 */
	public void setOperationCallsList(OperationCallsList operationCallsList) {
		operationCallsListBinder.setValue(operationCallsList);

		btnNew.setEnabled(true);
		packColumns();
	}

	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {

		DataBindingContext bindingContext = new DataBindingContext();

		operationCallsListBinder = new WritableValue<>();

		/*
		 * Binding for the table
		 */
		IObservableList<?> operationCallsListObserveList = EMFProperties
				.list(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_CONTAINER__OPERATION_CALLS)
				.observeDetail(operationCallsListBinder);

		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(Properties.observeEach(
				contentProvider.getKnownElements(), EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME),
				EMFProperties.value(
						FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.VARIABLE_FEATURE_REFERENCE__VARIABLE,
								ApogyCommonEMFPackage.Literals.NAMED__NAME)),
				EMFProperties.value(FeaturePath.fromList(ApogyCoreInvocatorPackage.Literals.OPERATION_CALL__EOPERATION,
						EcorePackage.Literals.ENAMED_ELEMENT__NAME)))) {
			private final static int NAME_COLUMN_ID = 0;
			private final static int FEATURE_COLUMN_ID = 1;
			private final static int COMMAND_COLUMN_ID = 2;

			@Override
			public String getColumnText(Object element, int columnIndex) {
				String str = "<undefined>";

				if (element instanceof OperationCall) {
					OperationCall operationCall = (OperationCall) element;

					switch (columnIndex) {
					case NAME_COLUMN_ID:
						str = operationCall.getName() == null ? "<unnamed>" : operationCall.getName();
						break;
					case FEATURE_COLUMN_ID:
						str = ApogyCoreInvocatorFacade.INSTANCE.getOperationCallString(operationCall);
						str = str.substring(0, str.indexOf("#"));
						break;
					case COMMAND_COLUMN_ID:
						str = ApogyCoreInvocatorFacade.INSTANCE.getEOperationString(operationCall.getArgumentsList(), operationCall.getEOperation());
						str = str.substring(1,str.length());
						break;
					}
				}
				return str;
			}

		});
		tableViewer.setInput(operationCallsListObserveList);

		/*
		 * Delete Button Enabled Binding.
		 */
		IObservableValue<?> observeSingleSelectionTableViewer = ViewerProperties.singleSelection().observe(tableViewer);

		IObservableValue<?> observeEnabledBtnDeleteObserveWidget = WidgetProperties.enabled().observe(btnDelete);

		bindingContext.bindValue(observeEnabledBtnDeleteObserveWidget, observeSingleSelectionTableViewer, null,
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE)
						.setConverter(new Converter(Object.class, Boolean.class) {
							@Override
							public Object convert(Object fromObject) {
								return fromObject != null;
							}
						}));

		return bindingContext;
	}

	@Override
	public void dispose() {
		if (m_currentDataBindings != null) {
			m_currentDataBindings.dispose();
		}
		super.dispose();
	}
}