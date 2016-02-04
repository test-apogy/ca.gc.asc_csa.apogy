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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a Two-Line Elements orbit and propagation definition.
 * @see http://en.wikipedia.org/wiki/Two-line_element_set
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine1 <em>Line1</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine2 <em>Line2</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getBStar <em>BStar</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEpoch <em>Epoch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEccentricity <em>Eccentricity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getElementNumber <em>Element Number</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEphemerisType <em>Ephemeris Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getInclination <em>Inclination</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanAnomaly <em>Mean Anomaly</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotion <em>Mean Motion</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionPerDay <em>Revolution Per Day</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionFirstDerivative <em>Mean Motion First Derivative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionSecondDerivative <em>Mean Motion Second Derivative</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getArgumentOfPerigee <em>Argument Of Perigee</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionNumberAtEpoch <em>Revolution Number At Epoch</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSatelliteNumber <em>Satellite Number</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE()
 * @model
 * @generated
 */
public interface TLE extends EObject {

	/**
	 * Returns the value of the '<em><b>Line1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The first line of the TLE in text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line1</em>' attribute.
	 * @see #setLine1(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_Line1()
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getLine1();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine1 <em>Line1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line1</em>' attribute.
	 * @see #getLine1()
	 * @generated
	 */
	void setLine1(String value);

	/**
	 * Returns the value of the '<em><b>Line2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The second line of the TLE in text form.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line2</em>' attribute.
	 * @see #setLine2(String)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_Line2()
	 * @model unique="false" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' propertyCategory='TLE_RAW_DATA' notify='true'"
	 * @generated
	 */
	String getLine2();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getLine2 <em>Line2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line2</em>' attribute.
	 * @see #getLine2()
	 * @generated
	 */
	void setLine2(String value);

	/**
	 * Returns the value of the '<em><b>Ephemeris Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Ephemeris type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ephemeris Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType
	 * @see #setEphemerisType(EphemerisType)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_EphemerisType()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	EphemerisType getEphemerisType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEphemerisType <em>Ephemeris Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ephemeris Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType
	 * @see #getEphemerisType()
	 * @generated
	 */
	void setEphemerisType(EphemerisType value);

	/**
	 * Returns the value of the '<em><b>Inclination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inclination.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inclination</em>' attribute.
	 * @see #setInclination(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_Inclination()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getInclination();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getInclination <em>Inclination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inclination</em>' attribute.
	 * @see #getInclination()
	 * @generated
	 */
	void setInclination(double value);

	/**
	 * Returns the value of the '<em><b>Mean Anomaly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean anomaly.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Anomaly</em>' attribute.
	 * @see #setMeanAnomaly(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_MeanAnomaly()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getMeanAnomaly();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanAnomaly <em>Mean Anomaly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Anomaly</em>' attribute.
	 * @see #getMeanAnomaly()
	 * @generated
	 */
	void setMeanAnomaly(double value);

	/**
	 * Returns the value of the '<em><b>Mean Motion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean motion.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Motion</em>' attribute.
	 * @see #setMeanMotion(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_MeanMotion()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad/s' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getMeanMotion();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotion <em>Mean Motion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Motion</em>' attribute.
	 * @see #getMeanMotion()
	 * @generated
	 */
	void setMeanMotion(double value);

	/**
	 * Returns the value of the '<em><b>Revolution Per Day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean motion, expressed as revolution per day.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revolution Per Day</em>' attribute.
	 * @see #setRevolutionPerDay(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_RevolutionPerDay()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rev/day' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getRevolutionPerDay();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionPerDay <em>Revolution Per Day</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revolution Per Day</em>' attribute.
	 * @see #getRevolutionPerDay()
	 * @generated
	 */
	void setRevolutionPerDay(double value);

	/**
	 * Returns the value of the '<em><b>Mean Motion First Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean motion first derivative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Motion First Derivative</em>' attribute.
	 * @see #setMeanMotionFirstDerivative(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_MeanMotionFirstDerivative()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad/s\262' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getMeanMotionFirstDerivative();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionFirstDerivative <em>Mean Motion First Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Motion First Derivative</em>' attribute.
	 * @see #getMeanMotionFirstDerivative()
	 * @generated
	 */
	void setMeanMotionFirstDerivative(double value);

