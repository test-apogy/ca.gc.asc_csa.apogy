/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

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
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getRigidBodyPoseTracker()
 * @model
 * @generated
 */
public interface RigidBodyPoseTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Markers At Origin</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.geometry.data3d.PositionMarker}.
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
	 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getRigidBodyPoseTracker_PositionMarkersAtOrigin()
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
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Point3d" unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.Exception" markerPositionsToTrackDataType="org.eclipse.symphony.common.geometry.data3d.EList<org.eclipse.symphony.common.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
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
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.Exception" markerPositionsToTrackDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
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
	 * @model exceptions="org.eclipse.symphony.common.geometry.data3d.Exception" markersDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
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
	 * @model markersDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
	 * @generated
	 */
	void removePositionMarkers(List<PositionMarker> markers);

} // RigidBodyPoseTracker
