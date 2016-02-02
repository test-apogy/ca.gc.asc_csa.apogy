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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.Environment;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.impl.AbstractWorksiteImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl#getOrbitsModels <em>Orbits Models</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class WorksiteImpl extends AbstractWorksiteImpl implements Worksite
{
  /**
	 * The cached value of the '{@link #getWorksiteNode() <em>Worksite Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getWorksiteNode()
	 * @generated
	 * @ordered
	 */
  protected WorksiteNode worksiteNode;

  /**
	 * The cached value of the '{@link #getOrbitsModels() <em>Orbits Models</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrbitsModels()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractOrbitModel> orbitsModels;

		/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
  protected Environment environment;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected WorksiteImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.WORKSITE;
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public WorksiteNode getWorksiteNode()
  {
	  if(getWorksiteNodeGen() == null)
	  {
		  worksiteNode = ApogyCoreEnvironmentFactory.eINSTANCE.createWorksiteNode();
		  worksiteNode.setWorksite(this);
	  }
	  
	  return getWorksiteNodeGen();
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode getWorksiteNodeGen()
  {
		if (worksiteNode != null && worksiteNode.eIsProxy()) {
			InternalEObject oldWorksiteNode = (InternalEObject)worksiteNode;
			worksiteNode = (WorksiteNode)eResolveProxy(oldWorksiteNode);
			if (worksiteNode != oldWorksiteNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.WORKSITE__WORKSITE_NODE, oldWorksiteNode, worksiteNode));
			}
		}
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public WorksiteNode basicGetWorksiteNode()
  {
		return worksiteNode;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractOrbitModel> getOrbitsModels() {
		if (orbitsModels == null) {
			orbitsModels = new EObjectResolvingEList<AbstractOrbitModel>(AbstractOrbitModel.class, this, ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS);
		}
		return orbitsModels;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Environment getEnvironment()
  {
		return environment;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetEnvironment(Environment newEnvironment, NotificationChain msgs)
  {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT, oldEnvironment, newEnvironment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setEnvironment(Environment newEnvironment)
  {
		if (newEnvironment != environment) {
			NotificationChain msgs = null;
			if (environment != null)
				msgs = ((InternalEObject)environment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT, null, msgs);
			if (newEnvironment != null)
				msgs = ((InternalEObject)newEnvironment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT, null, msgs);
			msgs = basicSetEnvironment(newEnvironment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT, newEnvironment, newEnvironment));
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
			case ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return basicSetEnvironment(null, msgs);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__WORKSITE_NODE:
				if (resolve) return getWorksiteNode();
				return basicGetWorksiteNode();
			case ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				return getOrbitsModels();
			case ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return getEnvironment();
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
			case ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				getOrbitsModels().clear();
				getOrbitsModels().addAll((Collection<? extends AbstractOrbitModel>)newValue);
				return;
			case ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT:
				setEnvironment((Environment)newValue);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				getOrbitsModels().clear();
				return;
			case ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT:
				setEnvironment((Environment)null);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__WORKSITE_NODE:
				return worksiteNode != null;
			case ApogyCoreEnvironmentPackage.WORKSITE__ORBITS_MODELS:
				return orbitsModels != null && !orbitsModels.isEmpty();
			case ApogyCoreEnvironmentPackage.WORKSITE__ENVIRONMENT:
				return environment != null;
		}
		return super.eIsSet(featureID);
	}

} //WorksiteImpl
