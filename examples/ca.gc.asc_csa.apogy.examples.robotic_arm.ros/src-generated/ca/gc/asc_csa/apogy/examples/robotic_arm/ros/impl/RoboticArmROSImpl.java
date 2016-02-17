/**
 * Canadian Space Agency / Agence spatiale canadienne - Copyright (c) 2016
 */
package ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSFactory;
import ca.gc.asc_csa.apogy.addons.ros.ApogyAddonsROSPackage;
import ca.gc.asc_csa.apogy.addons.ros.ROSInterface;
import ca.gc.asc_csa.apogy.addons.ros.ROSNode;
import ca.gc.asc_csa.apogy.addons.ros.ROSPublisherManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSServiceManager;
import ca.gc.asc_csa.apogy.addons.ros.ROSTopicLauncher;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;
import ca.gc.asc_csa.apogy.examples.robotic_arm.MoveSpeedLevel;
import ca.gc.asc_csa.apogy.examples.robotic_arm.impl.RoboticArmImpl;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.Activator;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.ApogyExamplesRoboticArmROSPackage;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROS;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmROSConstants;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveToRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveToResponse;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevelRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevelResponse;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStowRequest;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStowResponse;
import ca.gc.asc_csa.apogy.examples.robotic_arm.ros.listeners.RoboticArmTelemetryListener;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Robotic Arm ROS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl#getServiceManager <em>Service Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl#getTopicLauncher <em>Topic Launcher</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl#getPublisherManager <em>Publisher Manager</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl#getNode <em>Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.examples.robotic_arm.ros.impl.RoboticArmROSImpl#getRobotiocArmRosNode <em>Robotioc Arm Ros Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoboticArmROSImpl extends RoboticArmImpl implements RoboticArmROS {
	/**
	 * The cached value of the '{@link #getServiceManager() <em>Service Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceManager()
	 * @generated
	 * @ordered
	 */
	protected ROSServiceManager serviceManager;

	/**
	 * The cached value of the '{@link #getTopicLauncher() <em>Topic Launcher</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopicLauncher()
	 * @generated
	 * @ordered
	 */
	protected ROSTopicLauncher topicLauncher;

	/**
	 * The cached value of the '{@link #getPublisherManager() <em>Publisher Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisherManager()
	 * @generated
	 * @ordered
	 */
	protected ROSPublisherManager publisherManager;

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
	 * The cached value of the '{@link #getRobotiocArmRosNode() <em>Robotioc Arm Ros Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRobotiocArmRosNode()
	 * @generated
	 * @ordered
	 */
	protected ROSNode robotiocArmRosNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoboticArmROSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyExamplesRoboticArmROSPackage.Literals.ROBOTIC_ARM_ROS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSServiceManager getServiceManager() {
		if (serviceManager != null && serviceManager.eIsProxy()) {
			InternalEObject oldServiceManager = (InternalEObject)serviceManager;
			serviceManager = (ROSServiceManager)eResolveProxy(oldServiceManager);
			if (serviceManager != oldServiceManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER, oldServiceManager, serviceManager));
			}
		}
		return serviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSServiceManager basicGetServiceManager() {
		return serviceManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceManager(ROSServiceManager newServiceManager) {
		ROSServiceManager oldServiceManager = serviceManager;
		serviceManager = newServiceManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER, oldServiceManager, serviceManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTopicLauncher getTopicLauncher() {
		if (topicLauncher != null && topicLauncher.eIsProxy()) {
			InternalEObject oldTopicLauncher = (InternalEObject)topicLauncher;
			topicLauncher = (ROSTopicLauncher)eResolveProxy(oldTopicLauncher);
			if (topicLauncher != oldTopicLauncher) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER, oldTopicLauncher, topicLauncher));
			}
		}
		return topicLauncher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSTopicLauncher basicGetTopicLauncher() {
		return topicLauncher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopicLauncher(ROSTopicLauncher newTopicLauncher) {
		ROSTopicLauncher oldTopicLauncher = topicLauncher;
		topicLauncher = newTopicLauncher;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER, oldTopicLauncher, topicLauncher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSPublisherManager getPublisherManager() {
		if (publisherManager != null && publisherManager.eIsProxy()) {
			InternalEObject oldPublisherManager = (InternalEObject)publisherManager;
			publisherManager = (ROSPublisherManager)eResolveProxy(oldPublisherManager);
			if (publisherManager != oldPublisherManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER, oldPublisherManager, publisherManager));
			}
		}
		return publisherManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSPublisherManager basicGetPublisherManager() {
		return publisherManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisherManager(ROSPublisherManager newPublisherManager) {
		ROSPublisherManager oldPublisherManager = publisherManager;
		publisherManager = newPublisherManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER, oldPublisherManager, publisherManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode getNode() {
		if (node != null && node.eIsProxy()) {
			InternalEObject oldNode = (InternalEObject)node;
			node = (ROSNode)eResolveProxy(oldNode);
			if (node != oldNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE, oldNode, node));
			}
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode basicGetNode() {
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNode(ROSNode newNode) {
		ROSNode oldNode = node;
		node = newNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE, oldNode, node));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ROSNode getRobotiocArmRosNode() {
		return robotiocArmRosNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRobotiocArmRosNode(ROSNode newRobotiocArmRosNode, NotificationChain msgs) {
		ROSNode oldRobotiocArmRosNode = robotiocArmRosNode;
		robotiocArmRosNode = newRobotiocArmRosNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE, oldRobotiocArmRosNode, newRobotiocArmRosNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRobotiocArmRosNode(ROSNode newRobotiocArmRosNode) {
		if (newRobotiocArmRosNode != robotiocArmRosNode) {
			NotificationChain msgs = null;
			if (robotiocArmRosNode != null)
				msgs = ((InternalEObject)robotiocArmRosNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE, null, msgs);
			if (newRobotiocArmRosNode != null)
				msgs = ((InternalEObject)newRobotiocArmRosNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE, null, msgs);
			msgs = basicSetRobotiocArmRosNode(newRobotiocArmRosNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE, newRobotiocArmRosNode, newRobotiocArmRosNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void rosInit() 
	{
		// This method initialize connection with the ROS node provides the telemetry 
		// and services associated with the ROS implementation of the RoboticArm.
		
		topicLauncher.createListener(RoboticArmROSConstants.TOPIC_NAME_ROBOTIC_ARM_TELEMETRY, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.RoboticArmTelemetry._TYPE, new RoboticArmTelemetryListener(this));
		
		// Add services.		
		serviceManager.createService(RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdSpeedLevel._TYPE, false);
		serviceManager.createService(RoboticArmROSConstants.SERVICE_NAME_MOVE_TO, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdMoveTo._TYPE, false);
		serviceManager.createService(RoboticArmROSConstants.SERVICE_NAME_STOW_ARM, ca.gc.asc_csa.apogy.examples.robotic_arm.ros.cmdStow._TYPE, false);

		// Launch topics and services.
		if(!topicLauncher.isRunning())  topicLauncher.launch();
		if(!serviceManager.isRunning()) serviceManager.launch();
		if(!publisherManager.isRunning()) publisherManager.launch();	 		 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
				return basicSetRobotiocArmRosNode(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER:
				if (resolve) return getServiceManager();
				return basicGetServiceManager();
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER:
				if (resolve) return getTopicLauncher();
				return basicGetTopicLauncher();
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER:
				if (resolve) return getPublisherManager();
				return basicGetPublisherManager();
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE:
				if (resolve) return getNode();
				return basicGetNode();
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
				return getRobotiocArmRosNode();
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
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER:
				setServiceManager((ROSServiceManager)newValue);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER:
				setTopicLauncher((ROSTopicLauncher)newValue);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER:
				setPublisherManager((ROSPublisherManager)newValue);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE:
				setNode((ROSNode)newValue);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
				setRobotiocArmRosNode((ROSNode)newValue);
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
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER:
				setServiceManager((ROSServiceManager)null);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER:
				setTopicLauncher((ROSTopicLauncher)null);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER:
				setPublisherManager((ROSPublisherManager)null);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE:
				setNode((ROSNode)null);
				return;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
				setRobotiocArmRosNode((ROSNode)null);
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
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER:
				return serviceManager != null;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER:
				return topicLauncher != null;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER:
				return publisherManager != null;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE:
				return node != null;
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__ROBOTIOC_ARM_ROS_NODE:
				return robotiocArmRosNode != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ROSInterface.class) {
			switch (derivedFeatureID) {
				case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER: return ApogyAddonsROSPackage.ROS_INTERFACE__SERVICE_MANAGER;
				case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER: return ApogyAddonsROSPackage.ROS_INTERFACE__TOPIC_LAUNCHER;
				case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER: return ApogyAddonsROSPackage.ROS_INTERFACE__PUBLISHER_MANAGER;
				case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE: return ApogyAddonsROSPackage.ROS_INTERFACE__NODE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ROSInterface.class) {
			switch (baseFeatureID) {
				case ApogyAddonsROSPackage.ROS_INTERFACE__SERVICE_MANAGER: return ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__SERVICE_MANAGER;
				case ApogyAddonsROSPackage.ROS_INTERFACE__TOPIC_LAUNCHER: return ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__TOPIC_LAUNCHER;
				case ApogyAddonsROSPackage.ROS_INTERFACE__PUBLISHER_MANAGER: return ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__PUBLISHER_MANAGER;
				case ApogyAddonsROSPackage.ROS_INTERFACE__NODE: return ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS__NODE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == ROSInterface.class) {
			switch (baseOperationID) {
				case ApogyAddonsROSPackage.ROS_INTERFACE___ROS_INIT: return ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS___ROS_INIT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyExamplesRoboticArmROSPackage.ROBOTIC_ARM_ROS___ROS_INIT:
				rosInit();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	@Override
	public boolean init() 
	{
		  Logger.INSTANCE.log(Activator.ID, this, "start() with client node named <" + RoboticArmROSConstants.ROBOTIC_ARM_CLIENT_NODE_NAME + ">...", EventSeverity.INFO);		  
		  
		  // Initialize the ROS node.
		  ROSNode node = ApogyAddonsROSFactory.eINSTANCE.createROSNode();	  
		  node.setNodeName(RoboticArmROSConstants.ROBOTIC_ARM_CLIENT_NODE_NAME);
		  node.setEnableAutoRestartOnConnectionLost(false);
		  
		  try
		  {			  
			  node.initialize();
		  }
		  catch(Exception e)
		  {
			  
			  Logger.INSTANCE.log(Activator.ID, this, "start() failed !",  EventSeverity.INFO, e);
			  
			  return false;
		  }
		  
		  setNode(node);	 		  	  	 
		  node.register(this, false);
		  
		  node.eAdapters().add(new AdapterImpl()
		  {
				@Override
				public void notifyChanged(Notification msg)
				{
					if (msg.getFeatureID(ROSNode.class) == ApogyAddonsROSPackage.ROS_NODE__CONNECTED)
					{
						boolean connected = msg.getNewBooleanValue();										
											
						if (connected)
						{			
							Logger.INSTANCE.log(Activator.ID, this,"Connected to Robotic Arm ROS server!", EventSeverity.INFO);																			
						}					
					}
				}			
		  });

		  node.start();
		  		 		  
		  return true;	
	}

	@Override
	public void cmdMoveSpeedLevel(MoveSpeedLevel speedLevel) 
	{
		cmdSpeedLevelRequest request = getServiceManager().createRequestMessage(RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED);				
		
		cmdSpeedLevelResponse response = getServiceManager().callService(RoboticArmROSConstants.SERVICE_NAME_SET_MOVE_SPEED, request, false);
		
		if(!response.getResult())
		{
			throw new RuntimeException("Service RoboticArmROSConstants.SERVICE_NAME_MOVE_TO returned false !");
		}
	}

	@Override
	public void moveTo(double turrentAngle, double shoulderAngle, double elbowAngle, double wristAngle) 
	{
		cmdMoveToRequest request = getServiceManager().createRequestMessage(RoboticArmROSConstants.SERVICE_NAME_MOVE_TO);
		request.setTurretAngle((float) Math.toRadians(turrentAngle));
		request.setShoulderAngle((float) Math.toRadians(shoulderAngle));
		request.setElbowAngle((float) Math.toRadians(elbowAngle));
		request.setWristAngle((float) Math.toRadians(wristAngle));
		
		cmdMoveToResponse response = getServiceManager().callService(RoboticArmROSConstants.SERVICE_NAME_MOVE_TO, request, false);
		
		if(!response.getResult())
		{
			throw new RuntimeException("Service RoboticArmROSConstants.SERVICE_NAME_MOVE_TO returned false !");
		}		
	}

	@Override
	public void stow() 
	{		
		cmdStowRequest request = getServiceManager().createRequestMessage(RoboticArmROSConstants.SERVICE_NAME_STOW_ARM);
		cmdStowResponse response = getServiceManager().callService(RoboticArmROSConstants.SERVICE_NAME_STOW_ARM, request, false);
		
		try 
		{
			Thread.sleep(10000);
		} 
		catch (InterruptedException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(!response.getResult())
		{
			throw new RuntimeException("Service RoboticArmROSConstants.SERVICE_NAME_MOVE_TO returned false !");
		}
	}

} //RoboticArmROSImpl
