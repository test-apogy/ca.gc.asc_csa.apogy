/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Member Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceImpl#getTypeMember <em>Type Member</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMemberReferenceImpl extends MinimalEObjectImpl.Container implements TypeMemberReference
{
  /**
	 * The cached value of the '{@link #getTypeMember() <em>Type Member</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeMember()
	 * @generated
	 * @ordered
	 */
  protected TypeMember typeMember;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypeMemberReferenceImpl()
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
		return ApogyCoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMember getTypeMember()
  {
		if (typeMember != null && typeMember.eIsProxy()) {
			InternalEObject oldTypeMember = (InternalEObject)typeMember;
			typeMember = (TypeMember)eResolveProxy(oldTypeMember);
			if (typeMember != oldTypeMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER, oldTypeMember, typeMember));
			}
		}
		return typeMember;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMember basicGetTypeMember()
  {
		return typeMember;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeMember(TypeMember newTypeMember)
  {
		TypeMember oldTypeMember = typeMember;
		typeMember = newTypeMember;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER, oldTypeMember, typeMember));
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER:
				if (resolve) return getTypeMember();
				return basicGetTypeMember();
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER:
				setTypeMember((TypeMember)newValue);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER:
				setTypeMember((TypeMember)null);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE__TYPE_MEMBER:
				return typeMember != null;
		}
		return super.eIsSet(featureID);
	}

} //TypeMemberReferenceImpl