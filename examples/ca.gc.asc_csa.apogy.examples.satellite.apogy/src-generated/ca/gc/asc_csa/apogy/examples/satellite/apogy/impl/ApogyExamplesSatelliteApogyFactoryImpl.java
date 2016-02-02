package ca.gc.asc_csa.apogy.examples.satellite.apogy.impl;
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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.gc.asc_csa.apogy.examples.satellite.apogy.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatelliteApogyFactoryImpl extends EFactoryImpl implements ApogyExamplesSatelliteApogyFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesSatelliteApogyFactory init() {
		try {
			ApogyExamplesSatelliteApogyFactory theApogyExamplesSatelliteApogyFactory = (ApogyExamplesSatelliteApogyFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesSatelliteApogyPackage.eNS_URI);
			if (theApogyExamplesSatelliteApogyFactory != null) {
				return theApogyExamplesSatelliteApogyFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesSatelliteApogyFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteApogyFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_SYSTEM_API_ADAPTER: return createConstellationSystemApiAdapter();
			case ApogyExamplesSatelliteApogyPackage.CONSTELLATION_DATA: return createConstellationData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationSystemApiAdapter createConstellationSystemApiAdapter() {
		ConstellationSystemApiAdapterImpl constellationSystemApiAdapter = new ConstellationSystemApiAdapterImpl();
		return constellationSystemApiAdapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstellationData createConstellationData() {
		ConstellationDataImpl constellationData = new ConstellationDataImpl();
		return constellationData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteApogyPackage getApogyExamplesSatelliteApogyPackage() {
		return (ApogyExamplesSatelliteApogyPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesSatelliteApogyPackage getPackage() {
		return ApogyExamplesSatelliteApogyPackage.eINSTANCE;
	}

} //ApogyExamplesSatelliteApogyFactoryImpl
