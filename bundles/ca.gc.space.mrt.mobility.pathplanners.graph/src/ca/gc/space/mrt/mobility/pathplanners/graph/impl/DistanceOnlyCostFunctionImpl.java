/**
 * Canadian Space Agency 2008.
 *
 * $Id: DistanceOnlyCostFunctionImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph.impl;

import org.eclipse.emf.ecore.EClass;

import ca.gc.space.mrt.geometry.data3d.CartesianPolygon;
import ca.gc.space.mrt.geometry.data3d.Geometry3dUtilities;
import ca.gc.space.mrt.mobility.pathplanners.graph.DistanceOnlyCostFunction;
import ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Only Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DistanceOnlyCostFunctionImpl extends MeshDisplacementCostFunctionImpl implements DistanceOnlyCostFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceOnlyCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersGraphPackage.Literals.DISTANCE_ONLY_COST_FUNCTION;
	}

	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to) {
		return Geometry3dUtilities.getDistance(from.getCentroid(), to.getCentroid());	
	}
} //DistanceOnlyCostFunctionImpl
