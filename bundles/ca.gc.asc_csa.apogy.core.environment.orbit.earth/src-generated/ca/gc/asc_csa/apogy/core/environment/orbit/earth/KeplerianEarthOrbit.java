package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.orekit.orbits.KeplerianOrbit;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Keplerian Earth Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An Earth orbit represented by Keplerian Elements.
 * @see http://en.wikipedia.org/wiki/Orbital_elements
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getSemiMajorAxis <em>Semi Major Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getEccentricity <em>Eccentricity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getInclination <em>Inclination</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getPerigeeArgument <em>Perigee Argument</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getMeanAnomaly <em>Mean Anomaly</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getTrueAnomaly <em>True Anomaly</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit()
 * @model
 * @generated
 */
public interface KeplerianEarthOrbit extends EarthOrbit {
	/**
	 * Returns the value of the '<em><b>Semi Major Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Semi-major axis, in meters
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semi Major Axis</em>' attribute.
	 * @see #setSemiMajorAxis(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_SemiMajorAxis()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='m' propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getSemiMajorAxis();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getSemiMajorAxis <em>Semi Major Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semi Major Axis</em>' attribute.
	 * @see #getSemiMajorAxis()
	 * @generated
	 */
	void setSemiMajorAxis(double value);

	/**
	 * Returns the value of the '<em><b>Eccentricity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eccentricity
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eccentricity</em>' attribute.
	 * @see #setEccentricity(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_Eccentricity()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getEccentricity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getEccentricity <em>Eccentricity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity</em>' attribute.
	 * @see #getEccentricity()
	 * @generated
	 */
	void setEccentricity(double value);

	/**
	 * Returns the value of the '<em><b>Inclination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Inclination, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclination</em>' attribute.
	 * @see #setInclination(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_Inclination()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad' propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getInclination();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getInclination <em>Inclination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclination</em>' attribute.
	 * @see #getInclination()
	 * @generated
	 */
	void setInclination(double value);

	/**
	 * Returns the value of the '<em><b>Perigee Argument</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Argument of perigee, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Perigee Argument</em>' attribute.
	 * @see #setPerigeeArgument(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_PerigeeArgument()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad' propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getPerigeeArgument();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getPerigeeArgument <em>Perigee Argument</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Perigee Argument</em>' attribute.
	 * @see #getPerigeeArgument()
	 * @generated
	 */
	void setPerigeeArgument(double value);

	/**
	 * Returns the value of the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Right ascension of ascending node, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Ascention Of Ascending Node</em>' attribute.
	 * @see #setRightAscentionOfAscendingNode(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_RightAscentionOfAscendingNode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad' propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getRightAscentionOfAscendingNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ascention Of Ascending Node</em>' attribute.
	 * @see #getRightAscentionOfAscendingNode()
	 * @generated
	 */
	void setRightAscentionOfAscendingNode(double value);

	/**
	 * Returns the value of the '<em><b>Mean Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mean anomaly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Anomaly</em>' attribute.
	 * @see #setMeanAnomaly(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_MeanAnomaly()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getMeanAnomaly();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getMeanAnomaly <em>Mean Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Anomaly</em>' attribute.
	 * @see #getMeanAnomaly()
	 * @generated
	 */
	void setMeanAnomaly(double value);

	/**
	 * Returns the value of the '<em><b>True Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * True anomaly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Anomaly</em>' attribute.
	 * @see #setTrueAnomaly(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getKeplerianEarthOrbit_TrueAnomaly()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='KEPLER_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getTrueAnomaly();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.KeplerianEarthOrbit#getTrueAnomaly <em>True Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Anomaly</em>' attribute.
	 * @see #getTrueAnomaly()
	 * @generated
	 */
	void setTrueAnomaly(double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the underlying OreKit KeplerianOrbit.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitKeplerianOrbit" unique="false"
	 * @generated
	 */
	KeplerianOrbit getOreKitKeplerianOrbit();

} // KeplerianEarthOrbit
