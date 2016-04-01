package ca.gc.asc_csa.apogy.examples.satellite.tests;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Iterator;

import org.junit.Assert;
import org.junit.Test;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan;
import ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;

public class ApogyExamplesSatelliteTests {

	public static final String SESSION_URI = "platform:/plugin/ca.gc.asc_csa.apogy.examples.satellite.apogy/sessions/radarsat2.sym";	
	public static final String CONTEXT_NAME = "Default";
	public static final String VARIABLE_NAME = "constellation";
	public static final String GENERATED_PLAN_NAME = "Generated";
	
	@Test
	public void testDefaultConstellationPlanner() throws Exception {
		/* Load the session, constellation state and planner. */
		InvocatorSession invocatorSession = ApogyCoreInvocatorFacade.INSTANCE.loadInvocatorSession(SESSION_URI);
		Assert.assertNotNull(invocatorSession);
		
		ConstellationState constellationState = getConstellationState(invocatorSession);
		Assert.assertNotNull(constellationState);
		
		DefaultConstellationPlanner planner = (DefaultConstellationPlanner) constellationState.getConstellationPlanner();
		assertNotNull(planner);
		
		/* Invoke the planner. */
		planner.plan();
		
		/* 2 Commands (Visibility Passes) must be found. */
		AbstractConstellationCommandPlan plan = getSatelliteCommandPlanByName(constellationState, GENERATED_PLAN_NAME);
		assertEquals(2, plan.getConstellationCommands().size());
		
		/* 
		 * Check the visibility passes. 
		 */
		AbstractSatelliteCommand command = null;
		VisibilityPassBasedSatelliteCommand visibilityCommand = null;
		
		/* Command 1. */
		command = plan.getConstellationCommands().get(0);
		assertTrue(command instanceof VisibilityPassBasedSatelliteCommand);
		visibilityCommand = (VisibilityPassBasedSatelliteCommand) command;
		assertEquals(new Date(1459405555300L), visibilityCommand.getTime());
		
		/* Command 2. */
		command = plan.getConstellationCommands().get(1);
		assertTrue(command instanceof VisibilityPassBasedSatelliteCommand);
		visibilityCommand = (VisibilityPassBasedSatelliteCommand) command;
		assertEquals(new Date(1459423814159L), visibilityCommand.getTime());
	}
	
	/*
	 * Returns the Stored {@link ConstellationState}.
	 * @param session Reference to the session.
	 * @return Reference to the {@link ConstellationState}.
	 */
	public static ConstellationState getConstellationState(InvocatorSession session){
		Context context = ApogyCoreInvocatorFacade.INSTANCE.getContextByName(session, CONTEXT_NAME);
		VariableImplementation variableImplementation = context.getVariableImplementationsList().getVariableImplementation(VARIABLE_NAME);		
		ConstellationData data = (ConstellationData) variableImplementation.getAbstractInitializationData();		
		return data.getConstellationState();
	}
	
	/*
	 * Returns the {@link AbstractConstellationCommandPlan} with the specified name.
	 * @param constellationState Reference to the state.
	 * @param name Search name criteria.
	 */
	public static AbstractConstellationCommandPlan getSatelliteCommandPlanByName(ConstellationState constellationState, String name){		
		AbstractConstellationCommandPlan constellationCommandPlan = null;		
		Iterator<AbstractConstellationCommandPlan> plans = constellationState.getConstellationCommandPlansList().getPlans().iterator();
		while (plans.hasNext() && constellationCommandPlan == null){
			AbstractConstellationCommandPlan plan = plans.next();
			if (plan.getName().equals(name)){
				constellationCommandPlan = plan;
			}
		}
		return constellationCommandPlan;
	}
}
