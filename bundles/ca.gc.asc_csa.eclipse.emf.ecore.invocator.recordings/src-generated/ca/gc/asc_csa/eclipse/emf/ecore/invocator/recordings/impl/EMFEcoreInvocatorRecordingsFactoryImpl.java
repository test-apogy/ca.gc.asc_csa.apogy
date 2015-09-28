/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Channel;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsFacade;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsFactory;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.FixedPeriodValues;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Player;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.PlayerState;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Recorder;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecorderState;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.Recording;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingPolicy;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EMFEcoreInvocatorRecordingsFactoryImpl extends EFactoryImpl implements EMFEcoreInvocatorRecordingsFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static EMFEcoreInvocatorRecordingsFactory init()
  {
		try {
			EMFEcoreInvocatorRecordingsFactory theEMFEcoreInvocatorRecordingsFactory = (EMFEcoreInvocatorRecordingsFactory)EPackage.Registry.INSTANCE.getEFactory(EMFEcoreInvocatorRecordingsPackage.eNS_URI);
			if (theEMFEcoreInvocatorRecordingsFactory != null) {
				return theEMFEcoreInvocatorRecordingsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EMFEcoreInvocatorRecordingsFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorRecordingsFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_RESULT: return createRecordingResult();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_TRACK: return createRecordingTrack();
			case EMFEcoreInvocatorRecordingsPackage.RECORDING: return createRecording();
			case EMFEcoreInvocatorRecordingsPackage.CHANNEL: return createChannel();
			case EMFEcoreInvocatorRecordingsPackage.RECORDER: return createRecorder();
			case EMFEcoreInvocatorRecordingsPackage.PLAYER: return createPlayer();
			case EMFEcoreInvocatorRecordingsPackage.EMF_ECORE_INVOCATOR_RECORDINGS_FACADE: return createEMFEcoreInvocatorRecordingsFacade();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
		switch (eDataType.getClassifierID()) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_POLICY:
				return createRecordingPolicyFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.FIXED_PERIOD_VALUES:
				return createFixedPeriodValuesFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.RECORDER_STATE:
				return createRecorderStateFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER_STATE:
				return createPlayerStateFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER_DIRECTION:
				return createPlayerDirectionFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.THROWABLE:
				return createThrowableFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.ADAPTER:
				return createAdapterFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.ESTRUCTURAL_FEATURE:
				return createEStructuralFeatureFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.MAP:
				return createMapFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.LIST:
				return createListFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.COLLECTION:
				return createCollectionFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.SORTED_SET:
				return createSortedSetFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.DATE:
				return createDateFromString(eDataType, initialValue);
			case EMFEcoreInvocatorRecordingsPackage.STRING_BUFFER:
				return createStringBufferFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
		switch (eDataType.getClassifierID()) {
			case EMFEcoreInvocatorRecordingsPackage.RECORDING_POLICY:
				return convertRecordingPolicyToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.FIXED_PERIOD_VALUES:
				return convertFixedPeriodValuesToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.RECORDER_STATE:
				return convertRecorderStateToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER_STATE:
				return convertPlayerStateToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.PLAYER_DIRECTION:
				return convertPlayerDirectionToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.THROWABLE:
				return convertThrowableToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.ADAPTER:
				return convertAdapterToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.ESTRUCTURAL_FEATURE:
				return convertEStructuralFeatureToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.MAP:
				return convertMapToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.LIST:
				return convertListToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.COLLECTION:
				return convertCollectionToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.SORTED_SET:
				return convertSortedSetToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.DATE:
				return convertDateToString(eDataType, instanceValue);
			case EMFEcoreInvocatorRecordingsPackage.STRING_BUFFER:
				return convertStringBufferToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorRecordingsFacade createEMFEcoreInvocatorRecordingsFacade()
  {
		EMFEcoreInvocatorRecordingsFacadeImpl emfEcoreInvocatorRecordingsFacade = new EMFEcoreInvocatorRecordingsFacadeImpl();
		return emfEcoreInvocatorRecordingsFacade;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecorderState createRecorderStateFromString(EDataType eDataType, String initialValue)
  {
		RecorderState result = RecorderState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRecorderStateToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingPolicy createRecordingPolicyFromString(EDataType eDataType, String initialValue)
  {
		RecordingPolicy result = RecordingPolicy.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertRecordingPolicyToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public FixedPeriodValues createFixedPeriodValuesFromString(EDataType eDataType, String initialValue)
  {
		FixedPeriodValues result = FixedPeriodValues.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertFixedPeriodValuesToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public PlayerState createPlayerStateFromString(EDataType eDataType, String initialValue)
  {
		PlayerState result = PlayerState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertPlayerStateToString(EDataType eDataType, Object instanceValue)
  {
		return instanceValue == null ? null : instanceValue.toString();
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayerDirection createPlayerDirectionFromString(EDataType eDataType, String initialValue) {
		PlayerDirection result = PlayerDirection.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlayerDirectionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingResult createRecordingResult()
  {
		RecordingResultImpl recordingResult = new RecordingResultImpl();
		return recordingResult;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public RecordingTrack createRecordingTrack()
  {
		RecordingTrackImpl recordingTrack = new RecordingTrackImpl();
		return recordingTrack;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recording createRecording()
  {
		RecordingImpl recording = new RecordingImpl();
		return recording;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Recorder createRecorder()
  {
		RecorderImpl recorder = new RecorderImpl();
		return recorder;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Channel createChannel()
  {
		ChannelImpl channel = new ChannelImpl();
		return channel;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Player createPlayer()
  {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Throwable createThrowableFromString(EDataType eDataType, String initialValue)
  {
		return (Throwable)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertThrowableToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Adapter createAdapterFromString(EDataType eDataType, String initialValue)
  {
		return (Adapter)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertAdapterToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EStructuralFeature createEStructuralFeatureFromString(EDataType eDataType, String initialValue)
  {
		return (EStructuralFeature)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertEStructuralFeatureToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Map<?, ?> createMapFromString(EDataType eDataType, String initialValue)
  {
		return (Map<?, ?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertMapToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public List<?> createListFromString(EDataType eDataType, String initialValue)
  {
		return (List<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertListToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Collection<?> createCollectionFromString(EDataType eDataType, String initialValue)
  {
		return (Collection<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertCollectionToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public SortedSet<?> createSortedSetFromString(EDataType eDataType, String initialValue)
  {
		return (SortedSet<?>)super.createFromString(initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertSortedSetToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public Date createDateFromString(EDataType eDataType, String initialValue)
  {
		return (Date)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertDateToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public StringBuffer createStringBufferFromString(EDataType eDataType, String initialValue)
  {
		return (StringBuffer)super.createFromString(eDataType, initialValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public String convertStringBufferToString(EDataType eDataType, Object instanceValue)
  {
		return super.convertToString(eDataType, instanceValue);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EMFEcoreInvocatorRecordingsPackage getEMFEcoreInvocatorRecordingsPackage()
  {
		return (EMFEcoreInvocatorRecordingsPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static EMFEcoreInvocatorRecordingsPackage getPackage()
  {
		return EMFEcoreInvocatorRecordingsPackage.eINSTANCE;
	}

} //EMFEcoreInvocatorRecordingsFactoryImpl
