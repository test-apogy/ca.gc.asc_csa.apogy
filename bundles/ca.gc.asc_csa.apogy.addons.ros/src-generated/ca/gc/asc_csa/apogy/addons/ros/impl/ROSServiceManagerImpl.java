package ca.gc.asc_csa.apogy.addons.ros.impl;
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
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.ros.exception.ServiceNotFoundException;
import org.ros.internal.message.Message;

import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFactory;
import ca.gc.asc_csa.apogy.addons.ros.Activator;
import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ROSService;
import ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager;

import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.ros.impl.ROSServiceManagerImpl#isRunning <em>Running</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ROSServiceManagerImpl extends MinimalEObjectImpl.Container implements ROSServiceManager
{
	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected HashMap<String, ROSService<?, ?>> services;

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
	 * The default value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RUNNING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRunning() <em>Running</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRunning()
	 * @generated
	 * @ordered
	 */
	protected boolean running = RUNNING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ROSServiceManagerImpl()
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
		return ApogyAddonsROSPackage.Literals.ROS_SERVICE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public HashMap<String, ROSService<?, ?>> getServices()
	{
		if ( services == null )
			services = new HashMap<String, ROSService<?, ?>>();
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServices(HashMap<String, ROSService<?, ?>> newServices)
	{
		HashMap<String, ROSService<?, ?>> oldServices = services;
		services = newServices;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__SERVICES, oldServices, services));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE, oldNode, node));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRunning()
	{
		return running;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRunning(boolean newRunning)
	{
		boolean oldRunning = running;
		running = newRunning;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__RUNNING, oldRunning, running));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void createService(String serviceName, String serviceType)
	{
		createService(serviceName, serviceType, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void createService(String serviceName, String serviceType, boolean disconnectOnTimeout)
	{
		ROSService<Message, Message> service = ApogyAddonsROSFactory.eINSTANCE.createROSService();
		service.setServiceName(serviceName);
		service.setServiceType(serviceType);
		service.setDisconnectOnTimeout(disconnectOnTimeout);
		getServices().put(serviceName, service);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	@SuppressWarnings("unchecked")
	public <Request extends Message, Response extends Message> ROSService<Request, Response> getService(String serviceName)
	{
		if ( getServices().containsKey(serviceName))
		{ 
			ROSService<Request, Response> service = (ROSService<Request, Response>)((Object)getServices().get(serviceName));
			if ( ! service.isLaunched() )
			{
				try 
				{
					service.launch(getNode());
				}
				catch (ServiceNotFoundException e){}
				catch (Exception ex)
				{
					// TODO getNode().setConnected(false);
				}
			}

			if ( !service.isLaunched() )
				Logger.INSTANCE.log(Activator.ID, this, "Could not launch service : " + serviceName, EventSeverity.ERROR);

			return service;			
		}		

		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <Request extends Message, Response extends Message> Request createRequestMessage(String serviceName)
	{
		ROSService<Request,Response> service = getService(serviceName);
		if ( service != null )
			return service.newRequestMessage();
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <Request extends Message, Response extends Message> Response callService(String serviceName, Request request)
	{
		return callService(serviceName, request, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <Request extends Message, Response extends Message> Response callService(String serviceName)
	{
		return callService(serviceName, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <Request extends Message, Response extends Message> Response callService(String serviceName, Request request, boolean enableLogging)
	{
		ROSService<Request,Response> service = getService(serviceName);
		if ( service != null )
			return service.call(request, enableLogging);
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public <Request extends Message, Response extends Message> Response callService(String serviceName, boolean enableLogging)
	{
		ROSService<Request,Response> service = getService(serviceName);
		Request request = createRequestMessage(serviceName);		

		if ( service != null )
			return service.call(request, enableLogging);
		else
			return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void launch()
	{
		new Thread ()
		{
			public void run()
			{
				for (ROSService<?,?> service : getServices().values())
				{
					try
					{
						service.launch(getNode());
					} 
					catch (ServiceNotFoundException e)
					{						
						Logger.INSTANCE.log(Activator.ID, this, "Could not launch service : " + service.getServiceName(), EventSeverity.WARNING);
					}
					catch (Exception e)
					{
						Logger.INSTANCE.log(Activator.ID, this, "Could not launch service : " + service.getServiceName(), EventSeverity.ERROR, e);
						e.printStackTrace();
						// TODO getNode().setConnected(false);
					}
				}
				setRunning(true);
			}
		}.start();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void stop()
	{
		for (ROSService<?,?> service : getServices().values())
		{
			service.stop();
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
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__SERVICES:
				return getServices();
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__RUNNING:
				return isRunning();
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
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__SERVICES:
				setServices((HashMap<String, ROSService<?, ?>>)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE:
				setNode((ROSNode)newValue);
				return;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__RUNNING:
				setRunning((Boolean)newValue);
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
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__SERVICES:
				setServices((HashMap<String, ROSService<?, ?>>)null);
				return;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE:
				setNode((ROSNode)null);
				return;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__RUNNING:
				setRunning(RUNNING_EDEFAULT);
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
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__SERVICES:
				return services != null;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__NODE:
				return node != null;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER__RUNNING:
				return running != RUNNING_EDEFAULT;
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
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING:
				createService((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CREATE_SERVICE__STRING_STRING_BOOLEAN:
				createService((String)arguments.get(0), (String)arguments.get(1), (Boolean)arguments.get(2));
				return null;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___GET_SERVICE__STRING:
				return getService((String)arguments.get(0));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CREATE_REQUEST_MESSAGE__STRING:
				return createRequestMessage((String)arguments.get(0));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE:
				return callService((String)arguments.get(0), (Message)arguments.get(1));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CALL_SERVICE__STRING:
				return callService((String)arguments.get(0));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_MESSAGE_BOOLEAN:
				return callService((String)arguments.get(0), (Message)arguments.get(1), (Boolean)arguments.get(2));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___CALL_SERVICE__STRING_BOOLEAN:
				return callService((String)arguments.get(0), (Boolean)arguments.get(1));
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___LAUNCH:
				launch();
				return null;
			case ApogyAddonsROSPackage.ROS_SERVICE_MANAGER___STOP:
				stop();
				return null;
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
		result.append(" (services: ");
		result.append(services);
		result.append(", running: ");
		result.append(running);
		result.append(')');
		return result.toString();
	}

} //ROSServiceManagerImpl
