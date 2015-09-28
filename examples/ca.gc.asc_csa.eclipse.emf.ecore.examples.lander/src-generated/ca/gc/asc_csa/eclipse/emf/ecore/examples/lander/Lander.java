/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package ca.gc.asc_csa.eclipse.emf.ecore.examples.lander;

import ca.gc.asc_csa.eclipse.emf.ecore.Disposable;
import ca.gc.asc_csa.symphony.tools.vehicle.Thruster;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lander</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents a four-legged lander,
 * including all of its relevant state information (e.g.
 * position, current leg extensions, etc.) as well as
 * the operations that it can perform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getPosition <em>Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getThruster <em>Thruster</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegAExtension <em>Leg AExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegBExtension <em>Leg BExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegCExtension <em>Leg CExtension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegAPosition <em>Leg APosition</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegBPosition <em>Leg BPosition</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegCPosition <em>Leg CPosition</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getXAngularVelocity <em>XAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getYAngularVelocity <em>YAngular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getMass <em>Mass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getGravitationalPull <em>Gravitational Pull</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingLegs <em>Changing Legs</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingAttitude <em>Changing Attitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingLocation <em>Changing Location</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isFlyingEnabled <em>Flying Enabled</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isDisposed <em>Disposed</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander()
 * @model abstract="true"
 * @generated
 */
public interface Lander extends Disposable
{

  /**
	 * Returns the value of the '<em><b>Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the lander's position in 3D space,
	 * both in terms of Cartesian coordinates as well
	 * as the current 3D orientation of lander (represented
	 * as rotations from the primary axes)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' containment reference.
	 * @see #setPosition(Position)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_Position()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Position'"
	 * @generated
	 */
  Position getPosition();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getPosition <em>Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' containment reference.
	 * @see #getPosition()
	 * @generated
	 */
  void setPosition(Position value);

  /**
	 * Returns the value of the '<em><b>Thruster</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thruster</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the lander's thruster, which controls
	 * the
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Thruster</em>' containment reference.
	 * @see #setThruster(Thruster)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_Thruster()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' propertyCategory='Flight'"
	 * @generated
	 */
	Thruster getThruster();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getThruster <em>Thruster</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thruster</em>' containment reference.
	 * @see #getThruster()
	 * @generated
	 */
	void setThruster(Thruster value);

		/**
	 * Returns the value of the '<em><b>Leg APosition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the current extension position
	 * for the lander's leg A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg APosition</em>' attribute.
	 * @see #setLegAPosition(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegAPosition()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' csa_units='m' propertyCategory='Leg Positions'"
	 * @generated
	 */
  double getLegAPosition();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegAPosition <em>Leg APosition</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg APosition</em>' attribute.
	 * @see #getLegAPosition()
	 * @generated
	 */
  void setLegAPosition(double value);

  /**
	 * Returns the value of the '<em><b>Leg AExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the desired / selected level of
	 * extension for the lander's leg A.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg AExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #setLegAExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegAExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' propertyCategory='Leg Extension Levels'"
	 * @generated
	 */
  LanderLegExtension getLegAExtension();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegAExtension <em>Leg AExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg AExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #getLegAExtension()
	 * @generated
	 */
  void setLegAExtension(LanderLegExtension value);

  /**
	 * Returns the value of the '<em><b>Leg BPosition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the current extension position
	 * for the lander's leg B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg BPosition</em>' attribute.
	 * @see #setLegBPosition(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegBPosition()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' csa_units='m' propertyCategory='Leg Positions'"
	 * @generated
	 */
  double getLegBPosition();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegBPosition <em>Leg BPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg BPosition</em>' attribute.
	 * @see #getLegBPosition()
	 * @generated
	 */
  void setLegBPosition(double value);

  /**
	 * Returns the value of the '<em><b>Leg BExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the desired / selected level of
	 * extension for the lander's leg B.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg BExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #setLegBExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegBExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' propertyCategory='Leg Extension Levels'"
	 * @generated
	 */
  LanderLegExtension getLegBExtension();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegBExtension <em>Leg BExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg BExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #getLegBExtension()
	 * @generated
	 */
  void setLegBExtension(LanderLegExtension value);

  /**
	 * Returns the value of the '<em><b>Leg CPosition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the current extension position
	 * for the lander's leg C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg CPosition</em>' attribute.
	 * @see #setLegCPosition(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegCPosition()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' csa_units='m' propertyCategory='Leg Positions'"
	 * @generated
	 */
  double getLegCPosition();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegCPosition <em>Leg CPosition</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg CPosition</em>' attribute.
	 * @see #getLegCPosition()
	 * @generated
	 */
  void setLegCPosition(double value);

  /**
	 * Returns the value of the '<em><b>Leg CExtension</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the desired / selected level of
	 * extension for the lander's leg C.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Leg CExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #setLegCExtension(LanderLegExtension)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_LegCExtension()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' propertyCategory='Leg Extension Levels'"
	 * @generated
	 */
  LanderLegExtension getLegCExtension();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getLegCExtension <em>Leg CExtension</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Leg CExtension</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.LanderLegExtension
	 * @see #getLegCExtension()
	 * @generated
	 */
  void setLegCExtension(LanderLegExtension value);

