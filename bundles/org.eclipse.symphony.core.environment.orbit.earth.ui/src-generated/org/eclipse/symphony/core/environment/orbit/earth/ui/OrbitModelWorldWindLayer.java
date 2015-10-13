/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.ui;

import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Model World Wind Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeInterval <em>Time Interval</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowOrbit <em>Show Orbit</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer()
 * @model
 * @generated
 */
public interface OrbitModelWorldWindLayer extends AbstractWorldWindLayer {
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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_OrbitModel()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='ORBIT_MODEL'"
	 * @generated
	 */
	OrbitModel getOrbitModel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getOrbitModel <em>Orbit Model</em>}' reference.
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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_TimeSource()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME'"
	 * @generated
	 */
	Timed getTimeSource();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeSource <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Source</em>' reference.
	 * @see #getTimeSource()
	 * @generated
	 */
	void setTimeSource(Timed value);

	/**
	 * Returns the value of the '<em><b>Time Interval</b></em>' attribute.
	 * The default value is <code>"600.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Interval</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The time interval at which to show the position.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time Interval</em>' attribute.
	 * @see #setTimeInterval(double)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_TimeInterval()
	 * @model default="600.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME_PERIOD' csa_units='s'"
	 * @generated
	 */
	double getTimeInterval();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getTimeInterval <em>Time Interval</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Interval</em>' attribute.
	 * @see #getTimeInterval()
	 * @generated
	 */
	void setTimeInterval(double value);

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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_ForwardPropagationDuration()
	 * @model default="43200.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME_PERIOD' csa_units='s'"
	 * @generated
	 */
	double getForwardPropagationDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getForwardPropagationDuration <em>Forward Propagation Duration</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_BackwardPropagationDuration()
	 * @model default="43200.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='TIME_PERIOD' csa_units='s'"
	 * @generated
	 */
	double getBackwardPropagationDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#getBackwardPropagationDuration <em>Backward Propagation Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Backward Propagation Duration</em>' attribute.
	 * @see #getBackwardPropagationDuration()
	 * @generated
	 */
	void setBackwardPropagationDuration(double value);

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
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_ShowGroundTrace()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='VISUALS' notify='true' property='Editable'"
	 * @generated
	 */
	boolean isShowGroundTrace();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowGroundTrace <em>Show Ground Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Ground Trace</em>' attribute.
	 * @see #isShowGroundTrace()
	 * @generated
	 */
	void setShowGroundTrace(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Orbit</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not to display the orbit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show Orbit</em>' attribute.
	 * @see #setShowOrbit(boolean)
	 * @see org.eclipse.symphony.core.environment.orbit.earth.ui.SymphonyEarthOrbitEnvironmentUIPackage#getOrbitModelWorldWindLayer_ShowOrbit()
	 * @model default="true" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='VISUALS' property='Editable'"
	 * @generated
	 */
	boolean isShowOrbit();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.environment.orbit.earth.ui.OrbitModelWorldWindLayer#isShowOrbit <em>Show Orbit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Orbit</em>' attribute.
	 * @see #isShowOrbit()
	 * @generated
	 */
	void setShowOrbit(boolean value);

} // OrbitModelWorldWindLayer
