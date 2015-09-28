/**
 * Canadian Space Agency / Agence spatiale canadienne Copyright (c) 2015
 */
package ca.gc.asc_csa.symphony.examples.robotic_arm;

import ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.symphony.core.SymphonyInitializationData;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Robotic Arm Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the specialized data structure which is used to essentially
 * save and later restore the state of the component; this functionality is
 * implemented by the apply() (load) and collect() (save) methods of the robotic
 * arm's API adapter,
 * which is {@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmSymphonySystemApiAdapter}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getSpeed <em>Speed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getTurretAngle <em>Turret Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getShoulderAngle <em>Shoulder Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getElbowAngle <em>Elbow Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getWristAngle <em>Wrist Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData()
 * @model
 * @generated
 */
public interface RoboticArmData extends SymphonyInitializationData
{
  /**
	 * Returns the value of the '<em><b>Initialized</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is whether or not the robotic arm should be initialized.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Initialized</em>' attribute.
	 * @see #setInitialized(boolean)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_Initialized()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	boolean isInitialized();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#isInitialized <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initialized</em>' attribute.
	 * @see #isInitialized()
	 * @generated
	 */
	void setInitialized(boolean value);

	/**
	 * Returns the value of the '<em><b>Speed</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.MoveSpeedLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is how quickly the robotic arm should be moving,
	 * out of the several possible speeds.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Speed</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.MoveSpeedLevel
	 * @see #setSpeed(MoveSpeedLevel)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_Speed()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Editable' propertyCategory='Status'"
	 * @generated
	 */
	MoveSpeedLevel getSpeed();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getSpeed <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Speed</em>' attribute.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.examples.robotic_arm.MoveSpeedLevel
	 * @see #getSpeed()
	 * @generated
	 */
	void setSpeed(MoveSpeedLevel value);

	/**
	 * Returns the value of the '<em><b>Turret Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angle (in degrees) that the robotic arm's turret joint should be at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Turret Angle</em>' attribute.
	 * @see #setTurretAngle(double)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_TurretAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='\ufffd' children='false' notify='true' property='Editable' propertyCategory='Joint Angles'"
	 * @generated
	 */
	double getTurretAngle();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getTurretAngle <em>Turret Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turret Angle</em>' attribute.
	 * @see #getTurretAngle()
	 * @generated
	 */
	void setTurretAngle(double value);

		/**
	 * Returns the value of the '<em><b>Shoulder Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shoulder Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angle (in degrees) that the robotic arm's shoulder joint should be at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shoulder Angle</em>' attribute.
	 * @see #setShoulderAngle(double)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_ShoulderAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='\ufffd' children='false' notify='true' property='Editable' propertyCategory='Joint Angles'"
	 * @generated
	 */
  double getShoulderAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getShoulderAngle <em>Shoulder Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoulder Angle</em>' attribute.
	 * @see #getShoulderAngle()
	 * @generated
	 */
  void setShoulderAngle(double value);

  /**
	 * Returns the value of the '<em><b>Elbow Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elbow Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angle (in degrees) that the robotic arm's elbow joint should be at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elbow Angle</em>' attribute.
	 * @see #setElbowAngle(double)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_ElbowAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='\ufffd' children='false' notify='true' property='Editable' propertyCategory='Joint Angles'"
	 * @generated
	 */
  double getElbowAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getElbowAngle <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elbow Angle</em>' attribute.
	 * @see #getElbowAngle()
	 * @generated
	 */
  void setElbowAngle(double value);

  /**
	 * Returns the value of the '<em><b>Wrist Angle</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Wrist Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the angle (in degrees) that the robotic arm's wrist joint should be at.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wrist Angle</em>' attribute.
	 * @see #setWristAngle(double)
	 * @see ca.gc.asc_csa.symphony.examples.robotic_arm.SymphonyExampleRoboticArmPackage#getRoboticArmData_WristAngle()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='\ufffd' children='false' notify='true' property='Editable' propertyCategory='Joint Angles'"
	 * @generated
	 */
  double getWristAngle();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.symphony.examples.robotic_arm.RoboticArmData#getWristAngle <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wrist Angle</em>' attribute.
	 * @see #getWristAngle()
	 * @generated
	 */
  void setWristAngle(double value);

} // RoboticArmData
