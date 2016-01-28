/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.sensors.fov;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Angular Span</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an angular span by specifying a maximum and a minimum angle (in radians).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getMinimumAngle <em>Minimum Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getMaximumAngle <em>Maximum Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getSpanningAngle <em>Spanning Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getCenterAngle <em>Center Angle</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getAngularSpan()
 * @model
 * @generated
 */
public interface AngularSpan extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Angle</em>' attribute.
	 * @see #setMinimumAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getAngularSpan_MinimumAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getMinimumAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getMinimumAngle <em>Minimum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Angle</em>' attribute.
	 * @see #getMinimumAngle()
	 * @generated
	 */
	void setMinimumAngle(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Angle</em>' attribute.
	 * @see #setMaximumAngle(double)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getAngularSpan_MaximumAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getMaximumAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.AngularSpan#getMaximumAngle <em>Maximum Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Angle</em>' attribute.
	 * @see #getMaximumAngle()
	 * @generated
	 */
	void setMaximumAngle(double value);

	/**
	 * Returns the value of the '<em><b>Spanning Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The total angular span, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spanning Angle</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getAngularSpan_SpanningAngle()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getSpanningAngle();

	/**
	 * Returns the value of the '<em><b>Center Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The center of the angular span, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Center Angle</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getAngularSpan_CenterAngle()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad'"
	 * @generated
	 */
	double getCenterAngle();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or not the specified angle (in radians) falls within the angular range.
	 * <!-- end-model-doc -->
	 * @model unique="false" angleUnique="false"
	 * @generated
	 */
	boolean isWithinRange(double angle);

} // AngularSpan
