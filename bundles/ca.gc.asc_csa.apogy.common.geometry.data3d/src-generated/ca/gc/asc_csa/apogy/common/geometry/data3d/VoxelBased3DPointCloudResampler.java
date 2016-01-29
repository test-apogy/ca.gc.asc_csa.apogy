/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d;

import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voxel Based3 DPoint Cloud Resampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This processor sub-samples a point cloud using a voxel approach based on an implementation of J. Bakambu from MDA.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX <em>Resolution X</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY <em>Resolution Y</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ <em>Resolution Z</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel <em>Minimum Number Of Point Per Voxel</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution <em>Tile Resolution</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler()
 * @model
 * @generated
 */
public interface VoxelBased3DPointCloudResampler extends Processor<CartesianCoordinatesSet, CartesianCoordinatesSet> {
	/**
	 * Returns the value of the '<em><b>Resolution X</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution X</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Voxel resolution along the X axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution X</em>' attribute.
	 * @see #setResolutionX(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler_ResolutionX()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getResolutionX();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionX <em>Resolution X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution X</em>' attribute.
	 * @see #getResolutionX()
	 * @generated
	 */
	void setResolutionX(double value);

	/**
	 * Returns the value of the '<em><b>Resolution Y</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Y</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Voxel resolution along the Y axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Y</em>' attribute.
	 * @see #setResolutionY(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler_ResolutionY()
	 * @model default="0.1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getResolutionY();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionY <em>Resolution Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Y</em>' attribute.
	 * @see #getResolutionY()
	 * @generated
	 */
	void setResolutionY(double value);

	/**
	 * Returns the value of the '<em><b>Resolution Z</b></em>' attribute.
	 * The default value is <code>"0.05"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resolution Z</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Voxel resolution along the Z axis.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution Z</em>' attribute.
	 * @see #setResolutionZ(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler_ResolutionZ()
	 * @model default="0.05" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getResolutionZ();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getResolutionZ <em>Resolution Z</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution Z</em>' attribute.
	 * @see #getResolutionZ()
	 * @generated
	 */
	void setResolutionZ(double value);

	/**
	 * Returns the value of the '<em><b>Minimum Number Of Point Per Voxel</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Number Of Point Per Voxel</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Minimum number of points per voxel required to have a voxel considered occupied.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minimum Number Of Point Per Voxel</em>' attribute.
	 * @see #setMinimumNumberOfPointPerVoxel(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler_MinimumNumberOfPointPerVoxel()
	 * @model default="1" unique="false"
	 * @generated
	 */
	int getMinimumNumberOfPointPerVoxel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getMinimumNumberOfPointPerVoxel <em>Minimum Number Of Point Per Voxel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Number Of Point Per Voxel</em>' attribute.
	 * @see #getMinimumNumberOfPointPerVoxel()
	 * @generated
	 */
	void setMinimumNumberOfPointPerVoxel(int value);

	/**
	 * Returns the value of the '<em><b>Tile Resolution</b></em>' attribute.
	 * The default value is <code>"5.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tile Resolution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * TODO : Define what this does.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tile Resolution</em>' attribute.
	 * @see #setTileResolution(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getVoxelBased3DPointCloudResampler_TileResolution()
	 * @model default="5.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getTileResolution();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler#getTileResolution <em>Tile Resolution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tile Resolution</em>' attribute.
	 * @see #getTileResolution()
	 * @generated
	 */
	void setTileResolution(double value);

} // VoxelBased3DPointCloudResampler
