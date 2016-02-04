package ca.gc.asc_csa.apogy.core.environment.impl;
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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.impl.GroupNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteNodeImpl#getWorksite <em>Worksite</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WorksiteNodeImpl extends GroupNodeImpl implements WorksiteNode
{	
  /**
	 * The cached value of the '{@link #getWorksite() <em>Worksite</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWorksite()
	 * @generated
	 * @ordered
	 */
  protected Worksite worksite;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WorksiteNodeImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.WORKSITE_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Worksite getWorksite()
  {
		if (worksite != null && worksite.eIsProxy()) {
			InternalEObject oldWorksite = (InternalEObject)worksite;
			worksite = (Worksite)eResolveProxy(oldWorksite);
			if (worksite != oldWorksite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
			}
		}
		return worksite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Worksite basicGetWorksite()
  {
		return worksite;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWorksite(Worksite newWorksite)
  {
		Worksite oldWorksite = worksite;
		worksite = newWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
	}
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setWorksiteGen(Worksite newWorksite)
  {
		Worksite oldWorksite = worksite;
		worksite = newWorksite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE, oldWorksite, worksite));
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
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				if (resolve) return getWorksite();
				return basicGetWorksite();
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
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				setWorksite((Worksite)newValue);
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
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				setWorksite((Worksite)null);
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
			case ApogyCoreEnvironmentPackage.WORKSITE_NODE__WORKSITE:
				return worksite != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
		if (visitor.getType().isInstance(this)) {
			visitor.visit(this);
		}

		// We do the same for all the children.
		for (Node child : getChildren()) {
			child.accept(visitor);
		}
  }
} //WorksiteNodeImpl
