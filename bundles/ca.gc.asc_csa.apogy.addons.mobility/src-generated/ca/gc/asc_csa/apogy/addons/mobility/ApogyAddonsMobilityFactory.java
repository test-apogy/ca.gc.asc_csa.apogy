/**
 * Agence spatiale canadienne / Canadian Space Agency 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage
 * @generated
 */
public interface ApogyAddonsMobilityFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyAddonsMobilityFactory eINSTANCE = ca.gc.asc_csa.apogy.addons.mobility.impl.ApogyAddonsMobilityFactoryImpl.init();

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
	ApogyAddonsMobilityPackage getApogyAddonsMobilityPackage();

} //ApogyAddonsMobilityFactory
