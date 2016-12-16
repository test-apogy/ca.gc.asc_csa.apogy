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
package ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.earth.ui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreEnvironmentSurfaceEarthUiFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentSurfaceEarthUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceEarthUiFactory init() {
		try {
			ApogyCoreEnvironmentSurfaceEarthUiFactory theApogyCoreEnvironmentSurfaceEarthUiFactory = (ApogyCoreEnvironmentSurfaceEarthUiFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentSurfaceEarthUiPackage.eNS_URI);
			if (theApogyCoreEnvironmentSurfaceEarthUiFactory != null) {
				return theApogyCoreEnvironmentSurfaceEarthUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentSurfaceEarthUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUiFactoryImpl() {
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
			case ApogyCoreEnvironmentSurfaceEarthUiPackage.APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_UI_FACADE: return createApogyCoreEnvironmentSurfaceEarthUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUiFacade createApogyCoreEnvironmentSurfaceEarthUiFacade() {
		ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl apogyCoreEnvironmentSurfaceEarthUiFacade = new ApogyCoreEnvironmentSurfaceEarthUiFacadeImpl();
		return apogyCoreEnvironmentSurfaceEarthUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthUiPackage getApogyCoreEnvironmentSurfaceEarthUiPackage() {
		return (ApogyCoreEnvironmentSurfaceEarthUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentSurfaceEarthUiPackage getPackage() {
		return ApogyCoreEnvironmentSurfaceEarthUiPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentSurfaceEarthUiFactoryImpl
