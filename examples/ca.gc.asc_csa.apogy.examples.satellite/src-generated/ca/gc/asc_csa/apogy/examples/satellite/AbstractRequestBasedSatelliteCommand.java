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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Request Based Satellite Command</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Satellite Command that is linked to a specific {@link AbstractConstellationRequest}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractRequestBasedSatelliteCommand()
 * @model abstract="true"
 * @generated
 */
public interface AbstractRequestBasedSatelliteCommand extends AbstractSatelliteCommand {
	/**
	 * Returns the value of the '<em><b>Constellation Request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link AbstractConstellationRequest} managed by this command.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation Request</em>' reference.
	 * @see #setConstellationRequest(AbstractConstellationRequest)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractRequestBasedSatelliteCommand_ConstellationRequest()
	 * @model
	 * @generated
	 */
	AbstractConstellationRequest getConstellationRequest();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractRequestBasedSatelliteCommand#getConstellationRequest <em>Constellation Request</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constellation Request</em>' reference.
	 * @see #getConstellationRequest()
	 * @generated
	 */
	void setConstellationRequest(AbstractConstellationRequest value);

} // AbstractRequestBasedSatelliteCommand
