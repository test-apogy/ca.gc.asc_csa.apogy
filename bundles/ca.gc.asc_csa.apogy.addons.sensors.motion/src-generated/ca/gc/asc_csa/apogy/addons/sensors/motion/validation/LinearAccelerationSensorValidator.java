/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.sensors.motion.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.sensors.motion.LinearAccelerationSensor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LinearAccelerationSensorValidator {
	boolean validate();

	boolean validateXAcceleration(double value);
	boolean validateYAcceleration(double value);
	boolean validateZAcceleration(double value);
}
