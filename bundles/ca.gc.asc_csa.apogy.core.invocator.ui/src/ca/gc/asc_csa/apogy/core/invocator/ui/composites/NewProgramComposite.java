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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ComboViewer;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;
import org.eclipse.ui.views.properties.tabbed.ISection;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;

public class NewProgramComposite extends Composite
{
	private DataBindingContext m_currentDataBindings;
	
	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ProgramsList programsList;
	private ProgramsGroup programsGroup;
	private EClass programSuperClass;
	
	private ComboViewer comboProgramsGroups;
	private ComboViewer comboProgramsTypes;

	/*private ISelectionChangedListener comboProgramsGroupsSelectionChangedListener;
	private ISelectionChangedListener comboProgramsTypesSelectionChangedListener;*/
	//private ISelectionChangedListener selectionChangedListener;

	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public NewProgramComposite( Composite parent, int style )
	{
		super( parent, style );
		setLayout( new GridLayout( 1, true ) );
		
		Section sctnProgramsList = formToolkit.createSection(this, Section.NO_TITLE);
		sctnProgramsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(sctnProgramsList);
		
		ScrolledComposite scrolledComposite = new ScrolledComposite(sctnProgramsList, SWT.H_SCROLL | SWT.V_SCROLL);
		formToolkit.adapt(scrolledComposite);
		formToolkit.paintBordersFor(scrolledComposite);
		sctnProgramsList.setClient(scrolledComposite);
		scrolledComposite.setExpandHorizontal(true);
		scrolledComposite.setExpandVertical(true);
		
		Composite compositeProgramsList = new Composite(scrolledComposite, SWT.NONE);
		formToolkit.adapt(compositeProgramsList);
		formToolkit.paintBordersFor(compositeProgramsList);
		compositeProgramsList.setLayout(new GridLayout(2, false));
		
		Label lblProgramType = new Label(compositeProgramsList, SWT.NONE);
		lblProgramType.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		formToolkit.adapt(lblProgramType, true, true);
		lblProgramType.setText("Program Type");
		
		comboProgramsTypes = new ComboViewer(compositeProgramsList, SWT.NONE);
		Combo comboProgramType = comboProgramsTypes.getCombo();
		comboProgramType.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(comboProgramType);
		
		comboProgramsTypes.setContentProvider(new ProgramsTypeContentProvider(adapterFactory));
		comboProgramsTypes.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				return ((EClass) element).getName();
			}
		});
		
		Label lblGroup = new Label(compositeProgramsList, SWT.NONE);
		lblGroup.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));
		formToolkit.adapt(lblGroup, true, true);
		lblGroup.setText("Group");
		
		comboProgramsGroups = new ComboViewer(compositeProgramsList, SWT.NONE);
		Combo comboGroup = comboProgramsGroups.getCombo();
		comboGroup.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		formToolkit.paintBordersFor(comboGroup);
				
		comboProgramsGroups.setContentProvider(new ProgramsGroupContentProvider(adapterFactory));
		comboProgramsGroups.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				return element instanceof ProgramsGroup ? ((ProgramsGroup) element).getName() : null;
			}
		});
		
		scrolledComposite.setContent(compositeProgramsList);
		scrolledComposite.setMinSize(compositeProgramsList.computeSize(SWT.DEFAULT, SWT.DEFAULT));
	}
	
	/**
	 * This is used to indicate if a program should belong to the list.  By default all types of {@link Program} are applicable.
	 * However the developers may override this method to exclude some programs from the list.
	 * @param program Reference to the program.
	 * @return Return true means the {@link Program} is applicable.
	 */
	protected boolean isApplicable(Program program) {
		return true;
	}
	
	/*private ISelectionChangedListener getSelectionChangedListener() {
		if (selectionChangedListener == null){
			selectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					NewProgramComposite.this.newSelection((StructuredSelection)event.getSelection());
				}
			};
		}
		return selectionChangedListener;
	}*/
	
	public ComboViewer getComboProgramsGroups() {
		return comboProgramsGroups;
	}

	public ComboViewer getComboProgramsType() {
		return comboProgramsTypes;
	}

	/*private ISelectionChangedListener getComboProgramsTypesSelectionChangedListener() {
		if (comboProgramsTypesSelectionChangedListener == null){
			comboProgramsTypesSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					NewProgramComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return comboProgramsTypesSelectionChangedListener;
	}*/
	

	/*private ISelectionChangedListener getComboProgramsGroupsSelectionChangedListener() {
		if (comboProgramsGroupsSelectionChangedListener == null){
			comboProgramsGroupsSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					programsGroup = (ProgramsGroup) ((StructuredSelection) event.getSelection()).getFirstElement();
				//	NewProgramComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return comboProgramsGroupsSelectionChangedListener;
	}*/
	
	
	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(StructuredSelection selection) {
	}
	
	public void setProgramSuperClass(EClass programSuperClass){
		this.programSuperClass = programSuperClass;
		
		if (programSuperClass != null){
			if (m_currentDataBindings != null){
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}
	
	/**
	 * Returns the selected program.
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgramTypes() {
		TreeSelection selection = (TreeSelection) comboProgramsTypes.getSelection();
		return (Program) selection.getFirstElement();
	}	
	
	/**
	 * Returns the selected program.
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgramGroup() {
		TreeSelection selection = (TreeSelection) comboProgramsGroups.getSelection();
		return (Program) selection.getFirstElement();
	}
	
	
	private class ProgramsTypeContentProvider extends AdapterFactoryContentProvider{
		
		public ProgramsTypeContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (programSuperClass != null) {
				return ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(programSuperClass).toArray();
			}
			Object[] objects = new Object[0];
			return objects;
		}
		
	}
	
	
	private class ProgramsGroupContentProvider extends AdapterFactoryContentProvider{

		public ProgramsGroupContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public Object[] getChildren(Object object) {
				return (object instanceof ProgramsList) ? super.getChildren(object) : null;			
		}
	}
	
	/*private class ProgramsListsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider{
		private final static int NAME_COLUMN_ID = 0;
		private final static int DESCRIPTION_COLUMN_ID = 1;
		
		public ProgramsListsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";		
			
			Named named = (Named) object;
			
			switch (columnIndex) {
			case NAME_COLUMN_ID:
				str = named.getName() == null ? "<unnamed>" : named.getName();
				break;
			}
			
			return str;
		}	
		
		
	}*/
	
	public ProgramsGroup getProgramsGroup(){
		if(comboProgramsGroups.getSelection() instanceof ProgramsGroup){
			return (ProgramsGroup) comboProgramsGroups.getSelection();
		}
		return null;
	}
	
	public EClass getProgramsType(){
		if(comboProgramsTypes.getSelection() instanceof EClass){
			return (EClass) comboProgramsTypes.getSelection();
		}
		return null;
	}

	/*
	public void setProgramsList(ProgramsList programsList){
		this.programsList = programsList;
		
		if (programsList != null){
			if (m_currentDataBindings != null){
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}*/
	
	
	public void setProgramsList(ProgramsList programsList){
		this.programsList = programsList;
		
		if (programsList != null){
			if (m_currentDataBindings != null){
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}
	
	public void setProgramsList(ProgramsList programsList, ProgramsGroup selectedGroup){
		this.programsGroup = selectedGroup;
		setProgramsList(programsList);
	}

	protected DataBindingContext initDataBindings()
	{
		return initDataBindingsCustom();
	}
	
	protected DataBindingContext initDataBindingsCustom()
	{
		DataBindingContext bindingContext = new DataBindingContext();

		if (programsList != null) {
			if (!comboProgramsGroups.getCombo().isDisposed()) {
				comboProgramsGroups.setInput(programsList);
				if(programsGroup != null){
					ISelection selection = new StructuredSelection(programsGroup);
					comboProgramsGroups.setSelection(selection);
				}

			}
		}

		if (!comboProgramsTypes.getCombo().isDisposed()) {
			comboProgramsTypes.setInput(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		}
		
		
		
		//comboProgramsGroups.addSelectionChangedListener(getComboProgramsGroupsSelectionChangedListener());
		//comboProgramsTypes.addSelectionChangedListener(getSelectionChangedListener());
		
		return bindingContext;
	}
	
	@Override
	public void dispose()
	{
		if (m_currentDataBindings != null){
			m_currentDataBindings.dispose();
		}
		super.dispose();
	}
}