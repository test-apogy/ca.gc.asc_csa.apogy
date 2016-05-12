/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.validation;

import ca.gc.asc_csa.apogy.common.emf.Timed;

import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftLocationWorldWindLayer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SpacecraftLocationWorldWindLayerValidator {
	boolean validate();

	boolean validateOrbitModel(OrbitModel value);
	boolean validateTimeSource(Timed value);
	boolean validateShowGroundProjection(boolean value);
	boolean validateShowLatLon(boolean value);
}
