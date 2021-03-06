/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.emf.validation;

import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureSpecifier}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AbstractFeatureSpecifierValidator {
	boolean validate();

	boolean validateStructuralFeature(EStructuralFeature value);
	boolean validateMultiValued(boolean value);
	boolean validateIndex(int value);
}
