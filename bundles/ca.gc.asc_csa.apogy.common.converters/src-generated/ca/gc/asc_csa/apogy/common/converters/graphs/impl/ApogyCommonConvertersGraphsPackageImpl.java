/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.graphs.impl;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.converters.ChainedConverter;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage;
import org.eclipse.symphony.common.converters.graphs.ConverterEdge;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFacade;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsFactory;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsPackage;
import org.eclipse.symphony.common.converters.impl.Symphony__CommonConvertersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonConvertersGraphsPackageImpl extends EPackageImpl implements Symphony__CommonConvertersGraphsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonConvertersGraphsFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sortedSetEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType setEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType comparatorEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType mapEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType converterEdgeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType chainedConverterEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonConvertersGraphsPackageImpl() {
		super(eNS_URI, Symphony__CommonConvertersGraphsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Symphony__CommonConvertersGraphsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonConvertersGraphsPackage init() {
		if (isInited) return (Symphony__CommonConvertersGraphsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersGraphsPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonConvertersGraphsPackageImpl theSymphony__CommonConvertersGraphsPackage = (Symphony__CommonConvertersGraphsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonConvertersGraphsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonConvertersGraphsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Symphony__CommonConvertersPackageImpl theSymphony__CommonConvertersPackage = (Symphony__CommonConvertersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersPackage.eNS_URI) instanceof Symphony__CommonConvertersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersPackage.eNS_URI) : Symphony__CommonConvertersPackage.eINSTANCE);

		// Create package meta-data objects
		theSymphony__CommonConvertersGraphsPackage.createPackageContents();
		theSymphony__CommonConvertersPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonConvertersGraphsPackage.initializePackageContents();
		theSymphony__CommonConvertersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonConvertersGraphsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonConvertersGraphsPackage.eNS_URI, theSymphony__CommonConvertersGraphsPackage);
		return theSymphony__CommonConvertersGraphsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getConverterEdge() {
		return converterEdgeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getChainedConverter() {
		return chainedConverterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSymphony__CommonConvertersGraphsFacade() {
		return symphony__CommonConvertersGraphsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__CreateGraph__List() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__FindClosestSuperType__List_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__FindClosestSubType__List_Class() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersGraphsFacade__CreateComparator() {
		return symphony__CommonConvertersGraphsFacadeEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSortedSet() {
		return sortedSetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSet() {
		return setEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getComparator() {
		return comparatorEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getMap() {
		return mapEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonConvertersGraphsFactory getSymphony__CommonConvertersGraphsFactory() {
		return (Symphony__CommonConvertersGraphsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		symphony__CommonConvertersGraphsFacadeEClass = createEClass(SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(symphony__CommonConvertersGraphsFacadeEClass, SYMPHONY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR);

		// Create data types
		sortedSetEDataType = createEDataType(SORTED_SET);
		setEDataType = createEDataType(SET);
		comparatorEDataType = createEDataType(COMPARATOR);
		mapEDataType = createEDataType(MAP);
		converterEdgeEDataType = createEDataType(CONVERTER_EDGE);
		chainedConverterEDataType = createEDataType(CHAINED_CONVERTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Symphony__CommonConvertersPackage theSymphony__CommonConvertersPackage = (Symphony__CommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(sortedSetEDataType, "E");
		addETypeParameter(setEDataType, "E");
		addETypeParameter(comparatorEDataType, "E");
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonConvertersGraphsFacadeEClass, Symphony__CommonConvertersGraphsFacade.class, "Symphony__CommonConvertersGraphsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonConvertersGraphsFacade__CreateGraph__List(), null, "createGraph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		EGenericType g2 = createEGenericType(theSymphony__CommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "converters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List(), null, "addConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theSymphony__CommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "converters", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph(), null, "generateTypeCastConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theSymphony__CommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class(), theEcorePackage.getEJavaObject(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class(), null, "findAllConvertersBetweenVertices", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getChainedConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class(), this.getChainedConverter(), "findConverter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph(), null, "getAllInputTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph(), null, "getAllOutputTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSet());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class(), null, "getSourceVertex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "inputType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class(), null, "getDestinationVertex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "outputType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__FindClosestSuperType__List_Class(), null, "findClosestSuperType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "classes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__FindClosestSubType__List_Class(), null, "findClosestSubType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		addEParameter(op, g1, "classes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theEcorePackage.getEJavaClass());
		g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph(), null, "getAllConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theSymphony__CommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph(), null, "getAllNonTypeCastConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g2 = createEGenericType(theSymphony__CommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph(), null, "getAvailableDestinationTypeMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theSymphony__CommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getMap());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theSymphony__CommonConvertersPackage.getList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theEcorePackage.getEJavaClass());
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersGraphsFacade__CreateComparator(), null, "createComparator", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getComparator());
		g2 = createEGenericType(this.getChainedConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(setEDataType, Set.class, "Set", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(comparatorEDataType, Comparator.class, "Comparator", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(converterEdgeEDataType, ConverterEdge.class, "ConverterEdge", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(chainedConverterEDataType, ChainedConverter.class, "ChainedConverter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonConvertersGraphsPackageImpl
