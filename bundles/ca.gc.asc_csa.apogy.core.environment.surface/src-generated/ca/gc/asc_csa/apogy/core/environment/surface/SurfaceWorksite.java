/**
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
package ca.gc.asc_csa.apogy.core.environment.surface;

import ca.gc.asc_csa.apogy.core.environment.CelestialBody;
import ca.gc.asc_csa.apogy.core.environment.Worksite;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Surface Worksite
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getMapsList <em>Maps List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getCelestialBody <em>Celestial Body</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSurfaceWorksite()
 * @model abstract="true"
 * @generated
 */
public interface SurfaceWorksite extends Worksite {
	/**
	 * Returns the value of the '<em><b>Maps List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maps List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maps List</em>' containment reference.
	 * @see #setMapsList(MapsList)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSurfaceWorksite_MapsList()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	MapsList getMapsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getMapsList <em>Maps List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maps List</em>' containment reference.
	 * @see #getMapsList()
	 * @generated
	 */
	void setMapsList(MapsList value);

	/**
	 * Returns the value of the '<em><b>Celestial Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * The body on which the Surface Worksite is located.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Celestial Body</em>' containment reference.
	 * @see #setCelestialBody(CelestialBody)
	 * @see ca.gc.asc_csa.apogy.core.environment.surface.ApogySurfaceEnvironmentPackage#getSurfaceWorksite_CelestialBody()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	CelestialBody getCelestialBody();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.surface.SurfaceWorksite#getCelestialBody <em>Celestial Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Celestial Body</em>' containment reference.
	 * @see #getCelestialBody()
	 * @generated
	 */
	void setCelestialBody(CelestialBody value);

} // SurfaceWorksite
