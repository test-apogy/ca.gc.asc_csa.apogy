/**
 * Canadian Space Agency 2007.
 *
 * $Id: VerboseProvider.java,v 1.4.4.2 2015/05/21 15:49:38 pallard Exp $
 */
package ca.gc.space.mrt.common.processors;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verbose Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.common.processors.VerboseProvider#isVerbose <em>Verbose</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getVerboseProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface VerboseProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2007.";

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
	 * @see ca.gc.space.mrt.common.processors.ProcessorsPackage#getVerboseProvider_Verbose()
	 * @model unique="false"
	 * @generated
	 */
	boolean isVerbose();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.common.processors.VerboseProvider#isVerbose <em>Verbose</em>}' attribute.
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
