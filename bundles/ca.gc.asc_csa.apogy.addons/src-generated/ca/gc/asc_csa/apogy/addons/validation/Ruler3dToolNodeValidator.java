/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.validation;

import ca.gc.asc_csa.apogy.addons.Ruler3DTool;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.Ruler3dToolNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Ruler3dToolNodeValidator {
	boolean validate();

	boolean validateRuler3DTool(Ruler3DTool value);
}
