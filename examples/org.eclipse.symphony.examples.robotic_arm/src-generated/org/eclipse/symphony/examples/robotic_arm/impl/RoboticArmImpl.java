/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.robotic_arm.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.robotic_arm.EMFEcoreExampleRoboticArmPackage;
import org.eclipse.symphony.examples.robotic_arm.MoveSpeedLevel;
import org.eclipse.symphony.examples.robotic_arm.RoboticArm;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Robotic Arm</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#getTurretAngle <em>Turret Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#getShoulderAngle <em>Shoulder Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#getElbowAngle <em>Elbow Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#getWristAngle <em>Wrist Angle</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#isArmMoving <em>Arm Moving</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.robotic_arm.impl.RoboticArmImpl#getSpeed <em>Speed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoboticArmImpl extends MinimalEObjectImpl.Container
		implements RoboticArm {
	/**
	 * The default value of the '{@link #getTurretAngle() <em>Turret Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurretAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double TURRET_ANGLE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getTurretAngle() <em>Turret Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurretAngle()
	 * @generated
	 * @ordered
	 */
	protected double turretAngle = TURRET_ANGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getShoulderAngle() <em>Shoulder Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getShoulderAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double SHOULDER_ANGLE_EDEFAULT = 90.0;
	/**
	 * The cached value of the '{@link #getShoulderAngle() <em>Shoulder Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getShoulderAngle()
	 * @generated
	 * @ordered
	 */
	protected double shoulderAngle = SHOULDER_ANGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getElbowAngle() <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElbowAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double ELBOW_ANGLE_EDEFAULT = -180.0;
	/**
	 * The cached value of the '{@link #getElbowAngle() <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElbowAngle()
	 * @generated
	 * @ordered
	 */
	protected double elbowAngle = ELBOW_ANGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #getWristAngle() <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWristAngle()
	 * @generated
	 * @ordered
	 */
	protected static final double WRIST_ANGLE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getWristAngle() <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getWristAngle()
	 * @generated
	 * @ordered
	 */
	protected double wristAngle = WRIST_ANGLE_EDEFAULT;
	/**
	 * The default value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALIZED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isInitialized() <em>Initialized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitialized()
	 * @generated
	 * @ordered
	 */
	protected boolean initialized = INITIALIZED_EDEFAULT;
	/**
	 * The default value of the '{@link #isArmMoving() <em>Arm Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmMoving()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARM_MOVING_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isArmMoving() <em>Arm Moving</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArmMoving()
	 * @generated
	 * @ordered
	 */
	protected boolean armMoving = ARM_MOVING_EDEFAULT;
	/**
	 * The default value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected static final MoveSpeedLevel SPEED_EDEFAULT = MoveSpeedLevel.SLOW;
	/**
	 * The cached value of the '{@link #getSpeed() <em>Speed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeed()
	 * @generated
	 * @ordered
	 */
	protected MoveSpeedLevel speed = SPEED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboticArmImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleRoboticArmPackage.Literals.ROBOTIC_ARM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveSpeedLevel getSpeed() {
		return speed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeed(MoveSpeedLevel newSpeed) {
		MoveSpeedLevel oldSpeed = speed;
		speed = newSpeed == null ? SPEED_EDEFAULT : newSpeed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED, oldSpeed, speed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTurretAngle() {
		return turretAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurretAngle(double newTurretAngle) {
		double oldTurretAngle = turretAngle;
		turretAngle = newTurretAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE, oldTurretAngle, turretAngle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getShoulderAngle() {
		return shoulderAngle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setShoulderAngle(double newShoulderAngle) {
		double oldShoulderAngle = shoulderAngle;
		shoulderAngle = newShoulderAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE, oldShoulderAngle, shoulderAngle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getElbowAngle() {
		return elbowAngle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setElbowAngle(double newElbowAngle) {
		double oldElbowAngle = elbowAngle;
		elbowAngle = newElbowAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE, oldElbowAngle, elbowAngle));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getWristAngle() {
		return wristAngle;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setWristAngle(double newWristAngle) {
		double oldWristAngle = wristAngle;
		wristAngle = newWristAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE, oldWristAngle, wristAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitialized() {
		return initialized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialized(boolean newInitialized) {
		boolean oldInitialized = initialized;
		initialized = newInitialized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArmMoving() {
		return armMoving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmMoving(boolean newArmMoving) {
		boolean oldArmMoving = armMoving;
		armMoving = newArmMoving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING, oldArmMoving, armMoving));
	}

	/**
	 * Performs the required operations required in order to initialize
	 * the robotic arm.
	 * @return Whether or not the robotic arm was successfully initialized.
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * Changes the level of speed at which the robotic arm should move; this
	 * is likely to be used by both moveTo() and stow() as they both involve
	 * moving the arm.
	 * @param speedLevel The new move speed level, indicating how fast the arm should move.
	 * @generated_NOT
	 */
	abstract public void cmdMoveSpeedLevel(MoveSpeedLevel speedLevel);
	
	/**
	 * Initiates the motion of the arm and move the arm to the specified configuration.
	 * @param turretAngle The expected angle (in radians) of the turret joint (joint 1) after moving
	 * @param shoulderAngle The expected angle (in radians) of the shoulder joint (joint 2) after moving.
	 * @param elbowAngle The expected angle (in radians) of the elbow joint (joint 3) after moving.
	 * @param wristAngle The expected angle (in radians) of the wrist joint (joint 4) after moving.
	 * @generated_NOT
	 */
	abstract public void moveTo(double turrentAngle, double shoulderAngle,
								double elbowAngle, double wristAngle);

	/**
	 * Initiates the motion of the arm and moves the arm to the stow configuration.
	 * @generated_NOT
	 */
	abstract public void stow();

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE:
				return getTurretAngle();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE:
				return getShoulderAngle();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE:
				return getElbowAngle();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE:
				return getWristAngle();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED:
				return isInitialized();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING:
				return isArmMoving();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED:
				return getSpeed();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE:
				setTurretAngle((Double)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE:
				setShoulderAngle((Double)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE:
				setElbowAngle((Double)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE:
				setWristAngle((Double)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING:
				setArmMoving((Boolean)newValue);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED:
				setSpeed((MoveSpeedLevel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE:
				setTurretAngle(TURRET_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE:
				setShoulderAngle(SHOULDER_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE:
				setElbowAngle(ELBOW_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE:
				setWristAngle(WRIST_ANGLE_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING:
				setArmMoving(ARM_MOVING_EDEFAULT);
				return;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__TURRET_ANGLE:
				return turretAngle != TURRET_ANGLE_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SHOULDER_ANGLE:
				return shoulderAngle != SHOULDER_ANGLE_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ELBOW_ANGLE:
				return elbowAngle != ELBOW_ANGLE_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__WRIST_ANGLE:
				return wristAngle != WRIST_ANGLE_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__ARM_MOVING:
				return armMoving != ARM_MOVING_EDEFAULT;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM__SPEED:
				return speed != SPEED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM___INIT:
				return init();
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM___CMD_MOVE_SPEED_LEVEL__MOVESPEEDLEVEL:
				cmdMoveSpeedLevel((MoveSpeedLevel)arguments.get(0));
				return null;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM___MOVE_TO__DOUBLE_DOUBLE_DOUBLE_DOUBLE:
				moveTo((Double)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2), (Double)arguments.get(3));
				return null;
			case EMFEcoreExampleRoboticArmPackage.ROBOTIC_ARM___STOW:
				stow();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (turretAngle: ");
		result.append(turretAngle);
		result.append(", shoulderAngle: ");
		result.append(shoulderAngle);
		result.append(", elbowAngle: ");
		result.append(elbowAngle);
		result.append(", wristAngle: ");
		result.append(wristAngle);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", armMoving: ");
		result.append(armMoving);
		result.append(", speed: ");
		result.append(speed);
		result.append(')');
		return result.toString();
	}

} // RoboticArmImpl
