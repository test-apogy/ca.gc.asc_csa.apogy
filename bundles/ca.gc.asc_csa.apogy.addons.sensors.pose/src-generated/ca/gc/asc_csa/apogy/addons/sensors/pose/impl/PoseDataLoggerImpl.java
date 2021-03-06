package ca.gc.asc_csa.apogy.addons.sensors.pose.impl;
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

import java.io.IOException;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseDataLogger;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;

import ca.gc.asc_csa.apogy.common.geometry.data3d.Pose;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Logger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.sensors.pose.impl.PoseDataLoggerImpl#getOutputFile <em>Output File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class PoseDataLoggerImpl extends MinimalEObjectImpl.Container implements PoseDataLogger {
	/**
	 * The default value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected static final String OUTPUT_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOutputFile() <em>Output File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutputFile()
	 * @generated
	 * @ordered
	 */
	protected String outputFile = OUTPUT_FILE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PoseDataLoggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyAddonsSensorsPosePackage.Literals.POSE_DATA_LOGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOutputFile() {
		return outputFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutputFile(String newOutputFile) {
		String oldOutputFile = outputFile;
		outputFile = newOutputFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER__OUTPUT_FILE, oldOutputFile, outputFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void logPose(Pose pose) throws IOException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER__OUTPUT_FILE:
				return getOutputFile();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER__OUTPUT_FILE:
				setOutputFile((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER__OUTPUT_FILE:
				setOutputFile(OUTPUT_FILE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER__OUTPUT_FILE:
				return OUTPUT_FILE_EDEFAULT == null ? outputFile != null : !OUTPUT_FILE_EDEFAULT.equals(outputFile);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyAddonsSensorsPosePackage.POSE_DATA_LOGGER___LOG_POSE__POSE:
				try {
					logPose((Pose)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (outputFile: ");
		result.append(outputFile);
		result.append(')');
		return result.toString();
	}

} //PoseDataLoggerImpl
