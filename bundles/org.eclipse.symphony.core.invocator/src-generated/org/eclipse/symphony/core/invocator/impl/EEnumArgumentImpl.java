/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.core.invocator.EEnumArgument;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EEnum Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl#getEEnumLiteral <em>EEnum Literal</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.EEnumArgumentImpl#getEEnum <em>EEnum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EEnumArgumentImpl extends ArgumentImpl implements EEnumArgument
{
  /**
	 * The cached value of the '{@link #getEEnumLiteral() <em>EEnum Literal</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEEnumLiteral()
	 * @generated
	 * @ordered
	 */
  protected EEnumLiteral eEnumLiteral;

  /**
	 * The cached value of the '{@link #getEEnum() <em>EEnum</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEEnum()
	 * @generated
	 * @ordered
	 */
  protected EEnum eEnum;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EEnumArgumentImpl()
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
		return EMFEcoreInvocatorPackage.Literals.EENUM_ARGUMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumLiteral getEEnumLiteral()
  {
		if (eEnumLiteral != null && eEnumLiteral.eIsProxy()) {
			InternalEObject oldEEnumLiteral = (InternalEObject)eEnumLiteral;
			eEnumLiteral = (EEnumLiteral)eResolveProxy(oldEEnumLiteral);
			if (eEnumLiteral != oldEEnumLiteral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL, oldEEnumLiteral, eEnumLiteral));
			}
		}
		return eEnumLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnumLiteral basicGetEEnumLiteral()
  {
		return eEnumLiteral;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEEnumLiteral(EEnumLiteral newEEnumLiteral)
  {
		EEnumLiteral oldEEnumLiteral = eEnumLiteral;
		eEnumLiteral = newEEnumLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL, oldEEnumLiteral, eEnumLiteral));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getEEnum()
  {
		if (eEnum != null && eEnum.eIsProxy()) {
			InternalEObject oldEEnum = (InternalEObject)eEnum;
			eEnum = (EEnum)eResolveProxy(oldEEnum);
			if (eEnum != oldEEnum) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM, oldEEnum, eEnum));
			}
		}
		return eEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum basicGetEEnum()
  {
		return eEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEEnum(EEnum newEEnum)
  {
		EEnum oldEEnum = eEnum;
		eEnum = newEEnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM, oldEEnum, eEnum));
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
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL:
				if (resolve) return getEEnumLiteral();
				return basicGetEEnumLiteral();
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM:
				if (resolve) return getEEnum();
				return basicGetEEnum();
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
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL:
				setEEnumLiteral((EEnumLiteral)newValue);
				return;
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM:
				setEEnum((EEnum)newValue);
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
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL:
				setEEnumLiteral((EEnumLiteral)null);
				return;
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM:
				setEEnum((EEnum)null);
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
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM_LITERAL:
				return eEnumLiteral != null;
			case EMFEcoreInvocatorPackage.EENUM_ARGUMENT__EENUM:
				return eEnum != null;
		}
		return super.eIsSet(featureID);
	}

  @Override
  public Object getParameterValue() 
  {
	  return getEEnumLiteral().getInstance();
  }
} //EEnumArgumentImpl
