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
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.forms.widgets.FormToolkit;
import org.eclipse.ui.forms.widgets.Section;

import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramsGroupWizard;

public class ScriptBasedProgramsListComposite extends Composite
{
	private DataBindingContext m_currentDataBindings;
	
	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private TreeViewer treeViewer;

	private ProgramsList programsList;

	private ISelectionChangedListener treeViewerSelectionChangedListener;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public ScriptBasedProgramsListComposite( Composite parent, int style )
	{
		super( parent, style );
		setLayout( new GridLayout( 1, true ) );
		
		Section sctnProgramsList = formToolkit.createSection(this, Section.TITLE_BAR);
		sctnProgramsList.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		formToolkit.paintBordersFor(sctnProgramsList);
		sctnProgramsList.setText("Programs List");
		
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
		
		treeViewer = new TreeViewer(compositeProgramsList, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 7));
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(treeViewer);
		
		TreeViewerColumn treeViewerColumnItem_Name = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnItemName = treeViewerColumnItem_Name.getColumn();
		trclmnItemName.setWidth(200);
		trclmnItemName.setText("Name");
		
		treeViewer.setContentProvider(new ProgramsListsContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new ProgramsListsLabelProvider(adapterFactory));
		new Label(compositeProgramsList, SWT.NONE);
		
		Button btnNewGroup = formToolkit.createButton(compositeProgramsList, "New Group", SWT.NONE);
		btnNewGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNewGroup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				
				/**
				 * Creates and opens the wizard to create a valid context
				 */
				NewProgramsGroupWizard newProgramsGroupWizard = new NewProgramsGroupWizard();
				WizardDialog dialog = new WizardDialog(getShell(), newProgramsGroupWizard);
			
				dialog.open();
			}
		});
		
		Button btnNewProgram = formToolkit.createButton(compositeProgramsList, "New Program", SWT.NONE);
		btnNewProgram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		
		
		Button btnDelete = new Button(compositeProgramsList, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.adapt(btnDelete, true, true);
		btnDelete.setText("Delete");
		btnNewGroup.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				getSelectedProgram().setArchived(true);
			}
		});
		
		new Label(compositeProgramsList, SWT.NONE);
		
		Button btnUp = new Button(compositeProgramsList, SWT.NONE);
		btnUp.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.adapt(btnUp, true, true);
		btnUp.setText("Up");
		
		Button btnDown = new Button(compositeProgramsList, SWT.NONE);
		btnDown.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		formToolkit.adapt(btnDown, true, true);
		btnDown.setText("Down");
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

	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null){
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ScriptBasedProgramsListComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}
	
	/**
	 * This method is called when a new selection is made in the composite.
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}
	
	/**
	 * Returns the selected program.
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgram() {
		TreeSelection selection = (TreeSelection) treeViewer.getSelection();
		return (Program) selection.getFirstElement();
	}	
	
	
	private class ProgramsListsContentProvider extends AdapterFactoryContentProvider{

		public ProgramsListsContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public Object[] getChildren(Object object) {
			/*if(object instanceof ProgramsList){
				Archivable[] archivable = new Archivable[super.getChildren(object).length];
				for(Object child: super.getChildren(object)){
					archivable[i] = (Archivable) super.getChildren(object)[i];
				}
				if(((Archivable[]) super.getChildren(object)).isArchived()){
					
				}*/
				return (object instanceof ProgramsList || object instanceof ProgramsGroup) ? super.getChildren(object) : null;
			//}
			
		}
	}
	
	private class ProgramsListsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider{
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
		
		
	}

	
	public void setProgramsList(ProgramsList programsList){
		this.programsList = programsList;
		
		if (programsList != null){
			if (m_currentDataBindings != null){
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	protected DataBindingContext initDataBindings()
	{
		return initDataBindingsCustom();
	}
	
	protected DataBindingContext initDataBindingsCustom()
	{
		DataBindingContext bindingContext = new DataBindingContext();
	
		if(programsList != null)
		{
			if(!treeViewer.getTree().isDisposed())
			{
				treeViewer.setInput(programsList);
				treeViewer.expandAll();
			}
		}		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
		
		return bindingContext;
	}
	
	@Override
	public void dispose()
	{
		if (m_currentDataBindings != null){
			m_currentDataBindings.dispose();
		}
		super.dispose();
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
}