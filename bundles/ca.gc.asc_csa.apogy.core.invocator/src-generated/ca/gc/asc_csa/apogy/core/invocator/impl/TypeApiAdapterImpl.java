package ca.gc.asc_csa.apogy.core.invocator.impl;
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
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import ca.gc.asc_csa.apogy.common.emf.Activator;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.core.invocator.AbstractInitializationData;
import ca.gc.asc_csa.apogy.core.invocator.AbstractResultValue;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFactory;
import ca.gc.asc_csa.apogy.core.invocator.Environment;
import ca.gc.asc_csa.apogy.core.invocator.ExceptionContainer;
import ca.gc.asc_csa.apogy.core.invocator.OperationCall;
import ca.gc.asc_csa.apogy.core.invocator.OperationCallResult;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage;
import ca.gc.asc_csa.apogy.core.invocator.Type;
import ca.gc.asc_csa.apogy.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Type Api Adapter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.impl.TypeApiAdapterImpl#getElementType <em>Element Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeApiAdapterImpl extends MinimalEObjectImpl.Container implements
		TypeApiAdapter {
	/**
	 * The cached value of the '{@link #getEnvironment() <em>Environment</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getEnvironment()
	 * @generated
	 * @ordered
	 */
	protected Environment environment;
	/**
	 * The cached value of the '{@link #getInstance() <em>Instance</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getInstance()
	 * @generated
	 * @ordered
	 */
	protected EObject instance;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected Type elementType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public TypeApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreInvocatorPackage.Literals.TYPE_API_ADAPTER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Environment getEnvironment() {
		if (environment != null && environment.eIsProxy()) {
			InternalEObject oldEnvironment = (InternalEObject)environment;
			environment = (Environment)eResolveProxy(oldEnvironment);
			if (environment != oldEnvironment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT, oldEnvironment, environment));
			}
		}
		return environment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Environment basicGetEnvironment() {
		return environment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvironment(Environment newEnvironment) {
		Environment oldEnvironment = environment;
		environment = newEnvironment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT, oldEnvironment, environment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getInstance() {
		if (instance != null && instance.eIsProxy()) {
			InternalEObject oldInstance = (InternalEObject)instance;
			instance = eResolveProxy(oldInstance);
			if (instance != oldInstance) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE, oldInstance, instance));
			}
		}
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetInstance() {
		return instance;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstance(EObject newInstance) {
		EObject oldInstance = instance;
		instance = newInstance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE, oldInstance, instance));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type getElementType() {
		if (elementType != null && elementType.eIsProxy()) {
			InternalEObject oldElementType = (InternalEObject)elementType;
			elementType = (Type)eResolveProxy(oldElementType);
			if (elementType != oldElementType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE, oldElementType, elementType));
			}
		}
		return elementType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(Type newElementType) {
		Type oldElementType = elementType;
		elementType = newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void init(Environment environment, Type elementType, EObject instance) {
		setEnvironment(environment);
		setElementType(elementType);
		setInstance(instance);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void apply(AbstractInitializationData initializationData) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public AbstractInitializationData createInitializationData() {
		return ApogyCoreInvocatorFactory.eINSTANCE.createInitializationData();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void collect(AbstractInitializationData data) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCallResult createResult(OperationCall operationCall) {
		return ApogyCoreInvocatorFactory.eINSTANCE.createOperationCallResult();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCallResult createResult(OperationCall operationCall, long invocationTime, Object resultValue, Exception exception) 
	{
		// Create a copy of the OperationCall especially to store the parameters used.
		OperationCall operationCallCopy = EcoreUtil.copy(operationCall);
				
		// Create a result container.
		OperationCallResult result = createResult(operationCallCopy);

		// Creates the result value with the value returned.
		AbstractResultValue resultValueContainer = ApogyCoreInvocatorFacade.INSTANCE
				.createAbstractResultValue(resultValue);
		result.setResultValue(resultValueContainer);
		result.setTime(new Date(invocationTime));

		result.setContext(operationCall.getEnvironment().getActiveContext());

		// Store the OperationCall attributes.
		if (result.getOperationCalls().isEmpty()){
			result.getOperationCalls().add(0, operationCallCopy);	
		}else{
			result.getOperationCalls().set(0, operationCallCopy);
		}			
	

		// Store the exception if required.
		if (exception != null) 
		{
			ExceptionContainer container = ApogyCoreInvocatorFactory.eINSTANCE.createExceptionContainer();
			container.setException(exception);
			result.setExceptionContainer(container);
			exception.printStackTrace();
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public OperationCallResult invoke(EObject instance, OperationCall operationCall, boolean saveResult) {

		long invokeTime = 0;
		Object result_value = null;
		Throwable exception = null;
		OperationCallResult result = null;

		/** Create arguments list. */
		EList<?> arguments = null;
		if (!operationCall.getEOperation().getEParameters().isEmpty()) {
			arguments = new BasicEList<Object>(operationCall.getArgumentsList()
					.getArgumentValues());
		}

		/**
		 * Invoke the operation call.
		 */
		try 
		{
			invokeTime = System.currentTimeMillis();
			result_value = instance.eInvoke(operationCall.getEOperation(), arguments);
		} 
		catch (Throwable e) 
		{			
			exception = e;
			
			Logger.INSTANCE.log(Activator.ID, this, "Error occured while invoking OperationCall !", EventSeverity.ERROR, e);
		}

		
		// Saves the result if required.
		if (saveResult){
			result = (OperationCallResult) createResult(
					operationCall, invokeTime, result_value,
					(Exception) exception);
			
			environment.getActiveContext().getDataProductsList().getOperationCallResultsList().getResults().add(result);			
		}
		
		return result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated_NOT
	 */
	public void dispose() {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
				if (resolve) return getElementType();
				return basicGetElementType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				setInstance((EObject)newValue);
				return;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
				setElementType((Type)newValue);
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
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				setInstance((EObject)null);
				return;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
				setElementType((Type)null);
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
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				return environment != null;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				return instance != null;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
				return elementType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments)
			throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT:
				init((Environment)arguments.get(0), (Type)arguments.get(1), (EObject)arguments.get(2));
				return null;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA:
				apply((AbstractInitializationData)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA:
				return createInitializationData();
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA:
				collect((AbstractInitializationData)arguments.get(0));
				return null;
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL:
				return createResult((OperationCall)arguments.get(0));
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION:
				return createResult((OperationCall)arguments.get(0), (Long)arguments.get(1), arguments.get(2), (Exception)arguments.get(3));
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN:
				return invoke((EObject)arguments.get(0), (OperationCall)arguments.get(1), (Boolean)arguments.get(2));
			case ApogyCoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // TypeApiAdapterImpl
