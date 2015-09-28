/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage
 * @generated
 */
public interface EMFEcoreExampleSatelliteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EMFEcoreExampleSatelliteFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.impl.EMFEcoreExampleSatelliteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Satellite Simulated</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Simulated</em>'.
	 * @generated
	 */
	SatelliteSimulated createSatelliteSimulated();

	/**
	 * Returns a new object of class '<em>Satellite Stub</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Stub</em>'.
	 * @generated
	 */
	SatelliteStub createSatelliteStub();

	/**
	 * Returns a new object of class '<em>Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Command</em>'.
	 * @generated
	 */
	SatelliteCommand createSatelliteCommand();

	/**
	 * Returns a new object of class '<em>Satellite Command List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Command List</em>'.
	 * @generated
	 */
	SatelliteCommandList createSatelliteCommandList();

	/**
	 * Returns a new object of class '<em>Satellite Command Roll</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Command Roll</em>'.
	 * @generated
	 */
	SatelliteCommandRoll createSatelliteCommandRoll();

	/**
	 * Returns a new object of class '<em>Satellite Command Acquire Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Command Acquire Image</em>'.
	 * @generated
	 */
	SatelliteCommandAcquireImage createSatelliteCommandAcquireImage();

	/**
	 * Returns a new object of class '<em>Image Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Order</em>'.
	 * @generated
	 */
	ImageOrder createImageOrder();

	/**
	 * Returns a new object of class '<em>Satellite Imager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Imager</em>'.
	 * @generated
	 */
	SatelliteImager createSatelliteImager();

	/**
	 * Returns a new object of class '<em>Orbital Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbital Image</em>'.
	 * @generated
	 */
	OrbitalImage createOrbitalImage();

	/**
	 * Returns a new object of class '<em>Satellite Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Constellation</em>'.
	 * @generated
	 */
	SatelliteConstellation createSatelliteConstellation();

	/**
	 * Returns a new object of class '<em>Satellite Constellation Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Constellation Initialization Data</em>'.
	 * @generated
	 */
	SatelliteConstellationInitializationData createSatelliteConstellationInitializationData();

	/**
	 * Returns a new object of class '<em>Satellite Constellation Type Api Adapter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Constellation Type Api Adapter</em>'.
	 * @generated
	 */
	SatelliteConstellationTypeApiAdapter createSatelliteConstellationTypeApiAdapter();

	/**
	 * Returns a new object of class '<em>Satellite Initialization Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Initialization Data</em>'.
	 * @generated
	 */
	SatelliteInitializationData createSatelliteInitializationData();

	/**
	 * Returns a new object of class '<em>Satellite Utils</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite Utils</em>'.
	 * @generated
	 */
	SatelliteUtils createSatelliteUtils();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EMFEcoreExampleSatellitePackage getEMFEcoreExampleSatellitePackage();

} //EMFEcoreExampleSatelliteFactory
