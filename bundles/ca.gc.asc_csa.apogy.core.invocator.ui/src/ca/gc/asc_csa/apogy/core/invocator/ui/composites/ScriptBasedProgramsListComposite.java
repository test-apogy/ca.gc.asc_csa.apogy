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
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.util.LocalSelectionTransfer;
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
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.FileTransfer;
import org.eclipse.swt.dnd.Transfer;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewProgramsGroupWizard;
import ca.gc.asc_csa.apogy.core.invocator.ui.wizards.NewScriptBasedProgramWizard;

public class ScriptBasedProgramsListComposite extends Composite {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	private TreeViewer treeViewer;

	private ProgramsList programsList;

	private ISelectionChangedListener treeViewerSelectionChangedListener;
	private final FormToolkit formToolkit = new FormToolkit(Display.getDefault());

	public ScriptBasedProgramsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));

		Section sctnProgramsList = formToolkit.createSection(this, Section.NO_TITLE);
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
		tree.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(treeViewer);
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());

		TreeViewerColumn treeViewerColumnItem_Name = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnItemName = treeViewerColumnItem_Name.getColumn();
		trclmnItemName.setWidth(200);
		trclmnItemName.setText("Name");

		treeViewer.setContentProvider(new ProgramsListsContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new ProgramsListsLabelProvider(adapterFactory));

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
		btnNewProgram.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {

				/**
				 * Creates and opens the wizard to create a valid context
				 */
				NewScriptBasedProgramWizard newScriptBasedProgramWizard = new NewScriptBasedProgramWizard(
						getSelectedProgramsGroup());
				WizardDialog dialog = new WizardDialog(getShell(), newScriptBasedProgramWizard);

				dialog.open();
			}
		});

		Button btnDelete = new Button(compositeProgramsList, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		formToolkit.adapt(btnDelete, true, true);
		btnDelete.setText("Delete");
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(getSelectedProgramsGroup());
				EObject owner = null;
				if (isProgramSelected()) {
					owner = getSelectedProgram();

				} else if (isProgramsGroupSelected()) {
					owner = getSelectedProgramsGroup();
				}
				if (owner != null) {
					SetCommand command = new SetCommand(editingDomain, owner,
							ApogyCommonEMFPackage.Literals.ARCHIVABLE__ARCHIVED, true);
					editingDomain.getCommandStack().execute(command);
				}
			}
		});
		new Label(compositeProgramsList, SWT.NONE);
		
		new Label(compositeProgramsList, SWT.NONE);
		scrolledComposite.setContent(compositeProgramsList);
		scrolledComposite.setMinSize(compositeProgramsList.computeSize(SWT.DEFAULT, SWT.DEFAULT));
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
	protected boolean isApplicable(Program program) {
		return true;
	}

	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (treeViewerSelectionChangedListener == null) {
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					ScriptBasedProgramsListComposite.this.newSelection((TreeSelection) event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}

	/**
	 * This method is called when a new selection is made in the composite.
	 * 
	 * @param selection
	 *            Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection) {
	}

	/**
	 * Returns the selected program.
	 * 
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgram() {
		if (isProgramSelected()) {
			return (Program) ((TreeSelection) treeViewer.getSelection()).getFirstElement();
		}
		return null;
	}

	public ProgramsGroup getSelectedProgramsGroup() {
		Object selection = ((TreeSelection) treeViewer.getSelection()).getFirstElement();
		if (isProgramSelected()) {
			return ((Program) selection).getProgramsGroup();
		} else if (isProgramsGroupSelected()) {
			return (ProgramsGroup) selection;
		}
		return null;
	}

	private boolean isProgramsGroupSelected() {
		return ((TreeSelection) treeViewer.getSelection()).getFirstElement() instanceof ProgramsGroup;
	}

	private boolean isProgramSelected() {
		return ((TreeSelection) treeViewer.getSelection()).getFirstElement() instanceof Program;
	}

	private class ProgramsListsContentProvider extends AdapterFactoryContentProvider {

		public ProgramsListsContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public Object[] getElements(Object object) {
			List<Object> elements = new ArrayList<Object>();
			elements.addAll(Arrays.asList(super.getElements(object)));
			for (Iterator<Object> ite = elements.iterator(); ite.hasNext();) {
				Object element = ite.next();
				if (element == ApogyCoreInvocatorFacade.INSTANCE.getControllersGroup()) {
					ite.remove();
				}

			}
			return elements.toArray();
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			treeViewer.refresh();
		}

		@Override
		public int hashCode() {
			if(getData() instanceof Named){
				return ((Named) getData()).hashCode();
			}
			return super.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if(getData() instanceof Named && obj instanceof Named){
				return ((Named) getData()).getName() == ((Named) obj).getName();
			}
			return super.equals(obj);
		}
		
		@Override
		public Object[] getChildren(Object object) {
			if (object instanceof ProgramsList || object instanceof ProgramsGroup) {

				if (object instanceof Archivable) {
					if (((Archivable) object).isArchived()) {
						return null;
					}
				}

				EList<Object> children = new BasicEList<>();
				children.addAll(Arrays.asList(super.getChildren(object)));
				children = ApogyCommonEMFFacade.INSTANCE.filterArchived(children);
				return children.toArray();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object object) {
			return getChildren(object) != null;
		}
	}

	private class ProgramsListsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider {
		private final static int NAME_COLUMN_ID = 0;

		public ProgramsListsLabelProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public String getColumnText(Object object, int columnIndex) {
			String str = "<undefined>";

			if (object instanceof Named) {
				Named named = (Named) object;

				switch (columnIndex) {
				case NAME_COLUMN_ID:
					str = named.getName() == null ? "<unnamed>" : named.getName();
					break;
				}
			}

			return str;
		}

	}

	public void setProgramsList(ProgramsList programsList) {
		this.programsList = programsList;

		if (programsList != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (programsList != null) {
			if (!treeViewer.getTree().isDisposed()) {
				treeViewer.setInput(programsList);
			}
		}
		
		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));		
		treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(AdapterFactoryEditingDomain.getEditingDomainFor(programsList), treeViewer));

		return bindingContext;
	}

	@Override
	public void dispose() {
		if (m_currentDataBindings != null) {
			m_currentDataBindings.dispose();
		}
		super.dispose();
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
}