package ca.gc.asc_csa.apogy.examples.satellite.apogy.impl;
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

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStationReferencesList;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.impl.ApogyInitializationDataImpl;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationDownlinksList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.SortedSet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constellation Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getConstellationCommandPlansList <em>Constellation Command Plans List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getSatellitesList <em>Satellites List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getGroundStationsReferencesList <em>Ground Stations References List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getDownlinksLists <em>Downlinks Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.impl.ConstellationDataImpl#getConstellationPlanner <em>Constellation Planner</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstellationDataImpl extends ApogyInitializationDataImpl implements ConstellationData {
	/**
	 * The cached value of the '{@link #getConstellationCommandPlansList() <em>Constellation Command Plans List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationCommandPlansList()
	 * @generated
	 * @ordered
	 */
	protected ConstellationCommandPlansList constellationCommandPlansList;
	/**
	 * The cached value of the '{@link #getSatellitesList() <em>Satellites List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSatellitesList()
	 * @generated
	 * @ordered
	 */
	protected SatellitesList satellitesList;
	/**
	 * The cached value of the '{@link #getGroundStationsReferencesList() <em>Ground Stations References List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroundStationsReferencesList()
	 * @generated
	 * @ordered
	 */
	protected GroundStationReferencesList groundStationsReferencesList;
	/**
	 * The cached value of the '{@link #getDownlinksLists() <em>Downlinks Lists</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownlinksLists()
	 * @generated
	 * @ordered
	 */
	protected ConstellationDownlinksList downlinksLists;
	/**
	 * The cached value of the '{@link #getConstellationRequestsList() <em>Constellation Requests List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequestsList()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestsList constellationRequestsList;
	/**
	 * The cached value of the '{@link #getConstellationPlanner() <em>Constellation Planner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationPlanner()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstellationPlanner constellationPlanner;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstellationDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatelliteApogyPackage.Literals.CONSTELLATION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SatellitesList getSatellitesList() {
		return satellitesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSatellitesList(SatellitesList newSatellitesList, NotificationChain msgs) {
		SatellitesList oldSatellitesList = satellitesList;
		satellitesList = newSatellitesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST, oldSatellitesList, newSatellitesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSatellitesList(SatellitesList newSatellitesList) {
		if (newSatellitesList != satellitesList) {
			NotificationChain msgs = null;
			if (satellitesList != null)
				msgs = ((InternalEObject)satellitesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST, null, msgs);
			if (newSatellitesList != null)
				msgs = ((InternalEObject)newSatellitesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST, null, msgs);
			msgs = basicSetSatellitesList(newSatellitesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST, newSatellitesList, newSatellitesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GroundStationReferencesList getGroundStationsReferencesList() {
		return groundStationsReferencesList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGroundStationsReferencesList(GroundStationReferencesList newGroundStationsReferencesList, NotificationChain msgs) {
		GroundStationReferencesList oldGroundStationsReferencesList = groundStationsReferencesList;
		groundStationsReferencesList = newGroundStationsReferencesList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST, oldGroundStationsReferencesList, newGroundStationsReferencesList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroundStationsReferencesList(GroundStationReferencesList newGroundStationsReferencesList) {
		if (newGroundStationsReferencesList != groundStationsReferencesList) {
			NotificationChain msgs = null;
			if (groundStationsReferencesList != null)
				msgs = ((InternalEObject)groundStationsReferencesList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST, null, msgs);
			if (newGroundStationsReferencesList != null)
				msgs = ((InternalEObject)newGroundStationsReferencesList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST, null, msgs);
			msgs = basicSetGroundStationsReferencesList(newGroundStationsReferencesList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST, newGroundStationsReferencesList, newGroundStationsReferencesList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationDownlinksList getDownlinksLists() {
		return downlinksLists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDownlinksLists(ConstellationDownlinksList newDownlinksLists, NotificationChain msgs) {
		ConstellationDownlinksList oldDownlinksLists = downlinksLists;
		downlinksLists = newDownlinksLists;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS, oldDownlinksLists, newDownlinksLists);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownlinksLists(ConstellationDownlinksList newDownlinksLists) {
		if (newDownlinksLists != downlinksLists) {
			NotificationChain msgs = null;
			if (downlinksLists != null)
				msgs = ((InternalEObject)downlinksLists).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS, null, msgs);
			if (newDownlinksLists != null)
				msgs = ((InternalEObject)newDownlinksLists).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS, null, msgs);
			msgs = basicSetDownlinksLists(newDownlinksLists, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS, newDownlinksLists, newDownlinksLists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList getConstellationRequestsList() {
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList, NotificationChain msgs) {
		ConstellationRequestsList oldConstellationRequestsList = constellationRequestsList;
		constellationRequestsList = newConstellationRequestsList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, newConstellationRequestsList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList) {
		if (newConstellationRequestsList != constellationRequestsList) {
			NotificationChain msgs = null;
			if (constellationRequestsList != null)
				msgs = ((InternalEObject)constellationRequestsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST, null, msgs);
			if (newConstellationRequestsList != null)
				msgs = ((InternalEObject)newConstellationRequestsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST, null, msgs);
			msgs = basicSetConstellationRequestsList(newConstellationRequestsList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST, newConstellationRequestsList, newConstellationRequestsList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationPlanner getConstellationPlanner() {
		return constellationPlanner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationPlanner(AbstractConstellationPlanner newConstellationPlanner, NotificationChain msgs) {
		AbstractConstellationPlanner oldConstellationPlanner = constellationPlanner;
		constellationPlanner = newConstellationPlanner;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER, oldConstellationPlanner, newConstellationPlanner);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationPlanner(AbstractConstellationPlanner newConstellationPlanner) {
		if (newConstellationPlanner != constellationPlanner) {
			NotificationChain msgs = null;
			if (constellationPlanner != null)
				msgs = ((InternalEObject)constellationPlanner).eInverseRemove(this, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE, AbstractConstellationPlanner.class, msgs);
			if (newConstellationPlanner != null)
				msgs = ((InternalEObject)newConstellationPlanner).eInverseAdd(this, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE, AbstractConstellationPlanner.class, msgs);
			msgs = basicSetConstellationPlanner(newConstellationPlanner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER, newConstellationPlanner, newConstellationPlanner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortedSet<VisibilityPass> getTargetPasses(AbstractConstellationRequest request, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Satellite getSatellite(OrbitModel orbitModel) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				if (constellationPlanner != null)
					msgs = ((InternalEObject)constellationPlanner).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER, null, msgs);
				return basicSetConstellationPlanner((AbstractConstellationPlanner)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationCommandPlansList getConstellationCommandPlansList() {
		return constellationCommandPlansList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationCommandPlansList(ConstellationCommandPlansList newConstellationCommandPlansList, NotificationChain msgs) {
		ConstellationCommandPlansList oldConstellationCommandPlansList = constellationCommandPlansList;
		constellationCommandPlansList = newConstellationCommandPlansList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST, oldConstellationCommandPlansList, newConstellationCommandPlansList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationCommandPlansList(ConstellationCommandPlansList newConstellationCommandPlansList) {
		if (newConstellationCommandPlansList != constellationCommandPlansList) {
			NotificationChain msgs = null;
			if (constellationCommandPlansList != null)
				msgs = ((InternalEObject)constellationCommandPlansList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST, null, msgs);
			if (newConstellationCommandPlansList != null)
				msgs = ((InternalEObject)newConstellationCommandPlansList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST, null, msgs);
			msgs = basicSetConstellationCommandPlansList(newConstellationCommandPlansList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST, newConstellationCommandPlansList, newConstellationCommandPlansList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
				return basicSetConstellationCommandPlansList(null, msgs);
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
				return basicSetSatellitesList(null, msgs);
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
				return basicSetGroundStationsReferencesList(null, msgs);
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
				return basicSetDownlinksLists(null, msgs);
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
				return basicSetConstellationRequestsList(null, msgs);
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				return basicSetConstellationPlanner(null, msgs);
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
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
				return getConstellationCommandPlansList();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
				return getSatellitesList();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
				return getGroundStationsReferencesList();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
				return getDownlinksLists();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
				return getConstellationRequestsList();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				return getConstellationPlanner();
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
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
				setConstellationCommandPlansList((ConstellationCommandPlansList)newValue);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
				setSatellitesList((SatellitesList)newValue);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
				setGroundStationsReferencesList((GroundStationReferencesList)newValue);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
				setDownlinksLists((ConstellationDownlinksList)newValue);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)newValue);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				setConstellationPlanner((AbstractConstellationPlanner)newValue);
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
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
				setConstellationCommandPlansList((ConstellationCommandPlansList)null);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
				setSatellitesList((SatellitesList)null);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
				setGroundStationsReferencesList((GroundStationReferencesList)null);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
				setDownlinksLists((ConstellationDownlinksList)null);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)null);
				return;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				setConstellationPlanner((AbstractConstellationPlanner)null);
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
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST:
				return constellationCommandPlansList != null;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST:
				return satellitesList != null;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST:
				return groundStationsReferencesList != null;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS:
				return downlinksLists != null;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST:
				return constellationRequestsList != null;
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER:
				return constellationPlanner != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ConstellationState.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST;
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__SATELLITES_LIST;
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST;
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__DOWNLINKS_LISTS;
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LIST;
				case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER: return ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ConstellationState.class) {
			switch (baseFeatureID) {
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_COMMAND_PLANS_LIST: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_COMMAND_PLANS_LIST;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__SATELLITES_LIST: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__SATELLITES_LIST;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__GROUND_STATIONS_REFERENCES_LIST: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__GROUND_STATIONS_REFERENCES_LIST;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__DOWNLINKS_LISTS: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__DOWNLINKS_LISTS;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_REQUESTS_LIST: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_REQUESTS_LIST;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNER: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA__CONSTELLATION_PLANNER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ConstellationState.class) {
			switch (baseOperationID) {
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE___GET_TARGET_PASSES__ABSTRACTCONSTELLATIONREQUEST_DATE_DATE_ELEVATIONMASK: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA___GET_TARGET_PASSES__ABSTRACTCONSTELLATIONREQUEST_DATE_DATE_ELEVATIONMASK;
				case ApogyExamplesSatellitePackage.CONSTELLATION_STATE___GET_SATELLITE__ORBITMODEL: return ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA___GET_SATELLITE__ORBITMODEL;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA___GET_TARGET_PASSES__ABSTRACTCONSTELLATIONREQUEST_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((AbstractConstellationRequest)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA___GET_SATELLITE__ORBITMODEL:
				return getSatellite((OrbitModel)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConstellationDataImpl
