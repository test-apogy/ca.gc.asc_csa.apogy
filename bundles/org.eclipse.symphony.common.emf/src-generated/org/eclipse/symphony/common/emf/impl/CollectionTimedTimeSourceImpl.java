/**
 */
package org.eclipse.symphony.common.emf.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.emf.Activator;
import org.eclipse.symphony.common.emf.CollectionTimedTimeSource;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFFacade;
import org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage;
import org.eclipse.symphony.common.emf.TimeDirection;
import org.eclipse.symphony.common.emf.Timed;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collection Timed Time Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl#isLoopEnable <em>Loop Enable</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl#getTimedsList <em>Timeds List</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl#getCurrentTimedElement <em>Current Timed Element</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl#getEarliestDate <em>Earliest Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.impl.CollectionTimedTimeSourceImpl#getLatestDate <em>Latest Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CollectionTimedTimeSourceImpl extends BrowseableTimeSourceImpl implements CollectionTimedTimeSource 
{
	private Adapter timedsListAdapter = null;
	
	/**
	 * The default value of the '{@link #isLoopEnable() <em>Loop Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoopEnable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LOOP_ENABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLoopEnable() <em>Loop Enable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLoopEnable()
	 * @generated
	 * @ordered
	 */
	protected boolean loopEnable = LOOP_ENABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimedsList() <em>Timeds List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimedsList()
	 * @generated
	 * @ordered
	 */
	protected EList<Timed> timedsList;

	/**
	 * The cached value of the '{@link #getCurrentTimedElement() <em>Current Timed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentTimedElement()
	 * @generated
	 * @ordered
	 */
	protected Timed currentTimedElement;

	/**
	 * The default value of the '{@link #getEarliestDate() <em>Earliest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date EARLIEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEarliestDate() <em>Earliest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEarliestDate()
	 * @generated
	 * @ordered
	 */
	protected Date earliestDate = EARLIEST_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLatestDate() <em>Latest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date LATEST_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLatestDate() <em>Latest Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatestDate()
	 * @generated
	 * @ordered
	 */
	protected Date latestDate = LATEST_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	protected CollectionTimedTimeSourceImpl() 
	{
		super();
		
		eAdapters().add(getTimedsListAdapter());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Symphony__CommonEMFPackage.Literals.COLLECTION_TIMED_TIME_SOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLoopEnable() {
		return loopEnable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoopEnable(boolean newLoopEnable) {
		boolean oldLoopEnable = loopEnable;
		loopEnable = newLoopEnable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE, oldLoopEnable, loopEnable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Timed> getTimedsList() {
		if (timedsList == null) {
			timedsList = new EObjectResolvingEList<Timed>(Timed.class, this, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST);
		}
		return timedsList;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timed getCurrentTimedElement() {
		if (currentTimedElement != null && currentTimedElement.eIsProxy()) {
			InternalEObject oldCurrentTimedElement = (InternalEObject)currentTimedElement;
			currentTimedElement = (Timed)eResolveProxy(oldCurrentTimedElement);
			if (currentTimedElement != oldCurrentTimedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT, oldCurrentTimedElement, currentTimedElement));
			}
		}
		return currentTimedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Timed basicGetCurrentTimedElement() {
		return currentTimedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentTimedElement(Timed newCurrentTimedElement) {
		Timed oldCurrentTimedElement = currentTimedElement;
		currentTimedElement = newCurrentTimedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT, oldCurrentTimedElement, currentTimedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEarliestDate() {
		return earliestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEarliestDate(Date newEarliestDate) {
		Date oldEarliestDate = earliestDate;
		earliestDate = newEarliestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE, oldEarliestDate, earliestDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getLatestDate() {
		return latestDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatestDate(Date newLatestDate) {
		Date oldLatestDate = latestDate;
		latestDate = newLatestDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE, oldLatestDate, latestDate));
	}

	@Override
	public void reset() 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Reset to start.", EventSeverity.INFO);
		
		if(!getTimedsList().isEmpty())
		{
			SortedSet<Timed> sorted = getTimeSortedTimedElements();
			setCurrentTimedElement(sorted.first());
			setTime(new Date(sorted.first().getTime().getTime()));
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void jumpToNext() 
	{				
		Logger.INSTANCE.log(Activator.ID, this, "Jumping to Next.", EventSeverity.INFO);
		
		Timed current = getCurrentTimedElement();
		if(current != null)
		{
			// Tries to find the next time in the sorted list.
			SortedSet<Timed> sorted = getTimeSortedTimedElements();
			
			SortedSet<Timed> tail = sorted.tailSet(current);
			if(tail.size() > 1)
			{
				Iterator<Timed> it = tail.iterator();
				it.next();
				Timed next = it.next();
				setCurrentTimedElement(next);
				setTime(new Date(next.getTime().getTime()));
			}
			else if(isLoopEnable())
			{
				if(!sorted.isEmpty())
				{
					Timed next = sorted.first();
					setCurrentTimedElement(next);
					setTime(new Date(next.getTime().getTime()));
				}
			}
		}
	}

	@Override
	public void setTime(Date newTime) {
	
		System.out.println("TIME : " + newTime);
		
		super.setTime(newTime);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void jumpToPrevious() 
	{
		Logger.INSTANCE.log(Activator.ID, this, "Jumping to Previous.", EventSeverity.INFO);
		
		Timed current = getCurrentTimedElement();
		if(current != null)
		{
			// Tries to find the next time in the sorted list.
			SortedSet<Timed> sorted = getTimeSortedTimedElements();
			
			SortedSet<Timed> head = sorted.headSet(current);
			if(!head.isEmpty())
			{
				Timed previous = head.last();
				setCurrentTimedElement(previous);
				setTime(new Date(previous.getTime().getTime()));
			}
			else if(isLoopEnable())
			{
				if(!sorted.isEmpty())
				{
					Timed next = sorted.last();
					setCurrentTimedElement(next);
					setTime(new Date(next.getTime().getTime()));
				}
			}
		}
	}

	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE:
				return isLoopEnable();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST:
				return getTimedsList();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT:
				if (resolve) return getCurrentTimedElement();
				return basicGetCurrentTimedElement();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE:
				return getEarliestDate();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE:
				return getLatestDate();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE:
				setLoopEnable((Boolean)newValue);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST:
				getTimedsList().clear();
				getTimedsList().addAll((Collection<? extends Timed>)newValue);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT:
				setCurrentTimedElement((Timed)newValue);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE:
				setEarliestDate((Date)newValue);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE:
				setLatestDate((Date)newValue);
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
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE:
				setLoopEnable(LOOP_ENABLE_EDEFAULT);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST:
				getTimedsList().clear();
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT:
				setCurrentTimedElement((Timed)null);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE:
				setEarliestDate(EARLIEST_DATE_EDEFAULT);
				return;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE:
				setLatestDate(LATEST_DATE_EDEFAULT);
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
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LOOP_ENABLE:
				return loopEnable != LOOP_ENABLE_EDEFAULT;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST:
				return timedsList != null && !timedsList.isEmpty();
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__CURRENT_TIMED_ELEMENT:
				return currentTimedElement != null;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__EARLIEST_DATE:
				return EARLIEST_DATE_EDEFAULT == null ? earliestDate != null : !EARLIEST_DATE_EDEFAULT.equals(earliestDate);
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__LATEST_DATE:
				return LATEST_DATE_EDEFAULT == null ? latestDate != null : !LATEST_DATE_EDEFAULT.equals(latestDate);
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
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_NEXT:
				jumpToNext();
				return null;
			case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE___JUMP_TO_PREVIOUS:
				jumpToPrevious();
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
		result.append(" (loopEnable: ");
		result.append(loopEnable);
		result.append(", earliestDate: ");
		result.append(earliestDate);
		result.append(", latestDate: ");
		result.append(latestDate);
		result.append(')');
		return result.toString();
	}

	protected SortedSet<Timed> getTimeSortedTimedElements()
	{
		if(getTimedsList() != null)
		{
			return Symphony__CommonEMFFacade.INSTANCE.sortTimed(getTimedsList());
		}
		else
		{
			return new TreeSet<Timed>();
		}							
	}
	
	@Override
	protected Job getUpdateJob() 
	{
		if(updateJob == null)
		{
			updateJob = new Job("CollectionTimedTimeSource update") 
			{			
				private long lastTime = -1;
				
				@Override
				protected IStatus run(IProgressMonitor monitor) 
				{
					if(!monitor.isCanceled() && !disposed)
					{						
						try
						{		
							if(getEarliestDate() != null && getLatestDate() != null)
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
										
										if(getLatestDate() != null && getEarliestDate() != null)
										{
											// If the end has been reached.
											if(newTime.getTime() > getLatestDate().getTime() && getTimeDirection() == TimeDirection.FORWARD)
											{
												if(isLoopEnable() && getEarliestDate() != null)
												{
													// Loop back to the start.
													newTime = new Date(getEarliestDate().getTime());
												}
												else
												{
													// Saturate at the end
													newTime = new Date(getLatestDate().getTime());
												}
											}
											// If the beginning has been reached.
											else if(newTime.getTime() < getEarliestDate().getTime() && getTimeDirection() == TimeDirection.REVERSE)
											{
												if(isLoopEnable() && getEarliestDate() != null)
												{
													// Loop back to the end.
													newTime = new Date(getLatestDate().getTime());
												}
												else
												{
													// Saturate at the start
													newTime = new Date(getEarliestDate().getTime());
												}
											}
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

	private Adapter getTimedsListAdapter() 
	{
		if(timedsListAdapter == null)
		{
			timedsListAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof CollectionTimedTimeSource)
					{
						int featureId = msg.getFeatureID(CollectionTimedTimeSource.class);
						
						switch (featureId) 
						{
							case Symphony__CommonEMFPackage.COLLECTION_TIMED_TIME_SOURCE__TIMEDS_LIST:
							{
								// Initialize the current timed element and time.
								SortedSet<Timed> sorted = getTimeSortedTimedElements();
								if(!sorted.isEmpty())
								{
									Timed element = sorted.first();
									setCurrentTimedElement(element);
									setTime(new Date(element.getTime().getTime()));
									
									setEarliestDate(new Date(sorted.first().getTime().getTime()));
									setLatestDate(new Date(sorted.last().getTime().getTime()));
								}
							}
							
							break;

							default:
							break;
						}
					}
					
				}
			};
		}
		return timedsListAdapter;
	}
	
} //CollectionTimedTimeSourceImpl
