/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.topology.ui.validation;

import ca.gc.asc_csa.apogy.common.topology.Node;

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;
import ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface NodeSelectionValidator {
	boolean validate();

	boolean validateTopologyPresentationSet(TopologyPresentationSet value);
	boolean validateSelectedNode(Node value);
	boolean validateNodePresentation(NodePresentation value);
	boolean validateRelativeIntersectionPoint(Point3d value);
	boolean validateAbsoluteIntersectionPoint(Point3d value);
	boolean validateRelativeIntersectionNormal(Vector3f value);
	boolean validateAbsoluteIntersectionNormal(Vector3f value);
}