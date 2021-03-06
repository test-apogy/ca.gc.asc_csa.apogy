/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.invocator.validation;

import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.ProgramsList;
import ca.gc.asc_csa.apogy.core.invocator.ValuesList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.invocator.Program}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProgramValidator {
	boolean validate();

	boolean validateProgramsList(ProgramsList value);
	boolean validateInvocatorSession(InvocatorSession value);
	boolean validateValuesList(ValuesList value);
}
