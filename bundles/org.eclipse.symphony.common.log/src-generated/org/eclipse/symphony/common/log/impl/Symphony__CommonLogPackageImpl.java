/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.log.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.common.log.Symphony__CommonLogFactory;
import org.eclipse.symphony.common.log.Symphony__CommonLogPackage;
import org.osgi.framework.Bundle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Symphony__CommonLogPackageImpl extends EPackageImpl implements Symphony__CommonLogPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loggerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventSeverityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType throwableEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bundleEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType frameworkLogEDataType = null;

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
	 * @see org.eclipse.symphony.common.log.Symphony__CommonLogPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Symphony__CommonLogPackageImpl() {
		super(eNS_URI, Symphony__CommonLogFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Symphony__CommonLogPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Symphony__CommonLogPackage init() {
		if (isInited) return (Symphony__CommonLogPackage)EPackage.Registry.INSTANCE.getEPackage(Symphony__CommonLogPackage.eNS_URI);

		// Obtain or create and register package
		Symphony__CommonLogPackageImpl theSymphony__CommonLogPackage = (Symphony__CommonLogPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Symphony__CommonLogPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Symphony__CommonLogPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSymphony__CommonLogPackage.createPackageContents();

		// Initialize created meta-data
		theSymphony__CommonLogPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSymphony__CommonLogPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Symphony__CommonLogPackage.eNS_URI, theSymphony__CommonLogPackage);
		return theSymphony__CommonLogPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogger() {
		return loggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogger__Log__String_String_EventSeverity() {
		return loggerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogger__Log__String_Object_String_EventSeverity() {
		return loggerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogger__Log__String_String_EventSeverity_Throwable() {
		return loggerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogger__Log__String_Object_String_EventSeverity_Throwable() {
		return loggerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogger__GetLog() {
		return loggerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventSeverity() {
		return eventSeverityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getThrowable() {
		return throwableEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBundle() {
		return bundleEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFrameworkLog() {
		return frameworkLogEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Symphony__CommonLogFactory getSymphony__CommonLogFactory() {
		return (Symphony__CommonLogFactory)getEFactoryInstance();
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
		loggerEClass = createEClass(LOGGER);
		createEOperation(loggerEClass, LOGGER___LOG__STRING_STRING_EVENTSEVERITY);
		createEOperation(loggerEClass, LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY);
		createEOperation(loggerEClass, LOGGER___LOG__STRING_STRING_EVENTSEVERITY_THROWABLE);
		createEOperation(loggerEClass, LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY_THROWABLE);
		createEOperation(loggerEClass, LOGGER___GET_LOG);

		// Create enums
		eventSeverityEEnum = createEEnum(EVENT_SEVERITY);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
		bundleEDataType = createEDataType(BUNDLE);
		frameworkLogEDataType = createEDataType(FRAMEWORK_LOG);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(loggerEClass, Logger.class, "Logger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getLogger__Log__String_String_EventSeverity(), null, "log", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "bundleId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventSeverity(), "severity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Log__String_Object_String_EventSeverity(), null, "log", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "bundleId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "object", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventSeverity(), "severity", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Log__String_String_EventSeverity_Throwable(), null, "log", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "bundleId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventSeverity(), "severity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThrowable(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getLogger__Log__String_Object_String_EventSeverity_Throwable(), null, "log", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "bundleId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEJavaObject(), "object", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "message", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getEventSeverity(), "severity", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getThrowable(), "t", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getLogger__GetLog(), this.getFrameworkLog(), "getLog", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(eventSeverityEEnum, EventSeverity.class, "EventSeverity");
		addEEnumLiteral(eventSeverityEEnum, EventSeverity.OK);
		addEEnumLiteral(eventSeverityEEnum, EventSeverity.INFO);
		addEEnumLiteral(eventSeverityEEnum, EventSeverity.WARNING);
		addEEnumLiteral(eventSeverityEEnum, EventSeverity.ERROR);
		addEEnumLiteral(eventSeverityEEnum, EventSeverity.CANCEL);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bundleEDataType, Bundle.class, "Bundle", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(frameworkLogEDataType, FrameworkLog.class, "FrameworkLog", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //Symphony__CommonLogPackageImpl