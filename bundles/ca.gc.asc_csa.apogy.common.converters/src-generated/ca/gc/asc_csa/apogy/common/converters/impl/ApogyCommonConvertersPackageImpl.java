/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.converters.impl;

import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.symphony.common.converters.IConverter;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFacade;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersFactory;
import org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage;
import org.eclipse.symphony.common.converters.graphs.Symphony__CommonConvertersGraphsPackage;
import org.eclipse.symphony.common.converters.graphs.impl.Symphony__CommonConvertersGraphsPackageImpl;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonConvertersPackageImpl extends EPackageImpl implements Symphony__CommonConvertersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass symphony__CommonConvertersFacadeEClass = null;

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
	 * @see org.eclipse.symphony.common.converters.Symphony__CommonConvertersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonConvertersPackageImpl() {
		super(eNS_URI, Symphony__CommonConvertersFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonConvertersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonConvertersPackage init() {
		if (isInited) return (Symphony__CommonConvertersPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonConvertersPackageImpl theSymphony__CommonConvertersPackage = (Symphony__CommonConvertersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonConvertersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonConvertersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Symphony__CommonConvertersGraphsPackageImpl theSymphony__CommonConvertersGraphsPackage = (Symphony__CommonConvertersGraphsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersGraphsPackage.eNS_URI) instanceof Symphony__CommonConvertersGraphsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersGraphsPackage.eNS_URI) : Symphony__CommonConvertersGraphsPackage.eINSTANCE);

		// Create package meta-data objects
		theSymphony__CommonConvertersPackage.createPackageContents();
		theSymphony__CommonConvertersGraphsPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonConvertersPackage.initializePackageContents();
		theSymphony__CommonConvertersGraphsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonConvertersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonConvertersPackage.eNS_URI, theSymphony__CommonConvertersPackage);
		return theSymphony__CommonConvertersPackage;
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
	public EClass getSymphony__CommonConvertersFacade() {
		return symphony__CommonConvertersFacadeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersFacade__Convert__Object_Class() {
		return symphony__CommonConvertersFacadeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersFacade__GetAllRegisteredConverters() {
		return symphony__CommonConvertersFacadeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSymphony__CommonConvertersFacade__GetGraph() {
		return symphony__CommonConvertersFacadeEClass.getEOperations().get(2);
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
	public Symphony__CommonConvertersFactory getSymphony__CommonConvertersFactory() {
		return (Symphony__CommonConvertersFactory)getEFactoryInstance();
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
		symphony__CommonConvertersFacadeEClass = createEClass(SYMPHONY_COMMON_CONVERTERS_FACADE);
		createEOperation(symphony__CommonConvertersFacadeEClass, SYMPHONY_COMMON_CONVERTERS_FACADE___CONVERT__OBJECT_CLASS);
		createEOperation(symphony__CommonConvertersFacadeEClass, SYMPHONY_COMMON_CONVERTERS_FACADE___GET_ALL_REGISTERED_CONVERTERS);
		createEOperation(symphony__CommonConvertersFacadeEClass, SYMPHONY_COMMON_CONVERTERS_FACADE___GET_GRAPH);

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
		Symphony__CommonConvertersGraphsPackage theSymphony__CommonConvertersGraphsPackage = (Symphony__CommonConvertersGraphsPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonConvertersGraphsPackage.eNS_URI);

		// Create type parameters
		addETypeParameter(listEDataType, "E");
		addETypeParameter(simpleDirectedWeightedGraphEDataType, "V");
		addETypeParameter(simpleDirectedWeightedGraphEDataType, "E");

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(symphony__CommonConvertersFacadeEClass, Symphony__CommonConvertersFacade.class, "Symphony__CommonConvertersFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSymphony__CommonConvertersFacade__Convert__Object_Class(), theEcorePackage.getEJavaObject(), "convert", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "input", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(theEcorePackage.getEJavaClass());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "targetType", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getSymphony__CommonConvertersFacade__GetAllRegisteredConverters(), null, "getAllRegisteredConverters", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getIConverter());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getSymphony__CommonConvertersFacade__GetGraph(), null, "getGraph", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSimpleDirectedWeightedGraph());
		g2 = createEGenericType(theEcorePackage.getEJavaClass());
		g1.getETypeArguments().add(g2);
		EGenericType g3 = createEGenericType();
		g2.getETypeArguments().add(g3);
		g2 = createEGenericType(theSymphony__CommonConvertersGraphsPackage.getConverterEdge());
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

} //Symphony__CommonConvertersPackageImpl
