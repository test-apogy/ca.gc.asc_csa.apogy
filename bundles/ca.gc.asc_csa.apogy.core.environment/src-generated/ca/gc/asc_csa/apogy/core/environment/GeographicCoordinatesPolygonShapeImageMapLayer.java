package ca.gc.asc_csa.apogy.core.environment;
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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Geographic Coordinates Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * PolygonShapeImageMapLayer defined by a list of Geographic Coordinates.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinatesPolygonShapeImageMapLayer#getPolygonVerticesGeographicCoordinates <em>Polygon Vertices Geographic Coordinates</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer()
 * @model
 * @generated
 */
public interface GeographicCoordinatesPolygonShapeImageMapLayer extends PolygonShapeImageMapLayer {
	/**
	 * Returns the value of the '<em><b>Polygon Vertices Geographic Coordinates</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Vertices Geographic Coordinates</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentPackage#getGeographicCoordinatesPolygonShapeImageMapLayer_PolygonVerticesGeographicCoordinates()
	 * @model containment="true"
	 * @generated
	 */
	EList<GeographicCoordinates> getPolygonVerticesGeographicCoordinates();

} // GeographicCoordinatesPolygonShapeImageMapLayer
