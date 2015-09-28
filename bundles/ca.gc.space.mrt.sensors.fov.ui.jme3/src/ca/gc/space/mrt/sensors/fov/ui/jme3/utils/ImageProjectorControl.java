package ca.gc.space.mrt.sensors.fov.ui.jme3.utils;

import java.awt.image.BufferedImage;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import ca.gc.asc_csa.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.topology.ui.jme3.JME3Utilities;
import ca.gc.space.mrt.sensors.fov.ui.jme3.scene_objects.ProjectorData;
import ca.gc.space.topology.Node;
import ca.gc.space.topology.TopologyFacade;

import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.post.MultiTextureProjectorRenderer;
import com.jme3.post.MultiTextureProjectorRenderer.CombineMode;
import com.jme3.post.SimpleTextureProjector;
import com.jme3.renderer.Camera;
import com.jme3.renderer.RenderManager;
import com.jme3.renderer.ViewPort;
import com.jme3.scene.Spatial;
import com.jme3.scene.control.AbstractControl;
import com.jme3.scene.debug.WireFrustum;
import com.jme3.texture.Texture;
import com.jme3.texture.Texture2D;

public abstract class ImageProjectorControl <T extends Node> extends AbstractControl 
{
	protected T fieldOfView;
	protected JME3Application jm3Application;	
	
	private ProjectorData projectorData;
	private MultiTextureProjectorRenderer multiTextureProjectorRenderer;
	
	public ImageProjectorControl(JME3Application jm3Application, T node)
	{
		this.jm3Application = jm3Application;
		this.fieldOfView = node;		
	}
	
	@Override
	public void setSpatial(Spatial spatial) 
	{			
		super.setSpatial(spatial);		
	}
	
	@Override
	public void setEnabled(boolean enabled) 
	{					
		if(enabled)
		{
			if(!jm3Application.getViewPort().getProcessors().contains(getMultiTextureProjectorRenderer()))
			{
				jm3Application.getViewPort().addProcessor(getMultiTextureProjectorRenderer());				
			}	
		}
		else
		{
			if(jm3Application.getViewPort().getProcessors().contains(getMultiTextureProjectorRenderer()))
			{
				jm3Application.getViewPort().removeProcessor(getMultiTextureProjectorRenderer());				
			}
		}
		
		super.setEnabled(enabled);		
	}
	
	public void dispose()
	{
		setEnabled(false);
		
		// Removes the processor.
		jm3Application.getViewPort().removeProcessor(getMultiTextureProjectorRenderer());
		
		
	}
	
	public abstract float getHorizontalFOVAngleDegrees();
	
	public abstract float getTextureHtoVRatio();
	
	public abstract BufferedImage getProjectedImage();
	
	public abstract void updateProjectorFOVSettings();
	
	@Override
	protected void controlRender(RenderManager arg0, ViewPort arg1) 
	{
	}

	@Override
	protected void controlUpdate(float arg0) 
	{		
		if(isEnabled())
		{			
			// Updates position and orientation of projector camera.
			Camera projectorCamera = getProjectorData().projector.getProjectorCamera();					
			projectorCamera.setLocation(getProjectorLocation());
		    projectorCamera.setRotation(getProjectorRotation());													
		}								
	}
	
	private MultiTextureProjectorRenderer getMultiTextureProjectorRenderer()
	{
		if(multiTextureProjectorRenderer == null)
		{
			multiTextureProjectorRenderer = new MultiTextureProjectorRenderer(jm3Application.getAssetManager());
			multiTextureProjectorRenderer.getTextureProjectors().add(getProjectorData().projector);			
		}
		
		return multiTextureProjectorRenderer;
	}
	
	protected ProjectorData getProjectorData()
	{
		if(projectorData == null)
		{
			projectorData = new ProjectorData();
						
			Texture2D texture2D = createTexture();
			
		    int textureWidth = texture2D.getImage().getWidth();
		    int textureHeight = texture2D.getImage().getHeight();
		    float textureAspectRatio = ((float) textureWidth) / ((float) textureHeight);
		    
		    projectorData.projector = new SimpleTextureProjector(texture2D);		    
			projectorData.projector.setFallOffDistance(1000f);
			projectorData.projector.setFallOffPower(4f);    			
			projectorData.projector.setParameter("CombineMode", CombineMode.BLEND_COLOR_ADD_ALPHA);		
		    
		    Camera projectorCamera = projectorData.projector.getProjectorCamera();
		    projectorCamera.setLocation(getProjectorLocation());
		    projectorCamera.setRotation(getProjectorRotation());		   
		    
		    // Ensure nothing crashes if the Horizontal FOV is 0 or less.
		    if(getHorizontalFOVAngleDegrees() > 0)
		    {
		    	projectorCamera.setFrustumPerspective(getHorizontalFOVAngleDegrees(), textureAspectRatio, 1f, 5f);
		    }
		    else
		    {
		    	projectorCamera.setFrustumPerspective(0.1f, textureAspectRatio, 1f, 5f);
		    }
		    
		    projectorCamera.setParallelProjection(false);		    		    
		    		    		    		    
		    projectorData.frustumPoints = new Vector3f[8];
		    for (int i = 0; i < 8; i++)
		    {
		    	projectorData.frustumPoints[i] = new Vector3f();
		    }
		    
		    projectorData.projector.updateFrustumPoints(projectorData.frustumPoints);		    
		    projectorData.frustum = new WireFrustum(projectorData.frustumPoints);
		}
		
		return projectorData;
	}
	
	protected Texture2D createTexture()
	{
		BufferedImage image = getProjectedImage(); 			
		Texture2D texture2D = JME3Utilities.createTexture2D(image, jm3Application.getAssetManager());
		
		texture2D.setMinFilter(Texture.MinFilter.Trilinear);
		texture2D.setMagFilter(Texture.MagFilter.Bilinear);
		texture2D.setAnisotropicFilter(16);		    
		texture2D.setWrap(Texture.WrapMode.BorderClamp);
		
	    return texture2D;
	}
	
	protected Quaternion getProjectorRotation()
	{
		Matrix4d m = TopologyFacade.INSTANCE.expressNodeInRootFrame(fieldOfView);
		Matrix3d rot = new Matrix3d();
		m.get(rot);
		
		Quaternion q = JME3Utilities.createQuaternion(rot);			
		return q;
	}
	
	protected Vector3f getProjectorLocation()
	{
		
		Matrix4d m =TopologyFacade.INSTANCE.expressNodeInRootFrame(fieldOfView);
		Vector3d v = new Vector3d();
		m.get(v);
				
		Vector3f location = JME3Utilities.convertToVector3f(v);
	
		return location;
	}
}
