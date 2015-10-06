/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Constellation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A class representing a constellation of Satellites. It provides basic queries used to schedule
 * image acquisition and upload/downloads from the satellites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getSatellites <em>Satellites</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getGroundStations <em>Ground Stations</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getPendingImageOrders <em>Pending Image Orders</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation()
 * @model
 * @generated
 */
public interface SatelliteConstellation extends EObject {
	/**
	 * Returns the value of the '<em><b>Satellites</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.Satellite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The list of satellite(s) available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellites</em>' reference list.
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation_Satellites()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' createChild='true'"
	 * @generated
	 */
	EList<Satellite> getSatellites();

	/**
	 * Returns the value of the '<em><b>Ground Stations</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ground Stations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The list of GroundStation used to communicate with the satellite(s).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ground Stations</em>' reference list.
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation_GroundStations()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' createChild='true'"
	 * @generated
	 */
	EList<GroundStation> getGroundStations();

	/**
	 * Returns the value of the '<em><b>Pending Image Orders</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.examples.satellite.ImageOrder}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pending Image Orders</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pending Image Orders</em>' reference list.
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation_PendingImageOrders()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='true' createChild='true'"
	 * @generated
	 */
	EList<ImageOrder> getPendingImageOrders();

	/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation_StartDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getStartDate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

	/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteConstellation_EndDate()
	 * @model unique="false"
	 * @generated
	 */
	Date getEndDate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.SatelliteConstellation#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the satellite associated with the specified OrbitModel.
	 * @param orbitModel The specified OrbitModel.
	 * @return The Satellite associated with the specified OrbitModel, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" orbitModelUnique="false"
	 * @generated
	 */
	Satellite getSatellite(OrbitModel orbitModel);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the visibility passes for a given ImageOrder.
	 * @param imageOrder The ImageOrder that needs imaging.
	 * @param startDate The start date of the period to be queried.
	 * @param endDate The end date of the period to be queried.
	 * @param elevationMask The ElevationMask to be used to determine the visibility of satellites by the surface location.
	 * @return The list of Visibility passes, ordered by start time.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.examples.satellite.SortedSet<ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass>" unique="false" exceptions="org.eclipse.symphony.examples.satellite.Exception" imageOrderUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
	 * @generated
	 */
	SortedSet<VisibilityPass> getTargetPasses(ImageOrder imageOrder, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the Ground Station(s) visibility passes for a given Satellite.
	 * @param satellite The Satellite.
	 * @param startDate The start date of the period to be queried.
	 * @param endDate The end date of the period to be queried.
	 * @param elevationMask The ElevationMask to be used to determine the visibility of satellites by the surface location.
	 * @return The list of Visibility passes, ordered by start time.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.examples.satellite.SortedSet<ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass>" unique="false" exceptions="org.eclipse.symphony.examples.satellite.Exception" satelliteUnique="false" startDateUnique="false" endDateUnique="false" elevationMaskUnique="false"
	 * @generated
	 */
	SortedSet<VisibilityPass> getGroundStationPasses(Satellite satellite, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Using the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s).
	 * <!-- end-model-doc -->
	 * @model unique="false" imageOrdersDataType="org.eclipse.symphony.examples.satellite.List<org.eclipse.symphony.examples.satellite.ImageOrder>" imageOrdersUnique="false" imageOrdersMany="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	SatelliteCommandList plan(List<ImageOrder> imageOrders, Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Using the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s).
	 * <!-- end-model-doc -->
	 * @model unique="false" startDateUnique="false" endDateUnique="false"
	 * @generated
	 */
	SatelliteCommandList plan(Date startDate, Date endDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Using the pending orders and the current satellite(s) state, creates the list of commands that needs to be uploaded to the satellite(s).
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	SatelliteCommandList plan();

} // SatelliteConstellation
