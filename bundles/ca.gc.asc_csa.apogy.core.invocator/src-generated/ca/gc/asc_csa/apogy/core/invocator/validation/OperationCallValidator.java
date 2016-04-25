/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.invocator.validation;

import ca.gc.asc_csa.apogy.core.invocator.ArgumentsList;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallContainer;

import org.eclipse.emf.ecore.EOperation;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.invocator.OperationCall}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface OperationCallValidator {
	boolean validate();

	boolean validateEOperation(EOperation value);
	boolean validateArgumentsList(ArgumentsList value);
	boolean validateOperationCallContainer(OperationCallContainer value);
	boolean validateInvocatorSession(InvocatorSession value);
	boolean validateEnvironment(Environment value);
}
