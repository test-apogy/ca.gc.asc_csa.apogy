package ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance And Slopes Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis <em>Gravity Axis</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope <em>Maximum Up Slope</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope <em>Maximum Down Slope</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction()
 * @model
 * @generated
 */
public interface DistanceAndSlopesCostFunction extends MeshDisplacementCostFunction {
	/**
	 * Returns the value of the '<em><b>Up Slope Cost Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Up Slope Cost Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Up Slope Cost Factor</em>' attribute.
	 * @see #setUpSlopeCostFactor(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction_UpSlopeCostFactor()
	 * @model default="1" unique="false"
	 * @generated
	 */
	double getUpSlopeCostFactor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Up Slope Cost Factor</em>' attribute.
	 * @see #getUpSlopeCostFactor()
	 * @generated
	 */
	void setUpSlopeCostFactor(double value);

	/**
	 * Returns the value of the '<em><b>Down Slope Cost Factor</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Down Slope Cost Factor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Down Slope Cost Factor</em>' attribute.
	 * @see #setDownSlopeCostFactor(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction_DownSlopeCostFactor()
	 * @model default="1" unique="false"
	 * @generated
	 */
	double getDownSlopeCostFactor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Down Slope Cost Factor</em>' attribute.
	 * @see #getDownSlopeCostFactor()
	 * @generated
	 */
	void setDownSlopeCostFactor(double value);

	/**
	 * Returns the value of the '<em><b>Gravity Axis</b></em>' attribute.
	 * The default value is <code>"Z"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @see #setGravityAxis(CartesianAxis)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction_GravityAxis()
	 * @model default="Z" unique="false"
	 * @generated
	 */
	CartesianAxis getGravityAxis();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis <em>Gravity Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianAxis
	 * @see #getGravityAxis()
	 * @generated
	 */
	void setGravityAxis(CartesianAxis value);

	/**
	 * Returns the value of the '<em><b>Maximum Up Slope</b></em>' attribute.
	 * The default value is <code>"0.33"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Up Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Up Slope</em>' attribute.
	 * @see #setMaximumUpSlope(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction_MaximumUpSlope()
	 * @model default="0.33" unique="false"
	 * @generated
	 */
	double getMaximumUpSlope();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope <em>Maximum Up Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Up Slope</em>' attribute.
	 * @see #getMaximumUpSlope()
	 * @generated
	 */
	void setMaximumUpSlope(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Down Slope</b></em>' attribute.
	 * The default value is <code>"0.33"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Down Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Down Slope</em>' attribute.
	 * @see #setMaximumDownSlope(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.ApogyAddonsMobilityPathplannersGraphPackage#getDistanceAndSlopesCostFunction_MaximumDownSlope()
	 * @model default="0.33" unique="false"
	 * @generated
	 */
	double getMaximumDownSlope();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope <em>Maximum Down Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Down Slope</em>' attribute.
	 * @see #getMaximumDownSlope()
	 * @generated
	 */
	void setMaximumDownSlope(double value);

} // DistanceAndSlopesCostFunction
