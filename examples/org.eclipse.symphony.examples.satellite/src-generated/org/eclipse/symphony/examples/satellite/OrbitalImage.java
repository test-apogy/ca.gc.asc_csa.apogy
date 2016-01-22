/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import org.eclipse.symphony.common.images.EImage;
import org.eclipse.symphony.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbital Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an orbital image.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getRollAngle <em>Roll Angle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getOrbitalImage()
 * @model
 * @generated
 */
public interface OrbitalImage extends EImage {
	/**
	 * Returns the value of the '<em><b>Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates</em>' containment reference.
	 * @see #setCoordinates(GeographicCoordinates)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getOrbitalImage_Coordinates()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GeographicCoordinates getCoordinates();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getCoordinates <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinates</em>' containment reference.
	 * @see #getCoordinates()
	 * @generated
	 */
	void setCoordinates(GeographicCoordinates value);

	/**
	 * Returns the value of the '<em><b>Roll Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roll Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roll Angle</em>' attribute.
	 * @see #setRollAngle(double)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getOrbitalImage_RollAngle()
	 * @model default="0.0" unique="false"
	 * @generated
	 */
	double getRollAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.OrbitalImage#getRollAngle <em>Roll Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Roll Angle</em>' attribute.
	 * @see #getRollAngle()
	 * @generated
	 */
	void setRollAngle(double value);

} // OrbitalImage
