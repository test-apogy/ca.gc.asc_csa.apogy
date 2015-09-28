/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl;

import static ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage.ADAPTER;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Player;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.PlayerDirection;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.PlayerState;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Recorder;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecorderState;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Recording;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorRecordingsPackageImpl extends EPackageImpl implements EMFEcoreInvocatorRecordingsPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass emfEcoreInvocatorRecordingsFacadeEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum recorderStateEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum recordingPolicyEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum fixedPeriodValuesEEnum = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EEnum playerStateEEnum = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum playerDirectionEEnum = null;

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recordingResultEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recordingTrackEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recordingEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass recorderEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass channelEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass playerEClass = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType throwableEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType adapterEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType eStructuralFeatureEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType mapEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType listEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType collectionEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType sortedSetEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType dateEDataType = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EDataType stringBufferEDataType = null;

  /**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private EMFEcoreInvocatorRecordingsPackageImpl()
  {
		super(eNS_URI, EMFEcoreInvocatorRecordingsFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link EMFEcoreInvocatorRecordingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static EMFEcoreInvocatorRecordingsPackage init()
  {
		if (isInited) return (EMFEcoreInvocatorRecordingsPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorRecordingsPackage.eNS_URI);

		// Obtain or create and register package
		EMFEcoreInvocatorRecordingsPackageImpl theEMFEcoreInvocatorRecordingsPackage = (EMFEcoreInvocatorRecordingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EMFEcoreInvocatorRecordingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EMFEcoreInvocatorRecordingsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EMFEcoreInvocatorPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theEMFEcoreInvocatorRecordingsPackage.createPackageContents();

		// Initialize created meta-data
		theEMFEcoreInvocatorRecordingsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEMFEcoreInvocatorRecordingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EMFEcoreInvocatorRecordingsPackage.eNS_URI, theEMFEcoreInvocatorRecordingsPackage);
		return theEMFEcoreInvocatorRecordingsPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getEMFEcoreInvocatorRecordingsFacade()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetResultValue__RecordingResult()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingPeriodInSeconds__FixedPeriodValues()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__Collection()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedRecordingResults__Collection()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__RecordingTrack()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsBefore__SortedSet_Date_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(5);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsAfter__SortedSet_Date_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(6);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsInInterval__SortedSet_Date_Date_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(7);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__Collection()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(8);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedAbstractResults__Collection()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(9);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__DataProductsList()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(10);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsBefore__SortedSet_Date_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(11);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsAfter__SortedSet_Date_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(12);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsInInterval__SortedSet_Date_Date_boolean_boolean()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(13);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__CreateRecording__Recorder()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(14);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__ApplyRecordingResult__RecordingResult()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(15);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetChannels__List()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(16);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeTitleString()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(17);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeValueString__Date()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(18);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTitleString__Channel()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(19);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVValueString__RecordingResult()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(20);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTrackToCSV__RecordingTrack()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(21);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTracksToCSV__List()
  {
		return emfEcoreInvocatorRecordingsFacadeEClass.getEOperations().get(22);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getRecorderState()
  {
		return recorderStateEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecordingResult()
  {
		return recordingResultEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecordingResult_RecordingTrack()
  {
		return (EReference)recordingResultEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecordingTrack()
  {
		return recordingTrackEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecordingTrack_Channel()
  {
		return (EReference)recordingTrackEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecordingTrack_Recording()
  {
		return (EReference)recordingTrackEClass.getEStructuralFeatures().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecordingTrack_Results()
  {
		return (EReference)recordingTrackEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordingTrack_StartDate() {
		return (EAttribute)recordingTrackEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordingTrack_EndDate() {
		return (EAttribute)recordingTrackEClass.getEStructuralFeatures().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecordingTrack_Duration() {
		return (EAttribute)recordingTrackEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecording()
  {
		return recordingEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecording_RecordingTracks()
  {
		return (EReference)recordingEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecording_Duration() {
		return (EAttribute)recordingEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecording_StartDate() {
		return (EAttribute)recordingEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRecording_EndDate() {
		return (EAttribute)recordingEClass.getEStructuralFeatures().get(3);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRecording__GetRecordingResults()
  {
		return recordingEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getRecorder()
  {
		return recorderEClass;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecorder_Destination()
  {
		return (EReference)recorderEClass.getEStructuralFeatures().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRecorder_ChannelsLists() {
		return (EReference)recorderEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getRecorder_RecorderState()
  {
		return (EAttribute)recorderEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getRecorder_Recording()
  {
		return (EReference)recorderEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRecorder__Stop()
  {
		return recorderEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRecorder__Record()
  {
		return recorderEClass.getEOperations().get(1);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRecorder__Pause()
  {
		return recorderEClass.getEOperations().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getRecorder__Resume()
  {
		return recorderEClass.getEOperations().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRecorder__GetAllChannels() {
		return recorderEClass.getEOperations().get(4);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getChannel()
  {
		return channelEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_RecordingPolicy() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChannel_FixedPeriodValues() {
		return (EAttribute)channelEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EReference getChannel_Feature()
  {
		return (EReference)channelEClass.getEStructuralFeatures().get(2);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getPlayer()
  {
		return playerEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_Enabled() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(0);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_TimeSource() {
		return (EReference)playerEClass.getEStructuralFeatures().get(1);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlayer_Recordings() {
		return (EReference)playerEClass.getEStructuralFeatures().get(2);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPlayer_DataStartTime()
  {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(3);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EAttribute getPlayer_DataEndTime()
  {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(4);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayer_PlayBackTime() {
		return (EAttribute)playerEClass.getEStructuralFeatures().get(5);
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EOperation getPlayer__JumpTo__Date()
  {
		return playerEClass.getEOperations().get(0);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getRecordingPolicy()
  {
		return recordingPolicyEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getFixedPeriodValues()
  {
		return fixedPeriodValuesEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EEnum getPlayerState()
  {
		return playerStateEEnum;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlayerDirection() {
		return playerDirectionEEnum;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getThrowable()
  {
		return throwableEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getAdapter()
  {
		return adapterEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getEStructuralFeature()
  {
		return eStructuralFeatureEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getMap()
  {
		return mapEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getList()
  {
		return listEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getCollection()
  {
		return collectionEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getSortedSet()
  {
		return sortedSetEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getDate()
  {
		return dateEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EDataType getStringBuffer()
  {
		return stringBufferEDataType;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorRecordingsFactory getEMFEcoreInvocatorRecordingsFactory()
  {
		return (EMFEcoreInvocatorRecordingsFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		recordingResultEClass = createEClass(RECORDING_RESULT);
		createEReference(recordingResultEClass, RECORDING_RESULT__RECORDING_TRACK);

		recordingTrackEClass = createEClass(RECORDING_TRACK);
		createEReference(recordingTrackEClass, RECORDING_TRACK__CHANNEL);
		createEReference(recordingTrackEClass, RECORDING_TRACK__RECORDING);
		createEReference(recordingTrackEClass, RECORDING_TRACK__RESULTS);
		createEAttribute(recordingTrackEClass, RECORDING_TRACK__START_DATE);
		createEAttribute(recordingTrackEClass, RECORDING_TRACK__END_DATE);
		createEAttribute(recordingTrackEClass, RECORDING_TRACK__DURATION);

		recordingEClass = createEClass(RECORDING);
		createEReference(recordingEClass, RECORDING__RECORDING_TRACKS);
		createEAttribute(recordingEClass, RECORDING__DURATION);
		createEAttribute(recordingEClass, RECORDING__START_DATE);
		createEAttribute(recordingEClass, RECORDING__END_DATE);
		createEOperation(recordingEClass, RECORDING___GET_RECORDING_RESULTS);

		channelEClass = createEClass(CHANNEL);
		createEAttribute(channelEClass, CHANNEL__RECORDING_POLICY);
		createEAttribute(channelEClass, CHANNEL__FIXED_PERIOD_VALUES);
		createEReference(channelEClass, CHANNEL__FEATURE);

		recorderEClass = createEClass(RECORDER);
		createEReference(recorderEClass, RECORDER__DESTINATION);
		createEReference(recorderEClass, RECORDER__CHANNELS_LISTS);
		createEAttribute(recorderEClass, RECORDER__RECORDER_STATE);
		createEReference(recorderEClass, RECORDER__RECORDING);
		createEOperation(recorderEClass, RECORDER___STOP);
		createEOperation(recorderEClass, RECORDER___RECORD);
		createEOperation(recorderEClass, RECORDER___PAUSE);
		createEOperation(recorderEClass, RECORDER___RESUME);
		createEOperation(recorderEClass, RECORDER___GET_ALL_CHANNELS);

		playerEClass = createEClass(PLAYER);
		createEAttribute(playerEClass, PLAYER__ENABLED);
		createEReference(playerEClass, PLAYER__TIME_SOURCE);
		createEReference(playerEClass, PLAYER__RECORDINGS);
		createEAttribute(playerEClass, PLAYER__DATA_START_TIME);
		createEAttribute(playerEClass, PLAYER__DATA_END_TIME);
		createEAttribute(playerEClass, PLAYER__PLAY_BACK_TIME);
		createEOperation(playerEClass, PLAYER___JUMP_TO__DATE);

		emfEcoreInvocatorRecordingsFacadeEClass = createEClass(EMF_ECORE_INVOCATOR_RECORDINGS_FACADE);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RESULT_VALUE__RECORDINGRESULT);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_PERIOD_IN_SECONDS__FIXEDPERIODVALUES);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__COLLECTION);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_RECORDING_RESULTS__COLLECTION);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__RECORDINGTRACK);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__DATAPRODUCTSLIST);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN_BOOLEAN);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___CREATE_RECORDING__RECORDER);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___APPLY_RECORDING_RESULT__RECORDINGRESULT);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CHANNELS__LIST);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_TITLE_STRING);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_VALUE_STRING__DATE);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TITLE_STRING__CHANNEL);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_VALUE_STRING__RECORDINGRESULT);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACK_TO_CSV__RECORDINGTRACK);
		createEOperation(emfEcoreInvocatorRecordingsFacadeEClass, EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACKS_TO_CSV__LIST);

		// Create enums
		recordingPolicyEEnum = createEEnum(RECORDING_POLICY);
		fixedPeriodValuesEEnum = createEEnum(FIXED_PERIOD_VALUES);
		recorderStateEEnum = createEEnum(RECORDER_STATE);
		playerStateEEnum = createEEnum(PLAYER_STATE);
		playerDirectionEEnum = createEEnum(PLAYER_DIRECTION);

		// Create data types
		throwableEDataType = createEDataType(THROWABLE);
		adapterEDataType = createEDataType(ADAPTER);
		eStructuralFeatureEDataType = createEDataType(ESTRUCTURAL_FEATURE);
		mapEDataType = createEDataType(MAP);
		listEDataType = createEDataType(LIST);
		collectionEDataType = createEDataType(COLLECTION);
		sortedSetEDataType = createEDataType(SORTED_SET);
		dateEDataType = createEDataType(DATE);
		stringBufferEDataType = createEDataType(STRING_BUFFER);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EMFEcoreInvocatorPackage theEMFEcoreInvocatorPackage = (EMFEcoreInvocatorPackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcoreInvocatorPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
		EMFEcorePackage theEMFEcorePackage = (EMFEcorePackage)EPackage.Registry.INSTANCE.getEPackage(EMFEcorePackage.eNS_URI);

		// Create type parameters
		addETypeParameter(mapEDataType, "K");
		addETypeParameter(mapEDataType, "V");
		addETypeParameter(listEDataType, "T");
		addETypeParameter(collectionEDataType, "T");
		addETypeParameter(sortedSetEDataType, "T");

		// Set bounds for type parameters

		// Add supertypes to classes
		recordingResultEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractResult());
		recordingEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractResult());
		recordingEClass.getESuperTypes().add(theEMFEcorePackage.getNamed());
		recordingEClass.getESuperTypes().add(theEMFEcorePackage.getDescribed());
		channelEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractChannel());
		recorderEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractRecorder());
		playerEClass.getESuperTypes().add(theEMFEcoreInvocatorPackage.getAbstractPlayer());

		// Initialize classes, features, and operations; add parameters
		initEClass(recordingResultEClass, RecordingResult.class, "RecordingResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingResult_RecordingTrack(), this.getRecordingTrack(), this.getRecordingTrack_Results(), "recordingTrack", null, 1, 1, RecordingResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordingTrackEClass, RecordingTrack.class, "RecordingTrack", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecordingTrack_Channel(), this.getChannel(), null, "channel", null, 1, 1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordingTrack_Recording(), this.getRecording(), this.getRecording_RecordingTracks(), "recording", null, 0, 1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecordingTrack_Results(), this.getRecordingResult(), this.getRecordingResult_RecordingTrack(), "results", null, 0, -1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordingTrack_StartDate(), theEcorePackage.getEDate(), "startDate", null, 0, 1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordingTrack_EndDate(), theEcorePackage.getEDate(), "endDate", null, 0, 1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecordingTrack_Duration(), theEcorePackage.getEDouble(), "duration", "0", 0, 1, RecordingTrack.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recordingEClass, Recording.class, "Recording", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecording_RecordingTracks(), this.getRecordingTrack(), this.getRecordingTrack_Recording(), "recordingTracks", null, 0, -1, Recording.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecording_Duration(), theEcorePackage.getEDouble(), "duration", "0", 0, 1, Recording.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecording_StartDate(), theEcorePackage.getEDate(), "startDate", null, 0, 1, Recording.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecording_EndDate(), theEcorePackage.getEDate(), "endDate", null, 0, 1, Recording.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getRecording__GetRecordingResults(), null, "getRecordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(this.getList());
		EGenericType g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(channelEClass, Channel.class, "Channel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChannel_RecordingPolicy(), this.getRecordingPolicy(), "recordingPolicy", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChannel_FixedPeriodValues(), this.getFixedPeriodValues(), "fixedPeriodValues", null, 0, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChannel_Feature(), theEMFEcorePackage.getAbstractFeatureNode(), null, "feature", null, 1, 1, Channel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(recorderEClass, Recorder.class, "Recorder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRecorder_Destination(), theEMFEcoreInvocatorPackage.getDataProductsList(), null, "destination", null, 1, 1, Recorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecorder_ChannelsLists(), theEMFEcoreInvocatorPackage.getChannelsList(), null, "channelsLists", null, 0, -1, Recorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRecorder_RecorderState(), this.getRecorderState(), "recorderState", null, 0, 1, Recorder.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRecorder_Recording(), this.getRecording(), null, "recording", null, 0, 1, Recorder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getRecorder__Stop(), null, "stop", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Record(), null, "record", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Pause(), null, "pause", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEOperation(getRecorder__Resume(), null, "resume", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getRecorder__GetAllChannels(), null, "getAllChannels", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getChannel());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEClass(playerEClass, Player.class, "Player", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayer_Enabled(), theEcorePackage.getEBoolean(), "enabled", "false", 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_TimeSource(), theEMFEcorePackage.getTimeSource(), null, "timeSource", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlayer_Recordings(), this.getRecording(), null, "recordings", null, 0, -1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_DataStartTime(), theEcorePackage.getEDate(), "dataStartTime", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_DataEndTime(), theEcorePackage.getEDate(), "dataEndTime", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayer_PlayBackTime(), theEcorePackage.getEDate(), "playBackTime", null, 0, 1, Player.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getPlayer__JumpTo__Date(), null, "jumpTo", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(emfEcoreInvocatorRecordingsFacadeEClass, EMFEcoreInvocatorRecordingsFacade.class, "EMFEcoreInvocatorRecordingsFacade", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetResultValue__RecordingResult(), theEcorePackage.getEJavaObject(), "getResultValue", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecordingResult(), "recordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetRecordingPeriodInSeconds__FixedPeriodValues(), theEcorePackage.getEDouble(), "getRecordingPeriodInSeconds", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getFixedPeriodValues(), "periodValue", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__Collection(), null, "getTimeSortedRecordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "recordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedRecordingResults__Collection(), null, "getReversedTimeSortedRecordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "recordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__RecordingTrack(), null, "getTimeSortedRecordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecordingTrack(), "track", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsBefore__SortedSet_Date_boolean(), null, "getRecordingResultsBefore", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedRecordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsAfter__SortedSet_Date_boolean(), null, "getRecordingResultsAfter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedRecordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsInInterval__SortedSet_Date_Date_boolean(), null, "getRecordingResultsInInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedRecordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__Collection(), null, "getTimeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "abstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedAbstractResults__Collection(), null, "getReversedTimeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getCollection());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "abstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__DataProductsList(), null, "getTimeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEMFEcoreInvocatorPackage.getDataProductsList(), "dataProducts", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsBefore__SortedSet_Date_boolean(), null, "getAbstractResultsBefore", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsAfter__SortedSet_Date_boolean(), null, "getAbstractResultsAfter", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "inclusive", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsInInterval__SortedSet_Date_Date_boolean_boolean(), null, "getAbstractResultsInInterval", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "timeSortedAbstractResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "startDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "endDate", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "includeStart", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEBoolean(), "includeEnd", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getSortedSet());
		g2 = createEGenericType(theEMFEcoreInvocatorPackage.getAbstractResult());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__CreateRecording__Recorder(), this.getRecording(), "createRecording", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecorder(), "recorder", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__ApplyRecordingResult__RecordingResult(), null, "applyRecordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecordingResult(), "recordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetChannels__List(), null, "getChannels", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getRecordingResult());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "recordingResults", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getChannel());
		g1.getETypeArguments().add(g2);
		initEOperation(op, g1);

		initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeTitleString(), theEcorePackage.getEString(), "getCSVTimeTitleString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeValueString__Date(), theEcorePackage.getEString(), "getCSVTimeValueString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDate(), "date", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetCSVTitleString__Channel(), theEcorePackage.getEString(), "getCSVTitleString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getChannel(), "channel", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__GetCSVValueString__RecordingResult(), theEcorePackage.getEString(), "getCSVValueString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecordingResult(), "recordingResult", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTrackToCSV__RecordingTrack(), this.getStringBuffer(), "exportRecordingTrackToCSV", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getRecordingTrack(), "track", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTracksToCSV__List(), this.getStringBuffer(), "exportRecordingTracksToCSV", 0, 1, !IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(this.getList());
		g2 = createEGenericType(this.getRecordingTrack());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "tracks", 0, 1, !IS_UNIQUE, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(recordingPolicyEEnum, RecordingPolicy.class, "RecordingPolicy");
		addEEnumLiteral(recordingPolicyEEnum, RecordingPolicy.ON_CHANGE);
		addEEnumLiteral(recordingPolicyEEnum, RecordingPolicy.FIXED_PERIOD);

		initEEnum(fixedPeriodValuesEEnum, FixedPeriodValues.class, "FixedPeriodValues");
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.VERY_LONG_INTERVAL);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.LONG_INTERVAL);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.MEDIUM_INTERVAL);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.SHORT_INTERVAL);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.VERY_SHORT_INTERVAL);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.USER_DEFINED_1);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.USER_DEFINED_2);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.USER_DEFINED_3);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.USER_DEFINED_4);
		addEEnumLiteral(fixedPeriodValuesEEnum, FixedPeriodValues.USER_DEFINED_5);

		initEEnum(recorderStateEEnum, RecorderState.class, "RecorderState");
		addEEnumLiteral(recorderStateEEnum, RecorderState.STOPPED);
		addEEnumLiteral(recorderStateEEnum, RecorderState.RECORDING);
		addEEnumLiteral(recorderStateEEnum, RecorderState.PAUSED);

		initEEnum(playerStateEEnum, PlayerState.class, "PlayerState");
		addEEnumLiteral(playerStateEEnum, PlayerState.STOPPED);
		addEEnumLiteral(playerStateEEnum, PlayerState.PLAYING);
		addEEnumLiteral(playerStateEEnum, PlayerState.PAUSED);

		initEEnum(playerDirectionEEnum, PlayerDirection.class, "PlayerDirection");
		addEEnumLiteral(playerDirectionEEnum, PlayerDirection.FORWARD);
		addEEnumLiteral(playerDirectionEEnum, PlayerDirection.REVERSE);

		// Initialize data types
		initEDataType(throwableEDataType, Throwable.class, "Throwable", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(adapterEDataType, Adapter.class, "Adapter", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eStructuralFeatureEDataType, EStructuralFeature.class, "EStructuralFeature", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(mapEDataType, Map.class, "Map", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(listEDataType, List.class, "List", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(collectionEDataType, Collection.class, "Collection", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sortedSetEDataType, SortedSet.class, "SortedSet", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateEDataType, Date.class, "Date", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(stringBufferEDataType, StringBuffer.class, "StringBuffer", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //EMFEcoreInvocatorRecordingsPackageImpl
