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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Colored Triangular Mesh Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Class representing the presentation attributes for a ColoredCartesianTriangularMesh.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation#isOverrideColor <em>Override Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getColoredTriangularMeshPresentation()
 * @model
 * @generated
 */
public interface ColoredTriangularMeshPresentation extends CartesianTriangularMeshPresentation {
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
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ApogyCommonGeometryData3DUIPackage#getColoredTriangularMeshPresentation_OverrideColor()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Editable' propertyCategory='VISUAL_INFORMATION'"
	 * @generated
	 */
	boolean isOverrideColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.ui.ColoredTriangularMeshPresentation#isOverrideColor <em>Override Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Override Color</em>' attribute.
	 * @see #isOverrideColor()
	 * @generated
	 */
	void setOverrideColor(boolean value);

} // ColoredTriangularMeshPresentation
