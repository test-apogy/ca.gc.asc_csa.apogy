/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import ca.gc.asc_csa.jinput.EComponent;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.programs.controllers.CenteredParabolicInputConditioning;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centered Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CenteredParabolicInputConditioningImpl extends ParabolicInputConditioningImpl implements CenteredParabolicInputConditioning {
	/**
	 * The default value of the '{@link #getDeadBand() <em>Dead Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadBand()
	 * @generated
	 * @ordered
	 */
	protected static final float DEAD_BAND_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getDeadBand() <em>Dead Band</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeadBand()
	 * @generated
	 * @ordered
	 */
	protected float deadBand = DEAD_BAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CenteredParabolicInputConditioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreControllersPackage.Literals.CENTERED_PARABOLIC_INPUT_CONDITIONING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getDeadBand() {
		return deadBand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeadBand(float newDeadBand) {
		float oldDeadBand = deadBand;
		deadBand = newDeadBand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND, oldDeadBand, deadBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
				return getDeadBand();
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
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
				setDeadBand((Float)newValue);
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
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
				setDeadBand(DEAD_BAND_EDEFAULT);
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
			case EMFEcoreControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
				return deadBand != DEAD_BAND_EDEFAULT;
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
		result.append(" (deadBand: ");
		result.append(deadBand);
		result.append(')');
		return result.toString();
	}

	@Override
	public float conditionInput(EComponent component) 
	{
		  float rawData = component.getPollData();
		  float h = (float) (getDeadBand() / 2.0f);
		  
		  // Check if the input falls inside the dead band.
		  if (Math.abs(rawData) <= h) 
		  {
			  return 0.0f;
		  }
		  else
		  {
			  float a = 0.0f;
			  float data = 0.0f;
			  float x = 0.0f;
			  if(rawData < 0.0)
			  {
				  a = (float) (getMinimum() / Math.pow((h - 1.0f), 2));
				  x = rawData + h;
			  }
			  else
			  {
				  a = (float) (getMaximum() / Math.pow((1.0f - h), 2));
				  x = rawData - h;
			  }
			  
			  data = (float) ((float) a * Math.pow(x,2));
			  
			  return data;
		  }	  	 
	}
} //CenteredParabolicInputScallingImpl
