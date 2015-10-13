/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallContainer;
import org.eclipse.symphony.core.invocator.OperationCallsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation Calls List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.OperationCallsListImpl#getOperationCalls <em>Operation Calls</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationCallsListImpl extends ProgramImpl implements OperationCallsList
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
  protected OperationCallsListImpl()
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
		return EMFEcoreInvocatorPackage.Literals.OPERATION_CALLS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<OperationCall> getOperationCalls()
  {
		if (operationCalls == null) {
			operationCalls = new EObjectContainmentWithInverseEList<OperationCall>(OperationCall.class, this, EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS, EMFEcoreInvocatorPackage.OPERATION_CALL__OPERATION_CALL_CONTAINER);
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
			case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS:
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
				case EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS: return EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS;
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
				case EMFEcoreInvocatorPackage.OPERATION_CALL_CONTAINER__OPERATION_CALLS: return EMFEcoreInvocatorPackage.OPERATION_CALLS_LIST__OPERATION_CALLS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //OperationCallsListImpl
