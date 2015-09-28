/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EVirtual Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.jinput.EVirtualComponent#getCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.jinput.JInputPackage#getEVirtualComponent()
 * @model
 * @generated
 */
public interface EVirtualComponent extends EComponent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

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
	 * @see ca.gc.asc_csa.jinput.JInputPackage#getEVirtualComponent_CurrentValue()
	 * @model
	 * @generated
	 */
	float getCurrentValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.jinput.EVirtualComponent#getCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #getCurrentValue()
	 * @generated
	 */
	void setCurrentValue(float value);

} // EVirtualComponent
