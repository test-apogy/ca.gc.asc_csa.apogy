/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d;

import javax.vecmath.GVector;
import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Point Normal Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.PointNormalLocator#getDataSet <em>Data Set</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointNormalLocator()
 * @model
 * @generated
 */
public interface PointNormalLocator extends EObject {
	/**
	 * Returns the value of the '<em><b>Data Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Set</em>' reference.
	 * @see #setDataSet(NormalPointCloud)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getPointNormalLocator_DataSet()
	 * @model
	 * @generated
	 */
	NormalPointCloud getDataSet();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.PointNormalLocator#getDataSet <em>Data Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Set</em>' reference.
	 * @see #getDataSet()
	 * @generated
	 */
	void setDataSet(NormalPointCloud value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" unique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	GVector findClosestPoint(Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" unique="false" radiusUnique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	EList<GVector> findPointsWithinRadius(double radius, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" unique="false" nUnique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	EList<GVector> findClosestNPoints(int n, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	int findClosestPointId(Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" unique="false" radiusUnique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	int[] findPointIdsWithinRadius(double radius, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" unique="false" nUnique="false" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointUnique="false" normalDataType="ca.gc.space.mrt.geometry.data3d.Vector3d" normalUnique="false"
	 * @generated
	 */
	int[] findClosestNPointIds(int n, Point3d point, Vector3d normal);

} // PointNormalLocator
