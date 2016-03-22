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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitFacade;
import ca.gc.asc_csa.apogy.core.environment.orbit.ApogyCoreEnvironmentOrbitPackage;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.util.EList;

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
	public boolean isDateInValidRange(Date fromDate, Date toDate, Date date) 
	{
		return (date.getTime() <= toDate.getTime() && date.getTime() >= fromDate.getTime());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitPackage.APOGY_CORE_ENVIRONMENT_ORBIT_FACADE___IS_DATE_IN_VALID_RANGE__DATE_DATE_DATE:
				return isDateInValidRange((Date)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}
} //ApogyCoreEnvironmentOrbitFacadeImpl
