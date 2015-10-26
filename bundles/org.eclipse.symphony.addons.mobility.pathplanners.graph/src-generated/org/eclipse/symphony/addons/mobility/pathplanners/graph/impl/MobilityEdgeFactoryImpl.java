/**
 * Canadian Space Agency 2008.
 *
 * $Id: MobilityEdgeFactoryImpl.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DisplacementCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.MobilityEdge;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.MobilityEdgeFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphFactory;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.Symphony__AddonsMobilityPathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mobility Edge Factory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.impl.MobilityEdgeFactoryImpl#getCostFunctions <em>Cost Functions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MobilityEdgeFactoryImpl extends EdgeFactoryImpl<CartesianPolygon, MobilityEdge> implements MobilityEdgeFactory {
	/**
	 * The cached value of the '{@link #getCostFunctions() <em>Cost Functions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCostFunctions()
	 * @generated
	 * @ordered
	 */
	protected EList<DisplacementCostFunction> costFunctions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobilityEdgeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__AddonsMobilityPathplannersGraphPackage.Literals.MOBILITY_EDGE_FACTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DisplacementCostFunction> getCostFunctions() {
		if (costFunctions == null) {
			costFunctions = new EObjectResolvingEList<DisplacementCostFunction>(DisplacementCostFunction.class, this, Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS);
		}
		return costFunctions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				return getCostFunctions();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				getCostFunctions().clear();
				getCostFunctions().addAll((Collection<? extends DisplacementCostFunction>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				getCostFunctions().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Symphony__AddonsMobilityPathplannersGraphPackage.MOBILITY_EDGE_FACTORY__COST_FUNCTIONS:
				return costFunctions != null && !costFunctions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	@Override
	public MobilityEdge createEdge(CartesianPolygon source, CartesianPolygon destination) 
	{
		MobilityEdge edge = Symphony__AddonsMobilityPathplannersGraphFactory.eINSTANCE.createMobilityEdge();
		
		edge.setFrom(source);
		edge.setTo(destination);
		edge.getCostFunctions().addAll(this.getCostFunctions());		
		
		return edge;
	}
} //MobilityEdgeFactoryImpl
