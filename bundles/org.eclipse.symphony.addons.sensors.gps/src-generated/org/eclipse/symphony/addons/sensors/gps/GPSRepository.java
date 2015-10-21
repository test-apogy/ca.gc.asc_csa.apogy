/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.sensors.gps;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GPS Repository</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.sensors.gps.GPSRepository#getGpsDevices <em>Gps Devices</em>}</li>
 * </ul>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void scanForDevices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" gpsIdUnique="false"
	 * @generated
	 */
	GPS getGPSById(String gpsId);

} // GPSRepository