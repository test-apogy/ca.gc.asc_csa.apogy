/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeMember;

import ca.gc.asc_csa.eclipse.emf.ecore.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeMemberImpl#getTypeFeatureRootNode <em>Type Feature Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMemberImpl extends MinimalEObjectImpl.Container implements TypeMember
{
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected static final String NAME_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
  protected String name = NAME_EDEFAULT;

  /**
	 * The cached value of the '{@link #getMemberType() <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMemberType()
	 * @generated
	 * @ordered
	 */
  protected Type memberType;

  /**
	 * The cached value of the '{@link #getTypeFeatureRootNode() <em>Type Feature Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeFeatureRootNode()
	 * @generated
	 * @ordered
	 */
  protected TreeRootNode typeFeatureRootNode;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypeMemberImpl()
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
		return EMFEcoreInvocatorPackage.Literals.TYPE_MEMBER;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getName()
  {
		return name;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setName(String newName)
  {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.TYPE_MEMBER__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Type getMemberType()
  {
		if (memberType != null && memberType.eIsProxy()) {
			InternalEObject oldMemberType = (InternalEObject)memberType;
			memberType = (Type)eResolveProxy(oldMemberType);
			if (memberType != oldMemberType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE, oldMemberType, memberType));
			}
		}
		return memberType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Type basicGetMemberType()
  {
		return memberType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setMemberType(Type newMemberType)
  {
		Type oldMemberType = memberType;
		memberType = newMemberType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE, oldMemberType, memberType));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TreeRootNode getTypeFeatureRootNode()
  {
		return typeFeatureRootNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTypeFeatureRootNode(TreeRootNode newTypeFeatureRootNode, NotificationChain msgs)
  {
		TreeRootNode oldTypeFeatureRootNode = typeFeatureRootNode;
		typeFeatureRootNode = newTypeFeatureRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, oldTypeFeatureRootNode, newTypeFeatureRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeFeatureRootNode(TreeRootNode newTypeFeatureRootNode)
  {
		if (newTypeFeatureRootNode != typeFeatureRootNode) {
			NotificationChain msgs = null;
			if (typeFeatureRootNode != null)
				msgs = ((InternalEObject)typeFeatureRootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, null, msgs);
			if (newTypeFeatureRootNode != null)
				msgs = ((InternalEObject)newTypeFeatureRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, null, msgs);
			msgs = basicSetTypeFeatureRootNode(newTypeFeatureRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, newTypeFeatureRootNode, newTypeFeatureRootNode));
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
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
				return basicSetTypeFeatureRootNode(null, msgs);
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
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__NAME:
				return getName();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				if (resolve) return getMemberType();
				return basicGetMemberType();
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
				return getTypeFeatureRootNode();
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
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				setMemberType((Type)newValue);
				return;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
				setTypeFeatureRootNode((TreeRootNode)newValue);
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
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				setMemberType((Type)null);
				return;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
				setTypeFeatureRootNode((TreeRootNode)null);
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
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				return memberType != null;
			case EMFEcoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
				return typeFeatureRootNode != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //TypeMemberImpl