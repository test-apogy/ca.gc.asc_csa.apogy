/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.programs.controllers.CustomInputConditioningPoint;
import org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Custom Input Conditionning Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl#getInputValue <em>Input Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.CustomInputConditioningPointImpl#getOutputValue <em>Output Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CustomInputConditioningPointImpl extends MinimalEObjectImpl.Container implements CustomInputConditioningPoint {
	/**
	 * The default value of the '{@link #getInputValue() <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected static final double INPUT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getInputValue() <em>Input Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputValue()
	 * @generated
	 * @ordered
	 */
	protected double inputValue = INPUT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getOutputValue() <em>Output Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValue()
	 * @generated
	 * @ordered
	 */
	protected static final double OUTPUT_VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getOutputValue() <em>Output Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputValue()
	 * @generated
	 * @ordered
	 */
	protected double outputValue = OUTPUT_VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CustomInputConditioningPointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreProgramsControllersPackage.Literals.CUSTOM_INPUT_CONDITIONING_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getInputValue() {
		return inputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputValue(double newInputValue) {
		double oldInputValue = inputValue;
		inputValue = newInputValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE, oldInputValue, inputValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getOutputValue() {
		return outputValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputValue(double newOutputValue) {
		double oldOutputValue = outputValue;
		outputValue = newOutputValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE, oldOutputValue, outputValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE:
				return getInputValue();
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE:
				return getOutputValue();
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
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE:
				setInputValue((Double)newValue);
				return;
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE:
				setOutputValue((Double)newValue);
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
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE:
				setInputValue(INPUT_VALUE_EDEFAULT);
				return;
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE:
				setOutputValue(OUTPUT_VALUE_EDEFAULT);
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
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__INPUT_VALUE:
				return inputValue != INPUT_VALUE_EDEFAULT;
			case Symphony__CoreProgramsControllersPackage.CUSTOM_INPUT_CONDITIONING_POINT__OUTPUT_VALUE:
				return outputValue != OUTPUT_VALUE_EDEFAULT;
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
		result.append(" (inputValue: ");
		result.append(inputValue);
		result.append(", outputValue: ");
		result.append(outputValue);
		result.append(')');
		return result.toString();
	}

} //CustomInputConditionningPointImpl
