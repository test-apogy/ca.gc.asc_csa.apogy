package ca.gc.asc_csa.apogy.core.environment.ui.impl;
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfiguration;
import ca.gc.asc_csa.apogy.core.environment.ui.MapViewConfigurationList;
import ca.gc.asc_csa.apogy.core.environment.ui.ApogyCoreEnvironmentUIPackage;
import ca.gc.asc_csa.apogy.core.invocator.impl.AbstractToolsListContainerImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Map View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.ui.impl.MapViewConfigurationListImpl#getMapViewConfigurations <em>Map View Configurations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MapViewConfigurationListImpl extends AbstractToolsListContainerImpl implements MapViewConfigurationList
{	
  /**
	 * The cached value of the '{@link #getMapViewConfigurations() <em>Map View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getMapViewConfigurations()
	 * @generated
	 * @ordered
	 */
  protected EList<MapViewConfiguration> mapViewConfigurations;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected MapViewConfigurationListImpl()
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
		return ApogyCoreEnvironmentUIPackage.Literals.MAP_VIEW_CONFIGURATION_LIST;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<MapViewConfiguration> getMapViewConfigurations()
  {
		if (mapViewConfigurations == null) {
			mapViewConfigurations = new EObjectContainmentEList<MapViewConfiguration>(MapViewConfiguration.class, this, ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS);
		}
		return mapViewConfigurations;
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS:
				return ((InternalEList<?>)getMapViewConfigurations()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS:
				return getMapViewConfigurations();
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS:
				getMapViewConfigurations().clear();
				getMapViewConfigurations().addAll((Collection<? extends MapViewConfiguration>)newValue);
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS:
				getMapViewConfigurations().clear();
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
			case ApogyCoreEnvironmentUIPackage.MAP_VIEW_CONFIGURATION_LIST__MAP_VIEW_CONFIGURATIONS:
				return mapViewConfigurations != null && !mapViewConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //MapViewConfigurationListImpl
