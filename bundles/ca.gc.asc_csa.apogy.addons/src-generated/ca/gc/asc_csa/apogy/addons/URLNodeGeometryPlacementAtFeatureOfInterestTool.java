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

import ca.gc.asc_csa.apogy.common.topology.URLNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>URL Node Geometry Placement At Feature Of Interest Tool</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A GeometryPlacementAtFeatureOfInterestTool that gets its geometry from a URL and creates a URLNode from it.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getGeometryURL <em>Geometry URL</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getUrlNode <em>Url Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool()
 * @model
 * @generated
 */
public interface URLNodeGeometryPlacementAtFeatureOfInterestTool extends GeometryPlacementAtFeatureOfInterestTool {
	/**
	 * Returns the value of the '<em><b>Geometry URL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * URL to the file containing the geometry to be displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geometry URL</em>' attribute.
	 * @see #setGeometryURL(String)
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool_GeometryURL()
	 * @model unique="false"
	 * @generated
	 */
	String getGeometryURL();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.URLNodeGeometryPlacementAtFeatureOfInterestTool#getGeometryURL <em>Geometry URL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geometry URL</em>' attribute.
	 * @see #getGeometryURL()
	 * @generated
	 */
	void setGeometryURL(String value);

	/**
	 * Returns the value of the '<em><b>Url Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The URLNode containing the geometry.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Url Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.addons.ApogyAddonsPackage#getURLNodeGeometryPlacementAtFeatureOfInterestTool_UrlNode()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='true' property='Readonly'"
	 * @generated
	 */
	URLNode getUrlNode();

} // URLNodeGeometryPlacementAtFeatureOfInterestTool