  /**
	 * Returns the value of the '<em><b>XAngular Velocity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>XAngular Velocity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the current angular velocity
	 * (in radians per second) of the lander in the X
	 * direction.
	 * <p>
	 * Note: Unlike the traditional definition of angular
	 * velocity as a vector, this is simply a signed scalar;
	 * a positive value is the rotation in the counter-
	 * clockwise direction while a negative value implies the
	 * rotation is in the clockwise direction.  Zero means
	 * there is no rotation.
	 * @see #commandAngularVelocities(double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #setXAngularVelocity(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_XAngularVelocity()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='rad/s' propertyCategory='Velocities'"
	 * @generated
	 */
  double getXAngularVelocity();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getXAngularVelocity <em>XAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XAngular Velocity</em>' attribute.
	 * @see #getXAngularVelocity()
	 * @generated
	 */
  void setXAngularVelocity(double value);

  /**
	 * Returns the value of the '<em><b>YAngular Velocity</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>YAngular Velocity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the current angular velocity
	 * (in radians per second) of the lander in the Y
	 * direction.
	 * <p>
	 * Note: Unlike the traditional definition of angular
	 * velocity as a vector, this is simply a signed scalar;
	 * a positive value is the rotation in the counter-
	 * clockwise direction while a negative value implies the
	 * rotation is in the clockwise direction.  Zero means
	 * there is no rotation.
	 * @see #commandAngularVelocities(double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #setYAngularVelocity(double)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_YAngularVelocity()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' csa_units='rad/s' propertyCategory='Velocities'"
	 * @generated
	 */
  double getYAngularVelocity();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#getYAngularVelocity <em>YAngular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YAngular Velocity</em>' attribute.
	 * @see #getYAngularVelocity()
	 * @generated
	 */
  void setYAngularVelocity(double value);

  /**
	 * Returns the value of the '<em><b>Mass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents the mass of the lander (in kg).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mass</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_Mass()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' csa_units='kg' property='Readonly' propertyCategory='Flight'"
	 * @generated
	 */
	double getMass();

		/**
	 * Returns the value of the '<em><b>Gravitational Pull</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the amount of force (in N) of gravity that is being
	 * imposed upon the lander.
	 * <p>
	 * Recall that that the gravitational force impose on an object
	 * (like a lander) in relation to a celestial body is affected by:
	 * <ul>
	 * 	 <li>the mass of the lander</li>
	 *   <li>the mass of the celestial body the lander is on / above</li>
	 *   <li>the distance between the lander and the body</li>
	 * </ul>
	 * @return The amount of gravitational force (in N) imposed upon the lander
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gravitational Pull</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_GravitationalPull()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' csa_units='N' property='Readonly' propertyCategory='Flight'"
	 * @generated
	 */
	double getGravitationalPull();

		/**
	 * Returns the value of the '<em><b>Flying Enabled</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents whether the lander is currently permitted
	 * to fly.  Just note that this does not necessary mean that
	 * the lander will actually fly; that's dependent on a number
	 * of factors.
	 * @see #startFlying()
	 * @see #stopFlying()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Flying Enabled</em>' attribute.
	 * @see #setFlyingEnabled(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_FlyingEnabled()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Flight'"
	 * @generated
	 */
	boolean isFlyingEnabled();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isFlyingEnabled <em>Flying Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flying Enabled</em>' attribute.
	 * @see #isFlyingEnabled()
	 * @generated
	 */
	void setFlyingEnabled(boolean value);

		/**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents whether or not the lander has been
	 * successfully initialized; initially false.
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isInitialized <em>Initialized</em>}' attribute.
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
	 * This represents whether or not the lander has been
	 * successfully disposed; initially false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Disposed</em>' attribute.
	 * @see #setDisposed(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_Disposed()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isDisposed();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isDisposed <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disposed</em>' attribute.
	 * @see #isDisposed()
	 * @generated
	 */
	void setDisposed(boolean value);

		/**
	 * Returns the value of the '<em><b>Changing Legs</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents whether or not the lander's legs are
	 * currently extending / retracting, as a result of a
	 * commandLegPosition() operation; initially false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changing Legs</em>' attribute.
	 * @see #setChangingLegs(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_ChangingLegs()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isChangingLegs();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingLegs <em>Changing Legs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changing Legs</em>' attribute.
	 * @see #isChangingLegs()
	 * @generated
	 */
	void setChangingLegs(boolean value);

		/**
	 * Returns the value of the '<em><b>Changing Attitude</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents whether or not the lander is currently
	 * changing its attitude, as a result of a changeAttitude() /
	 * resetAttitude() operation; initially false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changing Attitude</em>' attribute.
	 * @see #setChangingAttitude(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_ChangingAttitude()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isChangingAttitude();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingAttitude <em>Changing Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changing Attitude</em>' attribute.
	 * @see #isChangingAttitude()
	 * @generated
	 */
	void setChangingAttitude(boolean value);

