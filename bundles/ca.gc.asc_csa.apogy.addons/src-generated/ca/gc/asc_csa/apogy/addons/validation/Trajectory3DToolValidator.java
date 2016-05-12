/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.validation;

import ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode;

import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;

import ca.gc.asc_csa.apogy.core.PoseProvider;

import ca.gc.asc_csa.apogy.core.invocator.Variable;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface Trajectory3DToolValidator {
	boolean validate();

	boolean validatePenDown(boolean value);
	boolean validateVariable(Variable value);
	boolean validateDistanceThreshold(double value);
	boolean validateTotalDistance(double value);
	boolean validatePaths(EList<WayPointPath> value);
	boolean validatePoseProvider(PoseProvider value);
	boolean validateTrajectory3DToolNode(Trajectory3DToolNode value);
}
