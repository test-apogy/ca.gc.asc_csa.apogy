/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.core.environment.orbit.earth.GroundStation;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Constellation Initialization Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Initialization Data representing the state of of a SatelliteConstellation.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getSatelliteData <em>Satellite Data</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellationInitializationData#getPendingImageOrders <em>Pending Image Orders</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteConstellationInitializationData()
 * @model
 * @generated
 */
public interface SatelliteConstellationInitializationData extends AbstractInitializationData {

	/**
	 * Returns the value of the '<em><b>Satellite Data</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.SatelliteInitializationData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite Data</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteConstellationInitializationData_SatelliteData()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' createChild='true'"
	 * @generated
	 */
	EList<SatelliteInitializationData> getSatelliteData();

	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ground Stations</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteConstellationInitializationData_GroundStations()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' createChild='true'"
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

	/**
	 * Returns the value of the '<em><b>Pending Image Orders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.ImageOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Image Orders</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Image Orders</em>' containment reference list.
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteConstellationInitializationData_PendingImageOrders()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' createChild='true'"
	 * @generated
	 */
	EList<ImageOrder> getPendingImageOrders();
} // SatelliteConstellationInitializationData
