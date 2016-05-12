/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.validation;

import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.examples.robotic_arm.RoboticArm}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RoboticArmValidator {
	boolean validate();

	boolean validateTurretAngle(double value);
	boolean validateShoulderAngle(double value);
	boolean validateElbowAngle(double value);
	boolean validateWristAngle(double value);
	boolean validateInitialized(boolean value);
	boolean validateArmMoving(boolean value);
	boolean validateSpeed(MoveSpeedLevel value);
}
