/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.programs.controllers.validation;

import ca.gc.asc_csa.apogy.core.programs.controllers.OperationCallControllerBinding;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.programs.controllers.Trigger}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TriggerValidator {
	boolean validate();

	boolean validateOperationCallControllerBinding(OperationCallControllerBinding value);
}