		/**
	 * Returns the value of the '<em><b>Changing Location</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This represents whether or not the lander is currently
	 * changing its coordinate location, as a result of a moveTo()
	 * operation; initially false.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Changing Location</em>' attribute.
	 * @see #setChangingLocation(boolean)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.EMFEcoreExampleLanderPackage#getLander_ChangingLocation()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status' propertyDescription=''"
	 * @generated
	 */
	boolean isChangingLocation();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.examples.lander.Lander#isChangingLocation <em>Changing Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Changing Location</em>' attribute.
	 * @see #isChangingLocation()
	 * @generated
	 */
	void setChangingLocation(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation performs the steps required in order to
	 * initialize the lander.
	 * @return Whether or not the lander was successfully initialized
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean init();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the extension positions
	 * for each of the legs of the lander.  Note that extending or
	 * retracting the legs is a non-instantaneous process and it's
	 * likely it will take some period of time to move the lander's
	 * legs to the target positions.
	 * @param legAExtension The new leg extension position for leg A.
	 * @param legBExtension The new leg extension position for leg B.
	 * @param legCExtension The new leg extension position for leg C.
	 * <!-- end-model-doc -->
	 * @model legAExtensionUnique="false" legBExtensionUnique="false" legCExtensionUnique="false"
	 * @generated
	 */
	void commandLegPosition(LanderLegExtension legAExtension, LanderLegExtension legBExtension, LanderLegExtension legCExtension);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to move the lander to the specified X, Y and
	 * Z coordinates.
	 * @param x The lander's new desired X coordinate
	 * @param y The lander's new desired Y coordinate
	 * @param z The lander's new desired Z coordinate
	 * <!-- end-model-doc -->
	 * @model xUnique="false" yUnique="false" zUnique="false"
	 * @generated
	 */
	void moveTo(double x, double y, double z);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the lander's attitude /
	 * orientation to the specified angles.
	 * @param xAngle The lander's new angle of rotation (in radians) around the X axis
	 * @param yAngle The lander's new angle of rotation (in radians) around the Y axis
	 * @param zAngle The lander's new angle of rotation (in radians) around the Z axis
	 * <!-- end-model-doc -->
	 * @model xAngleUnique="false"
	 *        xAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" yAngleUnique="false"
	 *        yAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" zAngleUnique="false"
	 *        zAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
	void changeAttitude(double xAngle, double yAngle, double zAngle);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to reset the lander's attitude /
	 * position to its initial state, namely where there is no
	 * rotation from any of the primary axes (X, Y, Z).
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void resetAttitude();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to update the both the lander's
	 * X and Y angular velocities (in radians per second.)
	 * <p>
	 * Note 1: These velocities are only used while the lander
	 * 		   is flying; while not flying, changing these values
	 *         will have no effect.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity
	 *         as a vector, this is simply a signed scalar; a positive
	 *         value is the rotation in the counter-clockwise direction
	 *         while a negative value implies the rotation is in the
	 *         clockwise direction.  Zero means there is no rotation.
	 * @param xAngularVelocity The new X angular velocity for the lander (given in radians / second)
	 * @param yAngularVelocity The new Y angular velocity for the lander (given in radians / second)
	 * <!-- end-model-doc -->
	 * @model xAngularVelocityUnique="false"
	 *        xAngularVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s'" yAngularVelocityUnique="false"
	 *        yAngularVelocityAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad/s'"
	 * @generated
	 */
	void commandAngularVelocities(double xAngularVelocity, double yAngularVelocity);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to update the lander's thrust level
	 * (which is given in newtons.)
	 * <p>
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustLevel The lander's new thrust level (given in N)
	 * <!-- end-model-doc -->
	 * @model thrustLevelUnique="false"
	 *        thrustLevelAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='N'"
	 * @generated
	 */
  void commandThrust(double thrustLevel);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to change the lander's current thrust
	 * level by the specified (absolute) offset (which is given in
	 * newtons.)
	 * <p>
	 * Note: The thrust level is always bounded by
	 * 		 [thruster.getMinimumThrust(), thruster.getMaximumThrust()]
	 * 
	 * @param thrustOffset The amount (in N) that the thrust level should be increased / decreased.
	 * <!-- end-model-doc -->
	 * @model thrustOffsetUnique="false"
	 *        thrustOffsetAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='N'"
	 * @generated
	 */
	void changeThrustBy(double thrustOffset);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to permit the lander to start flying.
	 * <p>
	 * Whether or not the lander is able to actually fly is dependent on
	 * the mass of the lander, the lander's current thrust and the gravity
	 * being used (e.g. the Earth's gravity, g ~= -9.81); there may
	 * potentially be other factors as well.
	 * @param logStateChanges Whether or not to log the state changes that occur because it has started flying
	 * @see #canFly()
	 * @see #stopFlying()
	 * <!-- end-model-doc -->
	 * @model logStateChangesUnique="false"
	 * @generated
	 */
	void startFlying(boolean logStateChanges);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This operation is used to indicate that the lander is no longer
	 * allowed to fly and should stop doing so; it may need to perform
	 * actions to land the lander.
	 * @see #canFly()
	 * @see #startFlying(boolean)
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stopFlying();
} // Lander
