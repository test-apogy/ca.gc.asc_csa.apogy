package ca.gc.asc_csa.apogy.common.emf.impl;
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
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature List Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureListNodeImpl#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFeatureListNodeImpl extends AbstractFeatureNodeImpl implements AbstractFeatureListNode
{
  /**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
  protected AbstractFeatureListNode child;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractFeatureListNodeImpl()
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
		return ApogyCommonEMFPackage.Literals.ABSTRACT_FEATURE_LIST_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureListNode getParent()
  {
		if (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT) return null;
		return (AbstractFeatureListNode)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureListNode basicGetParent()
  {
		if (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT) return null;
		return (AbstractFeatureListNode)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(AbstractFeatureListNode newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(AbstractFeatureListNode newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD, AbstractFeatureListNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureListNode getChild()
  {
		return child;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetChild(AbstractFeatureListNode newChild, NotificationChain msgs)
  {
		AbstractFeatureListNode oldChild = child;
		child = newChild;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD, oldChild, newChild);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setChild(AbstractFeatureListNode newChild)
  {
		if (newChild != child) {
			NotificationChain msgs = null;
			if (child != null)
				msgs = ((InternalEObject)child).eInverseRemove(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT, AbstractFeatureListNode.class, msgs);
			if (newChild != null)
				msgs = ((InternalEObject)newChild).eInverseAdd(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT, AbstractFeatureListNode.class, msgs);
			msgs = basicSetChild(newChild, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD, newChild, newChild));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AbstractFeatureListNode)otherEnd, msgs);
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				if (child != null)
					msgs = ((InternalEObject)child).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD, null, msgs);
				return basicSetChild((AbstractFeatureListNode)otherEnd, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				return basicSetParent(null, msgs);
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				return basicSetChild(null, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD, AbstractFeatureListNode.class, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				return getChild();
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				setParent((AbstractFeatureListNode)newValue);
				return;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				setChild((AbstractFeatureListNode)newValue);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				setParent((AbstractFeatureListNode)null);
				return;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				setChild((AbstractFeatureListNode)null);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__PARENT:
				return basicGetParent() != null;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_LIST_NODE__CHILD:
				return child != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureListNodeImpl
