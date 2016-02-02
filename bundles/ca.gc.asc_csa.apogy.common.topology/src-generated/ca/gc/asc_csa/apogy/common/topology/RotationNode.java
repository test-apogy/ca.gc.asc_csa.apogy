package ca.gc.asc_csa.apogy.common.topology;
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

import ca.gc.asc_csa.apogy.common.math.Matrix3x3;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rotation Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getRotationNode()
 * @model
 * @generated
 */
public interface RotationNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Rotation Matrix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation Matrix</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #setRotationMatrix(Matrix3x3)
	 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getRotationNode_RotationMatrix()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' createChild='false'"
	 * @generated
	 */
	Matrix3x3 getRotationMatrix();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.RotationNode#getRotationMatrix <em>Rotation Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotation Matrix</em>' containment reference.
	 * @see #getRotationMatrix()
	 * @generated
	 */
	void setRotationMatrix(Matrix3x3 value);

} // RotationNode
