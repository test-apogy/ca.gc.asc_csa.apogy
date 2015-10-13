/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.validation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link org.eclipse.symphony.common.obsolete.eclipse.emf.ui.property.PropertyCellEditorContributors}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PropertyCellEditorContributorsValidator {
	boolean validate();

	boolean validateList(EList<?> value);
}