/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.symphony.common.emf.EMFEcorePackage;
import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.core.invocator.impl.AbstractResultImpl;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingResult;
import org.eclipse.symphony.core.recordings.RecordingTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Recording</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl#getRecordingTracks <em>Recording Tracks</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl#getEndDate <em>End Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RecordingImpl extends AbstractResultImpl implements Recording
{
	private Adapter tracksAdapter = null;
	
  /**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getRecordingTracks() <em>Recording Tracks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRecordingTracks()
	 * @generated
	 * @ordered
	 */
  protected EList<RecordingTrack> recordingTracks;

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
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected RecordingImpl()
  {
		super();
		addListener(this);
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorRecordingsPackage.Literals.RECORDING;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME, oldName, name));
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<RecordingTrack> getRecordingTracks()
  {
		if (recordingTracks == null) {
			recordingTracks = new EObjectContainmentWithInverseEList<RecordingTrack>(RecordingTrack.class, this, EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS, EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__RECORDING);
		}
		return recordingTracks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION, oldDuration, duration));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE, oldStartDate, startDate));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getEndDate() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE, oldEndDate, endDate));
	}

		/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<RecordingResult> getRecordingResults()
  {
	  List<RecordingResult> recordingResults = new ArrayList<RecordingResult>();
	  
	  for(RecordingTrack track : getRecordingTracks())
	  {
		  recordingResults.addAll(track.getResults());
	  }
	  
	  return recordingResults;
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRecordingTracks()).basicAdd(otherEnd, msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				return ((InternalEList<?>)getRecordingTracks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME:
				return getName();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				return getRecordingTracks();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION:
				return getDuration();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE:
				return getStartDate();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE:
				return getEndDate();
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME:
				setName((String)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				getRecordingTracks().clear();
				getRecordingTracks().addAll((Collection<? extends RecordingTrack>)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION:
				setDuration((Double)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE:
				setStartDate((Date)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE:
				setEndDate((Date)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				getRecordingTracks().clear();
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE:
				setStartDate(START_DATE_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE:
				setEndDate(END_DATE_EDEFAULT);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS:
				return recordingTracks != null && !recordingTracks.isEmpty();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__DURATION:
				return duration != DURATION_EDEFAULT;
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__START_DATE:
				return START_DATE_EDEFAULT == null ? startDate != null : !START_DATE_EDEFAULT.equals(startDate);
			case EMFEcoreInvocatorRecordingsPackage.RECORDING__END_DATE:
				return END_DATE_EDEFAULT == null ? endDate != null : !END_DATE_EDEFAULT.equals(endDate);
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
		if (baseClass == Named.class) {
			switch (derivedFeatureID) {
				case EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME: return EMFEcorePackage.NAMED__NAME;
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
		if (baseClass == Named.class) {
			switch (baseFeatureID) {
				case EMFEcorePackage.NAMED__NAME: return EMFEcoreInvocatorRecordingsPackage.RECORDING__NAME;
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
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING___GET_RECORDING_RESULTS:
				return getRecordingResults();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", duration: ");
		result.append(duration);
		result.append(", startDate: ");
		result.append(startDate);
		result.append(", endDate: ");
		result.append(endDate);
		result.append(')');
		return result.toString();
	}

	private void updateStartEndAndDuration()
	{
		// Finds the earliest and latest date of the tracks.
		Date start = null;
		Date end = null;
		
		for(RecordingTrack track : getRecordingTracks())
		{
			Date trackStart = track.getStartDate();
			Date trackEnd = track.getEndDate();
			
			if(trackStart != null)
			{
				if(start == null)
				{
					start = new Date(trackStart.getTime());
				}
				else
				{
					if(trackStart.getTime() < start.getTime())
					{
						start = new Date(trackStart.getTime());;
					}
				}
			}
			
			if(trackEnd != null)
			{
				if(end == null)
				{
					end = new Date(trackEnd.getTime());
				}
				else
				{
					if(trackEnd.getTime() < end.getTime())
					{
						end = new Date(trackEnd.getTime());;
					}
				}	
			}
		}
		
		// Update start and end date.
		setStartDate(start);								
		setEndDate(end);
		
		// Compute and update duration.
		if(getStartDate() != null && getEndDate() != null)
		{
			setDuration((getEndDate().getTime() - getStartDate().getTime()) * 0.001);
		}
		else
		{
			setDuration(0);
		}
	}
	
	private void addListener(Recording recording)
	{
		if(recording != null)
		{
			recording.eAdapters().add(getTracksAdapter());
			
			for(RecordingTrack track : recording.getRecordingTracks())
			{
				addListener(track);
			}
		}
	}
			
	private void addListener(RecordingTrack track)
	{
		if(track != null)
		{
			track.eAdapters().add(getTracksAdapter());
		}
	}
	
	private void addListener(Collection<RecordingTrack> tracks)
	{
		for(RecordingTrack track : tracks)
		{
			addListener(track);
		}
	}
		
	private void removeListener(RecordingTrack track)
	{
		if(track != null)
		{
			track.eAdapters().remove(getTracksAdapter());
		}
	}
	
	private void removeListener(Collection<RecordingTrack> tracks)
	{
		for(RecordingTrack track : tracks)
		{
			removeListener(track);
		}
	}
	
	private Adapter getTracksAdapter() 
	{
		if(tracksAdapter == null)
		{	
			tracksAdapter = new AdapterImpl()
			{
				@SuppressWarnings("unchecked")
				@Override
				public void notifyChanged(Notification msg) 
				{				
					if(msg.getNotifier() instanceof Recording)
					{
						int featureId = msg.getFeatureID(Recording.class);
						
						if(featureId == EMFEcoreInvocatorRecordingsPackage.RECORDING__RECORDING_TRACKS)
						{													
							if(getRecordingTracks().size() > 0)
							{
								updateStartEndAndDuration();
							}
							
							// Adds or remove listener from tracks.
							int eventType = msg.getEventType();
							switch (eventType) 
							{
								case Notification.ADD:
									addListener((RecordingTrack) msg.getNewValue());
								break;
								
								case Notification.ADD_MANY:
									addListener((List<RecordingTrack>) msg.getNewValue());
								break;

								case Notification.REMOVE:
									removeListener((RecordingTrack) msg.getOldValue());
								break;
								
								case Notification.REMOVE_MANY:
									removeListener((List<RecordingTrack>) msg.getOldValue());
								break;

							default:
								break;
							}
							
						}
					}	
					else if(msg.getNotifier() instanceof RecordingTrack)
					{						
						int featureId = msg.getFeatureID(RecordingTrack.class);
						
						switch (featureId) 
						{
							case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK__DURATION:
								updateStartEndAndDuration();
							break;

						default:
							break;
						}
					}
				}
			};
		}
		return tracksAdapter;
	}

} //RecordingImpl
