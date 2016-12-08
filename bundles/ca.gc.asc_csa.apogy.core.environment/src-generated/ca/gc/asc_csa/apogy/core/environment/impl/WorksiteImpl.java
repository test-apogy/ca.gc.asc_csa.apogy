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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.Worksite;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl#getSky <em>Sky</em>}</li>
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
	 * The cached value of the '{@link #getSky() <em>Sky</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSky()
	 * @generated
	 * @ordered
	 */
	protected Sky sky;

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
	public Sky getSky() {
		return sky;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSky(Sky newSky, NotificationChain msgs) {
		Sky oldSky = sky;
		sky = newSky;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE__SKY, oldSky, newSky);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSky(Sky newSky) {
		if (newSky != sky) {
			NotificationChain msgs = null;
			if (sky != null)
				msgs = ((InternalEObject)sky).eInverseRemove(this, ApogyCoreEnvironmentPackage.SKY__WORKSITE, Sky.class, msgs);
			if (newSky != null)
				msgs = ((InternalEObject)newSky).eInverseAdd(this, ApogyCoreEnvironmentPackage.SKY__WORKSITE, Sky.class, msgs);
			msgs = basicSetSky(newSky, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.WORKSITE__SKY, newSky, newSky));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				if (sky != null)
					msgs = ((InternalEObject)sky).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyCoreEnvironmentPackage.WORKSITE__SKY, null, msgs);
				return basicSetSky((Sky)otherEnd, msgs);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				return basicSetSky(null, msgs);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				return getSky();
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
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				setSky((Sky)newValue);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				setSky((Sky)null);
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
			case ApogyCoreEnvironmentPackage.WORKSITE__SKY:
				return sky != null;
		}
		return super.eIsSet(featureID);
	}

} //WorksiteImpl
