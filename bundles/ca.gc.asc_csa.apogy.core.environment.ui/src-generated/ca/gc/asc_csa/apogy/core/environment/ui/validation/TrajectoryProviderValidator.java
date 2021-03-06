/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.core.environment.ui.validation;

import javax.vecmath.Color3f;

import org.jfree.data.xy.XYDataItem;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.core.environment.ui.TrajectoryProvider}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrajectoryProviderValidator {
	boolean validate();

	boolean validateLatestPosition(XYDataItem value);
	boolean validateAzimuthAngle(double value);
	boolean validateTrajectoryLength(double value);
	boolean validateTrajectoryColor(Color3f value);
}
