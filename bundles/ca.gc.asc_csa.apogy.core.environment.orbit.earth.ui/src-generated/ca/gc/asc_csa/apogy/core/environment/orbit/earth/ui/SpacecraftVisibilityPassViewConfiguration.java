package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;
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
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.SpacecraftsVisibilitySet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spacecraft Visibility Pass View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines the configuration for the view that shows the
 * visibility of spacecraft from ground stations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet <em>Visibility Set</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftVisibilityPassViewConfiguration()
 * @model
 * @generated
 */
public interface SpacecraftVisibilityPassViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Configurations List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations List</em>' container reference.
	 * @see #setConfigurationsList(SpacecraftVisibilityPassViewConfigurationList)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftVisibilityPassViewConfiguration_ConfigurationsList()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfigurationList#getConfigurations
	 * @model opposite="configurations" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	SpacecraftVisibilityPassViewConfigurationList getConfigurationsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configurations List</em>' container reference.
	 * @see #getConfigurationsList()
	 * @generated
	 */
	void setConfigurationsList(SpacecraftVisibilityPassViewConfigurationList value);

	/**
	 * Returns the value of the '<em><b>Visibility Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visibility Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Visibility Set</em>' containment reference.
	 * @see #setVisibilitySet(SpacecraftsVisibilitySet)
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getSpacecraftVisibilityPassViewConfiguration_VisibilitySet()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' chilrend='true' property='None'"
	 * @generated
	 */
	SpacecraftsVisibilitySet getVisibilitySet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.SpacecraftVisibilityPassViewConfiguration#getVisibilitySet <em>Visibility Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Visibility Set</em>' containment reference.
	 * @see #getVisibilitySet()
	 * @generated
	 */
	void setVisibilitySet(SpacecraftsVisibilitySet value);

} // SpacecraftVisibilityPassViewConfiguration
