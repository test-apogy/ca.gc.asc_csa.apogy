package ca.gc.asc_csa.apogy.core.environment.orbit.earth.impl;
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
import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.environment.orbit.AbstractFrame;
import ca.gc.asc_csa.apogy.core.environment.orbit.PVCoordinatesProviderProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftAttitude;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.OreKitBackedAttitudeProvider;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthPackage;
import org.orekit.attitudes.AttitudeProvider;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ore Kit Backed Attitude Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class OreKitBackedAttitudeProviderImpl extends MinimalEObjectImpl.Container implements OreKitBackedAttitudeProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OreKitBackedAttitudeProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreEnvironmentOrbitEarthPackage.Literals.ORE_KIT_BACKED_ATTITUDE_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttitudeProvider getOreKitAttitudeProvider() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpacecraftAttitude getAttitude(PVCoordinatesProviderProvider pvProvider, Date date, AbstractFrame frame) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ORE_KIT_ATTITUDE_PROVIDER:
				return getOreKitAttitudeProvider();
			case ApogyCoreEnvironmentOrbitEarthPackage.ORE_KIT_BACKED_ATTITUDE_PROVIDER___GET_ATTITUDE__PVCOORDINATESPROVIDERPROVIDER_DATE_ABSTRACTFRAME:
				return getAttitude((PVCoordinatesProviderProvider)arguments.get(0), (Date)arguments.get(1), (AbstractFrame)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //OreKitBackedAttitudeProviderImpl
