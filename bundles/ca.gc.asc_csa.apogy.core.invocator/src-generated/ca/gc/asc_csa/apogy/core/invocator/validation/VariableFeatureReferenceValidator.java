/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.invocator.validation;

import ca.gc.asc_csa.apogy.common.emf.ListRootNode;

import ca.gc.asc_csa.apogy.core.invocator.TypeMemberReferenceListElement;
import ca.gc.asc_csa.apogy.core.invocator.Variable;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariableFeatureReferenceValidator {
	boolean validate();

	boolean validateVariable(Variable value);
	boolean validateTypeMemberReferenceListElement(TypeMemberReferenceListElement value);
	boolean validateFeatureRoot(ListRootNode value);
}
