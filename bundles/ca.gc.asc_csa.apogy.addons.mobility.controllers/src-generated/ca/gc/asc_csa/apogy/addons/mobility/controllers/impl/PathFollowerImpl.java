package ca.gc.asc_csa.apogy.addons.mobility.controllers.impl;
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
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.addons.geometry.paths.Path;
import ca.gc.asc_csa.apogy.addons.mobility.MobilePlatform;
import ca.gc.asc_csa.apogy.addons.mobility.MobilePlatformStatus;
import ca.gc.asc_csa.apogy.addons.mobility.ApogyAddonsMobilityPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.Activator;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollower;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.PathFollowerState;
import ca.gc.asc_csa.apogy.addons.sensors.SensorStatus;
import ca.gc.asc_csa.apogy.addons.sensors.pose.ApogyAddonsSensorsPosePackage;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Follower</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl#getPath <em>Path</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl#getPlatform <em>Platform</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl#getPoseSensor <em>Pose Sensor</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl#isDestinationReached <em>Destination Reached</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.addons.mobility.controllers.impl.PathFollowerImpl#getPathFollowerState <em>Path Follower State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathFollowerImpl<PlatformType extends MobilePlatform, PathType extends Path> extends MinimalEObjectImpl.Container implements PathFollower<PlatformType, PathType>
{	
	private Adapter platformAdapter = null;
	private Adapter poseSensorAdapter = null;
	
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected PathType path;

	/**
	 * The cached value of the '{@link #getPlatform() <em>Platform</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlatform()
	 * @generated
	 * @ordered
	 */
	protected PlatformType platform;

	/**
	 * The cached value of the '{@link #getPoseSensor() <em>Pose Sensor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoseSensor()
	 * @generated
	 * @ordered
	 */
	protected PoseSensor poseSensor;

	/**
	 * The default value of the '{@link #isDestinationReached() <em>Destination Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestinationReached()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESTINATION_REACHED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestinationReached() <em>Destination Reached</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestinationReached()
	 * @generated
	 * @ordered
	 */
	protected boolean destinationReached = DESTINATION_REACHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPathFollowerState() <em>Path Follower State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathFollowerState()
	 * @generated
	 * @ordered
	 */
	protected static final PathFollowerState PATH_FOLLOWER_STATE_EDEFAULT = PathFollowerState.IDLE;

	/**
	 * The cached value of the '{@link #getPathFollowerState() <em>Path Follower State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPathFollowerState()
	 * @generated
	 * @ordered
	 */
	protected PathFollowerState pathFollowerState = PATH_FOLLOWER_STATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathFollowerImpl()
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
		return ApogyAddonsMobilityControllersPackage.Literals.PATH_FOLLOWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public PathType getPath()
	{
		if (path != null && path.eIsProxy()) {
			InternalEObject oldPath = (InternalEObject)path;
			path = (PathType)eResolveProxy(oldPath);
			if (path != oldPath) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH, oldPath, path));
			}
		}
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathType basicGetPath()
	{
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPath(PathType newPath)
	{
		if(getPathFollowerState() == PathFollowerState.IDLE)
		{						
			// Sets the path.
			setPathGen(newPath);
			
			// Initialise the destination reached to false.
			setDestinationReached(false);
			
			// Checks to see if the path is null or empty
			if(newPath == null)
			{
				Logger.INSTANCE.log(Activator.ID, this, "PathFollowerImpl : Path set to NULL !", EventSeverity.WARNING);
			}
		}
		else
		{																											
			Logger.INSTANCE.log(Activator.ID, this, "PathFollowerImpl : Cannot set path while in <" + getPathFollowerState().getName() + "> state.", EventSeverity.ERROR);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathGen(PathType newPath)
	{
		PathType oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH, oldPath, path));
	}

	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public PlatformType getPlatform()
	{
		if (platform != null && platform.eIsProxy()) {
			InternalEObject oldPlatform = (InternalEObject)platform;
			platform = (PlatformType)eResolveProxy(oldPlatform);
			if (platform != oldPlatform) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM, oldPlatform, platform));
			}
		}
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlatformType basicGetPlatform()
	{
		return platform;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPlatform(PlatformType newPlatform)
	{
		PlatformType oldPlatform = platform;
		platform = newPlatform;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM, oldPlatform, platform));
		
		// Unregister listener from the old PoseSensor.
		if(oldPlatform != null)
		{
			oldPlatform.eAdapters().remove(getPlateformAdapter());
		}
		
		// Register listener to the new PoseSensor.				
		if(newPlatform != null)
		{
			newPlatform.eAdapters().add(getPlateformAdapter());
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensor getPoseSensor()
	{
		if (poseSensor != null && poseSensor.eIsProxy()) {
			InternalEObject oldPoseSensor = (InternalEObject)poseSensor;
			poseSensor = (PoseSensor)eResolveProxy(oldPoseSensor);
			if (poseSensor != oldPoseSensor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR, oldPoseSensor, poseSensor));
			}
		}
		return poseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PoseSensor basicGetPoseSensor()
	{
		return poseSensor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setPoseSensor(PoseSensor newPoseSensor)
	{
		PoseSensor oldPoseSensor = poseSensor;
		poseSensor = newPoseSensor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR, oldPoseSensor, poseSensor));
		
		// Unregister listener from the old PoseSensor.
		if(oldPoseSensor != null)
		{
			oldPoseSensor.eAdapters().remove(getPoseSensorAdapter());
		}
		
		// Register listener to the new PoseSensor.				
		if(newPoseSensor != null)
		{
			newPoseSensor.eAdapters().add(getPoseSensorAdapter());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestinationReached()
	{
		return destinationReached;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setDestinationReached(boolean newDestinationReached)
	{
		boolean oldDestinationReached = destinationReached;
		destinationReached = newDestinationReached;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__DESTINATION_REACHED, oldDestinationReached, destinationReached));
		
		// Log in a Destination reached event.
		if(newDestinationReached)
		{
			Logger.INSTANCE.log(Activator.ID, this, "Destination reached.", EventSeverity.INFO);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathFollowerState getPathFollowerState()
	{
		return pathFollowerState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPathFollowerState(PathFollowerState newPathFollowerState)
	{
		PathFollowerState oldPathFollowerState = pathFollowerState;
		pathFollowerState = newPathFollowerState == null ? PATH_FOLLOWER_STATE_EDEFAULT : newPathFollowerState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH_FOLLOWER_STATE, oldPathFollowerState, pathFollowerState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean start()
	{		
		if(isTransitionValid(PathFollowerState.RUNNING))
		{						
			setPathFollowerState(PathFollowerState.RUNNING);			
			return true;				
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, " Incorrect state <" + getPathFollowerState().getName() + "> to pause.", EventSeverity.ERROR);
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean pause()
	{
		if(isTransitionValid(PathFollowerState.PAUSED))
		{
			setPathFollowerState(PathFollowerState.PAUSED);			
			return true;		
		}
		else
		{
			Logger.INSTANCE.log(Activator.ID, this, " Incorrect state <" + getPathFollowerState().getName() + "> to pause.", EventSeverity.ERROR);
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean resume()
	{
		if(isTransitionValid(PathFollowerState.RUNNING))
		{
			setPathFollowerState(PathFollowerState.RUNNING);
			return true;
		}
		else
		{		
			Logger.INSTANCE.log(Activator.ID, this, " Incorrect state <" + getPathFollowerState().getName() + "> to resume.", EventSeverity.ERROR);
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean stop()
	{
		if(isTransitionValid(PathFollowerState.IDLE))
		{
			setPathFollowerState(PathFollowerState.IDLE);
			return true;
		}
		else
		{		
			Logger.INSTANCE.log(Activator.ID, this, " Incorrect state <" + getPathFollowerState().getName() + "> to stop.", EventSeverity.ERROR);			
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isTransitionValid(PathFollowerState state)
	{
		boolean result = false;
		PathFollowerState currentState = getPathFollowerState();
		
		switch(currentState.getValue())
		{
			case PathFollowerState.IDLE_VALUE:
			{
				switch(state.getValue())
				{
					case PathFollowerState.RUNNING_VALUE :
					case PathFollowerState.FAILED_VALUE :
					{
						result = true;
						break;
					}
				}
				break;
			}
			case PathFollowerState.RUNNING_VALUE:
			{
				switch(state.getValue())
				{
					case PathFollowerState.PAUSED_VALUE :
					case PathFollowerState.FAILED_VALUE :
					case PathFollowerState.IDLE_VALUE :
					{
						result = true;
						break;
					}
				}
				break;
			}
			case PathFollowerState.PAUSED_VALUE:
			{
				switch(state.getValue())
				{
					case PathFollowerState.RUNNING_VALUE :
					case PathFollowerState.FAILED_VALUE :
					{
						result = true;
						break;
					}
				}
				break;
			}
			case PathFollowerState.FAILED_VALUE:
			{
				result = false;
				break;
			}
			default: result = false;				
		}
		
		return result;
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
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH:
				if (resolve) return getPath();
				return basicGetPath();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM:
				if (resolve) return getPlatform();
				return basicGetPlatform();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR:
				if (resolve) return getPoseSensor();
				return basicGetPoseSensor();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__DESTINATION_REACHED:
				return isDestinationReached();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH_FOLLOWER_STATE:
				return getPathFollowerState();
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
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH:
				setPath((PathType)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM:
				setPlatform((PlatformType)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR:
				setPoseSensor((PoseSensor)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__DESTINATION_REACHED:
				setDestinationReached((Boolean)newValue);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH_FOLLOWER_STATE:
				setPathFollowerState((PathFollowerState)newValue);
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
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH:
				setPath((PathType)null);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM:
				setPlatform((PlatformType)null);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR:
				setPoseSensor((PoseSensor)null);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__DESTINATION_REACHED:
				setDestinationReached(DESTINATION_REACHED_EDEFAULT);
				return;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH_FOLLOWER_STATE:
				setPathFollowerState(PATH_FOLLOWER_STATE_EDEFAULT);
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
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH:
				return path != null;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PLATFORM:
				return platform != null;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__POSE_SENSOR:
				return poseSensor != null;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__DESTINATION_REACHED:
				return destinationReached != DESTINATION_REACHED_EDEFAULT;
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER__PATH_FOLLOWER_STATE:
				return pathFollowerState != PATH_FOLLOWER_STATE_EDEFAULT;
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
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER___START:
				return start();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER___PAUSE:
				return pause();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER___RESUME:
				return resume();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER___STOP:
				return stop();
			case ApogyAddonsMobilityControllersPackage.PATH_FOLLOWER___IS_TRANSITION_VALID__PATHFOLLOWERSTATE:
				return isTransitionValid((PathFollowerState)arguments.get(0));
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
		result.append(" (destinationReached: ");
		result.append(destinationReached);
		result.append(", pathFollowerState: ");
		result.append(pathFollowerState);
		result.append(')');
		return result.toString();
	}

	/**
	 * Return a singleton Adapter used to monitor the state of the PoseSensor to pause 
	 * path following if it fails and resume path following when it start 
	 * running again.
	 * @return The Adapter.
	 */
	private Adapter getPoseSensorAdapter()
	{
		if(poseSensorAdapter == null)
		{
			poseSensorAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{										
					if(msg.getFeatureID(PoseSensor.class) == ApogyAddonsSensorsPosePackage.ORIENTATION_SENSOR__STATUS)
					{
						if(msg.getNewValue() == SensorStatus.FAILED)
						{
							if(isTransitionValid(PathFollowerState.PAUSED))
							{
								pause();
								Logger.INSTANCE.log(Activator.ID, this, "Path following pause due to failure of Pose Sensor.", EventSeverity.WARNING);	
							}
						}
						else if(msg.getNewValue() == SensorStatus.OFF)
						{
							if(isTransitionValid(PathFollowerState.PAUSED))
							{
								pause();
								Logger.INSTANCE.log(Activator.ID, this, "Path following pause due to the Pose Sensor being turned OFF.", EventSeverity.WARNING);
							}
						}
						else if((msg.getNewValue() == SensorStatus.READY))
						{
							if(isTransitionValid(PathFollowerState.RUNNING))
							{
								resume();
								Logger.INSTANCE.log(Activator.ID, this, "Path following resumed since Pose Sensor is running again.", EventSeverity.WARNING);								
							}
						}
					}
				}
			};
		}
		
		return poseSensorAdapter;
	}
	
	/**
	 * Return a singleton Adapter used to monitor the state of the MobilityPlateform to pause 
	 * path following if it fails and resume path following when it start 
	 * running again.
	 * @return The Adapter.
	 */
	private Adapter getPlateformAdapter()
	{
		if(platformAdapter == null)
		{
			platformAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{
					if(msg.getFeatureID(MobilePlatform.class) == ApogyAddonsMobilityPackage.MOBILE_PLATFORM_STATUS)
					{
						if(msg.getNewValue() == MobilePlatformStatus.FAILED)
						{
							if(isTransitionValid(PathFollowerState.PAUSED))
							{
								pause();
								Logger.INSTANCE.log(Activator.ID, this, "Path following pause due to failure of Mobile Plateform.", EventSeverity.WARNING);
							}
						}
						else if(msg.getNewValue() == MobilePlatformStatus.OFF)
						{
							if(isTransitionValid(PathFollowerState.PAUSED))
							{
								pause();
								Logger.INSTANCE.log(Activator.ID, this, "Path following pause due to Mobile Plateform being turned OFF.", EventSeverity.WARNING);
							}
						}
						else if((msg.getNewValue() == MobilePlatformStatus.READY))
						{
							if(isTransitionValid(PathFollowerState.RUNNING))
							{
								resume();
								Logger.INSTANCE.log(Activator.ID, this, "Path following resumed since Mobile Plateform is running again.", EventSeverity.INFO);
							}
						}
					}
				}
			};
		}		
		return platformAdapter;
	}
	
} //PathFollowerImpl
