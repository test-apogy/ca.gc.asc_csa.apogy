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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.environment.orbit.impl.ApogyCoreEnvironmentOrbitFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class providing utilities methods for Orbits.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage#getApogyCoreEnvironmentOrbitFacade()
 * @model
 * @generated
 */
public interface ApogyCoreEnvironmentOrbitFacade extends EObject 
{
	public static ApogyCoreEnvironmentOrbitFacade INSTANCE = ApogyCoreEnvironmentOrbitFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" originalOrbitModelUnique="false"
	 * @generated
	 */
	OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel);

} // ApogyCoreEnvironmentOrbitFacade
