/**
 * <copyright>
 * </copyright>
 *
 * $Id: CsvColumnValuesMapValidator.java,v 1.2.4.2 2015/05/21 15:49:55 pallard Exp $
 */
package ca.gc.space.mrt.common.csv.validation;


/**
 * A sample validator interface for {@link java.util.Map.Entry}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface CsvColumnValuesMapValidator {
	boolean validate();

	boolean validateTypedValue(Object value);
	boolean validateTypedKey(int value);
}
