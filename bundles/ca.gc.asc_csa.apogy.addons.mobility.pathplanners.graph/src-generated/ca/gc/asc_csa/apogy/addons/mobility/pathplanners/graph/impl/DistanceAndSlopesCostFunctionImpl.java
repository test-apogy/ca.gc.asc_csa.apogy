package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction;
import ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.Geometry3DUtilities;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance And Slopes Cost Function</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl#getGravityAxis <em>Gravity Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl#getMaximumUpSlope <em>Maximum Up Slope</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.impl.DistanceAndSlopesCostFunctionImpl#getMaximumDownSlope <em>Maximum Down Slope</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceAndSlopesCostFunctionImpl extends MeshDisplacementCostFunctionImpl implements DistanceAndSlopesCostFunction {
	/**
	 * The default value of the '{@link #getUpSlopeCostFactor() <em>Up Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpSlopeCostFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double UP_SLOPE_COST_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getUpSlopeCostFactor() <em>Up Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpSlopeCostFactor()
	 * @generated
	 * @ordered
	 */
	protected double upSlopeCostFactor = UP_SLOPE_COST_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getDownSlopeCostFactor() <em>Down Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownSlopeCostFactor()
	 * @generated
	 * @ordered
	 */
	protected static final double DOWN_SLOPE_COST_FACTOR_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDownSlopeCostFactor() <em>Down Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDownSlopeCostFactor()
	 * @generated
	 * @ordered
	 */
	protected double downSlopeCostFactor = DOWN_SLOPE_COST_FACTOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getGravityAxis() <em>Gravity Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityAxis()
	 * @generated
	 * @ordered
	 */
	protected static final CartesianAxis GRAVITY_AXIS_EDEFAULT = CartesianAxis.Z;

	/**
	 * The cached value of the '{@link #getGravityAxis() <em>Gravity Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGravityAxis()
	 * @generated
	 * @ordered
	 */
	protected CartesianAxis gravityAxis = GRAVITY_AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumUpSlope() <em>Maximum Up Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUpSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_UP_SLOPE_EDEFAULT = 0.33;

	/**
	 * The cached value of the '{@link #getMaximumUpSlope() <em>Maximum Up Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumUpSlope()
	 * @generated
	 * @ordered
	 */
	protected double maximumUpSlope = MAXIMUM_UP_SLOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumDownSlope() <em>Maximum Down Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDownSlope()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DOWN_SLOPE_EDEFAULT = 0.33;

	/**
	 * The cached value of the '{@link #getMaximumDownSlope() <em>Maximum Down Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumDownSlope()
	 * @generated
	 * @ordered
	 */
	protected double maximumDownSlope = MAXIMUM_DOWN_SLOPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceAndSlopesCostFunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsMobilityPathplannersGraphPackage.Literals.DISTANCE_AND_SLOPES_COST_FUNCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getUpSlopeCostFactor() {
		return upSlopeCostFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpSlopeCostFactor(double newUpSlopeCostFactor) {
		double oldUpSlopeCostFactor = upSlopeCostFactor;
		upSlopeCostFactor = newUpSlopeCostFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR, oldUpSlopeCostFactor, upSlopeCostFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDownSlopeCostFactor() {
		return downSlopeCostFactor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDownSlopeCostFactor(double newDownSlopeCostFactor) {
		double oldDownSlopeCostFactor = downSlopeCostFactor;
		downSlopeCostFactor = newDownSlopeCostFactor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR, oldDownSlopeCostFactor, downSlopeCostFactor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianAxis getGravityAxis() {
		return gravityAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGravityAxis(CartesianAxis newGravityAxis) {
		CartesianAxis oldGravityAxis = gravityAxis;
		gravityAxis = newGravityAxis == null ? GRAVITY_AXIS_EDEFAULT : newGravityAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS, oldGravityAxis, gravityAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumUpSlope() {
		return maximumUpSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumUpSlope(double newMaximumUpSlope) {
		double oldMaximumUpSlope = maximumUpSlope;
		maximumUpSlope = newMaximumUpSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE, oldMaximumUpSlope, maximumUpSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMaximumDownSlope() {
		return maximumDownSlope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximumDownSlope(double newMaximumDownSlope) {
		double oldMaximumDownSlope = maximumDownSlope;
		maximumDownSlope = newMaximumDownSlope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE, oldMaximumDownSlope, maximumDownSlope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR:
				return getUpSlopeCostFactor();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR:
				return getDownSlopeCostFactor();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS:
				return getGravityAxis();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE:
				return getMaximumUpSlope();
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE:
				return getMaximumDownSlope();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR:
				setUpSlopeCostFactor((Double)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR:
				setDownSlopeCostFactor((Double)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS:
				setGravityAxis((CartesianAxis)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE:
				setMaximumUpSlope((Double)newValue);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE:
				setMaximumDownSlope((Double)newValue);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR:
				setUpSlopeCostFactor(UP_SLOPE_COST_FACTOR_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR:
				setDownSlopeCostFactor(DOWN_SLOPE_COST_FACTOR_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS:
				setGravityAxis(GRAVITY_AXIS_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE:
				setMaximumUpSlope(MAXIMUM_UP_SLOPE_EDEFAULT);
				return;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE:
				setMaximumDownSlope(MAXIMUM_DOWN_SLOPE_EDEFAULT);
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
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__UP_SLOPE_COST_FACTOR:
				return upSlopeCostFactor != UP_SLOPE_COST_FACTOR_EDEFAULT;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__DOWN_SLOPE_COST_FACTOR:
				return downSlopeCostFactor != DOWN_SLOPE_COST_FACTOR_EDEFAULT;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__GRAVITY_AXIS:
				return gravityAxis != GRAVITY_AXIS_EDEFAULT;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_UP_SLOPE:
				return maximumUpSlope != MAXIMUM_UP_SLOPE_EDEFAULT;
			case ApogyAddonsMobilityPathplannersGraphPackage.DISTANCE_AND_SLOPES_COST_FUNCTION__MAXIMUM_DOWN_SLOPE:
				return maximumDownSlope != MAXIMUM_DOWN_SLOPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (upSlopeCostFactor: ");
		result.append(upSlopeCostFactor);
		result.append(", downSlopeCostFactor: ");
		result.append(downSlopeCostFactor);
		result.append(", gravityAxis: ");
		result.append(gravityAxis);
		result.append(", maximumUpSlope: ");
		result.append(maximumUpSlope);
		result.append(", maximumDownSlope: ");
		result.append(maximumDownSlope);
		result.append(')');
		return result.toString();
	}

	@Override
	public double getCost(CartesianPolygon from, CartesianPolygon to) {
						
		double distance = Geometry3DUtilities.getDistance(from.getCentroid(), to.getCentroid());			
		
		CartesianPositionCoordinates fromCenter = from.getCentroid();
		CartesianPositionCoordinates toCenter = to.getCentroid();
		
		double slope = Geometry3DUtilities.getAngle(Geometry3DUtilities.getPerpendicularPlane(getGravityAxis()), fromCenter, toCenter);
				
		//TODO create a property with DistanceCostFactor instead of using a local variable
		double DistanceCostFactor = 1.0;
				
		// Computes the cost.
		double cost = 0.0;		
		if(slope < 0)
		{						
			// If slope exceeds maximum down slope, cost is infinite.
			if(Math.abs(slope) > getMaximumDownSlope())
			{
				cost = Double.POSITIVE_INFINITY;
			}
			else
			{
				//cost = distance * (1 + (Math.abs(slope) / getMaximumDownSlope() ) * getDownSlopeCostFactor() );
				cost = DistanceCostFactor * distance + (Math.abs(slope) / getMaximumDownSlope() ) * getDownSlopeCostFactor();
			}
		}
		else
		{
			// If slope exceeds maximum up slope, cost is infinite.
			if(slope > getMaximumUpSlope())
			{
				cost = Double.POSITIVE_INFINITY;
			}
			else
			{									
				//cost = distance * (1 + (slope / getMaximumUpSlope() ) * getUpSlopeCostFactor() );
				cost = DistanceCostFactor * distance  + (slope / getMaximumUpSlope() ) * getUpSlopeCostFactor();
			}
		}
		
		return cost;
	}	
	

} //DistanceAndSlopesCostFunctionImpl
