/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.actuators;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pan Tilt Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCurrentPanAngle <em>Current Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCurrentTiltAngle <em>Current Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCommandedPanAngle <em>Commanded Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage#getPanTiltUnit()
 * @model abstract="true"
 * @generated
 */
public interface PanTiltUnit extends AbstractActuator
{

  /**
	 * Returns the value of the '<em><b>Current Pan Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Pan Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Current pan angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Pan Angle</em>' attribute.
	 * @see #setCurrentPanAngle(double)
	 * @see org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage#getPanTiltUnit_CurrentPanAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION' csa_units='rad'"
	 * @generated
	 */
  double getCurrentPanAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCurrentPanAngle <em>Current Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Pan Angle</em>' attribute.
	 * @see #getCurrentPanAngle()
	 * @generated
	 */
  void setCurrentPanAngle(double value);

  /**
	 * Returns the value of the '<em><b>Current Tilt Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Tilt Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Current tilt angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Current Tilt Angle</em>' attribute.
	 * @see #setCurrentTiltAngle(double)
	 * @see org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage#getPanTiltUnit_CurrentTiltAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION' csa_units='rad'"
	 * @generated
	 */
  double getCurrentTiltAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCurrentTiltAngle <em>Current Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Tilt Angle</em>' attribute.
	 * @see #getCurrentTiltAngle()
	 * @generated
	 */
  void setCurrentTiltAngle(double value);

  /**
	 * Returns the value of the '<em><b>Commanded Pan Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commanded Pan Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Last commanded pan angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commanded Pan Angle</em>' attribute.
	 * @see #setCommandedPanAngle(double)
	 * @see org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage#getPanTiltUnit_CommandedPanAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION' csa_units='rad'"
	 * @generated
	 */
  double getCommandedPanAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCommandedPanAngle <em>Commanded Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Pan Angle</em>' attribute.
	 * @see #getCommandedPanAngle()
	 * @generated
	 */
  void setCommandedPanAngle(double value);

  /**
	 * Returns the value of the '<em><b>Commanded Tilt Angle</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Commanded Tilt Angle</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  Last commanded tilt angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commanded Tilt Angle</em>' attribute.
	 * @see #setCommandedTiltAngle(double)
	 * @see org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage#getPanTiltUnit_CommandedTiltAngle()
	 * @model default="0.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' notify='true' property='Readonly' propertyCategory='ACTUATOR_INFORMATION' csa_units='rad'"
	 * @generated
	 */
  double getCommandedTiltAngle();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.actuators.PanTiltUnit#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commanded Tilt Angle</em>' attribute.
	 * @see #getCommandedTiltAngle()
	 * @generated
	 */
  void setCommandedTiltAngle(double value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the maximum pan angle.
	 * @return The maximum pan angle,in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getMaximumPanAngle();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the minimum pan angle.
	 * @return The minimum pan angle,in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getMinimumPanAngle();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the maximum tilt angle.
	 * @return The maximum tilt angle,in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getMaximumTiltAngle();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Return the minimum tilt angle.
	 * @return The minimum tilt angle,in radians.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  double getMinimumTiltAngle();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move to absolute pan and tilt angle.
	 * @param panAngle The commanded pan angle, in radians.
	 * @param tiltAngle The commanded tilt angle, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" panAngleUnique="false"
	 *        panAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" tiltAngleUnique="false"
	 *        tiltAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveToPanTilt(double panAngle, double tiltAngle);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move to absolute pan angle.
	 * @param panAngle The commanded pan angle, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" panAngleUnique="false"
	 *        panAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveToPan(double panAngle);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move to absolute tilt angle.
	 * @param tiltAngle The commanded tilt angle, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" tiltAngleUnique="false"
	 *        tiltAngleAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveToTilt(double tiltAngle);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move by to relative pan and tilt angle.
	 * @param panAngleDelta The commanded pan angle delta, in radians.
	 * @param tiltAngleDelta The commanded tilt angle delta, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" panAngleDeltaUnique="false"
	 *        panAngleDeltaAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'" tiltAngleDeltaUnique="false"
	 *        tiltAngleDeltaAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveByPanTilt(double panAngleDelta, double tiltAngleDelta);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move by to a relative pan angle.
	 * @param panAngleDelta The commanded pan angle delta, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" panAngleDeltaUnique="false"
	 *        panAngleDeltaAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveByPan(double panAngleDelta);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to move by to a relative tilt angle.
	 * @param tiltAngleDelta The commanded tilt angle delta, in radians.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false" tiltAngleDeltaUnique="false"
	 *        tiltAngleDeltaAnnotation="http://www.eclipse.org/emf/2002/GenModel csa_units='rad'"
	 * @generated
	 */
  boolean moveByTilt(double tiltAngleDelta);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Commands the PTU to stop moving.
	 * @return True of successful, false otherwise.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
  boolean stopMotion();
} // PanTiltUnit
