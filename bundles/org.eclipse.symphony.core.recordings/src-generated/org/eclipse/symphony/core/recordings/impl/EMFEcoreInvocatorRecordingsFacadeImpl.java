/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.recordings.AbstractResultTimeComparator;
import org.eclipse.symphony.core.recordings.Activator;
import org.eclipse.symphony.core.recordings.Channel;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFactory;
import org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage;
import org.eclipse.symphony.core.recordings.FixedPeriodValues;
import org.eclipse.symphony.core.recordings.Recorder;
import org.eclipse.symphony.core.recordings.Recording;
import org.eclipse.symphony.core.recordings.RecordingResult;
import org.eclipse.symphony.core.recordings.RecordingTrack;
import org.eclipse.symphony.core.recordings.csv.CSVAdapter;
import org.eclipse.symphony.core.recordings.csv.CSVAdaptersRegistry;

import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureNode;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractFeatureSpecifier;
import ca.gc.asc_csa.eclipse.emf.ecore.AbstractRootNode;
import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcoreFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AttributeResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ReferenceResultValue;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.TypeMemberReferenceTreeElement;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.Watch;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMFEcoreInvocatorRecordingsFacadeImpl extends MinimalEObjectImpl.Container implements EMFEcoreInvocatorRecordingsFacade
{	
	private static EMFEcoreInvocatorRecordingsFacade instance = null;
	
	public static EMFEcoreInvocatorRecordingsFacade getInstance() 
	{
		if (instance == null) 
		{
			instance = new EMFEcoreInvocatorRecordingsFacadeImpl();
		}
		return instance;
	}
	
	
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected EMFEcoreInvocatorRecordingsFacadeImpl()
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
		return EMFEcoreInvocatorRecordingsPackage.Literals.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE;
	}


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public double getRecordingPeriodInSeconds(FixedPeriodValues periodValue)
  { 
	  return Activator.getDefault().getRecordingPeriodInSeconds(periodValue);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getTimeSortedRecordingResults(Collection<RecordingResult> recordingResults)
  {
	  SortedSet<RecordingResult> results = new TreeSet<RecordingResult>(new AbstractResultTimeComparator());
		
	  results.addAll(recordingResults);
	
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getReversedTimeSortedRecordingResults(Collection<RecordingResult> recordingResults)
  {
	  SortedSet<RecordingResult> results = new TreeSet<RecordingResult>(new AbstractResultTimeComparator(false));
		
	  results.addAll(recordingResults);
	
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getTimeSortedRecordingResults(RecordingTrack track)
  {
	  return getTimeSortedRecordingResults(track.getResults());
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getRecordingResultsBefore(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive)
  {
	  SortedSet<RecordingResult> results = new TreeSet<RecordingResult>(new AbstractResultTimeComparator());
	  Iterator<RecordingResult> it = timeSortedRecordingResult.iterator();
	  while(it.hasNext())
	  {
		  RecordingResult recordingResult = it.next();
		  if(inclusive)
		  {
			  if(recordingResult.getTime().compareTo(date) <= 0) results.add(recordingResult);
		  }
		  else
		  {
			  if(recordingResult.getTime().compareTo(date) < 0) results.add(recordingResult);
		  }
	  }
	 
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getRecordingResultsAfter(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive)
  {
	  SortedSet<RecordingResult> results = new TreeSet<RecordingResult>(new AbstractResultTimeComparator());
	  Iterator<RecordingResult> it = timeSortedRecordingResult.iterator();
	  while(it.hasNext())
	  {
		  RecordingResult recordingResult = it.next();
		  if(inclusive)
		  {
			  if(recordingResult.getTime().compareTo(date) >= 0) results.add(recordingResult);
		  }
		  else
		  {
			  if(recordingResult.getTime().compareTo(date) > 0) results.add(recordingResult);
		  }
	  }
	 
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<RecordingResult> getRecordingResultsInInterval(SortedSet<RecordingResult> timeSortedRecordingResult, Date startDate, Date endDate, boolean inclusive)
  {
	  SortedSet<RecordingResult> results = new TreeSet<RecordingResult>(new AbstractResultTimeComparator());
	  Iterator<RecordingResult> it = timeSortedRecordingResult.iterator();
	  while(it.hasNext())
	  {
		  RecordingResult recordingResult = it.next();
		  Date date = recordingResult.getTime();
		  if(inclusive)
		  {			  
			  if(date.compareTo(startDate) >=0 && (date.compareTo(endDate) <= 0)) results.add(recordingResult);
		  }
		  else
		  {
			  if(date.compareTo(startDate) > 0 && (date.compareTo(endDate) < 0)) results.add(recordingResult);
		  }
	  }
	 
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getTimeSortedAbstractResults(Collection<AbstractResult> abstractResults)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator());
		
	  results.addAll(abstractResults);
	
	  return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getReversedTimeSortedAbstractResults(Collection<AbstractResult> abstractResults)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator(false));
		
	  results.addAll(abstractResults);
	
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getTimeSortedAbstractResults(DataProductsList dataProducts)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator());
	  
	  if(dataProducts.getOperationCallResultsList() != null)
	  {
		  results.addAll(dataProducts.getOperationCallResultsList().getResults());
	  }
	  
	  if(dataProducts.getRecordingResultsList() != null)
	  {
		  for(AbstractResult abstractResult : dataProducts.getRecordingResultsList().getResults())
		  {
			  if(abstractResult instanceof Recording)
			  {
				  Recording recording = (Recording) abstractResult;
				  results.addAll(recording.getRecordingResults());
			  }
			  else
			  {
				  results.add(abstractResult);
			  }
		  }		  
	  }
	  
	  return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getAbstractResultsBefore(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator());
	  Iterator<AbstractResult> it = timeSortedAbstractResults.iterator();
	  while(it.hasNext())
	  {
		  AbstractResult abstractResult = it.next();
		  if(inclusive)
		  {
			  if(abstractResult.getTime().compareTo(date) <= 0) results.add(abstractResult);
		  }
		  else
		  {
			  if(abstractResult.getTime().compareTo(date) < 0) results.add(abstractResult);
		  }
	  }
	 
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getAbstractResultsAfter(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator());
	  Iterator<AbstractResult> it = timeSortedAbstractResults.iterator();
	  while(it.hasNext())
	  {
		  AbstractResult abstractResult = it.next();
		  if(inclusive)
		  {
			  if(abstractResult.getTime().compareTo(date) >= 0) results.add(abstractResult);
		  }
		  else
		  {
			  if(abstractResult.getTime().compareTo(date) > 0) results.add(abstractResult);
		  }
	  }
	 
	  return results;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public SortedSet<AbstractResult> getAbstractResultsInInterval(SortedSet<AbstractResult> timeSortedAbstractResults, Date startDate, Date endDate, boolean includeStart, boolean includeEnd)
  {
	  SortedSet<AbstractResult> results = new TreeSet<AbstractResult>(new AbstractResultTimeComparator());
	  Iterator<AbstractResult> it = timeSortedAbstractResults.iterator();
	  while(it.hasNext())
	  {
		  AbstractResult abstractResult = it.next();
		  Date date = abstractResult.getTime();
		  
		  if(includeStart)
		  {
			  if(includeEnd)
			  {
				  if(date.compareTo(startDate) >=0 && (date.compareTo(endDate) <=0 )) results.add(abstractResult);
			  }
			  else
			  {
				  if(date.compareTo(startDate) >=0 && (date.compareTo(endDate) < 0 )) results.add(abstractResult);
			  }
		  }
		  else
		  {
			  if(includeEnd)
			  {
				  if(date.compareTo(startDate) > 0 && (date.compareTo(endDate) <=0 )) results.add(abstractResult);
			  }
			  else
			  {
				  if(date.compareTo(startDate) > 0 && (date.compareTo(endDate) < 0 )) results.add(abstractResult);
			  }
		  }		 
	  }
	 
	  return results;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Recording createRecording(Recorder recorder)
  {
	  Recording recording = EMFEcoreInvocatorRecordingsFactory.eINSTANCE.createRecording();	  
	  recording.setTime(new Date());
	  
	  // Creates a RecordingTrack for each Channel defined in the Recorder.
	  for(Channel channel : recorder.getAllChannels())
	  {
		  RecordingTrack track = EMFEcoreInvocatorRecordingsFactory.eINSTANCE.createRecordingTrack();
		  track.setChannel(channel);		  
		  recording.getRecordingTracks().add(track);
	  }
	  
	  return recording;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public void applyRecordingResult(RecordingResult recordingResult)
  {
	  // Gets the value of the channel.
	  Object value = getResultValue(recordingResult);
	  Channel channel = recordingResult.getRecordingTrack().getChannel();
	  
	  // Gets the feature associated with the result.
	  AbstractFeatureNode abstractFeatureNode = channel.getFeature();
	  AbstractRootNode rootNode = EMFEcoreFacade.INSTANCE.getFeatureRoot(abstractFeatureNode);
	  
	  if(rootNode.eContainer() instanceof Watch)
	  {
		  Watch watch = (Watch) rootNode.eContainer();
		  EObject target = EMFEcoreInvocatorFacade.INSTANCE.getInstance(watch.getVariable());
		  
		  if(target != null)
		  {
			  EMFEcoreFacade.INSTANCE.setValue(target, abstractFeatureNode, value);
		  }		 
	  }
	  else if(rootNode.eContainer() instanceof TypeMemberReferenceTreeElement)
	  {
		  TypeMemberReferenceTreeElement element = (TypeMemberReferenceTreeElement) rootNode.eContainer();
		  EObject target = EMFEcoreInvocatorFacade.INSTANCE.getInstance(element);
		  
		  if(target != null)
		  {
			  EMFEcoreFacade.INSTANCE.setValue(target, abstractFeatureNode, value);
		  }	
	  }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public List<Channel> getChannels(List<RecordingResult> recordingResults)
  {
	  List<Channel> channels = new ArrayList<Channel>();
	  
	  for(RecordingResult recordingResult : recordingResults)
	  {
		  if(!channels.contains(recordingResult.getRecordingTrack().getChannel())) channels.add(recordingResult.getRecordingTrack().getChannel());
	  }
	  
	  return channels;
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String getCSVTimeTitleString()
  {
	  List<String> timeHeader = CSVAdaptersRegistry.getInstance().getTitleColumns(Date.class);	  
	  return getCSVString(timeHeader);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String getCSVTimeValueString(Date date)
  {
	  List<String> timeValue = CSVAdaptersRegistry.getInstance().getValueColumns(date);	  
	  return getCSVString(timeValue);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String getCSVValueString(RecordingResult recordingResult)
  {
	  Object value = getResultValue(recordingResult);
	  
	  List<String> columnValues = null; 
	  if(value != null)
	  {	  
		  columnValues = CSVAdaptersRegistry.getInstance().getValueColumns(value);
	  }
	  else
	  {
		  columnValues = getEmptyValueString(recordingResult.getRecordingTrack().getChannel());
	  }
	  
	  return getCSVString(columnValues);
  }


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public StringBuffer exportRecordingTrackToCSV(RecordingTrack track)
  {
	  StringBuffer stringBuffer = new StringBuffer();
	  
	  // Gets the header line.
	  String timeHeader = getCSVTimeTitleString();
	  String channelHeader = getCSVTitleString(track.getChannel());
	  
	  stringBuffer.append(timeHeader + SEPARATOR + channelHeader + NEW_LINE);
	  
	  // Sort values by time
	  SortedSet<RecordingResult> sortedRecordingResult = getTimeSortedRecordingResults(track);
	  
	  if(track.getResults().size() > 0)
	  {
		  for(RecordingResult result : sortedRecordingResult)
		  {
			  String timeValue = getCSVTimeValueString(result.getTime());
			  String value = getCSVValueString(result);
			  
			  stringBuffer.append(timeValue + SEPARATOR + value + NEW_LINE);			  
		  }
	  }	 
	  
	  return stringBuffer;
  }



  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public StringBuffer exportRecordingTracksToCSV(List<RecordingTrack> tracks)
  {
	  StringBuffer stringBuffer = new StringBuffer();
	  
	  Map<RecordingTrack, String> recordingTracktoEmptyValuesStringMap = new HashMap<RecordingTrack, String>(); 
	  for(RecordingTrack track : tracks)
	  {
		  String emptyString = getCSVString(getEmptyValueString(track.getChannel()));
		  recordingTracktoEmptyValuesStringMap.put(track, emptyString);
	  }
	  
	  SortedMap<Date, String[]> dateToResults = new TreeMap<Date, String[]>();
	  
	  // Fills in the table.
	  for(RecordingTrack track : tracks)
	  {
		  for(RecordingResult recordingResult : track.getResults())
		  {
			  String[] line = dateToResults.get(recordingResult.getTime());
			  if(line == null)
			  {
				  line = new String[tracks.size()];				 
				  
				  // Fills the array with empty values strings.
				  for(int i = 0; i < tracks.size(); i++)
				  {
					  line[i] = recordingTracktoEmptyValuesStringMap.get(tracks.get(i));					  					  
				  }
				  
				  dateToResults.put(recordingResult.getTime(), line);
			  }
			  
			  // Creates the result string for the result.
			  line[tracks.indexOf(recordingResult.getRecordingTrack())] = getCSVValueString(recordingResult);
		  }
	  }

	  // Adds the time title.
	  stringBuffer.append(getCSVTimeTitleString() + SEPARATOR);
	  
	  // Adds the titles of the Channels
	  Iterator<RecordingTrack> it = tracks.iterator();
	  while(it.hasNext())
	  {
		  RecordingTrack track = it.next();
		  stringBuffer.append(getCSVTitleString(track.getChannel()));
		  if(it.hasNext()) stringBuffer.append(SEPARATOR);
	  }
	  stringBuffer.append(NEW_LINE);
	  
	  // Goes through the map and output each line to the buffer.
	  for(Date date : dateToResults.keySet())
	  {
		  String[] line =  dateToResults.get(date);
		  if(line != null)
		  {
			  // Adds the time columns.
			  String time = getCSVTimeValueString(date);
			  stringBuffer.append(time + SEPARATOR);
			  
			  // Adds the value columns.
			  for(int i = 0; i < line.length; i++)
			  {
				  stringBuffer.append(line[i]);
				  if((i + 1) < line.length)
				  {
					  stringBuffer.append(SEPARATOR);
				  }
			  }
			  stringBuffer.append(NEW_LINE);
		  }
	  }
	  
	  
	  return stringBuffer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public String getCSVTitleString(Channel channel)
  {
	  String headerString = new String();
	  
	  List<String> rawValueHeader = CSVAdaptersRegistry.getInstance().getTitleColumns(getChannelValueClass(channel));
	  List<String> formatedValueHeader = formatTitleString(rawValueHeader, channel);
	  
	  headerString = getCSVString(formatedValueHeader);
	  
	  return headerString;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated_NOT
   */
  public Object getResultValue(final RecordingResult recordingResult)
  {
	  Object value = null;
	  if(recordingResult.getResultValue() instanceof AttributeResultValue)
	  {
		  AttributeResultValue attributeResultValue = (AttributeResultValue) recordingResult.getResultValue();
		  if((attributeResultValue.getValue() != null) && attributeResultValue.getValue().getObject() != null)
		  {
			  value = attributeResultValue.getValue().getObject();
		  }	  		 
	  }
	  else if(recordingResult.getResultValue() instanceof ReferenceResultValue)
	  {
		  ReferenceResultValue referenceResultValue = (ReferenceResultValue) recordingResult.getResultValue();
		  value = referenceResultValue.getValue();
	  }
	  
	  return value;
  }
  
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  @SuppressWarnings("unchecked")
  public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException
  {
		switch (operationID) {
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RESULT_VALUE__RECORDINGRESULT:
				return getResultValue((RecordingResult)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_PERIOD_IN_SECONDS__FIXEDPERIODVALUES:
				return getRecordingPeriodInSeconds((FixedPeriodValues)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__COLLECTION:
				return getTimeSortedRecordingResults((Collection<RecordingResult>)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_RECORDING_RESULTS__COLLECTION:
				return getReversedTimeSortedRecordingResults((Collection<RecordingResult>)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__RECORDINGTRACK:
				return getTimeSortedRecordingResults((RecordingTrack)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN:
				return getRecordingResultsBefore((SortedSet<RecordingResult>)arguments.get(0), (Date)arguments.get(1), (Boolean)arguments.get(2));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN:
				return getRecordingResultsAfter((SortedSet<RecordingResult>)arguments.get(0), (Date)arguments.get(1), (Boolean)arguments.get(2));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN:
				return getRecordingResultsInInterval((SortedSet<RecordingResult>)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Boolean)arguments.get(3));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION:
				return getTimeSortedAbstractResults((Collection<AbstractResult>)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION:
				return getReversedTimeSortedAbstractResults((Collection<AbstractResult>)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__DATAPRODUCTSLIST:
				return getTimeSortedAbstractResults((DataProductsList)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN:
				return getAbstractResultsBefore((SortedSet<AbstractResult>)arguments.get(0), (Date)arguments.get(1), (Boolean)arguments.get(2));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN:
				return getAbstractResultsAfter((SortedSet<AbstractResult>)arguments.get(0), (Date)arguments.get(1), (Boolean)arguments.get(2));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN_BOOLEAN:
				return getAbstractResultsInInterval((SortedSet<AbstractResult>)arguments.get(0), (Date)arguments.get(1), (Date)arguments.get(2), (Boolean)arguments.get(3), (Boolean)arguments.get(4));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___CREATE_RECORDING__RECORDER:
				return createRecording((Recorder)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___APPLY_RECORDING_RESULT__RECORDINGRESULT:
				applyRecordingResult((RecordingResult)arguments.get(0));
				return null;
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CHANNELS__LIST:
				return getChannels((List<RecordingResult>)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_TITLE_STRING:
				return getCSVTimeTitleString();
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_VALUE_STRING__DATE:
				return getCSVTimeValueString((Date)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TITLE_STRING__CHANNEL:
				return getCSVTitleString((Channel)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_VALUE_STRING__RECORDINGRESULT:
				return getCSVValueString((RecordingResult)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACK_TO_CSV__RECORDINGTRACK:
				return exportRecordingTrackToCSV((RecordingTrack)arguments.get(0));
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACKS_TO_CSV__LIST:
				return exportRecordingTracksToCSV((List<RecordingTrack>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}
  
  private String getCSVString(List<String> list)
  {
	  String string = new String();
	  
	  Iterator<String> it  = list.iterator();
	  while(it.hasNext())
	  {
		  String v = it.next();
		  
		  if(v != null)
		  {
			  string+= v;
		  }
		  else
		  {
			  string+= CSVAdapter.EMPTY_VALUE;
		  }
		  
		  if(it.hasNext()) string+= SEPARATOR;
	  }
	  
	  return string;
  }
    
  private List<String> getEmptyValueString(Channel channel)
  {
	  List<String> resultList = new ArrayList<String>();
	  
	  Class<?> clazz = getChannelValueClass(channel);
	  	  
	  int numberOfColumns = CSVAdaptersRegistry.getInstance().getNumberOfColumns(clazz);
	  for(int i =0; i < numberOfColumns; i++)
	  {
		  resultList.add(CSVAdapter.EMPTY_VALUE);
	  }
	  	  
	  return resultList;
  }
  

  
  private Class<?> getChannelValueClass(final Channel channel)
  {
	  Class<?> clazz = null;
	  
	  AbstractFeatureNode node = channel.getFeature();
	  if(node instanceof AbstractFeatureSpecifier)
	  {
		  AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) node;
		  
		  EClassifier eClassifier = abstractFeatureSpecifier.getStructuralFeature().getEType();
		  if(eClassifier instanceof EDataType)
		  {
			  EDataType eDataType = (EDataType) eClassifier;
			  clazz = getClass(eDataType);
		  }
		  else
		  {
			  clazz = abstractFeatureSpecifier.getStructuralFeature().getEType().getInstanceClass();
		  }
	  }
	  
	  return clazz;
  }
  
  private Class<?> getClass(EDataType eDataType)
  {
	  if(eDataType.getInstanceClassName().compareToIgnoreCase("double") == 0)
	  {
		  return Double.class;
	  }
	  else if(eDataType.getInstanceClassName().compareToIgnoreCase("float") == 0)
	  {
		  return Float.class;
	  }
	  else if(eDataType.getInstanceClassName().compareToIgnoreCase("int") == 0)
	  {
		  return Integer.class;
	  }
	  else if(eDataType.getInstanceClassName().compareToIgnoreCase("long") == 0)
	  {
		  return Long.class;
	  }
	  else if(eDataType.getInstanceClassName().compareToIgnoreCase("string") == 0)
	  {
		  return String.class;
	  }
	  else if(eDataType.getInstanceClassName().compareToIgnoreCase("boolean") == 0)
	  {
		  return Boolean.class;
	  }
	  else
	  {
		  return eDataType.getInstanceClass();
	  }
  }
  
  private List<String> formatTitleString(List<String> rawTitleString, Channel channel)
  {
	  List<String> resultList = new ArrayList<String>();
	  String channelFeatureString =  EMFEcoreInvocatorFacade.INSTANCE.getFullyQualifiedName(channel.getFeature());
	  
	  String units = null;
	  if(channel.getFeature() instanceof AbstractFeatureSpecifier)
	  {
		  AbstractFeatureSpecifier abstractFeatureSpecifier = (AbstractFeatureSpecifier) channel.getFeature();		  
		  units = EMFEcoreFacade.INSTANCE.getEngineeringUnitsAsString(abstractFeatureSpecifier.getStructuralFeature());
	  }
	  
	  for(String s : rawTitleString)
	  {
		  String fullString = channelFeatureString;
		  
		  if(s != null && s.length() > 0) fullString += "." + s;
		  if(units != null) fullString += " (" + units + ")";
		  
		  resultList.add(fullString);
	  }
	  
	  return resultList;
  }
  
} //EMFEcoreInvocatorRecordingsFacadeImpl
