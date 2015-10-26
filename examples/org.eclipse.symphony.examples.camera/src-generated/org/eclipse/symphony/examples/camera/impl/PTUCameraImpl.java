/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.camera.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.actuators.AbstractActuator;
import org.eclipse.symphony.addons.actuators.ActuatorStatus;
import org.eclipse.symphony.addons.actuators.Symphony__AddonsActuatorsPackage;
import org.eclipse.symphony.addons.actuators.PanTiltUnit;
import org.eclipse.symphony.examples.camera.EMFEcoreExampleCameraPackage;
import org.eclipse.symphony.examples.camera.PTUCamera;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Camera</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#getActuatorStatus <em>Actuator Status</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#getCurrentPanAngle <em>Current Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#getCurrentTiltAngle <em>Current Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#getCommandedPanAngle <em>Commanded Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.camera.impl.PTUCameraImpl#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PTUCameraImpl extends CameraImpl implements PTUCamera
{
  /**
	 * The default value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
  protected static final boolean MOVING_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isMoving() <em>Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isMoving()
	 * @generated
	 * @ordered
	 */
  protected boolean moving = MOVING_EDEFAULT;

  /**
	 * The default value of the '{@link #getActuatorStatus() <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActuatorStatus()
	 * @generated
	 * @ordered
	 */
  protected static final ActuatorStatus ACTUATOR_STATUS_EDEFAULT = ActuatorStatus.OFF;

  /**
	 * The cached value of the '{@link #getActuatorStatus() <em>Actuator Status</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getActuatorStatus()
	 * @generated
	 * @ordered
	 */
  protected ActuatorStatus actuatorStatus = ACTUATOR_STATUS_EDEFAULT;

  /**
	 * The default value of the '{@link #getCurrentPanAngle() <em>Current Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentPanAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double CURRENT_PAN_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getCurrentPanAngle() <em>Current Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentPanAngle()
	 * @generated
	 * @ordered
	 */
  protected double currentPanAngle = CURRENT_PAN_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getCurrentTiltAngle() <em>Current Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentTiltAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double CURRENT_TILT_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getCurrentTiltAngle() <em>Current Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCurrentTiltAngle()
	 * @generated
	 * @ordered
	 */
  protected double currentTiltAngle = CURRENT_TILT_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getCommandedPanAngle() <em>Commanded Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedPanAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double COMMANDED_PAN_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getCommandedPanAngle() <em>Commanded Pan Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedPanAngle()
	 * @generated
	 * @ordered
	 */
  protected double commandedPanAngle = COMMANDED_PAN_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getCommandedTiltAngle() <em>Commanded Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedTiltAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double COMMANDED_TILT_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getCommandedTiltAngle() <em>Commanded Tilt Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getCommandedTiltAngle()
	 * @generated
	 * @ordered
	 */
  protected double commandedTiltAngle = COMMANDED_TILT_ANGLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected PTUCameraImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreExampleCameraPackage.Literals.PTU_CAMERA;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isMoving()
  {
		return moving;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMoving(boolean newMoving)
  {
		boolean oldMoving = moving;
		moving = newMoving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING, oldMoving, moving));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ActuatorStatus getActuatorStatus()
  {
		return actuatorStatus;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActuatorStatus(ActuatorStatus newActuatorStatus)
  {
		ActuatorStatus oldActuatorStatus = actuatorStatus;
		actuatorStatus = newActuatorStatus == null ? ACTUATOR_STATUS_EDEFAULT : newActuatorStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS, oldActuatorStatus, actuatorStatus));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCurrentPanAngle()
  {
		return currentPanAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCurrentPanAngle(double newCurrentPanAngle)
  {
		double oldCurrentPanAngle = currentPanAngle;
		currentPanAngle = newCurrentPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE, oldCurrentPanAngle, currentPanAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCurrentTiltAngle()
  {
		return currentTiltAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCurrentTiltAngle(double newCurrentTiltAngle)
  {
		double oldCurrentTiltAngle = currentTiltAngle;
		currentTiltAngle = newCurrentTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE, oldCurrentTiltAngle, currentTiltAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCommandedPanAngle()
  {
		return commandedPanAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCommandedPanAngle(double newCommandedPanAngle)
  {
		double oldCommandedPanAngle = commandedPanAngle;
		commandedPanAngle = newCommandedPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE, oldCommandedPanAngle, commandedPanAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getCommandedTiltAngle()
  {
		return commandedTiltAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCommandedTiltAngle(double newCommandedTiltAngle)
  {
		double oldCommandedTiltAngle = commandedTiltAngle;
		commandedTiltAngle = newCommandedTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE, oldCommandedTiltAngle, commandedTiltAngle));
	}

  /**
   * This operation returns the maximum allowed pan angle (in radians)
   * for the camera's Pan-Tilt Unit (PTU).
   * @return The PTU's maximum pan angle (in radians.) 
   * @generated_NOT
   */
  @Override
  abstract public double getMaximumPanAngle();

  /**
   * This operation returns the minimum allowed pan angle (in radians)
   * for the camera's Pan-Tilt Unit (PTU).
   * @return The PTU's minimum pan angle (in radians.) 
   * @generated_NOT
   */
  @Override
  abstract public double getMinimumPanAngle();
  
  
  /**
   * This operation returns the maximum allowed tilt angle (in radians)
   * for the camera's Pan-Tilt Unit (PTU).
   * @return The PTU's maximum tilt angle (in radians.)
   * @generated_NOT
   */
  @Override
  abstract public double getMaximumTiltAngle();
  
  /**
   * This operation returns the minimum allowed tilt angle (in radians)
   * for the camera's Pan-Tilt Unit (PTU).
   * @return The PTU's minimum tilt angle (in radians.)
   * @generated_NOT
   */
  @Override
  abstract public double getMinimumTiltAngle();
  
  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted on it, to the specified pan and tilt angles
   * (in radians.) 
   * @param panAngle The desired final pan angle (in radians) for the PTU.
   * @param tiltAngle The desired final tilt angle (in radians) for the PTU.
   * @return Whether or not moving the PTU to the specified pan and tilt angles was successful
   * @generated_NOT
   */
  @Override
  abstract public boolean moveToPanTilt(double panAngle, double tiltAngle);
  
  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted on it, to the specified pan angle (in radians.)
   * @param panAngle The desired final pan angle (in radians) for the PTU.
   * @return Whether or not moving the PTU to the specified pan angle was successful
   * @generated_NOT
   */
  @Override
  abstract public boolean moveToPan(double panAngle);
  
  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted on it, to the specified tilt angle (in radians.)
   * @param tiltAngle The desired final tilt angle (in radians) for the PTU.
   * @return Whether or not moving the PTU to the specified tilt angle was successful
   * @generated_NOT
   */
  @Override
  abstract public boolean moveToTilt(double tiltAngle);

  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted on it, by the specified changes (deltas) to
   * the pan and tilt angles (in radians.)
   * @param panAngleDelta The amount (in radians) to change the PTU's pan angle.
   * @param tiltAngleDelta The amount (in radians) to change the PTU's tilt angle.
   * @return Whether or not moving the PTU's pan and tilt angles by the specified amounts was successful 
   * @generated_NOT
   */
  abstract public boolean moveByPanTilt(double panAngleDelta, double tiltAngleDelta);

  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted to it, by the specified change (delta) to the
   * pan angle (in radians.)
   * @param panAngleDelta The amount (in radians) to change the PTU's pan angle.
   * @return Whether or not moving the PTU's pan angle by the specified amount was successful
   * @generated_NOR
   */
  abstract public boolean moveByPan(double panAngleDelta);
  
  /**
   * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
   * the camera that's mounted to it, by the specified change (delta) to the
   * tilt angle (in radians.)
   * @param tiltAngleDelta The amount (in radians) to change the PTU's tilt angle.
   * @return Whether or not moving the PTU's tilt angle by the specified amount was successful
   * @generated_NOT
   */
  abstract public boolean moveByTilt(double tiltAngleDelta);
  
  /**
   * This operation is used to stop the movement of the camera's Pan-Tilt Unit (PTU),
   * if it is actually moving.
   * @return Whether or not the movement of the PTU was successfully halted.
   * @generated_NOT
   */
  abstract public boolean stopMotion();
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING:
				return isMoving();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS:
				return getActuatorStatus();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE:
				return getCurrentPanAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE:
				return getCurrentTiltAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE:
				return getCommandedPanAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE:
				return getCommandedTiltAngle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING:
				setMoving((Boolean)newValue);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS:
				setActuatorStatus((ActuatorStatus)newValue);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE:
				setCurrentPanAngle((Double)newValue);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle((Double)newValue);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle((Double)newValue);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE:
				setCommandedTiltAngle((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS:
				setActuatorStatus(ACTUATOR_STATUS_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE:
				setCurrentPanAngle(CURRENT_PAN_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle(CURRENT_TILT_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle(COMMANDED_PAN_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE:
				setCommandedTiltAngle(COMMANDED_TILT_ANGLE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING:
				return moving != MOVING_EDEFAULT;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS:
				return actuatorStatus != ACTUATOR_STATUS_EDEFAULT;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE:
				return currentPanAngle != CURRENT_PAN_ANGLE_EDEFAULT;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE:
				return currentTiltAngle != CURRENT_TILT_ANGLE_EDEFAULT;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE:
				return commandedPanAngle != COMMANDED_PAN_ANGLE_EDEFAULT;
			case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE:
				return commandedTiltAngle != COMMANDED_TILT_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == AbstractActuator.class) {
			switch (derivedFeatureID) {
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING: return Symphony__AddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING;
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS: return Symphony__AddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (derivedFeatureID) {
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE: return Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE;
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE: return Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE;
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE: return Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE;
				case EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE: return Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == AbstractActuator.class) {
			switch (baseFeatureID) {
				case Symphony__AddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING: return EMFEcoreExampleCameraPackage.PTU_CAMERA__MOVING;
				case Symphony__AddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS: return EMFEcoreExampleCameraPackage.PTU_CAMERA__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (baseFeatureID) {
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_PAN_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA__CURRENT_TILT_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_PAN_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA__COMMANDED_TILT_ANGLE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedOperationID(int baseOperationID, Class<?> baseClass)
  {
		if (baseClass == AbstractActuator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (baseOperationID) {
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MAXIMUM_PAN_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MINIMUM_PAN_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MAXIMUM_TILT_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MINIMUM_TILT_ANGLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_PAN__DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_TILT__DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_PAN__DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE: return EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_TILT__DOUBLE;
				case Symphony__AddonsActuatorsPackage.PAN_TILT_UNIT___STOP_MOTION: return EMFEcoreExampleCameraPackage.PTU_CAMERA___STOP_MOTION;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MAXIMUM_PAN_ANGLE:
				return getMaximumPanAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MINIMUM_PAN_ANGLE:
				return getMinimumPanAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MAXIMUM_TILT_ANGLE:
				return getMaximumTiltAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___GET_MINIMUM_TILT_ANGLE:
				return getMinimumTiltAngle();
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE:
				return moveToPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_PAN__DOUBLE:
				return moveToPan((Double)arguments.get(0));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_TO_TILT__DOUBLE:
				return moveToTilt((Double)arguments.get(0));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE:
				return moveByPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_PAN__DOUBLE:
				return moveByPan((Double)arguments.get(0));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___MOVE_BY_TILT__DOUBLE:
				return moveByTilt((Double)arguments.get(0));
			case EMFEcoreExampleCameraPackage.PTU_CAMERA___STOP_MOTION:
				return stopMotion();
		}
		return super.eInvoke(operationID, arguments);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (moving: ");
		result.append(moving);
		result.append(", actuatorStatus: ");
		result.append(actuatorStatus);
		result.append(", currentPanAngle: ");
		result.append(currentPanAngle);
		result.append(", currentTiltAngle: ");
		result.append(currentTiltAngle);
		result.append(", commandedPanAngle: ");
		result.append(commandedPanAngle);
		result.append(", commandedTiltAngle: ");
		result.append(commandedTiltAngle);
		result.append(')');
		return result.toString();
	}

} //PTUCameraImpl
