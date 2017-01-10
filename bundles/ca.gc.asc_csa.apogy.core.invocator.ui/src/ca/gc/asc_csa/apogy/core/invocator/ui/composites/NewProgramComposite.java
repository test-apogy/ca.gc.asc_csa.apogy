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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.jface.viewers.ViewerCell;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Program;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;

public class NewProgramComposite extends Composite {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ProgramsList programsList;
	private ProgramsGroup group;
	private EClass eClass;

	private Composite compositeGroup;
	private Composite compositeType;

	private TreeViewer treeViewerGroups;
	private TreeViewer treeViewerTypes;

	public NewProgramComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		setLayout(gridLayout);

		compositeGroup = new Composite(this, SWT.NONE);
		compositeGroup.setLayout(new GridLayout(1, false));
		compositeGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		Label lblGroup = new Label(compositeGroup, SWT.NONE);
		lblGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblGroup.setText("Group");

		treeViewerGroups = new TreeViewer(compositeGroup, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Tree treeGroups = treeViewerGroups.getTree();
		treeGroups.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		treeGroups.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(treeViewerGroups);

		TreeViewerColumn treeViewerProgramsGroupColumnItem_Name = new TreeViewerColumn(treeViewerGroups, SWT.NONE);
		TreeColumn trclmnProgramsGroupItemName = treeViewerProgramsGroupColumnItem_Name.getColumn();
		trclmnProgramsGroupItemName.setWidth(200);
		trclmnProgramsGroupItemName.setText("Name");

		treeViewerGroups.setContentProvider(new ProgramsGroupContentProvider(adapterFactory));
		treeViewerGroups.setLabelProvider(new GroupsLabelProvider());

		compositeType = new Composite(this, SWT.NONE);
		compositeType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		compositeType.setLayout(new GridLayout(1, false));

		Label lblProgramType = new Label(compositeType, SWT.NONE);
		lblProgramType.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblProgramType.setText("Program Type");

		treeViewerTypes = new TreeViewer(compositeType, SWT.BORDER);
		Tree treeTypes = treeViewerTypes.getTree();
		treeTypes.setLinesVisible(true);
		treeTypes.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		ColumnViewerToolTipSupport.enableFor(treeViewerGroups);

		TreeViewerColumn treeViewerColumn = new TreeViewerColumn(treeViewerTypes, SWT.NONE);
		TreeColumn treeColumn = treeViewerColumn.getColumn();
		treeColumn.setWidth(200);
		treeColumn.setText("Name");

		treeViewerTypes.setContentProvider(new ProgramsTypeContentProvider(adapterFactory));
		treeViewerTypes.setLabelProvider(new TypesLabelProvider());
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

	public TreeViewer getTreeViewerGroups() {
		return treeViewerGroups;
	}

	public TreeViewer getTreeViewerTypes() {
		return treeViewerTypes;
	}

	private class TypesLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof EClass) {
				cell.setText(((EClass) cell.getElement()).getName());
			}
		}

		@Override
		public String getToolTipText(Object element) {
			if (element instanceof Described) {
				return ((Described) element).getDescription();
			}
			return super.getToolTipText(element);
		}
	}

	private class GroupsLabelProvider extends StyledCellLabelProvider {
		@Override
		public void update(ViewerCell cell) {
			if (cell.getElement() instanceof ProgramsGroup) {
				cell.setText(((ProgramsGroup) cell.getElement()).getName());
			}
		}

		@Override
		public String getToolTipText(Object element) {
			if (element instanceof Described) {
				return ((Described) element).getDescription();
			}
			return super.getToolTipText(element);
		}

		@Override
		public Point getToolTipShift(Object object) {
			return new Point(5, 5);
		}

		@Override
		public int getToolTipDisplayDelayTime(Object object) {
			return 500;
		}

		@Override
		public int getToolTipTimeDisplayed(Object object) {
			return 5000;
		}
	}

	public void setProgramSuperClass(EClass programSuperClass) {
		this.eClass = programSuperClass;

		if (programSuperClass != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}

	/**
	 * Returns the selected program.
	 * 
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgramTypes() {
		TreeSelection selection = (TreeSelection) treeViewerTypes.getSelection();
		return (Program) selection.getFirstElement();
	}

	/**
	 * Returns the selected program.
	 * 
	 * @return Reference to the selected {@link Program}.
	 */
	public Program getSelectedProgramGroup() {
		TreeSelection selection = (TreeSelection) treeViewerGroups.getSelection();
		return (Program) selection.getFirstElement();
	}

	private class ProgramsTypeContentProvider extends AdapterFactoryContentProvider {

		public ProgramsTypeContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getElements(Object inputElement) {
			if (eClass != null) {
				return ApogyCommonEMFFacade.INSTANCE.getAllSubEClasses(eClass).toArray();
			}
			Object[] objects = new Object[0];
			return objects;
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
		}
	}

	private class ProgramsGroupContentProvider extends AdapterFactoryContentProvider {

		public ProgramsGroupContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}

		@Override
		public Object[] getChildren(Object object) {
			return (object instanceof ProgramsList) ? super.getChildren(object) : null;
		}

		@Override
		public boolean hasChildren(Object object) {
			return false;
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

	public void setProgramsList(ProgramsList programsList, ProgramsGroup selectedGroup) {
		this.group = selectedGroup;
		setProgramsList(programsList);
	}

	protected DataBindingContext initDataBindings() {
		return initDataBindingsCustom();
	}

	protected DataBindingContext initDataBindingsCustom() {
		DataBindingContext bindingContext = new DataBindingContext();

		if (programsList != null) {
			if (!treeViewerGroups.getTree().isDisposed()) {
				treeViewerGroups.setInput(programsList);
				if (programsList != null) {
					group = (ProgramsGroup) treeViewerGroups.getTree().getItem(0).getData();
					treeViewerGroups.setSelection(new StructuredSelection(group));
				}
			}
		}

		if (!treeViewerTypes.getTree().isDisposed()) {
			treeViewerTypes.setInput(ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession());
		}

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