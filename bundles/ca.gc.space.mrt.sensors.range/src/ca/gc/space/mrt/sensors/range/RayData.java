/**
 * <copyright>
 * </copyright>
 *
 * $Id: RayData.java,v 1.4.4.2 2015/05/21 15:50:22 pallard Exp $
 */
package ca.gc.space.mrt.sensors.range;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ray Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RayData#getOrigin <em>Origin</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.range.RayData#getDirection <em>Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRayData()
 * @model
 * @generated
 */
@SuppressWarnings("restriction")
public interface RayData extends EObject {
	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Origin</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(Point3d)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRayData_Origin()
	 * @model dataType="org.eclipse.symphony.common.geometry.data3d.Point3d"
	 * @generated
	 */
	Point3d getOrigin();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RayData#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Point3d value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(Vector3d)
	 * @see ca.gc.space.mrt.sensors.range.RangePackage#getRayData_Direction()
	 * @model dataType="org.eclipse.symphony.common.geometry.data.Vector3d"
	 * @generated
	 */
	Vector3d getDirection();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.range.RayData#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Vector3d value);

} // RayData
