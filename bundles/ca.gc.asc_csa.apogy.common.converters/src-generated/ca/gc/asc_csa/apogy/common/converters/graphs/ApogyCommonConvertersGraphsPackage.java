/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.graphs;

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
 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='Symphony__CommonConvertersGraphs' childCreationExtenders='true' extensibleProviderFactory='true' operationReflection='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='Symphony__CommonConvertersGraphs' modelDirectory='/org.eclipse.symphony.common.converters/src-generated' basePackage='org.eclipse.symphony.common.converters'"
 * @generated
 */
public interface Symphony__CommonConvertersGraphsPackage extends EPackage {
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
	String eNS_URI = "org.eclipse.symphony.common.converters.graphs";

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
	Symphony__CommonConvertersGraphsPackage eINSTANCE = org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl.init();

	/**
	 * The meta object id for the '<em>Converter Edge</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.converters.graphs.ConverterEdge
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getConverterEdge()
	 * @generated
	 */
	int CONVERTER_EDGE = 5;

	/**
	 * The meta object id for the '<em>Chained Converter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.converters.ChainedConverter
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getChainedConverter()
	 * @generated
	 */
	int CHAINED_CONVERTER = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsFacadeImpl
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSymphony__CommonConvertersGraphsFacade()
	 * @generated
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Graph</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST = 0;

	/**
	 * The operation id for the '<em>Add Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST = 1;

	/**
	 * The operation id for the '<em>Generate Type Cast Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 2;

	/**
	 * The operation id for the '<em>Convert</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS = 3;

	/**
	 * The operation id for the '<em>Find All Converters Between Vertices</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = 4;

	/**
	 * The operation id for the '<em>Find Converter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = 5;

	/**
	 * The operation id for the '<em>Get All Input Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = 6;

	/**
	 * The operation id for the '<em>Get All Output Types</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = 7;

	/**
	 * The operation id for the '<em>Get Source Vertex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = 8;

	/**
	 * The operation id for the '<em>Get Destination Vertex</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = 9;

	/**
	 * The operation id for the '<em>Find Closest Super Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS = 10;

	/**
	 * The operation id for the '<em>Find Closest Sub Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS = 11;

	/**
	 * The operation id for the '<em>Get All Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 12;

	/**
	 * The operation id for the '<em>Get All Non Type Cast Converters</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = 13;

	/**
	 * The operation id for the '<em>Get Available Destination Type Map</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH = 14;

	/**
	 * The operation id for the '<em>Create Comparator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR = 15;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSortedSet()
	 * @generated
	 */
	int SORTED_SET = 1;

	/**
	 * The meta object id for the '<em>Set</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Set
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSet()
	 * @generated
	 */
	int SET = 2;

	/**
	 * The meta object id for the '<em>Comparator</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Comparator
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getComparator()
	 * @generated
	 */
	int COMPARATOR = 3;


