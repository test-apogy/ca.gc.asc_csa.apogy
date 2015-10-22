/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Command Roll</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.SatelliteCommandRoll#getTargetRollAngle <em>Target Roll Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandRoll()
 * @model
 * @generated
 */
public interface SatelliteCommandRoll extends SatelliteCommand {
	/**
	 * Returns the value of the '<em><b>Target Roll Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Roll Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Roll Angle</em>' attribute.
	 * @see #setTargetRollAngle(double)
	 * @see org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteCommandRoll_TargetRollAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double getTargetRollAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.SatelliteCommandRoll#getTargetRollAngle <em>Target Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Roll Angle</em>' attribute.
	 * @see #getTargetRollAngle()
	 * @generated
	 */
	void setTargetRollAngle(double value);

} // SatelliteCommandRoll
