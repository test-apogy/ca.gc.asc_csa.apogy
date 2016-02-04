package ca.gc.asc_csa.apogy.core.environment.orbit;
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

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This interface represents an attitude provider.
 * An attitude provider provides a way to compute an Attitude from an date and position-velocity local provider.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getAttitudeProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface AttitudeProvider extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" pvProviderUnique="false" dateUnique="false" frameUnique="false"
	 * @generated
	 */
	SpacecraftAttitude getAttitude(PVCoordinatesProviderProvider pvProvider, Date date, AbstractFrame frame);

} // AttitudeProvider
