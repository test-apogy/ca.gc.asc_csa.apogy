package org.eclipse.symphony.core.environment.ui.jme3.scene_objects;

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
import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage;
import org.eclipse.symphony.common.geometry.data3d.ui.jme3.Data3dJME3Utilities;
import org.eclipse.symphony.common.geometry.data3d.ui.preferences.MRTData3DUIPreferencesConstants;
import org.eclipse.symphony.common.geometry.data3d.ui.scene_objects.TriangularMeshSceneObject;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayer;
import org.eclipse.symphony.core.environment.CartesianTriangularMeshMapLayerNode;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentPackage;
import org.eclipse.symphony.core.environment.ui.jme3.Activator;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.queue.RenderQueue.ShadowMode;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.texture.Texture2D;
import com.jme3.texture.plugins.AWTLoader;

public class CartesianTriangularMeshMapLayerNodeJM3SceneObject extends DefaultJME3SceneObject<CartesianTriangularMeshMapLayerNode> implements TriangularMeshSceneObject
{	
	private boolean useShading = true;
	
	private boolean updatingGeometry = false;
	
	private RGB rgb = getDefaultColor();
	private MeshPresentationMode meshPresentationMode = MeshPresentationMode.SURFACE;
	private AbstractEImage textureImage = null;
		
	private Adapter layerAdapter = null;
	private Adapter pointsAdapter = null;
	private Adapter polygonsAdapter = null;
	
	private Point3d centroid = null;
	private CartesianTriangularMesh mesh = null;
	
	private AssetManager assetManager;
	private Geometry meshGeometry = null;
	private com.jme3.scene.Mesh jme3mMesh = null;
	
	private AWTLoader awtLoader = new AWTLoader();
	
