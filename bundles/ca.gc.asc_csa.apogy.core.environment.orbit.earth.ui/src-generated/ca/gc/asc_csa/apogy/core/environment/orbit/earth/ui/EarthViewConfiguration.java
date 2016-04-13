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
import org.eclipse.jface.viewers.ISelection;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth View Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.EarthViewConfiguration#getLayers <em>Layers</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthViewConfiguration()
 * @model
 * @generated
 */
public interface EarthViewConfiguration extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Layers</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.AbstractWorldWindLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * List of Maps being displayed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Layers</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthViewConfiguration_Layers()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true' notify='true' property='None'"
	 * @generated
	 */
	EList<AbstractWorldWindLayer> getLayers();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Method that notifies all AbstractWorldWindLayer of a new selection.
	 * @param selection The new selection made.
	 * <!-- end-model-doc -->
	 * @model selectionDataType="ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ISelection" selectionUnique="false"
	 * @generated
	 */
	void selectionChanged(ISelection selection);

} // EarthViewConfiguration
