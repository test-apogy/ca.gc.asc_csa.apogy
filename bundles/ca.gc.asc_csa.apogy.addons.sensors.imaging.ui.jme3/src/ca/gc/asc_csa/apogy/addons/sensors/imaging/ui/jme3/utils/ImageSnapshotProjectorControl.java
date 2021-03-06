package ca.gc.asc_csa.apogy.addons.sensors.imaging.ui.jme3.utils;
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


import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects.ProjectorData;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.utils.ImageProjectorControl;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.ImageSnapshot;
import ca.gc.asc_csa.apogy.addons.sensors.imaging.RectifiedImageSnapshot;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.images.ApogyCommonImagesFactory;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;

import com.jme3.post.MultiTextureProjectorRenderer.CombineMode;
import com.jme3.renderer.Camera;

public class ImageSnapshotProjectorControl extends ImageProjectorControl<ImageSnapshot> 
{

	private ImageSnapshot imageSnapshot;
	
	public ImageSnapshotProjectorControl(JME3Application jme3Application, ImageSnapshot imageSnapshot) 
	{
		super(jme3Application, imageSnapshot);	
		this.imageSnapshot = imageSnapshot;
	}

	@Override
	public float getHorizontalFOVAngleDegrees() 
	{
		return (float) Math.toDegrees(imageSnapshot.getFieldOfView().getHorizontalFieldOfViewAngle());
	}

	@Override
	public float getTextureHtoVRatio() 
	{
		return (float)(imageSnapshot.getFieldOfView().getHorizontalFieldOfViewAngle() / imageSnapshot.getFieldOfView().getVerticalFieldOfViewAngle());				
	}

	@Override
	public BufferedImage getProjectedImage() 
	{
		AbstractEImage image = null;
		
		// Use the rectified image if applicable.
		if(imageSnapshot instanceof RectifiedImageSnapshot)
		{
			image = ((RectifiedImageSnapshot) imageSnapshot).getRectifiedImage();	
		}
				
		if(image == null)
		{
			image = imageSnapshot.getImage();
		}
		
		if(image != null)
		{
			// Ensures the image if of the right type.
			EImage overlayImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
			overlayImage.setImageContent(image.asBufferedImage());
			AbstractEImage transparentImage = EImagesUtilities.INSTANCE.createTransparentImage(overlayImage.getWidth(), overlayImage.getHeight());				
			image = EImagesUtilities.INSTANCE.applyOverlay(transparentImage, overlayImage, false);					
		}
		else
		{
			image = getEmptyImage();
		}
		
		// Rotate the image before projection.
		return rotateImage(image).asBufferedImage();
	}
	
	@Override
	public void updateProjectorFOVSettings() 
	{	
		ProjectorData projectorData = getProjectorData();
		
		projectorData.projector.setParameter("CombineMode", CombineMode.BLEND_COLOR_ADD_ALPHA);	
		
	    Camera projectorCamera = projectorData.projector.getProjectorCamera();
	    projectorCamera.setLocation(getProjectorLocation());
	    projectorCamera.setRotation(getProjectorRotation());		   	    
	    projectorCamera.setFrustumPerspective(getHorizontalFOVAngleDegrees(), 1.0f / getTextureHtoVRatio() , 1f, 5f);
	}
	
	private AbstractEImage getEmptyImage()
	{
		AbstractEImage empty = EImagesUtilities.INSTANCE.createTransparentImage(2, 2);
		return empty;
	}
	
	private AbstractEImage rotateImage(AbstractEImage originalImage)
	{		
		BufferedImage original = originalImage.asBufferedImage();
		BufferedImage rotated = new BufferedImage(originalImage.getHeight(), originalImage.getWidth(), BufferedImage.TYPE_INT_ARGB);				
		
		int width = originalImage.getWidth();
		int height = originalImage.getHeight();
		
		for(int x = 0; x < width; x++)
		{
			for(int y = 0; y < height; y++)
			{
				int rgb = original.getRGB(x, y);
				rotated.setRGB(y, width - 1 - x, rgb);
			}			
		}

		EImage filteredImage = ApogyCommonImagesFactory.eINSTANCE.createEImage();
		filteredImage.setImageContent(rotated);
		return filteredImage;     	
	}

}
