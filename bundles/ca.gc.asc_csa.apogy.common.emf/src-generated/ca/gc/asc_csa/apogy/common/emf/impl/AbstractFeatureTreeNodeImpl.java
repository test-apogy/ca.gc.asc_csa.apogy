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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Feature Tree Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.AbstractFeatureTreeNodeImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractFeatureTreeNodeImpl extends AbstractFeatureNodeImpl implements AbstractFeatureTreeNode
{
  /**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
  protected EList<AbstractFeatureTreeNode> children;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected AbstractFeatureTreeNodeImpl()
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
		return ApogyCommonEMFPackage.Literals.ABSTRACT_FEATURE_TREE_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureTreeNode getParent()
  {
		if (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT) return null;
		return (AbstractFeatureTreeNode)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public AbstractFeatureTreeNode basicGetParent()
  {
		if (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT) return null;
		return (AbstractFeatureTreeNode)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(AbstractFeatureTreeNode newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(AbstractFeatureTreeNode newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN, AbstractFeatureTreeNode.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AbstractFeatureTreeNode> getChildren()
  {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<AbstractFeatureTreeNode>(AbstractFeatureTreeNode.class, this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT);
		}
		return children;
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((AbstractFeatureTreeNode)otherEnd, msgs);
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				return basicSetParent(null, msgs);
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				return eInternalContainer().eInverseRemove(this, ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN, AbstractFeatureTreeNode.class, msgs);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				return getChildren();
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				setParent((AbstractFeatureTreeNode)newValue);
				return;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends AbstractFeatureTreeNode>)newValue);
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				setParent((AbstractFeatureTreeNode)null);
				return;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				getChildren().clear();
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
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__PARENT:
				return basicGetParent() != null;
			case ApogyCommonEMFPackage.ABSTRACT_FEATURE_TREE_NODE__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AbstractFeatureTreeNodeImpl
