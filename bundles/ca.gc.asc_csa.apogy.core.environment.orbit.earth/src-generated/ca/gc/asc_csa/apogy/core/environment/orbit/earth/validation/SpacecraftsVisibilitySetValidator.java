/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.validation;

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SpacecraftsVisibilitySetValidator {
	boolean validate();

	boolean validateStartTime(Date value);
	boolean validateEndTime(Date value);
	boolean validateOrbitModels(EList<OrbitModel> value);
	boolean validateGroundStations(EList<GroundStation> value);
	boolean validatePasses(EList<VisibilityPass> value);
	boolean validateGroundStationToVisibilityMap(Map<GroundStation, List<VisibilityPass>> value);
}