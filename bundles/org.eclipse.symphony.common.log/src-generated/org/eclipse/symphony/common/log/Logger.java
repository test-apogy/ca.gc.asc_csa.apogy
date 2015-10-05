/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.log;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.symphony.common.log.impl.LoggerImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Logger</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * This class provides methods to log messages into the OSGI Log Framework.
 * @see org.eclipse.osgi.framework.log.FrameworkLogEntry
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.common.log.UtilsLogPackage#getLogger()
 * @model
 * @generated
 */
public interface Logger extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Log message.
	 * @param bundleId Bundle unique identifier.  Refers to the bundle that contains the object that logs the message.
	 * @param message Log message.
	 * @param severity Event severity.
	 * @see org.eclipse.osgi.framework.log.FrameworkLogEntry
	 * <!-- end-model-doc -->
	 * @model bundleIdUnique="false" messageUnique="false" severityUnique="false"
	 * @generated
	 */
	void log(String bundleId, String message, EventSeverity severity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Log message.
	 * @param bundleId Bundle unique identifier.  Refers to the bundle that contains the object that logs the message.
	 * @param object Reference to the object that logs the message.
	 * @param message Log message.
	 * @param severity Event severity.
	 * @see org.eclipse.osgi.framework.log.FrameworkLogEntry
	 * <!-- end-model-doc -->
	 * @model bundleIdUnique="false" objectUnique="false" messageUnique="false" severityUnique="false"
	 * @generated
	 */
	void log(String bundleId, Object object, String message, EventSeverity severity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Log message.
	 * @param bundleId Bundle unique identifier.  Refers to the bundle that contains the object that logs the message.
	 * @param message Log message.
	 * @param severity Event severity.
	 * @param t Reference to the exception context.
	 * @see org.eclipse.osgi.framework.log.FrameworkLogEntry
	 * <!-- end-model-doc -->
	 * @model bundleIdUnique="false" messageUnique="false" severityUnique="false" tDataType="org.eclipse.symphony.common.log.Throwable" tUnique="false"
	 * @generated
	 */
	void log(String bundleId, String message, EventSeverity severity, Throwable t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Log message.
	 * @param bundleId Bundle unique identifier.  Refers to the bundle that contains the object that logs the message.
	 * @param object Reference to the object that logs the message.
	 * @param message Log message.
	 * @param severity Event severity.
	 * @param t Reference to the exception context.
	 * @see org.eclipse.osgi.framework.log.FrameworkLogEntry
	 * <!-- end-model-doc -->
	 * @model bundleIdUnique="false" objectUnique="false" messageUnique="false" severityUnique="false" tDataType="org.eclipse.symphony.common.log.Throwable" tUnique="false"
	 * @generated
	 */
	void log(String bundleId, Object object, String message, EventSeverity severity, Throwable t);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Returns the OSGI Framework Log.
	 * @return Reference to the {@link org.eclipse.osgi.framework.log.FrameworkLog}
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.common.log.FrameworkLog" unique="false"
	 * @generated
	 */
	FrameworkLog getLog();

	/**
	 * @generated_NOT
	 */
	public static Logger INSTANCE = LoggerImpl
			.getInstance();

} // Logger