	/**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getMap()
	 * @generated
	 */
	int MAP = 4;


	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.converters.graphs.ConverterEdge <em>Converter Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Converter Edge</em>'.
	 * @see org.eclipse.symphony.common.converters.graphs.ConverterEdge
	 * @model instanceClass="org.eclipse.symphony.common.converters.graphs.ConverterEdge"
	 * @generated
	 */
	EDataType getConverterEdge();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.symphony.common.converters.ChainedConverter <em>Chained Converter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Chained Converter</em>'.
	 * @see org.eclipse.symphony.common.converters.ChainedConverter
	 * @model instanceClass="org.eclipse.symphony.common.converters.ChainedConverter"
	 * @generated
	 */
	EDataType getChainedConverter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade
	 * @generated
	 */
	EClass getSymphony__CommonConvertersGraphsFacade();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#createGraph(java.util.List) <em>Create Graph</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#createGraph(java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__CreateGraph__List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#addConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.util.List) <em>Add Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Converters</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#addConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.util.List)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#generateTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Generate Type Cast Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Type Cast Converters</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#generateTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#convert(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Object, java.lang.Class) <em>Convert</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Convert</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#convert(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Object, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findAllConvertersBetweenVertices(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class) <em>Find All Converters Between Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find All Converters Between Vertices</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findAllConvertersBetweenVertices(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findConverter(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class) <em>Find Converter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Converter</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findConverter(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllInputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Input Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Input Types</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllInputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllOutputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Output Types</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Output Types</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllOutputTypes(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getSourceVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class) <em>Get Source Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Source Vertex</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getSourceVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getDestinationVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class) <em>Get Destination Vertex</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Destination Vertex</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getDestinationVertex(org.jgrapht.graph.SimpleDirectedWeightedGraph, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findClosestSuperType(java.util.List, java.lang.Class) <em>Find Closest Super Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Super Type</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findClosestSuperType(java.util.List, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__FindClosestSuperType__List_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findClosestSubType(java.util.List, java.lang.Class) <em>Find Closest Sub Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Closest Sub Type</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#findClosestSubType(java.util.List, java.lang.Class)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__FindClosestSubType__List_Class();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Converters</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllNonTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get All Non Type Cast Converters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Non Type Cast Converters</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAllNonTypeCastConverters(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAvailableDestinationTypeMap(org.jgrapht.graph.SimpleDirectedWeightedGraph) <em>Get Available Destination Type Map</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Destination Type Map</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#getAvailableDestinationTypeMap(org.jgrapht.graph.SimpleDirectedWeightedGraph)
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#createComparator() <em>Create Comparator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Comparator</em>' operation.
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade#createComparator()
	 * @generated
	 */
	EOperation getSymphony__CommonConvertersGraphsFacade__CreateComparator();

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
	Symphony__CommonConvertersGraphsFactory getSymphony__CommonConvertersGraphsFactory();

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
		 * @see org.eclipse.symphony.common.converters.graphs.ConverterEdge
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getConverterEdge()
		 * @generated
		 */
		EDataType CONVERTER_EDGE = eINSTANCE.getConverterEdge();

		/**
		 * The meta object literal for the '<em>Chained Converter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.converters.ChainedConverter
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getChainedConverter()
		 * @generated
		 */
		EDataType CHAINED_CONVERTER = eINSTANCE.getChainedConverter();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsFacadeImpl
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSymphony__CommonConvertersGraphsFacade()
		 * @generated
		 */
		EClass SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE = eINSTANCE.getSymphony__CommonConvertersGraphsFacade();

		/**
		 * The meta object literal for the '<em><b>Create Graph</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__CreateGraph__List();

		/**
		 * The meta object literal for the '<em><b>Add Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List();

		/**
		 * The meta object literal for the '<em><b>Generate Type Cast Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Convert</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class();

		/**
		 * The meta object literal for the '<em><b>Find All Converters Between Vertices</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class();

		/**
		 * The meta object literal for the '<em><b>Find Converter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Input Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get All Output Types</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get Source Vertex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class();

		/**
		 * The meta object literal for the '<em><b>Get Destination Vertex</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class();

		/**
		 * The meta object literal for the '<em><b>Find Closest Super Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__FindClosestSuperType__List_Class();

		/**
		 * The meta object literal for the '<em><b>Find Closest Sub Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__FindClosestSubType__List_Class();

		/**
		 * The meta object literal for the '<em><b>Get All Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get All Non Type Cast Converters</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Get Available Destination Type Map</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph();

		/**
		 * The meta object literal for the '<em><b>Create Comparator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR = eINSTANCE.getSymphony__CommonConvertersGraphsFacade__CreateComparator();

		/**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSortedSet()
		 * @generated
		 */
		EDataType SORTED_SET = eINSTANCE.getSortedSet();

		/**
		 * The meta object literal for the '<em>Set</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Set
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getSet()
		 * @generated
		 */
		EDataType SET = eINSTANCE.getSet();

		/**
		 * The meta object literal for the '<em>Comparator</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Comparator
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getComparator()
		 * @generated
		 */
		EDataType COMPARATOR = eINSTANCE.getComparator();

		/**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl#getMap()
		 * @generated
		 */
		EDataType MAP = eINSTANCE.getMap();

	}

} //Symphony__CommonConvertersGraphsPackage
