/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.impl;

import java.util.Collection;
import java.util.Date;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.core.recordings.Channel;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingResult;
import org.eclipse.symphony.core.recordings.RecordingTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording Track</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getRecording <em>Recording</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getResults <em>Results</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordingTrackImpl extends MinimalEObjectImpl.Container implements RecordingTrack
{
	private Adapter resultsAdapter = null;
	
  /**
	 * The cached value of the '{@link #getChannel() <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getChannel()
	 * @generated
	 * @ordered
	 */
  protected Channel channel;

  /**
	 * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getResults()
	 * @generated
	 * @ordered
	 */
  protected EList<RecordingResult> results;

  /**
	 * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date START_DATE_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartDate()
	 * @generated
	 * @ordered
	 */
	protected Date startDate = START_DATE_EDEFAULT;

		/**
	 * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date END_DATE_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndDate()
	 * @generated
	 * @ordered
	 */
	protected Date endDate = END_DATE_EDEFAULT;

		/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final double DURATION_EDEFAULT = 0.0;

		/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected double duration = DURATION_EDEFAULT;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected RecordingTrackImpl()
  {
		super();
		
		this.eAdapters().add(getResultsAdapter());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING_TRACK;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Channel getChannel()
  {
		if (channel != null && channel.eIsProxy()) {
			InternalEObject oldChannel = (InternalEObject)channel;
			channel = (Channel)eResolveProxy(oldChannel);
			if (channel != oldChannel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL, oldChannel, channel));
			}
		}
		return channel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Channel basicGetChannel()
  {
		return channel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setChannel(Channel newChannel)
  {
		Channel oldChannel = channel;
		channel = newChannel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL, oldChannel, channel));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recording getRecording()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING) return null;
		return (Recording)eContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recording basicGetRecording()
  {
		if (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING) return null;
		return (Recording)eInternalContainer();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public NotificationChain basicSetRecording(Recording newRecording, NotificationChain msgs)
  {
		msgs = eBasicSetContainer((InternalEObject)newRecording, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING, msgs);
		return msgs;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRecording(Recording newRecording)
  {
		if (newRecording != eInternalContainer() || (eContainerFeatureID() != EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING && newRecording != null)) {
			if (EcoreUtil.isAncestor(this, newRecording))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRecording != null)
				msgs = ((InternalEObject)newRecording).eInverseAdd(this, EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS, Recording.class, msgs);
			msgs = basicSetRecording(newRecording, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING, newRecording, newRecording));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RecordingResult> getResults()
  {
		if (results == null) {
			results = new EObjectContainmentWithInverseEList<RecordingResult>(RecordingResult.class, this, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS, EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT__RECORDING_TRACK);
		}
		return results;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getStartDate() 
	{
		return startDate;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartDate(Date newStartDate) {
		Date oldStartDate = startDate;
		startDate = newStartDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__START_DATE, oldStartDate, startDate));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() 
	{
		return endDate;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndDate(Date newEndDate) {
		Date oldEndDate = endDate;
		endDate = newEndDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__END_DATE, oldEndDate, endDate));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDuration() {
		return duration;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(double newDuration) {
		double oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION, oldDuration, duration));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @SuppressWarnings("unchecked")
  @Override
  public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRecording((Recording)otherEnd, msgs);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResults()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
		switch (featureID) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				return basicSetRecording(null, msgs);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs)
  {
		switch (eContainerFeatureID()) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				return eInternalContainer().eInverseRemove(this, EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS, Recording.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL:
				if (resolve) return getChannel();
				return basicGetChannel();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				if (resolve) return getRecording();
				return basicGetRecording();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				return getResults();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__START_DATE:
				return getStartDate();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__END_DATE:
				return getEndDate();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION:
				return getDuration();
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL:
				setChannel((Channel)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				setRecording((Recording)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				getResults().clear();
				getResults().addAll((Collection<? extends RecordingResult>)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__START_DATE:
				setStartDate((Date)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__END_DATE:
				setEndDate((Date)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION:
				setDuration((Double)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL:
				setChannel((Channel)null);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				setRecording((Recording)null);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				getResults().clear();
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION:
				setDuration(DURATION_EDEFAULT);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__CHANNEL:
				return channel != null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING:
				return basicGetRecording() != null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS:
				return results != null && !results.isEmpty();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION:
				return duration != DURATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(", duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}	
	
	private Adapter getResultsAdapter() 
	{
		if(resultsAdapter == null)
		{
			resultsAdapter = new AdapterImpl()
			{
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getNotifier() instanceof RecordingTrack)
					{
						int featureId = msg.getFeatureID(RecordingTrack.class);
						
						if(featureId == EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RESULTS)
						{
							SortedSet<RecordingResult> sortedSet = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getTimeSortedRecordingResults(RecordingTrackImpl.this);
																												
							if(sortedSet.size() > 1)
							{
								RecordingResult first = sortedSet.first();
								RecordingResult last = sortedSet.last();
							
								// Update start time.
								setStartDate(new Date(first.getTime().getTime()));
								
								// Update end time.
								setEndDate(new Date(last.getTime().getTime()));
							
								// Computes duration, in seconds.
								setDuration((last.getTime().getTime() - first.getTime().getTime()) * 0.001);
							}
							else
							{
								setStartDate(null);
								setEndDate(null);
								setDuration(0);
							}							
						}
					}										
				}
			};
		}
		return resultsAdapter;
	}
	
} //RecordingTrackImpl
