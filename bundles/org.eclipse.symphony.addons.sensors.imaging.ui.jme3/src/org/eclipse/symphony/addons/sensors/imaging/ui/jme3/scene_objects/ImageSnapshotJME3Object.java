package org.eclipse.symphony.addons.sensors.imaging.ui.jme3.scene_objects;

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.symphony.addons.sensors.fov.DistanceRange;
import org.eclipse.symphony.addons.sensors.fov.Symphony__AddonsSensorsFOVPackage;
import org.eclipse.symphony.addons.sensors.fov.RectangularFrustrumFieldOfView;
import org.eclipse.symphony.addons.sensors.imaging.ImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.Symphony__AddonsSensorsImagingPackage;
import org.eclipse.symphony.addons.sensors.imaging.RectifiedImageSnapshot;
import org.eclipse.symphony.addons.sensors.imaging.ui.ImageSnapshotSceneObject;
import org.eclipse.symphony.addons.sensors.imaging.ui.jme3.Activator;
import org.eclipse.symphony.addons.sensors.imaging.ui.jme3.utils.ImageSnapshotProjectorControl;
import org.eclipse.symphony.addons.sensors.imaging.ui.jme3.utils.SensorsImagingJME3Utilities;
import org.eclipse.symphony.common.images.AbstractEImage;
import org.eclipse.symphony.common.images.EImagesUtilities;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.topology.ui.MeshPresentationMode;
import org.eclipse.symphony.common.topology.ui.jme3.JME3RenderEngineDelegate;
import org.eclipse.symphony.common.topology.ui.jme3.JME3Utilities;
import org.eclipse.symphony.common.topology.ui.jme3.scene_objects.DefaultJME3SceneObject;

import com.jme3.asset.AssetManager;
import com.jme3.material.Material;
import com.jme3.material.RenderState.FaceCullMode;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.Mesh;
import com.jme3.texture.Texture2D;
import com.jme3.texture.plugins.AWTLoader;

public class ImageSnapshotJME3Object extends DefaultJME3SceneObject<ImageSnapshot> implements ImageSnapshotSceneObject
{		
	public static long MAXIMUM_IMAGE_SIZE = 640 * 480;
	public static ColorRGBA DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR = new ColorRGBA(0f, 1f, 0.0f, 1.0f);
	public static float DEFAULT_ANGLE_INCREMENT = (float) Math.toRadians(10.0);
	
	private RGB color = new RGB(0f, 1f, 0.0f);
	private boolean imageProjectionEnabled = true;
	private boolean imageProjectionOnFOVEnabled = false;
	private MeshPresentationMode meshPresentationMode = MeshPresentationMode.WIREFRAME;
	
	private Adapter adapter;
	
	private AssetManager assetManager;	
	
	private Geometry frontGeometry = null;
	private Geometry sidesAndBackGeometry = null;	
	
	private ImageSnapshotProjectorControl imageProjector;
	
	private BufferedImage bufferedImage = null;
		
