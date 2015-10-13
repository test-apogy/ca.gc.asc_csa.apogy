/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.impl;

import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.symphony.common.log.EventSeverity;
import org.eclipse.symphony.common.log.Logger;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.impl.AbstractPlayerImpl;
import org.eclipse.symphony.core.recordings.Activator;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.Player;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingResult;

import ca.gc.asc_csa.eclipse.emf.ecore.TimeSource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#isEnabled <em>Enabled</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#getTimeSource <em>Time Source</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#getRecordings <em>Recordings</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#getDataStartTime <em>Data Start Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#getDataEndTime <em>Data End Time</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl#getPlayBackTime <em>Play Back Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends AbstractPlayerImpl implements Player
{
	private Adapter playerAdapter = null;
	private Adapter timeSourceAdapter = null;
	private SortedSet<AbstractResult> timeSortedResults = null;	
	private Date previousTime = null;			
	private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'T' HH:mm:ss.SSS");

	
	/**
	 * The default value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEnabled() <em>Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean enabled = ENABLED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTimeSource() <em>Time Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeSource()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.symphony.common.emf.TimeSource timeSource;


	
	/**
	 * The cached value of the '{@link #getRecordings() <em>Recordings</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordings()
	 * @generated
	 * @ordered
	 */
	protected EList<Recording> recordings;
	
  /**
	 * The default value of the '{@link #getDataStartTime() <em>Data Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataStartTime()
	 * @generated
	 * @ordered
	 */
  protected static final Date DATA_START_TIME_EDEFAULT = null;
  /**
	 * The cached value of the '{@link #getDataStartTime() <em>Data Start Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataStartTime()
	 * @generated
	 * @ordered
	 */
  protected Date dataStartTime = DATA_START_TIME_EDEFAULT;
  /**
	 * The default value of the '{@link #getDataEndTime() <em>Data End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataEndTime()
	 * @generated
	 * @ordered
	 */
  protected static final Date DATA_END_TIME_EDEFAULT = null;
  /**
	 * The cached value of the '{@link #getDataEndTime() <em>Data End Time</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDataEndTime()
	 * @generated
	 * @ordered
	 */
  protected Date dataEndTime = DATA_END_TIME_EDEFAULT;
  /**
	 * The default value of the '{@link #getPlayBackTime() <em>Play Back Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayBackTime()
	 * @generated
	 * @ordered
	 */
	protected static final Date PLAY_BACK_TIME_EDEFAULT = null;

		/**
	 * The cached value of the '{@link #getPlayBackTime() <em>Play Back Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayBackTime()
	 * @generated
	 * @ordered
	 */
	protected Date playBackTime = PLAY_BACK_TIME_EDEFAULT;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  protected PlayerImpl()
  {
		super();
		
		eAdapters().add(getPlayerAdapter());
  }

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EClass eStaticClass()
  {
		return EMFEcoreInvocatorRecordingsPackage.Literals.PLAYER;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnabled() {
		return enabled;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnabled(boolean newEnabled) {
		boolean oldEnabled = enabled;
		enabled = newEnabled;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED, oldEnabled, enabled));
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.TimeSource getTimeSource() {
		if (timeSource != null && timeSource.eIsProxy()) {
			InternalEObject oldTimeSource = (InternalEObject)timeSource;
			timeSource = (org.eclipse.symphony.common.emf.TimeSource)eResolveProxy(oldTimeSource);
			if (timeSource != oldTimeSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE, oldTimeSource, timeSource));
			}
		}
		return timeSource;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.symphony.common.emf.TimeSource basicGetTimeSource() {
		return timeSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeSource(org.eclipse.symphony.common.emf.TimeSource newTimeSource) {
		org.eclipse.symphony.common.emf.TimeSource oldTimeSource = timeSource;
		timeSource = newTimeSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE, oldTimeSource, timeSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setTimeSource(TimeSource newTimeSource) 
	{
		// Unregister adapter from previous time source if applicable.
		if(this.timeSource != null)
		{
			this.timeSource.eAdapters().remove(getTimeSourceAdapter());
		}
		
		setTimeSourceGen(newTimeSource);
		
		
		// Register adapter to new time source if applicable.
		if(newTimeSource != null)
		{
			newTimeSource.eAdapters().add(getTimeSourceAdapter());
		}		
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Recording> getRecordings() {
		if (recordings == null) {
			recordings = new EObjectResolvingEList<Recording>(Recording.class, this, EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS);
		}
		return recordings;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getDataStartTime()
  {
		return dataStartTime;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataStartTime(Date newDataStartTime)
  {
		Date oldDataStartTime = dataStartTime;
		dataStartTime = newDataStartTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME, oldDataStartTime, dataStartTime));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date getDataEndTime()
  {
		return dataEndTime;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDataEndTime(Date newDataEndTime)
  {
		Date oldDataEndTime = dataEndTime;
		dataEndTime = newDataEndTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME, oldDataEndTime, dataEndTime));
	}
  
  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPlayBackTime() {
		return playBackTime;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayBackTime(Date newPlayBackTime) {
		Date oldPlayBackTime = playBackTime;
		playBackTime = newPlayBackTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME, oldPlayBackTime, playBackTime));
	}
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void jumpTo(Date date)
  {
	  if(isEnabled())
	  {
		  Logger.INSTANCE.log(Activator.ID, this, "Jumping to time <" + dateFormat.format(date) + ">...", EventSeverity.INFO);
		  		    
		  // Update the current result with the delta between the current time an the jump time.
		  update(getPlayBackTime(), date);
		  
		  // Updates the PlayBackTime.
		  setPlayBackTime(date);		 
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
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED:
				return isEnabled();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE:
				if (resolve) return getTimeSource();
				return basicGetTimeSource();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS:
				return getRecordings();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME:
				return getDataStartTime();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME:
				return getDataEndTime();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME:
				return getPlayBackTime();
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
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED:
				setEnabled((Boolean)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.TimeSource)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS:
				getRecordings().clear();
				getRecordings().addAll((Collection<? extends Recording>)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME:
				setDataStartTime((Date)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME:
				setDataEndTime((Date)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME:
				setPlayBackTime((Date)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED:
				setEnabled(ENABLED_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE:
				setTimeSource((org.eclipse.symphony.common.emf.TimeSource)null);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS:
				getRecordings().clear();
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME:
				setDataStartTime(DATA_START_TIME_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME:
				setDataEndTime(DATA_END_TIME_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME:
				setPlayBackTime(PLAY_BACK_TIME_EDEFAULT);
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
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__ENABLED:
				return enabled != ENABLED_EDEFAULT;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__TIME_SOURCE:
				return timeSource != null;
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS:
				return recordings != null && !recordings.isEmpty();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_START_TIME:
				return DATA_START_TIME_EDEFAULT == null ? dataStartTime != null : !DATA_START_TIME_EDEFAULT.equals(dataStartTime);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__DATA_END_TIME:
				return DATA_END_TIME_EDEFAULT == null ? dataEndTime != null : !DATA_END_TIME_EDEFAULT.equals(dataEndTime);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER__PLAY_BACK_TIME:
				return PLAY_BACK_TIME_EDEFAULT == null ? playBackTime != null : !PLAY_BACK_TIME_EDEFAULT.equals(playBackTime);
		}
		return super.eIsSet(featureID);
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
			case EMFEcoreInvocatorRecordingsPackage.PLAYER___JUMP_TO__DATE:
				jumpTo((Date)arguments.get(0));
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
		result.append(" (enabled: ");
		result.append(enabled);
		result.append(", dataStartTime: ");
		result.append(dataStartTime);
		result.append(", dataEndTime: ");
		result.append(dataEndTime);
		result.append(", playBackTime: ");
		result.append(playBackTime);
		result.append(')');
		return result.toString();
	}
  
  protected SortedSet<AbstractResult> getAllResultSorted()
  {
	  List<AbstractResult> results = new ArrayList<AbstractResult>();
	  for(Recording recording : getRecordings())
	  {
		  results.addAll(recording.getRecordingResults());
	  }
		 
	  return  EMFEcoreInvocatorRecordingsFacade.INSTANCE.getTimeSortedAbstractResults(results);
  }
  
  private void update(final Date previousTime, final Date currentTime)
  {
	  if(previousTime.getTime() <= currentTime.getTime())
	  {
		  // Moving forward in time.
		  SortedSet<AbstractResult> results  = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getAbstractResultsInInterval(timeSortedResults, previousTime, currentTime, false, true);
		  		  
		  // Apply Data
		  applyAbstractResult(results);
	  }
	  else
	  {
		  // Moving backward in time.
		  SortedSet<AbstractResult> newResults = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getAbstractResultsInInterval(timeSortedResults, currentTime, previousTime, true, false);
		  
		  // Sort newResult from oldest to newest/
		  SortedSet<AbstractResult> results = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getReversedTimeSortedAbstractResults(newResults);		  		 		 
		  
		  // Apply Data
		  applyAbstractResult(results);
	  }
  }
  
  private void applyAbstractResult(SortedSet<AbstractResult> results)
  {
	  for(AbstractResult abstractResult : results)
	  {
		  if(abstractResult instanceof RecordingResult)
		  {
			  applyResult((RecordingResult) abstractResult);
		  }
	  }
  }
  
  private void applyResult(RecordingResult recordingResult)
  {
	  try
	  {
		  EMFEcoreInvocatorRecordingsFacade.INSTANCE.applyRecordingResult(recordingResult);
	  }
	  catch(Throwable t)
	  {
		  t.printStackTrace();
	  }
  }
   
  private Adapter getPlayerAdapter() 
  {
	  if(playerAdapter == null)
	  {
		  playerAdapter = new AdapterImpl()
		  {
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof Player)
					{
						int featureId = msg.getFeatureID(Player.class);
						switch (featureId) 
						{
							case EMFEcoreInvocatorRecordingsPackage.PLAYER__RECORDINGS:
							{
								// Update time sorted results.
								timeSortedResults = getAllResultSorted();
								
								if(!timeSortedResults.isEmpty())
								{
									// Update start and end times.
									Date startTime = new Date(timeSortedResults.first().getTime().getTime());
									setDataStartTime(startTime);
									
									Date endTime = new Date(timeSortedResults.last().getTime().getTime());
									setDataEndTime(endTime);
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
	  return playerAdapter;
  }

  private Adapter getTimeSourceAdapter() 
  {
	  if(timeSourceAdapter == null)
	  {
		  timeSourceAdapter = new AdapterImpl()
		  {
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getNotifier() instanceof TimeSource)
					{
						if(msg.getNewValue() instanceof Date)
						{
							Date newTime = (Date) msg.getNewValue();
							
							try
							{
								// Initialize previous time.
								if(previousTime == null)
								{
									previousTime = new Date(newTime.getTime());
								}
								
								setPlayBackTime(newTime);										
							
								// Update the data.
								update(previousTime, newTime);
								
								// Update previous time.
								previousTime = new Date(newTime.getTime());
							}
							catch(Throwable t)
							{
								t.printStackTrace();
							}
						}
					}
				}  
		  };
	  }
	  return timeSourceAdapter;
  }  
} //PlayerImpl
