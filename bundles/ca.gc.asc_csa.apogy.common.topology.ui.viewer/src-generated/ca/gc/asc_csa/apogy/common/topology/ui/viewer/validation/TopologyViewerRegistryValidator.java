/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.topology.ui.viewer.validation;

import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;

import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TopologyViewerRegistryValidator {
	boolean validate();

	boolean validateVerbose(boolean value);
	boolean validateITopologyViewers(EList<ITopologyViewer> value);
	boolean validateLatestNodeSelection(NodeSelection value);
}
