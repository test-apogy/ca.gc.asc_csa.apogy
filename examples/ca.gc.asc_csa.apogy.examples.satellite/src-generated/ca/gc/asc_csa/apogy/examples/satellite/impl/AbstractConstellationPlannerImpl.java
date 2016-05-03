/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.jobs.JobGroup;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Objects;

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationPlannersContainer;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationRequestsList;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.ObservationConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Abstract Constellation Planner</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationPlannersContainer <em>Constellation Planners Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationCommandPlan <em>Constellation Command Plan</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getMaxNumberThreads <em>Max Number Threads</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#isCommandDuplicatesPreserved <em>Command Duplicates Preserved</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationPlannerImpl extends MinimalEObjectImpl.Container
		implements AbstractConstellationPlanner {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getConstellationRequestsList() <em>Constellation Requests List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationRequestsList()
	 * @generated
	 * @ordered
	 */
	protected ConstellationRequestsList constellationRequestsList;
	/**
	 * The cached value of the '{@link #getConstellationCommandPlan() <em>Constellation Command Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstellationCommandPlan()
	 * @generated
	 * @ordered
	 */
	protected AbstractConstellationCommandPlan constellationCommandPlan;

	/**
	 * The default value of the '{@link #getMaxNumberThreads() <em>Max Number Threads</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxNumberThreads()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_NUMBER_THREADS_EDEFAULT = 0;
	/**
	 * The cached value of the '{@link #getMaxNumberThreads() <em>Max Number Threads</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getMaxNumberThreads()
	 * @generated
	 * @ordered
	 */
	protected int maxNumberThreads = MAX_NUMBER_THREADS_EDEFAULT;
	/**
	 * The default value of the '{@link #isCommandDuplicatesPreserved() <em>Command Duplicates Preserved</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #isCommandDuplicatesPreserved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMAND_DUPLICATES_PRESERVED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCommandDuplicatesPreserved() <em>Command Duplicates Preserved</em>}' attribute.
	 * <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * @see #isCommandDuplicatesPreserved()
	 * @generated
	 * @ordered
	 */
	protected boolean commandDuplicatesPreserved = COMMAND_DUPLICATES_PRESERVED_EDEFAULT;
	/**
	 * The cached value of the '{@link #getElevationMask() <em>Elevation Mask</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElevationMask()
	 * @generated
	 * @ordered
	 */
	protected ConstantElevationMask elevationMask;
	private Comparator<AbstractRequestBasedSatelliteCommand> constellationRequestComparator;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractConstellationPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.ABSTRACT_CONSTELLATION_PLANNER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationPlannersContainer getConstellationPlannersContainer() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER) return null;
		return (ConstellationPlannersContainer)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationPlannersContainer basicGetConstellationPlannersContainer() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER) return null;
		return (ConstellationPlannersContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationPlannersContainer(ConstellationPlannersContainer newConstellationPlannersContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationPlannersContainer, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationPlannersContainer(ConstellationPlannersContainer newConstellationPlannersContainer) {
		if (newConstellationPlannersContainer != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER && newConstellationPlannersContainer != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationPlannersContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationPlannersContainer != null)
				msgs = ((InternalEObject)newConstellationPlannersContainer).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS, ConstellationPlannersContainer.class, msgs);
			msgs = basicSetConstellationPlannersContainer(newConstellationPlannersContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER, newConstellationPlannersContainer, newConstellationPlannersContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		ConstellationPlannersContainer _constellationPlannersContainer = this.getConstellationPlannersContainer();
		boolean _equals = Objects.equal(_constellationPlannersContainer, null);
		if (_equals) {
			return null;
		}
		else {
			ConstellationPlannersContainer _constellationPlannersContainer_1 = this.getConstellationPlannersContainer();
			return _constellationPlannersContainer_1.getConstellationState();
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE, oldStartDate, startDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE, oldEndDate, endDate));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList getConstellationRequestsList() {
		if (constellationRequestsList != null && constellationRequestsList.eIsProxy()) {
			InternalEObject oldConstellationRequestsList = (InternalEObject)constellationRequestsList;
			constellationRequestsList = (ConstellationRequestsList)eResolveProxy(oldConstellationRequestsList);
			if (constellationRequestsList != oldConstellationRequestsList) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, constellationRequestsList));
			}
		}
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationRequestsList basicGetConstellationRequestsList() {
		return constellationRequestsList;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationRequestsList(ConstellationRequestsList newConstellationRequestsList) {
		ConstellationRequestsList oldConstellationRequestsList = constellationRequestsList;
		constellationRequestsList = newConstellationRequestsList;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST, oldConstellationRequestsList, constellationRequestsList));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationCommandPlan getConstellationCommandPlan() {
		if (constellationCommandPlan != null && constellationCommandPlan.eIsProxy()) {
			InternalEObject oldConstellationCommandPlan = (InternalEObject)constellationCommandPlan;
			constellationCommandPlan = (AbstractConstellationCommandPlan)eResolveProxy(oldConstellationCommandPlan);
			if (constellationCommandPlan != oldConstellationCommandPlan) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN, oldConstellationCommandPlan, constellationCommandPlan));
			}
		}
		return constellationCommandPlan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractConstellationCommandPlan basicGetConstellationCommandPlan() {
		return constellationCommandPlan;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationCommandPlan(AbstractConstellationCommandPlan newConstellationCommandPlan) {
		AbstractConstellationCommandPlan oldConstellationCommandPlan = constellationCommandPlan;
		constellationCommandPlan = newConstellationCommandPlan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN, oldConstellationCommandPlan, constellationCommandPlan));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxNumberThreads() {
		return maxNumberThreads;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxNumberThreads(int newMaxNumberThreads) {
		int oldMaxNumberThreads = maxNumberThreads;
		maxNumberThreads = newMaxNumberThreads;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS, oldMaxNumberThreads, maxNumberThreads));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommandDuplicatesPreserved() {
		return commandDuplicatesPreserved;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandDuplicatesPreserved(boolean newCommandDuplicatesPreserved) {
		boolean oldCommandDuplicatesPreserved = commandDuplicatesPreserved;
		commandDuplicatesPreserved = newCommandDuplicatesPreserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED, oldCommandDuplicatesPreserved, commandDuplicatesPreserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantElevationMask getElevationMask() {
		return elevationMask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetElevationMask(ConstantElevationMask newElevationMask, NotificationChain msgs) {
		ConstantElevationMask oldElevationMask = elevationMask;
		elevationMask = newElevationMask;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK, oldElevationMask, newElevationMask);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElevationMask(ConstantElevationMask newElevationMask) {
		if (newElevationMask != elevationMask) {
			NotificationChain msgs = null;
			if (elevationMask != null)
				msgs = ((InternalEObject)elevationMask).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK, null, msgs);
			if (newElevationMask != null)
				msgs = ((InternalEObject)newElevationMask).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK, null, msgs);
			msgs = basicSetElevationMask(newElevationMask, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK, newElevationMask, newElevationMask));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public boolean isValid(VisibilityPass visibilityPass) {
		return true;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Satellite getSatellite(EarthOrbitModel orbitModel) {
		Satellite result = null;

		if (getConstellationState().getSatellitesList() != null) {
			Iterator<Satellite> satellites = getConstellationState().getSatellitesList().getSatellites().iterator();
			while (satellites.hasNext() && result == null) {
				Satellite satellite = satellites.next();

				if (satellite.getOrbitModel() == orbitModel) {
					result = satellite;
				}
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void plan() throws Exception {

		Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Started", EventSeverity.INFO);

		/* Validate the planner settings. */
		validate();

		/* Clear the command plan. */
		getConstellationCommandPlan().getConstellationCommands().clear();

		/* Create a set to sort the commands. */
		TreeSet<AbstractRequestBasedSatelliteCommand> commands = new TreeSet<AbstractRequestBasedSatelliteCommand>(
				getRequestBasedSatelliteCommandsComparator());

		/* Gets the observation requests. */
		List<AbstractConstellationRequest> requestsList = getConstellationRequestsList().getConstellationRequests()
				.stream().filter(p -> p instanceof ObservationConstellationRequest).collect(Collectors.toList());

		/*
		 * Determine the number of threads required / available for the passes
		 * processing.
		 */
		final int maxNumberOfThreads = getMaxNumberThreads() < 1 ? Runtime.getRuntime().availableProcessors()
				: getMaxNumberThreads();
		final int numberOfThreads = maxNumberOfThreads > requestsList.size() ? requestsList.size() : maxNumberOfThreads;

		Logger.INSTANCE.log(
				Activator.ID, "Constellation Planner: " + requestsList.size()
						+ " observation requests to process using <" + numberOfThreads + "> threads.",
				EventSeverity.INFO);

		Logger.INSTANCE.log(Activator.ID,
				"Constellation Planner: "
						+ (getConstellationRequestsList().getConstellationRequests().size() - requestsList.size())
						+ " requests are not observation requests and will not be processed.",
				EventSeverity.INFO);

		JobGroup jobGroup = new JobGroup("Constellation Planner", numberOfThreads, 1);

		/*
		 * Creates a temporary map to bind the requests with their locations.
		 */
		Map<EarthSurfaceLocation, ObservationConstellationRequest> locationMap = new HashMap<EarthSurfaceLocation, ObservationConstellationRequest>();
		for (AbstractConstellationRequest request : requestsList) {
			locationMap.put(((ObservationConstellationRequest) request).getLocation(),
					(ObservationConstellationRequest) request);
		}
		List<EarthSurfaceLocation> locations = new ArrayList<EarthSurfaceLocation>(locationMap.keySet());	

		/*
		 * Spawning the jobs.
		 */
		for (int threadId = 0; threadId < numberOfThreads; threadId++) {
			Logger.INSTANCE.log(Activator.ID,
					"Constellation Planner: Spawning Job " + (threadId + 1) + " of " + numberOfThreads,
					EventSeverity.INFO);

			/*
			 * Determine how to split the work to be processed.
			 */
			int modulus = locations.size() / numberOfThreads;
			int remainder = locations.size() % numberOfThreads;
			int locationStartIndex = threadId * modulus + (threadId < remainder ? threadId : remainder);
			int locationEndIndex = locationStartIndex + modulus + (threadId < remainder ? 1 : 0);

			/*
			 * Spawn the job.
			 */
			Job job = new ConstellationPlannerVisibilityPassesJob("Constellation Planner: Job <" + (threadId + 1) + ">",
					threadId, locations, locationStartIndex, locationEndIndex, commands, locationMap);
			job.setSystem(false);
			job.setUser(threadId == 0);
			job.setPriority(Job.LONG);
			job.setJobGroup(jobGroup);
			job.schedule();
		}

		// Wait for jobs to be completed.
		Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Waiting for jobs completion", EventSeverity.INFO);
		jobGroup.join(0, null);
		Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Jobs completed", EventSeverity.INFO);

		/*
		 * Remove duplicates.
		 */
		if (!isCommandDuplicatesPreserved()) {
			Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Removing Command Duplicates", EventSeverity.INFO);

			TreeSet<AbstractRequestBasedSatelliteCommand> no_duplicate_commands = new TreeSet<AbstractRequestBasedSatelliteCommand>(
					new Comparator<AbstractRequestBasedSatelliteCommand>() {
						@Override
						public int compare(AbstractRequestBasedSatelliteCommand o1,
								AbstractRequestBasedSatelliteCommand o2) {
							return o1.getConstellationRequest().equals(o2.getConstellationRequest()) ? 0
									: getRequestBasedSatelliteCommandsComparator().compare(o1, o2);
						}
					});
			no_duplicate_commands.addAll(commands);
			getConstellationCommandPlan().getConstellationCommands().addAll(no_duplicate_commands);
		} else {
			getConstellationCommandPlan().getConstellationCommands().addAll(commands);
		}

		Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Completed", EventSeverity.INFO);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void validate() throws Exception {
		if (getConstellationState().getSatellitesList() == null
				|| getConstellationState().getSatellitesList().getSatellites().isEmpty()) {
			throw new Exception("The planner does not have any satellites defined.");
		}

		if (getConstellationCommandPlan() == null) {
			throw new Exception(
					"The planner does not refer to any Constellation Command Plan required to store resuling plan.");
		}

		if (getStartDate() == null) {
			throw new Exception("The planner start date is not defined.");
		}

		if (getEndDate() == null) {
			throw new Exception("The planner end date is not defined.");
		}

		if ((long) (getEndDate().getTime() - getStartDate().getTime()) < 0) {
			throw new Exception("The planner start date and end date are not consistent.");
		}

		if (getConstellationRequestsList() == null) {
			throw new Exception("The planner does not refer to any requests.");
		}

		if (getElevationMask() == null) {
			throw new Exception("The planner does not define any elevation mask.");
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public Comparator<AbstractRequestBasedSatelliteCommand> getRequestBasedSatelliteCommandsComparator() {
		if (constellationRequestComparator == null) {
			constellationRequestComparator = new Comparator<AbstractRequestBasedSatelliteCommand>() {
				@Override
				public int compare(AbstractRequestBasedSatelliteCommand o1, AbstractRequestBasedSatelliteCommand o2) {
					
					/* Check the request priority. */
					if (o1.getConstellationRequest().getOrderPriority() != o2.getConstellationRequest()
							.getOrderPriority()) {
						// Use the request priorities to compare.
						return o2.getConstellationRequest().getOrderPriority()
								.compareTo(o1.getConstellationRequest().getOrderPriority());
					} else {
						// Different request priorities, use the date to
						// compare.
						long time1 = o1.getTime() == null ? 0: o1.getTime().getTime();
						long time2 = o2.getTime() == null ? 0: o2.getTime().getTime();

						if (time1 == time2){						
							return System.identityHashCode(o1) < System.identityHashCode(o2) ? -1 : 1; 
						}else{						
							return time1 < time2 ? -1 : 1;
						}
					}
				}
			};
		}
		return constellationRequestComparator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	@Override
	public VisibilityPassBasedSatelliteCommand createVisibilityPassBasedSatelliteCommand(
			ObservationConstellationRequest request, VisibilityPass visibilityPass) {

		VisibilityPassBasedSatelliteCommand command = ApogyExamplesSatelliteFactory.eINSTANCE.createVisibilityPassBasedSatelliteCommand();
		populateVisibilityPassBasedSatelliteCommand(command, request, visibilityPass);		
		return command;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void populateVisibilityPassBasedSatelliteCommand(VisibilityPassBasedSatelliteCommand command, ObservationConstellationRequest request, VisibilityPass visibilityPass) {
		if (command != null){
			command.setConstellationRequest(request);
			command.setUid(EcoreUtil.copy(request.getUid()));
			command.setTime(visibilityPass.getStartTime());
			command.setSatellite(getSatellite(visibilityPass.getOrbitModel()));
			command.setVisibilityPass(EcoreUtil.copy(visibilityPass));
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationPlannersContainer((ConstellationPlannersContainer)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				return basicSetConstellationPlannersContainer(null, msgs);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				return basicSetElevationMask(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_PLANNERS_CONTAINER__CONSTELLATION_PLANNERS, ConstellationPlannersContainer.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__NAME:
				return getName();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION:
				return getDescription();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				if (resolve) return getConstellationPlannersContainer();
				return basicGetConstellationPlannersContainer();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				return getConstellationState();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				return getStartDate();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				return getEndDate();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				if (resolve) return getConstellationRequestsList();
				return basicGetConstellationRequestsList();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				if (resolve) return getConstellationCommandPlan();
				return basicGetConstellationCommandPlan();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS:
				return getMaxNumberThreads();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED:
				return isCommandDuplicatesPreserved();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				return getElevationMask();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__NAME:
				setName((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				setConstellationPlannersContainer((ConstellationPlannersContainer)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				setStartDate((Date)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				setEndDate((Date)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				setConstellationCommandPlan((AbstractConstellationCommandPlan)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS:
				setMaxNumberThreads((Integer)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED:
				setCommandDuplicatesPreserved((Boolean)newValue);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				setElevationMask((ConstantElevationMask)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				setConstellationPlannersContainer((ConstellationPlannersContainer)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				setConstellationRequestsList((ConstellationRequestsList)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				setConstellationCommandPlan((AbstractConstellationCommandPlan)null);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS:
				setMaxNumberThreads(MAX_NUMBER_THREADS_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED:
				setCommandDuplicatesPreserved(COMMAND_DUPLICATES_PRESERVED_EDEFAULT);
				return;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				setElevationMask((ConstantElevationMask)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_PLANNERS_CONTAINER:
				return basicGetConstellationPlannersContainer() != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				return getConstellationState() != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				return constellationRequestsList != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				return constellationCommandPlan != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__MAX_NUMBER_THREADS:
				return maxNumberThreads != MAX_NUMBER_THREADS_EDEFAULT;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED:
				return commandDuplicatesPreserved != COMMAND_DUPLICATES_PRESERVED_EDEFAULT;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				return elevationMask != null;
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
		if (baseClass == Described.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION: return ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION;
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
		if (baseClass == Described.class) {
			switch (baseFeatureID) {
				case ApogyCommonEMFPackage.DESCRIBED__DESCRIPTION: return ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__DESCRIPTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___IS_VALID__VISIBILITYPASS:
				return isValid((VisibilityPass)arguments.get(0));
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___GET_SATELLITE__EARTHORBITMODEL:
				return getSatellite((EarthOrbitModel)arguments.get(0));
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___PLAN:
				try {
					plan();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___VALIDATE:
				try {
					validate();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___GET_REQUEST_BASED_SATELLITE_COMMANDS_COMPARATOR:
				return getRequestBasedSatelliteCommandsComparator();
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___CREATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS:
				return createVisibilityPassBasedSatelliteCommand((ObservationConstellationRequest)arguments.get(0), (VisibilityPass)arguments.get(1));
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___POPULATE_VISIBILITY_PASS_BASED_SATELLITE_COMMAND__VISIBILITYPASSBASEDSATELLITECOMMAND_OBSERVATIONCONSTELLATIONREQUEST_VISIBILITYPASS:
				populateVisibilityPassBasedSatelliteCommand((VisibilityPassBasedSatelliteCommand)arguments.get(0), (ObservationConstellationRequest)arguments.get(1), (VisibilityPass)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", maxNumberThreads: ");
		result.append(maxNumberThreads);
		result.append(", commandDuplicatesPreserved: ");
		result.append(commandDuplicatesPreserved);
		result.append(')');
		return result.toString();
	}

	/*
	 * 
	 * Job used to dispatch a subset of the locations to be processed.
	 * 
	 */
	protected class ConstellationPlannerVisibilityPassesJob extends Job {
		private int threadId;
		private List<EarthSurfaceLocation> locations;
		private TreeSet<AbstractRequestBasedSatelliteCommand> commands;
		private Map<EarthSurfaceLocation, ObservationConstellationRequest> locationMap;
		private int locationStartIndex;
		private int locationEndIndex;

		/*
		 * Do not use this constructor.
		 * 
		 * @see ConstellationPlannerVisibilityPassesJob(String, int,
		 * List<EarthSurfaceLocation>, int, int,
		 * TreeSet<AbstractRequestBasedSatelliteCommand>,
		 * Map<EarthSurfaceLocation, ObservationConstellationRequest>)
		 */
		public ConstellationPlannerVisibilityPassesJob(String name) {
			super(name);
		}

		/*
		 * Use this constructor.
		 * 
		 * @param name Name of the job.
		 * 
		 * @param threadId Thread identifier.
		 * 
		 * @param locations Locations to be processed.
		 * 
		 * @param locationStartIndex Index position that identifies the first
		 * location to process.
		 * 
		 * @param locationEndIndex Index position that identifies the last
		 * location to process.
		 * 
		 * @param commands List of commands to add commands to address the
		 * observation required for a specific location.
		 * 
		 * @param locationMap Map that makes the links between the location and
		 * the requests.
		 */
		public ConstellationPlannerVisibilityPassesJob(String name, int threadId, List<EarthSurfaceLocation> locations,
				int locationStartIndex, int locationEndIndex, TreeSet<AbstractRequestBasedSatelliteCommand> commands,
				Map<EarthSurfaceLocation, ObservationConstellationRequest> locationMap) {
			this(name);
			this.threadId = threadId;
			this.locations = locations;
			this.locationStartIndex = locationStartIndex;
			this.locationEndIndex = locationEndIndex;
			this.commands = commands;
			this.locationMap = locationMap;
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {

			int totalWork = getConstellationState().getSatellitesList().getSatellites().size();
			monitor.beginTask("Processing", totalWork);

			Logger.INSTANCE.log(Activator.ID, "Constellation Planner: Processing passes in job <" + (threadId + 1)
					+ "> [" + locationStartIndex + ".." + locationEndIndex + "]", EventSeverity.INFO);

			List<VisibilityPass> allPasses = new ArrayList<VisibilityPass>();

			/*
			 * Process the passes for all the satellites.
			 */
			for (Satellite satellite : getConstellationState().getSatellitesList().getSatellites()) {
				try {
					List<VisibilityPass> passes = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.getTargetPasses(
							satellite.getOrbitModel(), locations.subList(locationStartIndex, locationEndIndex),
							getStartDate(), getEndDate(), getElevationMask(), monitor);

					if (monitor.isCanceled()) {
						return Status.CANCEL_STATUS;
					}

					allPasses.addAll(passes);

					monitor.worked(1);

					Logger.INSTANCE.log(
							Activator.ID, "Constellation Planner: " + passes.size() + " passes found in job <"
									+ (threadId + 1) + "> for satellite <" + satellite.getName() + ">",
							EventSeverity.INFO);
				} catch (Exception e) {
					Logger.INSTANCE.log(
							Activator.ID, "Constellation Planner: Error while processing passes in job <"
									+ (threadId + 1) + "> for satellite <" + satellite.getName() + ">",
							EventSeverity.ERROR, e);
					return Status.CANCEL_STATUS;
				}
			}

			Logger.INSTANCE.log(Activator.ID,
					"Constellation Planner: A total of " + allPasses.size() + " passes found in job <" + (threadId + 1) + ">",
					EventSeverity.INFO);

			// Creates a Visibility Pass Based Satellite
			// Command for each valid passes.
			Iterator<VisibilityPass> passesIterator = allPasses.iterator();
			synchronized (commands) {
				while (passesIterator.hasNext()) {
					VisibilityPass pass = passesIterator.next();
					if (isValid(pass)) {
						ObservationConstellationRequest observationConstellationRequest = locationMap.get(pass.getSurfaceLocation());						
						VisibilityPassBasedSatelliteCommand command = createVisibilityPassBasedSatelliteCommand(observationConstellationRequest, pass);					
						if (command != null){
							commands.add(command);
						}
					}
				}
			}
			
			Logger.INSTANCE.log(Activator.ID,
					"Constellation Planner: " + allPasses.size() + " commands created in job <" + (threadId + 1) + ">",
					EventSeverity.INFO);

			return Status.OK_STATUS;
		}
	}
} // AbstractConstellationPlannerImpl
