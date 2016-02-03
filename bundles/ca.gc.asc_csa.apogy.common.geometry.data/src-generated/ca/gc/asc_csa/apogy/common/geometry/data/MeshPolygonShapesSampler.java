package ca.gc.asc_csa.apogy.common.geometry.data;
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
import ca.gc.asc_csa.apogy.common.processors.Processor;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh Polygon Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getPolygonSamplingShapes <em>Polygon Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshPolygonShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshPolygonShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> {
	/**
	 * Returns the value of the '<em><b>Polygon Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape}&lt;CoordinatesType, PolygonType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Shapes</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshPolygonShapesSampler_PolygonSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<PolygonSamplingShape<CoordinatesType, PolygonType>> getPolygonSamplingShapes();

	/**
	 * Returns the value of the '<em><b>Shape Sampling Mode</b></em>' attribute.
	 * The default value is <code>"UNION"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
	 * @see #setShapeSamplingMode(ShapeSamplingMode)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshPolygonShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshPolygonShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

} // MeshPolygonShapesSampler
