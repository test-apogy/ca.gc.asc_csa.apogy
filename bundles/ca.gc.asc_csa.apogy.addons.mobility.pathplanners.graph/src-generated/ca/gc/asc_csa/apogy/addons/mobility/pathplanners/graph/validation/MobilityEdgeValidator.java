/**
 *
 * $Id$
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.validation;

import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MobilityEdgeValidator {
	boolean validate();

	boolean validateCostFunctions(EList<DisplacementCostFunction> value);
	boolean validateFrom(CartesianPolygon value);
	boolean validateTo(CartesianPolygon value);
	boolean validateWeight(double value);
}
