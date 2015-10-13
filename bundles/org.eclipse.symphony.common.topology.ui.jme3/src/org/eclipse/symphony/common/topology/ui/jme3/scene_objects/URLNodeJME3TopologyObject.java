package org.eclipse.symphony.common.topology.ui.jme3.scene_objects;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import jme3tools.optimize.GeometryBatchFactory;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.symphony.common.EclipseUtils;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.TopologyPackage;
import org.eclipse.symphony.common.topology.URLNode;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.adapters.URLNodeSceneObject;
import org.eclipse.symphony.common.topology.ui.jme3.Activator;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities.OS;

import com.jme3.asset.AssetManager;
import com.jme3.asset.plugins.FileLocator;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Node;
import com.jme3.scene.SceneGraphVisitor;
import com.jme3.scene.Spatial;

public class URLNodeJME3TopologyObject extends DefaultJME3SceneObject<URLNode> implements URLNodeSceneObject 
{
	/* Supported file extension, in order of preference.*/
	public final static String[] FILE_EXTENSIONS = new String[] {"j3o", "obj"};	

	private MeshPresentationMode presentationMode = MeshPresentationMode.SURFACE;
	
	private AssetManager assetManager;
	
	private float previousAxisLenght = 1.0f;
	private Geometry axisGeometry = null;	
	
	private Spatial loadedObject;
	private Adapter urlAdapter = null;
	

