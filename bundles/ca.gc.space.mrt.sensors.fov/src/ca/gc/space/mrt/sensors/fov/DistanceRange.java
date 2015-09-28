/**
 * Canadian Space Agency 2007.
 *
 * $Id: DistanceRange.java,v 1.2.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package ca.gc.space.mrt.sensors.fov;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an distance range by specifying a minimum and maximum distance.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.DistanceRange#getMinimumDistance <em>Minimum Distance</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.DistanceRange#getMaximumDistance <em>Maximum Distance</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.fov.DistanceRange#getDistance <em>Distance</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getDistanceRange()
 * @model
 * @generated
 */
public interface DistanceRange extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Minimum Distance</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Distance</em>' attribute.
	 * @see #setMinimumDistance(double)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getDistanceRange_MinimumDistance()
	 * @model default="0.0" required="true"
	 * @generated
	 */
	double getMinimumDistance();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.DistanceRange#getMinimumDistance <em>Minimum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Distance</em>' attribute.
	 * @see #getMinimumDistance()
	 * @generated
	 */
	void setMinimumDistance(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Distance</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Distance</em>' attribute.
	 * @see #setMaximumDistance(double)
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getDistanceRange_MaximumDistance()
	 * @model default="1.0" required="true"
	 * @generated
	 */
	double getMaximumDistance();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.sensors.fov.DistanceRange#getMaximumDistance <em>Maximum Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Distance</em>' attribute.
	 * @see #getMaximumDistance()
	 * @generated
	 */
	void setMaximumDistance(double value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Distance</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see ca.gc.space.mrt.sensors.fov.FovPackage#getDistanceRange_Distance()
	 * @model transient="true" changeable="false" volatile="true"
	 * @generated
	 */
	double getDistance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or not the specified distance falls within the range.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	boolean isWithinRange(double distance);

} // DistanceRange
