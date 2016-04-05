package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.orekit.bodies.BodyShape;
import org.orekit.bodies.CelestialBodyFactory;
import org.orekit.bodies.GeodeticPoint;
import org.orekit.bodies.OneAxisEllipsoid;
import org.orekit.errors.OrekitException;
import org.orekit.errors.PropagationException;
import org.orekit.frames.Frame;
import org.orekit.frames.FramesFactory;
import org.orekit.frames.TopocentricFrame;
import org.orekit.orbits.CartesianOrbit;
import org.orekit.orbits.KeplerianOrbit;
import org.orekit.propagation.Propagator;
import org.orekit.propagation.events.EclipseDetector;
import org.orekit.propagation.events.ElevationDetector;
import org.orekit.propagation.events.handlers.EventHandler;
import org.orekit.propagation.sampling.OrekitFixedStepHandler;
import org.orekit.time.AbsoluteDate;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;
import org.orekit.utils.PVCoordinatesProvider;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Activator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEvent;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEventType;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.InitialOrbitBasedEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl#getFromValidDate <em>From Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl#getToValidDate <em>To Valid Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl#getValidFromDate <em>Valid From Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl#getValidToDate <em>Valid To Date</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl.EarthOrbitPropagatorImpl#getInitialOrbitBasedEarthOrbitModel <em>Initial Orbit Based Earth Orbit Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class EarthOrbitPropagatorImpl extends MinimalEObjectImpl.Container implements EarthOrbitPropagator {
	/**
	 * The default value of the '{@link #getFromValidDate() <em>From Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_VALID_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getToValidDate() <em>To Valid Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValidDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_VALID_DATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValidFromDate() <em>Valid From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date validFromDate = VALID_FROM_DATE_EDEFAULT;
	/**
	 * The default value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_TO_DATE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getValidToDate() <em>Valid To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValidToDate()
	 * @generated
	 * @ordered
	 */
	protected Date validToDate = VALID_TO_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EarthOrbitPropagatorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.EARTH_ORBIT_PROPAGATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidFromDate() {
		return validFromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidFromDate(Date newValidFromDate) {
		Date oldValidFromDate = validFromDate;
		validFromDate = newValidFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE, oldValidFromDate, validFromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getValidToDate() {
		return validToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValidToDate(Date newValidToDate) {
		Date oldValidToDate = validToDate;
		validToDate = newValidToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE, oldValidToDate, validToDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialOrbitBasedEarthOrbitModel getInitialOrbitBasedEarthOrbitModel() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL) return null;
		return (InitialOrbitBasedEarthOrbitModel)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialOrbitBasedEarthOrbitModel basicGetInitialOrbitBasedEarthOrbitModel() {
		if (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL) return null;
		return (InitialOrbitBasedEarthOrbitModel)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel newInitialOrbitBasedEarthOrbitModel, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInitialOrbitBasedEarthOrbitModel, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialOrbitBasedEarthOrbitModel(InitialOrbitBasedEarthOrbitModel newInitialOrbitBasedEarthOrbitModel) {
		if (newInitialOrbitBasedEarthOrbitModel != eInternalContainer() || (eContainerFeatureID() != ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL && newInitialOrbitBasedEarthOrbitModel != null)) {
			if (EcoreUtil.isAncestor(this, newInitialOrbitBasedEarthOrbitModel))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInitialOrbitBasedEarthOrbitModel != null)
				msgs = ((InternalEObject)newInitialOrbitBasedEarthOrbitModel).eInverseAdd(this, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR, InitialOrbitBasedEarthOrbitModel.class, msgs);
			msgs = basicSetInitialOrbitBasedEarthOrbitModel(newInitialOrbitBasedEarthOrbitModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL, newInitialOrbitBasedEarthOrbitModel, newInitialOrbitBasedEarthOrbitModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	abstract public Propagator getOreKitPropagator();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception 
	{
		// Checks that the specified dates falls within the propagator valid interval.
		if(!getInitialOrbitBasedEarthOrbitModel().isDateInValidRange(startDate))
		{
			String message = "Start date is outside the validity range !";
															
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
	
			// Throw an exception.	
			throw new Exception(message);
		}
		
		if(!getInitialOrbitBasedEarthOrbitModel().isDateInValidRange(endDate))
		{			
			String message = "End date is outside the validity range !";
			
			// Throw an exception.
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			throw new Exception(message);	
		}
		
		Propagator propagator = getOreKitPropagator();
		
		// Computes the duration.
		double duration = (endDate.getTime() - startDate.getTime()) * 0.001;
		
		List<SpacecraftState> states = new ArrayList<SpacecraftState>();
		
		// Adds a fixed step handler to record the SpacecraftStates.
		propagator.setMasterMode(timeInterval, new OrekitFixedStepHandler() 
		{		
			@Override
			public void init(org.orekit.propagation.SpacecraftState spacecraftState, AbsoluteDate arg1) throws PropagationException 
			{			
			}
			
			@Override
			public void handleStep(org.orekit.propagation.SpacecraftState spacecraftState,	boolean arg1) throws PropagationException 
			{		
				try
				{
					// Checks that the state falls inside the specified range.
					Date date = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(spacecraftState.getDate());
					if(date.getTime() >= startDate.getTime() && endDate.getTime() >= date.getTime())
					{	
						Orbit orbit = null;
						if(spacecraftState.getOrbit() instanceof KeplerianOrbit)
						{
							orbit = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createKeplerianOrbit((KeplerianOrbit) spacecraftState.getOrbit());	
						}
						else if(spacecraftState.getOrbit() instanceof CartesianOrbit)
						{
							orbit = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createCartesianEarthOrbit((CartesianOrbit) spacecraftState.getOrbit());
						}
						OreKitBackedSpacecraftState ss = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createOreKitBackedSpacecraftState(orbit, spacecraftState);
						states.add(ss);
					}
				}
				catch(PropagationException pe)
				{
					throw pe;
				}
				catch(Exception e)
				{
					throw new PropagationException(e, null, this);
				}
			}
		});
						
		AbsoluteDate startAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(startDate);
		
		try 
		{						
			// Start orbit propagation.
			propagator.propagate(new AbsoluteDate(startAbsoluteDate, duration));
			
			// Adds the start date state at the beginning of the list.
			SpacecraftState startState = propagate(startDate);
			states.add(0, startState);
			
			// Adds the end date state at the end of the list.
			SpacecraftState endState = propagate(endDate);
			states.add(endState);
		} 
		catch (PropagationException e1) 
		{			
			e1.printStackTrace();
			
			Logger.INSTANCE.log(Activator.ID, this, "Error occured during execution !", EventSeverity.ERROR, e1);
			
			throw e1;
		}
		
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<VisibilityPass> getTargetPasses(EarthSurfaceLocation earthSurfaceLocation, Date startDate, Date endDate, ElevationMask elevationMask) throws Exception 
	{
		List<VisibilityPass> passes = new ArrayList<VisibilityPass>();
		
		// Defined the target on Earth.
		GeodeticPoint target = new GeodeticPoint(earthSurfaceLocation.getLatitude(), 
												 earthSurfaceLocation.getLongitude(), 
												 earthSurfaceLocation.getElevation());
		
		// Define the Earth Frame.
		Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS,
		                                       Constants.WGS84_EARTH_FLATTENING,
		                                       earthFrame);
		
		// Define the target in the Earth Frame.
		String name = "?";
		if( earthSurfaceLocation.getName() != null) name =  earthSurfaceLocation.getName();
		TopocentricFrame targetFrame = new TopocentricFrame(earth, target, name);
				
		// Define a visibility handler that will be called when the target is in sight.
		EventHandler<ElevationDetector>  eventHandler = new EventHandler<ElevationDetector> ()
		{			
			VisibilityPass lastPass = null;
			
			@Override
			public org.orekit.propagation.events.handlers.EventHandler.Action eventOccurred(org.orekit.propagation.SpacecraftState s, ElevationDetector detector, boolean increasing)
					throws OrekitException 
			{	
				if (increasing) 
				{
					if(lastPass == null)
					{
						lastPass = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPass();						
						lastPass.setStartTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(s.getDate()));
						lastPass.setSurfaceLocation(earthSurfaceLocation);																
						lastPass.setOrbitModel(EarthOrbitPropagatorImpl.this.getInitialOrbitBasedEarthOrbitModel());						
					}
					else
					{
						// TODO Fills in the pass position history
					}
		        } 
				else 
				{
					if(lastPass != null)
					{
						lastPass.setEndTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(s.getDate()));
						passes.add(lastPass);
						
						// Update pass position history
						lastPass.getPositionHistory().updateHistory();
						
						// Reset last pass.
						lastPass = null;
					}	
					
		        }			
				
				return Action.CONTINUE;
			}

			@Override
			public org.orekit.propagation.SpacecraftState resetState(ElevationDetector detector, org.orekit.propagation.SpacecraftState oldState)
					throws OrekitException 
			{			
				 return oldState;
			}
		};
		
		// Define an event detector that detects when the spacecraft rises and sets at the target location.
		double convergenceThreshold = 0.001; // in seconds.		
				
		ElevationDetector detector =  null;
		if(elevationMask instanceof ConstantElevationMask)
		{
			double elevation = ((ConstantElevationMask) elevationMask).getConstantElevation();
			detector = new ElevationDetector(1, convergenceThreshold, targetFrame).withConstantElevation(elevation).withHandler(eventHandler);
		}
		else
		{
			detector = new ElevationDetector(1, convergenceThreshold, targetFrame).withElevationMask(elevationMask.getOreKitElevationMask()).withHandler(eventHandler);	
		}

		// Setup the propagator.
		Propagator propagator = getOreKitPropagator();
		propagator.setSlaveMode();
		propagator.addEventDetector(detector);
		
		AbsoluteDate startAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(startDate);
		AbsoluteDate endAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(endDate);
		
		propagator.propagate(startAbsoluteDate, endAbsoluteDate);
		
		return passes;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<VisibilityPass> getGroundStationPasses(GroundStation groundStation, Date startDate, Date endDate) throws Exception 
	{
		List<VisibilityPass> passes = new ArrayList<VisibilityPass>();
		
		// Defined the target on Earth.
		GeodeticPoint target = new GeodeticPoint(groundStation.getLatitude(), 
												 groundStation.getLongitude(), 
												 groundStation.getElevation());
		
		// Define the Earth Frame.
		Frame earthFrame = FramesFactory.getITRF(IERSConventions.IERS_2010, true);
		BodyShape earth = new OneAxisEllipsoid(Constants.WGS84_EARTH_EQUATORIAL_RADIUS,
		                                       Constants.WGS84_EARTH_FLATTENING,
		                                       earthFrame);
		
		// Define the target in the Earth Frame.
		String name = "?";
		if( groundStation.getName() != null) name =  groundStation.getName();
		TopocentricFrame targetFrame = new TopocentricFrame(earth, target, name);
				
		// Define a visibility handler that will be called when the target is in sight.
		EventHandler<ElevationDetector>  eventHandler = new EventHandler<ElevationDetector> ()
		{			
			VisibilityPass lastPass = null;
			
			@Override
			public org.orekit.propagation.events.handlers.EventHandler.Action eventOccurred(org.orekit.propagation.SpacecraftState s, ElevationDetector detector, boolean increasing) throws OrekitException 
			{	
				if (increasing) 
				{
					if(lastPass == null)
					{
						lastPass = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createVisibilityPass();							
						lastPass.setSurfaceLocation(groundStation);
						lastPass.setStartTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(s.getDate()));												
						lastPass.setOrbitModel(EarthOrbitPropagatorImpl.this.getInitialOrbitBasedEarthOrbitModel());						
					}
		        } 
				else 
				{
					if(lastPass != null)
					{
						lastPass.setEndTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(s.getDate()));
						passes.add(lastPass);
						
						// Update pass position history
						lastPass.getPositionHistory().updateHistory();
						
						// Reset last pass.
						lastPass = null;
					}		            
		        }			
				
				return Action.CONTINUE;
			}

			@Override
			public org.orekit.propagation.SpacecraftState resetState(ElevationDetector detector, org.orekit.propagation.SpacecraftState oldState) throws OrekitException 
			{			
				 return oldState;
			}
		};
		
		// Define an event detector that detects when the spacecraft rises and sets at the target location.
		double convergenceThreshold = 0.001; // in seconds.		
				
		// Get elevation mask.		
		ElevationDetector detector =  null;
		if(groundStation.getElevationMask() instanceof ConstantElevationMask)
		{
			double elevation = ((ConstantElevationMask) groundStation.getElevationMask() ).getConstantElevation();
			detector = new ElevationDetector(1, convergenceThreshold, targetFrame).withConstantElevation(elevation).withHandler(eventHandler);
		}
		else
		{
			detector = new ElevationDetector(1, convergenceThreshold, targetFrame).withElevationMask(groundStation.getElevationMask().getOreKitElevationMask()).withHandler(eventHandler);	
		}

		// Setup the propagator.
		Propagator propagator = getOreKitPropagator();
		propagator.setSlaveMode();
		propagator.addEventDetector(detector);
		
		AbsoluteDate startAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(startDate);
		AbsoluteDate endAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(endDate);
		
		propagator.propagate(startAbsoluteDate, endAbsoluteDate);
		
		return passes;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<Eclipse> getEclipses(Date startDate, Date endDate) throws Exception 
	{
		List<Eclipse> eclipses = new ArrayList<Eclipse>();
		
		List<EclipseEvent> eclipseEvents = new ArrayList<EclipseEvent>();
		
		// Define the Earth Frame.		
		final PVCoordinatesProvider earth = CelestialBodyFactory.getEarth();
		
		// Define the Sun
		final PVCoordinatesProvider sun = CelestialBodyFactory.getSun();
				
		EventHandler<EclipseDetector>  eventHandler = new EventHandler<EclipseDetector> ()
		{
			Eclipse latestEclipse = null;
						
			@Override
			public org.orekit.propagation.events.handlers.EventHandler.Action eventOccurred(org.orekit.propagation.SpacecraftState ss, EclipseDetector eclipseDetector, boolean increasing) throws OrekitException 
			{	
				if(latestEclipse == null)
				{
					latestEclipse = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEclipse();
					eclipses.add(latestEclipse);
				}
				
				if(eclipseDetector.getTotalEclipse())
				{
					if(increasing)
					{				
						// Exit of Umbra
						
						EclipseEvent umbraExit = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEclipseEvent();
						umbraExit.setTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(ss.getDate()));
						umbraExit.setType(EclipseEventType.UMBRA_EXIT);
						setGeographicCoordinates(umbraExit, ss);
						
						latestEclipse.setUmbraExit(umbraExit);	
						
						// DEBUG
						eclipseEvents.add(umbraExit);		
					}
					else
					{
						// Entry in Umbra
						
						EclipseEvent umbraEntry = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEclipseEvent();
						umbraEntry.setTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(ss.getDate()));
						umbraEntry.setType(EclipseEventType.UMBRA_ENTRY);		
						setGeographicCoordinates(umbraEntry, ss);
						
						latestEclipse.setUmbraEntry(umbraEntry);	
						
						// DEBUG
						eclipseEvents.add(umbraEntry);										
					}
				}
				else
				{
					if(increasing)
					{				
						// Exit of Penumbra
						
						EclipseEvent penumbraExit = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEclipseEvent();
						penumbraExit.setTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(ss.getDate()));
						penumbraExit.setType(EclipseEventType.PENUMBRA_EXIT);						
						setGeographicCoordinates(penumbraExit, ss);
						
						latestEclipse.setPenumbraExit(penumbraExit);
						
						// Exiting penumbra, eclipse is over.
						latestEclipse = null;
						
						// DEBUG
						eclipseEvents.add(penumbraExit);
					}
					else
					{					
						// Entry in Penumbra
						
						EclipseEvent penumbraEntry = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEclipseEvent();
						penumbraEntry.setTime(ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createDate(ss.getDate()));
						penumbraEntry.setType(EclipseEventType.PENUMBRA_ENTRY);
						setGeographicCoordinates(penumbraEntry, ss);
																							
						latestEclipse.setPenumbraEntry(penumbraEntry);
						
						// DEBUG
						eclipseEvents.add(penumbraEntry);
					}
				}
				
				return Action.CONTINUE;
			}

			@Override
			public org.orekit.propagation.SpacecraftState resetState(EclipseDetector arg0,org.orekit.propagation.SpacecraftState oldState) throws OrekitException 
			{
				return oldState;
			}
								
			private void setGeographicCoordinates(EclipseEvent eclipseEvent, org.orekit.propagation.SpacecraftState ss)
			{
				try
				{
					OreKitBackedSpacecraftState oreKitBackedSpacecraftState = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createOreKitBackedSpacecraftState();
					oreKitBackedSpacecraftState.setOreKitSpacecraftState(ss);
					GeographicCoordinates geographicCoordinates = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.convertToGeographicCoordinates(oreKitBackedSpacecraftState);
					
					eclipseEvent.setElevation(geographicCoordinates.getElevation());
	                eclipseEvent.setLatitude(geographicCoordinates.getLatitude());	                
	                eclipseEvent.setLongitude(geographicCoordinates.getLongitude());
				}
				catch(Throwable t)
				{
					t.printStackTrace();
				}
			}
			
		};
		
		final EclipseDetector umbraDetector = new EclipseDetector(sun, 696000000, earth, Constants.WGS84_EARTH_EQUATORIAL_RADIUS).withUmbra().withHandler(eventHandler);		
		final EclipseDetector penumbraDetector = new EclipseDetector(sun, 696000000, earth, Constants.WGS84_EARTH_EQUATORIAL_RADIUS).withPenumbra().withHandler(eventHandler);
									
		// Setup the propagator.
		Propagator propagator = getOreKitPropagator();
		propagator.setSlaveMode();
		propagator.addEventDetector(umbraDetector);
		propagator.addEventDetector(penumbraDetector);
		
		AbsoluteDate startAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(startDate);
		AbsoluteDate endAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(endDate);
		
		propagator.propagate(startAbsoluteDate, endAbsoluteDate);
		
		// Post processes the list of EclipseEvent to group events by eclipse.
				
		
		// DEBUG starts
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		for(EclipseEvent event : eclipseEvents)
		{
			System.out.print(event.getType().getName() + "," + dateFormat.format(event.getTime()) + ", ");
			System.out.print(event.getElevation() + " m , ");
			System.out.print(Math.toDegrees(event.getLatitude()) + " lat , ");
			System.out.println(Math.toDegrees(event.getLongitude()) + " lon");
		}
		// DEBUG end
		
		return eclipses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Orbit getInitialOrbit() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromValidDate() 
	{
		// TODO: implement this method to return the 'From Valid Date' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getToValidDate() 
	{
		return getValidToDate(); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDateInValidRange(Date date) 
	{
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)otherEnd, msgs);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return basicSetInitialOrbitBasedEarthOrbitModel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return eInternalContainer().eInverseRemove(this, ApogyCoreEnvironmentOrbitEarthPackage.INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL__PROPAGATOR, InitialOrbitBasedEarthOrbitModel.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__FROM_VALID_DATE:
				return getFromValidDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__TO_VALID_DATE:
				return getToValidDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return getValidFromDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return getValidToDate();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				if (resolve) return getInitialOrbitBasedEarthOrbitModel();
				return basicGetInitialOrbitBasedEarthOrbitModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate((Date)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate((Date)newValue);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				setInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)newValue);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				setValidFromDate(VALID_FROM_DATE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				setValidToDate(VALID_TO_DATE_EDEFAULT);
				return;
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				setInitialOrbitBasedEarthOrbitModel((InitialOrbitBasedEarthOrbitModel)null);
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
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__FROM_VALID_DATE:
				return FROM_VALID_DATE_EDEFAULT == null ? getFromValidDate() != null : !FROM_VALID_DATE_EDEFAULT.equals(getFromValidDate());
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__TO_VALID_DATE:
				return TO_VALID_DATE_EDEFAULT == null ? getToValidDate() != null : !TO_VALID_DATE_EDEFAULT.equals(getToValidDate());
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? validFromDate != null : !VALID_FROM_DATE_EDEFAULT.equals(validFromDate);
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__VALID_TO_DATE:
				return VALID_TO_DATE_EDEFAULT == null ? validToDate != null : !VALID_TO_DATE_EDEFAULT.equals(validToDate);
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR__INITIAL_ORBIT_BASED_EARTH_ORBIT_MODEL:
				return basicGetInitialOrbitBasedEarthOrbitModel() != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public SpacecraftState propagate(Date targetDate) throws Exception 
	{
		if(getInitialOrbitBasedEarthOrbitModel().isDateInValidRange(targetDate))
		{
			Propagator propagator = getOreKitPropagator();
			AbsoluteDate targetAbsoluteDate = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createAbsoluteDate(targetDate);
			
			// Set propagator to slave mode.
			propagator.setSlaveMode();
			
			// Propagate to target date.
			org.orekit.propagation.SpacecraftState ss = propagator.propagate(targetAbsoluteDate);
			
			// Makes a copy of the initial Orbit
			Orbit orbitCopy = EcoreUtil.copy(getInitialOrbit());
			
			return ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createSpacecraftState(orbitCopy, ss);
		}
		else
		{
			String message = "Target date is outside the validity range !";
			
			Logger.INSTANCE.log(Activator.ID, this, message, EventSeverity.ERROR);
			
			// Throw an exception.	
			throw new Exception(message);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR:
				return getOreKitPropagator();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___PROPAGATE__DATE:
				try {
					return propagate((Date)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_SPACECRAFT_STATES__DATE_DATE_DOUBLE:
				try {
					return getSpacecraftStates((Date)arguments.get(0), (Date)arguments.get(1), (Double)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((EarthSurfaceLocation)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE:
				try {
					return getGroundStationPasses((GroundStation)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_ECLIPSES__DATE_DATE:
				try {
					return getEclipses((Date)arguments.get(0), (Date)arguments.get(1));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___GET_INITIAL_ORBIT:
				return getInitialOrbit();
			case ApogyCoreEnvironmentOrbitEarthPackage.EARTH_ORBIT_PROPAGATOR___IS_DATE_IN_VALID_RANGE__DATE:
				return isDateInValidRange((Date)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (validFromDate: ");
		result.append(validFromDate);
		result.append(", validToDate: ");
		result.append(validToDate);
		result.append(')');
		return result.toString();
	}

	
	

} //EarthOrbitPropagatorImpl
