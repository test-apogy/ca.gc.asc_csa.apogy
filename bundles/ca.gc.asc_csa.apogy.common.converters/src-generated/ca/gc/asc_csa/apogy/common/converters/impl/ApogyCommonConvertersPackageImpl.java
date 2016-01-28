/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.converters.impl;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import ca.gc.asc_csa.apogy.common.converters.IConverter;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFacade;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersFactory;
import ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage;
import ca.gc.asc_csa.apogy.common.converters.graphs.ApogyCommonConvertersGraphsPackage;
import ca.gc.asc_csa.apogy.common.converters.graphs.impl.ApogyCommonConvertersGraphsPackageImpl;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCommonConvertersPackageImpl extends EPackageImpl implements ApogyCommonConvertersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass apogyCommonConvertersFacadeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType listEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType simpleDirectedWeightedGraphEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType exceptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType iConverterEDataType = null;

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
	 * @see ca.gc.asc_csa.apogy.common.converters.ApogyCommonConvertersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ApogyCommonConvertersPackageImpl() {
		super(eNS_URI, ApogyCommonConvertersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ApogyCommonConvertersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ApogyCommonConvertersPackage init() {
		if (isInited) return (ApogyCommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersPackage.eNS_URI);

		// Obtain or create and register package
		ApogyCommonConvertersPackageImpl theApogyCommonConvertersPackage = (ApogyCommonConvertersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ApogyCommonConvertersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ApogyCommonConvertersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ApogyCommonConvertersGraphsPackageImpl theApogyCommonConvertersGraphsPackage = (ApogyCommonConvertersGraphsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersGraphsPackage.eNS_URI) instanceof ApogyCommonConvertersGraphsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersGraphsPackage.eNS_URI) : ApogyCommonConvertersGraphsPackage.eINSTANCE);

		// Create package meta-data objects
		theApogyCommonConvertersPackage.createPackageContents();
		theApogyCommonConvertersGraphsPackage.createPackageContents();

		// Initialize created meta-data
		theApogyCommonConvertersPackage.initializePackageContents();
		theApogyCommonConvertersGraphsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theApogyCommonConvertersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ApogyCommonConvertersPackage.eNS_URI, theApogyCommonConvertersPackage);
		return theApogyCommonConvertersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getIConverter() {
		return iConverterEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApogyCommonConvertersFacade() {
		return apogyCommonConvertersFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersFacade__Convert__Object_Class() {
		return apogyCommonConvertersFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersFacade__GetAllRegisteredConverters() {
		return apogyCommonConvertersFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApogyCommonConvertersFacade__GetGraph() {
		return apogyCommonConvertersFacadeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getList() {
		return listEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSimpleDirectedWeightedGraph() {
		return simpleDirectedWeightedGraphEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getException() {
		return exceptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCommonConvertersFactory getApogyCommonConvertersFactory() {
		return (ApogyCommonConvertersFactory)getEFactoryInstance();
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
		apogyCommonConvertersFacadeEClass = createEClass(APOGY_COMMON_CONVERTERS_FACADE);
		createEOperation(apogyCommonConvertersFacadeEClass, APOGY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS);
		createEOperation(apogyCommonConvertersFacadeEClass, APOGY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS);
		createEOperation(apogyCommonConvertersFacadeEClass, APOGY_COMMON_CONVERTERS_FACADE___GET_GRAPH);

		// Create data types
		listEDataType = createEDataType(LIST);
		simpleDirectedWeightedGraphEDataType = createEDataType(SIMPLE_DIRECTED_WEIGHTED_GRAPH);
		exceptionEDataType = createEDataType(EXCEPTION);
		iConverterEDataType = createEDataType(ICONVERTER);
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
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		ApogyCommonConvertersGraphsPackage theApogyCommonConvertersGraphsPackage = (ApogyCommonConvertersGraphsPackage)EPackage.Registry.INSTANCE.getEPackage(ApogyCommonConvertersGraphsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "E");
		addETypeParameter(simpleDirectedWeightedGraphEDataType, "V");
		addETypeParameter(simpleDirectedWeightedGraphEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(apogyCommonConvertersFacadeEClass, ApogyCommonConvertersFacade.class, "ApogyCommonConvertersFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getApogyCommonConvertersFacade__Convert__Object_Class(), theEcorePackage.getEJavaObject(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getApogyCommonConvertersFacade__GetAllRegisteredConverters(), null, "getAllRegisteredConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getApogyCommonConvertersFacade__GetGraph(), null, "getGraph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theApogyCommonConvertersGraphsPackage.getConverterEdge());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		// Initialize data types
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(simpleDirectedWeightedGraphEDataType, SimpleDirectedWeightedGraph.class, "SimpleDirectedWeightedGraph", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(exceptionEDataType, Exception.class, "Exception", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(iConverterEDataType, IConverter.class, "IConverter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //ApogyCommonConvertersPackageImpl
