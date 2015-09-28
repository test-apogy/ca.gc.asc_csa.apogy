/**
 * Canadian Space Agency 2008.
 *
 * $Id: PointNormalLocator.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	GVector findClosestPoint(Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	EList<GVector> findPointsWithinRadius(double radius, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.GVector" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	EList<GVector> findClosestNPoints(int n, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	int findClosestPointId(Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	int[] findPointIdsWithinRadius(double radius, Point3d point, Vector3d normal);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d" normalDataType="ca.gc.space.mrt.geometry.data.Vector3d"
	 * @generated
	 */
	int[] findClosestNPointIds(int n, Point3d point, Vector3d normal);

} // PointNormalLocator
