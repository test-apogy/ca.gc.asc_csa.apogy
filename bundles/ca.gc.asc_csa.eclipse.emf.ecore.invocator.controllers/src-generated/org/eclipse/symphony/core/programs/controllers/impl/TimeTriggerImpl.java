/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.programs.controllers.EMFEcoreControllersPackage;
import org.eclipse.symphony.core.programs.controllers.TimeTrigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Time Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.TimeTriggerImpl#getRefreshPeriod <em>Refresh Period</em>}</li>
 * </ul>
 * </p>
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
		return EMFEcoreControllersPackage.Literals.TIME_TRIGGER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreControllersPackage.TIME_TRIGGER__REFRESH_PERIOD, oldRefreshPeriod, refreshPeriod));
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
			case EMFEcoreControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
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
			case EMFEcoreControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
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
			case EMFEcoreControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
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
			case EMFEcoreControllersPackage.TIME_TRIGGER__REFRESH_PERIOD:
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
