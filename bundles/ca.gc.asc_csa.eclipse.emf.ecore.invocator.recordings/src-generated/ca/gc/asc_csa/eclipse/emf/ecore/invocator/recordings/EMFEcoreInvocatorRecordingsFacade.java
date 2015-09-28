/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;


import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl;

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
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getEMFEcoreInvocatorRecordingsFacade()
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
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" recordingResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Collection<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" recordingResultsUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getTimeSortedRecordingResults(Collection<RecordingResult> recordingResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" recordingResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Collection<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" recordingResultsUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getReversedTimeSortedRecordingResults(Collection<RecordingResult> recordingResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" trackUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getTimeSortedRecordingResults(RecordingTrack track);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" dateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsBefore(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" dateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsAfter(SortedSet<RecordingResult> timeSortedRecordingResult, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" unique="false" timeSortedRecordingResultDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" timeSortedRecordingResultUnique="false" startDateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" startDateUnique="false" endDateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" endDateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<RecordingResult> getRecordingResultsInInterval(SortedSet<RecordingResult> timeSortedRecordingResult, Date startDate, Date endDate, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" abstractResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Collection<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" abstractResultsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getTimeSortedAbstractResults(Collection<AbstractResult> abstractResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" abstractResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Collection<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" abstractResultsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getReversedTimeSortedAbstractResults(Collection<AbstractResult> abstractResults);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" dataProductsUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getTimeSortedAbstractResults(DataProductsList dataProducts);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" dateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getAbstractResultsBefore(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" dateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" dateUnique="false" inclusiveUnique="false"
	 * @generated
	 */
  SortedSet<AbstractResult> getAbstractResultsAfter(SortedSet<AbstractResult> timeSortedAbstractResults, Date date, boolean inclusive);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" unique="false" timeSortedAbstractResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.SortedSet<ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult>" timeSortedAbstractResultsUnique="false" startDateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" startDateUnique="false" endDateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" endDateUnique="false" includeStartUnique="false" includeEndUnique="false"
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
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.List<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel>" unique="false" many="false" recordingResultsDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.List<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult>" recordingResultsUnique="false" recordingResultsMany="false"
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
	 * @model unique="false" dateDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Date" dateUnique="false"
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
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.StringBuffer" unique="false" trackUnique="false"
	 * @generated
	 */
  StringBuffer exportRecordingTrackToCSV(RecordingTrack track);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.StringBuffer" unique="false" tracksDataType="ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.List<ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack>" tracksUnique="false" tracksMany="false"
	 * @generated
	 */
  StringBuffer exportRecordingTracksToCSV(List<RecordingTrack> tracks);
  
} // EMFEcoreInvocatorRecordingsFacade
