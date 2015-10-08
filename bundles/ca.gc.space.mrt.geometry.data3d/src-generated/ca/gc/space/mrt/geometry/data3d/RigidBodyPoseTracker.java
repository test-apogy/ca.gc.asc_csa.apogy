/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

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
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.RigidBodyPoseTracker#getPositionMarkersAtOrigin <em>Position Markers At Origin</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getRigidBodyPoseTracker()
 * @model
 * @generated
 */
public interface RigidBodyPoseTracker extends EObject {
	/**
	 * Returns the value of the '<em><b>Position Markers At Origin</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.space.mrt.geometry.data3d.PositionMarker}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position Markers At Origin</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position Markers At Origin</em>' reference list.
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getRigidBodyPoseTracker_PositionMarkersAtOrigin()
	 * @model changeable="false" derived="true"
	 * @generated
	 */
	EList<PositionMarker> getPositionMarkersAtOrigin();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method computes the 3D rigid body transformation between two 3D data sets. First, the rotation matrix is computed using the Singular Values Decomposition (SVD) approach. Then, translation composent is computed. Finally, rotation and translation components are packed into an homogenous 4x4 matrix. Note : at least 3 markers are required to solve the 3D pose. If more than 3 markers are specified, the best fit (minimizing the root meaning squarre error) will be found.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d" unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.Exception" markerPositionsToTrackDataType="ca.gc.space.mrt.geometry.data3d.EList<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
	 * @generated
	 */
	Point3d computeTransformation(EList<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Matrix4d" unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.Exception" markerPositionsToTrackDataType="ca.gc.space.mrt.geometry.data3d.List<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markerPositionsToTrackUnique="false" markerPositionsToTrackMany="false"
	 * @generated
	 */
	Matrix4d computeTransformation(List<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.Exception" markersDataType="ca.gc.space.mrt.geometry.data3d.List<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
	 * @generated
	 */
	void addPositionMarkers(List<PositionMarker> markers) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model markersDataType="ca.gc.space.mrt.geometry.data3d.List<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markersUnique="false" markersMany="false"
	 * @generated
	 */
	void removePositionMarkers(List<PositionMarker> markers);

} // RigidBodyPoseTracker
