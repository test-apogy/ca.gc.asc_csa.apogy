package ca.gc.asc_csa.apogy.core.ui.composites;
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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestList;

public class FeatureOfInterestsListsComposite extends Composite
{
	private Tree tree;
	private TreeViewer treeViewer;
	private ISelectionChangedListener treeViewerSelectionChangedListener;
	private AdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
	
	public FeatureOfInterestsListsComposite(Composite parent, int style) 
	{
		super(parent, style);	
		
		setLayout(new GridLayout(1, true));	
		
		treeViewer = new TreeViewer(this, SWT.BORDER | SWT.H_SCROLL | SWT.V_SCROLL | SWT.FULL_SELECTION);
		tree = treeViewer.getTree();
		tree.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		tree.setLinesVisible(true);
		
		treeViewer.setContentProvider(new SessionFeatureOfInterestsContentProvider());
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));	
	}
	
	public void setFeatureOfInterestsLists(List<FeatureOfInterestList> featureOfInterestLists)
	{
		treeViewer.removeSelectionChangedListener(getTreeViewerSelectionChangedListener());
		treeViewer.setInput(featureOfInterestLists);
		treeViewer.addSelectionChangedListener(getTreeViewerSelectionChangedListener());
	}
	
	public void setSelectedFeatureOfInterest(FeatureOfInterest selectedFOI)
	{
		if(selectedFOI != null)
		{			
			if(selectedFOI.eContainer() instanceof FeatureOfInterestList)
			{
				FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList) selectedFOI.eContainer();
				
				Object[] objects = new Object[]{featureOfInterestList, selectedFOI};
				TreePath treePath = new TreePath(objects);
				TreeSelection treeSelection = new TreeSelection(treePath);
				treeViewer.setSelection(treeSelection, true);	
			}							
		}
	}
	
	/** 
	 * This method is called when a new selection is made in the composite. 
	 * @param selection Reference to the selection.
	 */
	protected void newSelection(TreeSelection selection)
	{		
	}
	
	public FeatureOfInterest getSelectedFeatureOfInterest()
	{		
		if(treeViewer.getSelection() instanceof StructuredSelection)
		{
			StructuredSelection structuredSelection = (StructuredSelection) treeViewer.getSelection();
			if(structuredSelection.getFirstElement() instanceof FeatureOfInterest)
			{
				return (FeatureOfInterest) structuredSelection.getFirstElement(); 
			}			
		}
		return null;
	}	
	
	private class SessionFeatureOfInterestsContentProvider implements ITreeContentProvider 
	{
		@Override
		public void dispose() 
		{
		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) 
		{		
		}

		@SuppressWarnings("rawtypes")
		@Override
		public Object[] getElements(Object inputElement) 
		{						
			Object[] elements = null;				
			if(inputElement instanceof List)
			{								
				return ((List) inputElement).toArray();
			}			
					
			return elements;
		}

		@Override
		public Object[] getChildren(Object parentElement) 
		{
			Object[] children = null;			
			if(parentElement instanceof FeatureOfInterestList)
			{
				FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList) parentElement;
				children = featureOfInterestList.getFeaturesOfInterest().toArray();
			}
			return children;
		}

		@Override
		public Object getParent(Object element) 
		{		
			return null;
		}

		@Override
		public boolean hasChildren(Object element) 
		{		
			if(element instanceof FeatureOfInterestList)
			{
				FeatureOfInterestList featureOfInterestList = (FeatureOfInterestList) element;
				return !featureOfInterestList.getFeaturesOfInterest().isEmpty();
			}		
			else
			{
				return false;
			}
		}	
	}
	
	private ISelectionChangedListener getTreeViewerSelectionChangedListener() 
	{
		if (treeViewerSelectionChangedListener == null){
			treeViewerSelectionChangedListener = new ISelectionChangedListener() {
				
				@Override
				public void selectionChanged(SelectionChangedEvent event) 
				{
					FeatureOfInterestsListsComposite.this.newSelection((TreeSelection)event.getSelection());
				}
			};
		}
		return treeViewerSelectionChangedListener;
	}
}
