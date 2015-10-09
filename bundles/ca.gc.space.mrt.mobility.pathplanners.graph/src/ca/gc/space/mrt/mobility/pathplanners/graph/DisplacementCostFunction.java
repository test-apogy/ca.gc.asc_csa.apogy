/**
 * Canadian Space Agency 2008.
 *
 * $Id: DisplacementCostFunction.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDisplacementCostFunction()
 * @model abstract="true"
 * @generated
 */
public interface DisplacementCostFunction extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" toRequired="true"
	 * @generated
	 */
	double getCost(CartesianPolygon from, CartesianPolygon to);

} // DisplacementCostFunction
