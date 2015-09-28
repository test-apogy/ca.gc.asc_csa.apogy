/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimulatedDataInterpreterImpl.java,v 1.2.4.2 2015/05/21 15:50:11 pallard Exp $
 */
package ca.gc.space.mrt.sensors.gps.sim.impl;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.space.mrt.sensors.gps.GPS;
import ca.gc.space.mrt.sensors.gps.GPSReading;
import ca.gc.space.mrt.sensors.gps.GPS_QUALITY;
import ca.gc.space.mrt.sensors.gps.GpsFactory;
import ca.gc.space.mrt.sensors.gps.GpsPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimPackage;
import ca.gc.space.mrt.sensors.gps.sim.SimulatedDataInterpreter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Simulated Data Interpreter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getGps <em>Gps</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getUpdateFrequency <em>Update Frequency</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getStartLatitude <em>Start Latitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getStartLongitude <em>Start Longitude</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getLatitudeIncrement <em>Latitude Increment</em>}</li>
 *   <li>{@link ca.gc.space.mrt.sensors.gps.sim.impl.SimulatedDataInterpreterImpl#getLongitudeIncrement <em>Longitude Increment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SimulatedDataInterpreterImpl extends EObjectImpl implements
		SimulatedDataInterpreter {
	/**
	 * The default value of the '{@link #getUpdateFrequency() <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final int UPDATE_FREQUENCY_EDEFAULT = 1000;
	/**
	 * The cached value of the '{@link #getUpdateFrequency() <em>Update Frequency</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getUpdateFrequency()
	 * @generated
	 * @ordered
	 */
	protected int updateFrequency = UPDATE_FREQUENCY_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartLatitude() <em>Start Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStartLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final double START_LATITUDE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getStartLatitude() <em>Start Latitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStartLatitude()
	 * @generated
	 * @ordered
	 */
	protected double startLatitude = START_LATITUDE_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartLongitude() <em>Start Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStartLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final double START_LONGITUDE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getStartLongitude() <em>Start Longitude</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getStartLongitude()
	 * @generated
	 * @ordered
	 */
	protected double startLongitude = START_LONGITUDE_EDEFAULT;
	/**
	 * The default value of the '{@link #getLatitudeIncrement() <em>Latitude Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLatitudeIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final double LATITUDE_INCREMENT_EDEFAULT = 1.0E-6;
	/**
	 * The cached value of the '{@link #getLatitudeIncrement() <em>Latitude Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLatitudeIncrement()
	 * @generated
	 * @ordered
	 */
	protected double latitudeIncrement = LATITUDE_INCREMENT_EDEFAULT;
	/**
	 * The default value of the '{@link #getLongitudeIncrement() <em>Longitude Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLongitudeIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final double LONGITUDE_INCREMENT_EDEFAULT = 1.0E-6;
	/**
	 * The cached value of the '{@link #getLongitudeIncrement() <em>Longitude Increment</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getLongitudeIncrement()
	 * @generated
	 * @ordered
	 */
	protected double longitudeIncrement = LONGITUDE_INCREMENT_EDEFAULT;
	private double currentLatitude;
	private double currentLongitude;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulatedDataInterpreterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimPackage.Literals.SIMULATED_DATA_INTERPRETER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public GPS getGps() {
		if (eContainerFeatureID() != SimPackage.SIMULATED_DATA_INTERPRETER__GPS) return null;
		return (GPS)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGps(GPS newGps, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGps, SimPackage.SIMULATED_DATA_INTERPRETER__GPS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGps(GPS newGps) {
		if (newGps != eInternalContainer() || (eContainerFeatureID() != SimPackage.SIMULATED_DATA_INTERPRETER__GPS && newGps != null)) {
			if (EcoreUtil.isAncestor(this, newGps))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGps != null)
				msgs = ((InternalEObject)newGps).eInverseAdd(this, GpsPackage.GPS__DATA_INTERPRETER, GPS.class, msgs);
			msgs = basicSetGps(newGps, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMULATED_DATA_INTERPRETER__GPS, newGps, newGps));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdateFrequency() {
		return updateFrequency;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateFrequency(int newUpdateFrequency) {
		int oldUpdateFrequency = updateFrequency;
		updateFrequency = newUpdateFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY, oldUpdateFrequency, updateFrequency));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartLatitude() {
		return startLatitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setStartLatitude(double newStartLatitude) {
		double oldStartLatitude = startLatitude;
		startLatitude = newStartLatitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE,
					oldStartLatitude, startLatitude));

		currentLatitude = newStartLatitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getStartLongitude() {
		return startLongitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void setStartLongitude(double newStartLongitude) {
		double oldStartLongitude = startLongitude;
		startLongitude = newStartLongitude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE,
					oldStartLongitude, startLongitude));

		currentLongitude = startLongitude;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getLatitudeIncrement() {
		return latitudeIncrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitudeIncrement(double newLatitudeIncrement) {
		double oldLatitudeIncrement = latitudeIncrement;
		latitudeIncrement = newLatitudeIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT, oldLatitudeIncrement, latitudeIncrement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getLongitudeIncrement() {
		return longitudeIncrement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitudeIncrement(double newLongitudeIncrement) {
		double oldLongitudeIncrement = longitudeIncrement;
		longitudeIncrement = newLongitudeIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT, oldLongitudeIncrement, longitudeIncrement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void updateGPS() throws IOException {
		GPSReading reading = GpsFactory.eINSTANCE.createGPSReading();
		reading.setQuality(GPS_QUALITY.SIMULATION);
		Date timeStamp = Calendar.getInstance().getTime();
		reading.setTimeStamp(timeStamp);
		reading.setLatitude(currentLatitude);
		reading.setLongitude(currentLongitude);

		currentLatitude += getLatitudeIncrement();
		currentLongitude += getLongitudeIncrement();

		try {
			Thread.sleep(getUpdateFrequency());
		} catch (InterruptedException e) {
		}

		getGps().setReading(reading);

	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd,
			int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGps((GPS)otherEnd, msgs);
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
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				return basicSetGps(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(
			NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				return eInternalContainer().eInverseRemove(this, GpsPackage.GPS__DATA_INTERPRETER, GPS.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				return getGps();
			case SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY:
				return getUpdateFrequency();
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE:
				return getStartLatitude();
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE:
				return getStartLongitude();
			case SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT:
				return getLatitudeIncrement();
			case SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT:
				return getLongitudeIncrement();
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
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				setGps((GPS)newValue);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY:
				setUpdateFrequency((Integer)newValue);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE:
				setStartLatitude((Double)newValue);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE:
				setStartLongitude((Double)newValue);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT:
				setLatitudeIncrement((Double)newValue);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT:
				setLongitudeIncrement((Double)newValue);
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
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				setGps((GPS)null);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY:
				setUpdateFrequency(UPDATE_FREQUENCY_EDEFAULT);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE:
				setStartLatitude(START_LATITUDE_EDEFAULT);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE:
				setStartLongitude(START_LONGITUDE_EDEFAULT);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT:
				setLatitudeIncrement(LATITUDE_INCREMENT_EDEFAULT);
				return;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT:
				setLongitudeIncrement(LONGITUDE_INCREMENT_EDEFAULT);
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
			case SimPackage.SIMULATED_DATA_INTERPRETER__GPS:
				return getGps() != null;
			case SimPackage.SIMULATED_DATA_INTERPRETER__UPDATE_FREQUENCY:
				return updateFrequency != UPDATE_FREQUENCY_EDEFAULT;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LATITUDE:
				return startLatitude != START_LATITUDE_EDEFAULT;
			case SimPackage.SIMULATED_DATA_INTERPRETER__START_LONGITUDE:
				return startLongitude != START_LONGITUDE_EDEFAULT;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LATITUDE_INCREMENT:
				return latitudeIncrement != LATITUDE_INCREMENT_EDEFAULT;
			case SimPackage.SIMULATED_DATA_INTERPRETER__LONGITUDE_INCREMENT:
				return longitudeIncrement != LONGITUDE_INCREMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (updateFrequency: ");
		result.append(updateFrequency);
		result.append(", startLatitude: ");
		result.append(startLatitude);
		result.append(", startLongitude: ");
		result.append(startLongitude);
		result.append(", latitudeIncrement: ");
		result.append(latitudeIncrement);
		result.append(", longitudeIncrement: ");
		result.append(longitudeIncrement);
		result.append(')');
		return result.toString();
	}

} // SimulatedDataInterpreterImpl
