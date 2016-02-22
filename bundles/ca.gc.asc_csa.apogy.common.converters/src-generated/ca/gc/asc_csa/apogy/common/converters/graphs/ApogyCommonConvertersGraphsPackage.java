package ca.gc.asc_csa.apogy.common.converters.graphs;
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
 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCommonConvertersGraphs' childCreationExtenders='true' extensibleProviderFactory='true' operationReflection='true' copyrightText='Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyCommonConvertersGraphs' modelDirectory='/ca.gc.asc_csa.apogy.common.converters/src-generated' basePackage='ca.gc.asc_csa.apogy.common.converters'"
 * @generated
 */
public interface ApogyCommonConvertersGraphsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graphs";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.common.converters.graphs";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "graphs";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonConvertersGraphsPackage eINSTANCE = ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Converter Edge</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getConverterEdge()
	 * @generated
	 */
	int CONVERTER_EDGE = 5;

	/**
	 * The meta object id for the '<em>Chained Converter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.ChainedConverter
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getChainedConverter()
	 * @generated
	 */
	int CHAINED_CONVERTER = 6;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsFacadeImpl
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getApogyCommonConvertersGraphsFacade()
	 * @generated
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST = 0;

	/**
	 * The operation id for the '<em>Add Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST = 1;

	/**
	 * The operation id for the '<em>Generate Type Cast Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 2;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS = 3;

	/**
	 * The operation id for the '<em>Find All Converters Between Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = 4;

	/**
	 * The operation id for the '<em>Find Converter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = 5;

	/**
	 * The operation id for the '<em>Get All Input Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = 6;

	/**
	 * The operation id for the '<em>Get All Output Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = 7;

	/**
	 * The operation id for the '<em>Get Source Vertex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = 8;

	/**
	 * The operation id for the '<em>Get Destination Vertex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = 9;

	/**
	 * The operation id for the '<em>Find Closest Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS = 10;

	/**
	 * The operation id for the '<em>Find Closest Sub Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS = 11;

	/**
	 * The operation id for the '<em>Get All Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 12;

	/**
	 * The operation id for the '<em>Get All Non Type Cast Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 13;

	/**
	 * The operation id for the '<em>Get Available Destination Type Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH = 14;

	/**
	 * The operation id for the '<em>Create Comparator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR = 15;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_COMMON_CONVERTERS_GRAPHS_FACADE_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 1;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getSet()
	 * @generated
	 */
	int SET = 2;

	/**
	 * The meta object id for the '<em>Comparator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Comparator
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 3;


	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 4;


	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge <em>Converter Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Converter Edge</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge"
	 * @generated
	 */
	EDataType getConverterEdge();

	/**
	 * Returns the meta object for data type '{@link ca.gc.asc_csa.apogy.common.converters.ChainedConverter <em>Chained Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Chained Converter</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.ChainedConverter
	 * @model instanceClass="ca.gc.asc_csa.apogy.common.converters.ChainedConverter"
	 * @generated
	 */
	EDataType getChainedConverter();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade
	 * @generated
	 */
	EClass getApogyCommonConvertersGraphsFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#createGraph(java.util.List) <em>Create Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#createGraph(java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__CreateGraph__List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#addConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.util.List) <em>Add Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Converters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#addConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.util.List)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#generateTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Generate Type Cast Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Type Cast Converters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#generateTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#convert(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Object, java.lang.Class) <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#convert(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findAllConvertersBetweenVertices(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class) <em>Find All Converters Between Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find All Converters Between Vertices</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findAllConvertersBetweenVertices(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findConverter(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class) <em>Find Converter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Converter</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findConverter(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllInputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Input Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Input Types</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllInputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllOutputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Output Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Output Types</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllOutputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getSourceVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class) <em>Get Source Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Vertex</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getSourceVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getDestinationVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class) <em>Get Destination Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Destination Vertex</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getDestinationVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findClosestSuperType(java.util.List, java.lang.Class) <em>Find Closest Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Super Type</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findClosestSuperType(java.util.List, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__FindClosestSuperType__List_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findClosestSubType(java.util.List, java.lang.Class) <em>Find Closest Sub Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Sub Type</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#findClosestSubType(java.util.List, java.lang.Class)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__FindClosestSubType__List_Class();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Converters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllNonTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Non Type Cast Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Non Type Cast Converters</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAllNonTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAvailableDestinationTypeMap(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get Available Destination Type Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Destination Type Map</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#getAvailableDestinationTypeMap(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#createComparator() <em>Create Comparator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Comparator</em>' operation.
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade#createComparator()
	 * @generated
	 */
	EOperation getApogyCommonConvertersGraphsFacade__CreateComparator();

	/**
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="E"
	 * @generated
	 */
	EDataType getSortedSet();

	/**
	 * Returns the meta object for data type '{@link java.util.Set <em>Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Set</em>'.
	 * @see java.util.Set
	 * @model instanceClass="java.util.Set" typeParameters="E"
	 * @generated
	 */
	EDataType getSet();

	/**
	 * Returns the meta object for data type '{@link java.util.Comparator <em>Comparator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Comparator</em>'.
	 * @see java.util.Comparator
	 * @model instanceClass="java.util.Comparator" typeParameters="E"
	 * @generated
	 */
	EDataType getComparator();

	/**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
	EDataType getMap();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCommonConvertersGraphsFactory getApogyCommonConvertersGraphsFactory();

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
		 * The meta object literal for the '<em>Converter Edge</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getConverterEdge()
		 * @generated
		 */
		EDataType CONVERTER_EDGE = eINSTANCE.getConverterEdge();

		/**
		 * The meta object literal for the '<em>Chained Converter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.ChainedConverter
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getChainedConverter()
		 * @generated
		 */
		EDataType CHAINED_CONVERTER = eINSTANCE.getChainedConverter();

		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsFacadeImpl
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getApogyCommonConvertersGraphsFacade()
		 * @generated
		 */
		EClass APOGY_COMMON_CONVERTERS_GRAPHS_FACADE = eINSTANCE.getApogyCommonConvertersGraphsFacade();

		/**
		 * The meta object literal for the '<em><b>Create Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST = eINSTANCE.getApogyCommonConvertersGraphsFacade__CreateGraph__List();

		/**
		 * The meta object literal for the '<em><b>Add Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST = eINSTANCE.getApogyCommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List();

		/**
		 * The meta object literal for the '<em><b>Generate Type Cast Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class();

		/**
		 * The meta object literal for the '<em><b>Find All Converters Between Vertices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class();

		/**
		 * The meta object literal for the '<em><b>Find Converter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Input Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get All Output Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get Source Vertex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class();

		/**
		 * The meta object literal for the '<em><b>Get Destination Vertex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class();

		/**
		 * The meta object literal for the '<em><b>Find Closest Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__FindClosestSuperType__List_Class();

		/**
		 * The meta object literal for the '<em><b>Find Closest Sub Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS = eINSTANCE.getApogyCommonConvertersGraphsFacade__FindClosestSubType__List_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get All Non Type Cast Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get Available Destination Type Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getApogyCommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Create Comparator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR = eINSTANCE.getApogyCommonConvertersGraphsFacade__CreateComparator();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Comparator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Comparator
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getComparator()
		 * @generated
		 */
		EDataType COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //ApogyCommonConvertersGraphsPackage
