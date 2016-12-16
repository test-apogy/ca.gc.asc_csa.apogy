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
package ca.gc.asc_csa.apogy.core.environment.surface.ui.impl;

import ca.gc.asc_csa.apogy.core.environment.surface.ui.*;

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
public class ApogyCoreEnvironmentSurfaceUiFactoryImpl extends EFactoryImpl implements ApogyCoreEnvironmentSurfaceUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreEnvironmentSurfaceUiFactory init() {
		try {
			ApogyCoreEnvironmentSurfaceUiFactory theApogyCoreEnvironmentSurfaceUiFactory = (ApogyCoreEnvironmentSurfaceUiFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreEnvironmentSurfaceUiPackage.eNS_URI);
			if (theApogyCoreEnvironmentSurfaceUiFactory != null) {
				return theApogyCoreEnvironmentSurfaceUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreEnvironmentSurfaceUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceUiFactoryImpl() {
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
			case ApogyCoreEnvironmentSurfaceUiPackage.APOGY_CORE_ENVIRONMENT_SURFACE_UI_FACADE: return createApogyCoreEnvironmentSurfaceUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceUiFacade createApogyCoreEnvironmentSurfaceUiFacade() {
		ApogyCoreEnvironmentSurfaceUiFacadeImpl apogyCoreEnvironmentSurfaceUiFacade = new ApogyCoreEnvironmentSurfaceUiFacadeImpl();
		return apogyCoreEnvironmentSurfaceUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreEnvironmentSurfaceUiPackage getApogyCoreEnvironmentSurfaceUiPackage() {
		return (ApogyCoreEnvironmentSurfaceUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreEnvironmentSurfaceUiPackage getPackage() {
		return ApogyCoreEnvironmentSurfaceUiPackage.eINSTANCE;
	}

} //ApogyCoreEnvironmentSurfaceUiFactoryImpl
