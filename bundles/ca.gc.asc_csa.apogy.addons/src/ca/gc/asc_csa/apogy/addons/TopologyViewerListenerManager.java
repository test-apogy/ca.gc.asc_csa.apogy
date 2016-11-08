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

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

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
		
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getSessionAdapter());
		
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
	
	public void setAllSimple3DToolRootNode(Node root)
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Updating Simple3DTool  Root Node to <" + root + ">...", EventSeverity.INFO);
		currentRootNode = root;
		
		for(Simple3DTool tool : simple3DTools)
		{
			try
			{
				tool.setRootNode(currentRootNode);				
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
			if(invocatorSession.getEnvironment() instanceof ApogyEnvironment)
			{
// FIXME TRANSACTION: Volatile, Singleton -> Facade.				
//				ApogyEnvironment apogyEnvironment = (ApogyEnvironment) invocatorSession.getEnvironment();
//				if(apogyEnvironment.getApogyTopology() != null)
//				{
//					root = apogyEnvironment.getApogyTopology().getRootNode();
//				}
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
	
	private Adapter getSessionAdapter()
	{
		if(sessionAdapter == null)
		{
			sessionAdapter = new SessionAdapter();				
		}
		
		return sessionAdapter;
	}
	
	private class SessionAdapter extends AdapterImpl
	{
		private InvocatorSession currentInvocatorSession = null;
		private ApogyEnvironment currentApogyEnvironment = null;
		private ApogyTopology currentApogyTopology = null;
		
		@Override
		public void notifyChanged(Notification msg) 
		{
			if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
			{
				int featureId = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
				switch (featureId) 
				{
					case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
					{	
						setInvocatorSession((InvocatorSession) msg.getNewValue());
					}
					break;

				default:
					break;
				}
			}
			else if(msg.getNotifier() instanceof InvocatorSession)
			{				
				int featureId = msg.getFeatureID(InvocatorSession.class);
				switch (featureId) 
				{
					case  ApogyCoreInvocatorPackage.INVOCATOR_SESSION__ENVIRONMENT:
					{
						setApogyEnvironment((ApogyEnvironment) msg.getNewValue());
					}
					break;
				}
			}
			else if(msg.getNotifier() instanceof ApogyEnvironment)
			{				
				int featureId = msg.getFeatureID(ApogyEnvironment.class);
				switch (featureId) 
				{
// FIXME TRANSACTION Volatile, Singleton -> Facade.				
//					case  ApogyCorePackage.APOGY_ENVIRONMENT__APOGY_TOPOLOGY:
//					{
//						setApogyTopology((ApogyTopology) msg.getNewValue());
//					}
//					break;
				}
			}
			else if(msg.getNotifier() instanceof ApogyTopology)
			{
				int featureId = msg.getFeatureID(ApogyTopology.class);
				switch (featureId) 
				{
					case  ApogyCorePackage.APOGY_TOPOLOGY__ROOT_NODE:
					{
						setAllSimple3DToolRootNode((Node) msg.getNewValue());
					}
					break;
				}				
			}					
		}
		
		private void setInvocatorSession(InvocatorSession newInvocatorSession)
		{
			if(currentInvocatorSession != null)
			{
				currentInvocatorSession.eAdapters().remove(this);										
			}
			setApogyEnvironment(null);
			setApogyTopology(null);
			
			currentInvocatorSession = newInvocatorSession;
			
			if(currentInvocatorSession != null)
			{						
				currentInvocatorSession.eAdapters().add(this);
				
				if(currentInvocatorSession.getEnvironment() instanceof ApogyEnvironment)
				{
					setApogyEnvironment((ApogyEnvironment) currentInvocatorSession.getEnvironment());
				}
			}
		}
		
		private void setApogyEnvironment(ApogyEnvironment newApogyEnvironment)
		{
			if(currentApogyEnvironment != null)
			{
				currentApogyEnvironment.eAdapters().remove(this);				
			}
			setApogyTopology(null);
			
			currentApogyEnvironment = newApogyEnvironment;
			
			if(currentApogyEnvironment != null)
			{
				currentApogyEnvironment.eAdapters().add(this);
				
// FIXME TRANSACTION: VOLATILE, SINGLETON -> Facade.				
//				setApogyTopology(currentApogyEnvironment.getApogyTopology());
			}
		}
		
		private void setApogyTopology(ApogyTopology newApogyTopology)
		{
			if(currentApogyTopology != null)
			{
				currentApogyTopology.eAdapters().remove(this);
			}
			
			currentApogyTopology = newApogyTopology;
			
			if(currentApogyTopology != null)
			{
				setAllSimple3DToolRootNode(currentApogyTopology.getRootNode());
				
				currentApogyTopology.eAdapters().add(this);
			}
		}
	}
}
