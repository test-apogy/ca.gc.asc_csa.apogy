/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a Two-Line Elements orbit and propagation definition.
 * @see http://en.wikipedia.org/wiki/Two-line_element_set
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getFirstLine <em>First Line</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSecondLine <em>Second Line</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE()
 * @model
 * @generated
 */
public interface TLE extends AbstractTLE {

	/**
	 * Returns the value of the '<em><b>First Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first line of the TLE in text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>First Line</em>' attribute.
	 * @see #setFirstLine(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_FirstLine()
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getFirstLine();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getFirstLine <em>First Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Line</em>' attribute.
	 * @see #getFirstLine()
	 * @generated
	 */
	void setFirstLine(String value);

	/**
	 * Returns the value of the '<em><b>Second Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The second line of the TLE in text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Second Line</em>' attribute.
	 * @see #setSecondLine(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_SecondLine()
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getSecondLine();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSecondLine <em>Second Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Line</em>' attribute.
	 * @see #getSecondLine()
	 * @generated
	 */
	void setSecondLine(String value);
} // TLE
