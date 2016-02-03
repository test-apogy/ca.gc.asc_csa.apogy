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
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ToggleValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ToggleValueSourceImpl#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ToggleValueSourceImpl#isCurrentValue <em>Current Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ToggleValueSourceImpl extends ValueSourceImpl implements ToggleValueSource
{
	boolean initialized = false;
	
  /**
	 * The default value of the '{@link #isInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitialValue()
	 * @generated
	 * @ordered
	 */
  protected static final boolean INITIAL_VALUE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isInitialValue() <em>Initial Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isInitialValue()
	 * @generated
	 * @ordered
	 */
  protected boolean initialValue = INITIAL_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCurrentValue()
	 * @generated
	 * @ordered
	 */
  protected static final boolean CURRENT_VALUE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isCurrentValue() <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isCurrentValue()
	 * @generated
	 * @ordered
	 */
  protected boolean currentValue = CURRENT_VALUE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ToggleValueSourceImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreProgramsControllersPackage.Literals.TOGGLE_VALUE_SOURCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isInitialValue()
  {
		return initialValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInitialValue(boolean newInitialValue)
  {
		boolean oldInitialValue = initialValue;
		initialValue = newInitialValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE, oldInitialValue, initialValue));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public boolean isCurrentValue()
  {
	  if(!initialized)
	  {
		  setCurrentValue(isInitialValue());
		  initialized = true;
	  }
      return currentValue;
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setCurrentValue(boolean newCurrentValue)
  {
		boolean oldCurrentValue = currentValue;
		currentValue = newCurrentValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE, oldCurrentValue, currentValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				return isInitialValue();
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
				return isCurrentValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				setInitialValue((Boolean)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
				setCurrentValue((Boolean)newValue);
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
  public void eUnset(int featureID)
  {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
				setCurrentValue(CURRENT_VALUE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case ApogyCoreProgramsControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
				return currentValue != CURRENT_VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String toString()
  {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (initialValue: ");
		result.append(initialValue);
		result.append(", currentValue: ");
		result.append(currentValue);
		result.append(')');
		return result.toString();
	}
    
   @Override
	public Object getSourceValue() 
    {	
	  	Boolean value = new Boolean(isCurrentValue());
	  	
	  	// Toggle current value
	  	setCurrentValue(!isCurrentValue());
	  	
		return value;
	}

} //ToggleValueSourceImpl
