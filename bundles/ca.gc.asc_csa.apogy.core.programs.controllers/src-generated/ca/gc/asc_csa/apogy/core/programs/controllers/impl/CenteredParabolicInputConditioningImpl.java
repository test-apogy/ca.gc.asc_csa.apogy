package ca.gc.asc_csa.apogy.core.programs.controllers.impl;
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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.io.jinput.EComponent;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.CenteredParabolicInputConditioning;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Centered Parabolic Input Scalling</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.CenteredParabolicInputConditioningImpl#getDeadBand <em>Dead Band</em>}</li>
 * </ul>
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
		return ApogyCoreProgramsControllersPackage.Literals.CENTERED_PARABOLIC_INPUT_CONDITIONING;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND, oldDeadBand, deadBand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
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
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
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
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
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
			case ApogyCoreProgramsControllersPackage.CENTERED_PARABOLIC_INPUT_CONDITIONING__DEAD_BAND:
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
