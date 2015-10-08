/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package org.eclipse.symphony.common.io.jinput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponentQualifier()
 * @model
 * @generated
 */
public interface EComponentQualifier extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>EComponent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponent Name</em>' attribute.
	 * @see #setEComponentName(String)
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponentQualifier_EComponentName()
	 * @model required="true"
	 * @generated
	 */
	String getEComponentName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponent Name</em>' attribute.
	 * @see #getEComponentName()
	 * @generated
	 */
	void setEComponentName(String value);

	/**
	 * Returns the value of the '<em><b>EController Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EController Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EController Name</em>' attribute.
	 * @see #setEControllerName(String)
	 * @see org.eclipse.symphony.common.io.jinput.JInputPackage#getEComponentQualifier_EControllerName()
	 * @model required="true"
	 * @generated
	 */
	String getEControllerName();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EController Name</em>' attribute.
	 * @see #getEControllerName()
	 * @generated
	 */
	void setEControllerName(String value);

} // EComponentQualifier
