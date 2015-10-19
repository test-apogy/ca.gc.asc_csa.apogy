/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.satellite.EMFEcoreExampleSatellitePackage;
import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.SatelliteCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl#getSatellite <em>Satellite</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteCommandImpl#getCommandStartTime <em>Command Start Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteCommandImpl extends MinimalEObjectImpl.Container implements SatelliteCommand {
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
	 * The default value of the '{@link #getCommandStartTime() <em>Command Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date COMMAND_START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCommandStartTime() <em>Command Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommandStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date commandStartTime = COMMAND_START_TIME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteCommandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleSatellitePackage.Literals.SATELLITE_COMMAND;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE, oldSatellite, satellite));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE, oldSatellite, satellite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getCommandStartTime() {
		return commandStartTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandStartTime(Date newCommandStartTime) {
		Date oldCommandStartTime = commandStartTime;
		commandStartTime = newCommandStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__COMMAND_START_TIME, oldCommandStartTime, commandStartTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE:
				if (resolve) return getSatellite();
				return basicGetSatellite();
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__COMMAND_START_TIME:
				return getCommandStartTime();
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE:
				setSatellite((Satellite)newValue);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__COMMAND_START_TIME:
				setCommandStartTime((Date)newValue);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE:
				setSatellite((Satellite)null);
				return;
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__COMMAND_START_TIME:
				setCommandStartTime(COMMAND_START_TIME_EDEFAULT);
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
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__SATELLITE:
				return satellite != null;
			case EMFEcoreExampleSatellitePackage.SATELLITE_COMMAND__COMMAND_START_TIME:
				return COMMAND_START_TIME_EDEFAULT == null ? commandStartTime != null : !COMMAND_START_TIME_EDEFAULT.equals(commandStartTime);
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
		result.append(" (commandStartTime: ");
		result.append(commandStartTime);
		result.append(')');
		return result.toString();
	}

} //SatelliteCommandImpl
