/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.orbit.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.environment.orbit.AbstractFrame;
import org.eclipse.symphony.core.environment.orbit.SpacecraftAttitude;
import org.eclipse.symphony.core.environment.orbit.Symphony__CoreEnvironmentOrbitPackage;
import org.eclipse.symphony.core.environment.orbit.TimedStampedAngularCoordinates;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spacecraft Attitude</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl#getOrientation <em>Orientation</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.orbit.impl.SpacecraftAttitudeImpl#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpacecraftAttitudeImpl extends MinimalEObjectImpl.Container implements SpacecraftAttitude {
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
	 * The cached value of the '{@link #getOrientation() <em>Orientation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrientation()
	 * @generated
	 * @ordered
	 */
	protected TimedStampedAngularCoordinates orientation;
	/**
	 * The cached value of the '{@link #getReferenceFrame() <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferenceFrame()
	 * @generated
	 * @ordered
	 */
	protected AbstractFrame referenceFrame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpacecraftAttitudeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreEnvironmentOrbitPackage.Literals.SPACECRAFT_ATTITUDE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimedStampedAngularCoordinates getOrientation() {
		return orientation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrientation(TimedStampedAngularCoordinates newOrientation, NotificationChain msgs) {
		TimedStampedAngularCoordinates oldOrientation = orientation;
		orientation = newOrientation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION, oldOrientation, newOrientation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrientation(TimedStampedAngularCoordinates newOrientation) {
		if (newOrientation != orientation) {
			NotificationChain msgs = null;
			if (orientation != null)
				msgs = ((InternalEObject)orientation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION, null, msgs);
			if (newOrientation != null)
				msgs = ((InternalEObject)newOrientation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION, null, msgs);
			msgs = basicSetOrientation(newOrientation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION, newOrientation, newOrientation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractFrame getReferenceFrame() {
		return referenceFrame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReferenceFrame(AbstractFrame newReferenceFrame, NotificationChain msgs) {
		AbstractFrame oldReferenceFrame = referenceFrame;
		referenceFrame = newReferenceFrame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME, oldReferenceFrame, newReferenceFrame);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReferenceFrame(AbstractFrame newReferenceFrame) {
		if (newReferenceFrame != referenceFrame) {
			NotificationChain msgs = null;
			if (referenceFrame != null)
				msgs = ((InternalEObject)referenceFrame).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME, null, msgs);
			if (newReferenceFrame != null)
				msgs = ((InternalEObject)newReferenceFrame).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME, null, msgs);
			msgs = basicSetReferenceFrame(newReferenceFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME, newReferenceFrame, newReferenceFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION:
				return basicSetOrientation(null, msgs);
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME:
				return basicSetReferenceFrame(null, msgs);
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
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__TIME:
				return getTime();
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION:
				return getOrientation();
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME:
				return getReferenceFrame();
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
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__TIME:
				setTime((Date)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION:
				setOrientation((TimedStampedAngularCoordinates)newValue);
				return;
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)newValue);
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
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION:
				setOrientation((TimedStampedAngularCoordinates)null);
				return;
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME:
				setReferenceFrame((AbstractFrame)null);
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
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__ORIENTATION:
				return orientation != null;
			case Symphony__CoreEnvironmentOrbitPackage.SPACECRAFT_ATTITUDE__REFERENCE_FRAME:
				return referenceFrame != null;
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

} //SpacecraftAttitudeImpl
