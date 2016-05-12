/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.validation;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ui.CircularExclusionZonePresentation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CircularExclusionZonePresentationValidator {
	boolean validate();

	boolean validateTransparency(float value);
	boolean validatePresentationMode(MeshPresentationMode value);
	boolean validateHeight(double value);
}
