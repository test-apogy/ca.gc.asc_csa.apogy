package ca.gc.asc_csa.apogy.common.emf.impl;
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

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import ca.gc.asc_csa.apogy.common.emf.Activator;
import ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource;
import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import ca.gc.asc_csa.apogy.common.log.EventSeverity;
import ca.gc.asc_csa.apogy.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Current Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.impl.CurrentTimeSourceImpl#isPaused <em>Paused</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CurrentTimeSourceImpl extends TimeSourceImpl implements CurrentTimeSource 
{
	private boolean disposed = false;
	
	/**
	 * Job used to update the current time.
	 */
	private Job updateJob = null;
	
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
	 * The default value of the '{@link #isPaused() <em>Paused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaused()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PAUSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaused() <em>Paused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaused()
	 * @generated
	 * @ordered
	 */
	protected boolean paused = PAUSED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CurrentTimeSourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCommonEMFPackage.Literals.CURRENT_TIME_SOURCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__UPDATE_PERIOD, oldUpdatePeriod, updatePeriod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaused() {
		return paused;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaused(boolean newPaused) {
		boolean oldPaused = paused;
		paused = newPaused;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__PAUSED, oldPaused, paused));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void pause() 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Pausing", EventSeverity.INFO);
		setPaused(true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void resume() 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Resuming.", EventSeverity.INFO);
		
		// Force a time update right away.
		Date now = new Date();
		updateTime(now);
		
		// Force the job to start if not already started.
		getUpdateJob();
		
		// Resume updates.
		setPaused(false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__UPDATE_PERIOD:
				return getUpdatePeriod();
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__PAUSED:
				return isPaused();
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
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__UPDATE_PERIOD:
				setUpdatePeriod((Integer)newValue);
				return;
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__PAUSED:
				setPaused((Boolean)newValue);
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
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__UPDATE_PERIOD:
				setUpdatePeriod(UPDATE_PERIOD_EDEFAULT);
				return;
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__PAUSED:
				setPaused(PAUSED_EDEFAULT);
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
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__UPDATE_PERIOD:
				return updatePeriod != UPDATE_PERIOD_EDEFAULT;
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE__PAUSED:
				return paused != PAUSED_EDEFAULT;
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
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE___PAUSE:
				pause();
				return null;
			case ApogyCommonEMFPackage.CURRENT_TIME_SOURCE___RESUME:
				resume();
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
		result.append(" (updatePeriod: ");
		result.append(updatePeriod);
		result.append(", paused: ");
		result.append(paused);
		result.append(')');
		return result.toString();
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
			updateJob = new Job("CurrentTimeSource update") 
			{			
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					if(!monitor.isCanceled() && !disposed)
					{						
						try
						{			
							// Update time if we are not paused.
							if(!isPaused())
							{
								Date now = new Date();
								updateTime(now);
								
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
} //CurrentTimeSourceImpl
