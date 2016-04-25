/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.validation;

import ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet;

import ca.gc.asc_csa.apogy.core.AssemblyLinksList;
import ca.gc.asc_csa.apogy.core.ConnectionPointsList;
import ca.gc.asc_csa.apogy.core.PoseProvider;
import ca.gc.asc_csa.apogy.core.TopologyRoot;

import ca.gc.asc_csa.apogy.core.invocator.AbstractType;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.ApogySystem}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ApogySystemValidator {
	boolean validate();

	boolean validateTopologyRoot(TopologyRoot value);
	boolean validateBindingSet(BindingsSet value);
	boolean validateConnectionPointsList(ConnectionPointsList value);
	boolean validateAssemblyLinksList(AssemblyLinksList value);
	boolean validatePoseProvider(AbstractType value);
	boolean validatePoseProviderInstance(PoseProvider value);
}
