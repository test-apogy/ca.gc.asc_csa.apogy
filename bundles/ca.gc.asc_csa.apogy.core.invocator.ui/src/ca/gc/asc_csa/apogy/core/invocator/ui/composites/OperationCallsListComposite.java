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

import java.util.Arrays;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.ScrolledComposite;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFFacade;
import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.ui.composites.EObjectComposite;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsGroup;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;

public class OperationCallsListComposite extends ScrolledComposite {
	private DataBindingContext m_currentDataBindings;

	private final ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(
			ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

	private OperationCallsList operationCallsList;

	private ISelectionChangedListener treeViewerSelectionChangedListener;
	
	EObjectComposite eObjectComposite;

	public OperationCallsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));
		setExpandHorizontal(true);
		setExpandVertical(true);

		Composite compositeProgram = new Composite(this, SWT.NONE);
		compositeProgram.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		compositeProgram.setLayout(new GridLayout(2, false));

		eObjectComposite = new EObjectComposite(compositeProgram, SWT.None){
			@Override
			protected void newSelection(ISelection selection) {
				OperationCallsListComposite.this.newSelection(selection);
			}
			
			@Override
			protected AdapterFactoryContentProvider getContentProvider() {
				// TODO Create custom content provider
				return super.getContentProvider();
			}
			
			@Override
			protected AdapterFactoryLabelProvider getLabelProvider() {
				// TODO Create custom label provider
				return super.getLabelProvider();
			}
		};
		eObjectComposite.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));

		Button btnNew = new Button(compositeProgram, SWT.NONE);
		btnNew.setText("New");
		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnNew.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//				TODO New button 
//				/**
//				 * Creates and opens the wizard to create a valid context
//				 */
//				NewProgramsGroupWizard newProgramsGroupWizard = new NewProgramsGroupWizard();
//				WizardDialog dialog = new WizardDialog(getShell(), newProgramsGroupWizard);
//				newProgramsGroupWizard.getCreatedProgramsGroup().addChangeListener(getNewValueChangeListener());
//				dialog.open();
			}
		});
		
		Button btnDelete = new Button(compositeProgram, SWT.NONE);
		btnDelete.setText("Delete");
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
//				TODO Delete button
//				/**
//				 * Creates and opens the wizard to create a valid context
//				 */
//				NewProgramsGroupWizard newProgramsGroupWizard = new NewProgramsGroupWizard();
//				WizardDialog dialog = new WizardDialog(getShell(), newProgramsGroupWizard);
//				newProgramsGroupWizard.getCreatedProgramsGroup().addChangeListener(getNewValueChangeListener());
//				dialog.open();
			}
		});

		setContent(compositeProgram);
		setMinSize(compositeProgram.computeSize(SWT.DEFAULT, SWT.DEFAULT));
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
	 * Returns the selected {@link OperationCall}.
	 * 
	 * @return Reference to the selected {@link OperationCall}.
	 */
	public OperationCall getSelectedOperationCall(){
		return (OperationCall)eObjectComposite.getSelectedEObject();
	}
	
	public void setOperationCallsList(OperationCallsList operationCallsList){
		eObjectComposite.setEObject(operationCallsList);
	}

	
	private class ProgramContentProvider extends AdapterFactoryContentProvider {

		public ProgramContentProvider(AdapterFactory adapterFactory) {
			super(adapterFactory);
		}
		
		@Override
		public Object[] getElements(Object object) {
			return super.getElements(object);
		}

		@Override
		public void notifyChanged(Notification notification) {
			super.notifyChanged(notification);
			eObjectComposite.refresh();
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
//
//	private class ProgramsListsLabelProvider extends AdapterFactoryLabelProvider implements ITableLabelProvider {
//		private final static int NAME_COLUMN_ID = 0;
//
//		public ProgramsListsLabelProvider(AdapterFactory adapterFactory) {
//			super(adapterFactory);
//		}
//
//		@Override
//		public String getColumnText(Object object, int columnIndex) {
//			String str = "<undefined>";
//
//			if (object instanceof Named) {
//				Named named = (Named) object;
//
//				switch (columnIndex) {
//				case NAME_COLUMN_ID:
//					str = named.getName() == null ? "<unnamed>" : named.getName();
//					break;
//				}
//			}
//
//			return str;
//		}
//
//	}
//
//	public void setProgramsList(ProgramsList programsList) {
//		this.programsList = programsList;
//
//		if (programsList != null) {
//			if (m_currentDataBindings != null) {
//				m_currentDataBindings.dispose();
//			}
//			m_currentDataBindings = initDataBindings();
//		}
//	}
//
//	protected DataBindingContext initDataBindings() {
//		return initDataBindingsCustom();
//	}
//
//	protected DataBindingContext initDataBindingsCustom() {
//		DataBindingContext bindingContext = new DataBindingContext();
//
//		if (programsList != null) {
//			if (!treeViewer.getTree().isDisposed()) {
//				treeViewer.setInput(programsList);
//			}
//		}
//		
//		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
//		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance(), LocalSelectionTransfer.getTransfer(), FileTransfer.getInstance() };
//		treeViewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(treeViewer));		
//		treeViewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(AdapterFactoryEditingDomain.getEditingDomainFor(programsList), treeViewer));
//
//		return bindingContext;
//	}
//
//	@Override
//	public void dispose() {
//		if (m_currentDataBindings != null) {
//			m_currentDataBindings.dispose();
//		}
//		super.dispose();
//		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
//	}
}