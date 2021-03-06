package ca.gc.asc_csa.apogy.examples.camera.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.actuators.AbstractActuator;
import ca.gc.asc_csa.apogy.addons.actuators.ActuatorStatus;
import ca.gc.asc_csa.apogy.addons.actuators.ApogyAddonsActuatorsPackage;
import ca.gc.asc_csa.apogy.addons.actuators.PanTiltUnit;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.camera.Activator;
import ca.gc.asc_csa.apogy.examples.camera.ApogyExamplesCameraPackage;
import ca.gc.asc_csa.apogy.examples.camera.PTUCamera;
import ca.gc.asc_csa.apogy.examples.camera.PTUCameraStub;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Camera Stub</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#getActuatorStatus <em>Actuator Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#getCurrentPanAngle <em>Current Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#getCurrentTiltAngle <em>Current Tilt Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#getCommandedPanAngle <em>Commanded Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraStubImpl#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTUCameraStubImpl extends CameraStubImpl implements PTUCameraStub
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
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
	protected PTUCameraStubImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesCameraPackage.Literals.PTU_CAMERA_STUB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMoving() {
		return moving;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoving(boolean newMoving) {
		boolean oldMoving = moving;
		moving = newMoving;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING, oldMoving, moving));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActuatorStatus getActuatorStatus() {
		return actuatorStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActuatorStatus(ActuatorStatus newActuatorStatus) {
		ActuatorStatus oldActuatorStatus = actuatorStatus;
		actuatorStatus = newActuatorStatus == null ? ACTUATOR_STATUS_EDEFAULT : newActuatorStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS, oldActuatorStatus, actuatorStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentPanAngle() {
		return currentPanAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPanAngle(double newCurrentPanAngle) {
		double oldCurrentPanAngle = currentPanAngle;
		currentPanAngle = newCurrentPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE, oldCurrentPanAngle, currentPanAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentTiltAngle() {
		return currentTiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTiltAngle(double newCurrentTiltAngle) {
		double oldCurrentTiltAngle = currentTiltAngle;
		currentTiltAngle = newCurrentTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE, oldCurrentTiltAngle, currentTiltAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedPanAngle() {
		return commandedPanAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedPanAngle(double newCommandedPanAngle) {
		double oldCommandedPanAngle = commandedPanAngle;
		commandedPanAngle = newCommandedPanAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE, oldCommandedPanAngle, commandedPanAngle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCommandedTiltAngle() {
		return commandedTiltAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandedTiltAngle(double newCommandedTiltAngle) {
		double oldCommandedTiltAngle = commandedTiltAngle;
		commandedTiltAngle = newCommandedTiltAngle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE, oldCommandedTiltAngle, commandedTiltAngle));
	}

	/**
	 * This operation is used to initialize the simulated camera, performing
	 * whatever operations are required in order to get it ready for use.
	 * @return Whether or not the simulated camera was successfully initialized.
	 * @generated_NOT
	 */
	@Override
	public boolean init()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the PTU camera would have been initialized.
		String message = this.getClass().getSimpleName() + 
							".init(): Just a stub - " +
							"the necessary initialization for the PTU " +
							"camera would have taken place.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just indicate the operation would have succeeded
		return true;
	}

	
	/**
	 * This operation returns the maximum allowed pan angle (in radians)
	 * for the camera's Pan-Tilt Unit (PTU).
	 * @return The PTU's maximum pan angle (in radians.)
	 * @see #getMinimumPanAngle() 
	 * @generated_NOT
	 */
	@Override
	public double getMaximumPanAngle()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the largest-allowed pan
		// angle (in radians) for the camera would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMaximumPanAngle(): Just a stub - " +
							"the largest allowed pan angle would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current pan angle
		return this.getCurrentPanAngle();
	}

	/**
	 * This operation returns the minimum allowed pan angle (in radians)
	 * for the camera's Pan-Tilt Unit (PTU).
	 * @return The PTU's minimum pan angle (in radians.)
	 * @see #getMaximumPanAngle()
	 * @generated_NOT
	 */
	@Override
	public double getMinimumPanAngle()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the smallest-allowed pan
		// angle (in radians) for the camera would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMinimumPanAngle(): Just a stub - " +
							"the smallest allowed pan angle would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current pan angle
		return this.getCurrentPanAngle();
	}

	/**
	 * This operation returns the maximum allowed tilt angle (in radians)
	 * for the camera's Pan-Tilt Unit (PTU).
	 * @return The PTU's maximum tilt angle (in radians.)
	 * @see #getMinimumTiltAngle()
	 * @generated_NOT
	 */
	@Override
	public double getMaximumTiltAngle()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the largest-allowed tilt
		// angle (in radians) for the camera would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMaximumTiltAngle(): Just a stub - " +
							"the largest allowed tilt angle would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current tilt angle
		return this.getCurrentTiltAngle();
	}

	/**
	 * This operation returns the minimum allowed tilt angle (in radians)
	 * for the camera's Pan-Tilt Unit (PTU).
	 * @return The PTU's minimum tilt angle (in radians.)
	 * @see #getMaximumTiltAngle()
	 * @generated_NOT
	 */
	@Override
	public double getMinimumTiltAngle()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the smallest-allowed tilt
		// angle (in radians) for the camera would have been returned.
		String message = this.getClass().getSimpleName() +
							".getMinimumTiltAngle(): Just a stub - " +
							"the smallest allowed tilt angle would have been returned.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return the current tilt angle
		return this.getCurrentTiltAngle();
	}


	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted on it, to the specified pan and tilt angles
	 * (in radians.) 
	 * @param panAngle The desired final pan angle (in radians) for the PTU.
	 * @param tiltAngle The desired final tilt angle (in radians) for the PTU.
	 * @return Whether or not moving the PTU to the specified pan and tilt angles was successful
	 * @see #moveToPan(double)
	 * @see #moveToTilt(double)
	 * @generated_NOT
	 */
	@Override
	public boolean moveToPanTilt(double panAngle, double tiltAngle)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's PTU would
		// have moved to the specified pan and tilt angles.
		String message = this.getClass().getSimpleName() +
							".moveToPanTilt(" + Math.toDegrees(panAngle) +
							DEGREE_SYM + ", " +	Math.toDegrees(tiltAngle) +
							DEGREE_SYM + "): Just a stub - " +
							"the camera's PTU would have moved " +
							"to the specified pan and tilt angles.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}
	
	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted on it, to the specified pan angle (in radians.)
	 * @param panAngle The desired final pan angle (in radians) for the PTU.
	 * @return Whether or not moving the PTU to the specified pan angle was successful
	 * @see #moveByPanTilt(double, double)
	 * @generated_NOT
	 */
	@Override
	public boolean moveToPan(double panAngle)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's PTU would
		// have moved to the specified pan angle.
		String message = this.getClass().getSimpleName() +
							".moveToPan(" + Math.toDegrees(panAngle) +
							DEGREE_SYM + "): Just a stub - " +
							"the camera's PTU would have moved to the specified pan angle.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted on it, to the specified tilt angle (in radians.)
	 * @param tiltAngle The desired final tilt angle (in radians) for the PTU.
	 * @return Whether or not moving the PTU to the specified tilt angle was successful
	 * @see #moveToPanTilt(double, double)
	 * @generated_NOT
	 */
	@Override
	public boolean moveToTilt(double tiltAngle)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's PTU would
		// have moved to the specified tilt angle.
		String message = this.getClass().getSimpleName() +
							".moveToTilt(" + Math.toDegrees(tiltAngle) +
							DEGREE_SYM + "): Just a stub - " +
							"the camera's PTU would have moved to the specified tilt angle.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted on it, by the specified changes (deltas) to
	 * the pan and tilt angles (in radians.)
	 * @param panAngleDelta The amount (in radians) to change the PTU's pan angle.
	 * @param tiltAngleDelta The amount (in radians) to change the PTU's tilt angle.
	 * @return Whether or not moving the PTU's pan and tilt angles by the specified amounts was successful
	 * @see #moveByPan(double)
	 * @see #moveByTilt(double) 
	 * @generated_NOT
	 */
	@Override
	public boolean moveByPanTilt(double panAngleDelta, double tiltAngleDelta)
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the pan and tilt angles
		// of the camera's PTU would have moved by the specified amounts.
		String message = this.getClass().getSimpleName() +
							".moveByPanTilt(" + Math.toDegrees(panAngleDelta) +
							DEGREE_SYM + ", " +	Math.toDegrees(tiltAngleDelta) +
							DEGREE_SYM + "): Just a stub - " +
							"the pan and tilt angles of the camera's PTU" +
							"would have moved by the specified amounts.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted to it, by the specified change (delta) to the
	 * pan angle (in radians.)
	 * @param panAngleDelta The amount (in radians) to change the PTU's pan angle.
	 * @return Whether or not moving the PTU's pan angle by the specified amount was successful
	 * @see #moveByPanTilt(double, double)
	 * @generated_NOR
	 */
	@Override
	public boolean moveByPan(double panAngleDelta)
	{
		// Generate the message and log it
		// As this a stub, just indicate that the pan angle of the camera's
		// PTU would have moved by the specified amount.
		String message = this.getClass().getSimpleName() + ".moveByPan(" + 
							Math.toDegrees(panAngleDelta) +	DEGREE_SYM +
							"): Just a stub - the pan angle of the camera's " +
							"PTU would have moved by the specified amount.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted to it, by the specified change (delta) to the
	 * tilt angle (in radians.)
	 * @param tiltAngleDelta The amount (in radians) to change the PTU's tilt angle.
	 * @return Whether or not moving the PTU's tilt angle by the specified amount was successful
	 * @see #moveByPanTilt(double, double)
	 * @generated_NOT
	 */
	@Override
	public boolean moveByTilt(double tiltAngleDelta)
	{
		// Generate the message and log it
		// As this a stub, just indicate that the tilt angle of the camera's
		// PTU would have moved by the specified amount.
		String message = this.getClass().getSimpleName() + ".moveByTilt(" +
							Math.toDegrees(tiltAngleDelta) + DEGREE_SYM +
							"): Just a stub - the tilt angle of the camera's " +
							"PTU would have moved by the specified amount.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * This operation is used to stop the movement of the camera's Pan-Tilt Unit (PTU),
	 * if it is actually moving.
	 * @return Whether or not the movement of the PTU was successfully halted.
	 * @see #stopMoving
	 * @generated_NOT
	 */
	@Override
	public boolean stopMotion()
	{
		// Generate the message and log it
		// As this is a stub, just indicate that the camera's PTU
		// would have stopped moving, if it had, in fact, been moving.
		String message = this.getClass().getSimpleName() +
							".stopMotion(): Just a stub - " + 
							"had the camera's PTU been moving, " +
							"it have stopped doing so, regardless of " +
							"whether or not the desired move was completed.";
		Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
		
		// Just return true
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING:
				return isMoving();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS:
				return getActuatorStatus();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE:
				return getCurrentPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE:
				return getCurrentTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE:
				return getCommandedPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE:
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING:
				setMoving((Boolean)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS:
				setActuatorStatus((ActuatorStatus)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE:
				setCurrentPanAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE:
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS:
				setActuatorStatus(ACTUATOR_STATUS_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE:
				setCurrentPanAngle(CURRENT_PAN_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle(CURRENT_TILT_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle(COMMANDED_PAN_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE:
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING:
				return moving != MOVING_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS:
				return actuatorStatus != ACTUATOR_STATUS_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE:
				return currentPanAngle != CURRENT_PAN_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE:
				return currentTiltAngle != CURRENT_TILT_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE:
				return commandedPanAngle != COMMANDED_PAN_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE:
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
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AbstractActuator.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING: return ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING;
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS: return ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE;
				default: return -1;
			}
		}
		if (baseClass == PTUCamera.class) {
			switch (derivedFeatureID) {
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
		if (baseClass == AbstractActuator.class) {
			switch (baseFeatureID) {
				case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__MOVING;
				case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (baseFeatureID) {
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__CURRENT_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB__COMMANDED_TILT_ANGLE;
				default: return -1;
			}
		}
		if (baseClass == PTUCamera.class) {
			switch (baseFeatureID) {
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
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == AbstractActuator.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (baseOperationID) {
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MAXIMUM_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MINIMUM_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MAXIMUM_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MINIMUM_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_PAN__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_TILT__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_PAN__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_TILT__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___STOP_MOTION: return ApogyExamplesCameraPackage.PTU_CAMERA_STUB___STOP_MOTION;
				default: return -1;
			}
		}
		if (baseClass == PTUCamera.class) {
			switch (baseOperationID) {
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MAXIMUM_PAN_ANGLE:
				return getMaximumPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MINIMUM_PAN_ANGLE:
				return getMinimumPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MAXIMUM_TILT_ANGLE:
				return getMaximumTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___GET_MINIMUM_TILT_ANGLE:
				return getMinimumTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE:
				return moveToPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_PAN__DOUBLE:
				return moveToPan((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_TO_TILT__DOUBLE:
				return moveToTilt((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE:
				return moveByPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_PAN__DOUBLE:
				return moveByPan((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___MOVE_BY_TILT__DOUBLE:
				return moveByTilt((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_STUB___STOP_MOTION:
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
	public String toString() {
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

} //PTUCameraStubImpl
