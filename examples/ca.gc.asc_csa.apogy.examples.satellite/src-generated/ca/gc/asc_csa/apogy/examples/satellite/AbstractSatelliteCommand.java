package ca.gc.asc_csa.apogy.examples.satellite;
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

import ca.gc.asc_csa.apogy.common.emf.Timed;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Satellite Command.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getUid <em>Uid</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite <em>Satellite</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand()
 * @model abstract="true"
 * @generated
 */
public interface AbstractSatelliteCommand extends Timed {
	/**
	 * Returns the value of the '<em><b>Uid</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Request Unique Identifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Uid</em>' containment reference.
	 * @see #setUid(AbstractUID)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand_Uid()
	 * @model containment="true"
	 * @generated
	 */
	AbstractUID getUid();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getUid <em>Uid</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' containment reference.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(AbstractUID value);

	/**
	 * Returns the value of the '<em><b>Satellite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the {@link Satellite} associated with the {@link AbstractSatelliteCommand}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite</em>' reference.
	 * @see #setSatellite(Satellite)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractSatelliteCommand_Satellite()
	 * @model
	 * @generated
	 */
	Satellite getSatellite();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractSatelliteCommand#getSatellite <em>Satellite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite</em>' reference.
	 * @see #getSatellite()
	 * @generated
	 */
	void setSatellite(Satellite value);

} // AbstractSatelliteCommand
