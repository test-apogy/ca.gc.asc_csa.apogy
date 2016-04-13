package ca.gc.asc_csa.apogy.examples.satellite.apogy;
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

import ca.gc.asc_csa.apogy.core.ApogyInitializationData;
import ca.gc.asc_csa.apogy.examples.satellite.ConstellationState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constellation Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is the specialized data structure which is used to essentially
 * save and later restore the state of the component; this functionality is
 * implemented by the apply() (load) and collect() (save) methods of the constellation's
 * API adapter, which is {@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationApogySystemApiAdapter}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationState <em>Constellation State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage#getConstellationData()
 * @model
 * @generated
 */
public interface ConstellationData extends ApogyInitializationData {

	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constellation State</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constellation State</em>' containment reference.
	 * @see #setConstellationState(ConstellationState)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.apogy.ApogyExamplesSatelliteApogyPackage#getConstellationData_ConstellationState()
	 * @model containment="true"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.apogy.ConstellationData#getConstellationState <em>Constellation State</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation State</em>' containment reference.
	 * @see #getConstellationState()
	 * @generated
	 */
	void setConstellationState(ConstellationState value);
} // ConstellationData
