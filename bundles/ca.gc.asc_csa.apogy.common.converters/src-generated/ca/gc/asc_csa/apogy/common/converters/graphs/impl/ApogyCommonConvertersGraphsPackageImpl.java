/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.graphs.impl;

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
import ca.gc.asc_csa.apogy.common.converters.ChainedConverter;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage;
import ca.gc.asc_csa.apogy.common.converters.graphs.ConverterEdge;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFacade;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsFactory;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsPackage;
import ca.gc.asc_csa.apogy.common.converters.impl.ApogyCommonConvertersPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonConvertersGraphsPackageImpl extends EPackageImpl implements ApogyCommonConvertersGraphsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogy__CommonConvertersGraphsFacadeEClass = null;

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
	 * @see ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonConvertersGraphsPackageImpl() {
		super(eNS_URI, ApogyCommonConvertersGraphsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonConvertersGraphsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonConvertersGraphsPackage init() {
		if (isInited) return (ApogyCommonConvertersGraphsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersGraphsPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonConvertersGraphsPackageImpl theApogyCommonConvertersGraphsPackage = (ApogyCommonConvertersGraphsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonConvertersGraphsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonConvertersGraphsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ApogyCommonConvertersPackageImpl theApogyCommonConvertersPackage = (ApogyCommonConvertersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersPackage.eNS_URI) instanceof ApogyCommonConvertersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersPackage.eNS_URI) : ApogyCommonConvertersPackage.eINSTANCE);

		// Create package meta-data objects
		theApogyCommonConvertersGraphsPackage.createPackageContents();
		theApogyCommonConvertersPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonConvertersGraphsPackage.initializePackageContents();
		theApogyCommonConvertersPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonConvertersGraphsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonConvertersGraphsPackage.eNS_URI, theApogyCommonConvertersGraphsPackage);
		return theApogyCommonConvertersGraphsPackage;
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
	public EClass getApogyCommonConvertersGraphsFacade() {
		return apogy__CommonConvertersGraphsFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__CreateGraph__List() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__FindClosestSuperType__List_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__FindClosestSubType__List_Class() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersGraphsFacade__CreateComparator() {
		return apogy__CommonConvertersGraphsFacadeEClass.getEOperations().get(15);
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
	public ApogyCommonConvertersGraphsFactory getApogyCommonConvertersGraphsFactory() {
		return (ApogyCommonConvertersGraphsFactory)getEFactoryInstance();
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
		apogy__CommonConvertersGraphsFacadeEClass = createEClass(APOGY_COMMON_CONVERTERS_GRAPHS_FACADE);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_GRAPH__LIST);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___ADD_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH_LIST);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GENERATE_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CONVERT__SIMPLEDIRECTEDWEIGHTEDGRAPH_OBJECT_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_ALL_CONVERTERS_BETWEEN_VERTICES__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CONVERTER__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_INPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_OUTPUT_TYPES__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_SOURCE_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_DESTINATION_VERTEX__SIMPLEDIRECTEDWEIGHTEDGRAPH_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUPER_TYPE__LIST_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___FIND_CLOSEST_SUB_TYPE__LIST_CLASS);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_ALL_NON_TYPE_CAST_CONVERTERS__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___GET_AVAILABLE_DESTINATION_TYPE_MAP__SIMPLEDIRECTEDWEIGHTEDGRAPH);
		createEOperation(apogy__CommonConvertersGraphsFacadeEClass, APOGY_COMMON_CONVERTERS_GRAPHS_FACADE___CREATE_COMPARATOR);

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
		ApogyCommonConvertersPackage theApogyCommonConvertersPackage = (ApogyCommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersPackage.eNS_URI);
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
		initEClass(apogy__CommonConvertersGraphsFacadeEClass, ApogyCommonConvertersGraphsFacade.class, "ApogyCommonConvertersGraphsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonConvertersGraphsFacade__CreateGraph__List(), null, "createGraph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		EGenericType g2 = createEGenericType(theApogyCommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "converters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__AddConverters__SimpleDirectedWeightedGraph_List(), null, "addConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theApogyCommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "converters", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GenerateTypeCastConverters__SimpleDirectedWeightedGraph(), null, "generateTypeCastConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theApogyCommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__Convert__SimpleDirectedWeightedGraph_Object_Class(), theEcorePackage.getEJavaObject(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__FindAllConvertersBetweenVertices__SimpleDirectedWeightedGraph_Class_Class(), null, "findAllConvertersBetweenVertices", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__FindConverter__SimpleDirectedWeightedGraph_Class_Class(), this.getChainedConverter(), "findConverter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetAllInputTypes__SimpleDirectedWeightedGraph(), null, "getAllInputTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetAllOutputTypes__SimpleDirectedWeightedGraph(), null, "getAllOutputTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetSourceVertex__SimpleDirectedWeightedGraph_Class(), null, "getSourceVertex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetDestinationVertex__SimpleDirectedWeightedGraph_Class(), null, "getDestinationVertex", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__FindClosestSuperType__List_Class(), null, "findClosestSuperType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__FindClosestSubType__List_Class(), null, "findClosestSubType", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
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

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetAllConverters__SimpleDirectedWeightedGraph(), null, "getAllConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theApogyCommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetAllNonTypeCastConverters__SimpleDirectedWeightedGraph(), null, "getAllNonTypeCastConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(this.getConverterEdge());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "graph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g2 = createEGenericType(theApogyCommonConvertersPackage.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__GetAvailableDestinationTypeMap__SimpleDirectedWeightedGraph(), null, "getAvailableDestinationTypeMap", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(theApogyCommonConvertersPackage.getSimpleDirectedWeightedGraph());
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
		g2 = createEGenericType(theApogyCommonConvertersPackage.getList());
		g1.getETypeArguments().add(g2);
		g3 = createEGenericType(theEcorePackage.getEJavaClass());
		g2.getETypeArguments().add(g3);
		EGenericType g4 = createEGenericType();
		g3.getETypeArguments().add(g4);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersGraphsFacade__CreateComparator(), null, "createComparator", 0, 1, !IS_UNIQUE, IS_ORDERED);
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

} //ApogyCommonConvertersGraphsPackageImpl
