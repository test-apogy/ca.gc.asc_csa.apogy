/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import ca.gc.asc_csa.apogy.common.emf.Timed;

import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Satellite Command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand()
 * @model
 * @generated
 */
public interface AbstractSatelliteCommand extends GeographicCoordinates, Timed {
	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the {@link Satellite} associated with the {@link AbstractSatelliteCommand}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite</em>' reference.
	 * @see #setSatellite(Satellite)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand_Satellite()
	 * @model
	 * @generated
	 */
	Satellite getSatellite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite <em>Satellite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' reference.
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(Satellite value);

	/**
	 * Returns the value of the '<em><b>Constellation Request</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand <em>Satellite Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the associated {@link AbstractConstellationRequest}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Request</em>' container reference.
	 * @see #setConstellationRequest(AbstractConstellationRequest)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand_ConstellationRequest()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest#getSatelliteCommand
	 * @model opposite="satelliteCommand" transient="false"
	 * @generated
	 */
	AbstractConstellationRequest getConstellationRequest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Request</em>' container reference.
	 * @see #getConstellationRequest()
	 * @generated
	 */
	void setConstellationRequest(AbstractConstellationRequest value);

} // AbstractSatelliteCommand
