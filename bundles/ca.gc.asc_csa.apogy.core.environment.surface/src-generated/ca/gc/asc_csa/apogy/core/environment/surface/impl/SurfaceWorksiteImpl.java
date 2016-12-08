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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.CelestialBody;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.impl.WorksiteImpl;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage;
import ca.gc.asc_csa.apogy.core.environment.surface.MapsList;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksiteNode;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Surface
 * Worksite</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl#getMapsList <em>Maps List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.impl.SurfaceWorksiteImpl#getCelestialBody <em>Celestial Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SurfaceWorksiteImpl extends WorksiteImpl implements SurfaceWorksite {
	/**
	 * The cached value of the '{@link #getMapsList() <em>Maps List</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getMapsList()
	 * @generated
	 * @ordered
	 */
	protected MapsList mapsList;

	/**
	 * The cached value of the '{@link #getCelestialBody() <em>Celestial Body</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getCelestialBody()
	 * @generated
	 * @ordered
	 */
	protected CelestialBody celestialBody;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected SurfaceWorksiteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogySurfaceEnvironmentPackage.Literals.SURFACE_WORKSITE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public MapsList getMapsList() {
		if (getMapsListGen() == null) {
			// TODO Do this in a Transaction.
			mapsList = ApogySurfaceEnvironmentFactory.eINSTANCE.createMapsList();
			setMapsList(mapsList);
		}
		return mapsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MapsList getMapsListGen() {
		return mapsList;
	}

	@Override
	public WorksiteNode getWorksiteNode() {
		if (!(super.getWorksiteNode() instanceof SurfaceWorksiteNode)) {
			worksiteNode = ApogySurfaceEnvironmentFactory.eINSTANCE.createSurfaceWorksiteNode();
			worksiteNode.setWorksite(this);
		}

		return worksiteNode;
	}

	@Override
	public void setSky(Sky newSky) {
		// TODO Do this in a Transaction.

		// Removes topology from previous Sky if applicable.
		if (this.getSky() != null) {
			if (this.getWorksiteNode() instanceof WorksiteNode) {
				WorksiteNode worksiteNode = (WorksiteNode) this.getWorksiteNode();
				worksiteNode.getChildren().remove(this.getSky().getSkyNode());
			}
		}

		// Updates sky
		super.setSky(newSky);

		// Adds topology from new Sky Sky if applicable.
		if (newSky != null) {
			if (this.getWorksiteNode() instanceof WorksiteNode) {
				WorksiteNode worksiteNode = (WorksiteNode) this.getWorksiteNode();
				worksiteNode.getChildren().add(newSky.getSkyNode());
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMapsList(MapsList newMapsList, NotificationChain msgs) {
		MapsList oldMapsList = mapsList;
		mapsList = newMapsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, oldMapsList, newMapsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMapsList(MapsList newMapsList) {
		if (newMapsList != mapsList) {
			NotificationChain msgs = null;
			if (mapsList != null)
				msgs = ((InternalEObject)mapsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, null, msgs);
			if (newMapsList != null)
				msgs = ((InternalEObject)newMapsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, null, msgs);
			msgs = basicSetMapsList(newMapsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST, newMapsList, newMapsList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public CelestialBody getCelestialBody() {
		return celestialBody;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCelestialBody(CelestialBody newCelestialBody, NotificationChain msgs) {
		CelestialBody oldCelestialBody = celestialBody;
		celestialBody = newCelestialBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY, oldCelestialBody, newCelestialBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCelestialBody(CelestialBody newCelestialBody) {
		if (newCelestialBody != celestialBody) {
			NotificationChain msgs = null;
			if (celestialBody != null)
				msgs = ((InternalEObject)celestialBody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY, null, msgs);
			if (newCelestialBody != null)
				msgs = ((InternalEObject)newCelestialBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY, null, msgs);
			msgs = basicSetCelestialBody(newCelestialBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY, newCelestialBody, newCelestialBody));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return basicSetMapsList(null, msgs);
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY:
				return basicSetCelestialBody(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return getMapsList();
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY:
				return getCelestialBody();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				setMapsList((MapsList)newValue);
				return;
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY:
				setCelestialBody((CelestialBody)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				setMapsList((MapsList)null);
				return;
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY:
				setCelestialBody((CelestialBody)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__MAPS_LIST:
				return mapsList != null;
			case ApogySurfaceEnvironmentPackage.SURFACE_WORKSITE__CELESTIAL_BODY:
				return celestialBody != null;
		}
		return super.eIsSet(featureID);
	}

} // SurfaceWorksiteImpl
