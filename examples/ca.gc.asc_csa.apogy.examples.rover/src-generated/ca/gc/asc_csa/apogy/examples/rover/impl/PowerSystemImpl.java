package ca.gc.asc_csa.apogy.examples.rover.impl;
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

import com.google.common.base.Objects;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.examples.rover.Battery;
import ca.gc.asc_csa.apogy.examples.rover.ApogyExamplesRoverPackage;
import ca.gc.asc_csa.apogy.examples.rover.PowerSystem;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Power System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.PowerSystemImpl#getBatteries <em>Batteries</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.PowerSystemImpl#getActiveBattery <em>Active Battery</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.PowerSystemImpl#getCurrentVoltage <em>Current Voltage</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.rover.impl.PowerSystemImpl#getCurrentCurrent <em>Current Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PowerSystemImpl extends MinimalEObjectImpl.Container implements PowerSystem {
	/**
	 * The cached value of the '{@link #getBatteries() <em>Batteries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBatteries()
	 * @generated
	 * @ordered
	 */
	protected EList<Battery> batteries;

	/**
	 * The cached value of the '{@link #getActiveBattery() <em>Active Battery</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActiveBattery()
	 * @generated
	 * @ordered
	 */
	protected Battery activeBattery;

	/**
	 * The default value of the '{@link #getCurrentVoltage() <em>Current Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_VOLTAGE_EDEFAULT = 0.0;

	/**
	 * The default value of the '{@link #getCurrentCurrent() <em>Current Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_CURRENT_EDEFAULT = 0.0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesRoverPackage.Literals.POWER_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Battery> getBatteries() {
		if (batteries == null) {
			batteries = new EObjectContainmentEList<Battery>(Battery.class, this, ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES);
		}
		return batteries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery getActiveBattery() {
		if (activeBattery != null && activeBattery.eIsProxy()) {
			InternalEObject oldActiveBattery = (InternalEObject)activeBattery;
			activeBattery = (Battery)eResolveProxy(oldActiveBattery);
			if (activeBattery != oldActiveBattery) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY, oldActiveBattery, activeBattery));
			}
		}
		return activeBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Battery basicGetActiveBattery() {
		return activeBattery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActiveBattery(Battery newActiveBattery) {
		Battery oldActiveBattery = activeBattery;
		activeBattery = newActiveBattery;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY, oldActiveBattery, activeBattery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentVoltage() {
		Battery _activeBattery = this.getActiveBattery();
		boolean _notEquals = (!Objects.equal(_activeBattery, null));
		if (_notEquals) {
			Battery _activeBattery_1 = this.getActiveBattery();
			return _activeBattery_1.getVoltage();
		}
		else {
			return 0.0;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrentCurrent() {
		Battery _activeBattery = this.getActiveBattery();
		boolean _notEquals = (!Objects.equal(_activeBattery, null));
		if (_notEquals) {
			Battery _activeBattery_1 = this.getActiveBattery();
			return _activeBattery_1.getCurrent();
		}
		else {
			return 0.0;
		}
	}

	/**
	 * This is used to change the active battery to
	 * the battery located at the given index in the
	 * list (or array) of batteries.
	 * @param batteryIndex The index of the battery to change to
	 * @generated_NOT
	 */
	public void changeActiveBatteryTo(int batteryIndex)
	{
		// If the index is in the permitted range
		if ((batteryIndex >= 0) &&
				(batteryIndex < this.getBatteries().size()))
		{
			// If there is currently an active battery
			if (this.getActiveBattery() != null)
			{
				// If this index corresponds to the current battery
				if (this.getActiveBattery() == this.getBatteries().get(batteryIndex))
				{
					// Just return; nothing else needs to be done
					return;
				}
				// Otherwise, it's referring to a different battery
				else
				{
					// Deactivate the currently active battery
					this.getActiveBattery().deactivate();
				}
			}
				
			// Switch to the new battery
			this.setActiveBattery(this.getBatteries().get(batteryIndex));

			// Activate the new battery
			this.getActiveBattery().activate();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES:
				return ((InternalEList<?>)getBatteries()).basicRemove(otherEnd, msgs);
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
			case ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES:
				return getBatteries();
			case ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY:
				if (resolve) return getActiveBattery();
				return basicGetActiveBattery();
			case ApogyExamplesRoverPackage.POWER_SYSTEM__CURRENT_VOLTAGE:
				return getCurrentVoltage();
			case ApogyExamplesRoverPackage.POWER_SYSTEM__CURRENT_CURRENT:
				return getCurrentCurrent();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES:
				getBatteries().clear();
				getBatteries().addAll((Collection<? extends Battery>)newValue);
				return;
			case ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY:
				setActiveBattery((Battery)newValue);
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
			case ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES:
				getBatteries().clear();
				return;
			case ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY:
				setActiveBattery((Battery)null);
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
			case ApogyExamplesRoverPackage.POWER_SYSTEM__BATTERIES:
				return batteries != null && !batteries.isEmpty();
			case ApogyExamplesRoverPackage.POWER_SYSTEM__ACTIVE_BATTERY:
				return activeBattery != null;
			case ApogyExamplesRoverPackage.POWER_SYSTEM__CURRENT_VOLTAGE:
				return getCurrentVoltage() != CURRENT_VOLTAGE_EDEFAULT;
			case ApogyExamplesRoverPackage.POWER_SYSTEM__CURRENT_CURRENT:
				return getCurrentCurrent() != CURRENT_CURRENT_EDEFAULT;
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
			case ApogyExamplesRoverPackage.POWER_SYSTEM___CHANGE_ACTIVE_BATTERY_TO__INT:
				changeActiveBatteryTo((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //PowerSystemImpl
