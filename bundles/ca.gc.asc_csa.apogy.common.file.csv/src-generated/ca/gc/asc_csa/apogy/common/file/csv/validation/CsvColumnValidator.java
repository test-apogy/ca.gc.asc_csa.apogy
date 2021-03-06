/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.file.csv.validation;

import java.util.Map;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumn}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CsvColumnValidator {
	boolean validate();

	boolean validateValues(Map.Entry<Integer, Object> value);
	boolean validateName(String value);
	boolean validateDescription(String value);
}
