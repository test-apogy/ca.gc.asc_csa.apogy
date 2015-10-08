/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage;


/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='EMFEcoreInvocatorRecordings' childCreationExtenders='true' extensibleProviderFactory='true' multipleEditorPages='false' copyrightText='Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)' modelName='EMFEcoreInvocatorRecordings' modelDirectory='/org.eclipse.symphony.core.recordings/src-generated' editDirectory='/org.eclipse.symphony.core.recordings.edit/src-generated' basePackage='org.eclipse.symphony.core'"
 * @generated
 */
public interface EMFEcoreInvocatorRecordingsPackage extends EPackage
{
  /**
	 * The package name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNAME = "recordings";

  /**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_URI = "org.eclipse.symphony.core.recordings";

  /**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  String eNS_PREFIX = "recordings";

  /**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreInvocatorRecordingsPackage eINSTANCE = org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl.init();

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getEMFEcoreInvocatorRecordingsFacade()
	 * @generated
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE = 6;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingResultImpl <em>Recording Result</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.RecordingResultImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingResult()
	 * @generated
	 */
  int RECORDING_RESULT = 0;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT__TIME = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULT__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULT__RESULTS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST;

		/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_RESULT__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION;

		/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT__CONTEXT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT;

  /**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT__RESULT_VALUE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE;

  /**
	 * The feature id for the '<em><b>Recording Track</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT__RECORDING_TRACK = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 0;

  /**
	 * The number of structural features of the '<em>Recording Result</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 1;

  /**
	 * The number of operations of the '<em>Recording Result</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_RESULT_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl <em>Recording Track</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingTrack()
	 * @generated
	 */
  int RECORDING_TRACK = 1;

  /**
	 * The feature id for the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_TRACK__CHANNEL = 0;

  /**
	 * The feature id for the '<em><b>Recording</b></em>' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_TRACK__RECORDING = 1;

  /**
	 * The feature id for the '<em><b>Results</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_TRACK__RESULTS = 2;

  /**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TRACK__START_DATE = 3;

		/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TRACK__END_DATE = 4;

		/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING_TRACK__DURATION = 5;

		/**
	 * The number of structural features of the '<em>Recording Track</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_TRACK_FEATURE_COUNT = 6;

  /**
	 * The number of operations of the '<em>Recording Track</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_TRACK_OPERATION_COUNT = 0;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl <em>Recording</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.RecordingImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecording()
	 * @generated
	 */
  int RECORDING = 2;

  /**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING__TIME = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__TIME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Results List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__RESULTS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULTS_LIST;

		/**
	 * The feature id for the '<em><b>Invocator Session</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__INVOCATOR_SESSION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__INVOCATOR_SESSION;

		/**
	 * The feature id for the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING__CONTEXT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__CONTEXT;

		/**
	 * The feature id for the '<em><b>Result Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING__RESULT_VALUE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT__RESULT_VALUE;

		/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__NAME = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Recording Tracks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING__RECORDING_TRACKS = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 1;

  /**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__DURATION = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__START_DATE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 3;

		/**
	 * The feature id for the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDING__END_DATE = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 4;

		/**
	 * The number of structural features of the '<em>Recording</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_FEATURE_COUNT + 5;

  /**
	 * The operation id for the '<em>Get Recording Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING___GET_RECORDING_RESULTS = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Recording</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDING_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RESULT_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl <em>Recorder</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.RecorderImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecorder()
	 * @generated
	 */
  int RECORDER = 4;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.ChannelImpl <em>Channel</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.ChannelImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getChannel()
	 * @generated
	 */
  int CHANNEL = 3;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__NAME = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL__NAME;

		/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL__DESCRIPTION;

		/**
	 * The feature id for the '<em><b>Channels List</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__CHANNELS_LIST = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL__CHANNELS_LIST;

		/**
	 * The feature id for the '<em><b>Recording Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__RECORDING_POLICY = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Fixed Period Values</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANNEL__FIXED_PERIOD_VALUES = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHANNEL__FEATURE = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL_FEATURE_COUNT + 2;

  /**
	 * The number of structural features of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHANNEL_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL_FEATURE_COUNT + 3;

  /**
	 * The number of operations of the '<em>Channel</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int CHANNEL_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_CHANNEL_OPERATION_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER__NAME = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER__RECORDING_TOOLS_CONTAINER = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER__RECORDING_TOOLS_CONTAINER;

		/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER__DESTINATION = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_FEATURE_COUNT + 0;

  /**
	 * The feature id for the '<em><b>Channels Lists</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER__CHANNELS_LISTS = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Recorder State</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER__RECORDER_STATE = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_FEATURE_COUNT + 2;

  /**
	 * The feature id for the '<em><b>Recording</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER__RECORDING = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_FEATURE_COUNT + 3;

  /**
	 * The number of structural features of the '<em>Recorder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_FEATURE_COUNT + 4;

  /**
	 * The operation id for the '<em>Stop</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER___STOP = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 0;

  /**
	 * The operation id for the '<em>Record</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER___RECORD = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 1;

  /**
	 * The operation id for the '<em>Pause</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER___PAUSE = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 2;

  /**
	 * The operation id for the '<em>Resume</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER___RESUME = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 3;

  /**
	 * The operation id for the '<em>Get All Channels</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECORDER___GET_ALL_CHANNELS = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 4;

		/**
	 * The number of operations of the '<em>Recorder</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int RECORDER_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_RECORDER_OPERATION_COUNT + 5;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.impl.PlayerImpl
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayer()
	 * @generated
	 */
  int PLAYER = 5;

