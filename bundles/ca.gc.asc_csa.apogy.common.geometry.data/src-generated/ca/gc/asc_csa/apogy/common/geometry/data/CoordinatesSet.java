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

import java.util.List;

import javax.vecmath.Vector3d;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinates Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getPoints <em>Points</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getNormals <em>Normals</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getCoordinatesSet()
 * @model
 * @generated
 */
public interface CoordinatesSet<T extends Coordinates> extends EObject {
	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getCoordinatesSet_Points()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<T> getPoints();

	/**
	 * Returns the value of the '<em><b>Normals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normals</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normals</em>' attribute.
	 * @see #setNormals(List)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data.ApogyCommonGeometryDataPackage#getCoordinatesSet_Normals()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.geometry.data.List<ca.gc.asc_csa.apogy.common.geometry.data.Vector3d>" many="false" transient="true"
	 * @generated
	 */
	List<Vector3d> getNormals();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data.CoordinatesSet#getNormals <em>Normals</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normals</em>' attribute.
	 * @see #getNormals()
	 * @generated
	 */
	void setNormals(List<Vector3d> value);

} // CoordinatesSet
