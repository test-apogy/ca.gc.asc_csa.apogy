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
import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.core.databinding.property.Properties;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.jface.databinding.viewers.ObservableListContentProvider;
import org.eclipse.jface.databinding.viewers.ObservableMapLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;

public class ProgramsListComposite extends ScrolledComposite {

	private DataBindingContext dataBindingContext; 
	
	private TableViewer tableViewer;
	private WritableValue<ProgramsGroup> programsGroupBinder;

	public ProgramsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new FillLayout());
		setExpandHorizontal(true);
		setExpandVertical(true);
		
		Composite tableComposite = new Composite(this, SWT.NONE);
		tableComposite.setLayout(new FillLayout());

		tableViewer = new TableViewer(tableComposite, SWT.BORDER | SWT.FULL_SELECTION);
		Table table = tableViewer.getTable();
		table.setLinesVisible(true);
		tableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableColumn tblclmnName = new TableColumn(table, SWT.NONE);
		tblclmnName.setWidth(100);
		tblclmnName.setText("Name");
		
		this.setContent(tableComposite);
		this.setMinSize(tableComposite.computeSize(SWT.DEFAULT, SWT.DEFAULT));

		dataBindingContext= initDataBindingsCustom();
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
	 * This is used to indicate if a program should belong to the list. By
	 * default all types of {@link Program} are applicable. However the
	 * developers may override this method to exclude some programs from the
	 * list.
	 * 
	 * @param program
	 *            Reference to the program.
	 * @return Return true means the {@link Program} is applicable.
	 */
	protected boolean isApplicable(Object object) {
		// TODO filter by program type
		return true;
	}
	
	/**
	 * Returns the selected {@link Program}.
	 * 
	 * @return Reference to the selected program.
	 */
	public Program getSelectedProgram() {
		return (Program) tableViewer.getStructuredSelection().getFirstElement();
	}

	/**
	 * Sets the programsList in the composite
	 * 
	 * @param programsList
	 */
	public void setProgramsGroup(ProgramsGroup programsGroup) {
		programsGroupBinder.setValue(programsGroup);
	}
	
	public void setSelectedProgram(Program program){
		tableViewer.setSelection(new StructuredSelection(program));
	}

	/**
	 * Creates and returns the data bindings.
	 * 
	 * @return Reference to the data bindings.
	 */
	@SuppressWarnings("unchecked")
	private DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		programsGroupBinder = new WritableValue<>();

		IObservableList<?> operationCallsListObserveList = EMFProperties
				.list(ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS)
				.observeDetail(programsGroupBinder);
		
		ObservableListContentProvider contentProvider = new ObservableListContentProvider();
		tableViewer.setContentProvider(contentProvider);
		tableViewer.setLabelProvider(new ObservableMapLabelProvider(Properties
				.observeEach(contentProvider.getKnownElements(),
						EMFProperties.value(ApogyCommonEMFPackage.Literals.NAMED__NAME))));
		tableViewer.setInput(operationCallsListObserveList);
		
		return bindingContext;
	}
	
	@Override
	public void dispose() {
		if(dataBindingContext != null){
			dataBindingContext.dispose();
		}
		super.dispose();
	}
}