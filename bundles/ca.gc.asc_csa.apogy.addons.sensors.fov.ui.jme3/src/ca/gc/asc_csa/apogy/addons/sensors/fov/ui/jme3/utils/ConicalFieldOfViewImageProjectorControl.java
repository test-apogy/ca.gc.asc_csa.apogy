package ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils;
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

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects.ProjectorData;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

import com.jme3.renderer.Camera;

public class ConicalFieldOfViewImageProjectorControl extends AbstractFieldOfViewImageProjectorControl<ConicalFieldOfView> {

	public ConicalFieldOfViewImageProjectorControl(JME3Application jme3Application, ConicalFieldOfView fieldOfView) 
	{
		super(jme3Application, fieldOfView);	
	}

	@Override
	public float getHorizontalFOVAngleDegrees() 
	{
		return (float) Math.toDegrees(fieldOfView.getFieldOfViewAngle());
	}

	@Override
	public float getTextureHtoVRatio() 
	{
		return 1.0f;
	}

	@Override
	public BufferedImage getProjectedImage() 
	{
		int width = 256;
		int height = (int) Math.round(width * getTextureHtoVRatio());
		AbstractEImage transparentImage = EImagesUtilities.INSTANCE.createTransparentImage(width, height);

		BufferedImage result = transparentImage.asBufferedImage();
		Graphics2D g2d = result.createGraphics(); 

		RGB projColor = getProjectionColor();
		g2d.setColor(new Color(projColor.red, projColor.green, projColor.blue));
		
		g2d.drawOval(0, 0, width, height);		
		g2d.drawOval(1, 1, width - 1, height - 1);	
		g2d.drawOval(2, 2, width - 2, height - 2);	
		g2d.drawOval(3, 3, width - 3, height - 3);	
				
		return result;
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
	    	projectorCamera.setFrustumPerspective(getHorizontalFOVAngleDegrees(), getTextureHtoVRatio()  , 1f, 5f);
	    }
	    else
	    {
	    	projectorCamera.setFrustumPerspective(0.1f, getTextureHtoVRatio(), 1f, 5f);
	    }
	    
	}

}
