package ca.gc.asc_csa.apogy.addons.sensors.fov;
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

import ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data.PolygonSamplingShape;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;

import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rectangular Frustrum Field Of View Sampling Shape</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfViewSamplingShape()
 * @model
 * @generated
 */
public interface RectangularFrustrumFieldOfViewSamplingShape<PolygonType extends CartesianPolygon> extends CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, PolygonType> {
	/**
	 * Returns the value of the '<em><b>Transform</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transform</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transform</em>' reference.
	 * @see #setTransform(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfViewSamplingShape_Transform()
	 * @model
	 * @generated
	 */
	Matrix4x4 getTransform();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getTransform <em>Transform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transform</em>' reference.
	 * @see #getTransform()
	 * @generated
	 */
	void setTransform(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Rectangular Frustrum Field Of View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rectangular Frustrum Field Of View</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rectangular Frustrum Field Of View</em>' reference.
	 * @see #setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ApogyAddonsSensorsFOVPackage#getRectangularFrustrumFieldOfViewSamplingShape_RectangularFrustrumFieldOfView()
	 * @model
	 * @generated
	 */
	RectangularFrustrumFieldOfView getRectangularFrustrumFieldOfView();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.RectangularFrustrumFieldOfViewSamplingShape#getRectangularFrustrumFieldOfView <em>Rectangular Frustrum Field Of View</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rectangular Frustrum Field Of View</em>' reference.
	 * @see #getRectangularFrustrumFieldOfView()
	 * @generated
	 */
	void setRectangularFrustrumFieldOfView(RectangularFrustrumFieldOfView value);

} // RectangularFrustrumFieldOfViewSamplingShape