  /**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER__NAME = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER__NAME;

  /**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER__DESCRIPTION = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER__DESCRIPTION;

  /**
	 * The feature id for the '<em><b>Recording Tools Container</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__RECORDING_TOOLS_CONTAINER = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER__RECORDING_TOOLS_CONTAINER;

		/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ENABLED = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 0;

		/**
	 * The feature id for the '<em><b>Time Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TIME_SOURCE = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 1;

		/**
	 * The feature id for the '<em><b>Recordings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__RECORDINGS = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 2;

		/**
	 * The feature id for the '<em><b>Data Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER__DATA_START_TIME = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 3;

  /**
	 * The feature id for the '<em><b>Data End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER__DATA_END_TIME = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 4;

  /**
	 * The feature id for the '<em><b>Play Back Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAY_BACK_TIME = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 5;

		/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER_FEATURE_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_FEATURE_COUNT + 6;

  /**
	 * The operation id for the '<em>Jump To</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER___JUMP_TO__DATE = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_OPERATION_COUNT + 0;

  /**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int PLAYER_OPERATION_COUNT = EMFEcoreInvocatorPackage.ABSTRACT_PLAYER_OPERATION_COUNT + 1;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.RecordingPolicy <em>Recording Policy</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.RecordingPolicy
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingPolicy()
	 * @generated
	 */
  int RECORDING_POLICY = 7;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.FixedPeriodValues <em>Fixed Period Values</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.FixedPeriodValues
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getFixedPeriodValues()
	 * @generated
	 */
  int FIXED_PERIOD_VALUES = 8;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.PlayerState <em>Player State</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.PlayerState
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayerState()
	 * @generated
	 */
  int PLAYER_STATE = 10;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.PlayerDirection <em>Player Direction</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.PlayerDirection
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayerDirection()
	 * @generated
	 */
	int PLAYER_DIRECTION = 11;

		/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE_FEATURE_COUNT = 0;

  /**
	 * The operation id for the '<em>Get Result Value</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RESULT_VALUE__RECORDINGRESULT = 0;

  /**
	 * The operation id for the '<em>Get Recording Period In Seconds</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_PERIOD_IN_SECONDS__FIXEDPERIODVALUES = 1;

  /**
	 * The operation id for the '<em>Get Time Sorted Recording Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__COLLECTION = 2;

  /**
	 * The operation id for the '<em>Get Reversed Time Sorted Recording Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_RECORDING_RESULTS__COLLECTION = 3;

  /**
	 * The operation id for the '<em>Get Time Sorted Recording Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__RECORDINGTRACK = 4;

  /**
	 * The operation id for the '<em>Get Recording Results Before</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN = 5;

  /**
	 * The operation id for the '<em>Get Recording Results After</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN = 6;

  /**
	 * The operation id for the '<em>Get Recording Results In Interval</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN = 7;

  /**
	 * The operation id for the '<em>Get Time Sorted Abstract Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION = 8;

  /**
	 * The operation id for the '<em>Get Reversed Time Sorted Abstract Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION = 9;

  /**
	 * The operation id for the '<em>Get Time Sorted Abstract Results</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__DATAPRODUCTSLIST = 10;

  /**
	 * The operation id for the '<em>Get Abstract Results Before</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN = 11;

  /**
	 * The operation id for the '<em>Get Abstract Results After</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN = 12;

  /**
	 * The operation id for the '<em>Get Abstract Results In Interval</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN_BOOLEAN = 13;

  /**
	 * The operation id for the '<em>Create Recording</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___CREATE_RECORDING__RECORDER = 14;

  /**
	 * The operation id for the '<em>Apply Recording Result</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___APPLY_RECORDING_RESULT__RECORDINGRESULT = 15;

  /**
	 * The operation id for the '<em>Get Channels</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CHANNELS__LIST = 16;

  /**
	 * The operation id for the '<em>Get CSV Time Title String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_TITLE_STRING = 17;

  /**
	 * The operation id for the '<em>Get CSV Time Value String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_VALUE_STRING__DATE = 18;

  /**
	 * The operation id for the '<em>Get CSV Title String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TITLE_STRING__CHANNEL = 19;

  /**
	 * The operation id for the '<em>Get CSV Value String</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_VALUE_STRING__RECORDINGRESULT = 20;

  /**
	 * The operation id for the '<em>Export Recording Track To CSV</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACK_TO_CSV__RECORDINGTRACK = 21;

  /**
	 * The operation id for the '<em>Export Recording Tracks To CSV</em>' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACKS_TO_CSV__LIST = 22;

  /**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int EMF_ECORE_INVOCATOR_RECORDINGS_FACADE_OPERATION_COUNT = 23;

  /**
	 * The meta object id for the '{@link org.eclipse.symphony.core.recordings.RecorderState <em>Recorder State</em>}' enum.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.recordings.RecorderState
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecorderState()
	 * @generated
	 */
  int RECORDER_STATE = 9;

