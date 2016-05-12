/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.ui.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.ui.EarthSurfaceWorksitePresentation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EarthSurfaceWorksitePresentationValidator {
	boolean validate();

	boolean validateAxisVisible(boolean value);
	boolean validateAxisLength(double value);
	boolean validateAzimuthVisible(boolean value);
	boolean validateElevationLinesVisible(boolean value);
	boolean validateAzimuthLinesVisible(boolean value);
	boolean validatePlaneVisible(boolean value);
	boolean validatePlaneGridSize(double value);
	boolean validatePlaneSize(double value);
}
