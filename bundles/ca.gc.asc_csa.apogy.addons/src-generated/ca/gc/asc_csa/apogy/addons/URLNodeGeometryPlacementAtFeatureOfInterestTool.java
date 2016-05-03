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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Node Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A simple GeometryPlacementAtFeatureOfInterestTool that contains attributes that are returned by the
 * getGeometryOffsets() and getGeometryURL() methods.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getURL <em>URL</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getCadToToolTransform <em>Cad To Tool Transform</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool()
 * @model
 * @generated
 */
public interface URLNodeGeometryPlacementAtFeatureOfInterestTool extends AbstractURLNodeGeometryPlacementAtFeatureOfInterestTool {
	/**
	 * Returns the value of the '<em><b>URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * URL to the file containing the geometry to be displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>URL</em>' attribute.
	 * @see #setURL(String)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool_URL()
	 * @model unique="false"
	 * @generated
	 */
	String getURL();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getURL <em>URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>URL</em>' attribute.
	 * @see #getURL()
	 * @generated
	 */
	void setURL(String value);

	/**
	 * Returns the value of the '<em><b>Cad To Tool Transform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The transform required between the tool transformNode and the URLNode.This can be used to offset the
	 * geometry on the URLNode to center it on the tool origin.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cad To Tool Transform</em>' containment reference.
	 * @see #setCadToToolTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool_CadToToolTransform()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getCadToToolTransform();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getCadToToolTransform <em>Cad To Tool Transform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cad To Tool Transform</em>' containment reference.
	 * @see #getCadToToolTransform()
	 * @generated
	 */
	void setCadToToolTransform(Matrix4x4 value);

} // URLNodeGeometryPlacementAtFeatureOfInterestTool
