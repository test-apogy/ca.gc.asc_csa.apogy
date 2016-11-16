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
package ca.gc.asc_csa.apogy.core.programs.controllers.ui;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 *     Olivier L. Larouche (Olivier.LLarouche@canad.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ApogyCoreProgramsControllersUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreProgramsControllersUI' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n \n Contributors:\n     Pierre Allard (Pierre.Allard@canada.ca), \n     Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n     Sebastien Gemme (Sebastien.Gemme@canada.ca),\n     Olivier L. Larouche (Olivier.LLarouche@canada.ca),\n     Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' modelName='ApogyCoreProgramsControllersUI' modelDirectory='/ca.gc.asc_csa.apogy.core.programs.controllers.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.programs.controllers.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.core.programs.controllers'"
 * @generated
 */
public interface ApogyCoreProgramsControllersUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.programs.controllers.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreProgramsControllersUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ApogyCoreProgramsControllersUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerConfigsPartSelectionImpl <em>Controller Configs Part Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerConfigsPartSelectionImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ApogyCoreProgramsControllersUIPackageImpl#getControllerConfigsPartSelection()
	 * @generated
	 */
	int CONTROLLER_CONFIGS_PART_SELECTION = 0;

	/**
	 * The feature id for the '<em><b>Controllers Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION = 0;

	/**
	 * The number of structural features of the '<em>Controller Configs Part Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGS_PART_SELECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller Configs Part Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_CONFIGS_PART_SELECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerBindingsPartSelectionImpl <em>Controller Bindings Part Selection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerBindingsPartSelectionImpl
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ApogyCoreProgramsControllersUIPackageImpl#getControllerBindingsPartSelection()
	 * @generated
	 */
	int CONTROLLER_BINDINGS_PART_SELECTION = 1;

	/**
	 * The feature id for the '<em><b>Operation Call Controller Binding</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING = 0;

	/**
	 * The number of structural features of the '<em>Controller Bindings Part Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BINDINGS_PART_SELECTION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Controller Bindings Part Selection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTROLLER_BINDINGS_PART_SELECTION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection <em>Controller Configs Part Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Configs Part Selection</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection
	 * @generated
	 */
	EClass getControllerConfigsPartSelection();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection#getControllersConfiguration <em>Controllers Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Controllers Configuration</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerConfigsPartSelection#getControllersConfiguration()
	 * @see #getControllerConfigsPartSelection()
	 * @generated
	 */
	EReference getControllerConfigsPartSelection_ControllersConfiguration();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection <em>Controller Bindings Part Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Controller Bindings Part Selection</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection
	 * @generated
	 */
	EClass getControllerBindingsPartSelection();

	/**
	 * Returns the meta object for the reference '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection#getOperationCallControllerBinding <em>Operation Call Controller Binding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Operation Call Controller Binding</em>'.
	 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.ControllerBindingsPartSelection#getOperationCallControllerBinding()
	 * @see #getControllerBindingsPartSelection()
	 * @generated
	 */
	EReference getControllerBindingsPartSelection_OperationCallControllerBinding();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreProgramsControllersUIFactory getApogyCoreProgramsControllersUIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerConfigsPartSelectionImpl <em>Controller Configs Part Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerConfigsPartSelectionImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ApogyCoreProgramsControllersUIPackageImpl#getControllerConfigsPartSelection()
		 * @generated
		 */
		EClass CONTROLLER_CONFIGS_PART_SELECTION = eINSTANCE.getControllerConfigsPartSelection();

		/**
		 * The meta object literal for the '<em><b>Controllers Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_CONFIGS_PART_SELECTION__CONTROLLERS_CONFIGURATION = eINSTANCE.getControllerConfigsPartSelection_ControllersConfiguration();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerBindingsPartSelectionImpl <em>Controller Bindings Part Selection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ControllerBindingsPartSelectionImpl
		 * @see ca.gc.asc_csa.apogy.core.programs.controllers.ui.impl.ApogyCoreProgramsControllersUIPackageImpl#getControllerBindingsPartSelection()
		 * @generated
		 */
		EClass CONTROLLER_BINDINGS_PART_SELECTION = eINSTANCE.getControllerBindingsPartSelection();

		/**
		 * The meta object literal for the '<em><b>Operation Call Controller Binding</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTROLLER_BINDINGS_PART_SELECTION__OPERATION_CALL_CONTROLLER_BINDING = eINSTANCE.getControllerBindingsPartSelection_OperationCallControllerBinding();

	}

} //ApogyCoreProgramsControllersUIPackage
