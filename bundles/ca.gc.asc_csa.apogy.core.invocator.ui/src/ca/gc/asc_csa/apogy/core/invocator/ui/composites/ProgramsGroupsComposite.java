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
 *     Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StyledCellLabelProvider;
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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;

public class ProgramsGroupsComposite extends Composite implements ISelectionProvider {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private ProgramsList programsList;
	private ProgramsGroup programsGroup;

	private TreeViewer treeViewerGroups;
	private ISelectionChangedListener treeViewerSelectionChangedListener;

	public ProgramsGroupsComposite(Composite parent, int style) {
		super(parent, style);
		GridLayout gridLayout = new GridLayout(1, false);
		gridLayout.marginHeight = 0;
		setLayout(gridLayout);

		Label lblGroup = new Label(this, SWT.NONE);
		lblGroup.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, false, 1, 1));
		lblGroup.setText("Group");

		treeViewerGroups = new TreeViewer(this, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
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
	}


	/**
	 * Label provider for the treeViewer
	 */
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


	/**
	 * Content provider for the treeViewer
	 */
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

	/**
	 * Sets the {@link ProgramsList} that contains the {@link ProgramsGroup}
	 * @param programsList reference to the {@link ProgramsList}
	 */
	public void setProgramsList(ProgramsList programsList) {
		this.programsList = programsList;

		if (programsList != null) {
			if (m_currentDataBindings != null) {
				m_currentDataBindings.dispose();
			}
			m_currentDataBindings = initDataBindings();
		}
	}
	
	/**
	 * Overloaded method to set a default group while setting the ProgramsList
	 * @param programsList the {@link ProgramsList} that contains the {@link ProgramsGroup}
	 * @param selectedGroup the default {@link ProgramsGroup} 
	 */
	public void setProgramsList(ProgramsList programsList, ProgramsGroup selectedGroup) {
		this.programsGroup = selectedGroup;
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
				if (programsGroup != null) {
					ISelection selection = new StructuredSelection(programsGroup);
					treeViewerGroups.setSelection(selection);
				}

			}
		}

		return bindingContext;
	}

	@Override
	public void dispose() {
		if (m_currentDataBindings != null) {
			m_currentDataBindings.dispose();
		}
		super.dispose();
		treeViewerGroups.removeSelectionChangedListener(treeViewerSelectionChangedListener);
	}

	/**
	 * Selection provider methods
	 */
	@Override
	public void addSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewerSelectionChangedListener = listener;
		treeViewerGroups.addSelectionChangedListener(listener);
	}

	@Override
	public ISelection getSelection() {
		System.out.println("ProgramsGroupsComposite.getSelection()");
		return (ISelection) programsGroup;
	}

	@Override
	public void removeSelectionChangedListener(ISelectionChangedListener listener) {
		treeViewerGroups.removeSelectionChangedListener(treeViewerSelectionChangedListener);
	}

	@Override
	public void setSelection(ISelection selection) {
		programsGroup = (ProgramsGroup) selection;
	}
}