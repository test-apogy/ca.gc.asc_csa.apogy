package ca.gc.asc_csa.apogy.common.topology.ui.views;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EContentAdapter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import ca.gc.asc_csa.apogy.common.topology.ui.Activator;
import ca.gc.asc_csa.apogy.common.topology.ui.composites.NodePresentationListComposite;
import ca.gc.asc_csa.apogy.common.topology.ui.composites.TopologyPresentationSetListComposite;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.progress.UIJob;

public class TopologyPresentationRegistryView extends ViewPart 
{
	
	private NodePresentationListComposite nodePresentationListComposite;
	private TopologyPresentationSetListComposite topologyPresentationSetListComposite;
	
	private Adapter topologyPresentationRegistryAdapter = null;
	
	@Override
	public void createPartControl(Composite parent) 
	{
		GridLayout gridLayout = new GridLayout(2, true);
		parent.setLayout(gridLayout);
		
		Label nodeListLabel = new Label(parent, SWT.NONE);
		GridData gridData1 = new GridData(SWT.LEFT, SWT.FILL, true, false, 1, 1);
		nodeListLabel.setLayoutData(gridData1);
		nodeListLabel.setText("Node Presentations");
		
		Label topologyPresentationSetLabel = new Label(parent, SWT.NONE);
		GridData gridData2 = new GridData(SWT.LEFT, SWT.FILL, true, false, 1, 1);
		topologyPresentationSetLabel.setLayoutData(gridData2);
		topologyPresentationSetLabel.setText("Topology Presentation Sets");
		
		nodePresentationListComposite = new NodePresentationListComposite(parent, SWT.NONE);
		GridData gridData3 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		nodePresentationListComposite.setLayoutData(gridData3);		
		nodePresentationListComposite.setNodePresentationSet(Activator.getTopologyPresentationRegistry().getNodePresentationList());
		
		topologyPresentationSetListComposite = new TopologyPresentationSetListComposite(parent, SWT.NONE);
		GridData gridData4 = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		topologyPresentationSetListComposite.setLayoutData(gridData4);
		topologyPresentationSetListComposite.setTopologyPresentationSet(Activator.getTopologyPresentationRegistry().getTopologyPresentationSetList());
		
		Activator.getTopologyPresentationRegistry().eAdapters().add(getTopologyPresentationRegistryAdapter());
	}

	
	
	@Override
	public void dispose() 
	{		
		Activator.getTopologyPresentationRegistry().eAdapters().remove(getTopologyPresentationRegistryAdapter());
		
		nodePresentationListComposite.setNodePresentationSet(null);
		topologyPresentationSetListComposite.setTopologyPresentationSet(null);
		
		super.dispose();
	}
	
	@Override
	public void setFocus() 
	{		
	}

	private Adapter getTopologyPresentationRegistryAdapter() 
	{
		if(topologyPresentationRegistryAdapter == null)
		{
			topologyPresentationRegistryAdapter = new EContentAdapter()
			{
				@Override
				public void notifyChanged(Notification notification) 
				{				
					super.notifyChanged(notification);
					
					// Force update on topologyPresentationSetListComposite
					UIJob job = new UIJob("TopologyPresentationRegistryView Update") 
					{						
						@Override
						public IStatus runInUIThread(IProgressMonitor monitor) 
						{
							if(!nodePresentationListComposite.isDisposed()) nodePresentationListComposite.setNodePresentationSet(Activator.getTopologyPresentationRegistry().getNodePresentationList());							
							if(!topologyPresentationSetListComposite.isDisposed()) topologyPresentationSetListComposite.setTopologyPresentationSet(Activator.getTopologyPresentationRegistry().getTopologyPresentationSetList());
							return Status.OK_STATUS;
						}
					};
					job.schedule();
				}
			};
		}
		return topologyPresentationRegistryAdapter;
	}
	
	
}
