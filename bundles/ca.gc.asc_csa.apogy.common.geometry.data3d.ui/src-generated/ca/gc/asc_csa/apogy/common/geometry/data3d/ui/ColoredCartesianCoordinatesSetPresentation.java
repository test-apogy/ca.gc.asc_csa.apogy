/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.common.geometry.data3d.ui;

import ca.gc.asc_csa.apogy.common.geometry.data3d.ColoredCartesianCoordinatesSet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Cartesian Coordinates Set Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#isOverrideColor <em>Override Color</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#getColoredPointCloud <em>Colored Point Cloud</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getColoredCartesianCoordinatesSetPresentation()
 * @model
 * @generated
 */
public interface ColoredCartesianCoordinatesSetPresentation extends CartesianCoordinatesSetPresentation {
	/**
	 * Returns the value of the '<em><b>Override Color</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Override Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Override Color</em>' attribute.
	 * @see #setOverrideColor(boolean)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getColoredCartesianCoordinatesSetPresentation_OverrideColor()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	boolean isOverrideColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#isOverrideColor <em>Override Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Color</em>' attribute.
	 * @see #isOverrideColor()
	 * @generated
	 */
	void setOverrideColor(boolean value);

	/**
	 * Returns the value of the '<em><b>Colored Point Cloud</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colored Point Cloud</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colored Point Cloud</em>' reference.
	 * @see #setColoredPointCloud(ColoredCartesianCoordinatesSet)
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getColoredCartesianCoordinatesSetPresentation_ColoredPointCloud()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly' propertyCategory='PRESENTATION_INTERNAL_INFORMATION' child='false'"
	 * @generated
	 */
	ColoredCartesianCoordinatesSet getColoredPointCloud();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredCartesianCoordinatesSetPresentation#getColoredPointCloud <em>Colored Point Cloud</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colored Point Cloud</em>' reference.
	 * @see #getColoredPointCloud()
	 * @generated
	 */
	void setColoredPointCloud(ColoredCartesianCoordinatesSet value);

} // ColoredCartesianCoordinatesSetPresentation
