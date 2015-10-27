/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.programs.controllers.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.Program;
import org.eclipse.symphony.core.invocator.ProgramsList;
import org.eclipse.symphony.core.invocator.impl.ProgramImpl;
import org.eclipse.symphony.core.programs.controllers.ControllersConfiguration;
import org.eclipse.symphony.core.programs.controllers.Symphony__CoreProgramsControllersPackage;
import org.eclipse.symphony.core.programs.controllers.OperationCallControllerBinding;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Controllers Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.programs.controllers.impl.ControllersConfigurationImpl#isActive <em>Active</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ControllersConfigurationImpl extends ProgramImpl implements ControllersConfiguration
{
  /**
	 * The cached value of the '{@link #getOperationCalls() <em>Operation Calls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getOperationCalls()
	 * @generated
	 * @ordered
	 */
  protected EList<OperationCall> operationCalls;

  /**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ACTIVE_EDEFAULT = false;

  /**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
  protected boolean active = ACTIVE_EDEFAULT;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ControllersConfigurationImpl()
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
		return Symphony__CoreProgramsControllersPackage.Literals.CONTROLLERS_CONFIGURATION;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<OperationCall> getOperationCalls()
  {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS, Symphony__CoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
		}
		return operationCalls;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isActive()
  {
		return active;
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void setActive(boolean newActive)
  {
	  // De-Activates other ControllersConfiguration is applicable.
	  if(newActive && eContainer() instanceof ProgramsList)
	  {
		  ProgramsList programsList = (ProgramsList) eContainer();
		  for(Program program : programsList.getPrograms())
		  {
			  if(program instanceof ControllersConfiguration)
			  {				  
				  ControllersConfiguration cc = (ControllersConfiguration) program;
				  if(cc != this)
				  {
					  cc.setActive(false);
				  }
			  }
		  }
	  }
	  	  
	  // Updates all OperationCallControllerBinding in the list.
	  for(OperationCall op : getOperationCalls())
	  {
		  if(op instanceof OperationCallControllerBinding)
		  {
			  OperationCallControllerBinding ocb = (OperationCallControllerBinding) op;
			  ocb.setActive(newActive);
		  }
	  }
	  
	  setActiveGen(newActive);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setActiveGen(boolean newActive)
  {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE, oldActive, active));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOperationCalls()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return getOperationCalls();
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				return isActive();
		}
		return super.eGet(featureID, resolve, coreType);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
		switch (featureID) {
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				setActive((Boolean)newValue);
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
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
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
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__ACTIVE:
				return active != ACTIVE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
		if (baseClass == OperationCallContainer.class) {
			switch (derivedFeatureID) {
				case Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS: return Symphony__CoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
		if (baseClass == OperationCallContainer.class) {
			switch (baseFeatureID) {
				case Symphony__CoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return Symphony__CoreProgramsControllersPackage.CONTROLLERS_CONFIGURATION__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //ControllersConfigurationImpl
