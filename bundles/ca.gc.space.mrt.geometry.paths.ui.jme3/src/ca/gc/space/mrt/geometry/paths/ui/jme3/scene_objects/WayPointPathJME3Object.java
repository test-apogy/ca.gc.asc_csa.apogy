package ca.gc.space.mrt.geometry.paths.ui.jme3.scene_objects;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.vecmath.Point3d;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

import ca.gc.asc_csa.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dPackage;
import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.geometry.paths.ui.PathPresentationMode;
import ca.gc.space.mrt.geometry.paths.ui.WayPointPathSceneObject;
import ca.gc.space.mrt.geometry.paths.ui.jme3.Activator;

import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.scene.Mesh.Mode;
import com.jme3.scene.Node;
import com.jme3.scene.shape.Sphere;
import com.jme3.util.BufferUtils;

public class WayPointPathJME3Object extends DefaultJME3SceneObject<WayPointPath> implements WayPointPathSceneObject
{	
	public static ColorRGBA DEFAULT_START_POINT_COLOR = ColorRGBA.Red;
	public static ColorRGBA DEFAULT_END_POINT_COLOR = ColorRGBA.Blue;
	
	public static ColorRGBA DEFAULT_POINT_COLOR = new ColorRGBA(0.0f, 1.0f, 0.0f, 1.0f);
		
	private int pointSize = 1;
	
	private float endPointSize = 0.05f;
	
	private PathPresentationMode pathPresentationMode = PathPresentationMode.POINTS_LINES;
	
	private Point3d centroid = null;
	
	private Geometry pathLinesGeometry = null;	
	private Geometry pathPointsGeometry = null;
	
	private Node startPointNode;
	private Node endPointNode;
	
	private Adapter modelListener;


