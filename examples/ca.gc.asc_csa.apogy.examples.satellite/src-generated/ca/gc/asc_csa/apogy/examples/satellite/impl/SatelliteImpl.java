/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.symphony.core.environment.orbit.OrbitModel;

import org.eclipse.symphony.examples.satellite.Satellite;
import org.eclipse.symphony.examples.satellite.Symphony__ExamplesSatellitePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satellite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getOrbitModel <em>Orbit Model</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getMaximumRollRate <em>Maximum Roll Rate</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.satellite.impl.SatelliteImpl#getMaximumRoll <em>Maximum Roll</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatelliteImpl extends MinimalEObjectImpl.Container implements Satellite {
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
	 * The cached value of the '{@link #getOrbitModel() <em>Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitModel()
	 * @generated
	 * @ordered
	 */
	protected OrbitModel orbitModel;

	/**
	 * The default value of the '{@link #getMaximumRollRate() <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRollRate()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ROLL_RATE_EDEFAULT = 0.017452778;

	/**
	 * The cached value of the '{@link #getMaximumRollRate() <em>Maximum Roll Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRollRate()
	 * @generated
	 * @ordered
	 */
	protected double maximumRollRate = MAXIMUM_ROLL_RATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumRoll() <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoll()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_ROLL_EDEFAULT = 0.087;

	/**
	 * The cached value of the '{@link #getMaximumRoll() <em>Maximum Roll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumRoll()
	 * @generated
	 * @ordered
	 */
	protected double maximumRoll = MAXIMUM_ROLL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatelliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__ExamplesSatellitePackage.Literals.SATELLITE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, oldOrbitModel, orbitModel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL, oldOrbitModel, orbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRollRate() {
		return maximumRollRate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRollRate(double newMaximumRollRate) {
		double oldMaximumRollRate = maximumRollRate;
		maximumRollRate = newMaximumRollRate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE, oldMaximumRollRate, maximumRollRate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumRoll() {
		return maximumRoll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumRoll(double newMaximumRoll) {
		double oldMaximumRoll = maximumRoll;
		maximumRoll = newMaximumRoll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL, oldMaximumRoll, maximumRoll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				return getName();
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				if (resolve) return getOrbitModel();
				return basicGetOrbitModel();
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				return getMaximumRollRate();
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				return getMaximumRoll();
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				setName((String)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				setOrbitModel((OrbitModel)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				setMaximumRollRate((Double)newValue);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				setMaximumRoll((Double)newValue);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				setOrbitModel((OrbitModel)null);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				setMaximumRollRate(MAXIMUM_ROLL_RATE_EDEFAULT);
				return;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				setMaximumRoll(MAXIMUM_ROLL_EDEFAULT);
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
			case Symphony__ExamplesSatellitePackage.SATELLITE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Symphony__ExamplesSatellitePackage.SATELLITE__ORBIT_MODEL:
				return orbitModel != null;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL_RATE:
				return maximumRollRate != MAXIMUM_ROLL_RATE_EDEFAULT;
			case Symphony__ExamplesSatellitePackage.SATELLITE__MAXIMUM_ROLL:
				return maximumRoll != MAXIMUM_ROLL_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", maximumRollRate: ");
		result.append(maximumRollRate);
		result.append(", maximumRoll: ");
		result.append(maximumRoll);
		result.append(')');
		return result.toString();
	}

} //SatelliteImpl
