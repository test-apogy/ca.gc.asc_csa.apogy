/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.validation;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.Region}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RegionValidator {
	boolean validate();

	boolean validateTransformation(Matrix4x4 value);
}
