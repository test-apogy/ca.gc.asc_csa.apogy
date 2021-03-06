package ca.gc.asc_csa.apogy.examples.rover.impl;
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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Named;
import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.examples.camera.PTUCamera;
import ca.gc.asc_csa.apogy.examples.mobile_platform.MobilePlatform;
import ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm;
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverFactory;
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage;
import ca.gc.asc_csa.apogy.examples.rover.PowerSystem;
import ca.gc.asc_csa.apogy.examples.rover.Rover;

import com.google.common.base.Objects;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rover</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getRoboticArm <em>Robotic Arm</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getMobilePlatform <em>Mobile Platform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getArmCamera <em>Arm Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getCenterCamera <em>Center Camera</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getPowerSystem <em>Power System</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getLinearVelocity <em>Linear Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#getAngularVelocity <em>Angular Velocity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#isInitialized <em>Initialized</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.RoverImpl#isDisposed <em>Disposed</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RoverImpl extends MinimalEObjectImpl.Container implements Rover
{
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRoboticArm() <em>Robotic Arm</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoboticArm()
	 * @generated
	 * @ordered
	 */
	protected RoboticArm roboticArm;
	/**
	 * The cached value of the '{@link #getMobilePlatform() <em>Mobile Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMobilePlatform()
	 * @generated
	 * @ordered
	 */
	protected MobilePlatform mobilePlatform;
	/**
	 * The cached value of the '{@link #getArmCamera() <em>Arm Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArmCamera()
	 * @generated
	 * @ordered
	 */
	protected PTUCamera armCamera;
	/**
	 * The cached value of the '{@link #getCenterCamera() <em>Center Camera</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenterCamera()
	 * @generated
	 * @ordered
	 */
	protected PTUCamera centerCamera;
	/**
	 * The cached value of the '{@link #getPowerSystem() <em>Power System</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPowerSystem()
	 * @generated
	 * @ordered
	 */
	protected PowerSystem powerSystem;
	/**
	 * The default value of the '{@link #getLinearVelocity() <em>Linear Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinearVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double LINEAR_VELOCITY_EDEFAULT = 0.0;
	/**
	 * The default value of the '{@link #getAngularVelocity() <em>Angular Velocity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAngularVelocity()
	 * @generated
	 * @ordered
	 */
	protected static final double ANGULAR_VELOCITY_EDEFAULT = 0.0;
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
	 * The default value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISPOSED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDisposed() <em>Disposed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisposed()
	 * @generated
	 * @ordered
	 */
	protected boolean disposed = DISPOSED_EDEFAULT;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoverImpl()
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
		return ApogyExamplesRoverPackage.Literals.ROVER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArm getRoboticArm()
	{
		if (roboticArm != null && roboticArm.eIsProxy()) {
			InternalEObject oldRoboticArm = (InternalEObject)roboticArm;
			roboticArm = (RoboticArm)eResolveProxy(oldRoboticArm);
			if (roboticArm != oldRoboticArm) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM, oldRoboticArm, roboticArm));
			}
		}
		return roboticArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoboticArm basicGetRoboticArm()
	{
		return roboticArm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoboticArm(RoboticArm newRoboticArm)
	{
		RoboticArm oldRoboticArm = roboticArm;
		roboticArm = newRoboticArm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM, oldRoboticArm, roboticArm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatform getMobilePlatform()
	{
		if (mobilePlatform != null && mobilePlatform.eIsProxy()) {
			InternalEObject oldMobilePlatform = (InternalEObject)mobilePlatform;
			mobilePlatform = (MobilePlatform)eResolveProxy(oldMobilePlatform);
			if (mobilePlatform != oldMobilePlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM, oldMobilePlatform, mobilePlatform));
			}
		}
		return mobilePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobilePlatform basicGetMobilePlatform()
	{
		return mobilePlatform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMobilePlatform(MobilePlatform newMobilePlatform)
	{
		MobilePlatform oldMobilePlatform = mobilePlatform;
		mobilePlatform = newMobilePlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM, oldMobilePlatform, mobilePlatform));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCamera getArmCamera() {
		if (armCamera != null && armCamera.eIsProxy()) {
			InternalEObject oldArmCamera = (InternalEObject)armCamera;
			armCamera = (PTUCamera)eResolveProxy(oldArmCamera);
			if (armCamera != oldArmCamera) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoverPackage.ROVER__ARM_CAMERA, oldArmCamera, armCamera));
			}
		}
		return armCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCamera basicGetArmCamera() {
		return armCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArmCamera(PTUCamera newArmCamera) {
		PTUCamera oldArmCamera = armCamera;
		armCamera = newArmCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__ARM_CAMERA, oldArmCamera, armCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCamera getCenterCamera() {
		if (centerCamera != null && centerCamera.eIsProxy()) {
			InternalEObject oldCenterCamera = (InternalEObject)centerCamera;
			centerCamera = (PTUCamera)eResolveProxy(oldCenterCamera);
			if (centerCamera != oldCenterCamera) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA, oldCenterCamera, centerCamera));
			}
		}
		return centerCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PTUCamera basicGetCenterCamera() {
		return centerCamera;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenterCamera(PTUCamera newCenterCamera) {
		PTUCamera oldCenterCamera = centerCamera;
		centerCamera = newCenterCamera;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA, oldCenterCamera, centerCamera));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public PowerSystem getPowerSystem()
	{
		if (powerSystem == null)
		{
			PowerSystem newPowerSystem = ApogyExamplesRoverFactory.eINSTANCE.createPowerSystem();
			
			// Add six batteries
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			newPowerSystem.getBatteries().add(ApogyExamplesRoverFactory.eINSTANCE.createBattery());
			
			// Set the active one to the first one
			newPowerSystem.changeActiveBatteryTo(0);
			
			// Set the power system accordingly
			this.setPowerSystem(newPowerSystem);
		}
		return powerSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPowerSystem(PowerSystem newPowerSystem, NotificationChain msgs) {
		PowerSystem oldPowerSystem = powerSystem;
		powerSystem = newPowerSystem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM, oldPowerSystem, newPowerSystem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPowerSystem(PowerSystem newPowerSystem) {
		if (newPowerSystem != powerSystem) {
			NotificationChain msgs = null;
			if (powerSystem != null)
				msgs = ((InternalEObject)powerSystem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM, null, msgs);
			if (newPowerSystem != null)
				msgs = ((InternalEObject)newPowerSystem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM, null, msgs);
			msgs = basicSetPowerSystem(newPowerSystem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM, newPowerSystem, newPowerSystem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getLinearVelocity() {
		MobilePlatform _mobilePlatform = this.getMobilePlatform();
		boolean _notEquals = (!Objects.equal(_mobilePlatform, null));
		if (_notEquals) {
			MobilePlatform _mobilePlatform_1 = this.getMobilePlatform();
			return _mobilePlatform_1.getLinearVelocity();
		}
		else {
			return 0.0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAngularVelocity() {
		MobilePlatform _mobilePlatform = this.getMobilePlatform();
		boolean _notEquals = (!Objects.equal(_mobilePlatform, null));
		if (_notEquals) {
			MobilePlatform _mobilePlatform_1 = this.getMobilePlatform();
			return _mobilePlatform_1.getAngularVelocity();
		}
		else {
			return 0.0;
		}
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__INITIALIZED, oldInitialized, initialized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisposed() {
		return disposed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisposed(boolean newDisposed) {
		boolean oldDisposed = disposed;
		disposed = newDisposed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.ROVER__DISPOSED, oldDisposed, disposed));
	}

	/**
	 * This operation is used to perform the required initialization functions
	 * on the rover assembly; this may involve bootstrapping the components
	 * of the rover (e.g. mobile platform, cameras, etc.)
	 * @return Whether or not the rover assembly was successfully initialized
	 * @generated_NOT
	 */
	abstract public boolean init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public void cmdChangeName(String name);

	/**
	 * This operation is used to dispose of the given rover, shutting down
	 * and releasing the rover's resources; this implicitly means that the
	 * rover will not be available after calling this method.
	 * @generated_NOT
	 */
	abstract public void dispose();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
				return basicSetPowerSystem(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * This operation is used to change the linear velocity of the rover
	 * assembly to the provided value (given in m/s); internally, this is
	 * likely to cause a change to the mobile platform, as it is this component
	 * which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	abstract public void cmdLinearVelocity(double linearVelocity);

	/**
	 * This operation is used to change the angular velocity of the rover
	 * assembly to the provided value (given in radians / second); internally,
	 * this is likely to cause a change to the mobile platform, as it is this
	 * component which actually moves the rover.
	 * <p>
	 * Note: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdVelocities(double, double)
	 * @generated_NOT
	 */
	abstract public void cmdAngularVelocity(double angularVelocity);

	/**
	 * This operation is used to change both the linear velocity (given in m/s)
	 * and angular velocity (given in rad/s) of the rover assembly to the
	 * provided values; internally, this is likely to cause a change to the
	 * mobile platform, as it is this component which actually moves the rover.
	 * <p>
	 * Note 1: Unlike the traditional definition of linear velocity as a vector,
	 * this is simply a signed scalar; a positive value indicates the speed
	 * forward while a negative value is the speed backwards.  Zero means there
	 * is no movement.
	 * <p>
	 * Note 2: Unlike the traditional definition of angular velocity as a vector,
	 * this is simply a signed scalar; a positive value is the rotation in the
	 * clockwise direction while a negative value implies the rotation is in the
	 * counter-clockwise direction.  Zero means there is no rotation.
	 * 
	 * @param linearVelocity The rover assembly's new linear velocity (in m/s)
	 * @param angularVelocity The rover assembly's new angular velocity (in rad/s)
	 * @see #cmdLinearVelocity(double)
	 * @see #cmdAngularVelocity(double)
	 * @generated_NOT
	 */
	abstract public void cmdVelocities(double linearVelocity, double angularVelocity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case ApogyExamplesRoverPackage.ROVER__NAME:
				return getName();
			case ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM:
				if (resolve) return getRoboticArm();
				return basicGetRoboticArm();
			case ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM:
				if (resolve) return getMobilePlatform();
				return basicGetMobilePlatform();
			case ApogyExamplesRoverPackage.ROVER__ARM_CAMERA:
				if (resolve) return getArmCamera();
				return basicGetArmCamera();
			case ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA:
				if (resolve) return getCenterCamera();
				return basicGetCenterCamera();
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
				return getPowerSystem();
			case ApogyExamplesRoverPackage.ROVER__LINEAR_VELOCITY:
				return getLinearVelocity();
			case ApogyExamplesRoverPackage.ROVER__ANGULAR_VELOCITY:
				return getAngularVelocity();
			case ApogyExamplesRoverPackage.ROVER__INITIALIZED:
				return isInitialized();
			case ApogyExamplesRoverPackage.ROVER__DISPOSED:
				return isDisposed();
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
			case ApogyExamplesRoverPackage.ROVER__NAME:
				setName((String)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM:
				setRoboticArm((RoboticArm)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM:
				setMobilePlatform((MobilePlatform)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__ARM_CAMERA:
				setArmCamera((PTUCamera)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA:
				setCenterCamera((PTUCamera)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
				setPowerSystem((PowerSystem)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__INITIALIZED:
				setInitialized((Boolean)newValue);
				return;
			case ApogyExamplesRoverPackage.ROVER__DISPOSED:
				setDisposed((Boolean)newValue);
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
			case ApogyExamplesRoverPackage.ROVER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM:
				setRoboticArm((RoboticArm)null);
				return;
			case ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM:
				setMobilePlatform((MobilePlatform)null);
				return;
			case ApogyExamplesRoverPackage.ROVER__ARM_CAMERA:
				setArmCamera((PTUCamera)null);
				return;
			case ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA:
				setCenterCamera((PTUCamera)null);
				return;
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
				setPowerSystem((PowerSystem)null);
				return;
			case ApogyExamplesRoverPackage.ROVER__INITIALIZED:
				setInitialized(INITIALIZED_EDEFAULT);
				return;
			case ApogyExamplesRoverPackage.ROVER__DISPOSED:
				setDisposed(DISPOSED_EDEFAULT);
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
			case ApogyExamplesRoverPackage.ROVER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyExamplesRoverPackage.ROVER__ROBOTIC_ARM:
				return roboticArm != null;
			case ApogyExamplesRoverPackage.ROVER__MOBILE_PLATFORM:
				return mobilePlatform != null;
			case ApogyExamplesRoverPackage.ROVER__ARM_CAMERA:
				return armCamera != null;
			case ApogyExamplesRoverPackage.ROVER__CENTER_CAMERA:
				return centerCamera != null;
			case ApogyExamplesRoverPackage.ROVER__POWER_SYSTEM:
				return powerSystem != null;
			case ApogyExamplesRoverPackage.ROVER__LINEAR_VELOCITY:
				return getLinearVelocity() != LINEAR_VELOCITY_EDEFAULT;
			case ApogyExamplesRoverPackage.ROVER__ANGULAR_VELOCITY:
				return getAngularVelocity() != ANGULAR_VELOCITY_EDEFAULT;
			case ApogyExamplesRoverPackage.ROVER__INITIALIZED:
				return initialized != INITIALIZED_EDEFAULT;
			case ApogyExamplesRoverPackage.ROVER__DISPOSED:
				return disposed != DISPOSED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesRoverPackage.ROVER__NAME: return ApogyCommonEMFPackage.NAMED__NAME;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.NAMED__NAME: return ApogyExamplesRoverPackage.ROVER__NAME;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case ApogyExamplesRoverPackage.ROVER___INIT:
				return init();
			case ApogyExamplesRoverPackage.ROVER___CMD_CHANGE_NAME__STRING:
				cmdChangeName((String)arguments.get(0));
				return null;
			case ApogyExamplesRoverPackage.ROVER___CMD_LINEAR_VELOCITY__DOUBLE:
				cmdLinearVelocity((Double)arguments.get(0));
				return null;
			case ApogyExamplesRoverPackage.ROVER___CMD_ANGULAR_VELOCITY__DOUBLE:
				cmdAngularVelocity((Double)arguments.get(0));
				return null;
			case ApogyExamplesRoverPackage.ROVER___CMD_VELOCITIES__DOUBLE_DOUBLE:
				cmdVelocities((Double)arguments.get(0), (Double)arguments.get(1));
				return null;
			case ApogyExamplesRoverPackage.ROVER___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", initialized: ");
		result.append(initialized);
		result.append(", disposed: ");
		result.append(disposed);
		result.append(')');
		return result.toString();
	}

} //RoverImpl
