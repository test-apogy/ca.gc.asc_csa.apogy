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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.addons.geometry.paths.WayPointPath;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.Activator;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.ApogyAddonsMobilityControllersPackage;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorder;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.PathRecorderSamplingMode;
import ca.gc.asc_csa.apogy.addons.mobility.controllers.WaypointPathRecorder;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PoseSensor;
import ca.gc.asc_csa.apogy.addons.sensors.pose.PositionSensor;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waypoint Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class WaypointPathRecorderImpl extends PathRecorderImpl<WayPointPath> implements WaypointPathRecorder
{	
	protected Adapter positionAdapter = null;
	protected Adapter positionSensorAdapter = null;
	protected CartesianPositionCoordinates previousPosition = null;	
	protected Job sampleOnTimeJob = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected WaypointPathRecorderImpl()
	{
		super();
		initialize();
	}
	
	private void initialize()
	{
		// Listens for change in the position sensor.
		eAdapters().add(getPositionSensorAdapter());
		
		getSampleOnTimeJob().schedule();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass()
	{
		return ApogyAddonsMobilityControllersPackage.Literals.WAYPOINT_PATH_RECORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific type known in this context.
	 * @generated
	 */
	@Override
	public void setRecordedPath(WayPointPath newRecordedPath) {
		super.setRecordedPath(newRecordedPath);
	}

	protected Adapter getPositionSensorAdapter()
	{
		if(positionSensorAdapter == null)
		{
			positionSensorAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{
					if(msg.getFeatureID(PathRecorder.class) == ApogyAddonsMobilityControllersPackage.PATH_RECORDER__POSITION_SENSOR)
					{												
						// Unregister from the old sensor.
						PoseSensor oldPoseSensor = (PoseSensor) msg.getOldValue();
						if(oldPoseSensor != null)
						{
							oldPoseSensor.eAdapters().remove(getPositionAdapter());
						}
						
						// Register to the new sensor.
						PoseSensor newPoseSensor = (PoseSensor) msg.getNewValue();
						if(newPoseSensor != null)
						{
							newPoseSensor.eAdapters().add(getPositionAdapter());
							
							// Clear the recorded path.
							if(getRecordedPath() != null) getRecordedPath().getPoints().clear();
							
							// Resets the previousPoint.
							previousPosition = null;
						}
					}
				}
			};
		}
		
		return positionSensorAdapter;
	}
	
	/**
	 * Returns the adapter used to monitor the PositionSensor position.
	 * @return The adapter.
	 */
	protected Adapter getPositionAdapter()
	{
		if(positionAdapter == null)
		{
			positionAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg)
				{
					if(msg.getFeatureID(PositionSensor.class) == ApogyCommonTopologyPackage.POSITION_NODE__POSITION)
					{
						CartesianPositionCoordinates newPoint = getPositionSensor().getPositionCoordinates();
						if(isSampleOnDistanceDeltaRequired(newPoint))
						{
							if(getRecordedPath() != null)
							{
								getRecordedPath().getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(newPoint));							
							}							
						}												
					}
				}
			};
		}
		
		return positionAdapter;
	}

	/**
	 * Checks whether or not a sample should be made base on the minimum distance delta.
	 * @param newPoint The new point received.
	 * @return True if the new point is far enough from the previous point, or if this is the first point tested.
	 */
	protected boolean isSampleOnDistanceDeltaRequired(CartesianPositionCoordinates newPoint)
	{
		boolean sampleRequired = false;
		
		if((getSamplingMode() == PathRecorderSamplingMode.ON_DISTANCE_DELTA) ||
		   (getSamplingMode() == PathRecorderSamplingMode.ON_TIME_OR_DISTANCE_DELTA))
		{
			if(previousPosition != null)
			{
				if(newPoint.asPoint3d().distance(previousPosition.asPoint3d()) >= getMinimumDistanceDelta())
				{									
					sampleRequired =  true;
					previousPosition = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(newPoint);
				}			
			}
			else
			{								
				sampleRequired =  true;
				previousPosition = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(newPoint);
			}			
		}
		
		return sampleRequired;
	}
	
	/**
	 * Checks whether or not a sample should be made base on the minimum time delta.
	 * @return  True if the new point is far enough from the previous point, or if this is the first point tested.
	 */
	protected boolean isSampleOnTimeDeltaRequired()
	{
		return ((getSamplingMode() == PathRecorderSamplingMode.ON_TIME_DELTA) |
			    (getSamplingMode() == PathRecorderSamplingMode.ON_TIME_OR_DISTANCE_DELTA));
	}
	
	/**
	 * Return the Job that is used to sample the position at regular interval.
	 * @return The Job.
	 */
	private Job getSampleOnTimeJob()
	{
		if(sampleOnTimeJob == null)
		{
			sampleOnTimeJob = new Job("WaypointPathRecorder Update On Time")
			{

				@Override
				protected IStatus run(IProgressMonitor monitor)
				{
					if(isSampleOnTimeDeltaRequired())
					{				
						if(getRecordedPath() != null)
						{
							getRecordedPath().getPoints().add(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(getPositionSensor().getPositionCoordinates()));							
						}
					}
					long delay = Math.round(getMinimumTimeDelta() * 1000);									
					schedule(delay);
						
					return new Status(IStatus.OK, Activator.ID, IStatus.OK, null, null);
				}				
			};
		}
		
		return sampleOnTimeJob;
	}
	
} //WaypointPathRecorderImpl
