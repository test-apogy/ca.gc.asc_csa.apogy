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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.impl.EarthViewUtilitiesImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Earth View Utilities</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.ui.ApogyCoreEnvironmentOrbitEarthUIPackage#getEarthViewUtilities()
 * @model
 * @generated
 */
public interface EarthViewUtilities extends EObject 
{
	public static EarthViewUtilities INSTANCE = EarthViewUtilitiesImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the identifier associated with a given EarthViewConfiguration.
	 * @param earthViewConfiguration The given EarthViewConfiguration.
	 * @return The identifier, null if none is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" earthViewConfigurationUnique="false"
	 * @generated
	 */
	String getCameraViewConfigurationIdentifier(EarthViewConfiguration earthViewConfiguration);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the EarthViewConfiguration (in the Active Session) with the specified identifier.
	 * @param identifier The EarthViewConfiguration identifier.
	 * @return The EarthViewConfiguration with the specified identifier, null if non is found.
	 * <!-- end-model-doc -->
	 * @model unique="false" identifierUnique="false"
	 * @generated
	 */
	EarthViewConfiguration getActiveEarthViewConfiguration(String identifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Return the EarthViewConfigurationList in the Active Session.
	 * @return The EarthViewConfigurationList in the Active Session, null if none is found.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	EarthViewConfigurationList getActiveEarthViewConfigurationList();

} // EarthViewUtilities
