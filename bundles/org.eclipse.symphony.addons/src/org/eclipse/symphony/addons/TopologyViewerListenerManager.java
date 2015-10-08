package org.eclipse.symphony.addons;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.addons.Simple3DTool;

import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerPackage;
import ca.gc.asc_csa.topology.ui.viewer.TopologyViewerRegistry;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.ui.NodeSelection;

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
							case TopologyViewerPackage.TOPOLOGY_VIEWER_REGISTRY__LATEST_NODE_SELECTION:
								
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