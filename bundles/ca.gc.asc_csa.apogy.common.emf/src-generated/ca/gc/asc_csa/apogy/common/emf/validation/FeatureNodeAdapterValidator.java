/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.emf.validation;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface FeatureNodeAdapterValidator {
	boolean validate();

	boolean validateSourceObject(EObject value);
	boolean validateFeatureNode(AbstractFeatureNode value);
	boolean validateCurrentValue(Object value);
	boolean validateResolved(boolean value);
}
