package ca.gc.asc_csa.apogy.examples.satellite.tests;

import org.junit.Test;

import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.Context;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.VariableImplementation;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;
import ca.gc.asc_csa.apogy.examples.satellite.DefaultConstellationPlanner;
import ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData;

public class ApogyExamplesSatelliteTests {

	private static final String SESSION_URI = "platform:/plugin/ca.gc.asc_csa.apogy.examples.satellite.tests/sessions/tests.sym";	
	private static final String CONTEXT_NAME = "Default";
	private static final String VARIABLE_NAME = "constellation";
	
	@Test
	public void testDefaultConstellationPlanner() throws Exception {
		/* Load the session, constellation state and planner. */
		InvocatorSession invocatorSession = ApogyCoreInvocatorFacade.INSTANCE.loadInvocatorSession(SESSION_URI);
		ConstellationState constellationState = getConstellationState(invocatorSession);
		DefaultConstellationPlanner planner = (DefaultConstellationPlanner) constellationState.getConstellationPlanner();
		
		/* Invoke the planner. */
		planner.plan();
		
		System.out.println("ApogyExamplesSatelliteTests.testDefaultConstellationPlanner()");
	}
	
	/*
	 * Returns the Stored {@link ConstellationState}.
	 * @param session Reference to the session.
	 * @return Reference to the {@link ConstellationState}.
	 */
	private static ConstellationState getConstellationState(InvocatorSession session){
		Context context = ApogyCoreInvocatorFacade.INSTANCE.getContextByName(session, CONTEXT_NAME);
		VariableImplementation variableImplementation = context.getVariableImplementationsList().getVariableImplementation(VARIABLE_NAME);		
		ConstellationData data = (ConstellationData) variableImplementation.getAbstractInitializationData();		
		return data.getConstellationState();
	}
}
