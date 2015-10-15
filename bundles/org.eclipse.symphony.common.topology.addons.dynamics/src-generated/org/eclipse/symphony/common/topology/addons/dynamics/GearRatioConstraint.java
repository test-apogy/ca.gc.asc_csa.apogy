/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.topology.addons.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gear Ratio Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint is a velocity-based constraint that constrains the velocity of a body
 * relative to its primary attachment axis to the velocity of another body relative to its
 * primary attachment axis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint#getForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getGearRatioConstraint()
 * @model
 * @generated
 */
public interface GearRatioConstraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(double)
	 * @see org.eclipse.symphony.common.topology.addons.dynamics.TopologyDynamicsPackage#getGearRatioConstraint_Force()
	 * @model unique="false"
	 * @generated
	 */
	double getForce();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.common.topology.addons.dynamics.GearRatioConstraint#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(double value);

} // GearRatioConstraint
