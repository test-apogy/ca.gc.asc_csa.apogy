/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.addons.mobility.pathplanners.graph;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance And Rover Footprint Cost Function</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getRoverFootPrintRadius <em>Rover Foot Print Radius</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumRoughness <em>Maximum Roughness</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumCrossSlope <em>Maximum Cross Slope</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndRoverFootprintCostFunction()
 * @model
 * @generated
 */
public interface DistanceAndRoverFootprintCostFunction extends DistanceAndSlopesCostFunction {
	/**
	 * Returns the value of the '<em><b>Rover Foot Print Radius</b></em>' attribute.
	 * The default value is <code>"0.5"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rover Foot Print Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rover Foot Print Radius</em>' attribute.
	 * @see #setRoverFootPrintRadius(double)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndRoverFootprintCostFunction_RoverFootPrintRadius()
	 * @model default="0.5" unique="false"
	 * @generated
	 */
	double getRoverFootPrintRadius();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getRoverFootPrintRadius <em>Rover Foot Print Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rover Foot Print Radius</em>' attribute.
	 * @see #getRoverFootPrintRadius()
	 * @generated
	 */
	void setRoverFootPrintRadius(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Roughness</b></em>' attribute.
	 * The default value is <code>"0.1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Roughness</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Roughness</em>' attribute.
	 * @see #setMaximumRoughness(double)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndRoverFootprintCostFunction_MaximumRoughness()
	 * @model default="0.1" unique="false"
	 * @generated
	 */
	double getMaximumRoughness();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumRoughness <em>Maximum Roughness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Roughness</em>' attribute.
	 * @see #getMaximumRoughness()
	 * @generated
	 */
	void setMaximumRoughness(double value);

	/**
	 * Returns the value of the '<em><b>Maximum Cross Slope</b></em>' attribute.
	 * The default value is <code>"0.488"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum Cross Slope</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Cross Slope</em>' attribute.
	 * @see #setMaximumCrossSlope(double)
	 * @see org.eclipse.symphony.addons.mobility.pathplanners.graph.PathplannersGraphPackage#getDistanceAndRoverFootprintCostFunction_MaximumCrossSlope()
	 * @model default="0.488" unique="false"
	 * @generated
	 */
	double getMaximumCrossSlope();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.addons.mobility.pathplanners.graph.DistanceAndRoverFootprintCostFunction#getMaximumCrossSlope <em>Maximum Cross Slope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Cross Slope</em>' attribute.
	 * @see #getMaximumCrossSlope()
	 * @generated
	 */
	void setMaximumCrossSlope(double value);

} // DistanceAndRoverFootprintCostFunction
