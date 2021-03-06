package ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl;
import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.RoboticArmData;
import ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.ApogyExamplesRoboticArmApogyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robotic Arm Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#getSpeed <em>Speed</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#getTurretAngle <em>Turret Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#getShoulderAngle <em>Shoulder Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#getElbowAngle <em>Elbow Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.apogy.impl.RoboticArmDataImpl#getWristAngle <em>Wrist Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoboticArmDataImpl extends ApogyInitializationDataImpl implements RoboticArmData
{
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getShoulderAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double SHOULDER_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getShoulderAngle() <em>Shoulder Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getShoulderAngle()
	 * @generated
	 * @ordered
	 */
  protected double shoulderAngle = SHOULDER_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getElbowAngle() <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElbowAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double ELBOW_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getElbowAngle() <em>Elbow Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getElbowAngle()
	 * @generated
	 * @ordered
	 */
  protected double elbowAngle = ELBOW_ANGLE_EDEFAULT;

  /**
	 * The default value of the '{@link #getWristAngle() <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWristAngle()
	 * @generated
	 * @ordered
	 */
  protected static final double WRIST_ANGLE_EDEFAULT = 0.0;

  /**
	 * The cached value of the '{@link #getWristAngle() <em>Wrist Angle</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWristAngle()
	 * @generated
	 * @ordered
	 */
  protected double wristAngle = WRIST_ANGLE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected RoboticArmDataImpl()
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
		return ApogyExamplesRoboticArmApogyPackage.Literals.ROBOTIC_ARM_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__INITIALIZED, oldInitialized, initialized));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SPEED, oldSpeed, speed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE, oldTurretAngle, turretAngle));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getShoulderAngle()
  {
		return shoulderAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setShoulderAngle(double newShoulderAngle)
  {
		double oldShoulderAngle = shoulderAngle;
		shoulderAngle = newShoulderAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE, oldShoulderAngle, shoulderAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getElbowAngle()
  {
		return elbowAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setElbowAngle(double newElbowAngle)
  {
		double oldElbowAngle = elbowAngle;
		elbowAngle = newElbowAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE, oldElbowAngle, elbowAngle));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public double getWristAngle()
  {
		return wristAngle;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWristAngle(double newWristAngle)
  {
		double oldWristAngle = wristAngle;
		wristAngle = newWristAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE, oldWristAngle, wristAngle));
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
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__INITIALIZED:
				return isInitialized();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SPEED:
				return getSpeed();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE:
				return getTurretAngle();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE:
				return getShoulderAngle();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE:
				return getElbowAngle();
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE:
				return getWristAngle();
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
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SPEED:
				setSpeed((MoveSpeedLevel)newValue);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE:
				setTurretAngle((Double)newValue);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE:
				setShoulderAngle((Double)newValue);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE:
				setElbowAngle((Double)newValue);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE:
				setWristAngle((Double)newValue);
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
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SPEED:
				setSpeed(SPEED_EDEFAULT);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE:
				setTurretAngle(TURRET_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE:
				setShoulderAngle(SHOULDER_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE:
				setElbowAngle(ELBOW_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE:
				setWristAngle(WRIST_ANGLE_EDEFAULT);
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
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SPEED:
				return speed != SPEED_EDEFAULT;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__TURRET_ANGLE:
				return turretAngle != TURRET_ANGLE_EDEFAULT;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__SHOULDER_ANGLE:
				return shoulderAngle != SHOULDER_ANGLE_EDEFAULT;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__ELBOW_ANGLE:
				return elbowAngle != ELBOW_ANGLE_EDEFAULT;
			case ApogyExamplesRoboticArmApogyPackage.ROBOTIC_ARM_DATA__WRIST_ANGLE:
				return wristAngle != WRIST_ANGLE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (initialized: ");
		result.append(initialized);
		result.append(", speed: ");
		result.append(speed);
		result.append(", turretAngle: ");
		result.append(turretAngle);
		result.append(", shoulderAngle: ");
		result.append(shoulderAngle);
		result.append(", elbowAngle: ");
		result.append(elbowAngle);
		result.append(", wristAngle: ");
		result.append(wristAngle);
		result.append(')');
		return result.toString();
	}

} //RoboticArmDataImpl
