/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Value;
import org.eclipse.symphony.core.invocator.ValuesList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Values List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.ValuesListImpl#getValues <em>Values</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ValuesListImpl extends MinimalEObjectImpl.Container implements ValuesList
{
  /**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
  protected EList<Value> values;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ValuesListImpl()
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
		return EMFEcoreInvocatorPackage.Literals.VALUES_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<Value> getValues()
  {
		if (values == null) {
			values = new EObjectContainmentEList<Value>(Value.class, this, EMFEcoreInvocatorPackage.VALUES_LIST__VALUES);
		}
		return values;
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
			case EMFEcoreInvocatorPackage.VALUES_LIST__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case EMFEcoreInvocatorPackage.VALUES_LIST__VALUES:
				return getValues();
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
			case EMFEcoreInvocatorPackage.VALUES_LIST__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends Value>)newValue);
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
			case EMFEcoreInvocatorPackage.VALUES_LIST__VALUES:
				getValues().clear();
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
			case EMFEcoreInvocatorPackage.VALUES_LIST__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ValuesListImpl
