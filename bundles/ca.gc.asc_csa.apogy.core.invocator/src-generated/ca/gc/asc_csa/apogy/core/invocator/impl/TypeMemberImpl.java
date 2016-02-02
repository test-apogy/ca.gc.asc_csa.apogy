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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberImpl#getTypeFeatureRootNode <em>Type Feature Root Node</em>}</li>
 * </ul>
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
		return ApogyCoreInvocatorPackage.Literals.TYPE_MEMBER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER__NAME, oldName, name));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE, oldMemberType, memberType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE, oldMemberType, memberType));
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
	public NotificationChain basicSetTypeFeatureRootNode(TreeRootNode newTypeFeatureRootNode, NotificationChain msgs) {
		TreeRootNode oldTypeFeatureRootNode = typeFeatureRootNode;
		typeFeatureRootNode = newTypeFeatureRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, oldTypeFeatureRootNode, newTypeFeatureRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeFeatureRootNode(TreeRootNode newTypeFeatureRootNode) {
		if (newTypeFeatureRootNode != typeFeatureRootNode) {
			NotificationChain msgs = null;
			if (typeFeatureRootNode != null)
				msgs = ((InternalEObject)typeFeatureRootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, null, msgs);
			if (newTypeFeatureRootNode != null)
				msgs = ((InternalEObject)newTypeFeatureRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, null, msgs);
			msgs = basicSetTypeFeatureRootNode(newTypeFeatureRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE, newTypeFeatureRootNode, newTypeFeatureRootNode));
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				if (resolve) return getMemberType();
				return basicGetMemberType();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				setMemberType((Type)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				setMemberType((Type)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__MEMBER_TYPE:
				return memberType != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER__TYPE_FEATURE_ROOT_NODE:
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
