/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.io.jinput.EComponent;
import org.eclipse.symphony.core.programs.controllers.CenteredLinearInputConditioning;
import org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centered Linear Input Conditionning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.CenteredLinearInputConditioningImpl#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CenteredLinearInputConditioningImpl extends LinearInputConditioningImpl implements CenteredLinearInputConditioning {
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
	protected CenteredLinearInputConditioningImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreProgramsControllersPackage.Literals.CENTERED_LINEAR_INPUT_CONDITIONING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND, oldDeadBand, deadBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND:
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
			case Symphony__CoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND:
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
			case Symphony__CoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND:
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
			case Symphony__CoreProgramsControllersPackage.CENTERED_LINEAR_INPUT_CONDITIONING__DEAD_BAND:
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
		  
		  // Check if the input falls inside the dead band.
		  if(Math.abs(rawData) <= getDeadBand() / 2.0)
		  {
			  return 0.0f;
		  }
		  else
		  {	  
			  // Check in which region of input the raw data is.
			  float slope = 0.0f;
			  float data = 0.0f;
			  if(rawData < 0.0)
			  {
				  slope = -getMinimum() / (1.0f - getDeadBand() / 2.0f);
				  data = (rawData + getDeadBand() / 2.0f) * slope;
			  }
			  else
			  {
				  slope = getMaximum() / (1.0f - getDeadBand() / 2.0f);
				  data = (rawData - getDeadBand() / 2.0f) * slope;
			  }		  		
			  
			  return data;
		  }
	}
	
} //CenteredLinearInputConditionningImpl
