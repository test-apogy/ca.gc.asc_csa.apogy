/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.examples.rover.validation;

import ca.gc.asc_csa.apogy.examples.rover.Battery;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.examples.rover.PowerSystem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PowerSystemValidator {
	boolean validate();

	boolean validateBatteries(EList<Battery> value);
	boolean validateActiveBattery(Battery value);
	boolean validateCurrentVoltage(double value);
	boolean validateCurrentCurrent(double value);
}
