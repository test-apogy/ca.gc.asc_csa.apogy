/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.validation;

import ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.ImageSizePolicy;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.sensors.imaging.camera.URLImageOverlay}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface URLImageOverlayValidator {
	boolean validate();

	boolean validateUrl(String value);
	boolean validateImageSizePolicy(ImageSizePolicy value);
	boolean validateImage(AbstractEImage value);
}