/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.topology.bindings.validation;

import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsList;
import ca.gc.asc_csa.apogy.common.topology.bindings.FeatureRootsList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BindingsSetValidator {
	boolean validate();

	boolean validateFeatureRootsList(FeatureRootsList value);
	boolean validateBindingsList(BindingsList value);
}
