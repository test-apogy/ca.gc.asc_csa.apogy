/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getCommandStartTime <em>Command Start Time</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteCommand()
 * @model
 * @generated
 */
public interface SatelliteCommand extends EObject {
	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite</em>' reference.
	 * @see #setSatellite(Satellite)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteCommand_Satellite()
	 * @model
	 * @generated
	 */
	Satellite getSatellite();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getSatellite <em>Satellite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' reference.
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(Satellite value);

	/**
	 * Returns the value of the '<em><b>Command Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command Start Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command Start Time</em>' attribute.
	 * @see #setCommandStartTime(Date)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatelliteCommand_CommandStartTime()
	 * @model unique="false"
	 * @generated
	 */
	Date getCommandStartTime();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.SatelliteCommand#getCommandStartTime <em>Command Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Start Time</em>' attribute.
	 * @see #getCommandStartTime()
	 * @generated
	 */
	void setCommandStartTime(Date value);

} // SatelliteCommand
