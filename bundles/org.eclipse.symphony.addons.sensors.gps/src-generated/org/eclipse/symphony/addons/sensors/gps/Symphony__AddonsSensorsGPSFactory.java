/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.gps.Symphony__AddonsSensorsGPSPackage
 * @generated
 */
public interface Symphony__AddonsSensorsGPSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Symphony__AddonsSensorsGPSFactory eINSTANCE = org.eclipse.symphony.addons.sensors.gps.impl.Symphony__AddonsSensorsGPSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GPS Reading</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Reading</em>'.
	 * @generated
	 */
	GPSReading createGPSReading();

	/**
	 * Returns a new object of class '<em>GPS Pose Sensor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Pose Sensor</em>'.
	 * @generated
	 */
	GPSPoseSensor createGPSPoseSensor();

	/**
	 * Returns a new object of class '<em>GPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS</em>'.
	 * @generated
	 */
	GPS createGPS();

	/**
	 * Returns a new object of class '<em>Marked GPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marked GPS</em>'.
	 * @generated
	 */
	MarkedGPS createMarkedGPS();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	Symphony__AddonsSensorsGPSFacade createSymphony__AddonsSensorsGPSFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Symphony__AddonsSensorsGPSPackage getSymphony__AddonsSensorsGPSPackage();

} //Symphony__AddonsSensorsGPSFactory