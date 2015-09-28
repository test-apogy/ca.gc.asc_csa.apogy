/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite;

import ca.gc.space.mrt.sensors.imaging.AbstractCamera;
import ca.gc.space.mrt.sensors.imaging.Zoomable;
import java.util.List;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Satellite Imager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A specialization of AbstractCamera that is a camera mounted on a satellite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteImager#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteImager#getImagesAcquired <em>Images Acquired</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteImager()
 * @model
 * @generated
 */
public interface SatelliteImager extends AbstractCamera, Zoomable {
	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.Satellite#getImager <em>Imager</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Satellite</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Satellite</em>' container reference.
	 * @see #setSatellite(Satellite)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteImager_Satellite()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.Satellite#getImager
	 * @model opposite="imager" transient="false"
	 * @generated
	 */
	Satellite getSatellite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.SatelliteImager#getSatellite <em>Satellite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' container reference.
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(Satellite value);

	/**
	 * Returns the value of the '<em><b>Images Acquired</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.OrbitalImage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images Acquired</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * List of images stored on-board the imager. Note that when the maximum number of image has been acquired,
	 * further takeImageSnapshot command will be rejected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Images Acquired</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.EMFEcoreExampleSatellitePackage#getSatelliteImager_ImagesAcquired()
	 * @model containment="true" upper="10"
	 * @generated
	 */
	EList<OrbitalImage> getImagesAcquired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Command that downloads a specified number of images.
	 * @param maximumNumberOfImages The maximum number of images to download.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.List<ca.gc.asc_csa.eclipse.emf.ecore.examples.satellite.OrbitalImage>" unique="false" many="false" maximumNumberOfImagesUnique="false"
	 * @generated
	 */
	List<OrbitalImage> downloadImages(int maximumNumberOfImages);

} // SatelliteImager