	public CartesianTriangularMeshMapLayerNodeJM3SceneObject(final CartesianTriangularMeshMapLayerNode cartesianTriangularMeshMapLayerNode, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(cartesianTriangularMeshMapLayerNode, jme3RenderEngineDelegate);
		
		if (cartesianTriangularMeshMapLayerNode == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
						
		this.assetManager = jme3Application.getAssetManager();
		this.mesh = cartesianTriangularMeshMapLayerNode.getCartesianTriangularMeshMapLayer().getCurrentMesh();							
		this.textureImage = cartesianTriangularMeshMapLayerNode.getCartesianTriangularMeshMapLayer().getTextureImage();
		
		// Updates the geometry.
		Job job = new Job("CartesianTriangularMeshMapLayerNode : Updating Geometry.")
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
					
		cartesianTriangularMeshMapLayerNode.getCartesianTriangularMeshMapLayer().eAdapters().add(getLayerAdapter());		
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
		
		if(rgb != null)
		{
			final ColorRGBA meshColor = JME3Utilities.convertToColorRGBA(rgb);
			
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
	}
	
	@Override
	public RGB getColor() 
	{
		if(rgb == null)
		{
			//rgb = new RGB(150,75,0);
			rgb = new RGB(255,255,255);
		}
		return rgb;
	}

	
	protected ColorRGBA getColorRGBA()
	{
		return JME3Utilities.convertToColorRGBA(getColor());
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
			getTopologyNode().eAdapters().remove(getLayerAdapter());
		}
		
		// Unregister listeners from mesh.
		if(mesh != null)
		{			
			mesh.eAdapters().remove(getPointsAdapter());
			mesh.eAdapters().remove(getPolygonsAdapter());
		}		
		
		
		// Removes references.
		this.textureImage = null;
		
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
					ColorRGBA color = getColorRGBA();
					
					if(useShading)
					{
						mat.setColor("Diffuse", color);
						mat.setColor("Ambient", color);
						mat.setColor("Specular", color);
					}
					else
					{	
						mat.setColor("Color", color);
					}
					meshGeometry.setMaterial(mat);
					return null;
				}
			});
		}
	}
	
	public void applyTextureImage(AbstractEImage abstractEImage) 
	{
		this.textureImage = abstractEImage;				
		updateGeometry();
	};
	
	
	
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
		
		ColorRGBA color = getColorRGBA();
		if(useShading)
		{	
			mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");				
		
			
			if(color != null)
			{
				mat.setColor("Diffuse", color);
				mat.setColor("Ambient", color);
				mat.setColor("Specular", color);
			}		
					
			mat.setFloat("Shininess",64f); 	
			mat.setBoolean("UseMaterialColors",true);  	
			
			// If the applied texture is not null.
			if(textureImage != null)
			{					
				Texture2D texture = createTexture(textureImage);							
				mat.setTexture("DiffuseMap", texture);			
			}
		}
		else
		{
			mat = new Material(assetManager,  "Common/MatDefs/Misc/Unshaded.j3md");
			if(color != null)
			{
				mat.setColor("Color", color);
			}
			
			// If the applied texture is not null and properly sized.
			if(textureImage != null && textureImage.getHeight() > 0 && textureImage.getWidth() > 0)
			{									
				Texture2D texture = createTexture(textureImage);							
				mat.setTexture("ColorMap", texture);
				
			}
		}										
		
		
		return mat;
	}
	
	private Texture2D createTexture(AbstractEImage textureImage)
	{		
		int width = textureImage.getWidth();
		int height = textureImage.getHeight();
		
		RGB rgb = getColor();
		AbstractEImage background = EImagesUtilities.INSTANCE.createUniformColorImage(width, height, rgb.red, rgb.green, rgb.blue, 255);				
		AbstractEImage newImage = EImagesUtilities.INSTANCE.applyOverlay(background, textureImage, false);					
		com.jme3.texture.Image img = awtLoader.load(newImage.asBufferedImage(), true);						
		Texture2D texture = new Texture2D(img);							
		
		return texture;
	}
	
	private RGB getDefaultColor()
	{
		IPreferenceStore store = org.eclipse.symphony.common.geometry.data3d.ui.Activator.getDefault().getPreferenceStore();
		
		// Change color.
		RGB rgb = PreferenceConverter.getColor(store, MRTData3DUIPreferencesConstants.DEFAULT_TRIANGULAR_MESH_COLOR_ID);
		
		if(rgb == null)
		{
			//rgb = new RGB(150,75,0);
			rgb = new RGB(255,255,255);
		}
		
		return rgb;		
	}
	
	private Adapter getPointsAdapter() {
		if (pointsAdapter == null) {
			pointsAdapter = new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					int featureId = msg
							.getFeatureID(CartesianTriangularMesh.class);

					if (featureId == Symphony__CommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH__POINTS) {
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

					if (featureId == Symphony__CommonGeometryData3DPackage.CARTESIAN_TRIANGULAR_MESH__POLYGONS) {
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

	private Adapter getLayerAdapter() 
	{
		if (layerAdapter == null) 
		{
			layerAdapter = new AdapterImpl() 
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof CartesianTriangularMeshMapLayer)
					{
						CartesianTriangularMeshMapLayer cartesianTriangularMeshMapLayer = (CartesianTriangularMeshMapLayer) msg.getNotifier();
						int featureId = msg.getFeatureID(CartesianTriangularMeshMapLayer.class);
	
						switch(featureId)
						{
							case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__MESH_IS_DIRTY:	
								try
								{
									// Remove adapters from old mesh
									mesh.eAdapters().remove(getPointsAdapter());
									mesh.eAdapters().remove(getPolygonsAdapter());
	
									// Updates the mesh.
									mesh = cartesianTriangularMeshMapLayer.getCurrentMesh();
									if (mesh != null) 
									{
										// Register listeners to new mesh.
										mesh.eAdapters().add(getPointsAdapter());
										mesh.eAdapters().add(getPolygonsAdapter());
										updateGeometry();
									} 
									else 
									{
										Logger.INSTANCE.log(Activator.ID, CartesianTriangularMeshMapLayerNodeJM3SceneObject.this, "Mesh is null !", EventSeverity.WARNING);
									}
								}
								catch(Throwable t)
								{
									t.printStackTrace();
								}
							break;
							
							case Symphony__CoreEnvironmentPackage.CARTESIAN_TRIANGULAR_MESH_MAP_LAYER__TEXTURE_IMAGE:
								try
								{
									// Updates the texture.
									AbstractEImage newTextureImage = (AbstractEImage) msg.getNewValue();
									
									Logger.INSTANCE.log(Activator.ID, CartesianTriangularMeshMapLayerNodeJM3SceneObject.this, "Updating mesh texture.", EventSeverity.INFO);
									
									applyTextureImage(newTextureImage);
								}
								catch(Throwable t)
								{
									t.printStackTrace();
								}
							break;
						}
					}															
				}
			};
		}

		return layerAdapter;
	}
}
