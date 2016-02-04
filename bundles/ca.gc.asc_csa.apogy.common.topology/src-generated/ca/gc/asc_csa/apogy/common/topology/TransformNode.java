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

import javax.vecmath.Matrix4d;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transform Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage#getTransformNode()
 * @model
 * @generated
 */
public interface TransformNode extends PositionNode, RotationNode {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" unique="false"
	 * @generated
	 */
	Matrix4d asMatrix4d();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model matrixDataType="ca.gc.asc_csa.apogy.common.topology.Matrix4d" matrixUnique="false"
	 * @generated
	 */
	void setTransformation(Matrix4d matrix);

} // TransformNode
