/**
 * Canadian Space Agency / Agence spatiale canadienne 2016 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.ros.paths;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.ros.paths.ApogyAddonsROSPathsPackage
 * @generated
 */
public interface ApogyAddonsROSPathsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsROSPathsFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.ros.paths.impl.ApogyAddonsROSPathsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Apogy Addons ROS Path Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Addons ROS Path Facade</em>'.
	 * @generated
	 */
	ApogyAddonsROSPathFacade createApogyAddonsROSPathFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyAddonsROSPathsPackage getApogyAddonsROSPathsPackage();

} //ApogyAddonsROSPathsFactory
