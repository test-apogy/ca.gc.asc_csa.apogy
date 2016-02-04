package ca.gc.asc_csa.apogy.common.converters;
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
import org.eclipse.emf.ecore.EDataType;
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
 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonConverters' childCreationExtenders='true' extensibleProviderFactory='true' operationReflection='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='ApogyCommonConverters' modelDirectory='/ca.gc.asc_csa.apogy.common.converters/src-generated' basePackage='ca.gc.asc_csa.apogy.common'"
 * @generated
 */
public interface ApogyCommonConvertersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "converters";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.converters";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "converters";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonConvertersPackage eINSTANCE = ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl.init();

	/**
	 * The meta object id for the '<em>IConverter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.IConverter
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getIConverter()
	 * @generated
	 */
	int ICONVERTER = 4;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getApogyCommonConvertersFacade()
	 * @generated
	 */
	int APOGY_COMMON_CONVERTERS_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS = 0;

	/**
	 * The operation id for the '<em>Get All Registered Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS = 1;

	/**
	 * The operation id for the '<em>Get Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_FACADE___GET_GRAPH = 2;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_FACADE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getList()
	 * @generated
	 */
	int LIST = 1;

	/**
	 * The meta object id for the '<em>Simple Directed Weighted Graph</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getSimpleDirectedWeightedGraph()
	 * @generated
	 */
	int SIMPLE_DIRECTED_WEIGHTED_GRAPH = 2;

	/**
	 * The meta object id for the '<em>Exception</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Exception
	 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getException()
	 * @generated
	 */
	int EXCEPTION = 3;


	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.converters.IConverter <em>IConverter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IConverter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.IConverter
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.converters.IConverter"
	 * @generated
	 */
	EDataType getIConverter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade
	 * @generated
	 */
	EClass getApogyCommonConvertersFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#convert(java.lang.Object, java.lang.Class) <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#convert(java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersFacade__Convert__Object_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#getAllRegisteredConverters() <em>Get All Registered Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Registered Converters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#getAllRegisteredConverters()
	 * @generated
	 */
	EOperation getApogyCommonConvertersFacade__GetAllRegisteredConverters();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#getGraph() <em>Get Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Graph</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade#getGraph()
	 * @generated
	 */
	EOperation getApogyCommonConvertersFacade__GetGraph();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="E"
	 * @generated
	 */
	EDataType getList();

	/**
	 * Returns the meta object for data type '{@link org.jgrapht.graph.SimpleDirectedWeightedGraph <em>Simple Directed Weighted Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Simple Directed Weighted Graph</em>'.
	 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
	 * @model instanceClass="org.jgrapht.graph.SimpleDirectedWeightedGraph" typeParameters="V E"
	 * @generated
	 */
	EDataType getSimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for data type '{@link java.lang.Exception <em>Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Exception</em>'.
	 * @see java.lang.Exception
	 * @model instanceClass="java.lang.Exception"
	 * @generated
	 */
	EDataType getException();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonConvertersFactory getApogyCommonConvertersFactory();

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
		 * The meta object literal for the '<em>IConverter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.IConverter
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getIConverter()
		 * @generated
		 */
		EDataType ICONVERTER = eINSTANCE.getIConverter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getApogyCommonConvertersFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_CONVERTERS_FACADE = eINSTANCE.getApogyCommonConvertersFacade();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS = eINSTANCE.getApogyCommonConvertersFacade__Convert__Object_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Registered Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS = eINSTANCE.getApogyCommonConvertersFacade__GetAllRegisteredConverters();

		/**
		 * The meta object literal for the '<em><b>Get Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_FACADE___GET_GRAPH = eINSTANCE.getApogyCommonConvertersFacade__GetGraph();

		/**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getList()
		 * @generated
		 */
		EDataType LIST = eINSTANCE.getList();

		/**
		 * The meta object literal for the '<em>Simple Directed Weighted Graph</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.jgrapht.graph.SimpleDirectedWeightedGraph
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getSimpleDirectedWeightedGraph()
		 * @generated
		 */
		EDataType SIMPLE_DIRECTED_WEIGHTED_GRAPH = eINSTANCE.getSimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em>Exception</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Exception
		 * @see ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl#getException()
		 * @generated
		 */
		EDataType EXCEPTION = eINSTANCE.getException();

	}

} //ApogyCommonConvertersPackage
