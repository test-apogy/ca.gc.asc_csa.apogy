/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Validity Range Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getFromValidDate <em>From Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.ValidityRangeProvider#getToValidDate <em>To Valid Date</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getValidityRangeProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ValidityRangeProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>From Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the earliest date for which the data is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>From Valid Date</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getValidityRangeProvider_FromValidDate()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getFromValidDate();

	/**
	 * Returns the value of the '<em><b>To Valid Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the latest date for which the data is valid.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>To Valid Date</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getValidityRangeProvider_ToValidDate()
	 * @model unique="false" required="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	Date getToValidDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns whether or not a specified date falls within the validity range.
	 * <!-- end-model-doc -->
	 * @model unique="false" dateUnique="false"
	 * @generated
	 */
	boolean isDateInValidRange(Date date);

} // ValidityRangeProvider
