/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.io.jinput.validation;

import ca.gc.asc_csa.apogy.common.io.jinput.EComponents;

import net.java.games.input.Component;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EComponentValidator {
	boolean validate();

	boolean validateDeadZone(float value);
	boolean validateIdentifier(String value);
	boolean validateRelative(boolean value);
	boolean validateAnalog(boolean value);
	boolean validateName(String value);
	boolean validatePojoComponent(Component value);
	boolean validatePollData(float value);
	boolean validateEComponents(EComponents value);
}
