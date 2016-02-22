package ca.gc.asc_csa.apogy.common.geometry.data25d;
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

import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates25 D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represent 2.5D geometry where u and v are the
 * independent variables and w the dependent variable.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getU <em>U</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getV <em>V</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getW <em>W</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinates25D()
 * @model
 * @generated
 */
public interface Coordinates25D extends Coordinates {
	/**
	 * Returns the value of the '<em><b>U</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>U</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>U</em>' attribute.
	 * @see #setU(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinates25D_U()
	 * @model unique="false"
	 * @generated
	 */
	double getU();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getU <em>U</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>U</em>' attribute.
	 * @see #getU()
	 * @generated
	 */
	void setU(double value);

	/**
	 * Returns the value of the '<em><b>V</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>V</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>V</em>' attribute.
	 * @see #setV(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinates25D_V()
	 * @model unique="false"
	 * @generated
	 */
	double getV();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getV <em>V</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>V</em>' attribute.
	 * @see #getV()
	 * @generated
	 */
	void setV(double value);

	/**
	 * Returns the value of the '<em><b>W</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>W</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>W</em>' attribute.
	 * @see #setW(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data25d.ApogyCommonGeometryData25DPackage#getCoordinates25D_W()
	 * @model unique="false"
	 * @generated
	 */
	double getW();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data25d.Coordinates25D#getW <em>W</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>W</em>' attribute.
	 * @see #getW()
	 * @generated
	 */
	void setW(double value);

} // Coordinates25D
