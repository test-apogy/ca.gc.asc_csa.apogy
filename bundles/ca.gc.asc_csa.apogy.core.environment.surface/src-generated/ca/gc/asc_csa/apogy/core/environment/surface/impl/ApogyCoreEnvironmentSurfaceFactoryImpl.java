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
package ca.gc.asc_csa.apogy.core.environment.surface.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.*;

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
public class ApogyCoreEnvironmentSurfaceFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentSurfaceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceFactory init() {
		try {
			ApogyCoreEnvironmentSurfaceFactory theApogyCoreEnvironmentSurfaceFactory = (ApogyCoreEnvironmentSurfaceFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentSurfacePackage.eNS_URI);
			if (theApogyCoreEnvironmentSurfaceFactory != null) {
				return theApogyCoreEnvironmentSurfaceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentSurfaceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceFactoryImpl() {
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
			case ApogyCoreEnvironmentSurfacePackage.APOGY_CORE_ENVIRONMENT_SURFACE_FACADE: return createApogyCoreEnvironmentSurfaceFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceFacade createApogyCoreEnvironmentSurfaceFacade() {
		ApogyCoreEnvironmentSurfaceFacadeImpl apogyCoreEnvironmentSurfaceFacade = new ApogyCoreEnvironmentSurfaceFacadeImpl();
		return apogyCoreEnvironmentSurfaceFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfacePackage getApogyCoreEnvironmentSurfacePackage() {
		return (ApogyCoreEnvironmentSurfacePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentSurfacePackage getPackage() {
		return ApogyCoreEnvironmentSurfacePackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentSurfaceFactoryImpl
