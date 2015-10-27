/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite;

import java.util.List;

import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An example satellite. The satellite is nadir looking, and can roll back and forth (+- 5.0 deg) along its trajectory.
 * An imager is mounted on its nadir axis and can take images of the Earth below.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.Satellite#getImager <em>Imager</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellite()
 * @model abstract="true"
 * @generated
 */
public interface Satellite extends Named {

	/**
	 * Returns the value of the '<em><b>Maximum Roll Rate</b></em>' attribute.
	 * The default value is <code>"0.017452778"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite maximum roll rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Roll Rate</em>' attribute.
	 * @see #setMaximumRollRate(double)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellite_MaximumRollRate()
	 * @model default="0.017452778" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s'"
	 * @generated
	 */
	double getMaximumRollRate();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRollRate <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Roll Rate</em>' attribute.
	 * @see #getMaximumRollRate()
	 * @generated
	 */
	void setMaximumRollRate(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Roll</b></em>' attribute.
	 * The default value is <code>"0.087"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite maximum roll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Maximum Roll</em>' attribute.
	 * @see #setMaximumRoll(double)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellite_MaximumRoll()
	 * @model default="0.087" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	double getMaximumRoll();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.Satellite#getMaximumRoll <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Roll</em>' attribute.
	 * @see #getMaximumRoll()
	 * @generated
	 */
	void setMaximumRoll(double value);

	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Orbit Model defining this satellite orbit around the Earth.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' containment reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellite_OrbitModel()
	 * @model containment="true"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.Satellite#getOrbitModel <em>Orbit Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' containment reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Imager</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.examples.satellite.SatelliteImager#getSatellite <em>Satellite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imager</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The imager on-board the satellite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Imager</em>' containment reference.
	 * @see #setImager(SatelliteImager)
	 * @see org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage#getSatellite_Imager()
	 * @see org.eclipse.symphony.examples.satellite.SatelliteImager#getSatellite
	 * @model opposite="satellite" containment="true"
	 * @generated
	 */
	SatelliteImager getImager();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.satellite.Satellite#getImager <em>Imager</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Imager</em>' containment reference.
	 * @see #getImager()
	 * @generated
	 */
	void setImager(SatelliteImager value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the spacecraft to roll to the specified roll angle, in radians.
	 * <!-- end-model-doc -->
	 * @model unique="false" targetRollAngleUnique="false"
	 * @generated
	 */
	boolean roll(double targetRollAngle);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the spacecraft to acquire an image with a given zoom.
	 * <!-- end-model-doc -->
	 * @model unique="false" zoomUnique="false"
	 * @generated
	 */
	OrbitalImage acquireImage(double zoom);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the spacecraft to download a number of OrbitalImage.
	 * <!-- end-model-doc -->
	 * @model dataType="org.eclipse.symphony.examples.satellite.List<org.eclipse.symphony.examples.satellite.OrbitalImage>" unique="false" many="false" maximumNumberOfImagesUnique="false"
	 * @generated
	 */
	List<OrbitalImage> downloadImages(int maximumNumberOfImages);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Enqueues a command for future execution.
	 * <!-- end-model-doc -->
	 * @model unique="false" commandUnique="false"
	 * @generated
	 */
	boolean enqueueSatelliteCommand(SatelliteCommand command);
} // Satellite
