/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.examples.antenna.apogy.validation;

import ca.gc.asc_csa.apogy.addons.sensors.fov.ConicalFieldOfView;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.examples.antenna.apogy.PTUDishAntennaData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PTUDishAntennaDataValidator {
	boolean validate();

	boolean validateFov(ConicalFieldOfView value);
	boolean validatePanAngle(double value);
	boolean validateTiltAngle(double value);
	boolean validateTrackingSun(boolean value);
	boolean validateInitialized(boolean value);
}
