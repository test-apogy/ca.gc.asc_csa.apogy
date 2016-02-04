package ca.gc.asc_csa.apogy.common.topology.addons.dynamics;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cylindrical Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The cylindrical constraint is a 2 DOF constraint (one prismatic and one angular).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState <em>Angular Current State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState <em>Linear Current State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getCylindricalConstraint()
 * @model
 * @generated
 */
public interface CylindricalConstraint extends AbstractConstraint {
	/**
	 * Returns the value of the '<em><b>Angular Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Angular Current State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Angular Current State</em>' containment reference.
	 * @see #setAngularCurrentState(ConstraintState)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getCylindricalConstraint_AngularCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getAngularCurrentState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getAngularCurrentState <em>Angular Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Angular Current State</em>' containment reference.
	 * @see #getAngularCurrentState()
	 * @generated
	 */
	void setAngularCurrentState(ConstraintState value);

	/**
	 * Returns the value of the '<em><b>Linear Current State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linear Current State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linear Current State</em>' containment reference.
	 * @see #setLinearCurrentState(ConstraintState)
	 * @see ca.gc.asc_csa.apogy.common.topology.addons.dynamics.ApogyCommonTopologyAddonsDynamicsPackage#getCylindricalConstraint_LinearCurrentState()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConstraintState getLinearCurrentState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.addons.dynamics.CylindricalConstraint#getLinearCurrentState <em>Linear Current State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linear Current State</em>' containment reference.
	 * @see #getLinearCurrentState()
	 * @generated
	 */
	void setLinearCurrentState(ConstraintState value);

} // CylindricalConstraint
