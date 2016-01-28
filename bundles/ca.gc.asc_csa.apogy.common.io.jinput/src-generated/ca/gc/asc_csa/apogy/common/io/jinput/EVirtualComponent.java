/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.io.jinput;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVirtual Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EVirtualComponent#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEVirtualComponent()
 * @model
 * @generated
 */
public interface EVirtualComponent extends EComponent {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(float)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEVirtualComponent_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
	float getCurrentValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EVirtualComponent#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(float value);

} // EVirtualComponent
