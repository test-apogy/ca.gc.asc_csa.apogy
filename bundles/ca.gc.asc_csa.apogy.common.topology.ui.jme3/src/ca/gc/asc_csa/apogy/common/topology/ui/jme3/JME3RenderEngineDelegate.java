package ca.gc.asc_csa.apogy.common.topology.ui.jme3;
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

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import javax.vecmath.Point3d;
import javax.vecmath.Tuple3d;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.math.ApogyCommonMathFactory;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;
import ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.IRenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;

import com.jme3.math.Quaternion;
import com.jme3.math.Transform;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;

public class JME3RenderEngineDelegate  implements IRenderEngineDelegate 
{
	private ITopologyViewer topologyViewer;
	
	// The JME3 Simple Application doing the rendering.
	private JME3Application jme3Application = null;	
	
	// A map maintaining the Node to JME3SceneObject relationship.
	private Map<Node, JME3SceneObject> nodeToJME3SceneObjectMap = null;
	
	// A map maintaining the JME3SceneObject to Node relationship.
	private Map<JME3SceneObject, Node> jme3SceneObjectToNodeMap = null;
	
	private boolean verbose = false;
	
	public JME3RenderEngineDelegate()
	{		
	}
		
	@Override
	public Composite createRenderComposite(ITopologyViewer topologyViewer, Composite parent) 
	{	
		this.topologyViewer = topologyViewer;
		
		Composite top = new Composite(parent, SWT.NONE);
		top.setLayout(new FillLayout());
				
		jme3Application = createJME3Application(top);
		
		return top;
	}
	
	@Override
	public void add(NodePresentation nodePresentation) 
	{
		if(nodePresentation != null && nodePresentation.getNode() != null)
		{
			Node node = nodePresentation.getNode();
			
			// Gets the JME3Adapter for the added Node.
			JME3Adapter jme3Adapter = ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator.getDefault().getJME3AdapterFactory().getAdapterFor(node);
			
			if(jme3Adapter != null)
			{
				// We generate the JME3 representation.
				JME3SceneObject jme3SceneObject = jme3Adapter.getAdapter(nodePresentation.getNode(), this);
				
				if(jme3SceneObject != null)
				{				
					// Assigns the SceneObject to the NodePresentation
					nodePresentation.setSceneObject(jme3SceneObject);
															
					// Update the Maps
					getNodeToJME3SceneObjectMap().put(node, jme3SceneObject);
					getJME3SceneObjectToNodeMap().put(jme3SceneObject, node);
					
					// Attaches the child to its parent. This needs to be done on the Viewer Thread.
					try
					{
						// Gets the scene object parent
						JME3SceneObject parent = getSceneObject(node.getParent());

						final JME3SceneObject child = jme3SceneObject;
						jme3Application.enqueue(new Callable<Object>() 
						{
							@Override
							public Object call() throws Exception 
							{											
								if(parent != null)
								{
									if(verbose)  System.out.println("Added " + child);
									parent.getAttachmentNode().attachChild(child.getRoot());
								}
								else
								{
									if(verbose)  System.out.println("Added at ROOT " + child);
									jme3Application.getSceneRoot().attachChild(child.getRoot());
								}
								
								return null;
							}
						});		
					}
					catch(Throwable t)
					{
						t.printStackTrace();
					}					
				}
			}
			else
			{
				Logger.INSTANCE.log(Activator.ID, this, "Could not find JME3Adapter for Node <" + nodePresentation.getNode() + ">!", EventSeverity.WARNING);
			}			
		}
	}

