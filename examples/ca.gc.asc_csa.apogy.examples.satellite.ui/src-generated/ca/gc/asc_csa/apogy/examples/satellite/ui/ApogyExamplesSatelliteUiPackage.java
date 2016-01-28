/**
 * Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)
 */
package org.eclipse.symphony.examples.satellite.ui;

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
 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__ExamplesSatelliteUi' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2015-2016 Copyrights (c)' modelName='Symphony__ExamplesSatelliteUi' childCreationExtenders='true' extensibleProviderFactory='true' suppressGenModelAnnotations='false' modelDirectory='/org.eclipse.symphony.examples.satellite.ui/src-generated' editDirectory='/org.eclipse.symphony.examples.satellite.ui.edit/src-generated' basePackage='org.eclipse.symphony.examples.satellite'"
 * @generated
 */
public interface Symphony__ExamplesSatelliteUiPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.examples.satellite.ui";

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
	Symphony__ExamplesSatelliteUiPackage eINSTANCE = org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl
	 * @see org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiPackageImpl#getSymphony__ExamplesSatelliteUiFacade()
	 * @generated
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Constellation Variable Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Constellation Variable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE = 0;

	/**
	 * The operation id for the '<em>Get Operation Call Results List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade
	 * @generated
	 */
	EClass getSymphony__ExamplesSatelliteUiFacade();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getConstellationVariableName <em>Constellation Variable Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constellation Variable Name</em>'.
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getConstellationVariableName()
	 * @see #getSymphony__ExamplesSatelliteUiFacade()
	 * @generated
	 */
	EAttribute getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getConstellationVariable() <em>Get Constellation Variable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Constellation Variable</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getConstellationVariable()
	 * @generated
	 */
	EOperation getSymphony__ExamplesSatelliteUiFacade__GetConstellationVariable();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getOperationCallResultsList() <em>Get Operation Call Results List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Operation Call Results List</em>' operation.
	 * @see org.eclipse.symphony.examples.satellite.ui.Symphony__ExamplesSatelliteUiFacade#getOperationCallResultsList()
	 * @generated
	 */
	EOperation getSymphony__ExamplesSatelliteUiFacade__GetOperationCallResultsList();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Symphony__ExamplesSatelliteUiFactory getSymphony__ExamplesSatelliteUiFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiFacadeImpl
		 * @see org.eclipse.symphony.examples.satellite.ui.impl.Symphony__ExamplesSatelliteUiPackageImpl#getSymphony__ExamplesSatelliteUiFacade()
		 * @generated
		 */
		EClass SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE = eINSTANCE.getSymphony__ExamplesSatelliteUiFacade();

		/**
		 * The meta object literal for the '<em><b>Constellation Variable Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE__CONSTELLATION_VARIABLE_NAME = eINSTANCE.getSymphony__ExamplesSatelliteUiFacade_ConstellationVariableName();

		/**
		 * The meta object literal for the '<em><b>Get Constellation Variable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_CONSTELLATION_VARIABLE = eINSTANCE.getSymphony__ExamplesSatelliteUiFacade__GetConstellationVariable();

		/**
		 * The meta object literal for the '<em><b>Get Operation Call Results List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_EXAMPLES_SATELLITE_UI_FACADE___GET_OPERATION_CALL_RESULTS_LIST = eINSTANCE.getSymphony__ExamplesSatelliteUiFacade__GetOperationCallResultsList();

	}

} //Symphony__ExamplesSatelliteUiPackage
