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
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getValidityRangeProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface ValidityRangeProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the earliest date for which the data is valid.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" required="true"
	 * @generated
	 */
	Date getFromValidDate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Defines the latest date for which the data is valid.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false" required="true"
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