	/**
	 * Returns the value of the '<em><b>Mean Motion Second Derivative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mean motion second derivative.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mean Motion Second Derivative</em>' attribute.
	 * @see #setMeanMotionSecondDerivative(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_MeanMotionSecondDerivative()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad/s\263' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getMeanMotionSecondDerivative();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getMeanMotionSecondDerivative <em>Mean Motion Second Derivative</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mean Motion Second Derivative</em>' attribute.
	 * @see #getMeanMotionSecondDerivative()
	 * @generated
	 */
	void setMeanMotionSecondDerivative(double value);

	/**
	 * Returns the value of the '<em><b>Argument Of Perigee</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The argument of perigee.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Argument Of Perigee</em>' attribute.
	 * @see #setArgumentOfPerigee(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_ArgumentOfPerigee()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' apogy_units='rad' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getArgumentOfPerigee();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getArgumentOfPerigee <em>Argument Of Perigee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Argument Of Perigee</em>' attribute.
	 * @see #getArgumentOfPerigee()
	 * @generated
	 */
	void setArgumentOfPerigee(double value);

	/**
	 * Returns the value of the '<em><b>Right Ascention Of Ascending Node</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Right ascension of ascending node, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Right Ascention Of Ascending Node</em>' attribute.
	 * @see #setRightAscentionOfAscendingNode(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_RightAscentionOfAscendingNode()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' apogy_units='rad' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getRightAscentionOfAscendingNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRightAscentionOfAscendingNode <em>Right Ascention Of Ascending Node</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Ascention Of Ascending Node</em>' attribute.
	 * @see #getRightAscentionOfAscendingNode()
	 * @generated
	 */
	void setRightAscentionOfAscendingNode(double value);

	/**
	 * Returns the value of the '<em><b>Revolution Number At Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The revolution number at epoch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Revolution Number At Epoch</em>' attribute.
	 * @see #setRevolutionNumberAtEpoch(int)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_RevolutionNumberAtEpoch()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	int getRevolutionNumberAtEpoch();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getRevolutionNumberAtEpoch <em>Revolution Number At Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revolution Number At Epoch</em>' attribute.
	 * @see #getRevolutionNumberAtEpoch()
	 * @generated
	 */
	void setRevolutionNumberAtEpoch(int value);

	/**
	 * Returns the value of the '<em><b>Satellite Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The satellite id number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Number</em>' attribute.
	 * @see #setSatelliteNumber(int)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_SatelliteNumber()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
	int getSatelliteNumber();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getSatelliteNumber <em>Satellite Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Number</em>' attribute.
	 * @see #getSatelliteNumber()
	 * @generated
	 */
	void setSatelliteNumber(int value);

	/**
	 * Returns the value of the '<em><b>BStar</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ballistic coefficient.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BStar</em>' attribute.
	 * @see #setBStar(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_BStar()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getBStar();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getBStar <em>BStar</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BStar</em>' attribute.
	 * @see #getBStar()
	 * @generated
	 */
	void setBStar(double value);

	/**
	 * Returns the value of the '<em><b>Epoch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epoch</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The epoch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Epoch</em>' attribute.
	 * @see #setEpoch(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_Epoch()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	Date getEpoch();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEpoch <em>Epoch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epoch</em>' attribute.
	 * @see #getEpoch()
	 * @generated
	 */
	void setEpoch(Date value);

	/**
	 * Returns the value of the '<em><b>Eccentricity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eccentricity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The eccentricity.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eccentricity</em>' attribute.
	 * @see #setEccentricity(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_Eccentricity()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true' propertyCategory='TLE_ORBITAL_PARAMETERS'"
	 * @generated
	 */
	double getEccentricity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getEccentricity <em>Eccentricity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eccentricity</em>' attribute.
	 * @see #getEccentricity()
	 * @generated
	 */
	void setEccentricity(double value);

	/**
	 * Returns the value of the '<em><b>Element Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The element number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Number</em>' attribute.
	 * @see #setElementNumber(int)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getTLE_ElementNumber()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	int getElementNumber();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE#getElementNumber <em>Element Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Number</em>' attribute.
	 * @see #getElementNumber()
	 * @generated
	 */
	void setElementNumber(int value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the OreKit implementation backing this TLE.
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitTLE" unique="false" exceptions="ca.gc.asc_csa.apogy.core.environment.orbit.earth.Exception"
	 * @generated
	 */
	org.orekit.propagation.analytical.tle.TLE getOreKitTLE() throws Exception;
} // TLE
