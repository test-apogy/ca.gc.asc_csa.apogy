/**
 * Canadian Space Agency 2008.
 *
 * $Id: DisplacementCostFunctionImpl.java,v 1.3.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.DisplacementCostFunction;
import org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage;
import org.eclipse.symphony.common.geometry.data3d.CartesianPolygon;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Displacement Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class DisplacementCostFunctionImpl extends EObjectImpl implements DisplacementCostFunction {
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
	protected DisplacementCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PathplannersGraphPackage.Literals.DISPLACEMENT_COST_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getCost(CartesianPolygon from, CartesianPolygon to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case PathplannersGraphPackage.DISPLACEMENT_COST_FUNCTION___GET_COST__CARTESIANPOLYGON_CARTESIANPOLYGON:
				return getCost((CartesianPolygon)arguments.get(0), (CartesianPolygon)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DisplacementCostFunctionImpl
