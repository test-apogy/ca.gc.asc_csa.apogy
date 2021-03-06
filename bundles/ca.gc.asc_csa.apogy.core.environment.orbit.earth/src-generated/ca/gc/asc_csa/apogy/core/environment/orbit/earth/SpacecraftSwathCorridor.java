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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.core.Updatable;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Swath Corridor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getEndTime <em>End Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getLeftSwathAngle <em>Left Swath Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getRightSwathAngle <em>Right Swath Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getCorridor <em>Corridor</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor()
 * @model
 * @generated
 */
public interface SpacecraftSwathCorridor extends Named, Described, Updatable {
	/**
	 * Returns the value of the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The start time of the prediction period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Time</em>' attribute.
	 * @see #setStartTime(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_StartTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='TIME_PERIOD'"
	 * @generated
	 */
	Date getStartTime();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getStartTime <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Time</em>' attribute.
	 * @see #getStartTime()
	 * @generated
	 */
	void setStartTime(Date value);

	/**
	 * Returns the value of the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The end time of the prediction period.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Time</em>' attribute.
	 * @see #setEndTime(Date)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_EndTime()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='TIME_PERIOD'"
	 * @generated
	 */
	Date getEndTime();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getEndTime <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Time</em>' attribute.
	 * @see #getEndTime()
	 * @generated
	 */
	void setEndTime(Date value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_TimeInterval()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='TIME_PERIOD' apogy_units='s'"
	 * @generated
	 */
	double getTimeInterval();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(double value);

	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The OrbitModel to use to predict the corridor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_OrbitModel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='ORBIT_MODEL'"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getOrbitModel <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Left Swath Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Left Swath Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left Swath Angle</em>' attribute.
	 * @see #setLeftSwathAngle(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_LeftSwathAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='SWATH' apogy_units='rad'"
	 * @generated
	 */
	double getLeftSwathAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getLeftSwathAngle <em>Left Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left Swath Angle</em>' attribute.
	 * @see #getLeftSwathAngle()
	 * @generated
	 */
	void setLeftSwathAngle(double value);

	/**
	 * Returns the value of the '<em><b>Right Swath Angle</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Right Swath Angle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right Swath Angle</em>' attribute.
	 * @see #setRightSwathAngle(double)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_RightSwathAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='SWATH' apogy_units='rad'"
	 * @generated
	 */
	double getRightSwathAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getRightSwathAngle <em>Right Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Swath Angle</em>' attribute.
	 * @see #getRightSwathAngle()
	 * @generated
	 */
	void setRightSwathAngle(double value);

	/**
	 * Returns the value of the '<em><b>Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Corridor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The corridor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Corridor</em>' containment reference.
	 * @see #setCorridor(Corridor)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getSpacecraftSwathCorridor_Corridor()
	 * @model containment="true"
	 * @generated
	 */
	Corridor getCorridor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftSwathCorridor#getCorridor <em>Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Corridor</em>' containment reference.
	 * @see #getCorridor()
	 * @generated
	 */
	void setCorridor(Corridor value);

} // SpacecraftSwathCorridor
