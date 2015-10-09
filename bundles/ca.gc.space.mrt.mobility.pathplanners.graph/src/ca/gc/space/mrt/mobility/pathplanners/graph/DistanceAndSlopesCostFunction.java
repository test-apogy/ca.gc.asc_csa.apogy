/**
 * Canadian Space Agency 2008.
 *
 * $Id: DistanceAndSlopesCostFunction.java,v 1.2.4.2 2015/05/21 15:50:20 pallard Exp $
 */
package ca.gc.space.mrt.mobility.pathplanners.graph;

import org.eclipse.symphony.common.geometry.data3d.CartesianAxis;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance And Slopes Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis <em>Gravity Axis</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope <em>Maximum Up Slope</em>}</li>
 *   <li>{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope <em>Maximum Down Slope</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction()
 * @model
 * @generated
 */
public interface DistanceAndSlopesCostFunction extends MeshDisplacementCostFunction {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Canadian Space Agency 2008.";

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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction_UpSlopeCostFactor()
	 * @model default="1"
	 * @generated
	 */
	double getUpSlopeCostFactor();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getUpSlopeCostFactor <em>Up Slope Cost Factor</em>}' attribute.
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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction_DownSlopeCostFactor()
	 * @model default="1"
	 * @generated
	 */
	double getDownSlopeCostFactor();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getDownSlopeCostFactor <em>Down Slope Cost Factor</em>}' attribute.
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
	 * The literals are from the enumeration {@link org.eclipse.symphony.common.geometry.data3d.CartesianAxis}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gravity Axis</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gravity Axis</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianAxis
	 * @see #setGravityAxis(CartesianAxis)
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction_GravityAxis()
	 * @model default="Z"
	 * @generated
	 */
	CartesianAxis getGravityAxis();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getGravityAxis <em>Gravity Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gravity Axis</em>' attribute.
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianAxis
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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction_MaximumUpSlope()
	 * @model default="0.33"
	 * @generated
	 */
	double getMaximumUpSlope();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumUpSlope <em>Maximum Up Slope</em>}' attribute.
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
	 * @see ca.gc.space.mrt.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndSlopesCostFunction_MaximumDownSlope()
	 * @model default="0.33"
	 * @generated
	 */
	double getMaximumDownSlope();

	/**
	 * Sets the value of the '{@link ca.gc.space.mrt.mobility.pathplanners.graph.DistanceAndSlopesCostFunction#getMaximumDownSlope <em>Maximum Down Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Down Slope</em>' attribute.
	 * @see #getMaximumDownSlope()
	 * @generated
	 */
	void setMaximumDownSlope(double value);

} // DistanceAndSlopesCostFunction
