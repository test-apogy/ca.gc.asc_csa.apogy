/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.ToggleValueSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toggle Value Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl#isInitialValue <em>Initial Value</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ToggleValueSourceImpl#isCurrentValue <em>Current Value</em>}</li>
 * </ul>
 * </p>
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
		return EMFEcoreControllersPackage.Literals.TOGGLE_VALUE_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE, oldInitialValue, initialValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE, oldCurrentValue, currentValue));
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
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				return isInitialValue();
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
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
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				setInitialValue((Boolean)newValue);
				return;
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
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
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				setInitialValue(INITIAL_VALUE_EDEFAULT);
				return;
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
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
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__INITIAL_VALUE:
				return initialValue != INITIAL_VALUE_EDEFAULT;
			case EMFEcoreControllersPackage.TOGGLE_VALUE_SOURCE__CURRENT_VALUE:
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
