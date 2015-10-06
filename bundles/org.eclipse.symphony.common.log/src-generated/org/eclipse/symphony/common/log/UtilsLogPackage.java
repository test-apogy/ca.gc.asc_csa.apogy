/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.log;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.symphony.common.log.UtilsLogFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='UtilsLog' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)' modelName='UtilsLog' modelDirectory='/org.eclipse.symphony.common.log/src-generated' editDirectory='/org.eclipse.symphony.common.log.edit/src-generated' basePackage='org.eclipse.symphony.common'"
 * @generated
 */
public interface UtilsLogPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "log";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.eclipse.symphony.common.log";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "log";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UtilsLogPackage eINSTANCE = org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.log.impl.LoggerImpl <em>Logger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.log.impl.LoggerImpl
	 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getLogger()
	 * @generated
	 */
	int LOGGER = 0;

	/**
	 * The number of structural features of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___LOG__STRING_STRING_EVENTSEVERITY = 0;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY = 1;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___LOG__STRING_STRING_EVENTSEVERITY_THROWABLE = 2;

	/**
	 * The operation id for the '<em>Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY_THROWABLE = 3;

	/**
	 * The operation id for the '<em>Get Log</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER___GET_LOG = 4;

	/**
	 * The number of operations of the '<em>Logger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOGGER_OPERATION_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.symphony.common.log.EventSeverity <em>Event Severity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.log.EventSeverity
	 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getEventSeverity()
	 * @generated
	 */
	int EVENT_SEVERITY = 1;

	/**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getThrowable()
	 * @generated
	 */
	int THROWABLE = 2;


	/**
	 * The meta object id for the '<em>Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Bundle
	 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 3;


	/**
	 * The meta object id for the '<em>Framework Log</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.osgi.framework.log.FrameworkLog
	 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getFrameworkLog()
	 * @generated
	 */
	int FRAMEWORK_LOG = 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.common.log.Logger <em>Logger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Logger</em>'.
	 * @see org.eclipse.symphony.common.log.Logger
	 * @generated
	 */
	EClass getLogger();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.String, org.eclipse.symphony.common.log.EventSeverity) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.String, org.eclipse.symphony.common.log.EventSeverity)
	 * @generated
	 */
	EOperation getLogger__Log__String_String_EventSeverity();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.Object, java.lang.String, org.eclipse.symphony.common.log.EventSeverity) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.Object, java.lang.String, org.eclipse.symphony.common.log.EventSeverity)
	 * @generated
	 */
	EOperation getLogger__Log__String_Object_String_EventSeverity();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.String, org.eclipse.symphony.common.log.EventSeverity, java.lang.Throwable) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.String, org.eclipse.symphony.common.log.EventSeverity, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Log__String_String_EventSeverity_Throwable();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.Object, java.lang.String, org.eclipse.symphony.common.log.EventSeverity, java.lang.Throwable) <em>Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log</em>' operation.
	 * @see org.eclipse.symphony.common.log.Logger#log(java.lang.String, java.lang.Object, java.lang.String, org.eclipse.symphony.common.log.EventSeverity, java.lang.Throwable)
	 * @generated
	 */
	EOperation getLogger__Log__String_Object_String_EventSeverity_Throwable();

	/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.common.log.Logger#getLog() <em>Get Log</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Log</em>' operation.
	 * @see org.eclipse.symphony.common.log.Logger#getLog()
	 * @generated
	 */
	EOperation getLogger__GetLog();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.common.log.EventSeverity <em>Event Severity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Event Severity</em>'.
	 * @see org.eclipse.symphony.common.log.EventSeverity
	 * @generated
	 */
	EEnum getEventSeverity();

	/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
	EDataType getThrowable();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bundle</em>'.
	 * @see org.osgi.framework.Bundle
	 * @model instanceClass="org.osgi.framework.Bundle"
	 * @generated
	 */
	EDataType getBundle();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.osgi.framework.log.FrameworkLog <em>Framework Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Framework Log</em>'.
	 * @see org.eclipse.osgi.framework.log.FrameworkLog
	 * @model instanceClass="org.eclipse.osgi.framework.log.FrameworkLog"
	 * @generated
	 */
	EDataType getFrameworkLog();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UtilsLogFactory getUtilsLogFactory();

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
		 * The meta object literal for the '{@link org.eclipse.symphony.common.log.impl.LoggerImpl <em>Logger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.log.impl.LoggerImpl
		 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getLogger()
		 * @generated
		 */
		EClass LOGGER = eINSTANCE.getLogger();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___LOG__STRING_STRING_EVENTSEVERITY = eINSTANCE.getLogger__Log__String_String_EventSeverity();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY = eINSTANCE.getLogger__Log__String_Object_String_EventSeverity();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___LOG__STRING_STRING_EVENTSEVERITY_THROWABLE = eINSTANCE.getLogger__Log__String_String_EventSeverity_Throwable();

		/**
		 * The meta object literal for the '<em><b>Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY_THROWABLE = eINSTANCE.getLogger__Log__String_Object_String_EventSeverity_Throwable();

		/**
		 * The meta object literal for the '<em><b>Get Log</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOGGER___GET_LOG = eINSTANCE.getLogger__GetLog();

		/**
		 * The meta object literal for the '{@link org.eclipse.symphony.common.log.EventSeverity <em>Event Severity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.common.log.EventSeverity
		 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getEventSeverity()
		 * @generated
		 */
		EEnum EVENT_SEVERITY = eINSTANCE.getEventSeverity();

		/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getThrowable()
		 * @generated
		 */
		EDataType THROWABLE = eINSTANCE.getThrowable();

		/**
		 * The meta object literal for the '<em>Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Bundle
		 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getBundle()
		 * @generated
		 */
		EDataType BUNDLE = eINSTANCE.getBundle();

		/**
		 * The meta object literal for the '<em>Framework Log</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.osgi.framework.log.FrameworkLog
		 * @see org.eclipse.symphony.common.log.impl.UtilsLogPackageImpl#getFrameworkLog()
		 * @generated
		 */
		EDataType FRAMEWORK_LOG = eINSTANCE.getFrameworkLog();

	}

} //UtilsLogPackage