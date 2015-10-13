/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.ExceptionContainer;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.OperationCallResult;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallResultImpl#getExceptionContainer <em>Exception Container</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallResultImpl extends AbstractResultImpl implements OperationCallResult
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
	 * The cached value of the '{@link #getExceptionContainer() <em>Exception Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getExceptionContainer()
	 * @generated
	 * @ordered
	 */
  protected ExceptionContainer exceptionContainer;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected OperationCallResultImpl()
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
		return EMFEcoreInvocatorPackage.Literals.OPERATION_CALL_RESULT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCalls() {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS, EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
		}
		return operationCalls;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCall getOperationCall()
  {
		EList<OperationCall> _operationCalls = this.getOperationCalls();
		int _size = _operationCalls.size();
		boolean _equals = (_size == 0);
		if (_equals) {
			return null;
		}
		else {
			EList<OperationCall> _operationCalls_1 = this.getOperationCalls();
			return _operationCalls_1.get(0);
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ExceptionContainer getExceptionContainer()
  {
		return exceptionContainer;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetExceptionContainer(ExceptionContainer newExceptionContainer, NotificationChain msgs)
  {
		ExceptionContainer oldExceptionContainer = exceptionContainer;
		exceptionContainer = newExceptionContainer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, oldExceptionContainer, newExceptionContainer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setExceptionContainer(ExceptionContainer newExceptionContainer)
  {
		if (newExceptionContainer != exceptionContainer) {
			NotificationChain msgs = null;
			if (exceptionContainer != null)
				msgs = ((InternalEObject)exceptionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, null, msgs);
			if (newExceptionContainer != null)
				msgs = ((InternalEObject)newExceptionContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, null, msgs);
			msgs = basicSetExceptionContainer(newExceptionContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, newExceptionContainer, newExceptionContainer));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
				return basicSetExceptionContainer(null, msgs);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return getOperationCalls();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL:
				return getOperationCall();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
				return getExceptionContainer();
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
				setExceptionContainer((ExceptionContainer)newValue);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
				setExceptionContainer((ExceptionContainer)null);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL:
				return getOperationCall() != null;
			case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
				return exceptionContainer != null;
		}
		return super.eIsSet(featureID);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (derivedFeatureID) {
				case EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS: return EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
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
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OperationCallContainer.class) {
			switch (baseFeatureID) {
				case EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return EMFEcoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationCallResultImpl
