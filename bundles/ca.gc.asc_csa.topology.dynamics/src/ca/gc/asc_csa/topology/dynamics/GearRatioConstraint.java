/**
 * <copyright>
 * </copyright>
 *
 * $Id: GearRatioConstraint.java,v 1.4.2.2 2015/02/03 20:01:37 rlarcheveque Exp $
 */
package ca.gc.asc_csa.topology.dynamics;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gear Ratio Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This constraint is a velocity-based constraint that constrains the velocity of a body relative to its primary attachment axis to the velocity of another body relative to its primary attachment axis.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.topology.dynamics.GearRatioConstraint#getForce <em>Force</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getGearRatioConstraint()
 * @model
 * @generated
 */
public interface GearRatioConstraint extends AbstractConstraint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyrights Canadian Space Agency 2012.";

	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TODO
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(double)
	 * @see ca.gc.asc_csa.topology.dynamics.TopologyDynamicsPackage#getGearRatioConstraint_Force()
	 * @model
	 * @generated
	 */
	double getForce();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.topology.dynamics.GearRatioConstraint#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(double value);

} // GearRatioConstraint
