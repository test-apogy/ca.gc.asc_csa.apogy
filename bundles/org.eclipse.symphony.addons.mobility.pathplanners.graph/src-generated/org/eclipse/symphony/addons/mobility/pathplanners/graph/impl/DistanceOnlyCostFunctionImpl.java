/**
 * Canadian Space Agency 2008.
 *
 * $Id: DistanceOnlyCostFunctionImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceOnlyCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;
import org.eclipse.symphony.common.geometry.data3d.Geometry3dUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Only Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class DistanceOnlyCostFunctionImpl extends MeshDisplacementCostFunctionImpl implements DistanceOnlyCostFunction {
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
		return Symphony__AddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_ONLY_COST_FUNCTION;
	}

	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to) {
		return Geometry3dUtilities.getDistance(from.getCentroid(), to.getCentroid());	
	}
} //DistanceOnlyCostFunctionImpl
