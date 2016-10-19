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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeMember;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl#getInterfaceClass <em>Interface Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeImpl#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
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
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
  protected EList<TypeMember> members;

  /**
	 * The cached value of the '{@link #getInterfaceClass() <em>Interface Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getInterfaceClass()
	 * @generated
	 * @ordered
	 */
  protected EClass interfaceClass;

  /**
	 * The cached value of the '{@link #getTypeApiAdapterClass() <em>Type Api Adapter Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTypeApiAdapterClass()
	 * @generated
	 * @ordered
	 */
  protected EClass typeApiAdapterClass;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeImpl()
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
		return ApogyCoreInvocatorPackage.Literals.TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TypeMember> getMembers()
  {
		if (members == null) {
			members = new EObjectContainmentEList<TypeMember>(TypeMember.class, this, ApogyCoreInvocatorPackage.TYPE__MEMBERS);
		}
		return members;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getInterfaceClass()
  {
		if (interfaceClass != null && interfaceClass.eIsProxy()) {
			InternalEObject oldInterfaceClass = (InternalEObject)interfaceClass;
			interfaceClass = (EClass)eResolveProxy(oldInterfaceClass);
			if (interfaceClass != oldInterfaceClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS, oldInterfaceClass, interfaceClass));
			}
		}
		return interfaceClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass basicGetInterfaceClass()
  {
		return interfaceClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInterfaceClass(EClass newInterfaceClass)
  {
		EClass oldInterfaceClass = interfaceClass;
		interfaceClass = newInterfaceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS, oldInterfaceClass, interfaceClass));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getTypeApiAdapterClass()
  {
		if (typeApiAdapterClass != null && typeApiAdapterClass.eIsProxy()) {
			InternalEObject oldTypeApiAdapterClass = (InternalEObject)typeApiAdapterClass;
			typeApiAdapterClass = (EClass)eResolveProxy(oldTypeApiAdapterClass);
			if (typeApiAdapterClass != oldTypeApiAdapterClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS, oldTypeApiAdapterClass, typeApiAdapterClass));
			}
		}
		return typeApiAdapterClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass basicGetTypeApiAdapterClass()
  {
		return typeApiAdapterClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTypeApiAdapterClass(EClass newTypeApiAdapterClass)
  {
		EClass oldTypeApiAdapterClass = typeApiAdapterClass;
		typeApiAdapterClass = newTypeApiAdapterClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS, oldTypeApiAdapterClass, typeApiAdapterClass));
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
			case ApogyCoreInvocatorPackage.TYPE__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.TYPE__MEMBERS:
				return getMembers();
			case ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS:
				if (resolve) return getInterfaceClass();
				return basicGetInterfaceClass();
			case ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS:
				if (resolve) return getTypeApiAdapterClass();
				return basicGetTypeApiAdapterClass();
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
			case ApogyCoreInvocatorPackage.TYPE__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends TypeMember>)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS:
				setInterfaceClass((EClass)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS:
				setTypeApiAdapterClass((EClass)newValue);
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
			case ApogyCoreInvocatorPackage.TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.TYPE__MEMBERS:
				getMembers().clear();
				return;
			case ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS:
				setInterfaceClass((EClass)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS:
				setTypeApiAdapterClass((EClass)null);
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
			case ApogyCoreInvocatorPackage.TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.TYPE__MEMBERS:
				return members != null && !members.isEmpty();
			case ApogyCoreInvocatorPackage.TYPE__INTERFACE_CLASS:
				return interfaceClass != null;
			case ApogyCoreInvocatorPackage.TYPE__TYPE_API_ADAPTER_CLASS:
				return typeApiAdapterClass != null;
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

} //TypeImpl
