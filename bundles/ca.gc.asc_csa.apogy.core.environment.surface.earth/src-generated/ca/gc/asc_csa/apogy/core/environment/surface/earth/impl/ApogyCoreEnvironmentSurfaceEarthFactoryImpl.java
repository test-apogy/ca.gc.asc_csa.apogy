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
package ca.gc.asc_csa.apogy.core.environment.surface.earth.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.earth.*;

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
public class ApogyCoreEnvironmentSurfaceEarthFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentSurfaceEarthFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceEarthFactory init() {
		try {
			ApogyCoreEnvironmentSurfaceEarthFactory theApogyCoreEnvironmentSurfaceEarthFactory = (ApogyCoreEnvironmentSurfaceEarthFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentSurfaceEarthPackage.eNS_URI);
			if (theApogyCoreEnvironmentSurfaceEarthFactory != null) {
				return theApogyCoreEnvironmentSurfaceEarthFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentSurfaceEarthFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthFactoryImpl() {
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
			case ApogyCoreEnvironmentSurfaceEarthPackage.APOGY_CORE_ENVIRONMENT_SURFACE_EARTH_FACADE: return createApogyCoreEnvironmentSurfaceEarthFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthFacade createApogyCoreEnvironmentSurfaceEarthFacade() {
		ApogyCoreEnvironmentSurfaceEarthFacadeImpl apogyCoreEnvironmentSurfaceEarthFacade = new ApogyCoreEnvironmentSurfaceEarthFacadeImpl();
		return apogyCoreEnvironmentSurfaceEarthFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceEarthPackage getApogyCoreEnvironmentSurfaceEarthPackage() {
		return (ApogyCoreEnvironmentSurfaceEarthPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentSurfaceEarthPackage getPackage() {
		return ApogyCoreEnvironmentSurfaceEarthPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentSurfaceEarthFactoryImpl