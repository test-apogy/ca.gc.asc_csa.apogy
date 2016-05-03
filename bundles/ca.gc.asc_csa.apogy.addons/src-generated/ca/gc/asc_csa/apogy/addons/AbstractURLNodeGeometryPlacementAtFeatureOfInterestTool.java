/**
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
package ca.gc.asc_csa.apogy.addons;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.common.topology.URLNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract URL Node Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Specialization of GeometryPlacementAtFeatureOfInterestTool that attaches a geometry to the specified FOI.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool#getCadTransformNode <em>Cad Transform Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool#getUrlNode <em>Url Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool()
 * @model abstract="true"
 * @generated
 */
public interface AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool extends GeometryPlacementAtFeatureOfInterestTool {
	/**
	 * Returns the value of the '<em><b>Cad Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The TransformNode applying the geometry offsets between the tool transform and the geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cad Transform Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_CadTransformNode()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly'"
	 * @generated
	 */
	TransformNode getCadTransformNode();

	/**
	 * Returns the value of the '<em><b>Url Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The URLNode containing the geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getAbstractURLNodeGeometryPlacementAtFeatureOfInterestTool_UrlNode()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly'"
	 * @generated
	 */
	URLNode getUrlNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the offset transformation to be applied between the transformNode and the geometry.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	Matrix4x4 getGeometryOffsets();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the URL where the geometry is to be found.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getGeometryURL();

} // AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool
