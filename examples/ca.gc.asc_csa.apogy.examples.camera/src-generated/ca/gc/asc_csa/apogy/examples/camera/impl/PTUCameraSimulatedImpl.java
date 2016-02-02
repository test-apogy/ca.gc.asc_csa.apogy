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

import javax.vecmath.GVector;

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
import ca.gc.asc_csa.apogy.examples.camera.PTUCameraSimulated;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTU Camera Simulated</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#isMoving <em>Moving</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#getActuatorStatus <em>Actuator Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#getCurrentPanAngle <em>Current Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#getCurrentTiltAngle <em>Current Tilt Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#getCommandedPanAngle <em>Commanded Pan Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.camera.impl.PTUCameraSimulatedImpl#getCommandedTiltAngle <em>Commanded Tilt Angle</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTUCameraSimulatedImpl extends CameraSimulatedImpl implements PTUCameraSimulated
{
	/**
	 * This is the degree symbol, as expressed in unicode
	 */
	private static final String DEGREE_SYM = "\u00b0";
	
	/**
	 *  This constant specifies the minimum allowed pan angle
	 *  for the camera's PTU (in radians)
	 *  @see #moveTo(double, double, String)
	 */ 
	protected static final double MINIMUM_PAN_RADIANS = Math.toRadians(-170.0);

	/**
	 * This constant specifies the maximum allowed pan angle
	 * for the camera's PTU (in radians)
	 * @see #moveTo(double, double, String)
	 */
	protected static final double MAXIMUM_PAN_RADIANS = Math.toRadians(170.0);

	/**
	 * This constant specifies the minimum allowed tilt angle
	 * for the camera's PTU (in radians)
	 * @see #moveTo(double, double, String)
	 */
	protected static final double MINIMUM_TILT_RADIANS = Math.toRadians(-45.0);

	/**
	 * This constant specifies the maximum allowed tilt angle
	 * for the camera's PTU (in radians)
	 * @see #moveTo(double, double, String)
	 */
	protected static final double MAXIMUM_TILT_RADIANS = Math.toRadians(90.0);

	/**
	 * This constant specifies the angular speed (in °/s) of
	 * all the joints of the camera's PTU when they move.
	 * @see #computeDeltaTime(GVector, GVector)
	 */
	private static final double MOVE_TO_ANGULAR_SPEED = 10.0;

	/**
	 * This constant specifies the time period (in milliseconds)
	 * that the thread should wait between intermediate move steps
	 * @see #moveToConfiguration(GVector, GVector) 
	 */
	private static final int MOVE_TO_WAIT_PERIOD = 50;

	/**
	 * This is used to determine whether or not to stop a move in progress
	 * @see #stopMotion()
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	protected boolean stopMoving = false;


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
	protected PTUCameraSimulatedImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesCameraPackage.Literals.PTU_CAMERA_SIMULATED;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING, oldMoving, moving));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS, oldActuatorStatus, actuatorStatus));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE, oldCurrentPanAngle, currentPanAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE, oldCurrentTiltAngle, currentTiltAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE, oldCommandedPanAngle, commandedPanAngle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE, oldCommandedTiltAngle, commandedTiltAngle));
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
		// Return the maximum allowed pan angle (in radians.)
		return MAXIMUM_PAN_RADIANS;
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
		// Return the minimum allowed pan angle (in radians.)
		return MINIMUM_PAN_RADIANS;
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
		// Return the maximum allowed tilt angle (in radians.)
		return MAXIMUM_TILT_RADIANS;
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
		// Return the minimum allowed tilt angle (in radians)
		return MINIMUM_TILT_RADIANS;
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
		String logPrefix = this.getClass().getSimpleName() + ".init(): ";

		// If the PTU camera was already initialized
		if (this.isInitialized() == true)
		{
			// Log this fact
			String message = logPrefix + "Ignored; init() has already been successfully called.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Just indicate that it was initialized
			return true;
		}
		// Otherwise, it hasn't been initialized yet
		else
		{
			// Call the superclass's init()
			super.init();

			// Perform whatever initialization is necessary for the PTU
			setActuatorStatus(ActuatorStatus.READY);

			// Indicate the successful init()
			String message = logPrefix + "The PTU camera has been initialized.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Return true
			return true;
		}
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveToPanTilt(" + Math.toDegrees(panAngle) +
									DEGREE_SYM + ", " +	Math.toDegrees(tiltAngle) +
									DEGREE_SYM + "): ";

		// Move the PTU to the specify pan and tilt angles, logging as appropriate
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveToPan(" + Math.toDegrees(panAngle) +
									DEGREE_SYM + "): ";

		// Get the current tilt angle (in radians)
		double tiltAngle = getCurrentTiltAngle();

		// Move the PTU to the specified pan angle, logging as appropriate
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveToTilt(" + Math.toDegrees(tiltAngle) +
									DEGREE_SYM + "): ";

		// Get the current pan angle (in radians)
		double panAngle = getCurrentPanAngle();

		// Move the PTU to the specified tilt angle, logging as appropriate
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
	}

	/**
	 * This operation is used to move the Pan-Tilt Unit (PTU), and implicitly
	 * the camera that's mounted to it, by the specified change (delta) to the
	 * pan angle (in radians.)
	 * @param panAngleDelta The amount (in radians) to change the PTU's pan angle.
	 * @return Whether or not moving the PTU's pan angle by the specified amount was successful
	 * @see #moveByPanTilt(double, double)
	 * @generated_NOT
	 */
	@Override
	public boolean moveByPan(double panAngleDelta) 
	{
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveByPan(" + Math.toDegrees(panAngleDelta) +
									DEGREE_SYM + "): ";

		// Calculate the target pan angle (in radians)
		double panAngle = getCurrentPanAngle() + panAngleDelta;

		// Get the current tilt angle (in radians)
		double tiltAngle = getCurrentTiltAngle();

		// Move the PTU's pan angle by the specified amount, logging as appropriate  
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveByTilt(" + Math.toDegrees(tiltAngleDelta) +
									DEGREE_SYM + "): ";

		// Get the current pan angle (in radians)
		double panAngle = getCurrentPanAngle();

		// Calculate the target tilt angle (in radians)
		double tiltAngle = getCurrentTiltAngle() + tiltAngleDelta;

		// Move the PTU's tilt angle by the specified amount, logging as appropriate
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".moveByPanTilt(" + Math.toDegrees(panAngleDelta) +
									DEGREE_SYM + ", " +	Math.toDegrees(tiltAngleDelta) +
									DEGREE_SYM + "): ";

		// Calculate the target pan angle (in radians)
		double panAngle = getCurrentPanAngle() + panAngleDelta;

		// Calculate the target tilt angle (in radians)
		double tiltAngle = getCurrentTiltAngle() + tiltAngleDelta;

		// Move the PTU's pan and tilt angles by the specified amount, logging as appropriate
		return moveTo(panAngle, tiltAngle, LOG_PREFIX);
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
		final String LOG_PREFIX = this.getClass().getSimpleName() +
									".stopMotion(): ";

		// If the PTU camera hasn't been initialized
		if (this.isInitialized() == false)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the PTU camera is not initialized (with init()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

			// Indicate that the stop was unsuccessful
			return false;
		}
		// If the camera's PTU is not actually moving
		else if (this.isMoving() == false)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the PTU camera is not currently moving.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

			// Indicate that the stop was unsuccessful
			return false;
		}
		// Else if a stop request has already been made
		else if (this.stopMoving == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Ignored; a stop request for this move has already been made.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Indicate that the stop request was already made
			return true;
		}
		// Otherwise, the camera's initialized, moving and no request has already been made
		else
		{  
			// Log this event
			String message = LOG_PREFIX +
								"A stop request has been made; " +
								"the PTU camera's move should stop shortly.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

			// Trigger the stop of the camera
			this.stopMoving = true;

			// Indicate that the stop request was successfully made
			return true;
		}
	}

	/**
	 * This is a private helper method that is used to implement the logic
	 * required to implement the movement of the camera's PTU unit to the
	 * specified angle configuration (in radians.) Any required logging will
	 * take place.
	 * 
	 * Note 1: It is possible to stop the movement of the camera's PTU
	 * 		 with a call to stopMotion(); this will trigger a stop
	 * 		 request and the move will stop at the earliest possible
	 * 		 moment.
	 * 
	 * Note 2: The reconfiguration will be rejected if either the pan angle
	 * 		 or the tilt angle is out of acceptable range, which is
	 * 		 [getMinimumPanAngle(), getMaximumPanAngle()] and
	 * 		 [getMinimumTiltAngle(),getMaximumTiltAngle()], respectively.
	 * 
	 * @param panAngle The desired final pan angle of the camera's PTU
	 * @param tiltAngle The desired final tilt angle of the camera's PTU
	 * @param logPrefix The prefix string, to provide targeted logging statements.
	 * @see #moveToPan(double)
	 * @see #moveToTilt(double)
	 * @see #moveToPanTilt(double, double)
	 * @see #moveByPan(double)
	 * @see #moveByTilt(double)
	 * @see #moveByPanTilt(double, double)
	 * @see #moveToConfiguration(GVector, GVector)
	 * @return Whether or not the camera successfully ended up at the target angles.
	 */
	private boolean moveTo(double panAngle, double tiltAngle, final String LOG_PREFIX) 
	{
		// If the PTU camera hasn't been initialized
		if (this.isInitialized() == false)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the PTU camera is not initialized (with init()).";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

			// Indicate that the move was unsuccessful
			return false;
		}
		// Else if the PTU camera is already moving
		else if (this.isMoving() == true)
		{
			// Log this event
			String message = LOG_PREFIX +
								"Ignored; the PTU camera is currently in the middle of another move.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

			// Indicate that the move was unsuccessful
			return false;
		}
		
		// Update the commanded pan and tilt angles
		setCommandedPanAngle(panAngle);
		setCommandedTiltAngle(tiltAngle);
		
		// If the provided pan angle is out of range
		if ((panAngle < getMinimumPanAngle()) ||
		    (panAngle > getMaximumPanAngle()))
		{
			// If the given tilt angle is also out of range
			if ((tiltAngle < getMinimumTiltAngle()) ||
				(tiltAngle > getMaximumTiltAngle()))
			{
				// Log this event
				String message = LOG_PREFIX +
									"Rejected; both the effective pan angle (" + 
									Math.toDegrees(panAngle) + DEGREE_SYM +
									") and tilt angle (" + Math.toDegrees(tiltAngle) +
									DEGREE_SYM + ") are out of the accepted range of values.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

				// Indicate that the move was rejected
				return false;
			}
			// Otherwise, the tilt angle is in range
			else
			{
				// Log this event
				String message = LOG_PREFIX +
									"Rejected; the effective pan angle (" +
									Math.toDegrees(panAngle) + DEGREE_SYM +
									") is out of the accepted range of values.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

				// Indicate that the move was rejected
				return false;
			}
		}
		// Otherwise, if the pan angle is in range but the tile angle is out of range
		else if ((tiltAngle < getMinimumTiltAngle()) ||
				 (tiltAngle > getMaximumTiltAngle()))
		{
			// Log this event
			String message = LOG_PREFIX +
								"Rejected; the effective tilt angle (" +
								Math.toDegrees(tiltAngle) + DEGREE_SYM + 
								") is out of the accepted range of values.";
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);

			// Indicate that the move was rejected
			return false;
		}
		// Otherwise, the PTU camera is initialized and the angles are in range
		else
		{
			// If the given pan and tilt angles are the same as the current angles
			if ((panAngle == this.getCurrentPanAngle()) &&
				(tiltAngle == this.getCurrentTiltAngle()))
			{
				// Log this event
				String message = LOG_PREFIX +
						"Ignored; no move is required as the given pan and/or tilt " +
						"angles matches those of the camera's PTU.";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.WARNING);

				// Indicate that the move was successful
				return true;
			}
			// Otherwise, the PTU unit needs to move
			else
			{			  
				// Make a vector out of the current pan and tilt angles
				final GVector initialAngles = new GVector(new double[]{getCurrentPanAngle(),
																	   getCurrentTiltAngle()});

				// Make a vector out of the desired final pan and tilt angles
				final GVector finalAngles = new GVector(new double[]{panAngle,
																	 tiltAngle});	

				// Log the start of the move
				String message = LOG_PREFIX + "PTU camera move started " +
									"(Target Pan=" + Math.toDegrees(panAngle) +
									DEGREE_SYM + ", Tilt=" + Math.toDegrees(tiltAngle) +
									DEGREE_SYM + ").";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

				// Indicate that the actuator (the PTU) is busy and now moving
				setActuatorStatus(ActuatorStatus.BUSY);
				setMoving(true);

				// Actually trigger the movement of the camera's PTU
				moveToConfiguration(initialAngles, finalAngles);

				// Indicate that the actuator (the PTU) is now available and has stopped moving
				setMoving(false);
				setActuatorStatus(ActuatorStatus.READY);

				// Clear the stop movement request (if it was set)
				this.stopMoving = false;

				// Log the end of the move (Note: that because the move can be interrupted,
				// the final angles are important)
				message = LOG_PREFIX + "PTU camera move completed " +
							"(Current Pan=" + Math.toDegrees(this.getCurrentPanAngle()) +
							DEGREE_SYM + ", Tilt=" + Math.toDegrees(this.getCurrentTiltAngle()) +
							DEGREE_SYM + ").";
				Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);

				// Indicate that the move was successful
				return true;
			}
		}
	}

	/**
	 * This private helper method is used to move the camera's current pan
	 * and tilt angles to the desired target angles (where both sets of
	 * angles here are represented as vectors.)
	 * 
	 * Note: It is possible to interrupt the movement (reconfiguration)
	 * of the camera's PTU with a call to stopMotion(); this will send
	 * a stop request and the move will stop at the earliest possible moment.
	 * 
	 * @param initialJointAngles The initial (i.e. current) set of angles (pan and tilt) for the camera's PTU  
	 * @param finalJointAngles The desired final set of angles (pan and tilt) for the camera's PTU
	 * @see #moveTo(double, double, String)
	 * @see #computeDeltaTime(GVector, GVector)
	 * @see #stopMotion()
	 */
	private void moveToConfiguration(final GVector initialJointAngles, final GVector finalJointAngles)
	{
		// Get a copy of the initial pan and tilt angles
		GVector interpolatedJointAngles = new GVector(initialJointAngles);

		// Determine how much to change the angles at each intermediate move step
		// Used to facilitate the vector interpolation process.
		double deltaT = computeDeltaTime(initialJointAngles, finalJointAngles);

		// Keep track of the current position in the movement (i.e. interpolation) process 
		double t = -deltaT;

		// While not at the final pan and tilt angles AND no
		// stop movement request has been made (via stopMotion())
		while ((t <= 1.0) &&
			   (this.stopMoving == false))
		{
			// Update the movement progress
			t += deltaT;

			// Interpolate the angles (Recall that t=0 refers to the initial angles
			// while t=1 refers to the final angles.)
			interpolatedJointAngles.interpolate(initialJointAngles, finalJointAngles, t);		

			// Update the current joint values accordingly		
			setCurrentPanAngle(interpolatedJointAngles.getElement(0));
			setCurrentTiltAngle(interpolatedJointAngles.getElement(1));

			try 
			{
				// Sleep for a short period of time (this makes it far
				// easier to visualize and follow the movement of the PTU camera)
				Thread.sleep(MOVE_TO_WAIT_PERIOD);
			}
			catch (InterruptedException ex) 
			{
				// Print the stack trace
				ex.printStackTrace();
			}
		}
	}

	/**
	 * This helper function is used to determine the change in time (delta t) for each step
	 * when determining the current interpolation from the initial angle vector to the
	 * final (i.e. desired) angle vector.
	 * 
	 * Note 1: This is dependent on the fixed angular speed (in degrees / second) of the joint
	 * 
	 * Note 2: There's an implicit assumption that the pan and tilt joints both have the same
	 * 		   speed, which may or may not be true.
	 * 
	 * @param initialJointAngles The initial joint configuration (in degrees) of the PTU camera
	 * @param finalJointAngles The desired final joint configuration (in degrees) of the camera
	 * @return The change in time (delta t) required for each time step.
	 * @see #moveToConfiguration(GVector, GVector)
	 */
	private double computeDeltaTime(final GVector initialJointAngles, final GVector finalJointAngles)
	{
		// Determine the joint which requires the most reconfiguration (in radians)
		double largestMove = 0;
		
		// Go through all of the joints
		for(int i = 0; i < initialJointAngles.getSize(); i++)
		{
			// Determine the difference between the initial joint angle and the final angle
			double deltaAngle = Math.abs(finalJointAngles.getElement(i) - 
										 initialJointAngles.getElement(i));
			
			// If this is larger than the current max
			if(deltaAngle > largestMove)
			{
				// Update the max accordingly
				largestMove = deltaAngle;
			}
		}

		// Figure out how many seconds it will take to move all the joints
		double travelTime = largestMove / Math.toRadians(MOVE_TO_ANGULAR_SPEED);
		
		// Divide the time per step (in seconds) by the travel time
		// This is the amount of progress that should be made by each move step
		double deltaTime = (0.001 * MOVE_TO_WAIT_PERIOD) / travelTime;

		// Return the delta t
		return deltaTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING:
				return isMoving();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS:
				return getActuatorStatus();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE:
				return getCurrentPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE:
				return getCurrentTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE:
				return getCommandedPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE:
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
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING:
				setMoving((Boolean)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS:
				setActuatorStatus((ActuatorStatus)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE:
				setCurrentPanAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle((Double)newValue);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE:
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
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING:
				setMoving(MOVING_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS:
				setActuatorStatus(ACTUATOR_STATUS_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE:
				setCurrentPanAngle(CURRENT_PAN_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE:
				setCurrentTiltAngle(CURRENT_TILT_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE:
				setCommandedPanAngle(COMMANDED_PAN_ANGLE_EDEFAULT);
				return;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE:
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
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING:
				return moving != MOVING_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS:
				return actuatorStatus != ACTUATOR_STATUS_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE:
				return currentPanAngle != CURRENT_PAN_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE:
				return currentTiltAngle != CURRENT_TILT_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE:
				return commandedPanAngle != COMMANDED_PAN_ANGLE_EDEFAULT;
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE:
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
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING: return ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING;
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS: return ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE;
				case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE: return ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE;
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
				case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__MOVING: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__MOVING;
				case ApogyAddonsActuatorsPackage.ABSTRACT_ACTUATOR__ACTUATOR_STATUS: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__ACTUATOR_STATUS;
				default: return -1;
			}
		}
		if (baseClass == PanTiltUnit.class) {
			switch (baseFeatureID) {
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__CURRENT_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__CURRENT_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT__COMMANDED_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED__COMMANDED_TILT_ANGLE;
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
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MAXIMUM_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_PAN_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MINIMUM_PAN_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MAXIMUM_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MAXIMUM_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___GET_MINIMUM_TILT_ANGLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MINIMUM_TILT_ANGLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_PAN__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_PAN__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_TO_TILT__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_TILT__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_PAN__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_PAN__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___MOVE_BY_TILT__DOUBLE: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_TILT__DOUBLE;
				case ApogyAddonsActuatorsPackage.PAN_TILT_UNIT___STOP_MOTION: return ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___STOP_MOTION;
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
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MAXIMUM_PAN_ANGLE:
				return getMaximumPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MINIMUM_PAN_ANGLE:
				return getMinimumPanAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MAXIMUM_TILT_ANGLE:
				return getMaximumTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___GET_MINIMUM_TILT_ANGLE:
				return getMinimumTiltAngle();
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_PAN_TILT__DOUBLE_DOUBLE:
				return moveToPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_PAN__DOUBLE:
				return moveToPan((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_TO_TILT__DOUBLE:
				return moveToTilt((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_PAN_TILT__DOUBLE_DOUBLE:
				return moveByPanTilt((Double)arguments.get(0), (Double)arguments.get(1));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_PAN__DOUBLE:
				return moveByPan((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___MOVE_BY_TILT__DOUBLE:
				return moveByTilt((Double)arguments.get(0));
			case ApogyExamplesCameraPackage.PTU_CAMERA_SIMULATED___STOP_MOTION:
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

} //PTUCameraSimulatedImpl
