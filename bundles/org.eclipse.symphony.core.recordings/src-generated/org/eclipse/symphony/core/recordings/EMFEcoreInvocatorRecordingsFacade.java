/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.invocator.AbstractResult;
import org.eclipse.symphony.core.invocator.DataProductsList;
import org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Utilities
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getEMFEcoreInvocatorRecordingsFacade()
 * @model
 * @generated
 */
public interface EMFEcoreInvocatorRecordingsFacade extends EObject
{
	public static final String SEPARATOR = ",";
	public static final String NEW_LINE = "\n";	
	
	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" recordingResultUnique="false"
	 * @generated
	 */
  Object getResultValue(RecordingResult recordingResult);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" periodValueUnique="false"
	 * @generated
	 */
  double getRecordingPeriodInSeconds(FixedPeriodValues periodValue);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" recordingResultsDataType="org.eclipse.symphony.core.recordings.Collection<org.eclipse.symphony.core.recordings.RecordingResult>" recordingResultsUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getTimeSortedRecordingResults(Collection<RecordingResult> recordingResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" recordingResultsDataType="org.eclipse.symphony.core.recordings.Collection<org.eclipse.symphony.core.recordings.RecordingResult>" recordingResultsUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getReversedTimeSortedRecordingResults(Collection<RecordingResult> recordingResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" trackUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getTimeSortedRecordingResults(RecordingTrack track);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsBefore(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsAfter(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" startDateDataType="org.eclipse.symphony.core.recordings.Date" startDateUnique="false" endDateDataType="org.eclipse.symphony.core.recordings.Date" endDateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsInInterval(SortedSet<RecordingResult> timeSortedRecordingResult, Date startDate, Date endDate, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" abstractResultsDataType="org.eclipse.symphony.core.recordings.Collection<org.eclipse.symphony.core.invocator.AbstractResult>" abstractResultsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getTimeSortedAbstractResults(Collection<AbstractResult> abstractResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" abstractResultsDataType="org.eclipse.symphony.core.recordings.Collection<org.eclipse.symphony.core.invocator.AbstractResult>" abstractResultsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getReversedTimeSortedAbstractResults(Collection<AbstractResult> abstractResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" dataProductsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getTimeSortedAbstractResults(DataProductsList dataProducts);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getAbstractResultsBefore(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getAbstractResultsAfter(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="org.eclipse.symphony.core.recordings.SortedSet<org.eclipse.symphony.core.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" startDateDataType="org.eclipse.symphony.core.recordings.Date" startDateUnique="false" endDateDataType="org.eclipse.symphony.core.recordings.Date" endDateUnique="false" includeStartUnique="false" includeEndUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getAbstractResultsInInterval(SortedSet<AbstractResult> timeSortedAbstractResults, Date startDate, Date endDate, boolean includeStart, boolean includeEnd);

  //
	public EMFEcoreInvocatorRecordingsFacade INSTANCE = EMFEcoreInvocatorRecordingsFacadeImpl.getInstance();


	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" recorderUnique="false"
	 * @generated
	 */
  Recording createRecording(Recorder recorder);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model recordingResultUnique="false"
	 * @generated
	 */
  void applyRecordingResult(RecordingResult recordingResult);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.List<org.eclipse.symphony.core.recordings.Channel>" unique="false" many="false" recordingResultsDataType="org.eclipse.symphony.core.recordings.List<org.eclipse.symphony.core.recordings.RecordingResult>" recordingResultsUnique="false" recordingResultsMany="false"
	 * @generated
	 */
  List<Channel> getChannels(List<RecordingResult> recordingResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
  String getCSVTimeTitleString();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" dateDataType="org.eclipse.symphony.core.recordings.Date" dateUnique="false"
	 * @generated
	 */
  String getCSVTimeValueString(Date date);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" channelUnique="false"
	 * @generated
	 */
  String getCSVTitleString(Channel channel);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model unique="false" recordingResultUnique="false"
	 * @generated
	 */
  String getCSVValueString(RecordingResult recordingResult);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.StringBuffer" unique="false" trackUnique="false"
	 * @generated
	 */
  StringBuffer exportRecordingTrackToCSV(RecordingTrack track);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.recordings.StringBuffer" unique="false" tracksDataType="org.eclipse.symphony.core.recordings.List<org.eclipse.symphony.core.recordings.RecordingTrack>" tracksUnique="false" tracksMany="false"
	 * @generated
	 */
  StringBuffer exportRecordingTracksToCSV(List<RecordingTrack> tracks);
  
} // EMFEcoreInvocatorRecordingsFacade
