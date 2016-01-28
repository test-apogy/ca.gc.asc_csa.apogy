package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.scene_objects;

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
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.preference.PreferenceConverter;
import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.Activator;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.jme3.Data3dJME3Utilities;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.preferences.MRTData3DUIPreferencesConstants;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ui.scene_objects.TriangularMeshSceneObject;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.topology.ContentNode;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3RenderEngineDelegate;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;

public class TriangularMeshJM3SceneObject extends DefaultJME3SceneObject<ContentNode<CartesianTriangularMesh>> implements TriangularMeshSceneObject
{	
	private boolean useShading = true;
	
	private boolean updatingGeometry = false;
	
	private ColorRGBA meshColor = getDefaultMeshColor();
	private RGB rgb;
	private MeshPresentationMode meshPresentationMode = MeshPresentationMode.SURFACE;
		
	private Adapter contentAdapter = null;
	private Adapter pointsAdapter = null;
	private Adapter polygonsAdapter = null;
	
	private Point3d centroid = null;
	private CartesianTriangularMesh mesh = null;
	
	private AssetManager assetManager;
	private Geometry meshGeometry = null;
	private com.jme3.scene.Mesh jme3mMesh = null;
	
	public TriangularMeshJM3SceneObject(ContentNode<CartesianTriangularMesh> meshContentNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(meshContentNode, jme3RenderEngineDelegate);
		
		if (meshContentNode == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
						
		this.assetManager = jme3Application.getAssetManager();
		this.mesh = meshContentNode.getContent();		
		
		// Updates the geometry.
		Job job = new Job("TriangularMeshJM3SceneObject : Updating Geometry.")
		{
			@Override
			protected IStatus run(IProgressMonitor monitor) 
			{					
				// Creates the new mesh.
				final Mesh newMesh = Data3dJME3Utilities.createMesh(mesh);
				
				jme3Application.enqueue(new Callable<Object>() 
				{
					@Override
					public Object call() throws Exception 
					{					
						updateGeometryInternal(newMesh);		
						setPresentationMode(meshPresentationMode);						
						return null;
					}
				});
				
				return Status.OK_STATUS;
			}
		};
		job.schedule();	
					
		meshContentNode.eAdapters().add(getContentAdapter());
		this.mesh = meshContentNode.getContent();
		this.mesh.eAdapters().add(getPointsAdapter());
		this.mesh.eAdapters().add(getPolygonsAdapter());
	}

	@Override
	public Point3d getCentroid() 
	{
		if (centroid == null) 
		{
			centroid = new Point3d(0.0, 0.0, 0.0);

			if (mesh != null && mesh.getPoints().size() > 0) 
			{
				for (CartesianPositionCoordinates point : mesh.getPoints()) 
				{
					centroid.x += point.getX();
					centroid.y += point.getY();
					centroid.z += point.getZ();
				}

				centroid.scale(1.0 / (double) mesh.getPoints().size());
			}
		}
		return centroid;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting color to <" + rgb + ">...", EventSeverity.INFO);
		this.rgb = rgb;
		meshColor = JME3Utilities.convertToColorRGBA(rgb);
		
		// Change the material in the Renderer thread.
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{					
				if(meshGeometry != null)
				{					
					Material mat = createMaterial();
					
					if(useShading)
					{
						mat.setColor("Diffuse", meshColor);
						mat.setColor("Ambient", meshColor);
						mat.setColor("Specular", meshColor);
					}
					else
					{	
						mat.setColor("Color", meshColor);
					}
					meshGeometry.setMaterial(mat);
				}
				return null;
			}
		});		
	}
	
	@Override
	public RGB getColor() 
	{
		return rgb;
	}

	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(meshGeometry);
		return geometries;
	}
	
	@Override
	public void dispose() 
	{
		// Unregister listener from content node.
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getContentAdapter());
		}
		
		// Unregister listeners from mesh.
		if(mesh != null)
		{			
			mesh.eAdapters().remove(getPointsAdapter());
			mesh.eAdapters().remove(getPolygonsAdapter());
		}		
		
		
		// Removes references.
		this.assetManager = null;
		this.centroid = null;
		this.mesh = null;
		this.pointsAdapter = null;
		this.contentAdapter = null;
		
		super.dispose();
	}
	
	@Override
	public void setPresentationMode(MeshPresentationMode mode) 
	{				
		Logger.INSTANCE.log(Activator.ID, this, "Setting presentation mode to " + mode, EventSeverity.INFO);
		this.meshPresentationMode = mode;
		if(meshGeometry != null && meshGeometry.getMaterial() != null)
		{
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{	
					switch (meshPresentationMode.getValue()) 
					{
						case MeshPresentationMode.SURFACE_VALUE:
							meshGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							if(meshGeometry.getMesh() != null) meshGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
							break;
						case MeshPresentationMode.WIREFRAME_VALUE:
							meshGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);
							if(meshGeometry.getMesh() != null) meshGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Triangles);
							break;
						case MeshPresentationMode.POINTS_VALUE:
							meshGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
							if(meshGeometry.getMesh() != null) meshGeometry.getMesh().setMode(com.jme3.scene.Mesh.Mode.Points);					
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
			Logger.INSTANCE.log(Activator.ID, this, "Failed to set presentation mode to " + mode, EventSeverity.WARNING);
		}
	}

	@Override
	public void setPointSize(int pointSize) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Setting point size to " + pointSize, EventSeverity.INFO);
		
		if(jme3mMesh != null)
		{
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{
					jme3mMesh.setPointSize(pointSize);
					return null;
				}
			});
		}
	}
	

	@Override
	public void setUseShading(boolean useShading) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting use shading to " + useShading, EventSeverity.INFO);
		
		this.useShading = useShading;
		
		// Update material.
		if(jme3mMesh != null)
		{
			jme3Application.enqueue(new Callable<Object>() 
			{
				@Override
				public Object call() throws Exception 
				{
					Material mat = createMaterial();
					
					if(useShading)
					{
						mat.setColor("Diffuse", meshColor);
						mat.setColor("Ambient", meshColor);
						mat.setColor("Specular", meshColor);
					}
					else
					{	
						mat.setColor("Color", meshColor);
					}
					meshGeometry.setMaterial(mat);
					return null;
				}
			});
		}
	}	
	
	/**
	 * Updates geometry.
	 */
	private void updateGeometry()
	{			
		final Mesh newMesh = Data3dJME3Utilities.createMesh(mesh);
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{					
				updateGeometryInternal(newMesh);
				return null;
			}
		});
	}
	
	
	/**
	 * Updates geometry. NOT THREAD SAFE.
	 */
	private void updateGeometryInternal(final Mesh newMesh)
	{	
		try
		{
			if(!updatingGeometry)
			{
				updatingGeometry = true;
				
				// Invalidate the centroid.
				centroid = null;
				
				// Detach previous geometry if required.
				if(meshGeometry != null)
				{
					getAttachmentNode().detachChild(meshGeometry);						
				}
				
				jme3mMesh = newMesh;
				
				// Updates the mesh if applicable.
				if(jme3mMesh != null)
				{
					if(getTopologyNode().getNodeId() != null)
					{
						meshGeometry = new Geometry(getTopologyNode().getNodeId(), jme3mMesh);
					}
					else
					{
						meshGeometry = new Geometry("CartesianTriangularMesh", jme3mMesh);
					}
									
					meshGeometry.setMaterial(createMaterial());
					meshGeometry.setShadowMode(ShadowMode.CastAndReceive);				
					
					getAttachmentNode().attachChild(meshGeometry);
				}
				
				updatingGeometry = false;
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
		}
	}
		
	private Material createMaterial()
	{
		Material mat = null;		
		
		if(useShading)
		{	
			mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");				
		
			if(meshColor != null)
			{
				mat.setColor("Diffuse", meshColor);
				mat.setColor("Ambient", meshColor);
				mat.setColor("Specular", meshColor);
			}		
					
			mat.setFloat("Shininess",64f); 	
			mat.setBoolean("UseMaterialColors",true);  							
		}
		else
		{
			mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");
			if(meshColor != null)
			{
				mat.setColor("Color", meshColor);
			}
		}		
			
		return mat;
	}
	
	private ColorRGBA getDefaultMeshColor()
	{
		ColorRGBA rgba = null;
		
		IPreferenceStore store = ca.gc.asc_csa.apogy.common.geometry.data3d.ui.Activator.getDefault().getPreferenceStore();
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID);
		
		if(rgb != null)
		{
			rgba = JME3Utilities.convertToColorRGBA(rgb);
		}
		else
		{
			rgba = new ColorRGBA(1.0f, 0f, 0.0f, 1.0f);
		}
		
		return rgba;
	}
	
	private Adapter getPointsAdapter() {
		if (pointsAdapter == null) {
			pointsAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					int featureId = msg
							.getFeatureID(CartesianTriangularMesh.class);

					if (featureId == ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH__POINTS) {
						if (msg.getEventType() == Notification.ADD_MANY
								|| msg.getEventType() == Notification.REMOVE_MANY) {
							updateGeometry();
						} else if (msg.getEventType() == Notification.ADD
								|| msg.getEventType() == Notification.REMOVE) {
							updateGeometry();
						}
					}
				}
			};
		}

		return pointsAdapter;
	}

	private Adapter getPolygonsAdapter() {
		if (polygonsAdapter == null) {
			polygonsAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					int featureId = msg
							.getFeatureID(CartesianTriangularMesh.class);

					if (featureId == ApogyCommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH__POLYGONS) {
						if (msg.getEventType() == Notification.ADD_MANY
								|| msg.getEventType() == Notification.REMOVE_MANY) {
							updateGeometry();
						} else if (msg.getEventType() == Notification.ADD
								|| msg.getEventType() == Notification.REMOVE) {
							updateGeometry();
						}
					}
				}
			};
		}

		return polygonsAdapter;
	}

	private Adapter getContentAdapter() 
	{
		if (contentAdapter == null) 
		{
			contentAdapter = new AdapterImpl() 
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					int featureId = msg.getFeatureID(ContentNode.class);

					if (featureId == ApogyCommonTopologyPackage.CONTENT_NODE__CONTENT) 
					{
						try 
						{
							// Remove adapters from old mesh
							mesh.eAdapters().remove(getPointsAdapter());
							mesh.eAdapters().remove(getPolygonsAdapter());
							
							// Updates the mesh
							mesh = (CartesianTriangularMesh) msg.getNewValue();
							if (mesh != null) 
							{
								// Register listeners to new mesh.
								mesh.eAdapters().add(getPointsAdapter());
								mesh.eAdapters().add(getPolygonsAdapter());
								updateGeometry();
							} 
							else 
							{
								System.out.println(getClass().getSimpleName()
										+ " : Mesh is null !");
							}
						} 
						catch (Exception e) 
						{
							Logger.INSTANCE.log(Activator.ID, this, "Failed to update content of CartesianTriangularMesh !", EventSeverity.ERROR, e);
						}
					}
				}
			};
		}

		return contentAdapter;
	}

}
