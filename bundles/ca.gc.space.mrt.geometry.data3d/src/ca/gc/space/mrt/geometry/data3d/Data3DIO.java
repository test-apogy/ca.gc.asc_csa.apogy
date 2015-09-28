/**
 * Canadian Space Agency 2008.
 *
 * $Id: Data3DIO.java,v 1.2.4.2 2015/05/21 15:50:48 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data3 DIO</b></em>'. <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getData3DIO()
 * @model
 * @generated
 */
public interface Data3DIO extends EObject {

	public static final Data3DIO INSTANCE = Data3dFactory.eINSTANCE
			.createData3DIO();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, String file)
			throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file) throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" outputDataType="ca.gc.space.mrt.geometry.data3d.OutputStream"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, OutputStream output)
			throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" inputDataType="ca.gc.space.mrt.geometry.data3d.InputStream"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(InputStream input)
			throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	NormalPointCloud loadTriangularMeshFromASCIIAsNormalPointCloud(
			String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromASCII(String filePrefix)
			throws IOException;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.common.processors.Exception"
	 * @generated
	 */
	void saveTriangularMeshAsASCII(CartesianTriangularMesh mesh,
			String filePrefix) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	CartesianCoordinatesSet loadXYZ(String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromTriXYZ(String triFileName, String xyzFileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" fileDataType="ca.gc.space.mrt.geometry.data3d.OutputStream"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" fileDataType="ca.gc.space.mrt.geometry.data3d.OutputStream"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

} // Data3DIO