	public URLNodeJME3TopologyObject(URLNode topologyNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(topologyNode, jme3RenderEngineDelegate);		

		if (jme3Application == null) 
		{
			throw new IllegalArgumentException("Error app == null !");
		}

		if(topologyNode == null)
		{
			throw new IllegalArgumentException("topologyNode == null !");
		}
		assetManager = this.jme3Application.getAssetManager();
		
		try 
		{
			assetManager.registerLocator( new File(".").getCanonicalPath(), FileLocator.class);
			assetManager.registerLocator("/", FileLocator.class);
		} 
		catch (IOException e) 
		{		
			e.printStackTrace();
		}
		
		
		// Attaches the 3DAxis
		getAttachmentNode().attachChild(getAxisGeometry());		

		// Loads the geometry from the URL		
		Job job = new Job("Loading <" + getTopologyNode().getUrl() + ">")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(topologyNode.getUrl());				
				
				getTopologyNode().eAdapters().add(getURLAdapter());	
										
				return Status.OK_STATUS;
			}
		};
		job.schedule();				
		
	}
	
	@Override
	public List<Geometry> getGeometries() 
	{	
		List<Geometry> geometries = new ArrayList<Geometry>();
		
		if(loadedObject instanceof Node)
		{
			Node node = (Node) loadedObject;
			
			List<Geometry> found = JME3Utilities.getAllChildrenGeometry(node);
			geometries.addAll(found);						
		}
		else if(loadedObject instanceof Geometry)
		{
			geometries.add((Geometry) loadedObject);		
		}
		
		return geometries;
	}

	@Override
	public void dispose() 
	{
		// Unregister listener.
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getURLAdapter());	
		}
		super.dispose();
	}
	
	@Override
	public void setAxisVisible(boolean visible) 
	{			
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				if(visible)
				{
					getAttachmentNode().attachChild(getAxisGeometry());
				}
				else
				{
					getAttachmentNode().detachChild(getAxisGeometry());
				}
				
				return null;
			}
		});
	}

	@Override
	public void setAxisLength(double length) 
	{			
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				try
				{
					float scale = (float) Math.abs(length) / previousAxisLenght;
					
					// Scales existing axis.
					getAxisGeometry().scale(scale);
					
					previousAxisLenght = (float) length;
				}
				catch(Throwable t)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to setAxisLength(" + length + ")!", EventSeverity.ERROR, t);
				}
				
				return null;
			}
		});				
	}

	@Override
	public void setPresentationMode(MeshPresentationMode mode) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting presentation mode to " + mode, EventSeverity.INFO);
		this.presentationMode = mode;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{			
				if(loadedObject != null)
				{				
					ModeSceneGraphVisitor modeSceneGraphVisitor = new ModeSceneGraphVisitor(presentationMode);
					loadedObject.breadthFirstTraversal(modeSceneGraphVisitor);
				}
				
				return null;
			}	
		});
	}
	
	@Override
	public void setShadowMode(final ca.gc.space.topology.ui.ShadowMode shadowMode) 
	{
		super.setShadowMode(shadowMode);
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{			
				if(loadedObject != null)
				{				
					ShadowModeSceneGraphVisitor shadowModeSceneGraphVisitor = new ShadowModeSceneGraphVisitor(shadowMode);
					loadedObject.breadthFirstTraversal(shadowModeSceneGraphVisitor);
				}
				
				return null;
			}	
		});
	}
	
	private Geometry getAxisGeometry()
	{
		if(axisGeometry == null)
		{
			axisGeometry = JME3Utilities.createAxis3D(1.0f, assetManager);
		}
		return axisGeometry;
	}
	
	private Spatial loadGeometry(String urlString) 
	{				
		Spatial loadedModel = null;
		
		if(urlString != null)
		{	
			String fileWithoutExtension = stripFileExtension(urlString);	
			int extensionIndex = 0;
			
			while(extensionIndex < FILE_EXTENSIONS.length && loadedModel == null)
			{
				String fileExtension = FILE_EXTENSIONS[extensionIndex];
			
				String fileName = fileWithoutExtension + "." + fileExtension;
				
				try
				{
					Logger.INSTANCE.log(Activator.ID, this, "Loading <" + fileName + "> ...", EventSeverity.INFO);
					URL url = EclipseUtils.resolveURL(Activator.getContext().getBundle(), fileName);					 
					loadedModel = load(url);
				}
				catch(Throwable t)
				{							
				}
				
				extensionIndex ++;
			}			
		}		
		return loadedModel;
	}
			
	/**
	 * Loads an file.
	 * @param url The URL locating the J3O file.
	 * @return The Spatial loaded.
	 */
	private Spatial load(URL url)
	{
		Spatial loadedModel = null;
		
		try
		{
			Logger.INSTANCE.log(Activator.ID, this, "Loading <" + url + ">...", EventSeverity.INFO);
										
			long startTime = System.currentTimeMillis();				
			String fileName = convertURLToAssetString(url);									
			loadedModel = assetManager.loadModel(fileName);			
			long stopTime = System.currentTimeMillis();
			
			if(loadedModel != null)
			{							
				getTopologyNode().setVertexCount(loadedModel.getVertexCount());
				getTopologyNode().setPolygonCount(loadedModel.getTriangleCount());
				
				float loadTime = (stopTime - startTime) * 0.001f; 
				Logger.INSTANCE.log(Activator.ID, this, "Sucessfully loaded <" + url + "> containing <" + getTopologyNode().getVertexCount() + "> vertices and <" + getTopologyNode().getPolygonCount() + "> triangles in <" + loadTime + "> seconds.", EventSeverity.OK);												
			}
		}
		catch(Throwable t)
		{
		}
		
		return loadedModel;
	}
	
	/**
	 * Converts a URL to an asset string name.
	 * @param url The URL.
	 * @return The String conversion.
	 * @throws Exception if something goes wrong.
	 */
	private String convertURLToAssetString(URL url) throws Exception
	{
		String string = null;
		
		// Replaces spaces wthi %20 to ensure the URI 
		URL urlNoSpaces = new URL(url.toString().replaceAll(" ", "%20"));
		
		if(urlNoSpaces.getProtocol().compareToIgnoreCase("file") == 0)
		{			
			File file = new File(urlNoSpaces.toURI());
			if(isWindowsOS())
			{			
				int indexOfDrive = file.toString().indexOf(":");			
				if(indexOfDrive > 0)
				{
					string = file.toString().substring(indexOfDrive + 1);				
				}	
				else
				{
					string = file.toString();
				}
					
				string = string.replace("\\", "/");				
			}
			else
			{			
				string = file.toString();			
			}
		}	
		else
		{			
			throw new IllegalArgumentException("Only file URL are supported !");			
		}
			
		
		return string;
	}
	
	private boolean isWindowsOS()
	{
		return JME3Utilities.getOS() == OS.WINDOWS;
	}
		
	/**
	 * Returns the URl with the file extension stripped (including the dot.)
	 * @param url The url as a string.
	 * @return The url minus the dot and file extension.
	 */
	private String stripFileExtension(String url)
	{
		int index = url.lastIndexOf(".");
		return url.substring(0, index);
	}
	
	/**
	 * Updates this node geometry using the latest url. This is done by removing
	 * existing geometry and adding the newly loaded geometry.
	 * 
	 * @param urlString The url location as a string.
	 */
	private synchronized void updateGeometry(String urlString) 
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{		
				// Delete previous geometry
				if (loadedObject != null) 
				{
					getAttachmentNode().detachChild(loadedObject);
				}

				// Loads the new geometry
				loadedObject = loadGeometry(urlString);
				if (loadedObject != null) 
				{					
					// If the loaded Object is a Node, optimize it.
					if(loadedObject instanceof Node)
					{
						Node optimizedNode = (Node) GeometryBatchFactory.optimize((Node) loadedObject);
						getAttachmentNode().attachChild(optimizedNode);
					}
					else						
					{
						getAttachmentNode().attachChild(loadedObject);
					}
					
					loadedObject.setShadowMode(ShadowMode.Cast);												
				}
				else
				{		
					Logger.INSTANCE.log(Activator.ID, this, "Failed to load geometry from URL <" + getTopologyNode().getUrl() + ">", EventSeverity.ERROR);
					
					getTopologyNode().setPolygonCount(0);
					getTopologyNode().setVertexCount(0);
				}
				
				return null;
			}
		});		
	}

	private Adapter getURLAdapter() 
	{
		if (urlAdapter == null) 
		{
			urlAdapter = new AdapterImpl() 
			{
				public void notifyChanged(org.eclipse.emf.common.notify.Notification msg) 
				{
					if (msg.getFeatureID(URLNode.class) == TopologyPackage.URL_NODE__URL) 
					{
						Job job = new Job("Loadding <" + getTopologyNode().getUrl() + ">.")
						{
							@Override
							protected IStatus run(IProgressMonitor monitor) 
							{			
								updateGeometry(msg.getNewStringValue());
								return Status.OK_STATUS;
							}
						};
						job.schedule();						
					}
				};
			};
		}
		return urlAdapter;
	}
	
	/**
	 * SceneGraphVisitor that applies a mesh presentation mode to all childrens.
	 * @author pallard
	 */
	private class ModeSceneGraphVisitor implements SceneGraphVisitor
	{
		private MeshPresentationMode mode = MeshPresentationMode.SURFACE;
		
		public ModeSceneGraphVisitor(MeshPresentationMode targetPresentationMode)
		{
			this.mode = targetPresentationMode;
		}
		
		@Override
		public void visit(Spatial spatial) 
		{
			if(spatial instanceof Geometry)
			{
				Geometry geometry = (Geometry) spatial;
				Mesh mesh = geometry.getMesh();
				if(mesh != null)
				{
					switch(mode.getValue())
					{
						case MeshPresentationMode.SURFACE_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							mesh.setMode(Mesh.Mode.Triangles);					
						break;
						
						case MeshPresentationMode.WIREFRAME_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(true);
							mesh.setMode(Mesh.Mode.Triangles);
						break;
						
						case MeshPresentationMode.POINTS_VALUE:
							geometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							mesh.setMode(Mesh.Mode.Points);
						break;
					}		
				}
			}						
		}
	}
	
	/**
	 * SceneGraphVisitor that applies a mesh presentation mode to all childrens.
	 * @author pallard
	 */
	private class ShadowModeSceneGraphVisitor implements SceneGraphVisitor
	{
		private ca.gc.space.topology.ui.ShadowMode shadowMode = ca.gc.space.topology.ui.ShadowMode.INHERIT;
		
		public ShadowModeSceneGraphVisitor(ca.gc.space.topology.ui.ShadowMode shadowMode)
		{
			this.shadowMode = shadowMode;
		}
		
		@Override
		public void visit(Spatial spatial) 
		{			
			spatial.setShadowMode(JME3Utilities.convertToJMEShadowMode(shadowMode));
		}
		
	}
}
	
