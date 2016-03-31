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
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
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
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationRequestsList <em>Constellation Requests List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getConstellationCommandPlan <em>Constellation Command Plan</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#isCommandDuplicatesPreserved <em>Command Duplicates Preserved</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.impl.AbstractConstellationPlannerImpl#getElevationMask <em>Elevation Mask</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractConstellationPlannerImpl extends MinimalEObjectImpl.Container
		implements AbstractConstellationPlanner {
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
	 * The default value of the '{@link #isCommandDuplicatesPreserved() <em>Command Duplicates Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCommandDuplicatesPreserved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean COMMAND_DUPLICATES_PRESERVED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isCommandDuplicatesPreserved() <em>Command Duplicates Preserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState getConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE) return null;
		return (ConstellationState)eContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationState basicGetConstellationState() {
		if (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE) return null;
		return (ConstellationState)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConstellationState(ConstellationState newConstellationState,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConstellationState, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstellationState(ConstellationState newConstellationState) {
		if (newConstellationState != eInternalContainer() || (eContainerFeatureID() != ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE && newConstellationState != null)) {
			if (EcoreUtil.isAncestor(this, newConstellationState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConstellationState != null)
				msgs = ((InternalEObject)newConstellationState).eInverseAdd(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNER, ConstellationState.class, msgs);
			msgs = basicSetConstellationState(newConstellationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE, newConstellationState, newConstellationState));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCommandDuplicatesPreserved() {
		return commandDuplicatesPreserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommandDuplicatesPreserved(boolean newCommandDuplicatesPreserved) {
		boolean oldCommandDuplicatesPreserved = commandDuplicatesPreserved;
		commandDuplicatesPreserved = newCommandDuplicatesPreserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED, oldCommandDuplicatesPreserved, commandDuplicatesPreserved));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantElevationMask getElevationMask() {
		return elevationMask;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public SortedSet<VisibilityPass> getTargetPasses(AbstractConstellationRequest request, Date startDate, Date endDate,
			ElevationMask elevationMask) throws Exception {
		List<VisibilityPass> visibilityPasses = new ArrayList<VisibilityPass>();

		if (request instanceof ObservationConstellationRequest) {
			ObservationConstellationRequest observationRequest = (ObservationConstellationRequest) request;

			for (Satellite satellite : getConstellationState().getSatellitesList().getSatellites()) {
				List<VisibilityPass> potentialVisibilityPasses = satellite.getOrbitModel()
						.getTargetPasses(observationRequest.getLocation(), startDate, endDate, elevationMask);
				for (VisibilityPass pass : potentialVisibilityPasses) {
					if (isValid(pass)) {
						visibilityPasses.add(pass);
					}
				}
			}
		}

		SortedSet<VisibilityPass> sortedVisibilityPasses = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE
				.getVisibilityPassSortedByStartDate(visibilityPasses);
		return sortedVisibilityPasses;
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
		TreeSet<AbstractRequestBasedSatelliteCommand> commands = new TreeSet<AbstractRequestBasedSatelliteCommand>(getRequestBasedSatelliteCommandsComparator());

		/* Gets the observation requests. */
		List<AbstractConstellationRequest> requestsList = 
				getConstellationRequestsList().getConstellationRequests().stream().filter(p -> p instanceof ObservationConstellationRequest).collect(Collectors.toList());		

		Logger.INSTANCE.log(
				Activator.ID, "Constellation Planner: "
						+ requestsList.size() + " observation requests to process.",
				EventSeverity.INFO);
		
		Logger.INSTANCE.log(
				Activator.ID, "Constellation Planner: "
						+ (getConstellationRequestsList().getConstellationRequests().size() - requestsList.size()) + " requests are not observation requests and will not be processed.",
				EventSeverity.INFO);

		/*
		 * For each observation request finds the target passes available within the period defined.
		 */
		Iterator<AbstractConstellationRequest> requests = requestsList.iterator(); 
		while (requests.hasNext()) {
			ObservationConstellationRequest request = (ObservationConstellationRequest) requests.next();
			SortedSet<VisibilityPass> sortedPasses = getTargetPasses(request, getStartDate(), getEndDate(),
					getElevationMask());

			Logger.INSTANCE.log(Activator.ID, "Constellation Planner found " + sortedPasses.size() + " passes",
					EventSeverity.INFO);

			// Creates a Visibility Pass Based Satellite Command for each valid passes.
			Iterator<VisibilityPass> passesIterator = sortedPasses.iterator();
			while (passesIterator.hasNext()) {
				VisibilityPass pass = passesIterator.next();
				commands.add(createVisibilityPassBasedSatelliteCommand(request, pass));
			}
		}

		/*
		 * Remove duplicates.
		 */
		if (!isCommandDuplicatesPreserved()){		
			TreeSet<AbstractRequestBasedSatelliteCommand> no_duplicate_commands = new TreeSet<AbstractRequestBasedSatelliteCommand>(new Comparator<AbstractRequestBasedSatelliteCommand>() {
				@Override
				public int compare(AbstractRequestBasedSatelliteCommand o1, AbstractRequestBasedSatelliteCommand o2) {
					return o1.getConstellationRequest().equals(o2.getConstellationRequest()) ? 
						0 : 
						getRequestBasedSatelliteCommandsComparator().compare(o1, o2);
				}
			});
			no_duplicate_commands.addAll(commands);
			getConstellationCommandPlan().getConstellationCommands().addAll(no_duplicate_commands);
		}else{
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
					/*
					 * Check the request priority.
					 */
					if (o1.getConstellationRequest().getOrderPriority() != o2.getConstellationRequest()
							.getOrderPriority()) {
						// Use the request priorities to compare.
						return o2.getConstellationRequest().getOrderPriority()
								.compareTo(o1.getConstellationRequest().getOrderPriority());
					} else {
						// Different request priorities, use the date to
						// compare.
						if (o1.getTime().getTime() == o2.getTime().getTime()) {
							return 0;
						} else {
							return o1.getTime().getTime() < o2.getTime().getTime() ? -1 : 1;
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

		VisibilityPassBasedSatelliteCommand command = null;		
		command = ApogyExamplesSatelliteFactory.eINSTANCE.createVisibilityPassBasedSatelliteCommand();
		command.setConstellationRequest(request);
		command.setUid(EcoreUtil.copy(request.getUid()));
		command.setTime(visibilityPass.getStartTime());
		command.setSatellite(getSatellite(visibilityPass.getOrbitModel()));
		command.setVisibilityPass(EcoreUtil.copy(visibilityPass));
		
		return command;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConstellationState((ConstellationState)otherEnd, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				return basicSetConstellationState(null, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				return eInternalContainer().eInverseRemove(this, ApogyExamplesSatellitePackage.CONSTELLATION_STATE__CONSTELLATION_PLANNER, ConstellationState.class, msgs);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				if (resolve) return getConstellationState();
				return basicGetConstellationState();
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)newValue);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				setConstellationState((ConstellationState)null);
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
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_STATE:
				return basicGetConstellationState() != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_REQUESTS_LIST:
				return constellationRequestsList != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__CONSTELLATION_COMMAND_PLAN:
				return constellationCommandPlan != null;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__COMMAND_DUPLICATES_PRESERVED:
				return commandDuplicatesPreserved != COMMAND_DUPLICATES_PRESERVED_EDEFAULT;
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER__ELEVATION_MASK:
				return elevationMask != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesSatellitePackage.ABSTRACT_CONSTELLATION_PLANNER___GET_TARGET_PASSES__ABSTRACTCONSTELLATIONREQUEST_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((AbstractConstellationRequest)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", commandDuplicatesPreserved: ");
		result.append(commandDuplicatesPreserved);
		result.append(')');
		return result.toString();
	}

} // AbstractConstellationPlannerImpl
