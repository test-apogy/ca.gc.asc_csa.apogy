/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.common.topology.validation;


/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.common.topology.URLNode}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface URLNodeValidator {
	boolean validate();

	boolean validateUrl(String value);
	boolean validatePolygonCount(int value);
	boolean validateVertexCount(int value);
}
