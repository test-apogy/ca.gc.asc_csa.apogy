/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.emf.validation;

import ca.gc.asc_csa.apogy.common.emf.TimeDirection;

import java.util.Date;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.emf.BrowseableTimeSource}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BrowseableTimeSourceValidator {
	boolean validate();

	boolean validateStartTime(Date value);
	boolean validateUpdatePeriod(int value);
	boolean validateTimeAcceration(float value);
	boolean validateTimeDirection(TimeDirection value);
}
