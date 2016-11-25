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

import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.jface.util.PropertyChangeEvent;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.IViewReference;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPartReference;

import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

import ca.gc.asc_csa.apogy.common.converters.ui.ApogyCommonConvertersUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.core.ApogyCorePackage;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.TopologyRoot;
import ca.gc.asc_csa.apogy.core.topology.ui.Activator;

@Deprecated
public class ApogySystem3DView extends AbstractApogy3DView implements IPropertyChangeListener
{
	public static final String PART_NAME = "Apogy System 3D Viewer";
	
	private ApogySystem ss = null;
	private Adapter apogySystemAdapter = null;
	
	public ApogySystem3DView() 
	{		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);	
	}
	
	@Override
	public String getViewID() 
	{		
		return "ca.gc.asc_csa.apogy.core.topology.ui.views.ApogySystem3DView";
	}
	
	
	@Override
	public void dispose() 
	{
		setApogySystem(null);	
		Activator.getDefault().getPreferenceStore().removePropertyChangeListener(this);	
		super.dispose();
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent event) 
	{		
		if(topologyViewer != null)
		{
			// TODO
		}
	}
	
	private void registerAdapter(final ApogySystem newSS)
	{
		if(ss != null)
		{			
			ss.eAdapters().remove(getApogySystemAdapter());
			
			if(ss.getTopologyRoot() != null)
			{
				ss.getTopologyRoot().eAdapters().remove(getApogySystemAdapter());
			}
		}
		
		if(newSS != null) 
		{
			newSS.eAdapters().add(getApogySystemAdapter());
			
			if(newSS.getTopologyRoot() != null)
			{
				newSS.getTopologyRoot().eAdapters().add(getApogySystemAdapter());
			}
		}
	}
	
	private void setApogySystem(final ApogySystem newSS)
	{
		this.showBusy(true);
				
		registerAdapter(newSS);
		
		this.ss = newSS;
		updatePartName();
		
		if(topologyViewer != null)
		{
			Job job = new Job("Update ApogySystem Topology")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					try
					{
						if(newSS != null)
						{
							// If the ApogyEnvironment topology has not been initialize, initialize it and attach
							// ApogyEnvironmentNode to keep the topology updated.
							if(newSS.getTopologyRoot() != null && newSS.getTopologyRoot().getOriginNode() != null)
							{													
								GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(newSS.getTopologyRoot().getOriginNode());								
								if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
							}							
							else
							{
								TransformNode root = ApogyCommonTopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
								GraphicsContext graphicsContext = ApogyCommonTopologyUIFacade.INSTANCE.createGraphicsContext(root);								
								if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
							}
							
							topologyViewer.zoomToFit();
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
					
					ApogySystem3DView.this.showBusy(false);
					
					return Status.OK_STATUS;
				}	
			};
			job.schedule();	
		}
	}

	/**
	 * Returns if the specified part reference is to this view part (if the part
	 * reference is the console view or not)
	 * 
	 * @param partRef
	 * @return true if the specified part reference is the console view
	 */
	protected boolean isThisPart(IWorkbenchPartReference partRef) 
	{
		if (partRef instanceof IViewReference) 
		{
			IViewReference viewRef = (IViewReference) partRef;
			if (getViewSite() != null && viewRef.getId().equals(getViewSite().getId())) 
			{
				String secId = viewRef.getSecondaryId();
				String mySec = null;
				if (getSite() instanceof IViewSite) 
				{
					mySec = ((IViewSite) getSite()).getSecondaryId();
				}
				
				if (mySec == null) 
				{
					return secId == null;
				}
				return mySec.equals(secId);
			}
		}
		return false;
	}

	@Override
	protected JME3RenderEngineDelegate createJME3RenderEngineDelegate() 
	{
		return new JME3RenderEngineDelegate()
		{
			@Override
			protected JME3Application createJME3Application(Composite parent) 
			{			
				return new JME3Application(parent)
				{
					@Override
					public void simpleInitApp() 
					{
						super.simpleInitApp();				
						RGB backgroundRGB = Activator.getApogySystem3DViewBackgroundColor();
						if(backgroundRGB == null) backgroundRGB = new RGB(0, 0, 0);								
						viewPort.setBackgroundColor(JME3Utilities.convertToColorRGBA(backgroundRGB));
					}
					
					@Override
					protected void initLighting() 
					{						
						super.initLighting();
						
						DirectionalLight lightXPos = new DirectionalLight();
						lightXPos.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));		
						lightXPos.setDirection(new Vector3f(1, 0, 0));
						rootNode.addLight(lightXPos);
						
						DirectionalLight lightXNeg = new DirectionalLight();
						lightXNeg.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));		
						lightXNeg.setDirection(new Vector3f(-1, 0, 0));
						rootNode.addLight(lightXNeg);
						
						DirectionalLight lightYPos = new DirectionalLight();
						lightYPos.setColor(new ColorRGBA(1.0f, 1.0f, 1.0f, 1f));		
						lightYPos.setDirection(new Vector3f(0, 1, 0));
						rootNode.addLight(lightYPos);
						
						DirectionalLight lightYNeg = new DirectionalLight();
						lightYNeg.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));		
						lightYNeg.setDirection(new Vector3f(0, -1, 0));
						rootNode.addLight(lightYNeg);
						
						DirectionalLight lightZPos = new DirectionalLight();
						lightZPos.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));		
						lightZPos.setDirection(new Vector3f(0, 0, 1));
						rootNode.addLight(lightZPos);
						
						DirectionalLight lightZNeg = new DirectionalLight();
						lightZNeg.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));		
						lightZNeg.setDirection(new Vector3f(0, 0, -1));
						rootNode.addLight(lightZNeg);
					}
				};
			}
		};		
	}	

	@Override
	protected String getPartNamePrefix() 
	{		
		return PART_NAME;
	}

	@Override
	protected String getPartNameSuffix() 
	{
		if(ss != null)
		{
			if(ss.getName() != null && ss.getName().length() > 0)
			{
				return ss.getName();
			}
			else
			{
				return "?";
			}
		}
		
		return "?";
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void updateSelection(ISelection selection) 
	{	
		List systems = ApogyCommonConvertersUIFacade.INSTANCE.convert(selection, ApogySystem.class);
		if(systems.size() > 0)
		{
			ApogySystem newSS = (ApogySystem) systems.get(0);
			if(newSS != ss)
			{
				setApogySystem(newSS);
			}
		}
	}
	
	/*
	 * Return the Adapter listening to the selected environment.
	 */
	private Adapter getApogySystemAdapter()
	{
		  if(apogySystemAdapter == null)
		  {
			  	apogySystemAdapter = new AdapterImpl()
				{				
					@Override
					public void notifyChanged(Notification msg) 
					{				
						// Events from Deployment
						if(msg.getNotifier() instanceof ApogySystem)							
						{			
							int featureId = msg.getFeatureID(ApogySystem.class);
							
							switch (featureId) 
							{
								case ApogyCorePackage.APOGY_SYSTEM__TOPOLOGY_ROOT:
									// Force the System to be displayed.
									setApogySystem(ss);
									
									// Update the part name.
									updatePartName();
								break;

								default:
								break;
							}							
						}
						else if(msg.getNotifier() instanceof TopologyRoot)
						{
							int featureId = msg.getFeatureID(TopologyRoot.class);
							
							switch (featureId) 
							{
								case ApogyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
									// Force the System to be displayed.
									setApogySystem(ss);
									
									// Update the part name.
									updatePartName();
								break;

								default:
								break;
							}	
						}
					}
				};
		  }
		  
		  return apogySystemAdapter;
	}
}
