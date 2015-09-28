/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.ui;

import ca.gc.asc_csa.eclipse.emf.ecore.Timed;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SpacecraftSwathCorridor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Swath World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getLeftSwathAngle <em>Left Swath Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getRightSwathAngle <em>Right Swath Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardSpacecraftSwathCorridor <em>Forward Spacecraft Swath Corridor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardSpacecraftSwathCorridor <em>Backward Spacecraft Swath Corridor</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer()
 * @model
 * @generated
 */
public interface SpacecraftSwathWorldWindLayer extends AbstractWorldWindLayer {
	/**
	 * Returns the value of the '<em><b>Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The orbit model.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Orbit Model</em>' reference.
	 * @see #setOrbitModel(OrbitModel)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_OrbitModel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='ORBIT_MODEL'"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getOrbitModel <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Orbit Model</em>' reference.
	 * @see #getOrbitModel()
	 * @generated
	 */
	void setOrbitModel(OrbitModel value);

	/**
	 * Returns the value of the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time source to used to get the time used to define the reference time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Source</em>' reference.
	 * @see #setTimeSource(Timed)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_TimeSource()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME'"
	 * @generated
	 */
	Timed getTimeSource();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeSource <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Source</em>' reference.
	 * @see #getTimeSource()
	 * @generated
	 */
	void setTimeSource(Timed value);

	/**
	 * Returns the value of the '<em><b>Forward Propagation Duration</b></em>' attribute.
	 * The default value is <code>"43200.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The forward propagation duration from the current time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Forward Propagation Duration</em>' attribute.
	 * @see #setForwardPropagationDuration(double)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_ForwardPropagationDuration()
	 * @model default="43200.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME_PERIOD' csa_units='s'"
	 * @generated
	 */
	double getForwardPropagationDuration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Propagation Duration</em>' attribute.
	 * @see #getForwardPropagationDuration()
	 * @generated
	 */
	void setForwardPropagationDuration(double value);

	/**
	 * Returns the value of the '<em><b>Backward Propagation Duration</b></em>' attribute.
	 * The default value is <code>"43200.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The backward propagation duration from the current time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Backward Propagation Duration</em>' attribute.
	 * @see #setBackwardPropagationDuration(double)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_BackwardPropagationDuration()
	 * @model default="43200.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME_PERIOD' csa_units='s'"
	 * @generated
	 */
	double getBackwardPropagationDuration();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backward Propagation Duration</em>' attribute.
	 * @see #getBackwardPropagationDuration()
	 * @generated
	 */
	void setBackwardPropagationDuration(double value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * The default value is <code>"600.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval at which to show the position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(double)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_TimeInterval()
	 * @model default="600.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='TIME_PERIOD' property='Editable' csa_units='s'"
	 * @generated
	 */
	double getTimeInterval();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(double value);

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
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_LeftSwathAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='SWATH' csa_units='rad'"
	 * @generated
	 */
	double getLeftSwathAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getLeftSwathAngle <em>Left Swath Angle</em>}' attribute.
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
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_RightSwathAngle()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='SWATH' csa_units='rad'"
	 * @generated
	 */
	double getRightSwathAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getRightSwathAngle <em>Right Swath Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right Swath Angle</em>' attribute.
	 * @see #getRightSwathAngle()
	 * @generated
	 */
	void setRightSwathAngle(double value);

	/**
	 * Returns the value of the '<em><b>Show Ground Trace</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to display the orbit projected on the ground.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Ground Trace</em>' attribute.
	 * @see #setShowGroundTrace(boolean)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_ShowGroundTrace()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='VISUALS' property='Editable'"
	 * @generated
	 */
	boolean isShowGroundTrace();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Ground Trace</em>' attribute.
	 * @see #isShowGroundTrace()
	 * @generated
	 */
	void setShowGroundTrace(boolean value);

	/**
	 * Returns the value of the '<em><b>Forward Spacecraft Swath Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Forward Spacecraft Swath Corridor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Forward Spacecraft Swath Corridor</em>' containment reference.
	 * @see #setForwardSpacecraftSwathCorridor(SpacecraftSwathCorridor)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_ForwardSpacecraftSwathCorridor()
	 * @model containment="true"
	 * @generated
	 */
	SpacecraftSwathCorridor getForwardSpacecraftSwathCorridor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getForwardSpacecraftSwathCorridor <em>Forward Spacecraft Swath Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Forward Spacecraft Swath Corridor</em>' containment reference.
	 * @see #getForwardSpacecraftSwathCorridor()
	 * @generated
	 */
	void setForwardSpacecraftSwathCorridor(SpacecraftSwathCorridor value);

	/**
	 * Returns the value of the '<em><b>Backward Spacecraft Swath Corridor</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Backward Spacecraft Swath Corridor</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Backward Spacecraft Swath Corridor</em>' containment reference.
	 * @see #setBackwardSpacecraftSwathCorridor(SpacecraftSwathCorridor)
	 * @see ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getSpacecraftSwathWorldWindLayer_BackwardSpacecraftSwathCorridor()
	 * @model containment="true"
	 * @generated
	 */
	SpacecraftSwathCorridor getBackwardSpacecraftSwathCorridor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.environment.orbit.earth.ui.SpacecraftSwathWorldWindLayer#getBackwardSpacecraftSwathCorridor <em>Backward Spacecraft Swath Corridor</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backward Spacecraft Swath Corridor</em>' containment reference.
	 * @see #getBackwardSpacecraftSwathCorridor()
	 * @generated
	 */
	void setBackwardSpacecraftSwathCorridor(SpacecraftSwathCorridor value);

} // SpacecraftSwathWorldWindLayer
