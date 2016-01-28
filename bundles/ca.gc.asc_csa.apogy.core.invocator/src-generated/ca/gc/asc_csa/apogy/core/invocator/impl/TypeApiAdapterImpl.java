/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.impl;

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
import org.eclipse.symphony.common.emf.Activator;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.AbstractInitializationData;
import org.eclipse.symphony.core.invocator.AbstractResultValue;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFacade;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.Environment;
import org.eclipse.symphony.core.invocator.ExceptionContainer;
import org.eclipse.symphony.core.invocator.OperationCall;
import org.eclipse.symphony.core.invocator.OperationCallResult;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage;
import org.eclipse.symphony.core.invocator.Type;
import org.eclipse.symphony.core.invocator.TypeApiAdapter;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Type Api Adapter</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl#getInstance <em>Instance</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.impl.TypeApiAdapterImpl#getElementType <em>Element Type</em>}</li>
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
	protected TypeApiAdapterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CoreInvocatorPackage.Literals.TYPE_API_ADAPTER;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT, oldEnvironment, environment));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT, oldEnvironment, environment));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE, oldInstance, instance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE, oldInstance, instance));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE, oldElementType, elementType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE, oldElementType, elementType));
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
		return Symphony__CoreInvocatorFactory.eINSTANCE.createInitializationData();
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
		return Symphony__CoreInvocatorFactory.eINSTANCE.createOperationCallResult();
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
		AbstractResultValue resultValueContainer = Symphony__CoreInvocatorFacade.INSTANCE
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
			ExceptionContainer container = Symphony__CoreInvocatorFactory.eINSTANCE.createExceptionContainer();
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
	public void invoke(EObject instance, OperationCall operationCall, boolean saveResult) {

		long invokeTime = 0;
		Object result_value = null;
		Throwable exception = null;

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
		if (saveResult) 
		{
			OperationCallResult result = (OperationCallResult) createResult(
					operationCall, invokeTime, result_value,
					(Exception) exception);
			
			environment.getActiveContext().getDataProductsList().getOperationCallResultsList().getResults().add(result);			
		}
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
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				if (resolve) return getEnvironment();
				return basicGetEnvironment();
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				if (resolve) return getInstance();
				return basicGetInstance();
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
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
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				setEnvironment((Environment)newValue);
				return;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				setInstance((EObject)newValue);
				return;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
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
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				setEnvironment((Environment)null);
				return;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				setInstance((EObject)null);
				return;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
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
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ENVIRONMENT:
				return environment != null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__INSTANCE:
				return instance != null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER__ELEMENT_TYPE:
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
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___INIT__ENVIRONMENT_TYPE_EOBJECT:
				init((Environment)arguments.get(0), (Type)arguments.get(1), (EObject)arguments.get(2));
				return null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___APPLY__ABSTRACTINITIALIZATIONDATA:
				apply((AbstractInitializationData)arguments.get(0));
				return null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_INITIALIZATION_DATA:
				return createInitializationData();
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___COLLECT__ABSTRACTINITIALIZATIONDATA:
				collect((AbstractInitializationData)arguments.get(0));
				return null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL:
				return createResult((OperationCall)arguments.get(0));
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___CREATE_RESULT__OPERATIONCALL_LONG_OBJECT_EXCEPTION:
				return createResult((OperationCall)arguments.get(0), (Long)arguments.get(1), arguments.get(2), (Exception)arguments.get(3));
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___INVOKE__EOBJECT_OPERATIONCALL_BOOLEAN:
				invoke((EObject)arguments.get(0), (OperationCall)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case Symphony__CoreInvocatorPackage.TYPE_API_ADAPTER___DISPOSE:
				dispose();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} // TypeApiAdapterImpl
