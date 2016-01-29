/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;

import org.jgrapht.EdgeFactory;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mobility Edge Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdgeFactory#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory()
 * @model superTypes="ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.EdgeFactory<ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon, ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.MobilityEdge>"
 * @generated
 */
public interface MobilityEdgeFactory extends EObject, EdgeFactory<CartesianPolygon, MobilityEdge> {
	/**
	 * Returns the value of the '<em><b>Cost Functions</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DisplacementCostFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Functions</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory_CostFunctions()
	 * @model
	 * @generated
	 */
	EList<DisplacementCostFunction> getCostFunctions();

} // MobilityEdgeFactory
