/**
 * Canadian Space Agency / Agence spatiale canadienne 2013 Copyrights (c)
 */
package org.eclipse.symphony.addons.ros.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ros.exception.RemoteException;
import org.ros.exception.ServiceNotFoundException;
import org.ros.internal.message.Message;
import org.ros.internal.message.RawMessage;
import org.ros.internal.message.field.Field;
import org.ros.node.service.ServiceClient;
import org.ros.node.service.ServiceResponseListener;
import org.eclipse.symphony.addons.ros.Activator;
import org.eclipse.symphony.addons.ros.ROSNode;
import org.eclipse.symphony.addons.ros.Symphony__AddonsROSPackage;
import org.eclipse.symphony.addons.ros.utilities.AsynchronousShutdowner;
import org.eclipse.symphony.addons.ros.ROSService;

import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#getServiceType <em>Service Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#isLaunched <em>Launched</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#getServiceClient <em>Service Client</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.addons.ros.impl.ROSServiceImpl#isDisconnectOnTimeout <em>Disconnect On Timeout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSServiceImpl<Request extends Message, Response extends Message> extends MinimalEObjectImpl.Container implements ROSService<Request, Response>
{
	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceType() <em>Service Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceType()
	 * @generated
	 * @ordered
	 */
	protected String serviceType = SERVICE_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isLaunched() <em>Launched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaunched()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAUNCHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLaunched() <em>Launched</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLaunched()
	 * @generated
	 * @ordered
	 */
	protected boolean launched = LAUNCHED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServiceClient() <em>Service Client</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceClient()
	 * @generated
	 * @ordered
	 */
	protected ServiceClient<Request, Response> serviceClient;

	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected ROSNode node;

	/**
	 * The default value of the '{@link #isDisconnectOnTimeout() <em>Disconnect On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisconnectOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DISCONNECT_ON_TIMEOUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDisconnectOnTimeout() <em>Disconnect On Timeout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDisconnectOnTimeout()
	 * @generated
	 * @ordered
	 */
	protected boolean disconnectOnTimeout = DISCONNECT_ON_TIMEOUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceImpl()
	{
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return Symphony__AddonsROSPackage.Literals.ROS_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName()
	{
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName)
	{
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceType()
	{
		return serviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceType(String newServiceType)
	{
		String oldServiceType = serviceType;
		serviceType = newServiceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_TYPE, oldServiceType, serviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLaunched()
	{
		return launched;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLaunched(boolean newLaunched)
	{
		boolean oldLaunched = launched;
		launched = newLaunched;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__LAUNCHED, oldLaunched, launched));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceClient<Request, Response> getServiceClient()
	{
		return serviceClient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceClient(ServiceClient<Request, Response> newServiceClient)
	{
		ServiceClient<Request, Response> oldServiceClient = serviceClient;
		serviceClient = newServiceClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_CLIENT, oldServiceClient, serviceClient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode getNode()
	{
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (ROSNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__AddonsROSPackage.ROS_SERVICE__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode basicGetNode()
	{
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(ROSNode newNode)
	{
		ROSNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDisconnectOnTimeout()
	{
		return disconnectOnTimeout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnectOnTimeout(boolean newDisconnectOnTimeout)
	{
		boolean oldDisconnectOnTimeout = disconnectOnTimeout;
		disconnectOnTimeout = newDisconnectOnTimeout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__AddonsROSPackage.ROS_SERVICE__DISCONNECT_ON_TIMEOUT, oldDisconnectOnTimeout, disconnectOnTimeout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public void launch(ROSNode node) throws ServiceNotFoundException
	{
		setNode(node);
		setServiceClient((ServiceClient<Request,Response>)getNode().getConnectedNode().newServiceClient(getServiceName(), getServiceType()));
		setLaunched(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stop()
	{
		try
		{
			AsynchronousShutdowner.add(getServiceClient());
		}
		catch ( Exception e )
		{}

		setServiceClient(null);
		setLaunched(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public Request newRequestMessage()
	{
		if ( isLaunched() )
			return getServiceClient().newMessage();
		else
			if ( getNode().getNullRequestHandler() != null )
				return (Request)getNode().getNullRequestHandler().handleNullRequest(this);
		return null;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Response call(Request request)
	{
		return call(request, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public Response call(Request request, boolean enableLogging)
	{
		Response response = null;
		ROSNode node = getNode();

		if ( isLaunched() )
		{
			if(enableLogging) logRequest(request);

			BlockingServiceCall<Response> listener = new BlockingServiceCall<Response>();
			getServiceClient().call(request, listener);

			response = listener.getResponse();
		}

		if (response == null && node.getNullResponseHandler() != null)
			response = (Response)node.getNullResponseHandler().handleNullResponse(this);

		if(enableLogging)
		{
			if ( node.getResponseLogger() != null)	
			{
				node.getResponseLogger().logResponse(this, response);
			}
		}

		return response;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	private void logRequest(Request request)
	{
		StringBuilder strBuilder = new StringBuilder();

		strBuilder.append("Service ");
		strBuilder.append(serviceName);
		strBuilder.append(" called with parameters : ");
		generateParametersString(strBuilder, request);

		Logger.INSTANCE.log(Activator.ID, this, strBuilder.toString(), EventSeverity.INFO);
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	private void generateParametersString(StringBuilder builder, Message msg)
	{
		RawMessage rmsg = msg.toRawMessage();

		for (Field f : rmsg.getFields())
			if (!f.isConstant())
			{
				builder.append("{ ");
				builder.append(f.getName());
				builder.append(": ");

				if (f.getValue() instanceof Message)
					generateParametersString(builder, (Message) f.getValue());
				else
					builder.append(f.getValue().toString());
				builder.append(" } ");
			}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType)
	{
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_NAME:
				return getServiceName();
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_TYPE:
				return getServiceType();
			case Symphony__AddonsROSPackage.ROS_SERVICE__LAUNCHED:
				return isLaunched();
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_CLIENT:
				return getServiceClient();
			case Symphony__AddonsROSPackage.ROS_SERVICE__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case Symphony__AddonsROSPackage.ROS_SERVICE__DISCONNECT_ON_TIMEOUT:
				return isDisconnectOnTimeout();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue)
	{
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_NAME:
				setServiceName((String)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_TYPE:
				setServiceType((String)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__LAUNCHED:
				setLaunched((Boolean)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_CLIENT:
				setServiceClient((ServiceClient<Request, Response>)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__NODE:
				setNode((ROSNode)newValue);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__DISCONNECT_ON_TIMEOUT:
				setDisconnectOnTimeout((Boolean)newValue);
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
	public void eUnset(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_TYPE:
				setServiceType(SERVICE_TYPE_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__LAUNCHED:
				setLaunched(LAUNCHED_EDEFAULT);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_CLIENT:
				setServiceClient((ServiceClient<Request, Response>)null);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__NODE:
				setNode((ROSNode)null);
				return;
			case Symphony__AddonsROSPackage.ROS_SERVICE__DISCONNECT_ON_TIMEOUT:
				setDisconnectOnTimeout(DISCONNECT_ON_TIMEOUT_EDEFAULT);
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
	public boolean eIsSet(int featureID)
	{
		switch (featureID) {
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_TYPE:
				return SERVICE_TYPE_EDEFAULT == null ? serviceType != null : !SERVICE_TYPE_EDEFAULT.equals(serviceType);
			case Symphony__AddonsROSPackage.ROS_SERVICE__LAUNCHED:
				return launched != LAUNCHED_EDEFAULT;
			case Symphony__AddonsROSPackage.ROS_SERVICE__SERVICE_CLIENT:
				return serviceClient != null;
			case Symphony__AddonsROSPackage.ROS_SERVICE__NODE:
				return node != null;
			case Symphony__AddonsROSPackage.ROS_SERVICE__DISCONNECT_ON_TIMEOUT:
				return disconnectOnTimeout != DISCONNECT_ON_TIMEOUT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
	{
		switch (operationID) {
			case Symphony__AddonsROSPackage.ROS_SERVICE___LAUNCH__ROSNODE:
				try {
					launch((ROSNode)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case Symphony__AddonsROSPackage.ROS_SERVICE___STOP:
				stop();
				return null;
			case Symphony__AddonsROSPackage.ROS_SERVICE___NEW_REQUEST_MESSAGE:
				return newRequestMessage();
			case Symphony__AddonsROSPackage.ROS_SERVICE___CALL__MESSAGE:
				return call((Request)arguments.get(0));
			case Symphony__AddonsROSPackage.ROS_SERVICE___CALL__MESSAGE_BOOLEAN:
				return call((Request)arguments.get(0), (Boolean)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString()
	{
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (serviceName: ");
		result.append(serviceName);
		result.append(", serviceType: ");
		result.append(serviceType);
		result.append(", launched: ");
		result.append(launched);
		result.append(", serviceClient: ");
		result.append(serviceClient);
		result.append(", disconnectOnTimeout: ");
		result.append(disconnectOnTimeout);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc --> 
	 * Manages the service responses
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	private class BlockingServiceCall<T extends Message> implements ServiceResponseListener<T>
	{
		final boolean USE_MAX_WAIT_TIME_DEFAULT = true;
		final int MAX_WAIT_TIME = 5000; // milliseconds

		private boolean useMaxWaitTime = USE_MAX_WAIT_TIME_DEFAULT;
		private boolean done = false;
		private Condition condition = null;
		private ReentrantLock lock;
		private T response;

		public BlockingServiceCall()
		{
			lock = new ReentrantLock();
			condition = lock.newCondition();
		}

		@Override
		public void onSuccess(T response)
		{
			lock.lock();
			try
			{
				this.response = response;
				done = true;
				condition.signal();
			} finally
			{
				lock.unlock();
			}
		}

		@Override
		public void onFailure(RemoteException e)
		{
			e.printStackTrace();
			lock.lock();
			try
			{
				done = true;
				condition.signal();
			} finally
			{
				lock.unlock();
			}
		}

		public T getResponse()
		{
			lock.lock();
			try
			{
				// while (!done)
				{
					try
					{
						if (useMaxWaitTime)
						{
							done = condition.await(MAX_WAIT_TIME, TimeUnit.MILLISECONDS);
							if (!done && isDisconnectOnTimeout())
							{
								node.setConnected(false);
							}
						} 
						else
						{
							condition.await();

						}
					} 
					catch (InterruptedException e)
					{

					}
				}
			} 
			finally
			{
				lock.unlock();
			}
			return this.response;
		}
	}

} //ROSServiceImpl