	public ImageSnapshotJME3Object(ImageSnapshot node, JME3RenderEngineDelegate jme3RenderEngineDelegate) 
	{
		super(node, jme3RenderEngineDelegate);

		if (node == null || jme3RenderEngineDelegate == null) 
		{
			throw new IllegalArgumentException();
		}
				
		this.assetManager = jme3Application.getAssetManager();
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				updateGeometryInternal();	
				
				// Register Listener.
				getTopologyNode().eAdapters().add(ImageSnapshotJME3Object.this.getAdapter());
				if(getTopologyNode().getFieldOfView() != null)
				{
					getTopologyNode().getFieldOfView().eAdapters().add(ImageSnapshotJME3Object.this.getAdapter());
					
					if(getTopologyNode().getFieldOfView().getRange() != null)
					{
						getTopologyNode().getFieldOfView().getRange().eAdapters().add(ImageSnapshotJME3Object.this.getAdapter());
					}
				}	
				
				return null;
			}
		});								
	}
	
	@Override
	public void dispose() 
	{
		if(getTopologyNode() != null)
		{
			getTopologyNode().eAdapters().remove(getAdapter());
			
			if(getTopologyNode().getFieldOfView() != null)
			{
				getTopologyNode().getFieldOfView().eAdapters().remove(getAdapter());
				
				if(getTopologyNode().getFieldOfView().getRange() != null)
				{
					getTopologyNode().getFieldOfView().getRange().eAdapters().remove(this.getAdapter());
				}
			}			
		}
		
		if(imageProjector != null)
		{
			imageProjector.dispose();
			imageProjector = null;
		}
		
		super.dispose();
	}	
	
	@Override
	public List<Geometry> getGeometries() 
	{		
		List<Geometry> geometries = new ArrayList<Geometry>();
		geometries.add(sidesAndBackGeometry);
		geometries.add(frontGeometry);
		return geometries;
	}
	
	@Override
	public void setColor(RGB rgb) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting color to <" + rgb + ">...", EventSeverity.INFO);
		this.color = rgb;
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				try
				{			
					if(frontGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Ambient", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Specular", JME3Utilities.convertToColorRGBA(rgb));			
						frontGeometry.setMaterial(mat);
					}
					
					if(sidesAndBackGeometry != null)
					{
						Material mat = createMaterial();
						mat.setColor("Diffuse", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Ambient", JME3Utilities.convertToColorRGBA(rgb));
						mat.setColor("Specular", JME3Utilities.convertToColorRGBA(rgb));			
						sidesAndBackGeometry.setMaterial(mat);
					}
				}
				catch(Throwable t)
				{
					Logger.INSTANCE.log(Activator.ID, this, "Failed to set color to <" + rgb + ">!", EventSeverity.ERROR, t);
				}
				
				return null;
			}
		});
	}
	
	@Override
	public RGB getColor() 
	{
		return color;
	}
	
	@Override
	public MeshPresentationMode getPresentationMode() 
	{		
		return meshPresentationMode;
	}
	
	@Override
	public void setPresentationMode(final MeshPresentationMode mode) 
	{					
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				internalSetPresentationMode(mode);
				return null;
			}
		});
	}	
	
	@Override
	public boolean isImageProjectionEnabled() 
	{		
		return imageProjectionEnabled;
	}

	@Override
	public void setImageProjectionEnabled(final boolean enabled) 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Setting Image Projection enabled to <" + enabled + ">...", EventSeverity.INFO);
		
		imageProjectionEnabled = enabled;
		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{
				getImageProjector().setEnabled(enabled);
				return null;
			}
		});		
	}
	
	@Override
	public boolean isImageProjectionOnFOVEnabled() 
	{		
		return imageProjectionOnFOVEnabled;
	}

	@Override
	public void setImageProjectionOnFOVEnabled(boolean enabled) 
	{		
		Logger.INSTANCE.log(Activator.ID, this, "Setting Projection on FOV enabled to <" + enabled + ">...", EventSeverity.INFO);
		this.imageProjectionOnFOVEnabled = enabled;
		updateGeometry();		
	}
	
	private void internalSetPresentationMode(MeshPresentationMode mode)
	{
		switch (mode.getValue()) 
		{							
			case MeshPresentationMode.SURFACE_VALUE:					
				if(frontGeometry != null && frontGeometry.getMaterial() != null)
				{
					Mesh mesh = frontGeometry.getMesh();
					frontGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				
				if(sidesAndBackGeometry != null && sidesAndBackGeometry.getMaterial() != null)
				{
					Mesh mesh = sidesAndBackGeometry.getMesh();
					sidesAndBackGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Triangles);
				}
				
			break;
			case MeshPresentationMode.WIREFRAME_VALUE:
				
				if(frontGeometry != null && frontGeometry.getMaterial() != null)
				{
					Mesh mesh = frontGeometry.getMesh();
					frontGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Lines);
				}
				
				if(sidesAndBackGeometry != null && sidesAndBackGeometry.getMaterial() != null)
				{
					Mesh mesh = sidesAndBackGeometry.getMesh();
					sidesAndBackGeometry.getMaterial().getAdditionalRenderState().setWireframe(true);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Lines);
				}
								
			break;
			case MeshPresentationMode.POINTS_VALUE:
				
				if(frontGeometry != null && frontGeometry.getMaterial() != null)
				{
					Mesh mesh = frontGeometry.getMesh();
					frontGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Points);
				}
				
				if(sidesAndBackGeometry != null && sidesAndBackGeometry.getMaterial() != null)
				{
					Mesh mesh = sidesAndBackGeometry.getMesh();
					sidesAndBackGeometry.getMaterial().getAdditionalRenderState().setWireframe(false);
					if(mesh != null) mesh.setMode(com.jme3.scene.Mesh.Mode.Points);
				}										
			break;
				
			default:
			break;
		}						
		
		meshPresentationMode = mode;
	}
	
	private void updateGeometry()
	{		
		jme3Application.enqueue(new Callable<Object>() 
		{
			@Override
			public Object call() throws Exception 
			{	
				updateGeometryInternal();				
				return null;
			}
		});	
	}
	
	/**
	 * Not Tread Safe !
	 */
	private void updateGeometryInternal()
	{
		// Removes previous geometry if applicable.
		if(frontGeometry != null)
		{
			getAttachmentNode().detachChild(frontGeometry);			
		}
		
		if(sidesAndBackGeometry != null)
		{
			getAttachmentNode().detachChild(sidesAndBackGeometry);			
		}
		
		if(getTopologyNode().getFieldOfView() != null)
		{				
			int numberHorizontalIncrement = 5;
	
			if(getTopologyNode().getFieldOfView().getHorizontalFieldOfViewAngle() > (5 * DEFAULT_ANGLE_INCREMENT))
			{
				numberHorizontalIncrement = (int) Math.round(getTopologyNode().getFieldOfView().getHorizontalFieldOfViewAngle() / DEFAULT_ANGLE_INCREMENT);
			}
			else
			{
				numberHorizontalIncrement = 5;
			}
			
			int numberVerticalIncrement = 5;
			if(getTopologyNode().getFieldOfView().getVerticalFieldOfViewAngle() > (5 * DEFAULT_ANGLE_INCREMENT))
			{
				numberHorizontalIncrement = (int) Math.round((getTopologyNode().getFieldOfView().getVerticalFieldOfViewAngle() / DEFAULT_ANGLE_INCREMENT));
			}
			else
			{
				numberHorizontalIncrement = 5;
			}
			
			// Creates mesh
			Mesh frontMesh = SensorsImagingJME3Utilities.createImageSnapshotFrontMesh(getTopologyNode(), numberHorizontalIncrement, numberVerticalIncrement);
			Mesh sidesAndBackMesh = SensorsImagingJME3Utilities.createImageSnapshotSidesAndBack(getTopologyNode(), numberHorizontalIncrement, numberVerticalIncrement);
			
			// Creates new geometry.
			frontGeometry = new Geometry("front", frontMesh);
			
			if(imageProjectionOnFOVEnabled)
			{
				frontGeometry.setMaterial(createImageMaterial());
			}
			else
			{
				frontGeometry.setMaterial(createMaterial());
			}
			
			sidesAndBackGeometry = new Geometry("SidesAndBack", sidesAndBackMesh);
			sidesAndBackGeometry.setMaterial(createMaterial());
			
			// Attaches new geometry.
			getAttachmentNode().attachChild(frontGeometry);
			getAttachmentNode().attachChild(sidesAndBackGeometry);
			
			internalSetPresentationMode(meshPresentationMode);
			
			getAttachmentNode().addControl(getImageProjector());
		}
	}
	
	private Material createMaterial()
	{
		Material mat = new Material(assetManager,  "Common/MatDefs/Light/Lighting.j3md");	
		
		if(getColor() != null)
		{			
			mat.setColor("Diffuse", JME3Utilities.convertToColorRGBA(getColor()));
			mat.setColor("Ambient", JME3Utilities.convertToColorRGBA(getColor()));
			mat.setColor("Specular", JME3Utilities.convertToColorRGBA(getColor()));
		}
		else
		{
			mat.setColor("Diffuse", DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR.clone());
			mat.setColor("Ambient", DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR.clone());
			mat.setColor("Specular", DEFAULT_IMAGE_SNAPSHOT_FOV_COLOR.clone());
		}
				
		mat.setFloat("Shininess",64f); 	
		mat.setBoolean("UseMaterialColors",true);    	
		mat.setBoolean("UseAlpha",true);
		mat.getAdditionalRenderState().setFaceCullMode(FaceCullMode.Off);
		
		return mat;
	}	
	
	/**
	 * Returns the image to be projected onto the FOV.
	 * @return The image, null if none is found.
	 */
	private AbstractEImage getAbstractEImage()
	{
		AbstractEImage image = null;
		
		if(getTopologyNode() instanceof RectifiedImageSnapshot)
		{
			image = ((RectifiedImageSnapshot) getTopologyNode()).getRectifiedImage();	
		}
				
		if(image == null)
		{
			image = getTopologyNode().getImage();
		}
		
		return image;
	}	
	
	private Material createImageMaterial()
	{				
		Material mat = null;	
		
		AbstractEImage abstractEImage = getAbstractEImage();
		if(abstractEImage != null)
		{		
			if(bufferedImage == null)
			{
				// Re-size image to keep size manageable.
				AbstractEImage rescaledImage = resizeAbstractEImage(abstractEImage);
						
				bufferedImage = rescaledImage.asBufferedImage();
			}
			AWTLoader awtLoader = new AWTLoader();
			com.jme3.texture.Image img = awtLoader.load(bufferedImage, true);						
			Texture2D texture = new Texture2D(img);
			
			mat = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");			
			mat.setTexture("ColorMap", texture);
		}		
		else
		{
			mat = createMaterial();
		}
				
		return mat;
	}
	
	private AbstractEImage resizeAbstractEImage(AbstractEImage originalImage)
	{
		long imageSize = originalImage.getHeight() * originalImage.getWidth();
		
		if(imageSize > MAXIMUM_IMAGE_SIZE)
		{
			double scaleFactor = Math.sqrt((double) MAXIMUM_IMAGE_SIZE / (double) imageSize);
			
			Logger.INSTANCE.log(Activator.ID, this, "Image too large <" + originalImage.getHeight() + " X " + originalImage.getWidth() + ">, resizing by factor " + scaleFactor + " ...", EventSeverity.INFO);
			AbstractEImage rescaled = EImagesUtilities.INSTANCE.resize(originalImage, scaleFactor, scaleFactor);
						
			return rescaled;
		}
		else
		{
			return originalImage;
		}		
	}
	
	private Adapter getAdapter()
	{
		if (adapter == null)
		{
			adapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof RectifiedImageSnapshot)
					{
						int featureId = msg.getFeatureID(RectifiedImageSnapshot.class);
						
						switch (featureId) 
						{
							case Symphony__AddonsSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT___GET_RECTIFIED_IMAGE:
								// Force image to be updated.
								bufferedImage = null;
								
								updateGeometry();
							break;
							
							case Symphony__AddonsSensorsImagingPackage.RECTIFIED_IMAGE_SNAPSHOT__FIELD_OF_VIEW:
								if(msg.getOldValue() instanceof RectangularFrustrumFieldOfView)
								{
									RectangularFrustrumFieldOfView oldValue = (RectangularFrustrumFieldOfView) msg.getOldValue();
									oldValue.eAdapters().remove(getAdapter());
								}
								
								if(msg.getNewValue() instanceof RectangularFrustrumFieldOfView)
								{
									RectangularFrustrumFieldOfView newValue = (RectangularFrustrumFieldOfView) msg.getNewValue();
									newValue.eAdapters().remove(getAdapter());
								}
								
								updateGeometry();
							break;
							
							default:
							break;
						}
					}
					else if(msg.getNotifier() instanceof ImageSnapshot)
					{
						int featureId = msg.getFeatureID(ImageSnapshot.class);
						
						switch (featureId) 
						{
							case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT__IMAGE:
								// Force image to be updated.
								bufferedImage = null;
								
								updateGeometry();
							break;

							case Symphony__AddonsSensorsImagingPackage.IMAGE_SNAPSHOT__FIELD_OF_VIEW:
								if(msg.getOldValue() instanceof RectangularFrustrumFieldOfView)
								{
									RectangularFrustrumFieldOfView oldValue = (RectangularFrustrumFieldOfView) msg.getOldValue();
									oldValue.eAdapters().remove(getAdapter());
								}
								
								if(msg.getNewValue() instanceof RectangularFrustrumFieldOfView)
								{
									RectangularFrustrumFieldOfView newValue = (RectangularFrustrumFieldOfView) msg.getNewValue();
									newValue.eAdapters().remove(getAdapter());
								}
								
								updateGeometry();
							break;
																					
							default:
							break;
						}
					}					
					else if(msg.getNotifier() instanceof RectangularFrustrumFieldOfView)
					{
						int featureId = msg.getFeatureID(RectangularFrustrumFieldOfView.class);
						switch (featureId) 
						{
							case Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__RANGE:
								
								if(msg.getOldValue() instanceof DistanceRange)
								{
									DistanceRange oldValue = (DistanceRange) msg.getOldValue();
									oldValue.eAdapters().remove(getAdapter());
								}
								
								if(msg.getNewValue() instanceof DistanceRange)
								{
									DistanceRange newValue = (DistanceRange) msg.getNewValue();
									newValue.eAdapters().remove(getAdapter());
								}
								
								updateGeometry();
							break;

							case Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__HORIZONTAL_FIELD_OF_VIEW_ANGLE:
							case Symphony__AddonsSensorsFOVPackage.RECTANGULAR_FRUSTRUM_FIELD_OF_VIEW__VERTICAL_FIELD_OF_VIEW_ANGLE:
								updateGeometry();
							break;
							
							default:								
							break;
						}
					}
					else if(msg.getNotifier() instanceof DistanceRange)
					{
						updateGeometry();
					}
				}
			};
		}
		
		return adapter;
	}
	
	private ImageSnapshotProjectorControl getImageProjector()
	{
		if(imageProjector == null)
		{
			imageProjector = new ImageSnapshotProjectorControl(jme3Application, getTopologyNode());
		}
		
		return imageProjector;
	}


}
