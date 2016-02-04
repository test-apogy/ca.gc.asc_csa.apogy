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

import org.eclipse.emf.common.util.EList;
import ca.gc.asc_csa.apogy.core.invocator.AbstractToolsListContainer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ground Station Visibility Pass View Configuration List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Visibility Passes
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfigurationList#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfigurationList()
 * @model
 * @generated
 */
public interface GroundStationVisibilityPassViewConfigurationList extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList <em>Configurations List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getGroundStationVisibilityPassViewConfigurationList_Configurations()
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.GroundStationVisibilityPassViewConfiguration#getConfigurationsList
	 * @model opposite="configurationsList" containment="true"
	 * @generated
	 */
	EList<GroundStationVisibilityPassViewConfiguration> getConfigurations();

} // GroundStationVisibilityPassViewConfigurationList
