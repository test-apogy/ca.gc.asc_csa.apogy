package ca.gc.asc_csa.symphony.topology.ui.views;

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

import ca.gc.asc_csa.symphony.core.SymphonyCorePackage;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.asc_csa.symphony.core.TopologyRoot;
import ca.gc.asc_csa.symphony.topology.ui.Activator;
import ca.gc.asc_csa.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.space.topology.TopologyFacade;
import ca.gc.space.topology.TransformNode;
import ca.gc.space.topology.ui.GraphicsContext;
import ca.gc.space.topology.ui.TopologyUIFacade;

import com.jme3.light.AmbientLight;
import com.jme3.light.DirectionalLight;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;

public class SymphonySystem3DView extends AbstractSymphony3DView implements IPropertyChangeListener
{
	public static final String PART_NAME = "Symphony System 3D Viewer";
	
	private SymphonySystem ss = null;
	private Adapter symphonySystemAdapter = null;
	
	public SymphonySystem3DView() 
	{		
		Activator.getDefault().getPreferenceStore().addPropertyChangeListener(this);	
	}
	
	@Override
	public String getViewID() 
	{		
		return "ca.gc.asc_csa.symphony.topology.ui.views.SymphonySystem3DView";
	}
	
	
	@Override
	public void dispose() 
	{
		setSymphonySystem(null);	
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
	
	private void registerAdapter(final SymphonySystem newSS)
	{
		if(ss != null)
		{			
			ss.eAdapters().remove(getSymphonySystemAdapter());
			
			if(ss.getTopologyRoot() != null)
			{
				ss.getTopologyRoot().eAdapters().remove(getSymphonySystemAdapter());
			}
		}
		
		if(newSS != null) 
		{
			newSS.eAdapters().add(getSymphonySystemAdapter());
			
			if(newSS.getTopologyRoot() != null)
			{
				newSS.getTopologyRoot().eAdapters().add(getSymphonySystemAdapter());
			}
		}
	}
	
	private void setSymphonySystem(final SymphonySystem newSS)
	{
		this.showBusy(true);
				
		registerAdapter(newSS);
		
		this.ss = newSS;
		updatePartName();
		
		if(topologyViewer != null)
		{
			Job job = new Job("Update SymphonySystem Topology")
			{
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					try
					{
						if(newSS != null)
						{
							// If the SymphonyEnvironment topology has not been initialize, initialize it and attach
							// SymphonyEnvironmentNode to keep the topology updated.
							if(newSS.getTopologyRoot() != null && newSS.getTopologyRoot().getOriginNode() != null)
							{													
								GraphicsContext graphicsContext = TopologyUIFacade.INSTANCE.createGraphicsContext(newSS.getTopologyRoot().getOriginNode());								
								if(topologyViewer != null) topologyViewer.setInput(graphicsContext);
							}							
							else
							{
								TransformNode root = TopologyFacade.INSTANCE.createTransformNodeXYZ(0, 0, 0, 0, 0, 0);
								GraphicsContext graphicsContext = TopologyUIFacade.INSTANCE.createGraphicsContext(root);								
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
					
					SymphonySystem3DView.this.showBusy(false);
					
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
						RGB backgroundRGB = Activator.getSymphonySystem3DViewBackgroundColor();
						if(backgroundRGB == null) backgroundRGB = new RGB(0, 0, 0);								
						viewPort.setBackgroundColor(JME3Utilities.convertToColorRGBA(backgroundRGB));
					}
					
					@Override
					protected void initLighting() 
					{						
						AmbientLight ambLight = new AmbientLight();
						ambLight.setColor(new ColorRGBA(0.5f, 0.5f, 0.5f,1f));										
						rootNode.addLight(ambLight);
						
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
		List systems = org.eclipse.symphony.common.converters.Activator.convert(selection, SymphonySystem.class);
		if(systems.size() > 0)
		{
			SymphonySystem newSS = (SymphonySystem) systems.get(0);
			if(newSS != ss)
			{
				setSymphonySystem(newSS);
			}
		}
	}
	
	/*
	 * Return the Adapter listening to the selected environment.
	 */
	private Adapter getSymphonySystemAdapter()
	{
		  if(symphonySystemAdapter == null)
		  {
			  	symphonySystemAdapter = new AdapterImpl()
				{				
					@Override
					public void notifyChanged(Notification msg) 
					{				
						// Events from Deployment
						if(msg.getNotifier() instanceof SymphonySystem)							
						{			
							int featureId = msg.getFeatureID(SymphonySystem.class);
							
							switch (featureId) 
							{
								case SymphonyCorePackage.SYMPHONY_SYSTEM__TOPOLOGY_ROOT:
									// Force the System to be displayed.
									setSymphonySystem(ss);
									
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
								case SymphonyCorePackage.TOPOLOGY_ROOT__ORIGIN_NODE:
									// Force the System to be displayed.
									setSymphonySystem(ss);
									
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
		  
		  return symphonySystemAdapter;
	}
}
