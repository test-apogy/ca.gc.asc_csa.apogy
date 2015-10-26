/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package org.eclipse.symphony.examples.lander.symphony;

import org.eclipse.symphony.core.SymphonyInitializationData;
import org.eclipse.symphony.examples.lander.LanderLegExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lander Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the initialization data that Symphony
 * should be interested in when (re)initializing the PTU dish
 * antenna with the API Adapter (which in this case is
 * {@link org.eclipse.symphony.examples.antenna.PTUDishAntennaSymphonySystemApiAdapter})
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isFlyingEnabled <em>Flying Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegAExtension <em>Leg AExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegBExtension <em>Leg BExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegCExtension <em>Leg CExtension</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getCurrThrustLevel <em>Curr Thrust Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMinThrustLevel <em>Min Thrust Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMaxThrustLevel <em>Max Thrust Level</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData()
 * @model
 * @generated
 */
public interface LanderData extends SymphonyInitializationData {
	/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the lander has been initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Disposed</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the lander has been disposed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

	/**
	 * Returns the value of the '<em><b>Flying Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not flying is permitted for the
	 * lander.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flying Enabled</em>' attribute.
	 * @see #setFlyingEnabled(boolean)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_FlyingEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	boolean isFlyingEnabled();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#isFlyingEnabled <em>Flying Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flying Enabled</em>' attribute.
	 * @see #isFlyingEnabled()
	 * @generated
	 */
	void setFlyingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Leg AExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg AExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #setLegAExtension(LanderLegExtension)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_LegAExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegAExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegAExtension <em>Leg AExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg AExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #getLegAExtension()
	 * @generated
	 */
	void setLegAExtension(LanderLegExtension value);

	/**
	 * Returns the value of the '<em><b>Leg BExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg BExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #setLegBExtension(LanderLegExtension)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_LegBExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegBExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegBExtension <em>Leg BExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg BExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #getLegBExtension()
	 * @generated
	 */
	void setLegBExtension(LanderLegExtension value);

	/**
	 * Returns the value of the '<em><b>Leg CExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg CExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #setLegCExtension(LanderLegExtension)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_LegCExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegCExtension();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getLegCExtension <em>Leg CExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg CExtension</em>' attribute.
	 * @see org.eclipse.symphony.examples.lander.LanderLegExtension
	 * @see #getLegCExtension()
	 * @generated
	 */
	void setLegCExtension(LanderLegExtension value);

	/**
	 * Returns the value of the '<em><b>Curr Thrust Level</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the thrust level (in N) of the lander
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Curr Thrust Level</em>' attribute.
	 * @see #setCurrThrustLevel(double)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_CurrThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getCurrThrustLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getCurrThrustLevel <em>Curr Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curr Thrust Level</em>' attribute.
	 * @see #getCurrThrustLevel()
	 * @generated
	 */
	void setCurrThrustLevel(double value);

	/**
	 * Returns the value of the '<em><b>Min Thrust Level</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the minimum thrust level (in N) of the lander
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Thrust Level</em>' attribute.
	 * @see #setMinThrustLevel(double)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_MinThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getMinThrustLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMinThrustLevel <em>Min Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Thrust Level</em>' attribute.
	 * @see #getMinThrustLevel()
	 * @generated
	 */
	void setMinThrustLevel(double value);

	/**
	 * Returns the value of the '<em><b>Max Thrust Level</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the maximum thrust level (in N) of the lander
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Thrust Level</em>' attribute.
	 * @see #setMaxThrustLevel(double)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_MaxThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getMaxThrustLevel();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getMaxThrustLevel <em>Max Thrust Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Thrust Level</em>' attribute.
	 * @see #getMaxThrustLevel()
	 * @generated
	 */
	void setMaxThrustLevel(double value);

	/**
	 * Returns the value of the '<em><b>XAngular Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angular velocity (in radians / second)
	 * of the lander in the X direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #setXAngularVelocity(double)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_XAngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getXAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #getXAngularVelocity()
	 * @generated
	 */
	void setXAngularVelocity(double value);

	/**
	 * Returns the value of the '<em><b>YAngular Velocity</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angular velocity (in radians / second)
	 * of the lander in the Y direction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #setYAngularVelocity(double)
	 * @see org.eclipse.symphony.examples.lander.symphony.SymphonyExampleLanderPackage#getLanderData_YAngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getYAngularVelocity();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.lander.symphony.LanderData#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #getYAngularVelocity()
	 * @generated
	 */
	void setYAngularVelocity(double value);

} // LanderData
