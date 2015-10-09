/**
 * <copyright>
 * </copyright>
 *
 * $Id: WayPointPathValidator.java,v 1.2.4.2 2015/05/21 15:50:36 pallard Exp $
 */
package org.eclipse.symphony.addons.geometry.paths.validation;

import org.eclipse.symphony.common.geometry.data3d.CartesianPositionCoordinates;


/**
 * A sample validator interface for {@link org.eclipse.symphony.addons.geometry.paths.WayPointPath}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface WayPointPathValidator {
	boolean validate();

	boolean validateLenght(double value);

	boolean validateEndPoint(CartesianPositionCoordinates value);

	boolean validateStartPoint(CartesianPositionCoordinates value);
}