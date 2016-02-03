package ca.gc.asc_csa.apogy.core.environment.orbit.earth;
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

import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ore Kit Backed Spacecraft State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A SpacecraftState that is backed by an OreKit SpacecraftState.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getOreKitBackedSpacecraftState()
 * @model
 * @generated
 */
public interface OreKitBackedSpacecraftState extends SpacecraftState {
	/**
	 * Returns the value of the '<em><b>Ore Kit Spacecraft State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ore Kit Spacecraft State</em>' attribute.
	 * @see #setOreKitSpacecraftState(org.orekit.propagation.SpacecraftState)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getOreKitBackedSpacecraftState_OreKitSpacecraftState()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitSpacecraftState" transient="true"
	 * @generated
	 */
	org.orekit.propagation.SpacecraftState getOreKitSpacecraftState();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedSpacecraftState#getOreKitSpacecraftState <em>Ore Kit Spacecraft State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ore Kit Spacecraft State</em>' attribute.
	 * @see #getOreKitSpacecraftState()
	 * @generated
	 */
	void setOreKitSpacecraftState(org.orekit.propagation.SpacecraftState value);

} // OreKitBackedSpacecraftState
