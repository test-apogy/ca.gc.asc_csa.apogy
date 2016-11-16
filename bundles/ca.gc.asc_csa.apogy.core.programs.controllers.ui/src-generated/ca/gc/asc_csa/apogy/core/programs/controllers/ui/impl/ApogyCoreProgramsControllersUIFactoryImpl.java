/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl;

import ca.gc.asc_csa.apogy.core.programs.controllers.ui.*;

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
public class ApogyCoreProgramsControllersUIFactoryImpl extends EFactoryImpl implements ApogyCoreProgramsControllersUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreProgramsControllersUIFactory init() {
		try {
			ApogyCoreProgramsControllersUIFactory theApogyCoreProgramsControllersUIFactory = (ApogyCoreProgramsControllersUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreProgramsControllersUIPackage.eNS_URI);
			if (theApogyCoreProgramsControllersUIFactory != null) {
				return theApogyCoreProgramsControllersUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreProgramsControllersUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersUIFactoryImpl() {
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
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_CONFIGS_PART_SELECTION: return createControllerConfigsPartSelection();
			case ApogyCoreProgramsControllersUIPackage.CONTROLLER_BINDINGS_PART_SELECTION: return createControllerBindingsPartSelection();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerConfigsPartSelection createControllerConfigsPartSelection() {
		ControllerConfigsPartSelectionImpl controllerConfigsPartSelection = new ControllerConfigsPartSelectionImpl();
		return controllerConfigsPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControllerBindingsPartSelection createControllerBindingsPartSelection() {
		ControllerBindingsPartSelectionImpl controllerBindingsPartSelection = new ControllerBindingsPartSelectionImpl();
		return controllerBindingsPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreProgramsControllersUIPackage getApogyCoreProgramsControllersUIPackage() {
		return (ApogyCoreProgramsControllersUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreProgramsControllersUIPackage getPackage() {
		return ApogyCoreProgramsControllersUIPackage.eINSTANCE;
	}

} //ApogyCoreProgramsControllersUIFactoryImpl
