/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.impl;

import ca.gc.asc_csa.symphony.environment.orbit.Orbit;
import ca.gc.asc_csa.symphony.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.symphony.environment.orbit.SymphonyOrbitEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.TimedStampedAngularCoordinates;
import ca.gc.asc_csa.symphony.environment.orbit.TimedStampedPVACoordinates;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.SpacecraftStateImpl#getTime <em>Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.SpacecraftStateImpl#getCoordinates <em>Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.SpacecraftStateImpl#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.environment.orbit.impl.SpacecraftStateImpl#getOrbit <em>Orbit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpacecraftStateImpl extends MinimalEObjectImpl.Container implements SpacecraftState {
	/**
	 * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected Date time = TIME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCoordinates() <em>Coordinates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinates()
	 * @generated
	 * @ordered
	 */
	protected TimedStampedPVACoordinates coordinates;

	/**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected TimedStampedAngularCoordinates attitude;

	/**
	 * The cached value of the '{@link #getOrbit() <em>Orbit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbit()
	 * @generated
	 * @ordered
	 */
	protected Orbit orbit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyOrbitEnvironmentPackage.Literals.SPACECRAFT_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(Date newTime) {
		Date oldTime = time;
		time = newTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedPVACoordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinates(TimedStampedPVACoordinates newCoordinates, NotificationChain msgs) {
		TimedStampedPVACoordinates oldCoordinates = coordinates;
		coordinates = newCoordinates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES, oldCoordinates, newCoordinates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinates(TimedStampedPVACoordinates newCoordinates) {
		if (newCoordinates != coordinates) {
			NotificationChain msgs = null;
			if (coordinates != null)
				msgs = ((InternalEObject)coordinates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES, null, msgs);
			if (newCoordinates != null)
				msgs = ((InternalEObject)newCoordinates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES, null, msgs);
			msgs = basicSetCoordinates(newCoordinates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES, newCoordinates, newCoordinates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedAngularCoordinates getAttitude() {
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttitude(TimedStampedAngularCoordinates newAttitude, NotificationChain msgs) {
		TimedStampedAngularCoordinates oldAttitude = attitude;
		attitude = newAttitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE, oldAttitude, newAttitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitude(TimedStampedAngularCoordinates newAttitude) {
		if (newAttitude != attitude) {
			NotificationChain msgs = null;
			if (attitude != null)
				msgs = ((InternalEObject)attitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE, null, msgs);
			if (newAttitude != null)
				msgs = ((InternalEObject)newAttitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE, null, msgs);
			msgs = basicSetAttitude(newAttitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE, newAttitude, newAttitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getOrbit() {
		return orbit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrbit(Orbit newOrbit, NotificationChain msgs) {
		Orbit oldOrbit = orbit;
		orbit = newOrbit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT, oldOrbit, newOrbit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrbit(Orbit newOrbit) {
		if (newOrbit != orbit) {
			NotificationChain msgs = null;
			if (orbit != null)
				msgs = ((InternalEObject)orbit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT, null, msgs);
			if (newOrbit != null)
				msgs = ((InternalEObject)newOrbit).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT, null, msgs);
			msgs = basicSetOrbit(newOrbit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT, newOrbit, newOrbit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES:
				return basicSetCoordinates(null, msgs);
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE:
				return basicSetAttitude(null, msgs);
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT:
				return basicSetOrbit(null, msgs);
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
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__TIME:
				return getTime();
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES:
				return getCoordinates();
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE:
				return getAttitude();
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT:
				return getOrbit();
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
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__TIME:
				setTime((Date)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES:
				setCoordinates((TimedStampedPVACoordinates)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE:
				setAttitude((TimedStampedAngularCoordinates)newValue);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT:
				setOrbit((Orbit)newValue);
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
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES:
				setCoordinates((TimedStampedPVACoordinates)null);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE:
				setAttitude((TimedStampedAngularCoordinates)null);
				return;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT:
				setOrbit((Orbit)null);
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
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__COORDINATES:
				return coordinates != null;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ATTITUDE:
				return attitude != null;
			case SymphonyOrbitEnvironmentPackage.SPACECRAFT_STATE__ORBIT:
				return orbit != null;
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
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //SpacecraftStateImpl
