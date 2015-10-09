/**
 * <copyright>
 * </copyright>
 *
 * $Id: GPSRepository.java,v 1.3.4.2 2015/05/21 15:49:51 pallard Exp $
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>GPS Repository</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGpsDevices <em>Gps Devices</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSRepository()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface GPSRepository extends EObject {

	/**
	 * Returns the value of the '<em><b>Gps Devices</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.sensors.gps.GPS}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gps Devices</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gps Devices</em>' reference list.
	 * @see org.eclipse.symphony.addons.sensors.gps.GpsPackage#getGPSRepository_GpsDevices()
	 * @model
	 * @generated
	 */
	EList<GPS> getGpsDevices();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void scanForDevices();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	GPS getGPSById(String id);

} // GPSRepository
