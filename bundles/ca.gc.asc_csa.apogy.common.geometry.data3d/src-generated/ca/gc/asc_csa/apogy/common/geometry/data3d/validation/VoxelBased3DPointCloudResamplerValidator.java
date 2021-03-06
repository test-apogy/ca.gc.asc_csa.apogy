/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.geometry.data3d.VoxelBased3DPointCloudResampler}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VoxelBased3DPointCloudResamplerValidator {
	boolean validate();

	boolean validateResolutionX(double value);
	boolean validateResolutionY(double value);
	boolean validateResolutionZ(double value);
	boolean validateMinimumNumberOfPointPerVoxel(int value);
	boolean validateTileResolution(double value);
}
