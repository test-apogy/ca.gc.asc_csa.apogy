package ca.gc.asc_csa.apogy.examples.satellite.ui.impl;
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

import ca.gc.asc_csa.apogy.examples.satellite.ui.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyExamplesSatelliteUiFactoryImpl extends EFactoryImpl implements ApogyExamplesSatelliteUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyExamplesSatelliteUiFactory init() {
		try {
			ApogyExamplesSatelliteUiFactory theApogyExamplesSatelliteUiFactory = (ApogyExamplesSatelliteUiFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyExamplesSatelliteUiPackage.eNS_URI);
			if (theApogyExamplesSatelliteUiFactory != null) {
				return theApogyExamplesSatelliteUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyExamplesSatelliteUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteUiFactoryImpl() {
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
			case ApogyExamplesSatelliteUiPackage.APOGY_EXAMPLES_SATELLITE_UI_FACADE: return createApogyExamplesSatelliteUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteUiFacade createApogyExamplesSatelliteUiFacade() {
		ApogyExamplesSatelliteUiFacadeImpl apogyExamplesSatelliteUiFacade = new ApogyExamplesSatelliteUiFacadeImpl();
		return apogyExamplesSatelliteUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyExamplesSatelliteUiPackage getApogyExamplesSatelliteUiPackage() {
		return (ApogyExamplesSatelliteUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyExamplesSatelliteUiPackage getPackage() {
		return ApogyExamplesSatelliteUiPackage.eINSTANCE;
	}

} //ApogyExamplesSatelliteUiFactoryImpl
