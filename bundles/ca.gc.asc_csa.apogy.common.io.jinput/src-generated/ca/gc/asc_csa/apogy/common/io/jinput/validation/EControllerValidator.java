/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.io.jinput.validation;

import ca.gc.asc_csa.apogy.common.io.jinput.EComponents;

import net.java.games.input.Controller;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.io.jinput.EController}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EControllerValidator {
	boolean validate();

	boolean validateLastPollResult(boolean value);
	boolean validateName(String value);
	boolean validatePortNumber(int value);
	boolean validateType(String value);
	boolean validatePortType(String value);
	boolean validatePojoController(Controller value);
	boolean validateEComponents(EComponents value);
	boolean validateControllerCount(int value);
}