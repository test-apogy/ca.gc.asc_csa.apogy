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
import ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.programs.controllers.Activator;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.ControllerStateTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controller State Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerStateTriggerImpl#isEnablingValue <em>Enabling Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.ControllerStateTriggerImpl#getRepeatPeriod <em>Repeat Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllerStateTriggerImpl extends ControllerTriggerImpl implements ControllerStateTrigger
{
	private boolean run = false;
	private Thread thread = null;
	
  /**
	 * The default value of the '{@link #isEnablingValue() <em>Enabling Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEnablingValue()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ENABLING_VALUE_EDEFAULT = true;

  /**
	 * The cached value of the '{@link #isEnablingValue() <em>Enabling Value</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isEnablingValue()
	 * @generated
	 * @ordered
	 */
  protected boolean enablingValue = ENABLING_VALUE_EDEFAULT;

  /**
	 * The default value of the '{@link #getRepeatPeriod() <em>Repeat Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepeatPeriod()
	 * @generated
	 * @ordered
	 */
  protected static final long REPEAT_PERIOD_EDEFAULT = 100L;

  /**
	 * The cached value of the '{@link #getRepeatPeriod() <em>Repeat Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRepeatPeriod()
	 * @generated
	 * @ordered
	 */
  protected long repeatPeriod = REPEAT_PERIOD_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControllerStateTriggerImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.CONTROLLER_STATE_TRIGGER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isEnablingValue()
  {
		return enablingValue;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnablingValue(boolean newEnablingValue)
  {
		boolean oldEnablingValue = enablingValue;
		enablingValue = newEnablingValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE, oldEnablingValue, enablingValue));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public long getRepeatPeriod()
  {
		return repeatPeriod;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setRepeatPeriod(long newRepeatPeriod)
  {
	  if(newRepeatPeriod == -1)
	  {
		  stopThread();
	  }
	  setRepeatPeriodGen(newRepeatPeriod);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRepeatPeriodGen(long newRepeatPeriod)
  {
		long oldRepeatPeriod = repeatPeriod;
		repeatPeriod = newRepeatPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD, oldRepeatPeriod, repeatPeriod));
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE:
				return isEnablingValue();
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD:
				return getRepeatPeriod();
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE:
				setEnablingValue((Boolean)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD:
				setRepeatPeriod((Long)newValue);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE:
				setEnablingValue(ENABLING_VALUE_EDEFAULT);
				return;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD:
				setRepeatPeriod(REPEAT_PERIOD_EDEFAULT);
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
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__ENABLING_VALUE:
				return enablingValue != ENABLING_VALUE_EDEFAULT;
			case ApogyCoreProgramsControllersPackage.CONTROLLER_STATE_TRIGGER__REPEAT_PERIOD:
				return repeatPeriod != REPEAT_PERIOD_EDEFAULT;
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
		result.append(" (enablingValue: ");
		result.append(enablingValue);
		result.append(", repeatPeriod: ");
		result.append(repeatPeriod);
		result.append(')');
		return result.toString();
	}

  @Override
  public void setComponentQualifier(EComponentQualifier newComponentQualifier) 
  {	
	  super.setComponentQualifier(newComponentQualifier);
	  
	  // Check to see if we should start the update
	  EComponent component = ca.gc.asc_csa.apogy.common.io.jinput.Activator.getEControllerEnvironment().resolveEComponent(newComponentQualifier);
	  if(component != null)
	  {
		  boolean buttonStatus = convert(component.getPollData());
		  update(!buttonStatus, buttonStatus);
	  }
  }
  
  protected boolean convert(float value)
  {
	  if(value == 0)
	  {
		  return false;
	  }
	  else
	  {
		  return true;
	  }
  }
  
  protected void startThread()
  {
	  String message = null;;
	  
	  if(getName() != null) 
	  {
		  	message = getName() + " : is now Enabled.";
	  }
	  else
	  {
		  message = "is now Enabled.";
	  }
	  
	  
	  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
	  
	  run = true;
	  
	  this.thread = new Thread()
	  {
		  @Override
			public void run() 
		    {						
				while(run)
				{		
					try 
					{
						// Updates
						if(getOperationCallControllerBinding() != null)
						{
							if(getOperationCallControllerBinding().isActive())
							{								
								getOperationCallControllerBinding().update();
							}
						}
						if(getRepeatPeriod() != -1)
						{
							Thread.sleep(getRepeatPeriod());
						}
						else
						{
							stopThread();
						}
					} 
					catch (Throwable t) 
					{							
						t.printStackTrace();
					}
				}
			}
	  };
	  
	  this.thread.start();
  }

  protected void stopThread()
  {

	  run = false;
	  
	  String message = null;
	  
	  if(getName() != null) 
	  {
		  	message = getName() + " : is now Disabled.";
	  }
	  else
	  {
		  message = "is now Disabled.";
	  }
	  
	  Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.INFO);
  }

  @Override
  protected void update(boolean oldValue, boolean newValue) 
  {	
	  if(newValue == isEnablingValue())
	  {
		  startThread();
	  }
	  else
	  {
		  stopThread();
	  }
  }
} //ControllerStateTriggerImpl
