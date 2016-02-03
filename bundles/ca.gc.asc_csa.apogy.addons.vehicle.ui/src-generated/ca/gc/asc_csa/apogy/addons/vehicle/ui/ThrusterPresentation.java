package ca.gc.asc_csa.apogy.addons.vehicle.ui;
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

import ca.gc.asc_csa.apogy.common.topology.ui.NodePresentation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Thruster Presentation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLength <em>Plume Envelope Length</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage#getThrusterPresentation()
 * @model
 * @generated
 */
public interface ThrusterPresentation extends NodePresentation
{

	/**
	 * Returns the value of the '<em><b>Plume Envelope Visible</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plume Envelope Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Whether or not the plume envelope is visible.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plume Envelope Visible</em>' attribute.
	 * @see #setPlumeEnvelopeVisible(boolean)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage#getThrusterPresentation_PlumeEnvelopeVisible()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='false' propertyCategory='PLUME_INFO'"
	 * @generated
	 */
	boolean isPlumeEnvelopeVisible();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#isPlumeEnvelopeVisible <em>Plume Envelope Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plume Envelope Visible</em>' attribute.
	 * @see #isPlumeEnvelopeVisible()
	 * @generated
	 */
	void setPlumeEnvelopeVisible(boolean value);

	/**
	 * Returns the value of the '<em><b>Plume Envelope Length</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The length of the cone used to represent the plume envelope.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plume Envelope Length</em>' attribute.
	 * @see #setPlumeEnvelopeLength(double)
	 * @see ca.gc.asc_csa.apogy.addons.vehicle.ui.ApogyAddonsVehicleUIPackage#getThrusterPresentation_PlumeEnvelopeLength()
	 * @model default="1.0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' child='false' propertyCategory='PLUME_INFO'"
	 * @generated
	 */
	double getPlumeEnvelopeLength();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.addons.vehicle.ui.ThrusterPresentation#getPlumeEnvelopeLength <em>Plume Envelope Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plume Envelope Length</em>' attribute.
	 * @see #getPlumeEnvelopeLength()
	 * @generated
	 */
	void setPlumeEnvelopeLength(double value);
} // ThrusterPresentation
