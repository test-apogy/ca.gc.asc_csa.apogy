/**
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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.Map;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsListNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Maps List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl#getMaps <em>Maps</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.MapsListImpl#getMapsListNode <em>Maps List Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapsListImpl extends MinimalEObjectImpl.Container implements MapsList {
	/**
	 * The cached value of the '{@link #getMaps() <em>Maps</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaps()
	 * @generated
	 * @ordered
	 */
	protected EList<Map> maps;

	/**
	 * The cached value of the '{@link #getMapsListNode() <em>Maps List Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMapsListNode()
	 * @generated
	 * @ordered
	 */
	protected MapsListNode mapsListNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.MAPS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Map> getMaps() {
		if (maps == null) {
			maps = new EObjectContainmentEList<Map>(Map.class, this, ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS);
		}
		return maps;
	}

	  /**
	   * <!-- begin-user-doc -->
	   * <!-- end-user-doc -->
	   * @generated_NOT
	   */
	  public MapsListNode getMapsListNode()
	  {
		  if(getMapsListNodeGen() == null)
		  {
			  // TODO Do this in a Transaction.
			  mapsListNode = ApogySurfaceEnvironmentFactory.eINSTANCE.createMapsListNode();
			  mapsListNode.setMapsList(this);
		  }
		  
		  return getMapsListNodeGen();
	  }
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsListNode getMapsListNodeGen() {
		if (mapsListNode != null && mapsListNode.eIsProxy()) {
			InternalEObject oldMapsListNode = (InternalEObject)mapsListNode;
			mapsListNode = (MapsListNode)eResolveProxy(oldMapsListNode);
			if (mapsListNode != oldMapsListNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS_LIST_NODE, oldMapsListNode, mapsListNode));
			}
		}
		return mapsListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsListNode basicGetMapsListNode() {
		return mapsListNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS:
				return ((InternalEList<?>)getMaps()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS:
				return getMaps();
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS_LIST_NODE:
				if (resolve) return getMapsListNode();
				return basicGetMapsListNode();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS:
				getMaps().clear();
				getMaps().addAll((Collection<? extends Map>)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS:
				getMaps().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS:
				return maps != null && !maps.isEmpty();
			case ApogySurfaceEnvironmentPackage.MAPS_LIST__MAPS_LIST_NODE:
				return mapsListNode != null;
		}
		return super.eIsSet(featureID);
	}

} //MapsListImpl
