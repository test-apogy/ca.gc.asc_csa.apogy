/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getDisplacementCostFunction()
 * @model abstract="true"
 * @generated
 */
public interface DisplacementCostFunction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" fromUnique="false" toUnique="false"
	 * @generated
	 */
	double getCost(CartesianPolygon from, CartesianPolygon to);

} // DisplacementCostFunction
