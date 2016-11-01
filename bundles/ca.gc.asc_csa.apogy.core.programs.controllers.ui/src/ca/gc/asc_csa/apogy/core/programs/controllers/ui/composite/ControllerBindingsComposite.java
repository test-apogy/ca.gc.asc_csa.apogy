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

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.TreeViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.DisposeEvent;
import org.eclipse.swt.events.DisposeListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;

import ca.gc.asc_csa.apogy.core.programs.controllers.ControllersConfiguration;

public class ControllerBindingsComposite extends Composite {

	private ISelectionChangedListener selectionChangedListener;
	
	private ControllersConfiguration controllersConfiguration;

	/**
	 * Creates the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public ControllerBindingsComposite(Composite parent, int style) {
		super(parent, style);
		addDisposeListener(new DisposeListener() {
			public void widgetDisposed(DisposeEvent e) {
				dispose();
			}
		});
		setLayout(new GridLayout(2, false));
		
		TreeViewer treeViewer = new TreeViewer(this, SWT.BORDER);
		Tree tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 3));
		
		TreeViewerColumn treeViewerColumnName = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnName = treeViewerColumnName.getColumn();
		trclmnNewColumnName.setWidth(100);
		trclmnNewColumnName.setText("Name");
		
		TreeViewerColumn treeViewerColumnParameters = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnParameters = treeViewerColumnParameters.getColumn();
		trclmnNewColumnParameters.setWidth(100);
		trclmnNewColumnParameters.setText("Parameters");
		
		TreeViewerColumn treeViewerColumnControllerBinding = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnControllerBinding = treeViewerColumnControllerBinding.getColumn();
		trclmnNewColumnControllerBinding.setWidth(100);
		trclmnNewColumnControllerBinding.setText("Controller Binding");
		
		TreeViewerColumn treeViewerColumnType = new TreeViewerColumn(treeViewer, SWT.NONE);
		TreeColumn trclmnNewColumnType = treeViewerColumnType.getColumn();
		trclmnNewColumnType.setWidth(100);
		trclmnNewColumnType.setText("Type");		
		
		Button btnNew = new Button(this, SWT.NONE);
		GridData gd_btnNew = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_btnNew.widthHint = 90;
		btnNew.setLayoutData(gd_btnNew);
		btnNew.setText("New");
		btnNew.addListener(SWT.Selection, new Listener() {
			@Override
			public void handleEvent(Event event) {
				System.out.println(
						"ControllerBindingsComposite.ControllerBindingsComposite(...).new Listener() {...}.handleEvent()" + controllersConfiguration);}
		});
		
		Button btnDelete = new Button(this, SWT.NONE);
		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
		btnDelete.setText("Delete");
		
		Button btnEdit = new Button(this, SWT.NONE);
		btnEdit.setLayoutData(new GridData(SWT.FILL, SWT.TOP, false, false, 1, 1));
		btnEdit.setText("Edit");
		
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());

//		treeViewer.setContentProvider(getContentProvider());
//		treeViewer.setLabelProvider(getLabelProvider());

//		btnNew = new Button(this, SWT.NONE);
//		btnNew.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
//		btnNew.setText("New");
//		btnNew.setEnabled(true);
//		btnNew.addListener(SWT.Selection, new Listener() {
//			@Override
//			public void handleEvent(Event event) {
//
//				ControllersConfiguration config = (ControllersConfiguration) ApogyCoreProgramsControllersFactory.eINSTANCE
//						.create(ApogyCoreProgramsControllersPackage.Literals.CONTROLLERS_CONFIGURATION);
//				config.setName(ApogyCommonEMFFacade.INSTANCE.getDefaultName(controllersGroup, config, ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS));
//				
//				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroup);
//				AddCommand command = new AddCommand(editingDomain, controllersGroup,
//						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, config);
//				
//				editingDomain.getCommandStack().execute(command);
//			}
//		});
//
//		Button btnDelete = new Button(this, SWT.NONE);
//		btnDelete.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));
//		btnDelete.setText("Delete");
//		btnDelete.addListener(SWT.Selection, new Listener() {
//			@Override
//			public void handleEvent(Event event) {
//				EditingDomain editingDomain = AdapterFactoryEditingDomain.getEditingDomainFor(controllersGroup);
//				RemoveCommand command = new RemoveCommand(editingDomain, controllersGroup,
//						ApogyCoreInvocatorPackage.Literals.PROGRAMS_GROUP__PROGRAMS, controllersConfigsComposite.getSelectedEObject());
//				
//				editingDomain.getCommandStack().execute(command);
//			}
//		});
//		
//		Label label = new Label(this, SWT.SEPARATOR | SWT.HORIZONTAL);
//		label.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1));

	}
	
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() {
		if (selectionChangedListener == null) {
			selectionChangedListener = new ISelectionChangedListener() {

				@Override
				public void selectionChanged(SelectionChangedEvent event) {
					newSelection(event.getSelection());
				}
			};
		}
		return selectionChangedListener;
	}

	protected void newSelection(ISelection selection) {
//		this.selectedControllerConfiguration = (ControllersConfiguration) selection;
	}
	
	public void setControllersConfiguration(ControllersConfiguration controllersConfiguration) {
		this.controllersConfiguration = controllersConfiguration;
	}

	@Override
	public void dispose() {
		super.dispose();
	}
}