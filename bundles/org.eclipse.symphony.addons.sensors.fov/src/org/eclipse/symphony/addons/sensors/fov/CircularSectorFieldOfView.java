/**
 * Canadian Space Agency 2007.
 *
 * $Id: CircularSectorFieldOfView.java,v 1.2.4.2 2015/05/21 15:51:25 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.fov;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Sector Field Of View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A field of view shaped like a circular sector (see http://en.wikipedia.org/wiki/Circular_sector).
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan <em>Angular Span</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getRange <em>Range</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getArea <em>Area</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getCircularSectorFieldOfView()
 * @model
 * @generated
 */
public interface CircularSectorFieldOfView extends FieldOfView {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

	/**
	 * Returns the value of the '<em><b>Angular Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Span</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Span</em>' containment reference.
	 * @see #setAngularSpan(AngularSpan)
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getCircularSectorFieldOfView_AngularSpan()
	 * @model containment="true" required="true"
	 * @generated
	 */
	AngularSpan getAngularSpan();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getAngularSpan <em>Angular Span</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Span</em>' containment reference.
	 * @see #getAngularSpan()
	 * @generated
	 */
	void setAngularSpan(AngularSpan value);

	/**
	 * Returns the value of the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Range</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Range</em>' containment reference.
	 * @see #setRange(DistanceRange)
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getCircularSectorFieldOfView_Range()
	 * @model containment="true"
	 * @generated
	 */
	DistanceRange getRange();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.sensors.fov.CircularSectorFieldOfView#getRange <em>Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Range</em>' containment reference.
	 * @see #getRange()
	 * @generated
	 */
	void setRange(DistanceRange value);

	/**
	 * Returns the value of the '<em><b>Area</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The area of the circular sector.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area</em>' attribute.
	 * @see org.eclipse.symphony.addons.sensors.fov.FovPackage#getCircularSectorFieldOfView_Area()
	 * @model default="0.0" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	double getArea();

} // CircularSectorFieldOfView
