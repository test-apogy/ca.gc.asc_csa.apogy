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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;
import ca.gc.asc_csa.apogy.common.emf.Timed;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an Orbit. An orbit defines the orbital parameter at a given point in time (orbital parameters can change with time.)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbit()
 * @model abstract="true"
 * @generated
 */
public interface Orbit extends Named, Described, Timed {

	/**
	 * Returns the value of the '<em><b>Reference Frame</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The inertial frame used to represent this orbit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference Frame</em>' containment reference.
	 * @see #setReferenceFrame(AbstractFrame)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getOrbit_ReferenceFrame()
	 * @model containment="true"
	 * @generated
	 */
	AbstractFrame getReferenceFrame();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.Orbit#getReferenceFrame <em>Reference Frame</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference Frame</em>' containment reference.
	 * @see #getReferenceFrame()
	 * @generated
	 */
	void setReferenceFrame(AbstractFrame value);
} // Orbit
