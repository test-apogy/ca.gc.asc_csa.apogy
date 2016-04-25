/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.emf.validation;

import org.eclipse.emf.ecore.EClass;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.emf.AbstractRootNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractRootNodeValidator {
	boolean validate();

	boolean validateSourceClass(EClass value);
}
