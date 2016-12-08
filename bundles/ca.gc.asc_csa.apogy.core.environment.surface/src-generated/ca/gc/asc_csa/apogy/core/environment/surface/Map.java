/**
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
package ca.gc.asc_csa.apogy.core.environment.surface;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.math.Matrix4x4;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Maps and Layers
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getLayers <em>Layers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getMapNode <em>Map Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getMap()
 * @model
 * @generated
 */
public interface Map extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' containment reference.
	 * @see #setTransformation(Matrix4x4)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getMap_Transformation()
	 * @model containment="true"
	 * @generated
	 */
	Matrix4x4 getTransformation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.Map#getTransformation <em>Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' containment reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Matrix4x4 value);

	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getMap <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getMap_Layers()
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.AbstractMapLayer#getMap
	 * @model opposite="map" containment="true"
	 * @generated
	 */
	EList<AbstractMapLayer> getLayers();

	/**
	 * Returns the value of the '<em><b>Map Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getMap_MapNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
	MapNode getMapNode();

} // Map
