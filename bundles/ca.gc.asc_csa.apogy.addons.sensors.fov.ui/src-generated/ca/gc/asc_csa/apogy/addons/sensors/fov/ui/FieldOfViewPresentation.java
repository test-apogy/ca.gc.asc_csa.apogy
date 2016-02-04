package ca.gc.asc_csa.apogy.addons.sensors.fov.ui;
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

import org.eclipse.swt.graphics.RGB;
import ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode;
import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Of View Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getTransparency <em>Transparency</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getPresentationMode <em>Presentation Mode</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowOutlineOnly <em>Show Outline Only</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowProjection <em>Show Projection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getProjectionColor <em>Projection Color</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation()
 * @model
 * @generated
 */
public interface FieldOfViewPresentation extends NodePresentation {
	/**
	 * Returns the value of the '<em><b>Transparency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transparency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transparency</em>' attribute.
	 * @see #setTransparency(float)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation_Transparency()
	 * @model unique="false"
	 * @generated
	 */
	float getTransparency();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getTransparency <em>Transparency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transparency</em>' attribute.
	 * @see #getTransparency()
	 * @generated
	 */
	void setTransparency(float value);

	/**
	 * Returns the value of the '<em><b>Presentation Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see #setPresentationMode(MeshPresentationMode)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation_PresentationMode()
	 * @model unique="false"
	 * @generated
	 */
	MeshPresentationMode getPresentationMode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getPresentationMode <em>Presentation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Mode</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.MeshPresentationMode
	 * @see #getPresentationMode()
	 * @generated
	 */
	void setPresentationMode(MeshPresentationMode value);

	/**
	 * Returns the value of the '<em><b>Show Outline Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Outline Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Outline Only</em>' attribute.
	 * @see #setShowOutlineOnly(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation_ShowOutlineOnly()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowOutlineOnly();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowOutlineOnly <em>Show Outline Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Outline Only</em>' attribute.
	 * @see #isShowOutlineOnly()
	 * @generated
	 */
	void setShowOutlineOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Projection</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Projection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Projection</em>' attribute.
	 * @see #setShowProjection(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation_ShowProjection()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isShowProjection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#isShowProjection <em>Show Projection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Projection</em>' attribute.
	 * @see #isShowProjection()
	 * @generated
	 */
	void setShowProjection(boolean value);

	/**
	 * Returns the value of the '<em><b>Projection Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Projection Color</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Projection Color</em>' attribute.
	 * @see #setProjectionColor(RGB)
	 * @see ca.gc.asc_csa.apogy.addons.sensors.fov.ui.ApogyAddonsSensorsFOVUIPackage#getFieldOfViewPresentation_ProjectionColor()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.RGB"
	 * @generated
	 */
	RGB getProjectionColor();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.sensors.fov.ui.FieldOfViewPresentation#getProjectionColor <em>Projection Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projection Color</em>' attribute.
	 * @see #getProjectionColor()
	 * @generated
	 */
	void setProjectionColor(RGB value);

} // FieldOfViewPresentation
