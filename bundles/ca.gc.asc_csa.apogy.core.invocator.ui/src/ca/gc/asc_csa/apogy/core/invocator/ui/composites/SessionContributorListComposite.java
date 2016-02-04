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

import java.util.List;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.ColumnLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import ca.gc.asc_csa.apogy.core.invocator.SessionContributor;

public class SessionContributorListComposite extends Composite 
{
	protected List<SessionContributor> contributors = null;
	protected TableViewer tableViewer = null;
	protected SessionContributor selectedSessionContributor = null;
	
	public SessionContributorListComposite(Composite parent, int style) 
	{
		super(parent, style);	
		setLayout(new FillLayout());
		
		tableViewer = createTableViewer(this);
	}
	
	public SessionContributorListComposite(Composite parent, int style,List<SessionContributor> contributors) 
	{
		this(parent, style);
		setContributors(contributors);
	}

	public List<SessionContributor> getContributors() {
		return contributors;
	}

	public void setContributors(List<SessionContributor> contributors) 
	{				
		this.contributors = contributors;
		tableViewer.setInput(contributors);
	}
	
	public SessionContributor getSelectedSessionContributor() 
	{
		return selectedSessionContributor;
	}

	public void setSelectedSessionContributor(SessionContributor selectedSessionContributor) 
	{
		this.selectedSessionContributor = selectedSessionContributor;
		
		tableViewer.setSelection(new StructuredSelection(selectedSessionContributor));
	}

	protected TableViewer createTableViewer(Composite parent)
	{
		final TableViewer viewer = new TableViewer(parent, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION | SWT.BORDER);
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		
		TableViewerColumn nameColumn = new TableViewerColumn(viewer, SWT.NONE);
		nameColumn.getColumn().setWidth(200);
		nameColumn.getColumn().setText("Name");
		nameColumn.setLabelProvider(new ColumnLabelProvider() 
		{
			  @Override
			  public String getText(Object element) 
			  {
				  SessionContributor contributor = (SessionContributor) element;
				  return contributor.name;
			  }
		});
		
		TableViewerColumn descriptionColumn = new TableViewerColumn(viewer, SWT.NONE);
		descriptionColumn.getColumn().setWidth(200);
		descriptionColumn.getColumn().setText("Description");
		descriptionColumn.setLabelProvider(new ColumnLabelProvider() 
		{
			  @Override
			  public String getText(Object element) 
			  {
				  SessionContributor contributor = (SessionContributor) element;
				  return contributor.description;
			  }
		});
				
		Table table = viewer.getTable();
		table.setHeaderVisible(true);
		table.setLinesVisible(true); 
		
		viewer.addSelectionChangedListener(new ISelectionChangedListener() 
		{
			  @Override
			  public void selectionChanged(SelectionChangedEvent event) 
			  {
				  IStructuredSelection selection = (IStructuredSelection) viewer.getSelection();
				  Object firstElement = selection.getFirstElement();	
				  
				  if(firstElement instanceof SessionContributor)
				  {
					  selectedSessionContributor = (SessionContributor) firstElement;
					  sessionContributorSelected(selectedSessionContributor); 
				  }
			  }
		}); 

		return viewer;
	}

	protected void sessionContributorSelected(
			SessionContributor selectedSessionContributor2) {
	}
	
	@Override
	public void dispose() {
		super.dispose();
	}
}
