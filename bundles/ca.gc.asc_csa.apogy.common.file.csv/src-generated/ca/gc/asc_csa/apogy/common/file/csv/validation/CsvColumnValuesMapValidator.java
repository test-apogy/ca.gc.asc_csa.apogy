/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.file.csv.validation;


/**
 * A sample validator interface for {@link java.util.Map.Entry<java.lang.Integer, java.lang.Object>}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CsvColumnValuesMapValidator {
	boolean validate();

	boolean validateTypedKey(Integer value);
	boolean validateTypedValue(Object value);
}
