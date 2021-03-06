/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.invocator.validation;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.invocator.EEnumArgument}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EEnumArgumentValidator {
	boolean validate();

	boolean validateEEnumLiteral(EEnumLiteral value);
	boolean validateEEnum(EEnum value);
}
