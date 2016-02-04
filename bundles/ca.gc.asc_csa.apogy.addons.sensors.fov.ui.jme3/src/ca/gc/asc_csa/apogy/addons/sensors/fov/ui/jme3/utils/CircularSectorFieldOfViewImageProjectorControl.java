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

import java.awt.image.BufferedImage;

import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.addons.sensors.fov.CircularSectorFieldOfView;
import ca.gc.asc_csa.apogy.addons.sensors.fov.ui.jme3.scene_objects.ProjectorData;
import ca.gc.asc_csa.apogy.common.images.AbstractEImage;
import ca.gc.asc_csa.apogy.common.images.EImagesUtilities;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyFacade;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Application;
import ca.gc.asc_csa.apogy.common.topology.ui.jme3.JME3Utilities;

import com.jme3.math.Quaternion;
import com.jme3.math.Vector3f;
import com.jme3.renderer.Camera;

public class CircularSectorFieldOfViewImageProjectorControl extends AbstractFieldOfViewImageProjectorControl<CircularSectorFieldOfView> 
{
	protected static final float VERTICAL_FOV_ANGLE_RAD = (float) Math.toRadians(0.25);
	private CircularSectorFieldOfView circularSectorFieldOfView = null;
		
	public CircularSectorFieldOfViewImageProjectorControl(JME3Application jme3Application,	CircularSectorFieldOfView fieldOfView) 
	{
		super(jme3Application, fieldOfView);	
		this.circularSectorFieldOfView = fieldOfView;
	}

	@Override
	public float getHorizontalFOVAngleDegrees() 
	{
		return (float) Math.toDegrees(circularSectorFieldOfView.getAngularSpan().getSpanningAngle());
	}

	@Override
	public float getTextureHtoVRatio() 
	{
		return (float) Math.toRadians(getHorizontalFOVAngleDegrees()) / (VERTICAL_FOV_ANGLE_RAD );
	}

	@Override
	public BufferedImage getProjectedImage() 
	{
		int width = 3;
		
		int height = (int) Math.round(width * getTextureHtoVRatio());		
		if(height <= 0) height = 1;
		
		RGB projColor = getProjectionColor();			
		AbstractEImage opaqueImage = EImagesUtilities.INSTANCE.createUniformColorImage(width, height, projColor.red, projColor.green, projColor.blue, 255);
		
		return opaqueImage.asBufferedImage();
	}
	
	@Override
	protected Quaternion getProjectorRotation() 
	{
		Matrix4d m = ApogyCommonTopologyFacade.INSTANCE.expressNodeInRootFrame(fieldOfView);
		Matrix3d rot = new Matrix3d();
		m.get(rot);
		
		Quaternion q = JME3Utilities.createQuaternion(rot);	
		
		// Rotate by CenterAngle around X.
		Quaternion centerAngleOffset = new Quaternion();                
		centerAngleOffset.fromAngleAxis(-1.0f * (float) circularSectorFieldOfView.getAngularSpan().getCenterAngle(), new Vector3f(1,0,0));    		
		q = q.mult(centerAngleOffset);
		
		return q;
	}
	
	@Override
	public void updateProjectorFOVSettings() 
	{
		ProjectorData projectorData = getProjectorData();				
		
		// Updates the texture.
		projectorData.projector.setProjectiveTextureMap(createTexture());
		
		projectorData.projector.setFallOffPower(1f);
		projectorData.projector.setFallOffDistance((float) circularSectorFieldOfView.getRange().getMaximumDistance());
				
	    Camera projectorCamera = projectorData.projector.getProjectorCamera();
	    projectorCamera.setLocation(getProjectorLocation());
	    projectorCamera.setRotation(getProjectorRotation());		   	    	    
	    projectorCamera.setFrustumPerspective(getHorizontalFOVAngleDegrees(), 1.0f / getTextureHtoVRatio() , 1f, 5f);	    
	}
}

