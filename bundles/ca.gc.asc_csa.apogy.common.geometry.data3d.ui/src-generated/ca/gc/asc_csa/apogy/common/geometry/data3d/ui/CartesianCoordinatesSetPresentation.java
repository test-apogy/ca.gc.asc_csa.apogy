package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;
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

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cartesian Coordinates Set Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getNumberOfPoints <em>Number Of Points</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation()
 * @model
 * @generated
 */
public interface CartesianCoordinatesSetPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Cloud</em>' reference.
	 * @see #setPointCloud(CartesianCoordinatesSet)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_PointCloud()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='PRESENTATION_INTERNAL_INFORMATION' child='false'"
	 * @generated
	 */
	CartesianCoordinatesSet getPointCloud();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointCloud <em>Point Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Cloud</em>' reference.
	 * @see #getPointCloud()
	 * @generated
	 */
	void setPointCloud(CartesianCoordinatesSet value);

	/**
	 * Returns the value of the '<em><b>Point Size</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Point Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Point Size</em>' attribute.
	 * @see #setPointSize(int)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_PointSize()
	 * @model default="1" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	int getPointSize();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.CartesianCoordinatesSetPresentation#getPointSize <em>Point Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Point Size</em>' attribute.
	 * @see #getPointSize()
	 * @generated
	 */
	void setPointSize(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Points</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Points</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getCartesianCoordinatesSetPresentation_NumberOfPoints()
	 * @model unique="false" transient="true" changeable="false" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='COORDINATES_SET_INFORMATION' child='false'"
	 * @generated
	 */
	int getNumberOfPoints();

} // CartesianCoordinatesSetPresentation
