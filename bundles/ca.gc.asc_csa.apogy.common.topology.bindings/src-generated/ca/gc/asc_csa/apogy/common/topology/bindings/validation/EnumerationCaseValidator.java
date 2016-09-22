/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.topology.bindings.validation;

import ca.gc.asc_csa.apogy.common.topology.Node;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EEnumLiteral;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface EnumerationCaseValidator {
	boolean validate();

	boolean validateEnumerationLiterals(EList<EEnumLiteral> value);
	boolean validateTopologyRoot(Node value);
}