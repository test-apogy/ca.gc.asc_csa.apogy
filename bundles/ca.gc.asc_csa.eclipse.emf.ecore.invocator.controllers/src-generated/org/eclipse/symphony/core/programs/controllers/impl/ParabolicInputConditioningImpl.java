/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import ca.gc.asc_csa.jinput.EComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.ParabolicInputConditioning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ParabolicInputConditioningImpl#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParabolicInputConditioningImpl extends AbstractInputConditioningImpl implements ParabolicInputConditioning {
	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_EDEFAULT = -1.0F;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected float minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final float MAXIMUM_EDEFAULT = 1.0F;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected float maximum = MAXIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParabolicInputConditioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreControllersPackage.Literals.PARABOLIC_INPUT_CONDITIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(float newMinimum) {
		float oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(float newMaximum) {
		float oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM:
				return getMinimum();
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM:
				return getMaximum();
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
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM:
				setMinimum((Float)newValue);
				return;
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM:
				setMaximum((Float)newValue);
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
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
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
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case EMFEcoreControllersPackage.PARABOLIC_INPUT_CONDITIONING__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
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
		result.append(" (minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(')');
		return result.toString();
	}

	@Override
	public float conditionInput(EComponent component) 
	{
		float rawData = component.getPollData();
		
		double a = -1*(getMinimum() - getMaximum())/4.0;
		double b = 2*a;
		double c = getMinimum() - a + b;
		
		return (float)(a*rawData*rawData + b*rawData + c);		
	}
} //ParabolicInputScallingImpl
