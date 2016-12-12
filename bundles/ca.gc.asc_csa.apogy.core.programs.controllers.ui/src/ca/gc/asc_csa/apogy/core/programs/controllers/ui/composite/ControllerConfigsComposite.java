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

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.jface.databinding.swt.WidgetProperties;
import org.eclipse.jface.databinding.viewers.ViewerProperties;
import org.eclipse.jface.databinding.viewers.ViewerSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFacade;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersFactory;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

public class ControllerConfigsComposite extends ScrolledComposite {

	private DataBindingContext dataBindingContext;
	
	private TableViewer tableViewer;
	
	private WritableValue<ProgramsGroup> controllersGroupBinder;
	
	private Button btnDelete;
	private Button btnActivate;
	private Button btnDeactivate;

	/**
	 * Creates the parentComposite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ControllerConfigsComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayout(new GridLayout(2, false));	
		
		tableViewer = new TableViewer(composite, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setLinesVisible(true);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 5));
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setWidth(100);		
	
		Button btnNew = new Button(composite, SWT.NONE);
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.setText("New");
		btnNew.setEnabled(true);
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {

				ControllersConfiguration config = (ControllersConfiguration) ApogyCoreProgramsControllersFactory.eINSTANCE
						.create(ApogyCoreProgramsControllersPackage.Literals.CONTROLLERS_CONFIGURATION);
				config.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(controllersGroupBinder.getValue(), config, ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
				
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroupBinder.getValue());
				AddCommand command = new AddCommand(editingDomain, controllersGroupBinder.getValue(),
						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, config);
				
				editingDomain.getCommandStack().execute(command);
				
				tableViewer.setSelection(new StructuredSelection(config));
			}
		});

		btnDelete = new Button(composite, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		btnDelete.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroupBinder.getValue());
				RemoveCommand command = new RemoveCommand(editingDomain, controllersGroupBinder.getValue(),
						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, getSelectedControllerConfiguration());
				
				editingDomain.getCommandStack().execute(command);
			}
		});
		
		Label label = new Label(composite, SWT.SEPARATOR | SWT.HORIZONTAL);
		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		btnActivate = new Button(composite, SWT.NONE);
		btnActivate.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnActivate.setText("Activate");
		btnActivate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ApogyCoreProgramsControllersFacade.INSTANCE.setActiveControllersConfiguration(
						(ControllersConfiguration) tableViewer.getStructuredSelection().getFirstElement(), true);
			}
		});

		btnDeactivate = new Button(composite, SWT.NONE);
		btnDeactivate.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDeactivate.setText("Deactivate");
		btnDeactivate.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				ApogyCoreProgramsControllersFacade.INSTANCE.setActiveControllersConfiguration(
						(ControllersConfiguration) tableViewer.getStructuredSelection().getFirstElement(), false);
			}
		});
		
		setContent(composite);
		setMinSize(composite.computeSize(SWT.DEFAULT, SWT.DEFAULT));
		
		dataBindingContext = initDataBindingsCustom();
	}

	protected void newSelection(ISelection selection) {
	}
	
	public ControllersConfiguration getSelectedControllerConfiguration() {
		return (ControllersConfiguration) tableViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Sets the root object for the parentComposite
	 * 
	 * @param eObject
	 *            The root eObject
	 */
	public void setControllersGroup(ProgramsGroup controllersGroup) {
		controllersGroupBinder.setValue(controllersGroup);
	}
	
	@SuppressWarnings("unchecked")
	protected DataBindingContext initDataBindingsCustom() {

		dataBindingContext = new DataBindingContext();

		controllersGroupBinder = new WritableValue<>();

		/*
		 * Binding for the table
		 */
		IObservableList<?> programGroupProgramsObserveList = EMFProperties
				.list(ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS)
				.observeDetail(controllersGroupBinder);

		ViewerSupport.bind(tableViewer, programGroupProgramsObserveList, EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME));
		tableViewer.setInput(programGroupProgramsObserveList);

		/*
		 * Delete Button Enabled Binding.
		 */
		IObservableValue<?> tableViewerSingleSelectionObserveValue = ViewerProperties.singleSelection().observe(tableViewer);
		
		IObservableValue<?> enableDeleteButtonObserveValue = WidgetProperties.enabled().observe(btnDelete);
		dataBindingContext.bindValue(enableDeleteButtonObserveValue, tableViewerSingleSelectionObserveValue, null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(ControllersConfiguration.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						if(fromObject != null){
							return true;
						}
						return false;
					}
				}));
		
		IObservableValue<?> enableActivateButtonObserveValue = WidgetProperties.enabled().observe(btnActivate);
		dataBindingContext.bindValue(enableActivateButtonObserveValue, tableViewerSingleSelectionObserveValue, null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(ControllersConfiguration.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						if(fromObject != null){
							ControllersConfiguration config = (ControllersConfiguration) fromObject;
							if(config.isActive()){
								return false;
							}
							return true;
						}
						return false;
					}
				}));
		
		IObservableValue<?> enableDeactivateButtonObserveValue = WidgetProperties.enabled().observe(btnDeactivate);
		dataBindingContext.bindValue(enableDeactivateButtonObserveValue, tableViewerSingleSelectionObserveValue, null, 
				new UpdateValueStrategy(UpdateValueStrategy.POLICY_UPDATE).setConverter(new Converter(ControllersConfiguration.class, Boolean.class) {
					@Override
					public Object convert(Object fromObject) {
						if(fromObject != null){
							ControllersConfiguration config = (ControllersConfiguration) fromObject;
							if(config.isActive()){
								return true;
							}
						}
						return false;
					}
				}));
	

		return dataBindingContext;
	}
	
	
	
}