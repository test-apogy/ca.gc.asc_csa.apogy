/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import org.eclipse.symphony.core.environment.orbit.OrbitWorksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a worksite in orbit. The reference frame used is inertial (J2000), with its origin at the current orbital position.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations <em>Earth Locations</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite()
 * @model
 * @generated
 */
public interface EarthOrbitWorksite extends OrbitWorksite {

	/**
	 * Returns the value of the '<em><b>Sky</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sky</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sky</em>' containment reference.
	 * @see #setSky(EarthOrbitSky)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite_Sky()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite
	 * @model opposite="earthOrbitWorksite" containment="true" required="true"
	 * @generated
	 */
	EarthOrbitSky getSky();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sky</em>' containment reference.
	 * @see #getSky()
	 * @generated
	 */
	void setSky(EarthOrbitSky value);

	/**
	 * Returns the value of the '<em><b>Earth Locations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Earth Locations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of surface location associated with the site.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Locations</em>' containment reference.
	 * @see #setEarthLocations(EarthSurfaceLocationList)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage#getEarthOrbitWorksite_EarthLocations()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	EarthSurfaceLocationList getEarthLocations();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getEarthLocations <em>Earth Locations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Locations</em>' containment reference.
	 * @see #getEarthLocations()
	 * @generated
	 */
	void setEarthLocations(EarthSurfaceLocationList value);
} // EarthOrbitWorksite
