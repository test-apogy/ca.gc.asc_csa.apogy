/**
 * <copyright>
 * </copyright>
 *
 * $Id: MobilityEdgeFactoryValidator.java,v 1.2.4.3 2015/09/22 19:39:37 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.validation;

import org.eclipse.emf.common.util.EList;

import ca.gc.space.mrt.mobility.pathplanners.graph.DisplacementCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.MeshDisplacementCostFunction;

/**
 * A sample validator interface for {@link ca.gc.space.mrt.mobility.pathplanners.graph.MobilityEdgeFactory}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface MobilityEdgeFactoryValidator {
	boolean validate();

	boolean validateCostFunctions(EList<DisplacementCostFunction> value);

	boolean validateCostFunction(MeshDisplacementCostFunction value);
}
