/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.utils.log;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.utils.log.UtilsLogPackage
 * @generated
 */
public interface UtilsLogFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsLogFactory eINSTANCE = ca.gc.asc_csa.eclipse.utils.log.impl.UtilsLogFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Logger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Logger</em>'.
	 * @generated
	 */
	Logger createLogger();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UtilsLogPackage getUtilsLogPackage();

} //UtilsLogFactory
