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

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Default Constellation Planner</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DefaultConstellationPlannerImpl extends AbstractConstellationPlannerImpl implements DefaultConstellationPlanner {
	private Comparator<AbstractConstellationRequest> constellationRequestComparator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultConstellationPlannerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesSatellitePackage.Literals.DEFAULT_CONSTELLATION_PLANNER;
	}
	
	@Override
	public void validate() throws Exception {
		if (getConstellationState().getSatellitesList() == null || getConstellationState().getSatellitesList().getSatellites().isEmpty()){
			throw new Exception("The planner does not have any satellites defined.");
		}

		if (getConstellationCommandPlan() == null){
			throw new Exception("The planner does not refer to any Constellation Command Plan required to store resuling plan.");
		}
		
		if (getStartDate() == null){
			throw new Exception("The planner start date is not defined.");
		}
		
		if (getEndDate() == null){
			throw new Exception("The planner end date is not defined.");
		}		
		
		if ((long)(getEndDate().getTime() - getStartDate().getTime()) < 0){
			throw new Exception("The planner start date and end date are not consistent.");
		}
		
		if (getConstellationRequestsList() == null){
			throw new Exception("The planner does not refer to any requests.");
		}
		
		if (getElevationMask() == null){
			throw new Exception("The planner does not define any elevation mask.");
		}
	}
	
	@Override
	public void plan() throws Exception {

		Logger.INSTANCE.log(Activator.ID, "Constellation Planner started", EventSeverity.INFO);
		
		/* Validate the planner settings. */
		validate();
				
		/* Clear the command plan. */
		getConstellationCommandPlan().getConstellationCommands().clear();
		
		/* Sort requests. */
		SortedSet<AbstractConstellationRequest> sortedRequests = sortRequests(getConstellationRequestsList().getConstellationRequests());
		
		/* For each request finds the target passes available within the period defined. */
		Iterator<AbstractConstellationRequest> requests = sortedRequests.iterator();
		while (requests.hasNext()){
			AbstractConstellationRequest request = requests.next();
			SortedSet<VisibilityPass> sortedPasses = getTargetPasses(request, getStartDate(), getEndDate(), getElevationMask());
			
			Logger.INSTANCE.log(Activator.ID, "Constellation Planner found " + sortedPasses.size() + " passes", EventSeverity.INFO);
			
			if (!sortedPasses.isEmpty()){
				VisibilityPass selectedVisibilityPass = null;
				
				Iterator<VisibilityPass> passesIterator = sortedPasses.iterator();
				while(selectedVisibilityPass == null && passesIterator.hasNext())
				{												
					VisibilityPass pass = passesIterator.next();
					
					Satellite satellite = getSatellite(pass.getOrbitModel());
					
					// Checks to see if the pass brings us close enough to the target.
					VisibilityPassSpacecraftPosition smallestCrossTrackAnglePosition = pass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
					if(smallestCrossTrackAnglePosition != null && 
					   Math.abs(smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle()) <= Math.abs(satellite.getMaximumRoll()))
					  {
						// We have found a good pass.
						selectedVisibilityPass = pass;
																				
						// Creates a command to roll the spacecraft a little bit before the imaging.
						VisibilityPassBasedSatelliteCommand command = 
								createVisibilityPassBasedSatelliteCommand(request, pass);						
						getConstellationCommandPlan().getConstellationCommands().add(command);
					}					
				}
			}			
		}				
		
		Logger.INSTANCE.log(Activator.ID, "Constellation Planner completed", EventSeverity.INFO);
	}
	
	@Override
	public SortedSet<AbstractConstellationRequest> sortRequests(List<AbstractConstellationRequest> requests) {
		SortedSet<AbstractConstellationRequest> sortedSet = new TreeSet<AbstractConstellationRequest>(getConstellationRequestComparator());
		sortedSet.addAll(requests);
		return sortedSet;
	}
	
	@Override
	public Comparator<AbstractConstellationRequest> getConstellationRequestComparator() {		
		if (constellationRequestComparator == null){
			constellationRequestComparator = new Comparator<AbstractConstellationRequest>() {
				@Override
				public int compare(AbstractConstellationRequest o1, AbstractConstellationRequest o2) {
					return o1.getOrderPriority().compareTo(o2.getOrderPriority());
				}				
			};
		}		
		return constellationRequestComparator;
	}
		
	@Override
	public VisibilityPassBasedSatelliteCommand createVisibilityPassBasedSatelliteCommand(
			AbstractConstellationRequest request, VisibilityPass visibilityPass) {

		VisibilityPassBasedSatelliteCommand command = null;		
		if (request instanceof ImageConstellationRequest){			
			command = ApogyExamplesSatelliteFactory.eINSTANCE.createVisibilityPassBasedSatelliteCommand();
			command.setConstellationRequest(request);
			command.setUid(EcoreUtil.copy(request.getUid()));
			VisibilityPassSpacecraftPosition smallestCrossTrackAnglePosition = visibilityPass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
			command.setTime(smallestCrossTrackAnglePosition.getTime());
			command.setSatellite(getSatellite(visibilityPass.getOrbitModel()));
			command.setVisibilityPass(EcoreUtil.copy(visibilityPass));
		}	
		return command;
	}
	
	@Override
	public boolean isValid(VisibilityPass visibilityPass) 
	{
		// Finds the closest point the satellite comes to the target in the pass.
		VisibilityPassSpacecraftPosition closestPosition = visibilityPass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
		
		// Gets the location of the target
		double observerLongitude = visibilityPass.getSurfaceLocation().getLongitude();
		double observerLatitude = visibilityPass.getSurfaceLocation().getLatitude();
		
		// Finds the horizontal coordinates of the sun at the target at the time of the closest approach.
		HorizontalCoordinates sunCoordinates = AstronomyUtils.INSTANCE.getHorizontalSunPosition(closestPosition.getTime(), observerLongitude, observerLatitude);
		
		// Returns true if the sun is at least 10 degrees above the horizon.
		return (sunCoordinates.getAltitude() > Math.toDegrees(10));		
	}

	@Override
	public SortedSet<VisibilityPass> getTargetPasses(AbstractConstellationRequest request, Date startDate, Date endDate,
			ElevationMask elevationMask) throws Exception {	
		List<VisibilityPass> visibilityPasses = new ArrayList<VisibilityPass>();

		if (request instanceof ImageConstellationRequest){
			ImageConstellationRequest imageConstellationRequest = (ImageConstellationRequest) request;
			EarthSurfaceLocation location = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.createEarthSurfaceLocation("Dummy", "Dummy", imageConstellationRequest.getLongitude(), imageConstellationRequest.getLatitude(), imageConstellationRequest.getElevation());
		
			for (Satellite satellite: getConstellationState().getSatellitesList().getSatellites()){
				if (satellite.getOrbitModel().getPropagator() instanceof EarthOrbitPropagator){
					EarthOrbitPropagator propagator = (EarthOrbitPropagator) satellite.getOrbitModel().getPropagator();
		
					List<VisibilityPass> potentialVisibilityPasses = propagator.getTargetPasses(location, startDate, endDate, elevationMask);					
					for (VisibilityPass pass: potentialVisibilityPasses){
						if (isValid(pass)){
							visibilityPasses.add(pass);
						}
					}
				}
			}			
		}
		
		SortedSet<VisibilityPass> sortedVisibilityPasses = ApogyCoreEnvironmentOrbitEarthFacade.INSTANCE.getVisibilityPassSortedByStartDate(visibilityPasses);		
		return sortedVisibilityPasses;
	}

	@Override
	public Satellite getSatellite(OrbitModel orbitModel) {
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
	
	
} //DefaultConstellationPlannerImpl
