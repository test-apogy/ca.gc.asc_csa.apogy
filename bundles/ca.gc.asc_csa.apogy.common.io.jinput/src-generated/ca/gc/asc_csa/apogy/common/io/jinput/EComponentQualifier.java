/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.io.jinput;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier()
 * @model
 * @generated
 */
public interface EComponentQualifier extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier_EComponentName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEComponentName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier_EControllerName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEControllerName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EController Name</em>' attribute.
	 * @see #getEControllerName()
	 * @generated
	 */
	void setEControllerName(String value);

} // EComponentQualifier
