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
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.AcquireImageSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.Activator;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatelliteFactory;
import ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.ImageConstellationRequest;
import ca.gc.asc_csa.apogy.examples.satellite.Satellite;
import ca.gc.asc_csa.apogy.examples.satellite.SatellitesList;

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
	public void plan(SatellitesList satellitesList) throws Exception {

		Logger.INSTANCE.log(Activator.ID, "Constellation Planner started", EventSeverity.INFO);
		
		/* 
		 * 
		 * Validate the planner settings.
		 * 
		 */
		
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
		
		/* Clear the command plan. */
		getConstellationCommandPlan().getConstellationCommands().clear();
		
		/* Sort requests. */
		SortedSet<AbstractConstellationRequest> sortedRequests = sortRequests(getConstellationRequestsList().getConstellationRequests());
		
		/* For each request finds the target passes available within the period defined. */
		Iterator<AbstractConstellationRequest> requests = sortedRequests.iterator();
		while (requests.hasNext()){
			AbstractConstellationRequest request = requests.next();
			SortedSet<VisibilityPass> sortedPasses = getConstellationState().getTargetPasses(request, getStartDate(), getEndDate(), getElevationMask());
			
			Logger.INSTANCE.log(Activator.ID, "Constellation Planner found " + sortedPasses.size() + " passes", EventSeverity.INFO);
			
			if (!sortedPasses.isEmpty()){
				VisibilityPass selectedVisibilityPass = null;
				
				Iterator<VisibilityPass> passesIterator = sortedPasses.iterator();
				while(selectedVisibilityPass == null && passesIterator.hasNext())
				{												
					VisibilityPass pass = passesIterator.next();
					
					Satellite satellite = getConstellationState().getSatellite(pass.getOrbitModel());
					
					// Checks to see if the pass brings us close enough to the target.
					VisibilityPassSpacecraftPosition smallestCrossTrackAnglePosition = pass.getPositionHistory().getSmallestSpacecraftCrossTrackAnglePosition();
					if(smallestCrossTrackAnglePosition != null && 
					   Math.abs(smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle()) <= Math.abs(satellite.getMaximumRoll()))
					  {
						// We have found a good pass.
						selectedVisibilityPass = pass;
																				
						// Creates a command to roll the spacecraft a little bit before the imaging.
						List<AbstractSatelliteCommand> commands = 
								createObservationSatelliteCommands(request, 
										                           smallestCrossTrackAnglePosition.getTime(), 
										                           satellite, 
										                           smallestCrossTrackAnglePosition.getSpacecraftCrossTrackAngle());						
						getConstellationCommandPlan().getConstellationCommands().addAll(commands);
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
	public List<AbstractSatelliteCommand> createObservationSatelliteCommands(AbstractConstellationRequest request,
			Date time, Satellite satellite, double rollAngle) {
		
		List<AbstractSatelliteCommand> commands = new ArrayList<AbstractSatelliteCommand>();
		
		if (request instanceof ImageConstellationRequest){			
			AcquireImageSatelliteCommand command = ApogyExamplesSatelliteFactory.eINSTANCE.createAcquireImageSatelliteCommand();
			command.setConstellationRequest(request);
			command.setUid(EcoreUtil.copy(request.getUid()));
			command.setTime(time);
			command.setSatellite(satellite);
			command.setRollAngle(rollAngle);
			commands.add(command);
		}	
		return commands;
	}
	
} //DefaultConstellationPlannerImpl
