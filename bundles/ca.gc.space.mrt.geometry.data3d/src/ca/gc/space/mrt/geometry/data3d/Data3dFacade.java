/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3dFacade.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.impl.Data3dFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getData3dFacade()
 * @model
 * @generated
 */
public interface Data3dFacade extends EObject {

	public static final Data3dFacade INSTANCE = Data3dFacadeImpl.getInstance();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates createCartesianPositionCoordinates(double x,
			double y, double z);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates(
			double xRotation, double yRotation, double zRotation);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	SphericalCoordinates createSphericalCoordinates(double phi, double theta,
			double r);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pose createPose(double x, double y, double z, double xRotation,
			double yRotation, double zRotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pose createPose(Pose pose);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Pose createPose(CartesianPositionCoordinates position, CartesianOrientationCoordinates orientation);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model v1Required="true" v2Required="true" v3Required="true"
	 * @generated
	 */
	CartesianPolygon createCartesianPolygon(CartesianPositionCoordinates v1,
			CartesianPositionCoordinates v2, CartesianPositionCoordinates v3);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianPositionCoordinates createCartesianPositionCoordinates(
			CartesianPositionCoordinates coordinates);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates(
			CartesianOrientationCoordinates coordinates);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(
			CartesianCoordinatesMesh cartesianCoordinatesMesh);

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model v1Required="true" v2Required="true" v3Required="true"
	 * @generated
	 */
	CartesianTriangle createCartesianTriangle(CartesianPositionCoordinates v1,
			CartesianPositionCoordinates v2, CartesianPositionCoordinates v3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	<T extends CartesianPolygon> CartesianTriangle createCartesianTriangle(T polygon) throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model trMatrixDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	CartesianCoordinatesSet applyTransform(CartesianCoordinatesSet points,
			Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model polygonsDataType="ca.gc.space.mrt.geometry.data3d.List<ca.gc.space.mrt.geometry.data3d.CartesianPolygon>" polygonsMany="false"
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(List<CartesianPolygon> polygons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model polygonsDataType="ca.gc.space.mrt.geometry.data3d.List<ca.gc.space.mrt.geometry.data3d.CartesianTriangle>" polygonsMany="false"
	 * @generated
	 */
	CartesianTriangularMesh createCartesianTriangularMesh(List<CartesianTriangle> polygons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates>" many="false" pointsDataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates>" pointsMany="false" trMatrixDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	List<CartesianPositionCoordinates> applyTransform(List<CartesianPositionCoordinates> points, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model trMatrixDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	CartesianTriangularMesh applyTransform(CartesianTriangularMesh mesh, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model trMatrixDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	CartesianTriangularMesh applyTransformInt(CartesianTriangularMesh mesh, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model trMatrixDataType="ca.gc.space.mrt.geometry.data3d.Matrix4d"
	 * @generated
	 */
	NormalPointCloud applyTransform(NormalPointCloud points, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true"
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(CartesianTriangularMesh cartesianTriangularMesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	CartesianTriangularMesh createCartesianTriangularMesh(CartesianTriangularMesh cartesianCoordinatesMesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model xyzDataDataType="ca.gc.space.mrt.geometry.data3d.DoubleArrayOfArray"
	 * @generated
	 */
	void updateCartesianCoordinatesSet(CartesianCoordinatesSet cartesianCoordinatesSet, double[][] xyzData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	PointNormalLocator createPointNormalLocator(NormalPointCloud input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DigitalElevationMap createDigitalElevationMap(CartesianCoordinatesSet coordinatesSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model listOfTriangularMeshesRequired="true" listOfTriangularMeshesMany="true"
	 * @generated
	 */
	CartesianTriangularMesh concatenateTriangularMeshes(EList<CartesianTriangularMesh> listOfTriangularMeshes);

} // Data3dFacade
