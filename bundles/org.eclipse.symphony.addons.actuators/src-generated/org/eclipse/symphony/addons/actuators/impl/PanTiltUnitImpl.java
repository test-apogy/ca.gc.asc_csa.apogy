/**
 * Canadian Space Agency / Agence spatiale canadienne 2014 Copyrights (c)
 */
package org.eclipse.symphony.addons.actuators.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.addons.actuators.MRTActuatorsPackage;
import org.eclipse.symphony.addons.actuators.PanTiltUnit;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pan Tilt Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.actuators.impl.PanTiltUnitImpl#getCurrentPanAngle <em>Current Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.impl.PanTiltUnitImpl#getCurrentTiltAngle <em>Current Tilt Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.impl.PanTiltUnitImpl#getCommandedPanAngle <em>Commanded Pan Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.actuators.impl.PanTiltUnitImpl#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class PanTiltUnitImpl extends AbstractActuatorImpl implements PanTiltUnit
{
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
  protected PanTiltUnitImpl()
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
		return MRTActuatorsPackage.Literals.PAN_TILT_UNIT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE, oldCurrentPanAngle, currentPanAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE, oldCurrentTiltAngle, currentTiltAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE, oldCommandedPanAngle, commandedPanAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE, oldCommandedTiltAngle, commandedTiltAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMaximumPanAngle()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMinimumPanAngle()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMaximumTiltAngle()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getMinimumTiltAngle()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveToPanTilt(double panAngle, double tiltAngle)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveToPan(double panAngle)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveToTilt(double tiltAngle)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveByPanTilt(double panAngleDelta, double tiltAngleDelta)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveByPan(double panAngleDelta)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean moveByTilt(double tiltAngleDelta)
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean stopMotion()
  {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE:
				return getCurrentPanAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE:
				return getCurrentTiltAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE:
				return getCommandedPanAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE:
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
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE:
				setCurrentPanAngle((Double)newValue);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle((Double)newValue);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle((Double)newValue);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE:
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
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE:
				setCurrentPanAngle(CURRENT_PAN_ANGLE_EDEFAULT);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle(CURRENT_TILT_ANGLE_EDEFAULT);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle(COMMANDED_PAN_ANGLE_EDEFAULT);
				return;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE:
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
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE:
				return currentPanAngle != CURRENT_PAN_ANGLE_EDEFAULT;
			case MRTActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE:
				return currentTiltAngle != CURRENT_TILT_ANGLE_EDEFAULT;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE:
				return commandedPanAngle != COMMANDED_PAN_ANGLE_EDEFAULT;
			case MRTActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE:
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case MRTActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE:
				return getMaximumPanAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE:
				return getMinimumPanAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE:
				return getMaximumTiltAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE:
				return getMinimumTiltAngle();
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE:
				return moveToPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE:
				return moveToPan((Double)arguments.get(0));
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE:
				return moveToTilt((Double)arguments.get(0));
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE:
				return moveByPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE:
				return moveByPan((Double)arguments.get(0));
			case MRTActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE:
				return moveByTilt((Double)arguments.get(0));
			case MRTActuatorsPackage.PAN_TILT_UNIT___STOP_MOTION:
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
		result.append(" (currentPanAngle: ");
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

} //PanTiltUnitImpl
