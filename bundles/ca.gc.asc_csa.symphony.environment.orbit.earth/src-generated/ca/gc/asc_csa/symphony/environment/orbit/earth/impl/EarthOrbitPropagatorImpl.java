/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.environment.orbit.earth.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.orekit.bodies.BodyShape;
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
import org.orekit.propagation.events.ElevationDetector;
import org.orekit.propagation.events.handlers.EventHandler;
import org.orekit.propagation.sampling.OrekitFixedStepHandler;
import org.orekit.time.AbsoluteDate;
import org.orekit.utils.Constants;
import org.orekit.utils.IERSConventions;

import ca.gc.asc_csa.symphony.environment.orbit.Orbit;
import ca.gc.asc_csa.symphony.environment.orbit.OrbitModel;
import ca.gc.asc_csa.symphony.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.symphony.environment.orbit.earth.Activator;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbitFacade;
import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.symphony.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.symphony.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.symphony.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.symphony.environment.orbit.earth.OreKitBackedSpacecraftState;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentFactory;
import ca.gc.asc_csa.symphony.environment.orbit.earth.SymphonyEarthOrbitEnvironmentPackage;
import ca.gc.asc_csa.symphony.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.symphony.environment.orbit.impl.AbstractOrbitPropagatorImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Earth Orbit Propagator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class EarthOrbitPropagatorImpl extends AbstractOrbitPropagatorImpl implements EarthOrbitPropagator {
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
		return SymphonyEarthOrbitEnvironmentPackage.Literals.EARTH_ORBIT_PROPAGATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Propagator getOreKitPropagator() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public List<SpacecraftState> getSpacecraftStates(Date startDate, Date endDate, double timeInterval) throws Exception 
	{
		// Checks that the specified dates falls within the propagator valid interval.
		if(!isDateInValidRange(startDate))
		{
			String message = "Start date is outside the validity range !";
															
			Logger.INSTANCE.log(Activator.ID, this, "Start date is outside the validity range !", EventSeverity.ERROR);
	
			// Throw an exception.	
			throw new Exception(message);
		}
		
		if(!isDateInValidRange(endDate))
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
					Date date = EarthOrbitFacade.INSTANCE.createDate(spacecraftState.getDate());
					if(date.getTime() >= startDate.getTime() && endDate.getTime() >= date.getTime())
					{	
						Orbit orbit = null;
						if(spacecraftState.getOrbit() instanceof KeplerianOrbit)
						{
							orbit = EarthOrbitFacade.INSTANCE.createKeplerianOrbit((KeplerianOrbit) spacecraftState.getOrbit());	
						}
						else if(spacecraftState.getOrbit() instanceof CartesianOrbit)
						{
							orbit = EarthOrbitFacade.INSTANCE.createCartesianEarthOrbit((CartesianOrbit) spacecraftState.getOrbit());
						}
						OreKitBackedSpacecraftState ss = EarthOrbitFacade.INSTANCE.createOreKitBackedSpacecraftState(orbit, spacecraftState);
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
						
		AbsoluteDate startAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(startDate);
		
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
		GeodeticPoint target = new GeodeticPoint(earthSurfaceLocation.getGeographicalCoordinates().getLatitude(), 
												 earthSurfaceLocation.getGeographicalCoordinates().getLongitude(), 
												 earthSurfaceLocation.getGeographicalCoordinates().getElevation());
		
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
						lastPass = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createVisibilityPass();						
						lastPass.setStartTime(EarthOrbitFacade.INSTANCE.createDate(s.getDate()));
						lastPass.setSurfaceLocation(earthSurfaceLocation);						
						
						if(eContainer() instanceof OrbitModel)
						{
							lastPass.setOrbitModel((OrbitModel) eContainer());
						}						
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
						lastPass.setEndTime(EarthOrbitFacade.INSTANCE.createDate(s.getDate()));
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
		
		AbsoluteDate startAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(startDate);
		AbsoluteDate endAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(endDate);
		
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
		GeodeticPoint target = new GeodeticPoint(groundStation.getGeographicalCoordinates().getLatitude(), 
												 groundStation.getGeographicalCoordinates().getLongitude(), 
												 groundStation.getGeographicalCoordinates().getElevation());
		
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
						lastPass = SymphonyEarthOrbitEnvironmentFactory.eINSTANCE.createVisibilityPass();	
						lastPass.setSurfaceLocation(groundStation);
						lastPass.setStartTime(EarthOrbitFacade.INSTANCE.createDate(s.getDate()));
						
						if(eContainer() instanceof OrbitModel)
						{
							lastPass.setOrbitModel((OrbitModel) eContainer());
						}
					}
		        } 
				else 
				{
					if(lastPass != null)
					{
						lastPass.setEndTime(EarthOrbitFacade.INSTANCE.createDate(s.getDate()));
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
		
		AbsoluteDate startAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(startDate);
		AbsoluteDate endAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(endDate);
		
		propagator.propagate(startAbsoluteDate, endAbsoluteDate);
		
		return passes;
	}
	
	@Override
	public SpacecraftState propagate(Date targetDate) throws Exception 
	{
		if(isDateInValidRange(targetDate))
		{
			Propagator propagator = getOreKitPropagator();
			AbsoluteDate targetAbsoluteDate = EarthOrbitFacade.INSTANCE.createAbsoluteDate(targetDate);
			
			// Set propagator to slave mode.
			propagator.setSlaveMode();
			
			// Propagate to target date.
			org.orekit.propagation.SpacecraftState ss = propagator.propagate(targetAbsoluteDate);
			
			// Makes a copy of the initial Orbit
			Orbit orbitCopy = EcoreUtil.copy(getInitialOrbit());
			
			return EarthOrbitFacade.INSTANCE.createSpacecraftState(orbitCopy, ss);
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
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_PROPAGATOR___GET_ORE_KIT_PROPAGATOR:
				return getOreKitPropagator();
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_PROPAGATOR___GET_TARGET_PASSES__EARTHSURFACELOCATION_DATE_DATE_ELEVATIONMASK:
				try {
					return getTargetPasses((EarthSurfaceLocation)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (ElevationMask)arguments.get(3));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case SymphonyEarthOrbitEnvironmentPackage.EARTH_ORBIT_PROPAGATOR___GET_GROUND_STATION_PASSES__GROUNDSTATION_DATE_DATE:
				try {
					return getGroundStationPasses((GroundStation)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	
	

} //EarthOrbitPropagatorImpl
