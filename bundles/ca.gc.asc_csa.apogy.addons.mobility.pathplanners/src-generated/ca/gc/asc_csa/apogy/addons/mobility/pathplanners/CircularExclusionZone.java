package ca.gc.asc_csa.apogy.addons.mobility.pathplanners;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianTriangle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circular Exclusion Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Represent an exclusion zone defined as a circle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getCircularExclusionZone()
 * @model
 * @generated
 */
public interface CircularExclusionZone extends ExclusionZone, CoordinatesSamplingShape<CartesianPositionCoordinates>, PolygonSamplingShape<CartesianPositionCoordinates, CartesianTriangle> {
	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Radius</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(double)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getCircularExclusionZone_Radius()
	 * @model unique="false"
	 * @generated
	 */
	double getRadius();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(double value);

	/**
	 * Returns the value of the '<em><b>Invert Sampling Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invert Sampling Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #setInvertSamplingShape(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.mobility.pathplanners.ApogyAddonsMobilityPathplannersPackage#getCircularExclusionZone_InvertSamplingShape()
	 * @model unique="false"
	 * @generated
	 */
	boolean isInvertSamplingShape();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.mobility.pathplanners.CircularExclusionZone#isInvertSamplingShape <em>Invert Sampling Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invert Sampling Shape</em>' attribute.
	 * @see #isInvertSamplingShape()
	 * @generated
	 */
	void setInvertSamplingShape(boolean value);

} // CircularExclusionZone
