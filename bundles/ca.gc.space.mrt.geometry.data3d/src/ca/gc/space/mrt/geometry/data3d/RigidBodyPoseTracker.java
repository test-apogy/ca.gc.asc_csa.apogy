/**
 * Canadian Space Agency 2008.
 *
 * $Id: RigidBodyPoseTracker.java,v 1.5.4.2 2015/05/21 15:50:48 pallard Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @param markerPositionsToTrack markerPositionsToTrack is a CartesianCoordinatesSet which represents the position of every marker with respect to the fixed frame.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d" exceptions="ca.gc.space.mrt.common.processors.Exception" markerPositionsToTrackMany="true"
	 * @generated
	 */
	Point3d computeTransformation(EList<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method computes the 3D rigid body transformation between two 3D data sets. First, the rotation matrix is computed using the Singular Values Decomposition (SVD) approach. Then, translation composent is computed. Finally, rotation and translation components are packed into an homogenous 4x4 matrix. Note : at least 3 markers are required to solve the 3D pose. If more than 3 markers are specified, the best fit (minimizing the root meaning squarre error) will be found.
	 * @param markerPositionsToTrack markerPositionsToTrack is a CartesianCoordinatesSet which represents the position of every marker with respect to the fixed frame.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.space.java.emf.Matrix4d" exceptions="ca.gc.space.mrt.common.processors.Exception" markerPositionsToTrackMany="true"
	 * @generated_NOT
	 */
	Matrix4d computeTransformation(List<PositionMarker> markerPositionsToTrack) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.common.processors.Exception" markerDataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markerRequired="true" markerMany="false"
	 * @generated
	 */
	void addPositionMarkers(List<PositionMarker> marker) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model markersDataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.PositionMarker>" markersRequired="true" markersMany="false"
	 * @generated
	 */
	void removePositionMarkers(List<PositionMarker> markers);

} // RigidBodyPoseTracker
