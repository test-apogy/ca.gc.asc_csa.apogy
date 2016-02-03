package ca.gc.asc_csa.apogy.core.environment.orbit.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractOrbitPropagator;
import ca.gc.asc_csa.apogy.core.environment.orbit.Orbit;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.OrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Orbit Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ApogyCoreEnvironmentOrbitFacadeImpl extends MinimalEObjectImpl.Container implements ApogyCoreEnvironmentOrbitFacade 
{
	private static ApogyCoreEnvironmentOrbitFacade instance = null;
	public static ApogyCoreEnvironmentOrbitFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new ApogyCoreEnvironmentOrbitFacadeImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApogyCoreEnvironmentOrbitFacadeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitPackage.Literals.APOGY_CORE_ENVIRONMENT_ORBIT_FACADE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public OrbitModel createOrbitModelCopy(OrbitModel originalOrbitModel) 
	{
		OrbitModel orbitModelCopy = EcoreUtil.copy(originalOrbitModel);
		
		Orbit initialOrbitCopy = null;
		
		// Copies the initial orbit.
		if(originalOrbitModel.getInitialOrbit() != null)
		{
			initialOrbitCopy = EcoreUtil.copy(originalOrbitModel.getInitialOrbit());
		}
		
		// Copies the propagator.
		AbstractOrbitPropagator propagatorCopy = null;
		if(originalOrbitModel.getPropagator() != null)
		{
			propagatorCopy = EcoreUtil.copy(originalOrbitModel.getPropagator());
			propagatorCopy.setInitialOrbit(initialOrbitCopy);			
		}
		
		// Sets the initial orbit and propagator.
		orbitModelCopy.setInitialOrbit(initialOrbitCopy);
		orbitModelCopy.setPropagator(propagatorCopy);
		
		return orbitModelCopy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitPackage.APOGY_CORE_ENVIRONMENT_ORBIT_FACADE___CREATE_ORBIT_MODEL_COPY__ORBITMODEL:
				return createOrbitModelCopy((OrbitModel)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApogyCoreEnvironmentOrbitFacadeImpl
