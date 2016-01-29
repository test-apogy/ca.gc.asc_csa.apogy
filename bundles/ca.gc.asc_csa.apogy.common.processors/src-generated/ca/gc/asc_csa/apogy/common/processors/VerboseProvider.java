/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.processors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verbose Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.VerboseProvider#isVerbose <em>Verbose</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getVerboseProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VerboseProvider extends EObject {
	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' attribute.
	 * @see #setVerbose(boolean)
	 * @see ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage#getVerboseProvider_Verbose()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVerbose();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.processors.VerboseProvider#isVerbose <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' attribute.
	 * @see #isVerbose()
	 * @generated
	 */
	void setVerbose(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model messageUnique="false"
	 * @generated
	 */
	void printVerbose(String message);

} // VerboseProvider
