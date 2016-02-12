/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digit UID</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Digital Unique Identifier.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.DigitUID#get_id <em>id</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDigitUID()
 * @model
 * @generated
 */
public interface DigitUID extends UID {
	/**
	 * Returns the value of the '<em><b>id</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>id</em>' attribute.
	 * @see #set_id(long)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getDigitUID__id()
	 * @model default="0" unique="false"
	 * @generated
	 */
	long get_id();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.DigitUID#get_id <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id</em>' attribute.
	 * @see #get_id()
	 * @generated
	 */
	void set_id(long value);

} // DigitUID
