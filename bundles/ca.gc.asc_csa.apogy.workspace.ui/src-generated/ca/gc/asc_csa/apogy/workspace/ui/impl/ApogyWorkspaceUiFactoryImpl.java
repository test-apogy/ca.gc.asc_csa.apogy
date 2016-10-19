/**
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
package ca.gc.asc_csa.apogy.workspace.ui.impl;

import ca.gc.asc_csa.apogy.workspace.ui.*;

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
public class ApogyWorkspaceUiFactoryImpl extends EFactoryImpl implements ApogyWorkspaceUiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyWorkspaceUiFactory init() {
		try {
			ApogyWorkspaceUiFactory theApogyWorkspaceUiFactory = (ApogyWorkspaceUiFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyWorkspaceUiPackage.eNS_URI);
			if (theApogyWorkspaceUiFactory != null) {
				return theApogyWorkspaceUiFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyWorkspaceUiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceUiFactoryImpl() {
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
			case ApogyWorkspaceUiPackage.APOGY_WORKSPACE_UI_FACADE: return createApogyWorkspaceUiFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceUiFacade createApogyWorkspaceUiFacade() {
		ApogyWorkspaceUiFacadeImpl apogyWorkspaceUiFacade = new ApogyWorkspaceUiFacadeImpl();
		return apogyWorkspaceUiFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyWorkspaceUiPackage getApogyWorkspaceUiPackage() {
		return (ApogyWorkspaceUiPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyWorkspaceUiPackage getPackage() {
		return ApogyWorkspaceUiPackage.eINSTANCE;
	}

} //ApogyWorkspaceUiFactoryImpl
