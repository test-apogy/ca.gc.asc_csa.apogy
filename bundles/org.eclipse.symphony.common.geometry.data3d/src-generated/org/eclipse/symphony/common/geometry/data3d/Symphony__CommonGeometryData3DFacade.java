/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d;

import java.util.List;

import javax.vecmath.Matrix4d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.impl.Symphony__CommonGeometryData3DFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data3d Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DPackage#getSymphony__CommonGeometryData3DFacade()
 * @model
 * @generated
 */
public interface Symphony__CommonGeometryData3DFacade extends EObject {
	
	public static Symphony__CommonGeometryData3DFacade INSTANCE = Symphony__CommonGeometryData3DFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates createCartesianPositionCoordinates(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" xRotationUnique="false" yRotationUnique="false" zRotationUnique="false"
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates(double xRotation, double yRotation, double zRotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" phiUnique="false" thetaUnique="false" rUnique="false"
	 * @generated
	 */
	SphericalCoordinates createSphericalCoordinates(double phi, double theta, double r);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" xUnique="false" yUnique="false" zUnique="false" xRotationUnique="false" yRotationUnique="false" zRotationUnique="false"
	 * @generated
	 */
	Pose createPose(double x, double y, double z, double xRotation, double yRotation, double zRotation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" poseUnique="false"
	 * @generated
	 */
	Pose createPose(Pose pose);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" positionUnique="false" orientationUnique="false"
	 * @generated
	 */
	Pose createPose(CartesianPositionCoordinates position, CartesianOrientationCoordinates orientation);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" inputUnique="false"
	 * @generated
	 */
	PointNormalLocator createPointNormalLocator(NormalPointCloud input);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinatesSetUnique="false"
	 * @generated
	 */
	DigitalElevationMap createDigitalElevationMap(CartesianCoordinatesSet coordinatesSet);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" v1Unique="false" v2Unique="false" v3Unique="false"
	 * @generated
	 */
	CartesianPolygon createCartesianPolygon(CartesianPositionCoordinates v1, CartesianPositionCoordinates v2, CartesianPositionCoordinates v3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinatesUnique="false"
	 * @generated
	 */
	CartesianPositionCoordinates createCartesianPositionCoordinates(CartesianPositionCoordinates coordinates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" coordinatesUnique="false"
	 * @generated
	 */
	CartesianOrientationCoordinates createCartesianOrientationCoordinates(CartesianOrientationCoordinates coordinates);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cartesianCoordinatesMeshUnique="false"
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(CartesianCoordinatesMesh cartesianCoordinatesMesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" v1Unique="false" v2Unique="false" v3Unique="false"
	 * @generated
	 */
	CartesianTriangle createCartesianTriangle(CartesianPositionCoordinates v1, CartesianPositionCoordinates v2, CartesianPositionCoordinates v3);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="org.eclipse.symphony.common.geometry.data3d.IllegalArgumentException" polygonUnique="false"
	 * @generated
	 */
	<T extends CartesianPolygon> CartesianTriangle createCartesianTriangle(T polygon) throws IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" polygonsDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPolygon>" polygonsUnique="false" polygonsMany="false"
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(List<CartesianPolygon> polygons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cartesianCoordinatesMeshUnique="false"
	 * @generated
	 */
	CartesianCoordinatesMesh createCartesianCoordinatesMesh(CartesianTriangularMesh cartesianCoordinatesMesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" polygonsDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianTriangle>" polygonsUnique="false" polygonsMany="false"
	 * @generated
	 */
	CartesianTriangularMesh createCartesianTriangularMesh(List<CartesianTriangle> polygons);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" cartesianCoordinatesMeshUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh createCartesianTriangularMesh(CartesianTriangularMesh cartesianCoordinatesMesh);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointsUnique="false" trMatrixDataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" trMatrixUnique="false"
	 * @generated
	 */
	CartesianCoordinatesSet applyTransform(CartesianCoordinatesSet points, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" unique="false" many="false" pointsDataType="org.eclipse.symphony.common.geometry.data3d.List<org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates>" pointsUnique="false" pointsMany="false" trMatrixDataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" trMatrixUnique="false"
	 * @generated
	 */
	List<CartesianPositionCoordinates> applyTransform(List<CartesianPositionCoordinates> points, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" meshUnique="false" trMatrixDataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" trMatrixUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh applyTransform(CartesianTriangularMesh mesh, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" meshUnique="false" trMatrixDataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" trMatrixUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh applyTransformInt(CartesianTriangularMesh mesh, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointsUnique="false" trMatrixDataType="org.eclipse.symphony.common.geometry.data3d.Matrix4d" trMatrixUnique="false"
	 * @generated
	 */
	NormalPointCloud applyTransform(NormalPointCloud points, Matrix4d trMatrix);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model cartesianCoordinatesSetUnique="false" xyzDataDataType="org.eclipse.symphony.common.geometry.data3d.DoubleArrayOfArray" xyzDataUnique="false"
	 * @generated
	 */
	void updateCartesianCoordinatesSet(CartesianCoordinatesSet cartesianCoordinatesSet, double[][] xyzData);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" listOfTriangularMeshesDataType="org.eclipse.symphony.common.geometry.data3d.EList<org.eclipse.symphony.common.geometry.data3d.CartesianTriangularMesh>" listOfTriangularMeshesUnique="false" listOfTriangularMeshesMany="false"
	 * @generated
	 */
	CartesianTriangularMesh concatenateTriangularMeshes(EList<CartesianTriangularMesh> listOfTriangularMeshes);

} // Symphony__CommonGeometryData3DFacade
