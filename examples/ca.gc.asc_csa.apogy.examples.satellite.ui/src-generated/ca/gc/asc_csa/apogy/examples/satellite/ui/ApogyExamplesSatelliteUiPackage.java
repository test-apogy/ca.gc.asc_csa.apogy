package ca.gc.asc_csa.apogy.examples.satellite.ui;
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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyExamplesSatelliteUi' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)' modelName='ApogyExamplesSatelliteUi' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/ca.gc.asc_csa.apogy.examples.satellite.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.examples.satellite.ui.edit/src-generated' basePackage='ca.gc.asc_csa.apogy.examples.satellite'"
 * @generated
 */
public interface ApogyExamplesSatelliteUiPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.examples.satellite.ui";

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
	ApogyExamplesSatelliteUiPackage eINSTANCE = ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiPackageImpl#getApogyExamplesSatelliteUiFacade()
	 * @generated
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Constellation Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Constellation Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE = 0;

	/**
	 * The operation id for the '<em>Get Operation Call Results List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_EXAMPLES_SATELLITE_UI_FACADE_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade
	 * @generated
	 */
	EClass getApogyExamplesSatelliteUiFacade();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getConstellationVariableName <em>Constellation Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constellation Variable Name</em>'.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getConstellationVariableName()
	 * @see #getApogyExamplesSatelliteUiFacade()
	 * @generated
	 */
	EAttribute getApogyExamplesSatelliteUiFacade_ConstellationVariableName();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getConstellationVariable() <em>Get Constellation Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Constellation Variable</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getConstellationVariable()
	 * @generated
	 */
	EOperation getApogyExamplesSatelliteUiFacade__GetConstellationVariable();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getOperationCallResultsList() <em>Get Operation Call Results List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Call Results List</em>' operation.
	 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.ApogyExamplesSatelliteUiFacade#getOperationCallResultsList()
	 * @generated
	 */
	EOperation getApogyExamplesSatelliteUiFacade__GetOperationCallResultsList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyExamplesSatelliteUiFactory getApogyExamplesSatelliteUiFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiFacadeImpl
		 * @see ca.gc.asc_csa.apogy.examples.satellite.ui.impl.ApogyExamplesSatelliteUiPackageImpl#getApogyExamplesSatelliteUiFacade()
		 * @generated
		 */
		EClass APOGY_EXAMPLES_SATELLITE_UI_FACADE = eINSTANCE.getApogyExamplesSatelliteUiFacade();

		/**
		 * The meta object literal for the '<em><b>Constellation Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME = eINSTANCE.getApogyExamplesSatelliteUiFacade_ConstellationVariableName();

		/**
		 * The meta object literal for the '<em><b>Get Constellation Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE = eINSTANCE.getApogyExamplesSatelliteUiFacade__GetConstellationVariable();

		/**
		 * The meta object literal for the '<em><b>Get Operation Call Results List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST = eINSTANCE.getApogyExamplesSatelliteUiFacade__GetOperationCallResultsList();

	}

} //ApogyExamplesSatelliteUiPackage