	public WayPointPathJME3Object(WayPointPath node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);

		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}						
		
		Job job = new Job("WayPointPathJME3Object : Updating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(getTopologyNode());
				
				getTopologyNode().eAdapters().add(getPointsListener());
				
				// Add listener to all points;
				for(CartesianPositionCoordinates point : getTopologyNode().getPoints())
				{
					point.eAdapters().add(getPointsListener());
				}
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		
	}
	
	@Override
	public void dispose() 
	{
		if(getTopologyNode() != null)
		{
			// Removes listener from WayPointPath;
			getTopologyNode().eAdapters().remove(getPointsListener());
			
			// Removes listener from all points;
			for(CartesianPositionCoordinates point : getTopologyNode().getPoints())
			{
				point.eAdapters().remove(getPointsListener());
			}
		}
		
		super.dispose();
	}
	
	@Override
	public int getPointSize() 
	{		
		return pointSize;
	}

	@Override
	public void setPathPresentationMode(final PathPresentationMode mode) 
	{					
		pathPresentationMode = mode;

		if(getTopologyNode().getPoints().size() > 0)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Setting PathPresentationMode to <" + mode + ">...", EventSeverity.INFO);
			
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{
					switch (mode.getValue()) 
					{
						case PathPresentationMode.LINES_VALUE:
							
							// Detaches points geometry.
							if(pathPointsGeometry != null)
							{
								getAttachmentNode().detachChild(pathPointsGeometry);
							}
							
							// Attaches lines geometry.
							if(pathLinesGeometry != null)
							{
								if(!getAttachmentNode().getChildren().contains(pathLinesGeometry))
								{
									getAttachmentNode().attachChild(pathLinesGeometry);
								}
							}
						break;
						
						case PathPresentationMode.POINTS_VALUE:	
							
							// Detaches lines geometry.
							if(pathLinesGeometry != null)
							{
								getAttachmentNode().detachChild(pathLinesGeometry);
							}
							
							// Attaches points geometry.
							if(pathPointsGeometry != null)
							{
								if(!getAttachmentNode().getChildren().contains(pathPointsGeometry))
								{
									getAttachmentNode().attachChild(pathPointsGeometry);
								}
							}
						break;
						
						case PathPresentationMode.POINTS_LINES_VALUE:
							// Attaches both geometries.
							if(pathLinesGeometry != null)
							{
								if(!getAttachmentNode().getChildren().contains(pathLinesGeometry))
								{
									getAttachmentNode().attachChild(pathLinesGeometry);
								}
							}
							
							if(pathPointsGeometry != null)
							{
								if(!getAttachmentNode().getChildren().contains(pathPointsGeometry))
								{
									getAttachmentNode().attachChild(pathPointsGeometry);
								}
							}
						break;

						default:
						break;
					}
					
					return null;
				}
			});
		}	
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Set PathPresentationMode to <" + mode + "> : WayPoint contains no points !", EventSeverity.WARNING);
		}
	}

	@Override
	public PathPresentationMode getPathPresentationMode() 
	{		
		return pathPresentationMode;
	}

	@Override
	public Point3d getCentroid() 
	{
		if (centroid == null) 
		{
			centroid = new Point3d(0.0, 0.0, 0.0);

			if (getTopologyNode().getPoints().size() > 0) 
			{
				for (CartesianPositionCoordinates point : getTopologyNode().getPoints()) 
				{
					centroid.x += point.getX();
					centroid.y += point.getY();
					centroid.z += point.getZ();
				}

				centroid.scale(1.0 / (double) getTopologyNode().getPoints().size());
			}
		}
		return centroid;
	}

	public void setPointSize(int pointSize) 
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				if(pathPointsGeometry != null && pathPointsGeometry.getMesh() != null)
				{
					pathPointsGeometry.getMesh().setPointSize(pointSize);
				}
				return null;
			}
		});					
	}
	
	@Override
	public void setEndPointsRadius(float endPointsRadius) 
	{
		if(endPointsRadius >= 0)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Setting end point radius to <" + endPointsRadius + ">...", EventSeverity.INFO);
			
			this.endPointSize = endPointsRadius;
			
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{	
					if(getTopologyNode().getPoints().size() > 1)
					{
						// Updates the start point if necessary.
						if(startPointNode != null && getAttachmentNode().getChildren().contains(startPointNode))
						{
							getAttachmentNode().detachChild(startPointNode);
							startPointNode = createStartPointNode();
							getAttachmentNode().attachChild(startPointNode);
						}
						
						// Updates the end point if necessary.
						if(endPointNode != null && getAttachmentNode().getChildren().contains(endPointNode))
						{
							getAttachmentNode().detachChild(endPointNode);
							endPointNode = createEndPointNode();
							getAttachmentNode().attachChild(endPointNode);
						}
					}
					return null;
				}
			});		
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, "Failed to set end point radius to <" + endPointsRadius + ">! Radius cannot be negative !", EventSeverity.ERROR);
		}
	}

	@Override
	public float getEndPointsRadius() {
		return endPointSize;
	}
	
	
	@Override
	public void setColor(RGB rgb) 
	{		
		// Change the material in the Renderer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{					
				if(pathLinesGeometry != null && pathLinesGeometry.getMesh() != null)
				{
					final Material mat = createLineMaterial();				
					mat.setColor("Color", JME3Utilities.convertToColorRGBA(rgb));				
					pathLinesGeometry.setMaterial(mat);					
				}
				
				if(pathPointsGeometry != null && pathPointsGeometry.getMesh() != null)
				{
					final Material mat = createLineMaterial();				
					mat.setColor("Color", JME3Utilities.convertToColorRGBA(rgb));				
					pathPointsGeometry.setMaterial(mat);					
				}
				
				return null;
			}
		});
	}
	
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(pathLinesGeometry);
		geometries.add(pathPointsGeometry);				
		return geometries;
	}
	
	
	private void updateGeometry(final WayPointPath wayPointPath)
	{
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				if(pathLinesGeometry != null) getAttachmentNode().detachChild(pathLinesGeometry);
				if(pathPointsGeometry != null) getAttachmentNode().detachChild(pathPointsGeometry);
				if(startPointNode != null) getAttachmentNode().detachChild(startPointNode);
				if(endPointNode != null) getAttachmentNode().detachChild(endPointNode);
				
				// Creates the points and line geometries.
				pathPointsGeometry = createPointsGeometry();
				pathLinesGeometry = createLineGeometry();
				
				// Attaches the start point geometry
				if(getTopologyNode().getPoints().size() > 0)
				{
					switch (pathPresentationMode.getValue()) 
					{
						case PathPresentationMode.LINES_VALUE:							
							getAttachmentNode().attachChild(pathLinesGeometry);								
						break;
						
						case PathPresentationMode.POINTS_VALUE:							
							getAttachmentNode().attachChild(pathPointsGeometry);	
						break;
												
						case PathPresentationMode.POINTS_LINES_VALUE:							
							getAttachmentNode().attachChild(pathLinesGeometry);										
							getAttachmentNode().attachChild(pathPointsGeometry);
						break;
					}
												
					
					if(getTopologyNode().getPoints().size() > 1)
					{
						// Attaches the start point geometry
						startPointNode = createStartPointNode();
						getAttachmentNode().attachChild(startPointNode);												
					}
					
					// If there is at least 2 point in the trajectory, add the end point.
					if(getTopologyNode().getPoints().size() > 2)
					{									
						// Attaches the end point geometry
						endPointNode = createEndPointNode();
						getAttachmentNode().attachChild(endPointNode);
					}
				}				
				
				return null;
			}
		});	
	}
	
	private Geometry createLineGeometry()
	{		
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		
		int index = 0;
		for(CartesianPositionCoordinates point : getTopologyNode().getPoints())
		{
			verticesList.add(new Vector3f((float) point.getX(), (float) point.getY(), (float) point.getZ()));										
			if(index > 0)
			{
				indexesList.add(new Integer(index - 1));
				indexesList.add(new Integer(index));
			}
			
			
			index++;
		}
									
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Lines);
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 2, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));				
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry geometry = null;
		
		if(getTopologyNode().getNodeId() != null)
		{
			geometry = new Geometry(getTopologyNode().getNodeId(), mesh);
		}
		else
		{
			geometry = new Geometry("WayPointPath", mesh);
		}
		geometry.setMaterial(createLineMaterial());	
		
		return geometry;
	}	
	
	private Geometry createPointsGeometry()
	{
		List<Vector3f> verticesList = new ArrayList<Vector3f>();
		List<Integer> indexesList = new ArrayList<Integer>();
		
		int index = 0;
		for(CartesianPositionCoordinates point : getTopologyNode().getPoints())
		{
			verticesList.add(new Vector3f((float) point.getX(), (float) point.getY(), (float) point.getZ()));	
			indexesList.add(new Integer(index));			
			index++;
		}
									
		Mesh mesh = new Mesh();
		mesh.setMode(Mode.Points);
		mesh.setBuffer( com.jme3.scene.VertexBuffer.Type.Position, 3, BufferUtils.createFloatBuffer(JME3Utilities.convertToFloatArray(verticesList)));
		mesh.setBuffer(com.jme3.scene.VertexBuffer.Type.Index, 1, BufferUtils.createIntBuffer(JME3Utilities.convertToIntArray(indexesList)));				
		mesh.updateBound();
		mesh.updateCounts();
		
		Geometry geometry = null;
		
		if(getTopologyNode().getNodeId() != null)
		{
			geometry = new Geometry(getTopologyNode().getNodeId(), mesh);
		}
		else
		{
			geometry = new Geometry("WayPointPath", mesh);
		}
		geometry.setMaterial(createLineMaterial());	
		
		return geometry;
	}	
	
	private Material createLineMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  
		
		if(getColor() == null)
		{
			mat.setColor("Color", DEFAULT_POINT_COLOR.clone());
		}
		else
		{
			mat.setColor("Color", JME3Utilities.convertToColorRGBA(getColor()));
		}	
		
		return mat;
	}
	
	private Node createStartPointNode()
	{				
		Node node = new Node("Start Point");
		
		node.setLocalTranslation(JME3Utilities.convertToVector3f(getTopologyNode().getStartPoint().asPoint3d()));
		
		Sphere sphere = new Sphere(10, 36, endPointSize);		
		Geometry geometry = new Geometry("Start Point Geometry", sphere);		
		geometry.setMaterial(createStartPointMaterial());
		
		node.attachChild(geometry);
		
		return node;
	}
	
	private Material createStartPointMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", DEFAULT_START_POINT_COLOR);		
		return mat;
	}
	
	private Node createEndPointNode()
	{				
		Node node = new Node("End Point");
		
		node.setLocalTranslation(JME3Utilities.convertToVector3f(getTopologyNode().getEndPoint().asPoint3d()));
		
		Sphere sphere = new Sphere(10, 36, endPointSize);		
		Geometry geometry = new Geometry("End Point Geometry", sphere);		
		geometry.setMaterial(createEndPointMaterial());
		
		node.attachChild(geometry);
		
		return node;
	}
	
	private Material createEndPointMaterial()
	{
		Material mat = new Material(getApplication().getAssetManager(),  "Common/MatDefs/Misc/Unshaded.j3md");
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);  		
		mat.setColor("Color", DEFAULT_END_POINT_COLOR);		
		return mat;
	}
	
	private void addPoint(CartesianPositionCoordinates point)
	{			
		Job job = new Job("WayPointPathJME3Object : Updating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(getTopologyNode());
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		
		point.eAdapters().add(getPointsListener());
	}
	
	private void addPoints(List<CartesianPositionCoordinates>  points)
	{
		
		Job job = new Job("WayPointPathJME3Object : Updating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(getTopologyNode());
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		
		// Add listener to all points;
		for(CartesianPositionCoordinates point : points)
		{
			point.eAdapters().add(getPointsListener());
		}
	}
	
		
	private void removePoint(CartesianPositionCoordinates point)
	{
		Job job = new Job("WayPointPathJME3Object : Updating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(getTopologyNode());
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		
		point.eAdapters().remove(getPointsListener());
	}

	private void removePoints(List<CartesianPositionCoordinates>  points)
	{
		Job job = new Job("WayPointPathJME3Object : Updating geometry")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{
				updateGeometry(getTopologyNode());
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();
		
		// Removes listener from all points;
		for(CartesianPositionCoordinates point : points)
		{
			point.eAdapters().remove(getPointsListener());
		}
	}
	
	
	/**
	 * Returns the listener used to monitor the associated CartesianCoordinatesSet to respond to changes.
	 * @return The Adapter.
	 */
	private Adapter getPointsListener() 
	{
		if (modelListener == null) 
		{
			modelListener = new AdapterImpl() 
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification notification) 
				{
					if(notification.getNotifier() instanceof WayPointPath)
					{										
						int featureId = notification.getFeatureID(WayPointPath.class);
	
						switch (featureId) 
						{
							case Data3dPackage.CARTESIAN_COORDINATES_MESH__POINTS:
								int eventType = notification.getEventType() ;
								switch(eventType)
								{
									case Notification.ADD:
										{
											if(notification.getNewValue() instanceof CartesianPositionCoordinates)
											{
												CartesianPositionCoordinates point = (CartesianPositionCoordinates) notification.getNewValue();
												addPoint(point);
											}
										}		
									break;
									case Notification.ADD_MANY:
										{
											List<CartesianPositionCoordinates> added = (List<CartesianPositionCoordinates>) notification.getNewValue();
											addPoints(added);
										}
									break;
									case Notification.REMOVE:
										{
											if(notification.getOldValue() instanceof CartesianPositionCoordinates)
											{
												CartesianPositionCoordinates point = (CartesianPositionCoordinates) notification.getOldValue();
												removePoint(point);
											}
										}
									break;
									case Notification.REMOVE_MANY:
										{
											List<CartesianPositionCoordinates> removed = (List<CartesianPositionCoordinates>) notification.getOldValue();
											removePoints(removed);
										}										
									break;
									case Notification.MOVE:
									{
										Job job = new Job("WayPointPathJME3Object : Updating geometry")
										{
											@Override
											protected IStatus run(IProgressMonitor monitor) 
											{
												updateGeometry(getTopologyNode());
												
												return Status.OK_STATUS;
											}
										};
										job.schedule();
									}										
								break;
									
									default:
									break;								
								}
							default:
							break;
						}
					}
					else if(notification.getNotifier() instanceof CartesianPositionCoordinates)
					{
						int featureId = notification.getFeatureID(CartesianPositionCoordinates.class);
						
						switch (featureId) 
						{
							case Data3dPackage.CARTESIAN_POSITION_COORDINATES__X:
							case Data3dPackage.CARTESIAN_POSITION_COORDINATES__Y:
							case Data3dPackage.CARTESIAN_POSITION_COORDINATES__Z:
							{
								Job job = new Job("WayPointPathJME3Object : Updating geometry")
								{
									@Override
									protected IStatus run(IProgressMonitor monitor) 
									{
										updateGeometry(getTopologyNode());
										
										return Status.OK_STATUS;
									}
								};
								job.schedule();
							}
							break;
							default:
							break;
						}
						
					}
				}
			};
		}
		return modelListener;
	}
}
