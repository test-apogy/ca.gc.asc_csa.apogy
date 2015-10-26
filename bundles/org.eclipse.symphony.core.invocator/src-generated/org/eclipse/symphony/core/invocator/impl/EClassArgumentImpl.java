/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.invocator.EClassArgument;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EClass Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EClassArgumentImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EClassArgumentImpl extends ArgumentImpl implements EClassArgument
{
  /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
  protected EObject value;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EClassArgumentImpl()
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
		return EMFEcoreInvocatorPackage.Literals.ECLASS_ARGUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EObject getValue()
  {
		return value;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetValue(EObject newValue, NotificationChain msgs)
  {
		EObject oldValue = value;
		value = newValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE, oldValue, newValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setValue(EObject newValue)
  {
		if (newValue != value) {
			NotificationChain msgs = null;
			if (value != null)
				msgs = ((InternalEObject)value).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE, null, msgs);
			if (newValue != null)
				msgs = ((InternalEObject)newValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE, null, msgs);
			msgs = basicSetValue(newValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE, newValue, newValue));
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
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				return basicSetValue(null, msgs);
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
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				return getValue();
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
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				setValue((EObject)newValue);
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
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				setValue((EObject)null);
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
			case EMFEcoreInvocatorPackage.ECLASS_ARGUMENT__VALUE:
				return value != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
	public Object getParameterValue() {
		return getValue();
	}

} //EClassArgumentImpl