  /**
	 * The meta object id for the '<em>Throwable</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.Throwable
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getThrowable()
	 * @generated
	 */
  int THROWABLE = 12;


  /**
	 * The meta object id for the '<em>Adapter</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Adapter
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getAdapter()
	 * @generated
	 */
  int ADAPTER = 13;


  /**
	 * The meta object id for the '<em>EStructural Feature</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EStructuralFeature
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getEStructuralFeature()
	 * @generated
	 */
  int ESTRUCTURAL_FEATURE = 14;

  /**
	 * The meta object id for the '<em>Map</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Map
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getMap()
	 * @generated
	 */
  int MAP = 15;


  /**
	 * The meta object id for the '<em>List</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getList()
	 * @generated
	 */
  int LIST = 16;

  /**
	 * The meta object id for the '<em>Collection</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Collection
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getCollection()
	 * @generated
	 */
  int COLLECTION = 17;

  /**
	 * The meta object id for the '<em>Sorted Set</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.SortedSet
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getSortedSet()
	 * @generated
	 */
  int SORTED_SET = 18;

  /**
	 * The meta object id for the '<em>Date</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.util.Date
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getDate()
	 * @generated
	 */
  int DATE = 19;

  /**
	 * The meta object id for the '<em>String Buffer</em>' data type.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see java.lang.StringBuffer
	 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getStringBuffer()
	 * @generated
	 */
  int STRING_BUFFER = 20;

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade
	 * @generated
	 */
  EClass getEMFEcoreInvocatorRecordingsFacade();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getResultValue(org.eclipse.symphony.core.recordings.RecordingResult) <em>Get Result Value</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Result Value</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getResultValue(org.eclipse.symphony.core.recordings.RecordingResult)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetResultValue__RecordingResult();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingPeriodInSeconds(org.eclipse.symphony.core.recordings.FixedPeriodValues) <em>Get Recording Period In Seconds</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recording Period In Seconds</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingPeriodInSeconds(org.eclipse.symphony.core.recordings.FixedPeriodValues)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingPeriodInSeconds__FixedPeriodValues();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedRecordingResults(java.util.Collection) <em>Get Time Sorted Recording Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Sorted Recording Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedRecordingResults(java.util.Collection)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__Collection();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getReversedTimeSortedRecordingResults(java.util.Collection) <em>Get Reversed Time Sorted Recording Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reversed Time Sorted Recording Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getReversedTimeSortedRecordingResults(java.util.Collection)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedRecordingResults__Collection();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedRecordingResults(org.eclipse.symphony.core.recordings.RecordingTrack) <em>Get Time Sorted Recording Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Sorted Recording Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedRecordingResults(org.eclipse.symphony.core.recordings.RecordingTrack)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__RecordingTrack();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsBefore(java.util.SortedSet, java.util.Date, boolean) <em>Get Recording Results Before</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recording Results Before</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsBefore(java.util.SortedSet, java.util.Date, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsBefore__SortedSet_Date_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsAfter(java.util.SortedSet, java.util.Date, boolean) <em>Get Recording Results After</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recording Results After</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsAfter(java.util.SortedSet, java.util.Date, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsAfter__SortedSet_Date_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsInInterval(java.util.SortedSet, java.util.Date, java.util.Date, boolean) <em>Get Recording Results In Interval</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recording Results In Interval</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getRecordingResultsInInterval(java.util.SortedSet, java.util.Date, java.util.Date, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsInInterval__SortedSet_Date_Date_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedAbstractResults(java.util.Collection) <em>Get Time Sorted Abstract Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Sorted Abstract Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedAbstractResults(java.util.Collection)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__Collection();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getReversedTimeSortedAbstractResults(java.util.Collection) <em>Get Reversed Time Sorted Abstract Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reversed Time Sorted Abstract Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getReversedTimeSortedAbstractResults(java.util.Collection)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedAbstractResults__Collection();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedAbstractResults(org.eclipse.symphony.core.invocator.DataProductsList) <em>Get Time Sorted Abstract Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Time Sorted Abstract Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getTimeSortedAbstractResults(org.eclipse.symphony.core.invocator.DataProductsList)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__DataProductsList();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsBefore(java.util.SortedSet, java.util.Date, boolean) <em>Get Abstract Results Before</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Results Before</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsBefore(java.util.SortedSet, java.util.Date, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsBefore__SortedSet_Date_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsAfter(java.util.SortedSet, java.util.Date, boolean) <em>Get Abstract Results After</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Results After</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsAfter(java.util.SortedSet, java.util.Date, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsAfter__SortedSet_Date_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsInInterval(java.util.SortedSet, java.util.Date, java.util.Date, boolean, boolean) <em>Get Abstract Results In Interval</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Abstract Results In Interval</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getAbstractResultsInInterval(java.util.SortedSet, java.util.Date, java.util.Date, boolean, boolean)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsInInterval__SortedSet_Date_Date_boolean_boolean();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#createRecording(org.eclipse.symphony.core.recordings.Recorder) <em>Create Recording</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Recording</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#createRecording(org.eclipse.symphony.core.recordings.Recorder)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__CreateRecording__Recorder();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#applyRecordingResult(org.eclipse.symphony.core.recordings.RecordingResult) <em>Apply Recording Result</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Recording Result</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#applyRecordingResult(org.eclipse.symphony.core.recordings.RecordingResult)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__ApplyRecordingResult__RecordingResult();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getChannels(java.util.List) <em>Get Channels</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Channels</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getChannels(java.util.List)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetChannels__List();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTimeTitleString() <em>Get CSV Time Title String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CSV Time Title String</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTimeTitleString()
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeTitleString();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTimeValueString(java.util.Date) <em>Get CSV Time Value String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CSV Time Value String</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTimeValueString(java.util.Date)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeValueString__Date();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTitleString(org.eclipse.symphony.core.recordings.Channel) <em>Get CSV Title String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CSV Title String</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVTitleString(org.eclipse.symphony.core.recordings.Channel)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVTitleString__Channel();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVValueString(org.eclipse.symphony.core.recordings.RecordingResult) <em>Get CSV Value String</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get CSV Value String</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#getCSVValueString(org.eclipse.symphony.core.recordings.RecordingResult)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__GetCSVValueString__RecordingResult();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#exportRecordingTrackToCSV(org.eclipse.symphony.core.recordings.RecordingTrack) <em>Export Recording Track To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export Recording Track To CSV</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#exportRecordingTrackToCSV(org.eclipse.symphony.core.recordings.RecordingTrack)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTrackToCSV__RecordingTrack();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#exportRecordingTracksToCSV(java.util.List) <em>Export Recording Tracks To CSV</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Export Recording Tracks To CSV</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsFacade#exportRecordingTracksToCSV(java.util.List)
	 * @generated
	 */
  EOperation getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTracksToCSV__List();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.recordings.RecorderState <em>Recorder State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recorder State</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecorderState
	 * @generated
	 */
  EEnum getRecorderState();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.RecordingResult <em>Recording Result</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Result</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingResult
	 * @generated
	 */
  EClass getRecordingResult();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording Track</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack()
	 * @see #getRecordingResult()
	 * @generated
	 */
  EReference getRecordingResult_RecordingTrack();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.RecordingTrack <em>Recording Track</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording Track</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack
	 * @generated
	 */
  EClass getRecordingTrack();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getChannel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Channel</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getChannel()
	 * @see #getRecordingTrack()
	 * @generated
	 */
  EReference getRecordingTrack_Channel();

  /**
	 * Returns the meta object for the container reference '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Recording</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getRecording()
	 * @see #getRecordingTrack()
	 * @generated
	 */
  EReference getRecordingTrack_Recording();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Results</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getResults()
	 * @see #getRecordingTrack()
	 * @generated
	 */
  EReference getRecordingTrack_Results();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getStartDate()
	 * @see #getRecordingTrack()
	 * @generated
	 */
	EAttribute getRecordingTrack_StartDate();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getEndDate()
	 * @see #getRecordingTrack()
	 * @generated
	 */
	EAttribute getRecordingTrack_EndDate();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getDuration()
	 * @see #getRecordingTrack()
	 * @generated
	 */
	EAttribute getRecordingTrack_Duration();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.Recording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recording</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recording
	 * @generated
	 */
  EClass getRecording();

  /**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.symphony.core.recordings.Recording#getRecordingTracks <em>Recording Tracks</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Recording Tracks</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recording#getRecordingTracks()
	 * @see #getRecording()
	 * @generated
	 */
  EReference getRecording_RecordingTracks();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Recording#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recording#getDuration()
	 * @see #getRecording()
	 * @generated
	 */
	EAttribute getRecording_Duration();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Recording#getStartDate <em>Start Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Date</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recording#getStartDate()
	 * @see #getRecording()
	 * @generated
	 */
	EAttribute getRecording_StartDate();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Recording#getEndDate <em>End Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Date</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recording#getEndDate()
	 * @see #getRecording()
	 * @generated
	 */
	EAttribute getRecording_EndDate();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recording#getRecordingResults() <em>Get Recording Results</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Recording Results</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recording#getRecordingResults()
	 * @generated
	 */
  EOperation getRecording__GetRecordingResults();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.Recorder <em>Recorder</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Recorder</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recorder
	 * @generated
	 */
  EClass getRecorder();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.recordings.Recorder#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recorder#getDestination()
	 * @see #getRecorder()
	 * @generated
	 */
  EReference getRecorder_Destination();

  /**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.core.recordings.Recorder#getChannelsLists <em>Channels Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Channels Lists</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recorder#getChannelsLists()
	 * @see #getRecorder()
	 * @generated
	 */
	EReference getRecorder_ChannelsLists();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Recorder#getRecorderState <em>Recorder State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recorder State</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recorder#getRecorderState()
	 * @see #getRecorder()
	 * @generated
	 */
  EAttribute getRecorder_RecorderState();

  /**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.recordings.Recorder#getRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Recording</em>'.
	 * @see org.eclipse.symphony.core.recordings.Recorder#getRecording()
	 * @see #getRecorder()
	 * @generated
	 */
  EReference getRecorder_Recording();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recorder#stop() <em>Stop</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recorder#stop()
	 * @generated
	 */
  EOperation getRecorder__Stop();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recorder#record() <em>Record</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Record</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recorder#record()
	 * @generated
	 */
  EOperation getRecorder__Record();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recorder#pause() <em>Pause</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pause</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recorder#pause()
	 * @generated
	 */
  EOperation getRecorder__Pause();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recorder#resume() <em>Resume</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recorder#resume()
	 * @generated
	 */
  EOperation getRecorder__Resume();

  /**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Recorder#getAllChannels() <em>Get All Channels</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Channels</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Recorder#getAllChannels()
	 * @generated
	 */
	EOperation getRecorder__GetAllChannels();

		/**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.Channel <em>Channel</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Channel</em>'.
	 * @see org.eclipse.symphony.core.recordings.Channel
	 * @generated
	 */
  EClass getChannel();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Channel#getRecordingPolicy <em>Recording Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Recording Policy</em>'.
	 * @see org.eclipse.symphony.core.recordings.Channel#getRecordingPolicy()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_RecordingPolicy();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Channel#getFixedPeriodValues <em>Fixed Period Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed Period Values</em>'.
	 * @see org.eclipse.symphony.core.recordings.Channel#getFixedPeriodValues()
	 * @see #getChannel()
	 * @generated
	 */
	EAttribute getChannel_FixedPeriodValues();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.recordings.Channel#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see org.eclipse.symphony.core.recordings.Channel#getFeature()
	 * @see #getChannel()
	 * @generated
	 */
  EReference getChannel_Feature();

  /**
	 * Returns the meta object for class '{@link org.eclipse.symphony.core.recordings.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player
	 * @generated
	 */
  EClass getPlayer();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Player#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#isEnabled()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Enabled();

		/**
	 * Returns the meta object for the reference '{@link org.eclipse.symphony.core.recordings.Player#getTimeSource <em>Time Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Time Source</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#getTimeSource()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_TimeSource();

		/**
	 * Returns the meta object for the reference list '{@link org.eclipse.symphony.core.recordings.Player#getRecordings <em>Recordings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Recordings</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#getRecordings()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Recordings();

		/**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Player#getDataStartTime <em>Data Start Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Start Time</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#getDataStartTime()
	 * @see #getPlayer()
	 * @generated
	 */
  EAttribute getPlayer_DataStartTime();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Player#getDataEndTime <em>Data End Time</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data End Time</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#getDataEndTime()
	 * @see #getPlayer()
	 * @generated
	 */
  EAttribute getPlayer_DataEndTime();

  /**
	 * Returns the meta object for the attribute '{@link org.eclipse.symphony.core.recordings.Player#getPlayBackTime <em>Play Back Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Back Time</em>'.
	 * @see org.eclipse.symphony.core.recordings.Player#getPlayBackTime()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_PlayBackTime();

		/**
	 * Returns the meta object for the '{@link org.eclipse.symphony.core.recordings.Player#jumpTo(java.util.Date) <em>Jump To</em>}' operation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Jump To</em>' operation.
	 * @see org.eclipse.symphony.core.recordings.Player#jumpTo(java.util.Date)
	 * @generated
	 */
  EOperation getPlayer__JumpTo__Date();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.recordings.RecordingPolicy <em>Recording Policy</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Recording Policy</em>'.
	 * @see org.eclipse.symphony.core.recordings.RecordingPolicy
	 * @generated
	 */
  EEnum getRecordingPolicy();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.recordings.FixedPeriodValues <em>Fixed Period Values</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fixed Period Values</em>'.
	 * @see org.eclipse.symphony.core.recordings.FixedPeriodValues
	 * @generated
	 */
  EEnum getFixedPeriodValues();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.recordings.PlayerState <em>Player State</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player State</em>'.
	 * @see org.eclipse.symphony.core.recordings.PlayerState
	 * @generated
	 */
  EEnum getPlayerState();

  /**
	 * Returns the meta object for enum '{@link org.eclipse.symphony.core.recordings.PlayerDirection <em>Player Direction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Player Direction</em>'.
	 * @see org.eclipse.symphony.core.recordings.PlayerDirection
	 * @generated
	 */
	EEnum getPlayerDirection();

		/**
	 * Returns the meta object for data type '{@link java.lang.Throwable <em>Throwable</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Throwable</em>'.
	 * @see java.lang.Throwable
	 * @model instanceClass="java.lang.Throwable"
	 * @generated
	 */
  EDataType getThrowable();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Adapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Adapter</em>'.
	 * @see org.eclipse.emf.common.notify.Adapter
	 * @model instanceClass="org.eclipse.emf.common.notify.Adapter"
	 * @generated
	 */
  EDataType getAdapter();

  /**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.EStructuralFeature <em>EStructural Feature</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EStructural Feature</em>'.
	 * @see org.eclipse.emf.ecore.EStructuralFeature
	 * @model instanceClass="org.eclipse.emf.ecore.EStructuralFeature"
	 * @generated
	 */
  EDataType getEStructuralFeature();

  /**
	 * Returns the meta object for data type '{@link java.util.Map <em>Map</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Map</em>'.
	 * @see java.util.Map
	 * @model instanceClass="java.util.Map" typeParameters="K V"
	 * @generated
	 */
  EDataType getMap();

  /**
	 * Returns the meta object for data type '{@link java.util.List <em>List</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List" typeParameters="T"
	 * @generated
	 */
  EDataType getList();

  /**
	 * Returns the meta object for data type '{@link java.util.Collection <em>Collection</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Collection</em>'.
	 * @see java.util.Collection
	 * @model instanceClass="java.util.Collection" typeParameters="T"
	 * @generated
	 */
  EDataType getCollection();

  /**
	 * Returns the meta object for data type '{@link java.util.SortedSet <em>Sorted Set</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Sorted Set</em>'.
	 * @see java.util.SortedSet
	 * @model instanceClass="java.util.SortedSet" typeParameters="T"
	 * @generated
	 */
  EDataType getSortedSet();

  /**
	 * Returns the meta object for data type '{@link java.util.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Date</em>'.
	 * @see java.util.Date
	 * @model instanceClass="java.util.Date"
	 * @generated
	 */
  EDataType getDate();

  /**
	 * Returns the meta object for data type '{@link java.lang.StringBuffer <em>String Buffer</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>String Buffer</em>'.
	 * @see java.lang.StringBuffer
	 * @model instanceClass="java.lang.StringBuffer"
	 * @generated
	 */
  EDataType getStringBuffer();

  /**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
  EMFEcoreInvocatorRecordingsFactory getEMFEcoreInvocatorRecordingsFactory();

  /**
	 * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each operation of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
	 * @generated
	 */
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsFacadeImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getEMFEcoreInvocatorRecordingsFacade()
		 * @generated
		 */
    EClass EMF_ECORE_INVOCATOR_RECORDINGS_FACADE = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade();

    /**
		 * The meta object literal for the '<em><b>Get Result Value</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RESULT_VALUE__RECORDINGRESULT = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetResultValue__RecordingResult();

    /**
		 * The meta object literal for the '<em><b>Get Recording Period In Seconds</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_PERIOD_IN_SECONDS__FIXEDPERIODVALUES = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetRecordingPeriodInSeconds__FixedPeriodValues();

    /**
		 * The meta object literal for the '<em><b>Get Time Sorted Recording Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__COLLECTION = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__Collection();

    /**
		 * The meta object literal for the '<em><b>Get Reversed Time Sorted Recording Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_RECORDING_RESULTS__COLLECTION = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedRecordingResults__Collection();

    /**
		 * The meta object literal for the '<em><b>Get Time Sorted Recording Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_RECORDING_RESULTS__RECORDINGTRACK = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedRecordingResults__RecordingTrack();

    /**
		 * The meta object literal for the '<em><b>Get Recording Results Before</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsBefore__SortedSet_Date_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Recording Results After</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsAfter__SortedSet_Date_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Recording Results In Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_RECORDING_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetRecordingResultsInInterval__SortedSet_Date_Date_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Time Sorted Abstract Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__Collection();

    /**
		 * The meta object literal for the '<em><b>Get Reversed Time Sorted Abstract Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_REVERSED_TIME_SORTED_ABSTRACT_RESULTS__COLLECTION = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetReversedTimeSortedAbstractResults__Collection();

    /**
		 * The meta object literal for the '<em><b>Get Time Sorted Abstract Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_TIME_SORTED_ABSTRACT_RESULTS__DATAPRODUCTSLIST = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetTimeSortedAbstractResults__DataProductsList();

    /**
		 * The meta object literal for the '<em><b>Get Abstract Results Before</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_BEFORE__SORTEDSET_DATE_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsBefore__SortedSet_Date_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Abstract Results After</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_AFTER__SORTEDSET_DATE_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsAfter__SortedSet_Date_boolean();

    /**
		 * The meta object literal for the '<em><b>Get Abstract Results In Interval</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_ABSTRACT_RESULTS_IN_INTERVAL__SORTEDSET_DATE_DATE_BOOLEAN_BOOLEAN = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetAbstractResultsInInterval__SortedSet_Date_Date_boolean_boolean();

    /**
		 * The meta object literal for the '<em><b>Create Recording</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___CREATE_RECORDING__RECORDER = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__CreateRecording__Recorder();

    /**
		 * The meta object literal for the '<em><b>Apply Recording Result</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___APPLY_RECORDING_RESULT__RECORDINGRESULT = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__ApplyRecordingResult__RecordingResult();

    /**
		 * The meta object literal for the '<em><b>Get Channels</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CHANNELS__LIST = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetChannels__List();

    /**
		 * The meta object literal for the '<em><b>Get CSV Time Title String</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_TITLE_STRING = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeTitleString();

    /**
		 * The meta object literal for the '<em><b>Get CSV Time Value String</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TIME_VALUE_STRING__DATE = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetCSVTimeValueString__Date();

    /**
		 * The meta object literal for the '<em><b>Get CSV Title String</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_TITLE_STRING__CHANNEL = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetCSVTitleString__Channel();

    /**
		 * The meta object literal for the '<em><b>Get CSV Value String</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___GET_CSV_VALUE_STRING__RECORDINGRESULT = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__GetCSVValueString__RecordingResult();

    /**
		 * The meta object literal for the '<em><b>Export Recording Track To CSV</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACK_TO_CSV__RECORDINGTRACK = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTrackToCSV__RecordingTrack();

    /**
		 * The meta object literal for the '<em><b>Export Recording Tracks To CSV</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation EMF_ECORE_INVOCATOR_RECORDINGS_FACADE___EXPORT_RECORDING_TRACKS_TO_CSV__LIST = eINSTANCE.getEMFEcoreInvocatorRecordingsFacade__ExportRecordingTracksToCSV__List();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.RecorderState <em>Recorder State</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.RecorderState
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecorderState()
		 * @generated
		 */
    EEnum RECORDER_STATE = eINSTANCE.getRecorderState();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingResultImpl <em>Recording Result</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.RecordingResultImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingResult()
		 * @generated
		 */
    EClass RECORDING_RESULT = eINSTANCE.getRecordingResult();

    /**
		 * The meta object literal for the '<em><b>Recording Track</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDING_RESULT__RECORDING_TRACK = eINSTANCE.getRecordingResult_RecordingTrack();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl <em>Recording Track</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.RecordingTrackImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingTrack()
		 * @generated
		 */
    EClass RECORDING_TRACK = eINSTANCE.getRecordingTrack();

    /**
		 * The meta object literal for the '<em><b>Channel</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDING_TRACK__CHANNEL = eINSTANCE.getRecordingTrack_Channel();

    /**
		 * The meta object literal for the '<em><b>Recording</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDING_TRACK__RECORDING = eINSTANCE.getRecordingTrack_Recording();

    /**
		 * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDING_TRACK__RESULTS = eINSTANCE.getRecordingTrack_Results();

    /**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING_TRACK__START_DATE = eINSTANCE.getRecordingTrack_StartDate();

				/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING_TRACK__END_DATE = eINSTANCE.getRecordingTrack_EndDate();

				/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING_TRACK__DURATION = eINSTANCE.getRecordingTrack_Duration();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.RecordingImpl <em>Recording</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.RecordingImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecording()
		 * @generated
		 */
    EClass RECORDING = eINSTANCE.getRecording();

    /**
		 * The meta object literal for the '<em><b>Recording Tracks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDING__RECORDING_TRACKS = eINSTANCE.getRecording_RecordingTracks();

    /**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING__DURATION = eINSTANCE.getRecording_Duration();

				/**
		 * The meta object literal for the '<em><b>Start Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING__START_DATE = eINSTANCE.getRecording_StartDate();

				/**
		 * The meta object literal for the '<em><b>End Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECORDING__END_DATE = eINSTANCE.getRecording_EndDate();

				/**
		 * The meta object literal for the '<em><b>Get Recording Results</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECORDING___GET_RECORDING_RESULTS = eINSTANCE.getRecording__GetRecordingResults();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.RecorderImpl <em>Recorder</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.RecorderImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecorder()
		 * @generated
		 */
    EClass RECORDER = eINSTANCE.getRecorder();

    /**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDER__DESTINATION = eINSTANCE.getRecorder_Destination();

    /**
		 * The meta object literal for the '<em><b>Channels Lists</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECORDER__CHANNELS_LISTS = eINSTANCE.getRecorder_ChannelsLists();

				/**
		 * The meta object literal for the '<em><b>Recorder State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute RECORDER__RECORDER_STATE = eINSTANCE.getRecorder_RecorderState();

    /**
		 * The meta object literal for the '<em><b>Recording</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference RECORDER__RECORDING = eINSTANCE.getRecorder_Recording();

    /**
		 * The meta object literal for the '<em><b>Stop</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECORDER___STOP = eINSTANCE.getRecorder__Stop();

    /**
		 * The meta object literal for the '<em><b>Record</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECORDER___RECORD = eINSTANCE.getRecorder__Record();

    /**
		 * The meta object literal for the '<em><b>Pause</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECORDER___PAUSE = eINSTANCE.getRecorder__Pause();

    /**
		 * The meta object literal for the '<em><b>Resume</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation RECORDER___RESUME = eINSTANCE.getRecorder__Resume();

    /**
		 * The meta object literal for the '<em><b>Get All Channels</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECORDER___GET_ALL_CHANNELS = eINSTANCE.getRecorder__GetAllChannels();

				/**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.ChannelImpl <em>Channel</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.ChannelImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getChannel()
		 * @generated
		 */
    EClass CHANNEL = eINSTANCE.getChannel();

    /**
		 * The meta object literal for the '<em><b>Recording Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__RECORDING_POLICY = eINSTANCE.getChannel_RecordingPolicy();

				/**
		 * The meta object literal for the '<em><b>Fixed Period Values</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANNEL__FIXED_PERIOD_VALUES = eINSTANCE.getChannel_FixedPeriodValues();

				/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EReference CHANNEL__FEATURE = eINSTANCE.getChannel_Feature();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.impl.PlayerImpl
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayer()
		 * @generated
		 */
    EClass PLAYER = eINSTANCE.getPlayer();

    /**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ENABLED = eINSTANCE.getPlayer_Enabled();

				/**
		 * The meta object literal for the '<em><b>Time Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TIME_SOURCE = eINSTANCE.getPlayer_TimeSource();

				/**
		 * The meta object literal for the '<em><b>Recordings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__RECORDINGS = eINSTANCE.getPlayer_Recordings();

				/**
		 * The meta object literal for the '<em><b>Data Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PLAYER__DATA_START_TIME = eINSTANCE.getPlayer_DataStartTime();

    /**
		 * The meta object literal for the '<em><b>Data End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EAttribute PLAYER__DATA_END_TIME = eINSTANCE.getPlayer_DataEndTime();

    /**
		 * The meta object literal for the '<em><b>Play Back Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAY_BACK_TIME = eINSTANCE.getPlayer_PlayBackTime();

				/**
		 * The meta object literal for the '<em><b>Jump To</b></em>' operation.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @generated
		 */
    EOperation PLAYER___JUMP_TO__DATE = eINSTANCE.getPlayer__JumpTo__Date();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.RecordingPolicy <em>Recording Policy</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.RecordingPolicy
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getRecordingPolicy()
		 * @generated
		 */
    EEnum RECORDING_POLICY = eINSTANCE.getRecordingPolicy();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.FixedPeriodValues <em>Fixed Period Values</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.FixedPeriodValues
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getFixedPeriodValues()
		 * @generated
		 */
    EEnum FIXED_PERIOD_VALUES = eINSTANCE.getFixedPeriodValues();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.PlayerState <em>Player State</em>}' enum.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.PlayerState
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayerState()
		 * @generated
		 */
    EEnum PLAYER_STATE = eINSTANCE.getPlayerState();

    /**
		 * The meta object literal for the '{@link org.eclipse.symphony.core.recordings.PlayerDirection <em>Player Direction</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.symphony.core.recordings.PlayerDirection
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getPlayerDirection()
		 * @generated
		 */
		EEnum PLAYER_DIRECTION = eINSTANCE.getPlayerDirection();

				/**
		 * The meta object literal for the '<em>Throwable</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.Throwable
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getThrowable()
		 * @generated
		 */
    EDataType THROWABLE = eINSTANCE.getThrowable();

    /**
		 * The meta object literal for the '<em>Adapter</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Adapter
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getAdapter()
		 * @generated
		 */
    EDataType ADAPTER = eINSTANCE.getAdapter();

    /**
		 * The meta object literal for the '<em>EStructural Feature</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.EStructuralFeature
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getEStructuralFeature()
		 * @generated
		 */
    EDataType ESTRUCTURAL_FEATURE = eINSTANCE.getEStructuralFeature();

    /**
		 * The meta object literal for the '<em>Map</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Map
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getMap()
		 * @generated
		 */
    EDataType MAP = eINSTANCE.getMap();

    /**
		 * The meta object literal for the '<em>List</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getList()
		 * @generated
		 */
    EDataType LIST = eINSTANCE.getList();

    /**
		 * The meta object literal for the '<em>Collection</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Collection
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getCollection()
		 * @generated
		 */
    EDataType COLLECTION = eINSTANCE.getCollection();

    /**
		 * The meta object literal for the '<em>Sorted Set</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.SortedSet
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getSortedSet()
		 * @generated
		 */
    EDataType SORTED_SET = eINSTANCE.getSortedSet();

    /**
		 * The meta object literal for the '<em>Date</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.util.Date
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getDate()
		 * @generated
		 */
    EDataType DATE = eINSTANCE.getDate();

    /**
		 * The meta object literal for the '<em>String Buffer</em>' data type.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see java.lang.StringBuffer
		 * @see org.eclipse.symphony.core.recordings.impl.EMFEcoreInvocatorRecordingsPackageImpl#getStringBuffer()
		 * @generated
		 */
    EDataType STRING_BUFFER = eINSTANCE.getStringBuffer();

  }

} //EMFEcoreInvocatorRecordingsPackage
