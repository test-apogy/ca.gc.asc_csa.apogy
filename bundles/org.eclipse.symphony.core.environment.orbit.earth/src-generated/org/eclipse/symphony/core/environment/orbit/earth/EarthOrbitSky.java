/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth;

import ca.gc.asc_csa.symphony.environment.Earth;
import ca.gc.asc_csa.symphony.environment.Moon;
import ca.gc.asc_csa.symphony.environment.Sky;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth Orbit Sky</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Defines the Sky as seen from an EarthOrbitWorksite.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getMoon <em>Moon</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getEarth <em>Earth</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitSky()
 * @model
 * @generated
 */
public interface EarthOrbitSky extends Sky {
	/**
	 * Returns the value of the '<em><b>Earth Orbit Worksite</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getSky <em>Sky</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The worksite to which the sky is associated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth Orbit Worksite</em>' container reference.
	 * @see #setEarthOrbitWorksite(EarthOrbitWorksite)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitSky_EarthOrbitWorksite()
	 * @see org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitWorksite#getSky
	 * @model opposite="sky" transient="false"
	 * @generated
	 */
	EarthOrbitWorksite getEarthOrbitWorksite();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.EarthOrbitSky#getEarthOrbitWorksite <em>Earth Orbit Worksite</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Earth Orbit Worksite</em>' container reference.
	 * @see #getEarthOrbitWorksite()
	 * @generated
	 */
	void setEarthOrbitWorksite(EarthOrbitWorksite value);

	/**
	 * Returns the value of the '<em><b>Moon</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Moon in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Moon</em>' reference.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitSky_Moon()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON'"
	 * @generated
	 */
	Moon getMoon();

	/**
	 * Returns the value of the '<em><b>Earth</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Earth in the sky.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Earth</em>' reference.
	 * @see org.eclipse.symphony.core.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage#getEarthOrbitSky_Earth()
	 * @model transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EARTH'"
	 * @generated
	 */
	Earth getEarth();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Moon angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='MOON' csa_units='rad'"
	 * @generated
	 */
	double getMoonAngularDiameter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the Earth angular diameter, in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='EARTH' csa_units='rad'"
	 * @generated
	 */
	double getEarthAngularDiameter();

} // EarthOrbitSky
