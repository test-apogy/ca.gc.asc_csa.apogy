/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.validation;

import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.CorridorPoint}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CorridorPointValidator {
	boolean validate();

	boolean validateLeft(GeographicCoordinates value);
	boolean validateCenter(GeographicCoordinates value);
	boolean validateRight(GeographicCoordinates value);
}
