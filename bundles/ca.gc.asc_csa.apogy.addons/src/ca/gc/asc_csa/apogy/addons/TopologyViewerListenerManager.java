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

import ca.gc.asc_csa.apogy.common.emf.transaction.ApogyCommonEmfTransactionFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage;

public class TopologyViewerListenerManager
{			
	private Adapter topologyViewerRegistryAdapter = null;
	private Adapter sessionAdapter = null;
	
	private TopologyViewerRegistry topologyViewerRegistry;
	private Node currentRootNode = null;
	private List<Simple3DTool> simple3DTools = new ArrayList<Simple3DTool>();
	
	public TopologyViewerListenerManager(TopologyViewerRegistry topologyViewerRegistry)
	{
		this.topologyViewerRegistry = topologyViewerRegistry;
		
		topologyViewerRegistry.eAdapters().add(getTopologyViewerRegistryAdapter());	
		
		// Register to the Apogy Topology.
		ApogyCoreTopologyFacade.INSTANCE.eAdapters().add(getApogyTopologyAdapter());
		
		// Initialize the root node.
		setAllSimple3DToolRootNode(resolveRootNode());		
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
			// Set the tool root Node in a Transaction friendly way.			
			ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(tool, ApogyAddonsPackage.Literals.SIMPLE3_DTOOL__ROOT_NODE, currentRootNode);			
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
	
	public void setAllSimple3DToolRootNode(Node root)
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Updating Simple3DTool  Root Node to <" + root + ">...", EventSeverity.INFO);
		currentRootNode = root;
		
		for(Simple3DTool tool : simple3DTools)
		{
			try
			{
				// Set the tool root Node in a Transaction friendly way.
				ApogyCommonEmfTransactionFacade.INSTANCE.basicSet(tool, ApogyAddonsPackage.Literals.SIMPLE3_DTOOL__ROOT_NODE, currentRootNode);
			}
			catch(Throwable t)
			{
				t.printStackTrace();
			}
		}
	}
	
	protected Node resolveRootNode()
	{
		Node root = null;
								
		InvocatorSession invocatorSession = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession(); 
		if(invocatorSession != null)
		{
			if(ApogyCoreTopologyFacade.INSTANCE.getApogyTopology() != null)
			{
				root = ApogyCoreTopologyFacade.INSTANCE.getApogyTopology().getRootNode();
			}	
		}
				
		return root;
	}
	
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
	
	private Adapter getApogyTopologyAdapter()
	{
		if(sessionAdapter == null)
		{
			sessionAdapter = new ApogyTopologyAdapter();				
		}
		
		return sessionAdapter;
	}
	
	private class ApogyTopologyAdapter extends AdapterImpl
	{
		@Override
		public void notifyChanged(Notification msg) 
		{
			if(msg.getNotifier() instanceof ApogyCoreTopologyFacade)
			{
				int featureId = msg.getFeatureID(ApogyCoreTopologyFacade.class);
				switch (featureId) 
				{
					case ApogyCoreTopologyPackage.APOGY_CORE_TOPOLOGY_FACADE__APOGY_TOPOLOGY:
					{	
						ApogyTopology newApogyTopology = (ApogyTopology) msg.getNewValue();
						if(newApogyTopology != null)
						{							
							setAllSimple3DToolRootNode(newApogyTopology.getRootNode());
						}
						else
						{						
							setAllSimple3DToolRootNode(null);
						}
						
					}
					break;

				default:
					break;
				}
			}

		}
	}
}
