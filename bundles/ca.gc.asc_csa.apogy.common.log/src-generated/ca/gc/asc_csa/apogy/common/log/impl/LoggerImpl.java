package ca.gc.asc_csa.apogy.common.log.impl;
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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.osgi.framework.log.FrameworkLog;
import org.eclipse.osgi.framework.log.FrameworkLogEntry;
import ca.gc.asc_csa.apogy.common.log.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.common.log.ApogyCommonLogPackage;
import org.osgi.framework.ServiceReference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logger</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LoggerImpl extends MinimalEObjectImpl.Container implements Logger {

	/**
	 * @generated_NOT
	 */
	private static Logger instance = null;

	/**
	 * Returns the Logger singleton.
	 * @return Reference to the logger.
	 * @generated_NOT
	 */
	public static Logger getInstance() {
		if (instance == null) {
			instance = new LoggerImpl();
		}
		return instance;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonLogPackage.Literals.LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void log(String bundleId, String message, EventSeverity severity) {
		log(bundleId, message, severity, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void log(String bundleId, Object object, String message, EventSeverity severity) {
		log(bundleId, object == null ? message : object.getClass().getSimpleName() + ": " + message, severity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void log(String bundleId, String message, EventSeverity severity, Throwable t) {
		String fullMessage = message;
		FrameworkLogEntry logEntry = new FrameworkLogEntry(bundleId, (byte)severity.getValue(), 0, fullMessage, 0, t, null);
		getLog().log(logEntry);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void log(String bundleId, Object object, String message, EventSeverity severity, Throwable t) {
		log(bundleId, object == null ? message : object.getClass().getSimpleName() + ": " + message, severity, t);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public FrameworkLog getLog() {
		if (Activator.getContext() != null) {
			ServiceReference<?> logService = Activator.getContext().getServiceReference(
					"org.eclipse.osgi.framework.log.FrameworkLog");
			FrameworkLog log = (FrameworkLog) Activator.getContext().getService(
					logService);
			return log;
		} else {
			return null;
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCommonLogPackage.LOGGER___LOG__STRING_STRING_EVENTSEVERITY:
				log((String)arguments.get(0), (String)arguments.get(1), (EventSeverity)arguments.get(2));
				return null;
			case ApogyCommonLogPackage.LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY:
				log((String)arguments.get(0), arguments.get(1), (String)arguments.get(2), (EventSeverity)arguments.get(3));
				return null;
			case ApogyCommonLogPackage.LOGGER___LOG__STRING_STRING_EVENTSEVERITY_THROWABLE:
				log((String)arguments.get(0), (String)arguments.get(1), (EventSeverity)arguments.get(2), (Throwable)arguments.get(3));
				return null;
			case ApogyCommonLogPackage.LOGGER___LOG__STRING_OBJECT_STRING_EVENTSEVERITY_THROWABLE:
				log((String)arguments.get(0), arguments.get(1), (String)arguments.get(2), (EventSeverity)arguments.get(3), (Throwable)arguments.get(4));
				return null;
			case ApogyCommonLogPackage.LOGGER___GET_LOG:
				return getLog();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LoggerImpl
