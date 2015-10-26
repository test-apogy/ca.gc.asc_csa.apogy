/**
 * Agence spatiale canadienne / Canadian Space Agency 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.vehicle;

import java.util.List;

import javax.vecmath.Point2d;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.addons.vehicle.impl.WheelVehicleUtilitiesImpl;
import org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Wheel Vehicle Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.vehicle.Symphony__AddonsVehiclePackage#getWheelVehicleUtilities()
 * @model
 * @generated
 */
public interface WheelVehicleUtilities extends EObject
{
	
  /**
   * @generated_NOT
   */
  public static WheelVehicleUtilities INSTANCE = WheelVehicleUtilitiesImpl.getInstance();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the location of the wheel center that makes the wheel contact the specified segment.
	 * @param wheelRadius The wheel radius, in meters.
	 * @param The wheel center x position in the profile coordinates.
	 * @param segment The specified segment.
	 * @return The position of the wheel center, null if none is found.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.Point2d" unique="false" wheelRadiusUnique="false" wheelCenterXUnique="false" segmentDataType="org.eclipse.symphony.addons.vehicle.Segment2D" segmentUnique="false"
	 * @generated
	 */
  Point2d getWheelCenterPoint(double wheelRadius, double wheelCenterX, Segment2D segment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the location of the wheel center that makes the wheel contact with the specified TerrainProfile.
	 * @param wheelRadius The wheel radius, in meters.
	 * @param The wheel center x position in the profile coordinates.
	 * @param terrainProfile The specified TerrainProfile.
	 * @return The position of the wheel center, null if none is found.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.Point2d" unique="false" wheelRadiusUnique="false" wheelCenterXUnique="false" terrainProfileDataType="org.eclipse.symphony.addons.vehicle.TerrainProfile" terrainProfileUnique="false"
	 * @generated
	 */
  Point2d getWheelCenterPoint(double wheelRadius, double wheelCenterX, TerrainProfile terrainProfile);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the terrain profile for the specified plane cutting through the specified mesh.
	 * @param mesh The specified mesh.
	 * @param plane The specified plane.
	 * @return The set of Segment (sorted by p1.x) of the profile found at the intersection.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.TerrainProfile" unique="false" meshUnique="false" planeDataType="org.eclipse.symphony.addons.vehicle.Plane" planeUnique="false"
	 * @generated
	 */
  TerrainProfile findTerrainProfile(CartesianTriangularMesh mesh, Plane plane);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Finds the list of points found at the intersection of the specified plane and line.
	 * @param plane The specified Plane.
	 * @param line3d The specified line
	 * @return The list containing the intersection points. Can be empty if no intersection is found.
	 * Can contain 1 point if the line intersect with the plane but does lies in it. Can contain 2
	 * points (the segment end points) if the line lies in the plane.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.List<org.eclipse.symphony.addons.vehicle.Point3d>" unique="false" many="false" planeDataType="org.eclipse.symphony.addons.vehicle.Plane" planeUnique="false" line3dDataType="org.eclipse.symphony.addons.vehicle.Line3d" line3dUnique="false"
	 * @generated
	 */
  List<Point3d> findIntersection(Plane plane, Line3d line3d);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or no a specified point falls on a Segment2D
	 * @param p The specified point.
	 * @param segment The sepcified Segment2D.
	 * @return True if the point falls on the segment, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" pDataType="org.eclipse.symphony.addons.vehicle.Point2d" pUnique="false" segmentDataType="org.eclipse.symphony.addons.vehicle.Segment2D" segmentUnique="false"
	 * @generated
	 */
  boolean isPointOnSegment(Point2d p, Segment2D segment);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the mesh extent of a specified mesh.
	 * @param mesh The specified mesh.
	 * @return The associated MeshExtent.
	 * <!-- end-model-doc -->
	 * @model unique="false" meshUnique="false"
	 * @generated
	 */
  MeshExtent2D findMeshExtent2D(CartesianTriangularMesh mesh);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether of not a specified point falls within a mesh extents.
	 * @param point The specified point.
	 * @param meshExtent The specified mesh extent.
	 * @return True is the point falls within the meshExtent, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" pointDataType="org.eclipse.symphony.addons.vehicle.Point3d" pointUnique="false" meshExtentUnique="false"
	 * @generated
	 */
  boolean isWithin(Point3d point, MeshExtent2D meshExtent);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the normal of the plane that best (least square errors) fits a set of points.
	 * @param points The list of points.
	 * @return The normal of the plane that best (least square errors) fits a set of points, null if it is not defined.
	 * @see D. Gingras, Memoire de maitrise, pp. 73-74.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.addons.vehicle.Vector3d" unique="false" pointsDataType="org.eclipse.symphony.addons.vehicle.List<org.eclipse.symphony.addons.vehicle.Point3d>" pointsUnique="false" pointsMany="false"
	 * @generated
	 */
  Vector3d findBestFitPlane(List<Point3d> points);
} // WheelVehicleUtilities
