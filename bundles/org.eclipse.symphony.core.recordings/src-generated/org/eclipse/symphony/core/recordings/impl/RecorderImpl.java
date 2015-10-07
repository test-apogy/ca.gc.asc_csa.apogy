/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.symphony.core.recordings.Channel;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFactory;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.FixedPeriodValues;
import org.eclipse.symphony.core.recordings.Recorder;
import org.eclipse.symphony.core.recordings.RecorderState;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingPolicy;
import org.eclipse.symphony.core.recordings.RecordingResult;
import org.eclipse.symphony.core.recordings.RecordingTrack;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.FeatureNodeAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractChannel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Context;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.WatchFeatureNodeAdapter;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.impl.AbstractRecorderImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Recorder</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl#getChannelsLists <em>Channels Lists</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl#getRecorderState <em>Recorder State</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl#getRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RecorderImpl extends AbstractRecorderImpl implements Recorder 
{
	private Map<Channel, WatchFeatureNodeAdapter> channelToFeatureNodeAdapterMap = new HashMap<Channel, WatchFeatureNodeAdapter>();
	private Map<Channel, RecordingTrack> channelToTrackMap = new HashMap<Channel, RecordingTrack>();
	
	private Map<FixedPeriodValues, Thread> fixedPeriodValuesToThreadMap = new HashMap<FixedPeriodValues, Thread>();
	private Map<FixedPeriodValues, FixedPeriodChannelUpdate> fixedPeriodValuesToFixedPeriodChannelUpdateMap = new HashMap<FixedPeriodValues, FixedPeriodChannelUpdate>();	
	private Map<FixedPeriodValues, List<Channel>> fixedPeriodValuesToChannelsMap = new HashMap<FixedPeriodValues, List<Channel>>();
	
	private boolean listenerEnabled = false;
	
	private Adapter channelAdapter = null;
	
	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
  protected DataProductsList destination;

  /**
	 * The cached value of the '{@link #getChannelsLists() <em>Channels Lists</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChannelsLists()
	 * @generated
	 * @ordered
	 */
	protected EList<ChannelsList> channelsLists;
		/**
	 * The default value of the '{@link #getRecorderState() <em>Recorder State</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRecorderState()
	 * @generated
	 * @ordered
	 */
  protected static final RecorderState RECORDER_STATE_EDEFAULT = RecorderState.STOPPED;
  /**
	 * The cached value of the '{@link #getRecorderState() <em>Recorder State</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRecorderState()
	 * @generated
	 * @ordered
	 */
  protected RecorderState recorderState = RECORDER_STATE_EDEFAULT;

  /**
	 * The cached value of the '{@link #getRecording() <em>Recording</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #getRecording()
	 * @generated
	 * @ordered
	 */
  protected Recording recording;

  /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected RecorderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EMFEcoreInvocatorRecordingsPackage.Literals.RECORDER;
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList getDestination()
  {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (DataProductsList)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public DataProductsList basicGetDestination()
  {
		return destination;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setDestination(DataProductsList newDestination)
  {
		DataProductsList oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION, oldDestination, destination));
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChannelsList> getChannelsLists() {
		if (channelsLists == null) {
			channelsLists = new EObjectResolvingEList<ChannelsList>(ChannelsList.class, this, EMFEcoreInvocatorRecordingsPackage.RECORDER__CHANNELS_LISTS);
		}
		return channelsLists;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecorderState getRecorderState()
  {
		return recorderState;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRecorderState(RecorderState newRecorderState)
  {
		RecorderState oldRecorderState = recorderState;
		recorderState = newRecorderState == null ? RECORDER_STATE_EDEFAULT : newRecorderState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDER_STATE, oldRecorderState, recorderState));
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recording getRecording()
  {
		if (recording != null && recording.eIsProxy()) {
			InternalEObject oldRecording = (InternalEObject)recording;
			recording = (Recording)eResolveProxy(oldRecording);
			if (recording != oldRecording) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING, oldRecording, recording));
			}
		}
		return recording;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recording basicGetRecording()
  {
		return recording;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void setRecording(Recording newRecording)
  {
		Recording oldRecording = recording;
		recording = newRecording;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING, oldRecording, recording));
	}

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void stop()
  {
	  if(getRecorderState() == RecorderState.RECORDING)
	  {
		  // Stops Listeners.
		  disableListeners();
		  
		  // Unregister Listeners.
		  unregisterListeners();
		  
		  // Update State.
		  setRecorderState(RecorderState.STOPPED);
	  }
	  else if(getRecorderState() == RecorderState.PAUSED)
	  {
		  // Unregister Listeners.
		  unregisterListeners();
		  
		  // Update State.
		  setRecorderState(RecorderState.STOPPED);
	  }
	  else
	  {
		  // TODO Error.
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void record()
  {
	  if(getRecorderState() == RecorderState.STOPPED)
	  {
		  if(getDestination() != null)
		  {
			  if(getAllChannels().size() > 0)
			  {				  				  
				  // Create a new Recording.
				  Recording recording = EMFEcoreInvocatorRecordingsFacade.INSTANCE.createRecording(this);
				  
				  // Put the recording in the current destination
				  getDestination().getRecordingResultsList().getResults().add(recording);
				  
				  // Refers to the recording.
				  setRecording(recording);				  
				  
				  // Initialize the channelToTrackMap.
				  initializeChannelToTrackMap();
				  
				  // Register listeners.
				  registerListeners();
				  				
				  // Start Listener
				  enableListeners();
				  
				  // Update state.
				  setRecorderState(RecorderState.RECORDING);
			  }
			  else
			  {
				  // Error : Nothing to Record.
			  }
		  }
		  else 
		  {
			  // TODO Error !
		  }
	  }
	  else
	  {
		  // TODO Error : Invalid state for command.
	  }
  }
  
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void pause()
  {
	  if(getRecorderState() == RecorderState.RECORDING)
	  {
		  // Pause Listeners.
		  disableListeners();
		  
		  // Update State.
		  setRecorderState(RecorderState.PAUSED);
	  }
	  else
	  {
		  // TODO Error.
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void resume()
  {
	  if(getRecorderState() == RecorderState.PAUSED)
	  {
		  // Pause Listeners.
		  enableListeners();
		  
		  // Update State.
		  setRecorderState(RecorderState.RECORDING);
	  }
	  else
	  {
		  // TODO Error.
	  }
  }
  
   /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
  public List<Channel> getAllChannels() 
  {
	  List<Channel> channels = new ArrayList<Channel>();
	  
	  for(ChannelsList channelsList : getChannelsLists())
	  {
		  if(channelsList.getChannels() != null)
		  {
			  for(AbstractChannel abstractChannel : channelsList.getChannels())
			  {
				  if(abstractChannel instanceof Channel)
				  {
					  channels.add((Channel) abstractChannel);
				  }
			  }			  
		  }
	  }
	  
	  return channels;
  }

  protected void disableListeners()
  {	  
	  listenerEnabled = false;
  }
  
  protected void enableListeners()
  {	  
	  listenerEnabled = true;
  }
  
  protected void registerChangeListener(final Channel channel)
  {
	  final WatchFeatureNodeAdapter watchFeatureNodeAdapter = EMFEcoreInvocatorFactory.eINSTANCE.createWatchFeatureNodeAdapter();
	  watchFeatureNodeAdapter.setFeatureNode(channel.getFeature());
	  
	  watchFeatureNodeAdapter.eAdapters().add(new AdapterImpl()
	  {				
			@Override
			public void notifyChanged(Notification notification) 
			{
				if(listenerEnabled)
				{				
					long now = System.currentTimeMillis();
					
					if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__CURRENT_VALUE)
					{							
						Object newValue = notification.getNewValue();
						addNewValue(now, newValue);						
					}
					else if(notification.getFeatureID(FeatureNodeAdapter.class) == EMFEcorePackage.FEATURE_NODE_ADAPTER__RESOLVED)
					{							
						// If resolved, add current value.
						if(notification.getNewBooleanValue())
						{
							Object newValue = watchFeatureNodeAdapter.getCurrentValue();
							addNewValue(now, newValue);
						}
					}
				}
			}
			
			private void addNewValue(long time, final Object newValue)
			{
				// Copies the result.
				Object copy = getCopy(newValue);
				
				if(copy != null)
				{						
					// Creates a result with the copy of the value in it.
					RecordingResult result = EMFEcoreInvocatorRecordingsFactory.eINSTANCE.createRecordingResult();
					result.setTime(new Date(time));
					result.setRecordingTrack(getRecordingTrack(channel));
					
					AbstractResultValue value = EMFEcoreInvocatorFacade.INSTANCE.createAbstractResultValue(copy);
					result.setResultValue(value);
					
					// Set the Context
					Context context = getRecording().getContext();
					result.setContext(context);						
					
					// Adds the result to the RecordingTrack.					
					getRecordingTrack(channel).getResults().add(result);																
				}
			}
		});
	    
	  // Adds the FeatureNodeAdapter to the Map.
	  channelToFeatureNodeAdapterMap.put(channel, watchFeatureNodeAdapter);	 
	  
	  // Register the ChannelSettingsAdapter on the Channel Settings.
	  channel.eAdapters().add(getChannelAdapter());
  }
  
  protected void unregisterChangeListener(final Channel channel)
  {
	  WatchFeatureNodeAdapter adapter = channelToFeatureNodeAdapterMap.get(channel);
	  if(adapter != null)
	  {
		  adapter.eAdapters().clear();
		  adapter.setSourceObject(null);
		  adapter.setFeatureNode(null);
		  
		  channelToFeatureNodeAdapterMap.remove(channel);
	  }	  
	  
	// Unregister the ChannelAdapter on the Channel.
	channel.eAdapters().remove(getChannelAdapter());
  }
    
  protected void registerPeriodicListener(Channel channel)
  {
	  FixedPeriodValues fixedPeriodValues = channel.getFixedPeriodValues();
	  
	  // Adds the channel to the proper list	  
	  List<Channel> channels = fixedPeriodValuesToChannelsMap.get(fixedPeriodValues);
	  if(channels == null)
	  {
		  channels = new ArrayList<Channel>();
		  
		  // Adds the Channels list to the map.
		  fixedPeriodValuesToChannelsMap.put(fixedPeriodValues, channels);		  
	  }
	  channels.add(channel);
	  
	  // Adds a Thread to handle the specified FixedPeriodValues if not already created.
	  Thread thread = fixedPeriodValuesToThreadMap.get(fixedPeriodValues);
	  if(thread == null)
	  {
		  
		  // Creates a FixedPeriodChannelUpdate.
		  FixedPeriodChannelUpdate fixedPeriodChannelUpdate  = fixedPeriodValuesToFixedPeriodChannelUpdateMap.get(fixedPeriodValues);
		  if(fixedPeriodChannelUpdate == null)
		  {
			  fixedPeriodChannelUpdate = new FixedPeriodChannelUpdate(fixedPeriodValues);
			  
			  // Adds the FixedPeriodChannelUpdate to the map.
			  fixedPeriodValuesToFixedPeriodChannelUpdateMap.put(fixedPeriodValues, fixedPeriodChannelUpdate);			  
		  }
		  		  
		  // Creates a thread to handle the FixedPeriodChannelUpdate.
		  thread = new Thread(fixedPeriodChannelUpdate);
		  
		  // Adds the Thread to the Map.
		  fixedPeriodValuesToThreadMap.put(fixedPeriodValues, thread);
		  
		  thread.start();
	  }
	  
	  // Register the ChannelAdapter on the Channel.
	  channel.eAdapters().add(getChannelAdapter());
  }
  
  protected void unregisterPeriodicListener(final Channel channel)
  {	
	  FixedPeriodValues fixedPeriodValue = channel.getFixedPeriodValues();
	  unregisterPeriodicListener(channel, fixedPeriodValue);
  }
  
  protected void unregisterPeriodicListener(final Channel channel, final FixedPeriodValues fixedPeriodValue)
  {	  	  	  
	  // Removes the Channel from the list of channel for the 
	  List<Channel> channels = fixedPeriodValuesToChannelsMap.get(fixedPeriodValue);
	  if(channels != null) 
	  {
		  channels.remove(channel);
		  
		  if(channels.size() == 0)
		  {
			  // Stop the UpdateChannel associated with the channel as there is no more channel for it to update.
			  FixedPeriodChannelUpdate channelUpdate = fixedPeriodValuesToFixedPeriodChannelUpdateMap.get(fixedPeriodValue);
			  if(channelUpdate != null)
			  {
				  // Stops the FixedPeriodChannelUpdate.
				  channelUpdate.stop();
				  
				  // Removes the FixedPeriodChannelUpdate from the map.
				  fixedPeriodValuesToFixedPeriodChannelUpdateMap.remove(fixedPeriodValue);
				  
				  // Clears the Thread associated with the FixedPeriodChannelUpdate
				  fixedPeriodValuesToThreadMap.remove(fixedPeriodValue);
			  }					 
		  }
	  }	 
	  
	  // Unregister the ChannelSettingsAdapter on the Channel Settings.
	  channel.eAdapters().remove(getChannelAdapter());
  }
  
  protected void unregisterListener(final Channel channel)
  {
	  switch(channel.getRecordingPolicy().getValue())
	  {
		  	case RecordingPolicy.ON_CHANGE_VALUE:
		  	{
		  		unregisterChangeListener(channel);
		  	}
		  	break;
		  	
		  	case RecordingPolicy.FIXED_PERIOD_VALUE:
		  	{
		  		unregisterPeriodicListener(channel);
		  	}
		  	break;
	  }	 
  }
  
  protected void unregisterListeners()
  {
	  for(Channel channel : getAllChannels())
	  {
		  unregisterListener(channel); 
	  }	  
  }
 
  protected void registerListener(final Channel channel)
  {
	  switch(channel.getRecordingPolicy().getValue())
	  {
		  	case RecordingPolicy.ON_CHANGE_VALUE:
		  	{
		  		registerChangeListener(channel);
		  	}
		  	break;
		  	
		  	case RecordingPolicy.FIXED_PERIOD_VALUE:
		  	{
		  		registerPeriodicListener(channel);
		  	}
		  	break;
	  }	 	 
  }
  
  protected void registerListeners()
  {
	  for(Channel channel : getAllChannels())
	  {
		  registerListener(channel);
	  }
  }
  
  protected Object getCopy(Object object)
  {
	  if(object instanceof EObject)
	  {
		  EObject eObject = (EObject) object;
		  return EcoreUtil.copy(eObject);
	  }
	  else if(object instanceof EEnum)
	  {
		  EEnum eEnum = (EEnum) object;
		  return eEnum;
	  }
	  else if(object instanceof String)
	  {		  
		  String string = (String) object;
		  return new String(string);
	  }
	  else if(object instanceof Boolean)
	  {
		  Boolean bool = (Boolean) object;
		  return new Boolean(bool.booleanValue());
	  }
	  else if(object instanceof Byte)
	  {
		  Byte aByte = (Byte) object;
		  return new Byte(aByte);
	  }
	  else if(object instanceof Short)
	  {
		  Short aShort = (Short) object;
		  return new Short(aShort);
	  }
	  else if(object instanceof Integer)
	  {
		  Integer aInteger = (Integer) object;
		  return new Integer(aInteger);
	  }
	  else if(object instanceof Long)
	  {
		  Long aLong = (Long) object;
		  return new Long(aLong);
	  }
	  else if(object instanceof Float)
	  {
		  Float aFloat = (Float) object;
		  return new Float(aFloat);
	  }
	  else if(object instanceof Double)
	  {
		  Double aDouble = (Double) object;
		  return new Double(aDouble);
	  }
	  else
	  {
		  return object;
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__CHANNELS_LISTS:
				return getChannelsLists();
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDER_STATE:
				return getRecorderState();
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING:
				if (resolve) return getRecording();
				return basicGetRecording();
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION:
				setDestination((DataProductsList)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__CHANNELS_LISTS:
				getChannelsLists().clear();
				getChannelsLists().addAll((Collection<? extends ChannelsList>)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDER_STATE:
				setRecorderState((RecorderState)newValue);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING:
				setRecording((Recording)newValue);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION:
				setDestination((DataProductsList)null);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__CHANNELS_LISTS:
				getChannelsLists().clear();
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDER_STATE:
				setRecorderState(RECORDER_STATE_EDEFAULT);
				return;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING:
				setRecording((Recording)null);
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__DESTINATION:
				return destination != null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__CHANNELS_LISTS:
				return channelsLists != null && !channelsLists.isEmpty();
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDER_STATE:
				return recorderState != RECORDER_STATE_EDEFAULT;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER__RECORDING:
				return recording != null;
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
			case EMFEcoreInvocatorRecordingsPackage.RECORDER___STOP:
				stop();
				return null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER___RECORD:
				record();
				return null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER___PAUSE:
				pause();
				return null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER___RESUME:
				resume();
				return null;
			case EMFEcoreInvocatorRecordingsPackage.RECORDER___GET_ALL_CHANNELS:
				return getAllChannels();
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
		result.append(" (recorderState: ");
		result.append(recorderState);
		result.append(')');
		return result.toString();
	}
  
  /**
   * Adapter used to react to change in a Channel Settings.
   * @return The adapter.
   */
  protected Adapter getChannelAdapter()
  {
	  if(channelAdapter == null)
	  {
		  channelAdapter = new AdapterImpl()
		  {
				@Override
				public void notifyChanged(Notification msg) 
				{
					if(msg.getEventType() != Notification.REMOVING_ADAPTER)
					{
						if(msg.getNotifier() instanceof Channel)
						{
							System.out.println("MSG " + msg);
							
							Channel channelSettings = (Channel) msg.getNotifier();
							
							int featureId = msg.getFeatureID(Channel.class);
							
							switch(featureId)
							{
								case EMFEcoreInvocatorRecordingsPackage.CHANNEL__FIXED_PERIOD_VALUES:
								{
									if(channelSettings.getRecordingPolicy() == RecordingPolicy.FIXED_PERIOD)
									{								
										FixedPeriodValues previousFixedPeriodValue = (FixedPeriodValues) msg.getOldValue();
										
										// Unregister previous listener from channel.
										unregisterPeriodicListener(channelSettings, previousFixedPeriodValue);
										
										// Register new listener to channel.
										registerListener(channelSettings);
									}
								}
								break;
								
								case EMFEcoreInvocatorRecordingsPackage.CHANNEL__RECORDING_POLICY:
								{
									// Unregister previous listener from channel.
									unregisterListener(channelSettings);
									
									// Register new listener to channel.
									registerListener(channelSettings);
								}
								break;
							
							}
														
						}
					}
				}  
		  };
	  }
	  
	  return channelAdapter;
  }
  
  protected void initializeChannelToTrackMap()
  {
	  if(channelToTrackMap == null)
	  {
		  channelToTrackMap = new HashMap<Channel, RecordingTrack>();
	  }
	  channelToTrackMap.clear();
	  
	  for(RecordingTrack track : getRecording().getRecordingTracks())
	  {
		  channelToTrackMap.put(track.getChannel(), track);
	  }	  
  }
  
  protected RecordingTrack getRecordingTrack(final Channel channel)
  {
	  return channelToTrackMap.get(channel);
  }
  
  /**
   * Class used to execute the periodic recording of the Channels using FixedPeriod update policy.
   * @author pallard
   *
   */
  protected class FixedPeriodChannelUpdate implements Runnable
  {	  
	  private boolean stop = false;	 	 
	  	  
	  private FixedPeriodValues fixedPeriodValues;
	  
	  public FixedPeriodChannelUpdate(FixedPeriodValues fixedPeriodValues)
	  {		  
		  System.out.println("FixedPeriodValues " + fixedPeriodValues);
		  
		  this.fixedPeriodValues = fixedPeriodValues;		  
	  }
	  
	  @Override
	  public void run() 
	  {
		  while(!stop)
		  {
			  if(listenerEnabled)
			  {
				  try
				  {
					  // Updates channels.
					  List<Channel> channels = fixedPeriodValuesToChannelsMap.get(this.fixedPeriodValues);
					  if(channels != null)
					  {
						  for(Channel channel : channels)
						  {
							  try
							  {								  								  																  
								  Object current_value = EMFEcoreInvocatorFacade.INSTANCE.getValue(channel.getFeature());
								  
								  long now = System.currentTimeMillis();
								  
								  System.out.println("FIXED " + current_value);
								  
								  Object copy = getCopy(current_value);
									
								  if(copy != null)
								  {						
										// Creates a result with the copy of the value in it.
										RecordingResult result = EMFEcoreInvocatorRecordingsFactory.eINSTANCE.createRecordingResult();
										result.setTime(new Date(now));
										result.setRecordingTrack(getRecordingTrack(channel));
										
										AbstractResultValue value = EMFEcoreInvocatorFacade.INSTANCE.createAbstractResultValue(copy);
										result.setResultValue(value);
										
										// Set the Context
										Context context = getRecording().getContext();
										result.setContext(context);						
										
										// Adds the result to the RecordingTrack.
										getRecordingTrack(channel).getResults().add(result);												
								  }	
							  }
							  catch(Throwable t)
							  {
								  t.printStackTrace();
							  }
						  }
					  }
				  }
				  catch(Throwable t)
				  {
					  t.printStackTrace();
				  }
				  // Wait for next update.
				  try 
				  {
					Thread.sleep(getPeriodMilliseconds());
				  } 
				  catch (InterruptedException e) 
				  {				
					e.printStackTrace();
				  }
			  }
			  else
			  {
				  try 
				  {
					Thread.sleep(10);
				  } 
				  catch (InterruptedException e) 
				  {				
					e.printStackTrace();
				  } 
			  }
		  }
	  }
	  
	  public void stop()
	  {
		  stop = true;
	  }
	  
	  private int getPeriodMilliseconds()
	  {
		  double period = EMFEcoreInvocatorRecordingsFacade.INSTANCE.getRecordingPeriodInSeconds(fixedPeriodValues);
		  return (int) Math.floor(period * 1000.0);
	  }
  }
} // RecorderImpl
