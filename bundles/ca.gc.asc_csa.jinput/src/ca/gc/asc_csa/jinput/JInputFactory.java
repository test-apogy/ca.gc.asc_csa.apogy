/**
 * Copyrights Canadian Space Agency 2012. All rights reserved.
 */
package ca.gc.asc_csa.jinput;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.jinput.JInputPackage
 * @generated
 */
public interface JInputFactory extends EFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012. All rights reserved.";

	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JInputFactory eINSTANCE = ca.gc.asc_csa.jinput.impl.JInputFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>EController</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EController</em>'.
	 * @generated
	 */
	EController createEController();

	/**
	 * Returns a new object of class '<em>EController Environment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EController Environment</em>'.
	 * @generated
	 */
	EControllerEnvironment createEControllerEnvironment();

	/**
	 * Returns a new object of class '<em>EComponent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComponent</em>'.
	 * @generated
	 */
	EComponent createEComponent();

	/**
	 * Returns a new object of class '<em>EComponents</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComponents</em>'.
	 * @generated
	 */
	EComponents createEComponents();

	/**
	 * Returns a new object of class '<em>EButton</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EButton</em>'.
	 * @generated
	 */
	EButton createEButton();

	/**
	 * Returns a new object of class '<em>EAxis</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EAxis</em>'.
	 * @generated
	 */
	EAxis createEAxis();

	/**
	 * Returns a new object of class '<em>EKey</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EKey</em>'.
	 * @generated
	 */
	EKey createEKey();

	/**
	 * Returns a new object of class '<em>EComponent Qualifier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EComponent Qualifier</em>'.
	 * @generated
	 */
	EComponentQualifier createEComponentQualifier();

	/**
	 * Returns a new object of class '<em>EVirtual Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>EVirtual Component</em>'.
	 * @generated
	 */
	EVirtualComponent createEVirtualComponent();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JInputPackage getJInputPackage();

} //JInputFactory
