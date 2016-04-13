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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Eclipse</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an Eclipse for spacecrafts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getPenumbraEntry <em>Penumbra Entry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getUmbraEntry <em>Umbra Entry</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getUmbraExit <em>Umbra Exit</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getPenumbraExit <em>Penumbra Exit</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipse()
 * @model
 * @generated
 */
public interface Eclipse extends EObject {
	/**
	 * Returns the value of the '<em><b>Penumbra Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entry in Penumbra.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penumbra Entry</em>' containment reference.
	 * @see #setPenumbraEntry(EclipseEvent)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipse_PenumbraEntry()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
	EclipseEvent getPenumbraEntry();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getPenumbraEntry <em>Penumbra Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penumbra Entry</em>' containment reference.
	 * @see #getPenumbraEntry()
	 * @generated
	 */
	void setPenumbraEntry(EclipseEvent value);

	/**
	 * Returns the value of the '<em><b>Umbra Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entry in Umbra, can be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbra Entry</em>' containment reference.
	 * @see #setUmbraEntry(EclipseEvent)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipse_UmbraEntry()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
	EclipseEvent getUmbraEntry();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getUmbraEntry <em>Umbra Entry</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umbra Entry</em>' containment reference.
	 * @see #getUmbraEntry()
	 * @generated
	 */
	void setUmbraEntry(EclipseEvent value);

	/**
	 * Returns the value of the '<em><b>Umbra Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exit from Umbra, can be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Umbra Exit</em>' containment reference.
	 * @see #setUmbraExit(EclipseEvent)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipse_UmbraExit()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
	EclipseEvent getUmbraExit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getUmbraExit <em>Umbra Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Umbra Exit</em>' containment reference.
	 * @see #getUmbraExit()
	 * @generated
	 */
	void setUmbraExit(EclipseEvent value);

	/**
	 * Returns the value of the '<em><b>Penumbra Exit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Exit from Penumbra, can be null.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Penumbra Exit</em>' containment reference.
	 * @see #setPenumbraExit(EclipseEvent)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage#getEclipse_PenumbraExit()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='None'"
	 * @generated
	 */
	EclipseEvent getPenumbraExit();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse#getPenumbraExit <em>Penumbra Exit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Penumbra Exit</em>' containment reference.
	 * @see #getPenumbraExit()
	 * @generated
	 */
	void setPenumbraExit(EclipseEvent value);

} // Eclipse
