/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.symphony.common.emf.BrowseableTimeSource;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.TimeDirection;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Browseable Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl#getStartTime <em>Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl#getTimeAcceration <em>Time Acceration</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.BrowseableTimeSourceImpl#getTimeDirection <em>Time Direction</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BrowseableTimeSourceImpl extends TimeSourceImpl implements BrowseableTimeSource 
{
	protected boolean paused = false;	
	protected boolean disposed = false;
	
	/**
	 * Job used to update the current time.
	 */
	protected Job updateJob = null;
	
	/**
	 * The default value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_TIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartTime() <em>Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartTime()
	 * @generated
	 * @ordered
	 */
	protected Date startTime = START_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUpdatePeriod() <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected static final int UPDATE_PERIOD_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getUpdatePeriod() <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdatePeriod()
	 * @generated
	 * @ordered
	 */
	protected int updatePeriod = UPDATE_PERIOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeAcceration() <em>Time Acceration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAcceration()
	 * @generated
	 * @ordered
	 */
	protected static final float TIME_ACCERATION_EDEFAULT = 10.0F;

	/**
	 * The cached value of the '{@link #getTimeAcceration() <em>Time Acceration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAcceration()
	 * @generated
	 * @ordered
	 */
	protected float timeAcceration = TIME_ACCERATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeDirection() <em>Time Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDirection()
	 * @generated
	 * @ordered
	 */
	protected static final TimeDirection TIME_DIRECTION_EDEFAULT = TimeDirection.FORWARD;

	/**
	 * The cached value of the '{@link #getTimeDirection() <em>Time Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDirection()
	 * @generated
	 * @ordered
	 */
	protected TimeDirection timeDirection = TIME_DIRECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BrowseableTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcorePackage.Literals.BROWSEABLE_TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public Date getStartTime() 
	{
		Date tmp = getStartTimeGen();
		
		// If start date not defined, creates one.
		if(tmp == null)
		{
			tmp = new Date();
			
			setStartTime(tmp);
		}
		return tmp;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartTimeGen() {
		return startTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartTime(Date newStartTime) {
		Date oldStartTime = startTime;
		startTime = newStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME, oldStartTime, startTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpdatePeriod() {
		return updatePeriod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdatePeriod(int newUpdatePeriod) {
		int oldUpdatePeriod = updatePeriod;
		updatePeriod = newUpdatePeriod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD, oldUpdatePeriod, updatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getTimeAcceration() {
		return timeAcceration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAcceration(float newTimeAcceration) {
		float oldTimeAcceration = timeAcceration;
		timeAcceration = newTimeAcceration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION, oldTimeAcceration, timeAcceration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeDirection getTimeDirection() {
		return timeDirection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDirection(TimeDirection newTimeDirection) {
		TimeDirection oldTimeDirection = timeDirection;
		timeDirection = newTimeDirection == null ? TIME_DIRECTION_EDEFAULT : newTimeDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION, oldTimeDirection, timeDirection));
	}
	
	@Override
	public Date getTime() 
	{	
		Date tmp = super.getTime();
		if(tmp == null)
		{
			tmp = getStartTime();
			setTime(new Date(getStartTime().getTime()));
		}
		return tmp;
	}
	
	@Override
	public void dispose() 
	{
		this.disposed = true;
		if(this.updateJob != null)
		{
			/* Cancel the update job.*/
			getUpdateJob().cancel();
			
			/* Clears our reference to the Job.*/
			setUpdateJob(null);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void playForward() 
	{		
		setTimeDirection(TimeDirection.FORWARD);		
		this.paused = false;
		
		// Force the job to start if not already started.
		getUpdateJob();				
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void playReverse() 
	{
		setTimeDirection(TimeDirection.REVERSE);		
		this.paused = false;
		
		// Force the job to start if not already started.
		getUpdateJob();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void pause() 
	{
		this.paused = true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void reset() 
	{
		this.paused = true;
		setTime(getStartTime());
		
		// Force the job to start if not already started.
		getUpdateJob();	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME:
				return getStartTime();
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD:
				return getUpdatePeriod();
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION:
				return getTimeAcceration();
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION:
				return getTimeDirection();
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
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME:
				setStartTime((Date)newValue);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD:
				setUpdatePeriod((Integer)newValue);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION:
				setTimeAcceration((Float)newValue);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION:
				setTimeDirection((TimeDirection)newValue);
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
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME:
				setStartTime(START_TIME_EDEFAULT);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD:
				setUpdatePeriod(UPDATE_PERIOD_EDEFAULT);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION:
				setTimeAcceration(TIME_ACCERATION_EDEFAULT);
				return;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION:
				setTimeDirection(TIME_DIRECTION_EDEFAULT);
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
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__START_TIME:
				return START_TIME_EDEFAULT == null ? startTime != null : !START_TIME_EDEFAULT.equals(startTime);
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__UPDATE_PERIOD:
				return updatePeriod != UPDATE_PERIOD_EDEFAULT;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_ACCERATION:
				return timeAcceration != TIME_ACCERATION_EDEFAULT;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE__TIME_DIRECTION:
				return timeDirection != TIME_DIRECTION_EDEFAULT;
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
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE___PLAY_FORWARD:
				playForward();
				return null;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE___PLAY_REVERSE:
				playReverse();
				return null;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE___PAUSE:
				pause();
				return null;
			case EMFEcorePackage.BROWSEABLE_TIME_SOURCE___RESET:
				reset();
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (startTime: ");
		result.append(startTime);
		result.append(", updatePeriod: ");
		result.append(updatePeriod);
		result.append(", timeAcceration: ");
		result.append(timeAcceration);
		result.append(", timeDirection: ");
		result.append(timeDirection);
		result.append(')');
		return result.toString();
	}

	protected void setUpdateJob(Job updateJob) 
	{
		this.updateJob = updateJob;
	}

	protected void updateTime(Date now)
	{
		// Updates the TimeSource time.
		setTime(now);	
	}
	
	/**
	 * Returns the Job used to update the time.
	 * @return
	 */
	protected Job getUpdateJob() 
	{
		if(updateJob == null)
		{
			updateJob = new Job("BrowseableTimeSource update") 
			{			
				private long lastTime = -1;
				
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					if(!monitor.isCanceled() && !disposed)
					{						
						try
						{		
							// Update time if we are not paused.
							if(!paused)
							{
								// Get current time.
								Date now = new Date();
								
								if(lastTime != -1)
								{
									long delta = Math.round(((now.getTime() - lastTime) * getTimeAcceration()));
									
									Date newTime = null;
									if(getTimeDirection() == TimeDirection.FORWARD)
									{
										newTime = new Date(getTime().getTime() + delta);
									}
									else
									{
										newTime = new Date(getTime().getTime() - delta);
									}
									
									updateTime(newTime);
								}
								else
								{
									updateTime(now);
								}			
								
								lastTime = now.getTime();
							}
							
							// Schedule again.
							updateJob.schedule(getUpdatePeriod());																	
						}
						catch(Exception e)
						{
							e.printStackTrace();
						}
					}
					return Status.OK_STATUS;					
				}
			};
			
			// Starts the job.
			updateJob.schedule();
		}
		
		return updateJob;
	}	
} //BrowseableTimeSourceImpl
