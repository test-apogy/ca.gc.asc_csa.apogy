/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;

import ca.gc.space.mrt.geometry.data3d.impl.Data3DIOImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getData3DIO()
 * @model
 * @generated
 */
public interface Data3DIO extends EObject {
	
	public static Data3DIO INSTANCE = Data3DIOImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" fileUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" inputDataType="ca.gc.space.mrt.geometry.data3d.InputStream" inputUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(InputStream input) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" meshUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" meshUnique="false" outputDataType="ca.gc.space.mrt.geometry.data3d.OutputStream" outputUnique="false"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" filePrefixUnique="false"
	 * @generated
	 */
	NormalPointCloud loadTriangularMeshFromASCIIAsNormalPointCloud(String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" filePrefixUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromASCII(String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" meshUnique="false" filePrefixUnique="false"
	 * @generated
	 */
	void saveTriangularMeshAsASCII(CartesianTriangularMesh mesh, String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" fileNameUnique="false"
	 * @generated
	 */
	CartesianCoordinatesSet loadXYZ(String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" exceptions="ca.gc.space.mrt.geometry.data3d.IOException" triFileNameUnique="false" xyzFileNameUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromTriXYZ(String triFileName, String xyzFileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" coordinatesSetUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" coordinatesSetUnique="false" fileDataType="ca.gc.space.mrt.geometry.data3d.OutputStream" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" coordinatesSetUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="ca.gc.space.mrt.geometry.data3d.IOException" coordinatesSetUnique="false" fileDataType="ca.gc.space.mrt.geometry.data3d.OutputStream" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

} // Data3DIO
