/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.telecoms;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URl Based Antenna Radiation Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an antenna radiation pattern which actually pattern data is found in a URL.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getURlBasedAntennaRadiationPattern()
 * @model
 * @generated
 */
public interface URlBasedAntennaRadiationPattern extends AbstractAntennaRadiationPattern {
	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The URL to the file containing the radiation pattern data.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.eclipse.symphony.addons.telecoms.Symphony__AddonsTelecomsPackage#getURlBasedAntennaRadiationPattern_Url()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='URL'"
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.telecoms.URlBasedAntennaRadiationPattern#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

} // URlBasedAntennaRadiationPattern
