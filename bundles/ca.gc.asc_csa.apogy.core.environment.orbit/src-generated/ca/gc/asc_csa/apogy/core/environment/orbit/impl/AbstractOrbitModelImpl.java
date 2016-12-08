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
package ca.gc.asc_csa.apogy.core.environment.orbit.impl;

import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AbstractOrbitModelImpl extends MinimalEObjectImpl.Container implements AbstractOrbitModel {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractOrbitModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitPackage.Literals.ABSTRACT_ORBIT_MODEL;
	}

} //AbstractOrbitModelImpl
