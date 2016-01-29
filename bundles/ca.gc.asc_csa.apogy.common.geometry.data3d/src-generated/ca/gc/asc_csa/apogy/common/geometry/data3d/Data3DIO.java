/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.geometry.data3d.impl.Data3DIOImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Class defining methods used to save / load 3D data to / from files.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getData3DIO()
 * @model
 * @generated
 */
public interface Data3DIO extends EObject {
	
	public static Data3DIO INSTANCE = Data3DIOImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a CartesianTriangularMesh from an XMI resource.
	 * @param file The file path to the resource.
	 * @return The loaded CartesianTriangularMesh.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" fileUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a CartesianTriangularMesh from an XMI resource.
	 * @param input The input stream to read the content from.
	 * @return The loaded CartesianTriangularMesh.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" inputDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.InputStream" inputUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMesh(InputStream input) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianTriangularMesh as an XMI resource.
	 * @param mesh The CartesianTriangularMesh to save.
	 * @param file The destination file path for the resource.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" meshUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianTriangularMesh as an XMI resource.
	 * @param mesh The CartesianTriangularMesh to save.
	 * @param output The output stream to write the content.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" meshUnique="false" outputDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.OutputStream" outputUnique="false"
	 * @generated
	 */
	void saveTriangularMesh(CartesianTriangularMesh mesh, OutputStream output) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a NormalPointCloud from ASCII files. Two files are required : filePrefix.xyz : contains the points and
	 * filePrefix.tri : containing the list of triangles.
	 * @param filePrefix The file prefix defining both the points and triangles files.
	 * @return The loaded NormalPointCloud.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" filePrefixUnique="false"
	 * @generated
	 */
	NormalPointCloud loadTriangularMeshFromASCIIAsNormalPointCloud(String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a CartesianTriangularMesh from ASCII files. Two files are required : filePrefix.xyz : contains the points and
	 * filePrefix.tri : containing the list of triangles.
	 * @param filePrefix The file prefix defining both the points and triangles files.
	 * @return The loaded CartesianTriangularMesh.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" filePrefixUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromASCII(String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianTriangularMesh to ASCII files. Two files are produced : filePrefix.xyz : contains the points and
	 * filePrefix.tri : containing the list of triangles.
	 * @param mesh The CartesianTriangularMesh to save.
	 * @param filePrefix The file prefix defining both the points and triangles files.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" meshUnique="false" filePrefixUnique="false"
	 * @generated
	 */
	void saveTriangularMeshAsASCII(CartesianTriangularMesh mesh, String filePrefix) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a CartesianCoordinatesSet from an .xyz file. The .xyz can contains 3 column (x,y, z coordinates of the point) or
	 * 6 (x,y,z coordinates of the point + the normal vector at the point)
	 * @param fileName The file path to the file.
	 * @return The CartesianCoordinatesSet loaded from the file.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" fileNameUnique="false"
	 * @generated
	 */
	CartesianCoordinatesSet loadXYZ(String fileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Loads a CartesianTriangularMesh from two ASCII files. Two files are required : xyzFileName.xyz : contains the points and
	 * triFileName.tri : containing the list of triangles.
	 * @param triFileName The file path to the file containing the triangles.
	 * @param xyzFileName The file path to the file containing the points.
	 * @return The loaded CartesianTriangularMesh.
	 * <!-- end-model-doc -->
	 * @model unique="false" exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" triFileNameUnique="false" xyzFileNameUnique="false"
	 * @generated
	 */
	CartesianTriangularMesh loadTriangularMeshFromTriXYZ(String triFileName, String xyzFileName) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianCoordinatesSet to an .xyz formatted file.
	 * @param coordinatesSet The CartesianCoordinatesSet to save.
	 * @param file The file path of the destination.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" coordinatesSetUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianCoordinatesSet to an .xyz formatted file.
	 * @param coordinatesSet The CartesianCoordinatesSet to save.
	 * @param file The output stream to write the content..
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" coordinatesSetUnique="false" fileDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.OutputStream" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToXYZ(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianCoordinatesSet to an comma separated formatted file.
	 * @param coordinatesSet The CartesianCoordinatesSet to save.
	 * @param file The file path of the destination.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" coordinatesSetUnique="false" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, String file) throws IOException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Saves a CartesianCoordinatesSet to an comma separated formatted file.
	 * @param coordinatesSet The CartesianCoordinatesSet to save.
	 * @param file The file path of the destination.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.common.geometry.data3d.IOException" coordinatesSetUnique="false" fileDataType="ca.gc.asc_csa.apogy.common.geometry.data3d.OutputStream" fileUnique="false"
	 * @generated
	 */
	void saveCoordinatesSetToCSV(CartesianCoordinatesSet coordinatesSet, OutputStream file) throws IOException;

} // Data3DIO