	@Override
	public synchronized void add(List<NodePresentation> nodePresentationList) 
	{
		final Map<NodePresentation, JME3SceneObject> toAdd = new HashMap<NodePresentation, JME3SceneObject>();
		
		// Build a map of all child to be added.
		for(NodePresentation nodePresentation : nodePresentationList)
		{
			Node node = nodePresentation.getNode();
			
			// Gets the JME3Adapter for the added Node.
			JME3Adapter jme3Adapter = ca.gc.asc_csa.apogy.common.topology.ui.jme3.Activator.getDefault().getJME3AdapterFactory().getAdapterFor(node);

			if(jme3Adapter != null)
			{
				// We generate the JME3 representation.
				JME3SceneObject jme3SceneObject = jme3Adapter.getAdapter(nodePresentation.getNode(), this);
		
				// Adds the JME3SceneObject to the map of object to add.
				if(jme3SceneObject != null)
				{				
					// Assigns the SceneObject to the NodePresentation
					nodePresentation.setSceneObject(jme3SceneObject);
				
					toAdd.put(nodePresentation, jme3SceneObject);
					
					// Updates the Maps
					getNodeToJME3SceneObjectMap().put(node, jme3SceneObject);
					getJME3SceneObjectToNodeMap().put(jme3SceneObject, node);
				}
			}
		}
		
		try
		{
			// Attaches all child to their parent. This needs to be done on the Viewer Thread.
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{
					Iterator<NodePresentation> it = toAdd.keySet().iterator();
					while(it.hasNext())
					{
						NodePresentation nodePresentation = it.next();
						Node node = nodePresentation.getNode();
						JME3SceneObject child = toAdd.get(nodePresentation);
						JME3SceneObject parent = getSceneObject(node.getParent());
						
						if(parent != null)
						{
							if(verbose)  System.out.println("Added " + child);							
							parent.getAttachmentNode().attachChild(child.getRoot());
						}
						else
						{
							if(verbose)  System.out.println("Added at ROOT " + child);
							jme3Application.getSceneRoot().attachChild(child.getRoot());
						}
					}				
					return null;
				}
			});
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}

	@Override
	public void remove(final NodePresentation nodePresentation) 
	{	
		if(nodePresentation != null)
		{
			final Node node = nodePresentation.getNode();
			final JME3SceneObject jme3SceneObject = getSceneObject(nodePresentation.getNode());
			if(jme3SceneObject != null)
			{
				try
				{
					jme3Application.enqueue(new Callable<Object>() 
					{
						@Override
						public Object call() throws Exception 
						{
							if(verbose) System.out.println("Removing " + jme3SceneObject);
							
							jme3SceneObject.dispose();
							
							// Removes JME3SceneObject from the Node To JME3SceneObject Map.
							getNodeToJME3SceneObjectMap().remove(node);
							getJME3SceneObjectToNodeMap().remove(jme3SceneObject);
							
							return null;
						}
					});
				}
				catch (Throwable t) 
				{
					t.printStackTrace();
				}				
			}
		}
	}

	@Override
	public synchronized void remove(List<NodePresentation> nodePresentationList) 
	{
		final List<JME3SceneObject> toRemove = new ArrayList<JME3SceneObject>();		
		for(NodePresentation nodePresentation : nodePresentationList)
		{
			Node node = nodePresentation.getNode();
			JME3SceneObject jme3SceneObject = getSceneObject(nodePresentation.getNode());
			
			if(jme3SceneObject != null)
			{
				toRemove.add(jme3SceneObject);
				getJME3SceneObjectToNodeMap().remove(jme3SceneObject);
			}
			
			if(node != null)
			{
				getNodeToJME3SceneObjectMap().remove(jme3SceneObject);
			}			
		}
		
		Future<Boolean> future = jme3Application.enqueue(new Callable<Boolean>() 
		{
			@Override
			public Boolean call() throws Exception 
			{
				for(JME3SceneObject jme3SceneObject : toRemove)
				{
					try
					{
						if(verbose) System.out.println("Removing " + jme3SceneObject);
						jme3SceneObject.dispose();											
					}
					catch (Throwable t) 
					{
						t.printStackTrace();
					}
				}
				return new Boolean(true);
			}
		});
		
		// Wait for the call to be completed.
		try 
		{
			future.get();
		} 
		catch (InterruptedException e) 
		{		
			e.printStackTrace();
		} 
		catch (ExecutionException e) 
		{		
			e.printStackTrace();
		}		
	}

	@Override
	public void setVerbose(boolean verbose) 
	{		
		this.verbose = verbose;
	}

	@Override
	public void setMaximumFrameRate(int maximumFrameRate) 
	{		
		jme3Application.setMaximumFrameRate(maximumFrameRate);
	}

	@Override
	public void setAntiAliasing(boolean enable) 
	{
		jme3Application.setAntiAliasing(enable);
	}

	@Override
	public void setShowStatisticsEnabled(boolean enable) 
	{
		jme3Application.setShowStatisticsEnabled(enable);
	}

	@Override
	public void zoomToFit(TopologyPresentationSet topologyPresentationSet) 
	{
		try
		{
			// First, get the extent of the scene and its center.
			ca.gc.asc_csa.apogy.common.math.Tuple3d min = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
			ca.gc.asc_csa.apogy.common.math.Tuple3d max = ApogyCommonMathFactory.eINSTANCE.createTuple3d(); 
			
			ApogyCommonTopologyUIFacade.INSTANCE.findExtent(topologyPresentationSet.getGraphicsContext().getTopology(), topologyPresentationSet, min, max);
					
			Tuple3d center = new Point3d( (max.getX() + min.getX()) / 2.0, (max.getY() + min.getY())/ 2.0, (max.getZ() + min.getZ()) / 2.0);
						
			// Third, find the distance along the direction we are looking at we need to move by to
			// see the entire extent.
	    	
	    	// Transform extends in view frame.
	    	Vector3f centerVector = new Vector3f((float) center.x, (float) center.y, (float) center.z);  
	    	
	    	// Transform t = new Transform(centerVector,  customCamera.getCurrentOrientation());
	    	Transform t = new Transform(centerVector,  Quaternion.IDENTITY);        	    
	    	
	    	Vector3f minVector = new Vector3f();
	    	Vector3f maxVector = new Vector3f();
	    	minVector = t.transformInverseVector(new Vector3f((float) min.getX(), (float) min.getY(), (float) min.getZ()), minVector);
	    	maxVector = t.transformInverseVector(new Vector3f((float) max.getX(), (float) max.getY(), (float) max.getZ()), maxVector);
	    	    	    	
	    	// Finds distance from center we need to be at.
	    	float hFOV = (float) Math.toRadians(45.0) / 2.0f;    	    	
	    	float distanceY = 0;
	    	
	    	if(Math.abs(minVector.getY()) > Math.abs(maxVector.getY()))
	    	{
	    		distanceY = (float) (Math.abs(minVector.getY()) / Math.tan(hFOV));
	    	}
	    	else
	    	{
	    		distanceY = (float) (Math.abs(maxVector.getY()) / Math.tan(hFOV));
	    	}
	    	
	    	float distanceX = 0;
	    	if(Math.abs(minVector.getX()) > Math.abs(maxVector.getX()))
	    	{
	    		distanceX = (float) (Math.abs(minVector.getX()) / Math.tan(hFOV));
	    	}
	    	else
	    	{
	    		distanceX = (float) (Math.abs(maxVector.getX()) / Math.tan(hFOV));
	    	}
	    	
	    	float distance = 0;
	    	if(distanceX > distanceY) distance = distanceX;
	    	else distance = distanceY;
	       
	    	
	    	Vector3f delta = new Vector3f(0,0,1);
	        delta = jme3Application.getArbitraryViewPointRotation().mult(delta);
	        delta.normalizeLocal();        
	        delta.multLocal(distance);
	        delta.negateLocal();
	
	        Vector3f newLocation = centerVector.add(delta);  
	        
	        // If any of the position is NaN, goes back to 0.0.
	        if(Float.isNaN(newLocation.x) || Float.isNaN(newLocation.y) || Float.isNaN(newLocation.z))
	        {
	        	newLocation.x = 0.0f;
	        	newLocation.y = 0.0f;
	        	newLocation.z = 0.0f;
	        }
	                
	        // Update the position.
	        jme3Application.setArbitraryViewPointLocation(newLocation);
		}
		catch(Throwable t)
		{
			jme3Application.setArbitraryViewPointLocation(new Vector3f(0, 0, 0));
		}	
	}

	@Override
	public BufferedImage takeScreenshot() 
	{
		return jme3Application.takeScreenshot();
	}

	@Override
	public void levelViewPoint() 
	{
		jme3Application.levelViewPoint();		
	}

	@Override
	public void setHighSpeedMotionEnabled(boolean highSpeedMotionEnabled) 
	{
		jme3Application.setHighSpeedMotionEnabled(highSpeedMotionEnabled);
	}
	
	@Override
	public void setPickingModeEnabled(boolean pickingModeEnabled) 
	{	
		jme3Application.setPickingModeEnabled(pickingModeEnabled);
	}
	
	@Override
	public void dispose() 
	{		
		// Remove all remaining node in the NodeToJME3SceneObjectMap.
		getNodeToJME3SceneObjectMap().clear();
		getJME3SceneObjectToNodeMap().clear();
			
		jme3Application.dispose();
		
		this.topologyViewer = null;
	}

	public JME3Application getJME3Application()
	{
		return jme3Application;
	}

	public Node getTopologyNode(Geometry geometry)
	{
		Node node = null;
		final List<JME3SceneObject> sceneObjectList = new ArrayList<JME3SceneObject>(getJME3SceneObjectToNodeMap().keySet());
		Iterator<JME3SceneObject> it = sceneObjectList.iterator();
		while(node == null && it.hasNext())
		{
			JME3SceneObject jme3SceneObject = it.next();
			if(jme3SceneObject.getGeometries().contains(geometry))
			{
				node = jme3SceneObject.getTopologyNode();
			}
		}
		
		return node;
	}

	@Override
	public Node getTopologyNode(Object sceneGraphObject) 
	{	
		if(sceneGraphObject instanceof Geometry)
		{
			return getTopologyNode((Geometry) sceneGraphObject);
		}
		else
		{
			return null;
		}
	}		
	
	public ITopologyViewer getTopologyViewer() 
	{
		return topologyViewer;
	}

	/**
	 * Creates the JME3Application doing the rendering. 
	 * @param parent The parent Composite where the 3D rendering ot to be shown.
	 * @return The JME3Application. 
	 */
	protected JME3Application createJME3Application(Composite parent)
	{
		JME3Application app = new JME3Application(parent);
		app.setJMERenderEngineDelegate(this);
		return app;
	}
	
	protected Map<Node, JME3SceneObject> getNodeToJME3SceneObjectMap() 
	{
		if(nodeToJME3SceneObjectMap == null)
		{
			nodeToJME3SceneObjectMap = new HashMap<Node, JME3SceneObject>();
		}
		return nodeToJME3SceneObjectMap;
	}
		
	protected Map<JME3SceneObject, Node> getJME3SceneObjectToNodeMap() 
	{
		if(jme3SceneObjectToNodeMap == null)
		{
			jme3SceneObjectToNodeMap = new HashMap<JME3SceneObject, Node>();
		}
		return jme3SceneObjectToNodeMap;
	}

	protected JME3SceneObject getSceneObject(Node node)
	{
		if(node == null) return null;
		else return getNodeToJME3SceneObjectMap().get(node);
	}
}
