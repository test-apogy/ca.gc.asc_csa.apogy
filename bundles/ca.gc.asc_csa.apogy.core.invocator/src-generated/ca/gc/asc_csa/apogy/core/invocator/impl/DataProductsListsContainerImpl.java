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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsList;
import ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Products Lists Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.DataProductsListsContainerImpl#getDataProductsList <em>Data Products List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataProductsListsContainerImpl extends MinimalEObjectImpl.Container implements DataProductsListsContainer
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
	 * The cached value of the '{@link #getDataProductsList() <em>Data Products List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataProductsList()
	 * @generated
	 * @ordered
	 */
  protected EList<DataProductsList> dataProductsList;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsListsContainerImpl()
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
		return ApogyCoreInvocatorPackage.Literals.DATA_PRODUCTS_LISTS_CONTAINER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__NAME, oldName, name));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String getDescription()
  {
		return description;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDescription(String newDescription)
  {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION, oldDescription, description));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession getInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public InvocatorSession basicGetInvocatorSession()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION) return null;
		return (InvocatorSession)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetInvocatorSession(InvocatorSession newInvocatorSession, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newInvocatorSession, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setInvocatorSession(InvocatorSession newInvocatorSession)
  {
		if (newInvocatorSession != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION && newInvocatorSession != null)) {
			if (EcoreUtil.isAncestor(this, newInvocatorSession))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInvocatorSession != null)
				msgs = ((InternalEObject)newInvocatorSession).eInverseAdd(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER, InvocatorSession.class, msgs);
			msgs = basicSetInvocatorSession(newInvocatorSession, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION, newInvocatorSession, newInvocatorSession));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<DataProductsList> getDataProductsList()
  {
		if (dataProductsList == null) {
			dataProductsList = new EObjectContainmentWithInverseEList<DataProductsList>(DataProductsList.class, this, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST, ApogyCoreInvocatorPackage.DATA_PRODUCTS_LIST__DATA_PRODUCTS_LISTS_CONTAINER);
		}
		return dataProductsList;
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInvocatorSession((InvocatorSession)otherEnd, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDataProductsList()).basicAdd(otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				return basicSetInvocatorSession(null, msgs);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				return ((InternalEList<?>)getDataProductsList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.INVOCATOR_SESSION__DATA_PRODUCTS_LIST_CONTAINER, InvocatorSession.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__NAME:
				return getName();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION:
				return getDescription();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				if (resolve) return getInvocatorSession();
				return basicGetInvocatorSession();
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				return getDataProductsList();
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)newValue);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				getDataProductsList().clear();
				getDataProductsList().addAll((Collection<? extends DataProductsList>)newValue);
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				setInvocatorSession((InvocatorSession)null);
				return;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				getDataProductsList().clear();
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
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__INVOCATOR_SESSION:
				return basicGetInvocatorSession() != null;
			case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DATA_PRODUCTS_LIST:
				return dataProductsList != null && !dataProductsList.isEmpty();
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
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyCoreInvocatorPackage.DATA_PRODUCTS_LISTS_CONTAINER__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //DataProductsListsContainerImpl
