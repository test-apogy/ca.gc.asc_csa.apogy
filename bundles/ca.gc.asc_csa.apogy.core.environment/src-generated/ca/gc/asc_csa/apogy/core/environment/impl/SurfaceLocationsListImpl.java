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
package ca.gc.asc_csa.apogy.core.environment.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import ca.gc.asc_csa.apogy.core.environment.AbstractSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.SurfaceLocationsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Surface Locations List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.impl.SurfaceLocationsListImpl#getSurfaceLocations <em>Surface Locations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SurfaceLocationsListImpl extends AbstractApogyEnvironmentItemImpl implements SurfaceLocationsList {
	/**
	 * The cached value of the '{@link #getSurfaceLocations() <em>Surface Locations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurfaceLocations()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractSurfaceLocation> surfaceLocations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceLocationsListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentPackage.Literals.SURFACE_LOCATIONS_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractSurfaceLocation> getSurfaceLocations() {
		if (surfaceLocations == null) {
			surfaceLocations = new EObjectContainmentEList<AbstractSurfaceLocation>(AbstractSurfaceLocation.class, this, ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS);
		}
		return surfaceLocations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS:
				return ((InternalEList<?>)getSurfaceLocations()).basicRemove(otherEnd, msgs);
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
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS:
				return getSurfaceLocations();
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
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS:
				getSurfaceLocations().clear();
				getSurfaceLocations().addAll((Collection<? extends AbstractSurfaceLocation>)newValue);
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
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS:
				getSurfaceLocations().clear();
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
			case ApogyCoreEnvironmentPackage.SURFACE_LOCATIONS_LIST__SURFACE_LOCATIONS:
				return surfaceLocations != null && !surfaceLocations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SurfaceLocationsListImpl
