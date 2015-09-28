/**
 * Canadian Space Agency 2008.
 *
 * $Id: WaypointPathRecorderImpl.java,v 1.2.4.3 2015/09/22 19:39:39 rlarcheveque Exp $
 */
package ca.gc.space.mrt.mobility.controllers.impl;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EClass;

import ca.gc.space.mrt.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.space.mrt.geometry.data3d.Data3dFacade;
import ca.gc.space.mrt.geometry.paths.WayPointPath;
import ca.gc.space.mrt.mobility.controllers.Activator;
import ca.gc.space.mrt.mobility.controllers.ControllersPackage;
import ca.gc.space.mrt.mobility.controllers.PathRecorder;
import ca.gc.space.mrt.mobility.controllers.PathRecorderSamplingMode;
import ca.gc.space.mrt.mobility.controllers.WaypointPathRecorder;
import ca.gc.space.mrt.sensors.pose.PoseSensor;
import ca.gc.space.mrt.sensors.pose.PositionSensor;
import ca.gc.space.topology.TopologyPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Waypoint Path Recorder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
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
	 * @generated
	 */
	public static final String copyright = "Canadian Space Agency 2008.";

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
		return ControllersPackage.Literals.WAYPOINT_PATH_RECORDER;
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
					if(msg.getFeatureID(PathRecorder.class) == ControllersPackage.PATH_RECORDER__POSITION_SENSOR)
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
					if(msg.getFeatureID(PositionSensor.class) == TopologyPackage.POSITION_NODE__POSITION)
					{
						CartesianPositionCoordinates newPoint = getPositionSensor().getPositionCoordinates();
						if(isSampleOnDistanceDeltaRequired(newPoint))
						{
							if(getRecordedPath() != null)
							{
								getRecordedPath().getPoints().add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(newPoint));							
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
					previousPosition = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(newPoint);
				}			
			}
			else
			{								
				sampleRequired =  true;
				previousPosition = Data3dFacade.INSTANCE.createCartesianPositionCoordinates(newPoint);
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
							getRecordedPath().getPoints().add(Data3dFacade.INSTANCE.createCartesianPositionCoordinates(getPositionSensor().getPositionCoordinates()));							
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
