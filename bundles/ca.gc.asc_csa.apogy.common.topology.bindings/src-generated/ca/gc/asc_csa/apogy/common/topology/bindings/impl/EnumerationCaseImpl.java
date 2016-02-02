package ca.gc.asc_csa.apogy.common.topology.bindings.impl;
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
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enumeration Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl#getEnumerationLiterals <em>Enumeration Literals</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.EnumerationCaseImpl#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnumerationCaseImpl extends MinimalEObjectImpl.Container implements EnumerationCase
{
  /**
	 * The cached value of the '{@link #getEnumerationLiterals() <em>Enumeration Literals</em>}' reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnumerationLiterals()
	 * @generated
	 * @ordered
	 */
  protected EList<EEnumLiteral> enumerationLiterals;

  /**
	 * The cached value of the '{@link #getTopologyRoot() <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getTopologyRoot()
	 * @generated
	 * @ordered
	 */
  protected Node topologyRoot;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EnumerationCaseImpl()
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
		return ApogyCommonTopologyBindingsPackage.Literals.ENUMERATION_CASE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<EEnumLiteral> getEnumerationLiterals()
  {
		if (enumerationLiterals == null) {
			enumerationLiterals = new EObjectResolvingEList<EEnumLiteral>(EEnumLiteral.class, this, ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS);
		}
		return enumerationLiterals;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Node getTopologyRoot()
  {
		return topologyRoot;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetTopologyRoot(Node newTopologyRoot, NotificationChain msgs)
  {
		Node oldTopologyRoot = topologyRoot;
		topologyRoot = newTopologyRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, oldTopologyRoot, newTopologyRoot);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setTopologyRoot(Node newTopologyRoot)
  {
		if (newTopologyRoot != topologyRoot) {
			NotificationChain msgs = null;
			if (topologyRoot != null)
				msgs = ((InternalEObject)topologyRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, null, msgs);
			if (newTopologyRoot != null)
				msgs = ((InternalEObject)newTopologyRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, null, msgs);
			msgs = basicSetTopologyRoot(newTopologyRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT, newTopologyRoot, newTopologyRoot));
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
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return basicSetTopologyRoot(null, msgs);
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
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				return getEnumerationLiterals();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return getTopologyRoot();
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
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				getEnumerationLiterals().addAll((Collection<? extends EEnumLiteral>)newValue);
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((Node)newValue);
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
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				getEnumerationLiterals().clear();
				return;
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				setTopologyRoot((Node)null);
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
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__ENUMERATION_LITERALS:
				return enumerationLiterals != null && !enumerationLiterals.isEmpty();
			case ApogyCommonTopologyBindingsPackage.ENUMERATION_CASE__TOPOLOGY_ROOT:
				return topologyRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumerationCaseImpl
