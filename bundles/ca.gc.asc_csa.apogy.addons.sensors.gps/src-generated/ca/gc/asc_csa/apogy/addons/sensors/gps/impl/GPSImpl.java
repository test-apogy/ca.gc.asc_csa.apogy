package ca.gc.asc_csa.apogy.addons.sensors.gps.impl;
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
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPS;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSConnection;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSDataInterpreter;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSReading;
import ca.gc.asc_csa.apogy.addons.sensors.gps.GPSStatus;
import ca.gc.asc_csa.apogy.addons.sensors.gps.ApogyAddonsSensorsGPSPackage;
import ca.gc.asc_csa.apogy.addons.sensors.gps.state.GPSState;
import ca.gc.asc_csa.apogy.addons.sensors.gps.state.GPSStateFactory;
import ca.gc.asc_csa.apogy.common.lang.java.Timer;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>GPS</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getConnection <em>Connection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getDataInterpreter <em>Data Interpreter</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getReading <em>Reading</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getUpdateRate <em>Update Rate</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getLastFailure <em>Last Failure</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getMaxReconnectTime <em>Max Reconnect Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getSpeedKnots <em>Speed Knots</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.gps.impl.GPSImpl#getSpeedKmh <em>Speed Kmh</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPSImpl extends MinimalEObjectImpl.Container implements GPS {

	/**
	 * The current state we are in.
	 */
	private GPSState gpsState;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected GPSConnection connection;

	/**
	 * The job reading from the gps.
	 */
	private Job gpsJob;

	/**
	 * The cached value of the '{@link #getDataInterpreter() <em>Data Interpreter</em>}' containment reference.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #getDataInterpreter()
	 * @generated
	 * @ordered
	 */
	protected GPSDataInterpreter dataInterpreter;

	/**
	 * The cached value of the '{@link #getReading() <em>Reading</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getReading()
	 * @generated
	 * @ordered
	 */
	protected GPSReading reading;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final GPSStatus STATUS_EDEFAULT = GPSStatus.STOPPED;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected GPSStatus status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdateRate() <em>Update Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpdateRate()
	 * @generated
	 * @ordered
	 */
	protected static final long UPDATE_RATE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getUpdateRate() <em>Update Rate</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getUpdateRate()
	 * @generated
	 * @ordered
	 */
	protected long updateRate = UPDATE_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastFailure() <em>Last Failure</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastFailure()
	 * @generated
	 * @ordered
	 */
	protected static final Exception LAST_FAILURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastFailure() <em>Last Failure</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getLastFailure()
	 * @generated
	 * @ordered
	 */
	protected Exception lastFailure = LAST_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxReconnectTime() <em>Max Reconnect Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxReconnectTime()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_RECONNECT_TIME_EDEFAULT = 10000;

	/**
	 * The cached value of the '{@link #getMaxReconnectTime() <em>Max Reconnect Time</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxReconnectTime()
	 * @generated
	 * @ordered
	 */
	protected int maxReconnectTime = MAX_RECONNECT_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedKnots() <em>Speed Knots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedKnots()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_KNOTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeedKnots() <em>Speed Knots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedKnots()
	 * @generated
	 * @ordered
	 */
	protected double speedKnots = SPEED_KNOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpeedKmh() <em>Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected static final double SPEED_KMH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSpeedKmh() <em>Speed Kmh</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpeedKmh()
	 * @generated
	 * @ordered
	 */
	protected double speedKmh = SPEED_KMH_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	protected GPSImpl() {
		super();
		status = GPSStatus.STOPPED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsGPSPackage.Literals.GPS;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSConnection getConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(GPSConnection newConnection,
			NotificationChain msgs) {
		GPSConnection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(GPSConnection newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsGPSPackage.GPS__CONNECTION, null, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsGPSPackage.GPS__CONNECTION, null, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__CONNECTION, newConnection, newConnection));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSDataInterpreter getDataInterpreter() {
		return dataInterpreter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataInterpreter(
			GPSDataInterpreter newDataInterpreter, NotificationChain msgs) {
		GPSDataInterpreter oldDataInterpreter = dataInterpreter;
		dataInterpreter = newDataInterpreter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER, oldDataInterpreter, newDataInterpreter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataInterpreter(GPSDataInterpreter newDataInterpreter) {
		if (newDataInterpreter != dataInterpreter) {
			NotificationChain msgs = null;
			if (dataInterpreter != null)
				msgs = ((InternalEObject)dataInterpreter).eInverseRemove(this, ApogyAddonsSensorsGPSPackage.GPS_DATA_INTERPRETER__GPS, GPSDataInterpreter.class, msgs);
			if (newDataInterpreter != null)
				msgs = ((InternalEObject)newDataInterpreter).eInverseAdd(this, ApogyAddonsSensorsGPSPackage.GPS_DATA_INTERPRETER__GPS, GPSDataInterpreter.class, msgs);
			msgs = basicSetDataInterpreter(newDataInterpreter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER, newDataInterpreter, newDataInterpreter));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public GPSReading getReading() {

		// We make sure the gps is running.
		start();

		if (getStatus() != GPSStatus.RUNNING
				&& getStatus() != GPSStatus.RECONNECTING
				&& getStatus() != GPSStatus.CONNECTING) {
			throw new RuntimeException(getLastFailure());
		}

		return reading;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReading(GPSReading newReading,
			NotificationChain msgs) {
		GPSReading oldReading = reading;
		reading = newReading;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__READING, oldReading, newReading);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setReading(GPSReading newReading) {
		if (newReading != reading) {
			NotificationChain msgs = null;
			if (reading != null)
				msgs = ((InternalEObject)reading).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsGPSPackage.GPS__READING, null, msgs);
			if (newReading != null)
				msgs = ((InternalEObject)newReading).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsGPSPackage.GPS__READING, null, msgs);
			msgs = basicSetReading(newReading, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__READING, newReading, newReading));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPSStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setStatus(GPSStatus newStatus) {
		GPSStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					ApogyAddonsSensorsGPSPackage.GPS__STATUS, oldStatus, status));

		gpsState = null;
	}

	private GPSState getGPSState() {
		if (gpsState == null) {
			gpsState = GPSStateFactory.createState(this);
		}
		return gpsState;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public long getUpdateRate() {
		return updateRate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateRate(long newUpdateRate) {
		long oldUpdateRate = updateRate;
		updateRate = newUpdateRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__UPDATE_RATE, oldUpdateRate, updateRate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Exception getLastFailure() {
		return lastFailure;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastFailure(Exception newLastFailure) {
		Exception oldLastFailure = lastFailure;
		lastFailure = newLastFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__LAST_FAILURE, oldLastFailure, lastFailure));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxReconnectTime() {
		return maxReconnectTime;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxReconnectTime(int newMaxReconnectTime) {
		int oldMaxReconnectTime = maxReconnectTime;
		maxReconnectTime = newMaxReconnectTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__MAX_RECONNECT_TIME, oldMaxReconnectTime, maxReconnectTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeedKnots() {
		return speedKnots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedKnots(double newSpeedKnots) {
		double oldSpeedKnots = speedKnots;
		speedKnots = newSpeedKnots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__SPEED_KNOTS, oldSpeedKnots, speedKnots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSpeedKmh() {
		return speedKmh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpeedKmh(double newSpeedKmh) {
		double oldSpeedKmh = speedKmh;
		speedKmh = newSpeedKmh;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsGPSPackage.GPS__SPEED_KMH, oldSpeedKmh, speedKmh));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void start() {

		validatePreConditions();

		try {
			getGPSState().start();

			setLastFailure(null);

			getGpsJob().schedule();
		} catch (IllegalStateException e) {

		}

	}

	private void validatePreConditions() {
		if (getConnection() == null) {
			throw new IllegalArgumentException("No connection provided");
		}

		if (getDataInterpreter() == null) {
			throw new IllegalArgumentException("No interpreter provided");
		}

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void stop() {
		try {
			getGPSState().stop();
		} catch (IllegalStateException e) {

		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void reset() {
		try {
			getGPSState().reset();
		} catch (IllegalStateException e) {

		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				if (dataInterpreter != null)
					msgs = ((InternalEObject)dataInterpreter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER, null, msgs);
				return basicSetDataInterpreter((GPSDataInterpreter)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyAddonsSensorsGPSPackage.GPS__CONNECTION:
				return basicSetConnection(null, msgs);
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				return basicSetDataInterpreter(null, msgs);
			case ApogyAddonsSensorsGPSPackage.GPS__READING:
				return basicSetReading(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsGPSPackage.GPS__CONNECTION:
				return getConnection();
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				return getDataInterpreter();
			case ApogyAddonsSensorsGPSPackage.GPS__READING:
				return getReading();
			case ApogyAddonsSensorsGPSPackage.GPS__STATUS:
				return getStatus();
			case ApogyAddonsSensorsGPSPackage.GPS__UPDATE_RATE:
				return getUpdateRate();
			case ApogyAddonsSensorsGPSPackage.GPS__LAST_FAILURE:
				return getLastFailure();
			case ApogyAddonsSensorsGPSPackage.GPS__MAX_RECONNECT_TIME:
				return getMaxReconnectTime();
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KNOTS:
				return getSpeedKnots();
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KMH:
				return getSpeedKmh();
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
			case ApogyAddonsSensorsGPSPackage.GPS__CONNECTION:
				setConnection((GPSConnection)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				setDataInterpreter((GPSDataInterpreter)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__READING:
				setReading((GPSReading)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__STATUS:
				setStatus((GPSStatus)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__UPDATE_RATE:
				setUpdateRate((Long)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__LAST_FAILURE:
				setLastFailure((Exception)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__MAX_RECONNECT_TIME:
				setMaxReconnectTime((Integer)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KNOTS:
				setSpeedKnots((Double)newValue);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KMH:
				setSpeedKmh((Double)newValue);
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
			case ApogyAddonsSensorsGPSPackage.GPS__CONNECTION:
				setConnection((GPSConnection)null);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				setDataInterpreter((GPSDataInterpreter)null);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__READING:
				setReading((GPSReading)null);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__STATUS:
				setStatus(STATUS_EDEFAULT);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__UPDATE_RATE:
				setUpdateRate(UPDATE_RATE_EDEFAULT);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__LAST_FAILURE:
				setLastFailure(LAST_FAILURE_EDEFAULT);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__MAX_RECONNECT_TIME:
				setMaxReconnectTime(MAX_RECONNECT_TIME_EDEFAULT);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KNOTS:
				setSpeedKnots(SPEED_KNOTS_EDEFAULT);
				return;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KMH:
				setSpeedKmh(SPEED_KMH_EDEFAULT);
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
			case ApogyAddonsSensorsGPSPackage.GPS__CONNECTION:
				return connection != null;
			case ApogyAddonsSensorsGPSPackage.GPS__DATA_INTERPRETER:
				return dataInterpreter != null;
			case ApogyAddonsSensorsGPSPackage.GPS__READING:
				return reading != null;
			case ApogyAddonsSensorsGPSPackage.GPS__STATUS:
				return status != STATUS_EDEFAULT;
			case ApogyAddonsSensorsGPSPackage.GPS__UPDATE_RATE:
				return updateRate != UPDATE_RATE_EDEFAULT;
			case ApogyAddonsSensorsGPSPackage.GPS__LAST_FAILURE:
				return LAST_FAILURE_EDEFAULT == null ? lastFailure != null : !LAST_FAILURE_EDEFAULT.equals(lastFailure);
			case ApogyAddonsSensorsGPSPackage.GPS__MAX_RECONNECT_TIME:
				return maxReconnectTime != MAX_RECONNECT_TIME_EDEFAULT;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KNOTS:
				return speedKnots != SPEED_KNOTS_EDEFAULT;
			case ApogyAddonsSensorsGPSPackage.GPS__SPEED_KMH:
				return speedKmh != SPEED_KMH_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsGPSPackage.GPS___START:
				start();
				return null;
			case ApogyAddonsSensorsGPSPackage.GPS___STOP:
				stop();
				return null;
			case ApogyAddonsSensorsGPSPackage.GPS___RESET:
				reset();
				return null;
			case ApogyAddonsSensorsGPSPackage.GPS___RECONNECT:
				return reconnect();
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
		result.append(" (status: ");
		result.append(status);
		result.append(", updateRate: ");
		result.append(updateRate);
		result.append(", lastFailure: ");
		result.append(lastFailure);
		result.append(", maxReconnectTime: ");
		result.append(maxReconnectTime);
		result.append(", speedKnots: ");
		result.append(speedKnots);
		result.append(", speedKmh: ");
		result.append(speedKmh);
		result.append(')');
		return result.toString();
	}

	/**
	 * The gps job runs as long as the {@link #status} attribute is set to
	 * {@link GPSStatus#RUNNING}. The job is stopped if an exception occurs.
	 * Then the status is set to {@link GPSStatus#STOPPED}.
	 * 
	 * @return
	 */
	private Job getGpsJob() {
		if (gpsJob == null) {
			gpsJob = new Job("GPS") {

				@Override
				protected IStatus run(IProgressMonitor monitor) {

					// Timer beeing used to monitor the gps upates.
					Timer t = new Timer();
					while (getGPSState().isRunning()) {
						t.start();
						getGPSState().updateGPS();
						long time = t.stop();

						// We determine the sleep time needed in order to
						// comply with the desired update rate.
						long delta = getUpdateRate() - time;

						if (delta > 0) {
							try {
								Thread.sleep(delta);
							} catch (InterruptedException e) {
							}
						}

					}
					return Status.OK_STATUS;
				}
			};
		}
		return gpsJob;
	}

	/**
	 * Tries to reconnect the gps connection for {@link #getMaxReconnectTime()}
	 * milliseconds.
	 * 
	 * @generated_NOT
	 * @return true if successfully reconnected and false if not.
	 */
	public boolean reconnect() {
		try {
			return getGPSState().reconnect();
		} catch (IllegalStateException e) {
			return false;
		}
	}

} // GPSImpl
