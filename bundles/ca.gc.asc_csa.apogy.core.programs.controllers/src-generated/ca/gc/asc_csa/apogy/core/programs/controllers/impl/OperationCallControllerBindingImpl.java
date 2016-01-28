/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.programs.controllers.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallImpl;
import ca.gc.asc_csa.apogy.core.programs.controllers.ApogyCoreProgramsControllersPackage;
import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;
import ca.gc.asc_csa.apogy.core.programs.controllers.Trigger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Controller Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.OperationCallControllerBindingImpl#isCreateResult <em>Create Result</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.OperationCallControllerBindingImpl#isActive <em>Active</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.programs.controllers.impl.OperationCallControllerBindingImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallControllerBindingImpl extends OperationCallImpl implements OperationCallControllerBinding
{
   /**
    * Whether or not the operation call is busy being executed. This is used to ensure that calls to the operation
    * are NOT queued if the operation execution is not completed by the time it is called again. Queuing commands using
    * controllers binding is typically not what we want.
    */
   private boolean busy = false;
	
  /**
	 * The default value of the '{@link #isCreateResult() <em>Create Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateResult()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_RESULT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCreateResult() <em>Create Result</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreateResult()
	 * @generated
	 * @ordered
	 */
	protected boolean createResult = CREATE_RESULT_EDEFAULT;

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
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
  protected Trigger trigger;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OperationCallControllerBindingImpl()
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
		return ApogyCoreProgramsControllersPackage.Literals.OPERATION_CALL_CONTROLLER_BINDING;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreateResult() {
		return createResult;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateResult(boolean newCreateResult) {
		boolean oldCreateResult = createResult;
		createResult = newCreateResult;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT, oldCreateResult, createResult));
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
	 * @generated
	 */
  public void setActive(boolean newActive)
  {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE, oldActive, active));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Trigger getTrigger()
  {
		return trigger;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTrigger(Trigger newTrigger, NotificationChain msgs)
  {
		Trigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTrigger(Trigger newTrigger)
  {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, ApogyCoreProgramsControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING, Trigger.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, ApogyCoreProgramsControllersPackage.TRIGGER__OPERATION_CALL_CONTROLLER_BINDING, Trigger.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, newTrigger, newTrigger));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void update()
  {
	  // If the operation call is busy being executed.
	  if(!busy)
	  {
		  ApogyCoreInvocatorFacade.INSTANCE.exec(this, isCreateResult());
		  busy = false;
	  }	  
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				if (trigger != null)
					msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER, null, msgs);
				return basicSetTrigger((Trigger)otherEnd, msgs);
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
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				return basicSetTrigger(null, msgs);
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
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT:
				return isCreateResult();
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE:
				return isActive();
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				return getTrigger();
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
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT:
				setCreateResult((Boolean)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				setTrigger((Trigger)newValue);
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
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT:
				setCreateResult(CREATE_RESULT_EDEFAULT);
				return;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				setTrigger((Trigger)null);
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
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__CREATE_RESULT:
				return createResult != CREATE_RESULT_EDEFAULT;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING__TRIGGER:
				return trigger != null;
		}
		return super.eIsSet(featureID);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case ApogyCoreProgramsControllersPackage.OPERATION_CALL_CONTROLLER_BINDING___UPDATE:
				update();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (createResult: ");
		result.append(createResult);
		result.append(", active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //OperationCallControllerBindingImpl
