/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.validation;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.ImageMapLayer}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ImageMapLayerValidator {
	boolean validate();

	boolean validateWidth(double value);
	boolean validateHeight(double value);
	boolean validateOpaque(boolean value);
	boolean validateImage(AbstractEImage value);
	boolean validateLegend(AbstractEImage value);
	boolean validateResolution(double value);
}
