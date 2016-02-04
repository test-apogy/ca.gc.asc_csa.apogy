package ca.gc.asc_csa.apogy.core.invocator.impl;
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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Call Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl#getOperationCalls <em>Operation Calls</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl#getOperationCall <em>Operation Call</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallResultImpl#getExceptionContainer <em>Exception Container</em>}</li>
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
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALL_RESULT;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationCall> getOperationCalls() {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS, ApogyCoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, oldExceptionContainer, newExceptionContainer);
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
				msgs = ((InternalEObject)exceptionContainer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, null, msgs);
			if (newExceptionContainer != null)
				msgs = ((InternalEObject)newExceptionContainer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, null, msgs);
			msgs = basicSetExceptionContainer(newExceptionContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER, newExceptionContainer, newExceptionContainer));
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return ((InternalEList<?>)getOperationCalls()).basicRemove(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return getOperationCalls();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL:
				return getOperationCall();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				getOperationCalls().clear();
				return;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALL:
				return getOperationCall() != null;
			case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__EXCEPTION_CONTAINER:
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
				case ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
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
				case ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALL_RESULT__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationCallResultImpl
