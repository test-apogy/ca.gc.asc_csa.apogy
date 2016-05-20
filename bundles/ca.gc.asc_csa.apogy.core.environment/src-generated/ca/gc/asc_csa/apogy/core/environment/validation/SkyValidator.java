/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.validation;

import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.SkyNode;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.Sun;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.Sky}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SkyValidator {
	boolean validate();

	boolean validateSurfaceWorksite(SurfaceWorksite value);
	boolean validateSkyNode(SkyNode value);
	boolean validateSun(Sun value);
	boolean validateSunHorizontalCoordinates(HorizontalCoordinates value);
	boolean validateStarField(StarField value);
}