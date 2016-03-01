/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 * Canadian Space Agency (CSA) - Initial API and implementation
 * -Pierre Allard (Pierre.Allard@canada.ca),
 * -Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 * -Sebastien Gemme (Sebastien.Gemme@canada.ca)
 */
package ca.gc.asc_csa.apogy.examples.satellite;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Visibility Pass Based Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand#getVisibilityPass <em>Visibility Pass</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getVisibilityPassBasedSatelliteCommand()
 * @model
 * @generated
 */
public interface VisibilityPassBasedSatelliteCommand extends AbstractRequestBasedSatelliteCommand {
	/**
	 * Returns the value of the '<em><b>Visibility Pass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the {@link VisibilityPass} associated to the command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Visibility Pass</em>' containment reference.
	 * @see #setVisibilityPass(VisibilityPass)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getVisibilityPassBasedSatelliteCommand_VisibilityPass()
	 * @model containment="true"
	 * @generated
	 */
	VisibilityPass getVisibilityPass();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.VisibilityPassBasedSatelliteCommand#getVisibilityPass <em>Visibility Pass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Pass</em>' containment reference.
	 * @see #getVisibilityPass()
	 * @generated
	 */
	void setVisibilityPass(VisibilityPass value);

} // VisibilityPassBasedSatelliteCommand
