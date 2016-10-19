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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Calls List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.OperationCallsListImpl#getOperationCalls <em>Operation Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallsListImpl extends ScriptBasedProgramImpl implements OperationCallsList
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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OperationCallsListImpl()
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
		return ApogyCoreInvocatorPackage.Literals.OPERATION_CALLS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<OperationCall> getOperationCalls()
  {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS, ApogyCoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
		}
		return operationCalls;
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
				return getOperationCalls();
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
				getOperationCalls().clear();
				getOperationCalls().addAll((Collection<? extends OperationCall>)newValue);
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
				getOperationCalls().clear();
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
			case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
				return operationCalls != null && !operationCalls.isEmpty();
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
				case ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
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
				case ApogyCoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return ApogyCoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationCallsListImpl
