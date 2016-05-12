/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.invocator.validation;

import ca.gc.asc_csa.apogy.core.invocator.AbstractProgramRuntime;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.invocator.ProgramRuntimesList}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ProgramRuntimesListValidator {
	boolean validate();

	boolean validateSession(InvocatorSession value);
	boolean validateProgramRuntimes(EList<AbstractProgramRuntime> value);
}
