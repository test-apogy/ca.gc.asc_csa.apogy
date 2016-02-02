package ca.gc.asc_csa.apogy.addons;
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
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry;

public class TopologyViewerListenerManager
{			
	private Adapter topologyViewerRegistryAdapter = null;
	private TopologyViewerRegistry topologyViewerRegistry;
	private Node currentRootNode = null;
	private List<Simple3DTool> simple3DTools = new ArrayList<Simple3DTool>();
	
	public TopologyViewerListenerManager(TopologyViewerRegistry topologyViewerRegistry)
	{
		this.topologyViewerRegistry = topologyViewerRegistry;
		
		topologyViewerRegistry.eAdapters().add(getTopologyViewerRegistryAdapter());
			
	}
	
	public void dispose()
	{
		if(topologyViewerRegistry != null)
		{
			topologyViewerRegistry.eAdapters().remove(getTopologyViewerRegistryAdapter());
		}		
	}
	
	public void registerSimple3DTool(Simple3DTool tool)
	{
		if(!simple3DTools.contains(tool)) simple3DTools.add(tool);
		
		try
		{
			tool.setRootNode(currentRootNode);
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
	
	public void unRegisterSimple3DTool(Simple3DTool tool)
	{
		simple3DTools.remove(tool);
	}
	
//	public void setAllSimple3DToolRootNode(Node root)
//	{		
//		currentRootNode = root;
//		
//		for(Simple3DTool tool : simple3DTools)
//		{
//			try
//			{
//				if(tool.getRootNode() != currentRootNode)
//				{
//					tool.setRootNode(currentRootNode);
//				}
//			}
//			catch(Throwable t)
//			{
//				t.printStackTrace();
//			}
//		}
//	}
	
	protected void notifyAllSimple3DTool(final NodeSelection nodeSelection)
	{
		for(Simple3DTool tool : simple3DTools)
		{
			try
			{								
				if(tool.isActive())
				{					
					tool.selectionChanged(nodeSelection);
				}
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}

	protected Adapter getTopologyViewerRegistryAdapter() 
	{
		if(topologyViewerRegistryAdapter == null)
		{
			topologyViewerRegistryAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof TopologyViewerRegistry)
					{
						int featureId = msg.getFeatureID(TopologyViewerRegistry.class);
						
						switch (featureId) 
						{
							case ApogyCommonTopologyUIViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
								
								if(msg.getNewValue() instanceof NodeSelection)
								{
									NodeSelection nodeSelection = (NodeSelection) msg.getNewValue();
									notifyAllSimple3DTool(nodeSelection);
								}
							
							break;

						default:
							break;
						}
					}
				}
			};
		}
		return topologyViewerRegistryAdapter;
	}		
}
