package ca.gc.asc_csa.apogy.core.topology.ui.views;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFactory;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.core.ResultNode;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResult;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode;
import ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyFacade;
import ca.gc.asc_csa.apogy.core.topology.ui.Activator;
import ca.gc.asc_csa.apogy.core.ui.ResultNodePresentation;

public class ApogyEnvironment3DView extends AbstractApogy3DView 
{	
	public static final String PART_NAME = "Apogy 3D Viewer";	
	
	private Adapter activeSessionAdapter = null;
	private ApogyEnvironment apogyEnvironment = null;		
	private Adapter apogyEnvironmentAdapter = null;
		
	
	@Override
	public void createPartControl(Composite parent) 
	{		
		super.createPartControl(parent);
		
		// Gets the current Active Session if one exists.
		setApogyEnvironment(getActiveApogyEnvironment());
				
		// Register to the active session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public String getViewID() 
	{		
		return "ca.gc.asc_csa.apogy.core.topology.ui.views.ApogyEnvironment3DView";
	}
	
	public void show(List<AbstractResult> results)
	{		
		if(topologyViewer != null && topologyViewer.getInput() instanceof GraphicsContext)
		{
			GraphicsContext graphicsContext = (GraphicsContext) topologyViewer.getInput();
			TopologyPresentationSet presentationTopologySet =  graphicsContext.getTopologyPresentationSet();
			
			List<Node> nodes = presentationTopologySet.getNodes();
			Map<AbstractResult, ResultNodePresentation> resultToPresentationMap = new HashMap<AbstractResult, ResultNodePresentation>();
			
			for(Node node : nodes)
			{
				if(node instanceof ResultNode)
				{
					ResultNode resultNode = (ResultNode) node;
					NodePresentation nodePresentation = presentationTopologySet.getPresentationNode(node);
					if(nodePresentation instanceof ResultNodePresentation)
					{
						ResultNodePresentation resultNodePresentation = (ResultNodePresentation) nodePresentation;
						resultToPresentationMap.put(resultNode.getResult(), resultNodePresentation);
					}
				}
			}
			
			// Set invisible all ResultNode
			for(ResultNodePresentation resultNodePresentation : resultToPresentationMap.values())
			{
				resultNodePresentation.setVisible(false);
			}
			
			// Set visible the selected ones.
			for(AbstractResult abstractResult : results)
			{
				ResultNodePresentation resultNodePresentation = resultToPresentationMap.get(abstractResult);
				if(resultNodePresentation != null) resultNodePresentation.setVisible(true);
			}
		}		
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public void updateSelection(ISelection selection) 
	{		
		if(!isBusy())
		{		
			// Attempts to convert the selection to a Deployment.
			List<Object> list = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, ApogyEnvironment.class);
	
			if(list.size() > 0) 
			{
				ApogyEnvironment newDeployment = (ApogyEnvironment) list.get(0);
				if(newDeployment != apogyEnvironment)
				{
					setApogyEnvironment(newDeployment);
				}
			}
			
			// Tries to see if the selection contains AbstractResult.
			List results = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, AbstractResult.class);
			show(results);
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "View is busy, input rejected!", EventSeverity.WARNING);
		}
	}
	
	@Override
	public void dispose() 
	{
		// Un-Register to the active session.
		ApogyCoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
		
		if(apogyEnvironment != null)
		{
			apogyEnvironment.eAdapters().remove(getEnvironmentAdapter());
		}
		setApogyEnvironment(null);							
		
		super.dispose();
	}	

	@Override
	protected JME3RenderEngineDelegate createJME3RenderEngineDelegate() 
	{
		JME3RenderEngineDelegate jme3RenderEngineDelegate = new JME3RenderEngineDelegate()
		{
			@Override
			protected JME3Application createJME3Application(Composite parent) 
			{			
				JME3Application app = new JME3Application(parent)
				{
					@Override
					protected void initLighting() 
					{		
						// Disable all lights !
					}
				};
				app.setJMERenderEngineDelegate(this);
				return app;								
			}
		};		
	
		return jme3RenderEngineDelegate;
	}

	@Override
	protected String getPartNamePrefix() 
	{		
		return PART_NAME;
	}

	@Override
	protected String getPartNameSuffix() 
	{
		if(apogyEnvironment != null)
		{	
			String sessionName = apogyEnvironment.getInvocatorSession().getName();
			if(sessionName != null && sessionName.length() > 0)
			{
				return sessionName;
			}
			else
			{				
				return "?";
			}			
		}
		
		return "?";
	}
	
	protected ApogyEnvironment getActiveApogyEnvironment()
	{
		ApogyEnvironment apogyEnvironment = null;
		
		InvocatorSession session = ApogyCoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			if(session.getEnvironment() instanceof ApogyEnvironment)
			{
				apogyEnvironment = (ApogyEnvironment) session.getEnvironment();
			}
		}
		
		return apogyEnvironment;
	}
	
	private void setApogyEnvironment(final ApogyEnvironment newApogyEnvironment)
	{	
		// Check if we need to update the environment.
		if(newApogyEnvironment != this.apogyEnvironment)
		{		
			this.showBusy(true);
			
			if(this.apogyEnvironment != null)
			{
				this.apogyEnvironment.eAdapters().remove(getEnvironmentAdapter());
			}
					
			if(newApogyEnvironment != null) 
			{
				newApogyEnvironment.eAdapters().add(getEnvironmentAdapter());
			}
			
			this.apogyEnvironment = newApogyEnvironment;
			updatePartName();
			
			if(topologyViewer != null)
			{
				Job job = new Job("Update ApogyEnvironment Topology")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{					
							if(newApogyEnvironment != null)
							{
								// If the ApogyEnvironment topology has not been initialize, initialize it and attach
								// ApogyEnvironmentNode to keep the topology updated.
								if(newApogyEnvironment.getApogyTopology().getRootNode() == null)
								{
									// Updates the deployment of the deployment node to get the topology to update.
									TransformNode root = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
									root.setNodeId("UNIVERSE_ROOT");
									root.setDescription("Root Node of the Apogy Environment");
									
									// Creates the ApogyEnvironmentNode that represent the topology associated with the ApogyEnvironment.
									ApogyEnvironmentNode apogyEnvironmentNode = ApogyCoreTopologyFacade.INSTANCE.createApogyEnvironmentNode(newApogyEnvironment);									
									root.getChildren().add(apogyEnvironmentNode);
																		
									newApogyEnvironment.getApogyTopology().setRootNode(root);				
									
									GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(newApogyEnvironment.getApogyTopology().getRootNode());
									if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
								}
								else
								{																
									GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(newApogyEnvironment.getApogyTopology().getRootNode());
									if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
								}														
							}
							else
							{
								TransformNode root = ApogyCommonTopologyFactory.eINSTANCE.createTransformNode();
								root.setNodeId("UNIVERSE_ROOT");
								root.setDescription("Root Node of the Apogy Environment");
								GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(root);
								if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
							}
						}
						catch(Throwable t)
						{
							t.printStackTrace();
						}
						
						if(topologyViewer != null)
						{
							topologyViewer.setAntiAliasing(true);						
							topologyViewer.zoomToFit();						
						}
						
						ApogyEnvironment3DView.this.showBusy(false);
						
						return Status.OK_STATUS;
					}	
				};
				job.schedule();	
			}
		}
	}
	
	/*
	 * Return the Adapter listening to the selected environment.
	 */
	private Adapter getEnvironmentAdapter()
	{
		  if(apogyEnvironmentAdapter == null)
		  {
			  	apogyEnvironmentAdapter = new AdapterImpl()
				{				
					@Override
					public void notifyChanged(Notification msg) 
					{				
						// Events from Deployment
						if(msg.getNotifier() instanceof ApogyEnvironment)							
						{							
							if(msg.getFeatureID(ApogyEnvironment.class) == ApogyCorePackage.APOGY_ENVIRONMENT__NAME)						
							{	
								// Update the part name.
								updatePartName();
							}
						}
					}
				};
		  }
		  
		  return apogyEnvironmentAdapter;
	}

	private Adapter getActiveSessionAdapter() 
	{
		if(activeSessionAdapter == null)
		{
			activeSessionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof ApogyCoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(ApogyCoreInvocatorFacade.class);
						switch (featureId) 
						{
							case ApogyCoreInvocatorPackage.APOGY_CORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
								if(msg.getNewValue() instanceof InvocatorSession)
								{
									// Gets the current Active Session if one exists.
									setApogyEnvironment(getActiveApogyEnvironment());
								}
								
							break;

						default:
							break;
						}
					}
					
				}
			};
		}
		return activeSessionAdapter;
	}
	
	
}
