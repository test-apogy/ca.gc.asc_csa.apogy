package ca.gc.asc_csa.apogy.examples.lander.apogy;
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

import ca.gc.asc_csa.apogy.core.ApogyInitializationData;
import ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lander Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class specifies the initialization data that Apogy
 * should be interested in when (re)initializing the PTU dish
 * antenna with the API Adapter (which in this case is
 * {@link ca.gc.asc_csa.apogy.examples.antenna.PTUDishAntennaApogySystemApiAdapter})
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isDisposed <em>Disposed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isFlyingEnabled <em>Flying Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegAExtension <em>Leg AExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegBExtension <em>Leg BExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegCExtension <em>Leg CExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getCurrThrustLevel <em>Curr Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getMinThrustLevel <em>Min Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getMaxThrustLevel <em>Max Thrust Level</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData()
 * @model
 * @generated
 */
public interface LanderData extends ApogyInitializationData {
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isInitialized <em>Initialized</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isDisposed <em>Disposed</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_FlyingEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	boolean isFlyingEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#isFlyingEnabled <em>Flying Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flying Enabled</em>' attribute.
	 * @see #isFlyingEnabled()
	 * @generated
	 */
	void setFlyingEnabled(boolean value);

	/**
	 * Returns the value of the '<em><b>Leg AExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg AExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see #setLegAExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_LegAExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegAExtension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegAExtension <em>Leg AExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg AExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see #getLegAExtension()
	 * @generated
	 */
	void setLegAExtension(LanderLegExtension value);

	/**
	 * Returns the value of the '<em><b>Leg BExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg BExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see #setLegBExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_LegBExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegBExtension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegBExtension <em>Leg BExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg BExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see #getLegBExtension()
	 * @generated
	 */
	void setLegBExtension(LanderLegExtension value);

	/**
	 * Returns the value of the '<em><b>Leg CExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the extension position for the lander's
	 * leg C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg CExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
	 * @see #setLegCExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_LegCExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Legs'"
	 * @generated
	 */
	LanderLegExtension getLegCExtension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getLegCExtension <em>Leg CExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg CExtension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.examples.lander.LanderLegExtension
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_CurrThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getCurrThrustLevel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getCurrThrustLevel <em>Curr Thrust Level</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_MinThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getMinThrustLevel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getMinThrustLevel <em>Min Thrust Level</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_MaxThrustLevel()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='N' children='false' notify='true' property='Editable' propertyCategory='Flight'"
	 * @generated
	 */
	double getMaxThrustLevel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getMaxThrustLevel <em>Max Thrust Level</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_XAngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getXAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.examples.lander.apogy.ApogyExamplesLanderApogyPackage#getLanderData_YAngularVelocity()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='rad/s' children='false' notify='true' property='Editable' propertyCategory='Velocities'"
	 * @generated
	 */
	double getYAngularVelocity();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.lander.apogy.LanderData#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #getYAngularVelocity()
	 * @generated
	 */
	void setYAngularVelocity(double value);

} // LanderData
