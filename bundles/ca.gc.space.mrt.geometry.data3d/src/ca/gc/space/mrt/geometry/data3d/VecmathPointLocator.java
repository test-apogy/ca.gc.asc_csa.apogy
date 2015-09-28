/**
 * Canadian Space Agency 2008.
 *
 * $Id: VecmathPointLocator.java,v 1.3.4.2 2015/05/21 15:50:49 pallard Exp $
 */
package ca.gc.space.mrt.geometry.data3d;

import java.util.List;

import javax.vecmath.Point3d;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vecmath Point Locator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.geometry.data3d.VecmathPointLocator#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getVecmathPointLocator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VecmathPointLocator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(List)
	 * @see ca.gc.space.mrt.geometry.data3d.Data3dPackage#getVecmathPointLocator_Points()
	 * @model default="" dataType="ca.gc.space.mrt.geometry.data.List<ca.gc.space.mrt.geometry.data3d.Point3d>" many="false"
	 * @generated
	 */
	List<Point3d> getPoints();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.geometry.data3d.VecmathPointLocator#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(List<Point3d> value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	Point3d findClosestPoint(Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	EList<Point3d> findPointsWithinRadius(double radius, Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	int findClosestPointId(Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" pointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	int[] findPointIdsWithinRadius(double radius, Point3d point);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.Point3d" referencePointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	EList<Point3d> findClosestNPoints(Point3d referencePoint, int n);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.space.mrt.geometry.data3d.IntArray" referencePointDataType="ca.gc.space.mrt.geometry.data3d.Point3d"
	 * @generated
	 */
	int[] findClosestNPointIds(Point3d referencePoint, int n);

} // VecmathPointLocator
