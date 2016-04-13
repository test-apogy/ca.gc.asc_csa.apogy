/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth;

import ca.gc.asc_csa.apogy.common.emf.Timed;

import ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Eclipse Event.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEvent#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipseEvent()
 * @model
 * @generated
 */
public interface EclipseEvent extends GeographicCoordinates, Timed {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEventType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEventType
	 * @see #setType(EclipseEventType)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipseEvent_Type()
	 * @model unique="false"
	 * @generated
	 */
	EclipseEventType getType();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEvent#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.EclipseEventType
	 * @see #getType()
	 * @generated
	 */
	void setType(EclipseEventType value);

} // EclipseEvent
