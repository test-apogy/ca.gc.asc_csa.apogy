/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage
 * @generated
 */
public interface ApogyExamplesSatelliteFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyExamplesSatelliteFactory eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.impl.ApogyExamplesSatelliteFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Constellation Command Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Command Plan</em>'.
	 * @generated
	 */
	ConstellationCommandPlan createConstellationCommandPlan();

	/**
	 * Returns a new object of class '<em>Constellation Command Plan Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Command Plan Item</em>'.
	 * @generated
	 */
	ConstellationCommandPlanItem createConstellationCommandPlanItem();

	/**
	 * Returns a new object of class '<em>Default Constellation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Constellation</em>'.
	 * @generated
	 */
	DefaultConstellation createDefaultConstellation();

	/**
	 * Returns a new object of class '<em>Constellation Requests List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Requests List</em>'.
	 * @generated
	 */
	ConstellationRequestsList createConstellationRequestsList();

	/**
	 * Returns a new object of class '<em>Image Constellation Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Image Constellation Request</em>'.
	 * @generated
	 */
	ImageConstellationRequest createImageConstellationRequest();

	/**
	 * Returns a new object of class '<em>Satellites List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellites List</em>'.
	 * @generated
	 */
	SatellitesList createSatellitesList();

	/**
	 * Returns a new object of class '<em>Satellite</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Satellite</em>'.
	 * @generated
	 */
	Satellite createSatellite();

	/**
	 * Returns a new object of class '<em>Abstract Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Abstract Satellite Command</em>'.
	 * @generated
	 */
	AbstractSatelliteCommand createAbstractSatelliteCommand();

	/**
	 * Returns a new object of class '<em>Acquire Image Satellite Command</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Acquire Image Satellite Command</em>'.
	 * @generated
	 */
	AcquireImageSatelliteCommand createAcquireImageSatelliteCommand();

	/**
	 * Returns a new object of class '<em>Orbital Image</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbital Image</em>'.
	 * @generated
	 */
	OrbitalImage createOrbitalImage();

	/**
	 * Returns a new object of class '<em>Constellation Downlinks List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Downlinks List</em>'.
	 * @generated
	 */
	ConstellationDownlinksList createConstellationDownlinksList();

	/**
	 * Returns a new object of class '<em>Constellation Downlink</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Downlink</em>'.
	 * @generated
	 */
	ConstellationDownlink createConstellationDownlink();

	/**
	 * Returns a new object of class '<em>Orbital Image Constellation Downlink Item</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Orbital Image Constellation Downlink Item</em>'.
	 * @generated
	 */
	OrbitalImageConstellationDownlinkItem createOrbitalImageConstellationDownlinkItem();

	/**
	 * Returns a new object of class '<em>Constellation Utilities</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constellation Utilities</em>'.
	 * @generated
	 */
	ConstellationUtilities createConstellationUtilities();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyExamplesSatellitePackage getApogyExamplesSatellitePackage();

} //ApogyExamplesSatelliteFactory