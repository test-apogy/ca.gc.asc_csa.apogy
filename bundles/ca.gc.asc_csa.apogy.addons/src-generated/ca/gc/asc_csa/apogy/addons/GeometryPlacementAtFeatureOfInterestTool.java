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

import ca.gc.asc_csa.apogy.common.topology.Node;

import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.FeatureOfInterest;
import ca.gc.asc_csa.apogy.core.FeatureOfInterestNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A tool that allows a user to attach a geometry at a specified FeatureOfInterest
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool#getFeatureOfInterest <em>Feature Of Interest</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool#getFeatureOfInterestNode <em>Feature Of Interest Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool#getTransformNode <em>Transform Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getGeometryPlacementAtFeatureOfInterestTool()
 * @model abstract="true"
 * @generated
 */
public interface GeometryPlacementAtFeatureOfInterestTool extends Simple3DTool {
	/**
	 * Returns the value of the '<em><b>Feature Of Interest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The selected feature of interest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest</em>' reference.
	 * @see #setFeatureOfInterest(FeatureOfInterest)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterest()
	 * @model
	 * @generated
	 */
	FeatureOfInterest getFeatureOfInterest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool#getFeatureOfInterest <em>Feature Of Interest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest</em>' reference.
	 * @see #getFeatureOfInterest()
	 * @generated
	 */
	void setFeatureOfInterest(FeatureOfInterest value);

	/**
	 * Returns the value of the '<em><b>Feature Of Interest Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The FeatureOfInterestNode associated with the FeatureOfInterest. Updated whenever
	 * the featureOfInterest is changed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Of Interest Node</em>' reference.
	 * @see #setFeatureOfInterestNode(FeatureOfInterestNode)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getGeometryPlacementAtFeatureOfInterestTool_FeatureOfInterestNode()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' property='Readonly'"
	 * @generated
	 */
	FeatureOfInterestNode getFeatureOfInterestNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.GeometryPlacementAtFeatureOfInterestTool#getFeatureOfInterestNode <em>Feature Of Interest Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Of Interest Node</em>' reference.
	 * @see #getFeatureOfInterestNode()
	 * @generated
	 */
	void setFeatureOfInterestNode(FeatureOfInterestNode value);

	/**
	 * Returns the value of the '<em><b>Transform Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The TransformNode between the geometry and the selected feature of interest.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transform Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getGeometryPlacementAtFeatureOfInterestTool_TransformNode()
	 * @model transient="true" changeable="false" volatile="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly'"
	 * @generated
	 */
	TransformNode getTransformNode();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Operations that load the geometry. Sub-classes should overwrite this method.
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Node loadGeometry();

} // GeometryPlacementAtFeatureOfInterestTool
