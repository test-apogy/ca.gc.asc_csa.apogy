/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.asc.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.geometry.data3d.asc.ASCHeaderData}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ASCHeaderDataValidator {
	boolean validate();

	boolean validateNumberOfRow(int value);
	boolean validateNumberOfColumns(int value);
	boolean validateXllCenter(double value);
	boolean validateYllCenter(double value);
	boolean validateCellSize(double value);
	boolean validateNoDataValue(double value);
}
