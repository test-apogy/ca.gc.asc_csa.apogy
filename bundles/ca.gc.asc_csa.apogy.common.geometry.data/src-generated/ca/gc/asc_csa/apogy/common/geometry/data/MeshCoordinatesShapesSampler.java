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
 * A representation of the model object '<em><b>Mesh Coordinates Shapes Sampler</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getCoordinatesSamplingShapes <em>Coordinates Sampling Shapes</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshCoordinatesShapesSampler()
 * @model abstract="true"
 * @generated
 */
public interface MeshCoordinatesShapesSampler<CoordinatesType extends Coordinates, PolygonType extends Polygon<CoordinatesType>> extends Processor<Mesh<CoordinatesType, PolygonType>, Mesh<CoordinatesType, PolygonType>> {
	/**
	 * Returns the value of the '<em><b>Coordinates Sampling Shapes</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape}&lt;CoordinatesType>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinates Sampling Shapes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinates Sampling Shapes</em>' reference list.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshCoordinatesShapesSampler_CoordinatesSamplingShapes()
	 * @model
	 * @generated
	 */
	EList<CoordinatesSamplingShape<CoordinatesType>> getCoordinatesSamplingShapes();

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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshCoordinatesShapesSampler_ShapeSamplingMode()
	 * @model default="UNION" unique="false" required="true"
	 * @generated
	 */
	ShapeSamplingMode getShapeSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getShapeSamplingMode <em>Shape Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ShapeSamplingMode
	 * @see #getShapeSamplingMode()
	 * @generated
	 */
	void setShapeSamplingMode(ShapeSamplingMode value);

	/**
	 * Returns the value of the '<em><b>Polygon Sampling Mode</b></em>' attribute.
	 * The default value is <code>"AT_LEAST_ONE_VERTEX"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polygon Sampling Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode
	 * @see #setPolygonSamplingMode(PolygonSamplingMode)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getMeshCoordinatesShapesSampler_PolygonSamplingMode()
	 * @model default="AT_LEAST_ONE_VERTEX" unique="false" required="true"
	 * @generated
	 */
	PolygonSamplingMode getPolygonSamplingMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data.MeshCoordinatesShapesSampler#getPolygonSamplingMode <em>Polygon Sampling Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygon Sampling Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingMode
	 * @see #getPolygonSamplingMode()
	 * @generated
	 */
	void setPolygonSamplingMode(PolygonSamplingMode value);

} // MeshCoordinatesShapesSampler
