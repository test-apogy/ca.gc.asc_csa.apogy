/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.range;

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
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RayData#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.range.RayData#getDirection <em>Direction</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRayData()
 * @model
 * @generated
 */
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
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRayData_Origin()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.range.Point3d"
	 * @generated
	 */
	Point3d getOrigin();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RayData#getOrigin <em>Origin</em>}' attribute.
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
	 * @see org.eclipse.symphony.addons.sensors.range.RangePackage#getRayData_Direction()
	 * @model unique="false" dataType="org.eclipse.symphony.addons.sensors.range.Vector3d"
	 * @generated
	 */
	Vector3d getDirection();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.range.RayData#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Vector3d value);

} // RayData
