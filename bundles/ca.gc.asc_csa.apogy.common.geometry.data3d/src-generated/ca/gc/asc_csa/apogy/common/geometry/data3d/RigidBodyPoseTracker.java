package ca.gc.asc_csa.apogy.common.geometry.data3d;
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

import java.util.List;

import javax.vecmath.Matrix4d;
import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rigid Body Pose Tracker</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * TODO
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getRigidBodyPoseTracker()
 * @model
 * @generated
 */
public interface RigidBodyPoseTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Markers At Origin</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Markers At Origin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The list of position markers for the rigid body at the origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Markers At Origin</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getRigidBodyPoseTracker_PositionMarkersAtOrigin()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<PositionMarker> getPositionMarkersAtOrigin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * This method computes the 3D rigid body transformation between two 3D data sets. First, the rotation matrix is computed using the Singular
	 * Values Decomposition (SVD) approach. Then, the translation component is computed. Finally, rotation and translation components are packed
	 * into an homogenous 4x4 matrix. Note: At least 3 markers are required to solve the 3D pose. If more than 3 markers are specified, the best fit
	 * (minimizing the root meaning square error) will be found.
	 * @param markerPositionsToTrack The list of position of the marker for which to find the body position.
	 * @return The position of the rigid body.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Point3d" unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.Exception" markerPositionsToTrackDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.EList<ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
	 * @generated
	 */
	Point3d computeTransformation(EList<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Computes the 3D rigid body transformation between the markers defining the rigid body and a new set of the position markers.
	 * @param markerPositionsToTrack The list of position of the marker for which to find the body pose.
	 * @return The pose of the rigid body, represented as a 4x4 homogenous matrix.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.geometry.data3d.Matrix4d" unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.Exception" markerPositionsToTrackDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
	 * @generated
	 */
	Matrix4d computeTransformation(List<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Adds a list of position marker to the one defining the rigid body.
	 * @param markers The list of position markers.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.Exception" markersDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
	 * @generated
	 */
	void addPositionMarkers(List<PositionMarker> markers) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Removes a list of position marker from the one defining the rigid body.
	 * @param markers The list of position markers.
	 * <!-- end-model-doc -->
	 * @model markersDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.List<ca.gc.asc_csa.apogy.common.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
	 * @generated
	 */
	void removePositionMarkers(List<PositionMarker> markers);

} // RigidBodyPoseTracker
