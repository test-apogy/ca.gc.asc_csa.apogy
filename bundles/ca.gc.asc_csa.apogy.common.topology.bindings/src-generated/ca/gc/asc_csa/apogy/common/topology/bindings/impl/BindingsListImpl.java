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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding;
import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bindings List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.impl.BindingsListImpl#getBindings <em>Bindings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BindingsListImpl extends MinimalEObjectImpl.Container implements BindingsList
{
  /**
	 * The cached value of the '{@link #getBindings() <em>Bindings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getBindings()
	 * @generated
	 * @ordered
	 */
  protected EList<AbstractTopologyBinding> bindings;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected BindingsListImpl()
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
		return ApogyCommonTopologyBindingsPackage.Literals.BINDINGS_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<AbstractTopologyBinding> getBindings()
  {
		if (bindings == null) {
			bindings = new EObjectContainmentEList<AbstractTopologyBinding>(AbstractTopologyBinding.class, this, ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS);
		}
		return bindings;
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS:
				return ((InternalEList<?>)getBindings()).basicRemove(otherEnd, msgs);
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS:
				return getBindings();
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS:
				getBindings().clear();
				getBindings().addAll((Collection<? extends AbstractTopologyBinding>)newValue);
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS:
				getBindings().clear();
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
			case ApogyCommonTopologyBindingsPackage.BINDINGS_LIST__BINDINGS:
				return bindings != null && !bindings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BindingsListImpl
