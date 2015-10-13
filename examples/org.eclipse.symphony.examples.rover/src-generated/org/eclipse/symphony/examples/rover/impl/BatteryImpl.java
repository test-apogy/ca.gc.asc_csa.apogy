/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2015
 */
package org.eclipse.symphony.examples.rover.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Random;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.examples.rover.Battery;
import org.eclipse.symphony.examples.rover.EMFEcoreExampleRoverPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Battery</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.examples.rover.impl.BatteryImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.rover.impl.BatteryImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link org.eclipse.symphony.examples.rover.impl.BatteryImpl#getCurrent <em>Current</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BatteryImpl extends MinimalEObjectImpl.Container implements Battery
{
	/**
	 * This constant defines the maximum possible voltage level of the
	 * power system, when it is on.
	 * @see #deactivate()
	 * @see #randomPowerLevels 
	 */
	private static final int VOLTAGE_UPPER_LIMIT = 240;
	
	/**
	 * This constant defines the maximum possible current level of the
	 * power system, when it is on.
	 * @see #activate()
	 * @see #randomPowerLevels
	 */
	private static final int CURRENT_UPPER_LIMIT = 25;
	
	/**
	 *  This (pseudo) random number generator is used to generate random
	 *  voltage and current levels, up to and including their upper limits,
	 *  when the power system is active
	 *  @see #activate()
	 *  @see #VOLTAGE_UPPER_LIMIT
	 *  @see #CURRENT_UPPER_LIMIT
	 */
	private Random randomPowerLevels = new Random();
	
	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected static final double VOLTAGE_EDEFAULT = 0.0;
	
	/**
	 * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVoltage()
	 * @generated
	 * @ordered
	 */
	protected double voltage = VOLTAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected static final double CURRENT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent()
	 * @generated
	 * @ordered
	 */
	protected double current = CURRENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BatteryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreExampleRoverPackage.Literals.BATTERY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoverPackage.BATTERY__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getVoltage() {
		return voltage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVoltage(double newVoltage) {
		double oldVoltage = voltage;
		voltage = newVoltage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoverPackage.BATTERY__VOLTAGE, oldVoltage, voltage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCurrent() {
		return current;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrent(double newCurrent) {
		double oldCurrent = current;
		current = newCurrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreExampleRoverPackage.BATTERY__CURRENT, oldCurrent, current));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void activate()
	{
		// Set active to true
		this.setActive(true);
		
		// Set the current to a random double in [0 - CURRENT_UPPER_LIMIT]
		this.setCurrent(this.randomPowerLevels.nextDouble() * CURRENT_UPPER_LIMIT); 

		// Set the voltage to a random double in [0 - VOLTAGE_UPPER_LIMIT]
		this.setVoltage(this.randomPowerLevels.nextDouble() * VOLTAGE_UPPER_LIMIT);		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void deactivate()
	{
		// Set active to false
		this.setActive(false);
		
		// Set the current and voltage to zero
		this.setCurrent(0.0);
		this.setVoltage(0.0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreExampleRoverPackage.BATTERY__ACTIVE:
				return isActive();
			case EMFEcoreExampleRoverPackage.BATTERY__VOLTAGE:
				return getVoltage();
			case EMFEcoreExampleRoverPackage.BATTERY__CURRENT:
				return getCurrent();
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
			case EMFEcoreExampleRoverPackage.BATTERY__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case EMFEcoreExampleRoverPackage.BATTERY__VOLTAGE:
				setVoltage((Double)newValue);
				return;
			case EMFEcoreExampleRoverPackage.BATTERY__CURRENT:
				setCurrent((Double)newValue);
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
			case EMFEcoreExampleRoverPackage.BATTERY__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case EMFEcoreExampleRoverPackage.BATTERY__VOLTAGE:
				setVoltage(VOLTAGE_EDEFAULT);
				return;
			case EMFEcoreExampleRoverPackage.BATTERY__CURRENT:
				setCurrent(CURRENT_EDEFAULT);
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
			case EMFEcoreExampleRoverPackage.BATTERY__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case EMFEcoreExampleRoverPackage.BATTERY__VOLTAGE:
				return voltage != VOLTAGE_EDEFAULT;
			case EMFEcoreExampleRoverPackage.BATTERY__CURRENT:
				return current != CURRENT_EDEFAULT;
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
			case EMFEcoreExampleRoverPackage.BATTERY___ACTIVATE:
				activate();
				return null;
			case EMFEcoreExampleRoverPackage.BATTERY___DEACTIVATE:
				deactivate();
				return null;
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
		result.append(" (active: ");
		result.append(active);
		result.append(", voltage: ");
		result.append(voltage);
		result.append(", current: ");
		result.append(current);
		result.append(')');
		return result.toString();
	}

} //BatteryImpl
