package ca.gc.asc_csa.apogy.addons.sensors.pose;
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

import javax.media.j3d.Transform3D;
import javax.vecmath.Matrix3d;
import javax.vecmath.Matrix4d;
import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;
import ca.gc.asc_csa.apogy.common.math.GeometricUtils;

public class PoseUtils
{
	/**
	 * Computes the transform required to be applied to sensor data to match a specified new pose.
	 * @param currentPoseInSensorFrame The current pose in the sensor original frame.
	 * @param newCurrentPose The new pose to be associated to the current position.
	 * @return The transform to got from sensor data to the new frame.
	 */
	public static Transform3D getTransformFromSensorFrameToNewPose(Pose currentPoseInSensorFrame, Pose newCurrentPose)
	{
		Matrix4d currentPoseMatrix = GeometricUtils.packXYZ(currentPoseInSensorFrame.getX(),
				currentPoseInSensorFrame.getY(), currentPoseInSensorFrame.getZ(),
				currentPoseInSensorFrame.getXRotation(),currentPoseInSensorFrame.getYRotation(),
				currentPoseInSensorFrame.getZRotation());		
		Transform3D currentPose = new Transform3D(currentPoseMatrix);
		
		Matrix4d newPoseMatrix = GeometricUtils.packXYZ(newCurrentPose.getX(),
				newCurrentPose.getY(), newCurrentPose.getZ(),
				newCurrentPose.getXRotation(),newCurrentPose.getYRotation(),
				newCurrentPose.getZRotation());	
		Transform3D newPose = new Transform3D(newPoseMatrix);
		
		Transform3D invertedCurrentPose = new Transform3D(currentPose);
		invertedCurrentPose.invert();
				
		newPose.mul(invertedCurrentPose);
		
		return newPose;
	}
	
	/**
	 * Applies a transform to a Pose.
	 * @param transform The transform to be applied.
	 * @param initialPose The pose to apply the transform to.
	 * @return The transformed pose.
	 */
	public static Pose applyTransform(Transform3D transform, Pose initialPose)
	{
		Transform3D initialPoseTransform = new Transform3D(GeometricUtils.packXYZ(initialPose.getX(),
				initialPose.getY(), initialPose.getZ(),
				initialPose.getXRotation(),initialPose.getYRotation(),
				initialPose.getZRotation()));		
		
		Transform3D t = new Transform3D(transform);
		t.mul(initialPoseTransform);
		
		// Extracts rotation.
		Matrix3d rot = new Matrix3d();
		t.get(rot);		
		Vector3d rotation = GeometricUtils.extractRotationFromXYZRotMatrix(rot);		
		
		// Extracts position.
		Vector3d position = new Vector3d();
		t.get(position);
		
		Pose pose = ApogyCommonGeometryData3DFacade.INSTANCE.createPose(position.x, position.y, position.z, rotation.x, rotation.y, rotation.z);
		
		return pose;
	}	
}
