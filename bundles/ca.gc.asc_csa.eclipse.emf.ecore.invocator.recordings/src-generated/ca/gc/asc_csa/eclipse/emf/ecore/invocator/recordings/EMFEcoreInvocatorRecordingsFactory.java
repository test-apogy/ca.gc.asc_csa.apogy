/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage
 * @generated
 */
public interface EMFEcoreInvocatorRecordingsFactory extends EFactory
{
  /**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  EMFEcoreInvocatorRecordingsFactory eINSTANCE = ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.impl.EMFEcoreInvocatorRecordingsFactoryImpl.init();

  /**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
  EMFEcoreInvocatorRecordingsFacade createEMFEcoreInvocatorRecordingsFacade();

  /**
	 * Returns a new object of class '<em>Recording Result</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recording Result</em>'.
	 * @generated
	 */
  RecordingResult createRecordingResult();

  /**
	 * Returns a new object of class '<em>Recording Track</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recording Track</em>'.
	 * @generated
	 */
  RecordingTrack createRecordingTrack();

  /**
	 * Returns a new object of class '<em>Recording</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recording</em>'.
	 * @generated
	 */
  Recording createRecording();

  /**
	 * Returns a new object of class '<em>Recorder</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Recorder</em>'.
	 * @generated
	 */
  Recorder createRecorder();

  /**
	 * Returns a new object of class '<em>Channel</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Channel</em>'.
	 * @generated
	 */
  Channel createChannel();

  /**
	 * Returns a new object of class '<em>Player</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>Player</em>'.
	 * @generated
	 */
  Player createPlayer();

  /**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  EMFEcoreInvocatorRecordingsPackage getEMFEcoreInvocatorRecordingsPackage();

} //EMFEcoreInvocatorRecordingsFactory
