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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Represents a constellation of Satellites. It provides basic queries used to schedule
 * image acquisition and upload requests and downloads data from the satellites.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState <em>Constellation State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellation extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Constellation State.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' containment reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellation_ConstellationState()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellation#getConstellationState <em>Constellation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' containment reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);

} // AbstractConstellation
