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
import ca.gc.asc_csa.apogy.core.programs.controllers.TimeTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.TimeTriggerImpl#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimeTriggerImpl extends TriggerImpl implements TimeTrigger
{
	private Thread thread = null;
  /**
	 * The default value of the '{@link #getRefreshPeriod() <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRefreshPeriod()
	 * @generated
	 * @ordered
	 */
  protected static final long REFRESH_PERIOD_EDEFAULT = 100L;

  /**
	 * The cached value of the '{@link #getRefreshPeriod() <em>Refresh Period</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRefreshPeriod()
	 * @generated
	 * @ordered
	 */
  protected long refreshPeriod = REFRESH_PERIOD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  protected TimeTriggerImpl()
  {
    super();
    start();
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return ApogyCoreProgramsControllersPackage.Literals.TIME_TRIGGER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public long getRefreshPeriod()
  {
		return refreshPeriod;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRefreshPeriod(long newRefreshPeriod)
  {
		long oldRefreshPeriod = refreshPeriod;
		refreshPeriod = newRefreshPeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.TIME_TRIGGER__REFRESH_PERIOD, oldRefreshPeriod, refreshPeriod));
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
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
				return getRefreshPeriod();
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
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
				setRefreshPeriod((Long)newValue);
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
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
				setRefreshPeriod(REFRESH_PERIOD_EDEFAULT);
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
			case ApogyCoreProgramsControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
				return refreshPeriod != REFRESH_PERIOD_EDEFAULT;
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
		result.append(" (refreshPeriod: ");
		result.append(refreshPeriod);
		result.append(')');
		return result.toString();
	}
  
  protected void start()
  {
	  this.thread = new Thread()
	  {
		  @Override
			public void run() 
		    {						
				while(true)
				{							
					try 
					{
						// Updates
						update();
						
						Thread.sleep(getRefreshPeriod());
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

  protected void update()
  {
	  if(getOperationCallControllerBinding() != null)
	  {
		  if(getOperationCallControllerBinding().isActive())
		  {
			  getOperationCallControllerBinding().update();
		  }
	  }
  }
} //TimeTriggerImpl
