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

import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ruler3d Tool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3dToolNode()
 * @model
 * @generated
 */
public interface Ruler3dToolNode extends Node {

	/**
	 * Returns the value of the '<em><b>Ruler3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRuler3dToolNode <em>Ruler3d Tool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ruler3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ruler3 DTool</em>' reference.
	 * @see #setRuler3DTool(Ruler3DTool)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getRuler3dToolNode_Ruler3DTool()
	 * @see ca.gc.asc_csa.apogy.addons.Ruler3DTool#getRuler3dToolNode
	 * @model opposite="ruler3dToolNode" transient="true"
	 * @generated
	 */
	Ruler3DTool getRuler3DTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.Ruler3dToolNode#getRuler3DTool <em>Ruler3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruler3 DTool</em>' reference.
	 * @see #getRuler3DTool()
	 * @generated
	 */
	void setRuler3DTool(Ruler3DTool value);
} // Ruler3dToolNode
