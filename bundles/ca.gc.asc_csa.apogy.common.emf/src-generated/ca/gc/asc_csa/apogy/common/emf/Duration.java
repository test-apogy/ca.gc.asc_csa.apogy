/**
 */
package ca.gc.asc_csa.apogy.common.emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class handles the concept of time duration.  It provides methods to process duration
 * between two {@link Timed} event.  It provides methods to express the duration in years, months,
 * days, minutes, seconds and milliseconds.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getValue <em>Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getDays <em>Days</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getHours <em>Hours</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getMinutes <em>Minutes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getSeconds <em>Seconds</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.Duration#getMilliseconds <em>Milliseconds</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration()
 * @model
 * @generated
 */
public interface Duration extends EObject {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Duration value in ms.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(long)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Value()
	 * @model unique="false"
	 * @generated
	 */
	long getValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.Duration#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(long value);

	/**
	 * Returns the value of the '<em><b>Days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of days.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Days</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Days()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte getDays();

	/**
	 * Returns the value of the '<em><b>Hours</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of hours.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hours</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Hours()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte getHours();

	/**
	 * Returns the value of the '<em><b>Minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of minutes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Minutes</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Minutes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte getMinutes();

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of seconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Seconds()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	byte getSeconds();

	/**
	 * Returns the value of the '<em><b>Milliseconds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Number of milliseconds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Milliseconds</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getDuration_Milliseconds()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	int getMilliseconds();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and returns the duration between the {@link firstEvent} and the {@link secondEvent}.
	 * @param firstEvent First {@link Timed} event.
	 * @param secondEvent Second {@link Timed} event.
	 * @return Duration instance.
	 * <!-- end-model-doc -->
	 * @model unique="false" firstEventUnique="false" secondEventUnique="false"
	 * @generated
	 */
	Duration getDuration(Timed firstEvent, Timed secondEvent);

} // Duration
