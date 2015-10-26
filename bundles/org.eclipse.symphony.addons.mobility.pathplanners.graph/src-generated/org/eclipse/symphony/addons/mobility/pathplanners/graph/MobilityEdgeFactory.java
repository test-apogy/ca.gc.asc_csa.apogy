/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

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
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.MobilityEdgeFactory#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory()
 * @model superTypes="org.eclipse.symphony.addons.mobility.pathplanners.graph.EdgeFactory<org.eclipse.symphony.common.geometry.data3d.CartesianPolygon, org.eclipse.symphony.addons.mobility.pathplanners.graph.MobilityEdge>"
 * @generated
 */
public interface MobilityEdgeFactory extends EObject, EdgeFactory<CartesianPolygon, MobilityEdge> {
	/**
	 * Returns the value of the '<em><b>Cost Functions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DisplacementCostFunction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost Functions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost Functions</em>' reference list.
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage#getMobilityEdgeFactory_CostFunctions()
	 * @model
	 * @generated
	 */
	EList<DisplacementCostFunction> getCostFunctions();

} // MobilityEdgeFactory
