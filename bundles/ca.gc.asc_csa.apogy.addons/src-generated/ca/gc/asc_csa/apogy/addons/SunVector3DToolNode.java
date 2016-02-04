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
 * A representation of the model object '<em><b>Sun Vector3 DTool Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSunVector3DToolNode()
 * @model
 * @generated
 */
public interface SunVector3DToolNode extends Node {
	/**
	 * Returns the value of the '<em><b>Sun Vector3 DTool</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.addons.SunVector3DTool#getSunVector3DToolNode <em>Sun Vector3 DTool Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sun Vector3 DTool</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sun Vector3 DTool</em>' reference.
	 * @see #setSunVector3DTool(SunVector3DTool)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getSunVector3DToolNode_SunVector3DTool()
	 * @see ca.gc.asc_csa.apogy.addons.SunVector3DTool#getSunVector3DToolNode
	 * @model opposite="sunVector3DToolNode" transient="true"
	 * @generated
	 */
	SunVector3DTool getSunVector3DTool();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.SunVector3DToolNode#getSunVector3DTool <em>Sun Vector3 DTool</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sun Vector3 DTool</em>' reference.
	 * @see #getSunVector3DTool()
	 * @generated
	 */
	void setSunVector3DTool(SunVector3DTool value);

} // SunVector3DToolNode
