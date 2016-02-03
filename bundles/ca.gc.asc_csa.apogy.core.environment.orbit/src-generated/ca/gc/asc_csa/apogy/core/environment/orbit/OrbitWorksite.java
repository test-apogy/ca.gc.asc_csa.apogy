package ca.gc.asc_csa.apogy.core.environment.orbit;
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

import ca.gc.asc_csa.apogy.core.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.Worksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbitWorksite()
 * @model abstract="true"
 * @generated
 */
public interface OrbitWorksite extends Worksite {

	/**
	 * Returns the value of the '<em><b>Active Orbit Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Active Orbit Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The active OrbitModel to use to update the orbit worksite.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Orbit Model</em>' reference.
	 * @see #setActiveOrbitModel(AbstractOrbitModel)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbitWorksite_ActiveOrbitModel()
	 * @model
	 * @generated
	 */
	AbstractOrbitModel getActiveOrbitModel();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.OrbitWorksite#getActiveOrbitModel <em>Active Orbit Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Orbit Model</em>' reference.
	 * @see #getActiveOrbitModel()
	 * @generated
	 */
	void setActiveOrbitModel(AbstractOrbitModel value);
} // OrbitWorksite
