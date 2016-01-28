/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.Timed;

import org.eclipse.symphony.core.environment.impl.GeographicCoordinatesImpl;

import org.eclipse.symphony.examples.satellite.AbstractConstellationRequest;
import org.eclipse.symphony.examples.satellite.AbstractSatelliteCommand;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.AbstractSatelliteCommandImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.AbstractSatelliteCommandImpl#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.AbstractSatelliteCommandImpl#getConstellationRequest <em>Constellation Request</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AbstractSatelliteCommandImpl extends GeographicCoordinatesImpl implements AbstractSatelliteCommand {
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
	 * The cached value of the '{@link #getSatellite() <em>Satellite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellite()
	 * @generated
	 * @ordered
	 */
	protected Satellite satellite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractSatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.ABSTRACT_SATELLITE_COMMAND;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME, oldTime, time));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite getSatellite() {
		if (satellite != null && satellite.eIsProxy()) {
			InternalEObject oldSatellite = (InternalEObject)satellite;
			satellite = (Satellite)eResolveProxy(oldSatellite);
			if (satellite != oldSatellite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE, oldSatellite, satellite));
			}
		}
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite basicGetSatellite() {
		return satellite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellite(Satellite newSatellite) {
		Satellite oldSatellite = satellite;
		satellite = newSatellite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE, oldSatellite, satellite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest getConstellationRequest() {
		if (eContainerFeatureID() != Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST) return null;
		return (AbstractConstellationRequest)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationRequest basicGetConstellationRequest() {
		if (eContainerFeatureID() != Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST) return null;
		return (AbstractConstellationRequest)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationRequest(AbstractConstellationRequest newConstellationRequest, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationRequest, Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequest(AbstractConstellationRequest newConstellationRequest) {
		if (newConstellationRequest != eInternalContainer() || (eContainerFeatureID() != Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST && newConstellationRequest != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationRequest))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationRequest != null)
				msgs = ((InternalEObject)newConstellationRequest).eInverseAdd(this, Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND, AbstractConstellationRequest.class, msgs);
			msgs = basicSetConstellationRequest(newConstellationRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST, newConstellationRequest, newConstellationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationRequest((AbstractConstellationRequest)otherEnd, msgs);
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				return basicSetConstellationRequest(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				return eInternalContainer().eInverseRemove(this, Symphony__ExamplesSatellitePackage.ABSTRACT_CONSTELLATION_REQUEST__SATELLITE_COMMAND, AbstractConstellationRequest.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME:
				return getTime();
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE:
				if (resolve) return getSatellite();
				return basicGetSatellite();
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				if (resolve) return getConstellationRequest();
				return basicGetConstellationRequest();
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME:
				setTime((Date)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE:
				setSatellite((Satellite)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				setConstellationRequest((AbstractConstellationRequest)newValue);
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME:
				setTime(TIME_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE:
				setSatellite((Satellite)null);
				return;
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				setConstellationRequest((AbstractConstellationRequest)null);
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
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME:
				return TIME_EDEFAULT == null ? time != null : !TIME_EDEFAULT.equals(time);
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__SATELLITE:
				return satellite != null;
			case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__CONSTELLATION_REQUEST:
				return basicGetConstellationRequest() != null;
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
		if (baseClass == Timed.class) {
			switch (derivedFeatureID) {
				case Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME: return Symphony__CommonEMFPackage.TIMED__TIME;
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
		if (baseClass == Timed.class) {
			switch (baseFeatureID) {
				case Symphony__CommonEMFPackage.TIMED__TIME: return Symphony__ExamplesSatellitePackage.ABSTRACT_SATELLITE_COMMAND__TIME;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (time: ");
		result.append(time);
		result.append(')');
		return result.toString();
	}

} //AbstractSatelliteCommandImpl
