/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.sensors.pose.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.sensors.pose.SimulatedPoseSensor}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SimulatedPoseSensorValidator {
	boolean validate();

	boolean validateXVelocity(double value);
	boolean validateYVelocity(double value);
	boolean validateZVelocity(double value);
	boolean validateXAngularVelocity(double value);
	boolean validateYAngularVelocity(double value);
	boolean validateZAngularVelocity(double value);
	boolean validateUpdatePeriod(double value);
}