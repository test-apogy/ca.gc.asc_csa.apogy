package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils;

import java.awt.image.BufferedImage;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects.ProjectorData;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

import com.jme3.renderer.Camera;

public class RectangularFrustrumFieldOfViewImageProjectorControl extends AbstractFieldOfViewImageProjectorControl<RectangularFrustrumFieldOfView> 
{

	public RectangularFrustrumFieldOfViewImageProjectorControl(JME3Application jme3Application, RectangularFrustrumFieldOfView fieldOfView) 
	{
		super(jme3Application, fieldOfView);	
	}

	@Override
	public float getHorizontalFOVAngleDegrees() 
	{
		return (float) Math.toDegrees(fieldOfView.getHorizontalFieldOfViewAngle());
	}

	@Override
	public float getTextureHtoVRatio() 
	{		
		float ratio = 1.0f;
		if(fieldOfView != null)
		{
			if(fieldOfView.getHorizontalFieldOfViewAngle() > 0 && fieldOfView.getVerticalFieldOfViewAngle() > 0)
			{
				ratio = (float)(fieldOfView.getHorizontalFieldOfViewAngle() / fieldOfView.getVerticalFieldOfViewAngle());
			}
		}
		
		return ratio;
	}

	@Override
	public BufferedImage getProjectedImage() 
	{
		int width = 256;
		int height = (int) Math.round(width * getTextureHtoVRatio());
		AbstractEImage transparentImage = EImagesUtilities.INSTANCE.createTransparentImage(width, height);		
		
		RGB projColor = getProjectionColor();		
		AbstractEImage borderedImage = EImagesUtilities.INSTANCE.addBorder(transparentImage, 4, projColor.red, projColor.green, projColor.blue);		
		return borderedImage.asBufferedImage();
	}

	@Override
	public void updateProjectorFOVSettings() 		
	{	
		ProjectorData projectorData = getProjectorData();
		
		// Updates the texture.
		projectorData.projector.setProjectiveTextureMap(createTexture());
		
	    Camera projectorCamera = projectorData.projector.getProjectorCamera();
	    projectorCamera.setLocation(getProjectorLocation());
	    projectorCamera.setRotation(getProjectorRotation());	
	    
	    if(getHorizontalFOVAngleDegrees() > 0)
	    {
	    	projectorCamera.setFrustumPerspective(getHorizontalFOVAngleDegrees(), 1.0f / getTextureHtoVRatio() , 1f, 5f);
	    }
	    else 
	    {
	    	projectorCamera.setFrustumPerspective(0.1f, 1.0f / getTextureHtoVRatio() , 1f, 5f);
	    }
	}
}
