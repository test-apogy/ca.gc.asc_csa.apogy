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

import ca.gc.asc_csa.apogy.common.topology.INodeVisitor;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.impl.GroupNodeImpl;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sky Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SkyNodeImpl#getSky <em>Sky</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SkyNodeImpl extends GroupNodeImpl implements SkyNode
{
  /**
	 * The cached value of the '{@link #getSky() <em>Sky</em>}' reference.
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
  protected SkyNodeImpl()
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
		return ApogyCoreEnvironmentPackage.Literals.SKY_NODE;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky getSky()
  {
		if (sky != null && sky.eIsProxy()) {
			InternalEObject oldSky = (InternalEObject)sky;
			sky = (Sky)eResolveProxy(oldSky);
			if (sky != oldSky) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, oldSky, sky));
			}
		}
		return sky;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Sky basicGetSky()
  {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, oldSky, newSky);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setSky(Sky newSky)
  {
		if (newSky != sky) {
			NotificationChain msgs = null;
			if (sky != null)
				msgs = ((InternalEObject)sky).eInverseRemove(this, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, Sky.class, msgs);
			if (newSky != null)
				msgs = ((InternalEObject)newSky).eInverseAdd(this, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, Sky.class, msgs);
			msgs = basicSetSky(newSky, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentPackage.SKY_NODE__SKY, newSky, newSky));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
				if (sky != null)
					msgs = ((InternalEObject)sky).eInverseRemove(this, ApogyCoreEnvironmentPackage.SKY__SKY_NODE, Sky.class, msgs);
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
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
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
				if (resolve) return getSky();
				return basicGetSky();
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
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
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
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
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
			case ApogyCoreEnvironmentPackage.SKY_NODE__SKY:
				return sky != null;
		}
		return super.eIsSet(featureID);
	}
  
  @Override
  public void accept(INodeVisitor visitor) 
  {
	  if (visitor.getType().isInstance(this)) 
	  {
			visitor.visit(this);
	  }

	  // We do the same for all the children.
	  for (Node child : getChildren()) 
	  {
			child.accept(visitor);
	  }
  }

} //SkyNodeImpl
