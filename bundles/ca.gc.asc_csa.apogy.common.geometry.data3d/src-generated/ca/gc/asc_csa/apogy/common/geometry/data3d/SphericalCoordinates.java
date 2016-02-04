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

import ca.gc.asc_csa.apogy.common.geometry.data.Coordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spherical Coordinates</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * A spherical coordinate.
 * @see https://en.wikipedia.org/wiki/Spherical_coordinate_system
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getR <em>R</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getSphericalCoordinates()
 * @model
 * @generated
 */
public interface SphericalCoordinates extends Coordinates {
	/**
	 * Returns the value of the '<em><b>Phi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Phi</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The azimuthal angle (about Z), in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Phi</em>' attribute.
	 * @see #setPhi(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getSphericalCoordinates_Phi()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='rad'"
	 * @generated
	 */
	double getPhi();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getPhi <em>Phi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Phi</em>' attribute.
	 * @see #getPhi()
	 * @generated
	 */
	void setPhi(double value);

	/**
	 * Returns the value of the '<em><b>Theta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Theta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The polar angle, in radians.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Theta</em>' attribute.
	 * @see #setTheta(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getSphericalCoordinates_Theta()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='rad'"
	 * @generated
	 */
	double getTheta();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getTheta <em>Theta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Theta</em>' attribute.
	 * @see #getTheta()
	 * @generated
	 */
	void setTheta(double value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>R</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The radius, in meters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(double)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DPackage#getSphericalCoordinates_R()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' children='false' apogy_units='m'"
	 * @generated
	 */
	double getR();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.SphericalCoordinates#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(double value);

} // SphericalCoordinates
