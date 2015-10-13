/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Surface Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines a location on the surface of the Earth.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation#getGeographicalCoordinates <em>Geographical Coordinates</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthSurfaceLocation()
 * @model
 * @generated
 */
public interface EarthSurfaceLocation extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Geographical Coordinates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Geographical Coordinates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Geographical Coordinates</em>' containment reference.
	 * @see #setGeographicalCoordinates(GeographicCoordinates)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthSurfaceLocation_GeographicalCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	GeographicCoordinates getGeographicalCoordinates();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation#getGeographicalCoordinates <em>Geographical Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geographical Coordinates</em>' containment reference.
	 * @see #getGeographicalCoordinates()
	 * @generated
	 */
	void setGeographicalCoordinates(GeographicCoordinates value);

} // EarthSurfaceLocation
