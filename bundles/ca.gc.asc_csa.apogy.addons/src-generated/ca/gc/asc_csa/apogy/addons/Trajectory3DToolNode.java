package ca.gc.asc_csa.apogy.addons;
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

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trajectory3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Node representing the Trajectory3DTool in the topology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DToolNode()
 * @model
 * @generated
 */
public interface Trajectory3DToolNode extends AggregateGroupNode {
	/**
	 * Returns the value of the '<em><b>Trajectory3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTrajectory3DToolNode <em>Trajectory3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trajectory3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trajectory3 DTool</em>' reference.
	 * @see #setTrajectory3DTool(Trajectory3DTool)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getTrajectory3DToolNode_Trajectory3DTool()
	 * @see ca.gc.asc_csa.apogy.addons.Trajectory3DTool#getTrajectory3DToolNode
	 * @model opposite="trajectory3DToolNode" transient="true"
	 * @generated
	 */
	Trajectory3DTool getTrajectory3DTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Trajectory3DToolNode#getTrajectory3DTool <em>Trajectory3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trajectory3 DTool</em>' reference.
	 * @see #getTrajectory3DTool()
	 * @generated
	 */
	void setTrajectory3DTool(Trajectory3DTool value);

} // Trajectory3DToolNode
