package ca.gc.asc_csa.apogy.core;
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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Models List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Orbits classes
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.OrbitModelsList#getOrbitModels <em>Orbit Models</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getOrbitModelsList()
 * @model
 * @generated
 */
public interface OrbitModelsList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Orbit Models</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList <em>Orbit Models List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbit Models</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbit Models</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getOrbitModelsList_OrbitModels()
	 * @see ca.gc.asc_csa.apogy.core.AbstractOrbitModel#getOrbitModelsList
	 * @model opposite="orbitModelsList" containment="true"
	 * @generated
	 */
	EList<AbstractOrbitModel> getOrbitModels();

} // OrbitModelsList