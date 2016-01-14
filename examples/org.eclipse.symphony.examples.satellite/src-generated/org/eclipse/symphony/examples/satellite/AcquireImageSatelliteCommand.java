/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Acquire Image Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Satellite Command to Acquire OrbitalImage
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.AcquireImageSatelliteCommand#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAcquireImageSatelliteCommand()
 * @model
 * @generated
 */
public interface AcquireImageSatelliteCommand extends AbstractSatelliteCommand {
	/**
	 * Returns the value of the '<em><b>Roll Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite is nadir looking, and can roll back and forth (+- X degrees) along its trajectory.
	 * An imager is mounted on its nadir axis and can take images of the Earth below.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roll Angle</em>' attribute.
	 * @see #setRollAngle(double)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getAcquireImageSatelliteCommand_RollAngle()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getRollAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.AcquireImageSatelliteCommand#getRollAngle <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Angle</em>' attribute.
	 * @see #getRollAngle()
	 * @generated
	 */
	void setRollAngle(double value);

} // AcquireImageSatelliteCommand
