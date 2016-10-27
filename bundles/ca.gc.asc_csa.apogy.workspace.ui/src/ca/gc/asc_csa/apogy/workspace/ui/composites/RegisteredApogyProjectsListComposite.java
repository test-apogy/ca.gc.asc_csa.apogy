package ca.gc.asc_csa.apogy.workspace.ui.composites;
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

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ColumnViewerToolTipSupport;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.osgi.framework.Bundle;

import ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry;

public class RegisteredApogyProjectsListComposite extends Composite {
	private TableViewer viewer;

	public RegisteredApogyProjectsListComposite(Composite parent, int style) {
		super(parent, style);
		setLayout(new GridLayout(1, true));

		viewer = new TableViewer(this, SWT.BORDER | SWT.SINGLE | SWT.V_SCROLL);
		Table table = viewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 7));
		table.setLinesVisible(true);
		ColumnViewerToolTipSupport.enableFor(viewer);
		viewer.addSelectionChangedListener(new ISelectionChangedListener() {

			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				newSelection(event.getSelection());
			}
		});

		TableViewerColumn tableViewerColumnItem_Name = new TableViewerColumn(viewer, SWT.NONE);
		TableColumn trclmnItemName = tableViewerColumnItem_Name.getColumn();
		trclmnItemName.setWidth(200);
		
		viewer.setContentProvider(new IStructuredContentProvider() {			
			@Override
			public Object[] getElements(Object inputElement) {
				@SuppressWarnings("unchecked")
				Iterator<Bundle> bundles = ((List<Bundle>)inputElement).iterator();
				List<Bundle> elements = new ArrayList<Bundle>(); 
				
				while (bundles.hasNext()){
					Bundle bundle = bundles.next();
					
					if (getProjectNameFilter() == null || getProjectNameFilter().isEmpty()){
						elements.add(bundle);
					}else{
						if (bundle.getSymbolicName().indexOf(getProjectNameFilter()) == 0){
							elements.add(bundle);	
						}
					}
				}				
				return elements.toArray();
			}
		});
		viewer.setLabelProvider(new LabelProvider(){
			@Override
			public String getText(Object element) {
				Bundle bundle = (Bundle) element;				
				return bundle.getSymbolicName(); 
			}
		});
		viewer.setInput(ProjectProvidersRegistry.INSTANCE.getApogyProjectProviders());
	}

	/**
	 * This method is invoked a when a new selection is selected.
	 */
	protected void newSelection(ISelection selection) {
	}

	/**
	 * Returns the selected {@link IProject}.
	 * @return Reference to the project or null if no project is selected.
	 */
	public Bundle getSelectedBundle() {
		return (Bundle) ((IStructuredSelection) viewer.getSelection()).getFirstElement();
	}
	
	protected String getProjectNameFilter(){
		return null;
	}
}