/**
 * <copyright>
 * </copyright>
 *
 * $Id: GpsFactory.java,v 1.4.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage
 * @generated
 */
public interface GpsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GpsFactory eINSTANCE = org.eclipse.symphony.addons.sensors.gps.impl.GpsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>GPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS</em>'.
	 * @generated
	 */
	GPS createGPS();

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
	 * Returns a new object of class '<em>GPS Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>GPS Facade</em>'.
	 * @generated
	 */
	GPSFacade createGPSFacade();

	/**
	 * Returns a new object of class '<em>Marked GPS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marked GPS</em>'.
	 * @generated
	 */
	MarkedGPS createMarkedGPS();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GpsPackage getGpsPackage();

} //GpsFactory
