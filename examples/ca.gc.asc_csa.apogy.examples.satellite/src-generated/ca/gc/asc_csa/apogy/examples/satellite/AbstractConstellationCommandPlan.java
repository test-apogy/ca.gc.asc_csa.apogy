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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Constellation Command Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class contains a list of {@link AbstractSatelliteCommand}.
 * The {@link AbstractConstellation#plan} produces {@link ConstellationCommandPlan}.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getCommandPlansList <em>Command Plans List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getConstellationState <em>Constellation State</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getSatelliteCommandsList <em>Satellite Commands List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationCommandPlan()
 * @model abstract="true"
 * @generated
 */
public interface AbstractConstellationCommandPlan extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Command Plans List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getPlans <em>Plans</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers the container of this {@link AbstractConstellationCommandPlan}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Command Plans List</em>' container reference.
	 * @see #setCommandPlansList(ConstellationCommandPlansList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationCommandPlan_CommandPlansList()
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList#getPlans
	 * @model opposite="plans" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ConstellationCommandPlansList getCommandPlansList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getCommandPlansList <em>Command Plans List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command Plans List</em>' container reference.
	 * @see #getCommandPlansList()
	 * @generated
	 */
	void setCommandPlansList(ConstellationCommandPlansList value);

	/**
	 * Returns the value of the '<em><b>Constellation State</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Refers to the {@link ConstellationState} that contains the current plan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Constellation State</em>' reference.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationCommandPlan_ConstellationState()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='false' property='None' get='<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList%> _commandPlansList = this.getCommandPlansList();\nboolean _equals = <%com.google.common.base.Objects%>.equal(_commandPlansList, null);\nif (_equals)\n{\n\treturn null;\n}\nelse\n{\n\t<%ca.gc.asc_csa.apogy.examples.satellite.ConstellationCommandPlansList%> _commandPlansList_1 = this.getCommandPlansList();\n\treturn _commandPlansList_1.getConstellationState();\n}'"
	 * @generated
	 */
	ConstellationState getConstellationState();

	/**
	 * Returns the value of the '<em><b>Satellite Commands List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Container of {@link AbstractSatelliteCommand}.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Satellite Commands List</em>' containment reference.
	 * @see #setSatelliteCommandsList(SatelliteCommandsList)
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ApogyExamplesSatellitePackage#getAbstractConstellationCommandPlan_SatelliteCommandsList()
	 * @model containment="true"
	 * @generated
	 */
	SatelliteCommandsList getSatelliteCommandsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.examples.satellite.AbstractConstellationCommandPlan#getSatelliteCommandsList <em>Satellite Commands List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Satellite Commands List</em>' containment reference.
	 * @see #getSatelliteCommandsList()
	 * @generated
	 */
	void setSatelliteCommandsList(SatelliteCommandsList value);

} // AbstractConstellationCommandPlan
