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
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Worksites List</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Worksites.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.WorksitesList#getWorksites <em>Worksites</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.WorksitesList#getOrbitsModelsLists <em>Orbits Models Lists</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.WorksitesList#getSurfaceLocationsLists <em>Surface Locations Lists</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getWorksitesList()
 * @model
 * @generated
 */
public interface WorksitesList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Worksites</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.AbstractWorksite}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList <em>Worksites List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Worksites</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksites</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getWorksitesList_Worksites()
	 * @see ca.gc.asc_csa.apogy.core.AbstractWorksite#getWorksitesList
	 * @model opposite="worksitesList" containment="true"
	 * @generated
	 */
	EList<AbstractWorksite> getWorksites();

	/**
	 * Returns the value of the '<em><b>Orbits Models Lists</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.OrbitModelsList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orbits Models Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orbits Models Lists</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getWorksitesList_OrbitsModelsLists()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	EList<OrbitModelsList> getOrbitsModelsLists();

	/**
	 * Returns the value of the '<em><b>Surface Locations Lists</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.SurfaceLocationsList}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surface Locations Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surface Locations Lists</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getWorksitesList_SurfaceLocationsLists()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	EList<SurfaceLocationsList> getSurfaceLocationsLists();

} // WorksitesList
