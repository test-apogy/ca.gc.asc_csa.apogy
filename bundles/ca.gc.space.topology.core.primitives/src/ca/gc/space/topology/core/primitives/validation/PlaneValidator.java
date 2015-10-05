/**
 *
 * $Id: PlaneValidator.java,v 1.1.6.3 2015/02/03 20:01:31 rlarcheveque Exp $
 */
package ca.gc.space.topology.core.primitives.validation;

import org.eclipse.symphony.common.math.Tuple3d;

/**
 * A sample validator interface for {@link ca.gc.space.topology.core.primitives.Plane}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PlaneValidator {
	boolean validate();

	boolean validateV0(Tuple3d value);
	boolean validateV1(Tuple3d value);
	boolean validateWidth(double value);
	boolean validateHeight(double value);
}
