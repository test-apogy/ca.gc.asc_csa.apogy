/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.tools.telecoms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Conical Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A simple radiation pattern defined as a rectangular frustum. Outside the frustum, gain is null.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.tools.telecoms.SimpleConicalRadiationPattern#getApexAngle <em>Apex Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage#getSimpleConicalRadiationPattern()
 * @model
 * @generated
 */
public interface SimpleConicalRadiationPattern extends AbstractAntennaRadiationPattern {
	/**
	 * Returns the value of the '<em><b>Apex Angle</b></em>' attribute.
	 * The default value is <code>"0.79"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Apex Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The apex angle of the cone. The cone is pointing toward +Z.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Apex Angle</em>' attribute.
	 * @see #setApexAngle(double)
	 * @see ca.gc.asc_csa.symphony.tools.telecoms.SymphonyTelecomToolsPackage#getSimpleConicalRadiationPattern_ApexAngle()
	 * @model default="0.79" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double getApexAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.tools.telecoms.SimpleConicalRadiationPattern#getApexAngle <em>Apex Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apex Angle</em>' attribute.
	 * @see #getApexAngle()
	 * @generated
	 */
	void setApexAngle(double value);

} // SimpleConicalRadiationPattern
