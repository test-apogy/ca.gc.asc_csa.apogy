/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotic Arm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This abstract class represents a robotic arm, including
 * its relevant state information (e.g. joint angles) as well
 * as the operations that it can perform.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getTurretAngle <em>Turret Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getShoulderAngle <em>Shoulder Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getElbowAngle <em>Elbow Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getWristAngle <em>Wrist Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isArmMoving <em>Arm Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm()
 * @model abstract="true"
 * @generated
 */
public interface RoboticArm extends EObject
{
  /**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This indicates the level of speed that the robotic arm
	 * is going to move at.
	 * @see #cmdMoveSpeedLevel(MoveSpeedLevel)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel
	 * @see #setSpeed(MoveSpeedLevel)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_Speed()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	MoveSpeedLevel getSpeed();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(MoveSpeedLevel value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Performs the required operations required in order to initialize
	 * the robotic arm.
	 * @return Whether or not the robotic arm was successfully initialized.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	boolean init();

	/**
	 * Returns the value of the '<em><b>Turret Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current turret angle, in degrees.
	 * @see #moveTo(double, double, double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Turret Angle</em>' attribute.
	 * @see #setTurretAngle(double)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_TurretAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Joint Angles' csa_units='\260'"
	 * @generated
	 */
	double getTurretAngle();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getTurretAngle <em>Turret Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turret Angle</em>' attribute.
	 * @see #getTurretAngle()
	 * @generated
	 */
	void setTurretAngle(double value);

		/**
	 * Returns the value of the '<em><b>Shoulder Angle</b></em>' attribute.
	 * The default value is <code>"90.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shoulder Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current shoulder angle, in degrees.
	 * @see #moveTo(double, double, double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shoulder Angle</em>' attribute.
	 * @see #setShoulderAngle(double)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_ShoulderAngle()
	 * @model default="90.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Joint Angles' csa_units='\260'"
	 * @generated
	 */
  double getShoulderAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getShoulderAngle <em>Shoulder Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoulder Angle</em>' attribute.
	 * @see #getShoulderAngle()
	 * @generated
	 */
  void setShoulderAngle(double value);

  /**
	 * Returns the value of the '<em><b>Elbow Angle</b></em>' attribute.
	 * The default value is <code>"-180.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elbow Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current elbow angle, in degrees.
	 * @see #moveTo(double, double, double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elbow Angle</em>' attribute.
	 * @see #setElbowAngle(double)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_ElbowAngle()
	 * @model default="-180.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Joint Angles' csa_units='\260'"
	 * @generated
	 */
  double getElbowAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getElbowAngle <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elbow Angle</em>' attribute.
	 * @see #getElbowAngle()
	 * @generated
	 */
  void setElbowAngle(double value);

  /**
	 * Returns the value of the '<em><b>Wrist Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrist Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the current wrist angle, in degrees.
	 * @see #moveTo(double, double, double, double)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wrist Angle</em>' attribute.
	 * @see #setWristAngle(double)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_WristAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Joint Angles' csa_units='\260'"
	 * @generated
	 */
  double getWristAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#getWristAngle <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrist Angle</em>' attribute.
	 * @see #getWristAngle()
	 * @generated
	 */
  void setWristAngle(double value);

  /**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the robotic arm has been
	 * initialized; initially false
	 * @see #init()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

		/**
	 * Returns the value of the '<em><b>Arm Moving</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the robotic arm is currently
	 * moving; initially false
	 * @see #moveTo(double, double, double, double)
	 * @see #stow()
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Arm Moving</em>' attribute.
	 * @see #setArmMoving(boolean)
	 * @see org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage#getRoboticArm_ArmMoving()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='Status'"
	 * @generated
	 */
	boolean isArmMoving();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.examples.robotic_arm.RoboticArm#isArmMoving <em>Arm Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Arm Moving</em>' attribute.
	 * @see #isArmMoving()
	 * @generated
	 */
	void setArmMoving(boolean value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initiates the motion of the arm and move the arm to the specified configuration.
	 * @param turretAngle The expected angle (in radians) of the turret joint (joint 1) after moving
	 * @param shoulderAngle The expected angle (in radians) of the shoulder joint (joint 2) after moving.
	 * @param elbowAngle The expected angle (in radians) of the elbow joint (joint 3) after moving.
	 * @param wristAngle The expected angle (in radians) of the wrist joint (joint 4) after moving.
	 * <!-- end-model-doc -->
	 * @model turretAngleUnique="false"
	 *        turretAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" shoulderAngleUnique="false"
	 *        shoulderAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" elbowAngleUnique="false"
	 *        elbowAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" wristAngleUnique="false"
	 *        wristAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  void moveTo(double turretAngle, double shoulderAngle, double elbowAngle, double wristAngle);

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initiates the motion of the arm and moves the arm to the stow configuration.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void stow();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Changes the level of speed at which the robotic arm should move; this
	 * is likely to be used by both moveTo() and stow() as they both involve
	 * moving the arm.
	 * @param speedLevel The new move speed level, indicating how fast the arm should move.
	 * <!-- end-model-doc -->
	 * @model speedLevelUnique="false"
	 * @generated
	 */
	void cmdMoveSpeedLevel(MoveSpeedLevel speedLevel);

} // RoboticArm
