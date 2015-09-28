/**
 * <copyright>
 * </copyright>
 *
 * $Id: RecordingsValidator.java,v 1.2.4.2 2015/05/21 15:50:02 pallard Exp $
 */
package ca.gc.space.mrt.common.recorders.validation;

import java.util.Date;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * A sample validator interface for {@link ca.gc.space.mrt.common.recorders.Recordings}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface RecordingsValidator {
	boolean validate();

	boolean validateSource(EObject value);
	boolean validateRecords(Map<Date, EList<Object>> value);
	boolean validateTracks(EList<String> value);
}
