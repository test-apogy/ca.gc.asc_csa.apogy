package ca.gc.asc_csa.apogy.common.processors.impl;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.common.processors.Processor;
import ca.gc.asc_csa.apogy.common.processors.ApogyCommonProcessorsPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Processor</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl#getProgressMonitor <em>Progress Monitor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl#getInput <em>Input</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.processors.impl.ProcessorImpl#getOutput <em>Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ProcessorImpl<I, O> extends MinimalEObjectImpl.Container
		implements Processor<I, O> {
	/**
	 * The default value of the '{@link #getProgressMonitor()
	 * <em>Progress Monitor</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getProgressMonitor()
	 * @generated NOT
	 * @ordered
	 */
	protected static final IProgressMonitor PROGRESS_MONITOR_EDEFAULT = new NullProgressMonitor();

	/**
	 * The cached value of the '{@link #getProgressMonitor() <em>Progress Monitor</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getProgressMonitor()
	 * @generated
	 * @ordered
	 */
	protected IProgressMonitor progressMonitor = PROGRESS_MONITOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected I input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected O output;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ProcessorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonProcessorsPackage.Literals.PROCESSOR;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public IProgressMonitor getProgressMonitor() {

		if (progressMonitor == null) {
			setProgressMonitor(new NullProgressMonitor());
		}
		return progressMonitor;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgressMonitor(IProgressMonitor newProgressMonitor) {
		IProgressMonitor oldProgressMonitor = progressMonitor;
		progressMonitor = newProgressMonitor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR, oldProgressMonitor, progressMonitor));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public I getInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(I newInput) {
		I oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonProcessorsPackage.PROCESSOR__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public O getOutput() {
		return output;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setOutput(O newOutput) {
		O oldOutput = output;
		output = newOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT, oldOutput, output));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public O process(I input) throws Exception {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR:
				return getProgressMonitor();
			case ApogyCommonProcessorsPackage.PROCESSOR__INPUT:
				return getInput();
			case ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT:
				return getOutput();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR:
				setProgressMonitor((IProgressMonitor)newValue);
				return;
			case ApogyCommonProcessorsPackage.PROCESSOR__INPUT:
				setInput((I)newValue);
				return;
			case ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT:
				setOutput((O)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR:
				setProgressMonitor(PROGRESS_MONITOR_EDEFAULT);
				return;
			case ApogyCommonProcessorsPackage.PROCESSOR__INPUT:
				setInput((I)null);
				return;
			case ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT:
				setOutput((O)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ApogyCommonProcessorsPackage.PROCESSOR__PROGRESS_MONITOR:
				return PROGRESS_MONITOR_EDEFAULT == null ? progressMonitor != null : !PROGRESS_MONITOR_EDEFAULT.equals(progressMonitor);
			case ApogyCommonProcessorsPackage.PROCESSOR__INPUT:
				return input != null;
			case ApogyCommonProcessorsPackage.PROCESSOR__OUTPUT:
				return output != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID)
		{
			case ApogyCommonProcessorsPackage.PROCESSOR___PROCESS__OBJECT:
				try
				{
					return process((I)arguments.get(0));
				}
				catch(Throwable t)
				{    		 
					return null;
				}
		}
		
		return super.eInvoke(operationID, arguments);
	}

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (progressMonitor: ");
		result.append(progressMonitor);
		result.append(", input: ");
		result.append(input);
		result.append(", output: ");
		result.append(output);
		result.append(')');
		return result.toString();
	}
} // ProcessorImpl
