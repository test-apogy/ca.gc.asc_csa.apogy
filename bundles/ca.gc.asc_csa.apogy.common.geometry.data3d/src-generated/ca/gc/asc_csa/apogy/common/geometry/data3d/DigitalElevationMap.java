package ca.gc.asc_csa.apogy.common.geometry.data3d;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digital Elevation Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDigitalElevationMap()
 * @model
 * @generated
 */
public interface DigitalElevationMap extends CartesianCoordinatesSet {
	/**
	 * Returns the value of the '<em><b>XDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XDimension</em>' attribute.
	 * @see #setXDimension(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDigitalElevationMap_XDimension()
	 * @model unique="false"
	 * @generated
	 */
	int getXDimension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getXDimension <em>XDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XDimension</em>' attribute.
	 * @see #getXDimension()
	 * @generated
	 */
	void setXDimension(int value);

	/**
	 * Returns the value of the '<em><b>YDimension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>YDimension</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>YDimension</em>' attribute.
	 * @see #setYDimension(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getDigitalElevationMap_YDimension()
	 * @model unique="false"
	 * @generated
	 */
	int getYDimension();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.DigitalElevationMap#getYDimension <em>YDimension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YDimension</em>' attribute.
	 * @see #getYDimension()
	 * @generated
	 */
	void setYDimension(int value);

} // DigitalElevationMap
