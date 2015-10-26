/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.mobility.Symphony__AddonsMobilityPackage
 * @generated
 */
public interface Symphony__AddonsMobilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsMobilityFactory eINSTANCE = org.eclipse.symphony.addons.mobility.impl.Symphony__AddonsMobilityFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mobile Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mobile Platform</em>'.
	 * @generated
	 */
	MobilePlatform createMobilePlatform();

	/**
	 * Returns a new object of class '<em>Skid Steered Mobile Platform</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Skid Steered Mobile Platform</em>'.
	 * @generated
	 */
	SkidSteeredMobilePlatform createSkidSteeredMobilePlatform();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsMobilityPackage getSymphony__AddonsMobilityPackage();

} //Symphony__AddonsMobilityFactory
