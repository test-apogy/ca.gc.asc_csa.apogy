/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui.validation;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangularMesh;

import ca.gc.asc_csa.apogy.common.images.AbstractEImage;

import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianTriangularMeshPresentation}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CartesianTriangularMeshPresentationValidator {
	boolean validate();

	boolean validateMesh(CartesianTriangularMesh value);
	boolean validatePointSize(int value);
	boolean validateNumberOfPoints(int value);
	boolean validateNumberOfPolygons(int value);
	boolean validatePresentationMode(MeshPresentationMode value);
	boolean validateTransparency(float value);
	boolean validateUseShading(boolean value);
	boolean validateTextureImage(AbstractEImage value);
}
