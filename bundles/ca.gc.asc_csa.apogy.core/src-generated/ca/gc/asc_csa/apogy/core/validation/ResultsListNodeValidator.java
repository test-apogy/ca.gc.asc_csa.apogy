/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.validation;

import ca.gc.asc_csa.apogy.core.invocator.ResultsList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.ResultsListNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ResultsListNodeValidator {
	boolean validate();

	boolean validateResultsList(ResultsList value);
}
