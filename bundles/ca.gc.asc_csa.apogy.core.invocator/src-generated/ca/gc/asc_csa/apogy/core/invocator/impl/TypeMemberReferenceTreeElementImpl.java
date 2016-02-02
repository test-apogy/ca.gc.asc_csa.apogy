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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.emf.TreeRootNode;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceTreeElement;

import com.google.common.base.Objects;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Member Reference Tree Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#getChild <em>Child</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#getFeatureRootNode <em>Feature Root Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#isRoot <em>Root</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeMemberReferenceTreeElementImpl#isLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeMemberReferenceTreeElementImpl extends TypeMemberReferenceImpl implements TypeMemberReferenceTreeElement
{
  /**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
  protected EList<TypeMemberReferenceTreeElement> child;

  /**
	 * The cached value of the '{@link #getFeatureRootNode() <em>Feature Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getFeatureRootNode()
	 * @generated
	 * @ordered
	 */
  protected TreeRootNode featureRootNode;

  /**
	 * The default value of the '{@link #isRoot() <em>Root</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isRoot()
	 * @generated
	 * @ordered
	 */
  protected static final boolean ROOT_EDEFAULT = false;

  /**
	 * The default value of the '{@link #isLeaf() <em>Leaf</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #isLeaf()
	 * @generated
	 * @ordered
	 */
  protected static final boolean LEAF_EDEFAULT = false;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected TypeMemberReferenceTreeElementImpl()
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
		return ApogyCoreInvocatorPackage.Literals.TYPE_MEMBER_REFERENCE_TREE_ELEMENT;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TypeMemberReferenceTreeElement> getChild()
  {
		if (child == null) {
			child = new EObjectContainmentWithInverseEList<TypeMemberReferenceTreeElement>(TypeMemberReferenceTreeElement.class, this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT);
		}
		return child;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement getParent()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT) return null;
		return (TypeMemberReferenceTreeElement)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement basicGetParent()
  {
		if (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT) return null;
		return (TypeMemberReferenceTreeElement)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetParent(TypeMemberReferenceTreeElement newParent, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newParent, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setParent(TypeMemberReferenceTreeElement newParent)
  {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD, TypeMemberReferenceTreeElement.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT, newParent, newParent));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TreeRootNode getFeatureRootNode()
  {
		return featureRootNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureRootNode(TreeRootNode newFeatureRootNode, NotificationChain msgs) {
		TreeRootNode oldFeatureRootNode = featureRootNode;
		featureRootNode = newFeatureRootNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE, oldFeatureRootNode, newFeatureRootNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeatureRootNode(TreeRootNode newFeatureRootNode) {
		if (newFeatureRootNode != featureRootNode) {
			NotificationChain msgs = null;
			if (featureRootNode != null)
				msgs = ((InternalEObject)featureRootNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE, null, msgs);
			if (newFeatureRootNode != null)
				msgs = ((InternalEObject)newFeatureRootNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE, null, msgs);
			msgs = basicSetFeatureRootNode(newFeatureRootNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE, newFeatureRootNode, newFeatureRootNode));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isRoot()
  {
		TypeMemberReferenceTreeElement _parent = this.getParent();
		return Objects.equal(_parent, null);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement getRootElement()
  {
		TypeMemberReferenceTreeElement rootElement = basicGetRootElement();
		return rootElement != null && rootElement.eIsProxy() ? (TypeMemberReferenceTreeElement)eResolveProxy((InternalEObject)rootElement) : rootElement;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TypeMemberReferenceTreeElement basicGetRootElement()
  {
		TypeMemberReferenceTreeElement _xifexpression = null;
		boolean _isRoot = this.isRoot();
		if (_isRoot) {
			return this;
		}
		else {
			TypeMemberReferenceTreeElement _parent = this.getParent();
			_xifexpression = _parent.getRootElement();
		}
		return _xifexpression;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean isLeaf()
  {
		EList<TypeMemberReferenceTreeElement> _child = this.getChild();
		return Objects.equal(_child, null);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild()).basicAdd(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((TypeMemberReferenceTreeElement)otherEnd, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				return basicSetParent(null, msgs);
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
				return basicSetFeatureRootNode(null, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				return eInternalContainer().eInverseRemove(this, ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD, TypeMemberReferenceTreeElement.class, msgs);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				return getChild();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
				return getFeatureRootNode();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT:
				return isRoot();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT_ELEMENT:
				if (resolve) return getRootElement();
				return basicGetRootElement();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF:
				return isLeaf();
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends TypeMemberReferenceTreeElement>)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				setParent((TypeMemberReferenceTreeElement)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
				setFeatureRootNode((TreeRootNode)newValue);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				getChild().clear();
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				setParent((TypeMemberReferenceTreeElement)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
				setFeatureRootNode((TreeRootNode)null);
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
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__CHILD:
				return child != null && !child.isEmpty();
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__PARENT:
				return basicGetParent() != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__FEATURE_ROOT_NODE:
				return featureRootNode != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT:
				return isRoot() != ROOT_EDEFAULT;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__ROOT_ELEMENT:
				return basicGetRootElement() != null;
			case ApogyCoreInvocatorPackage.TYPE_MEMBER_REFERENCE_TREE_ELEMENT__LEAF:
				return isLeaf() != LEAF_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //TypeMemberReferenceTreeElementImpl
