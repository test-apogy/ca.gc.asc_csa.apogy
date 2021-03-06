/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.sensors.range.validation;

import javax.vecmath.Point3d;
import javax.vecmath.Vector3d;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.sensors.range.RayData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RayDataValidator {
	boolean validate();

	boolean validateOrigin(Point3d value);
	boolean validateDirection(Vector3d value);
}
