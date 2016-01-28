/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.earth.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.orbit.OrbitModel;
import org.eclipse.symphony.core.environment.orbit.earth.EarthSurfaceLocation;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthFactory;
import org.eclipse.symphony.core.environment.orbit.earth.Symphony__CoreEnvironmentOrbitEarthPackage;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPass;
import org.eclipse.symphony.core.environment.orbit.earth.VisibilityPassSpacecraftPositionHistory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Visibility Pass</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getSurfaceLocation <em>Surface Location</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getEndTime <em>End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getPositionHistory <em>Position History</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.earth.impl.VisibilityPassImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VisibilityPassImpl extends MinimalEObjectImpl.Container implements VisibilityPass {
	/**
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;

	/**
	 * The cached value of the '{@link #getSurfaceLocation() <em>Surface Location</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceLocation()
	 * @generated
	 * @ordered
	 */
	protected EarthSurfaceLocation surfaceLocation;

	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndTime() <em>End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndTime()
	 * @generated
	 * @ordered
	 */
	protected Date endTime = END_TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPositionHistory() <em>Position History</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPositionHistory()
	 * @generated
	 * @ordered
	 */
	protected VisibilityPassSpacecraftPositionHistory positionHistory;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VisibilityPassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitEarthPackage.Literals.VISIBILITY_PASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel getOrbitModel() {
		if (orbitModel != null && orbitModel.eIsProxy()) {
			InternalEObject oldOrbitModel = (InternalEObject)orbitModel;
			orbitModel = (OrbitModel)eResolveProxy(oldOrbitModel);
			if (orbitModel != oldOrbitModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL, oldOrbitModel, orbitModel));
			}
		}
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrbitModel basicGetOrbitModel() {
		return orbitModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbitModel(OrbitModel newOrbitModel) {
		OrbitModel oldOrbitModel = orbitModel;
		orbitModel = newOrbitModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocation getSurfaceLocation() {
		if (surfaceLocation != null && surfaceLocation.eIsProxy()) {
			InternalEObject oldSurfaceLocation = (InternalEObject)surfaceLocation;
			surfaceLocation = (EarthSurfaceLocation)eResolveProxy(oldSurfaceLocation);
			if (surfaceLocation != oldSurfaceLocation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION, oldSurfaceLocation, surfaceLocation));
			}
		}
		return surfaceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceLocation basicGetSurfaceLocation() {
		return surfaceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurfaceLocation(EarthSurfaceLocation newSurfaceLocation) {
		EarthSurfaceLocation oldSurfaceLocation = surfaceLocation;
		surfaceLocation = newSurfaceLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION, oldSurfaceLocation, surfaceLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTime() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setStartTime(Date newStartTime)
	{
		setStartTimeGen(newStartTime);
		
		updateDuration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTimeGen(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndTime() {
		return endTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setEndTime(Date newEndTime)
	{
		setEndTimeGen(newEndTime);
		
		updateDuration();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndTimeGen(Date newEndTime) {
		Date oldEndTime = endTime;
		endTime = newEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__END_TIME, oldEndTime, endTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public VisibilityPassSpacecraftPositionHistory getPositionHistory() 
	{
		VisibilityPassSpacecraftPositionHistory tmp = getPositionHistoryGen();
		if(tmp == null)
		{
			tmp = Symphony__CoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPassSpacecraftPositionHistory();
			setPositionHistory(tmp);
		}
		
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityPassSpacecraftPositionHistory getPositionHistoryGen() {
		return positionHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPositionHistory(VisibilityPassSpacecraftPositionHistory newPositionHistory, NotificationChain msgs) {
		VisibilityPassSpacecraftPositionHistory oldPositionHistory = positionHistory;
		positionHistory = newPositionHistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY, oldPositionHistory, newPositionHistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPositionHistory(VisibilityPassSpacecraftPositionHistory newPositionHistory) {
		if (newPositionHistory != positionHistory) {
			NotificationChain msgs = null;
			if (positionHistory != null)
				msgs = ((InternalEObject)positionHistory).eInverseRemove(this, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, VisibilityPassSpacecraftPositionHistory.class, msgs);
			if (newPositionHistory != null)
				msgs = ((InternalEObject)newPositionHistory).eInverseAdd(this, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS_SPACECRAFT_POSITION_HISTORY__VISIBILITY_PASS, VisibilityPassSpacecraftPositionHistory.class, msgs);
			msgs = basicSetPositionHistory(newPositionHistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY, newPositionHistory, newPositionHistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				if (positionHistory != null)
					msgs = ((InternalEObject)positionHistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY, null, msgs);
				return basicSetPositionHistory((VisibilityPassSpacecraftPositionHistory)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				return basicSetPositionHistory(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION:
				if (resolve) return getSurfaceLocation();
				return basicGetSurfaceLocation();
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__START_TIME:
				return getStartTime();
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__END_TIME:
				return getEndTime();
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				return getPositionHistory();
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__DURATION:
				return getDuration();
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION:
				setSurfaceLocation((EarthSurfaceLocation)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__START_TIME:
				setStartTime((Date)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__END_TIME:
				setEndTime((Date)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				setPositionHistory((VisibilityPassSpacecraftPositionHistory)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__DURATION:
				setDuration((Double)newValue);
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION:
				setSurfaceLocation((EarthSurfaceLocation)null);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__END_TIME:
				setEndTime(END_TIME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				setPositionHistory((VisibilityPassSpacecraftPositionHistory)null);
				return;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__ORBIT_MODEL:
				return orbitModel != null;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__SURFACE_LOCATION:
				return surfaceLocation != null;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__END_TIME:
				return END_TIME_EDEFAULT == null ? endTime != null : !END_TIME_EDEFAULT.equals(endTime);
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__POSITION_HISTORY:
				return positionHistory != null;
			case Symphony__CoreEnvironmentOrbitEarthPackage.VISIBILITY_PASS__DURATION:
				return duration != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", endTime: ");
		result.append(endTime);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

	private void updateDuration()
	{
		double duration = 0;
		if(getStartTime() != null && getEndTime() != null)
		{
			duration = (getEndTime().getTime() - getStartTime().getTime()) * 0.001;			
		}
		
		setDuration(duration);
	}
} //VisibilityPassImpl
