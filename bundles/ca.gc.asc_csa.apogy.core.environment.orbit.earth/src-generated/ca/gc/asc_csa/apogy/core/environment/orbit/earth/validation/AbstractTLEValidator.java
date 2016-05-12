/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.validation;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EphemerisType;

import java.util.Date;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.AbstractTLE}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractTLEValidator {
	boolean validate();

	boolean validateBStar(double value);
	boolean validateEpoch(Date value);
	boolean validateEccentricity(double value);
	boolean validateElementNumber(int value);
	boolean validateEphemerisType(EphemerisType value);
	boolean validateInclination(double value);
	boolean validateMeanAnomaly(double value);
	boolean validateMeanMotion(double value);
	boolean validateRevolutionPerDay(double value);
	boolean validateMeanMotionFirstDerivative(double value);
	boolean validateMeanMotionSecondDerivative(double value);
	boolean validateArgumentOfPerigee(double value);
	boolean validateRightAscentionOfAscendingNode(double value);
	boolean validateRevolutionNumberAtEpoch(int value);
	boolean validateSatelliteNumber(int value);
}
