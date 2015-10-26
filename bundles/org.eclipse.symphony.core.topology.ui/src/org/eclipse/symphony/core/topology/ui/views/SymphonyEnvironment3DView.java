package org.eclipse.symphony.core.topology.ui.views;

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
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.Symphony__CommonTopologyFactory;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.common.topology.ui.GraphicsContext;
import org.eclipse.symphony.common.topology.ui.NodePresentation;
import org.eclipse.symphony.common.topology.ui.TopologyPresentationSet;
import org.eclipse.symphony.common.topology.ui.TopologyUIFacade;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Application;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.core.ResultNode;
import org.eclipse.symphony.core.SymphonyCorePackage;
import org.eclipse.symphony.core.SymphonyEnvironment;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.topology.SymphonyEnvironmentNode;
import org.eclipse.symphony.core.topology.SymphonyTopologyFacade;
import org.eclipse.symphony.core.topology.ui.Activator;
import org.eclipse.symphony.core.ui.ResultNodePresentation;

public class SymphonyEnvironment3DView extends AbstractSymphony3DView 
{	
	public static final String PART_NAME = "Symphony 3D Viewer";	
	
	private Adapter activeSessionAdapter = null;
	private SymphonyEnvironment symphonyEnvironment = null;		
	private Adapter symphonyEnvironmentAdapter = null;
		
	
	@Override
	public void createPartControl(Composite parent) 
	{		
		super.createPartControl(parent);
		
		// Gets the current Active Session if one exists.
		setSymphonyEnvironment(getActiveSymphonyEnvironment());
				
		// Register to the active session.
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().add(getActiveSessionAdapter());
	}
	
	@Override
	public String getViewID() 
	{		
		return "org.eclipse.symphony.core.topology.ui.views.SymphonyEnvironment3DView";
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
			List list = org.eclipse.symphony.common.converters.Activator.convert(selection, SymphonyEnvironment.class);
	
			if(list.size() > 0) 
			{
				SymphonyEnvironment newDeployment = (SymphonyEnvironment) list.get(0);
				if(newDeployment != symphonyEnvironment)
				{
					setSymphonyEnvironment(newDeployment);
				}
			}
			
			// Tries to see if the selection contains AbstractResult.
			List results = org.eclipse.symphony.common.converters.Activator.convert(selection, AbstractResult.class);
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
		EMFEcoreInvocatorFacade.INSTANCE.eAdapters().remove(getActiveSessionAdapter());
		
		if(symphonyEnvironment != null)
		{
			symphonyEnvironment.eAdapters().remove(getEnvironmentAdapter());
		}
		setSymphonyEnvironment(null);							
		
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
		if(symphonyEnvironment != null)
		{	
			String sessionName = symphonyEnvironment.getInvocatorSession().getName();
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
	
	protected SymphonyEnvironment getActiveSymphonyEnvironment()
	{
		SymphonyEnvironment symphonyEnvironment = null;
		
		InvocatorSession session = EMFEcoreInvocatorFacade.INSTANCE.getActiveInvocatorSession();
		if(session != null)
		{
			if(session.getEnvironment() instanceof SymphonyEnvironment)
			{
				symphonyEnvironment = (SymphonyEnvironment) session.getEnvironment();
			}
		}
		
		return symphonyEnvironment;
	}
	
	private void setSymphonyEnvironment(final SymphonyEnvironment newSymphonyEnvironment)
	{	
		// Check if we need to update the environment.
		if(newSymphonyEnvironment != this.symphonyEnvironment)
		{		
			this.showBusy(true);
			
			if(this.symphonyEnvironment != null)
			{
				this.symphonyEnvironment.eAdapters().remove(getEnvironmentAdapter());
			}
					
			if(newSymphonyEnvironment != null) 
			{
				newSymphonyEnvironment.eAdapters().add(getEnvironmentAdapter());
			}
			
			this.symphonyEnvironment = newSymphonyEnvironment;
			updatePartName();
			
			if(topologyViewer != null)
			{
				Job job = new Job("Update SymphonyEnvironment Topology")
				{
					@Override
					protected IStatus run(IProgressMonitor monitor) 
					{
						try
						{					
							if(newSymphonyEnvironment != null)
							{
								// If the SymphonyEnvironment topology has not been initialize, initialize it and attach
								// SymphonyEnvironmentNode to keep the topology updated.
								if(newSymphonyEnvironment.getSymphonyTopology().getRootNode() == null)
								{
									// Updates the deployment of the deployment node to get the topology to update.
									TransformNode root = Symphony__CommonTopologyFactory.eINSTANCE.createTransformNode();
									root.setNodeId("UNIVERSE_ROOT");
									root.setDescription("Root Node of the Symphony Environment");
									
									// Creates the SymphonyEnvironmentNode that represent the topology associated with the SymphonyEnvironment.
									SymphonyEnvironmentNode symphonyEnvironmentNode = SymphonyTopologyFacade.INSTANCE.createSymphonyEnvironmentNode(newSymphonyEnvironment);									
									root.getChildren().add(symphonyEnvironmentNode);
																		
									newSymphonyEnvironment.getSymphonyTopology().setRootNode(root);				
									
									GraphicsContext graphicsContext = TopologyUIFacade.INSTANCE.createGraphicsContext(newSymphonyEnvironment.getSymphonyTopology().getRootNode());
									if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
								}
								else
								{																
									GraphicsContext graphicsContext = TopologyUIFacade.INSTANCE.createGraphicsContext(newSymphonyEnvironment.getSymphonyTopology().getRootNode());
									if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
								}														
							}
							else
							{
								TransformNode root = Symphony__CommonTopologyFactory.eINSTANCE.createTransformNode();
								root.setNodeId("UNIVERSE_ROOT");
								root.setDescription("Root Node of the Symphony Environment");
								GraphicsContext graphicsContext = TopologyUIFacade.INSTANCE.createGraphicsContext(root);
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
						
						SymphonyEnvironment3DView.this.showBusy(false);
						
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
		  if(symphonyEnvironmentAdapter == null)
		  {
			  	symphonyEnvironmentAdapter = new AdapterImpl()
				{				
					@Override
					public void notifyChanged(Notification msg) 
					{				
						// Events from Deployment
						if(msg.getNotifier() instanceof SymphonyEnvironment)							
						{							
							if(msg.getFeatureID(SymphonyEnvironment.class) == SymphonyCorePackage.SYMPHONY_ENVIRONMENT__NAME)						
							{	
								// Update the part name.
								updatePartName();
							}
						}
					}
				};
		  }
		  
		  return symphonyEnvironmentAdapter;
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
					if(msg.getNotifier() instanceof EMFEcoreInvocatorFacade)
					{
						int featureId = msg.getFeatureID(EMFEcoreInvocatorFacade.class);
						switch (featureId) 
						{
							case EMFEcoreInvocatorPackage.EMF_ECORE_INVOCATOR_FACADE__ACTIVE_INVOCATOR_SESSION:
								if(msg.getNewValue() instanceof InvocatorSession)
								{
									// Gets the current Active Session if one exists.
									setSymphonyEnvironment(getActiveSymphonyEnvironment());
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
