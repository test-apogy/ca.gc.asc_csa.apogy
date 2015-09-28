/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3DUtils.java,v 1.2.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import java.util.List;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.impl.Data3DUtilsImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data3 DUtils</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getData3DUtils()
 * @model
 * @generated
 */
public interface Data3DUtils extends EObject {

	public static final Data3DUtils INSTANCE = Data3DUtilsImpl.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Vector3d"
	 * @generated
	 */
	EList<Vector3d> computeNormals(CartesianTriangularMesh mesh);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates computeCentroid(CartesianCoordinatesSet points);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model minDataType="ca.gc.space.mrt.geometry.data3d.Point3d" maxDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	void computeMinMaxValues(Point3d min, Point3d max,
			CartesianCoordinatesSet data);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeCurvatureChange(PointLocator pointLocator, int centerPoint,
			double radius);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	double computeCurvatureChange(VecmathPointLocator pointLocator, int centerPoint, double radius);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model profilePointsDataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates>" profilePointsMany="false"
	 * @generated
	 */
	CartesianTriangularMesh extrude(List<CartesianPositionCoordinates> profilePoints, CartesianAxis extrusionAxis, double extrusionWidth, boolean closeMesh);

} // Data3DUtils
