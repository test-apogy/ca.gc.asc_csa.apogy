/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * RecordingResult
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingResult()
 * @model
 * @generated
 */
public interface RecordingResult extends AbstractResult
{

  /**
	 * Returns the value of the '<em><b>Recording Track</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Channel that created the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recording Track</em>' container reference.
	 * @see #setRecordingTrack(RecordingTrack)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingResult_RecordingTrack()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingTrack#getResults
	 * @model opposite="results" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
  RecordingTrack getRecordingTrack();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Track</em>' container reference.
	 * @see #getRecordingTrack()
	 * @generated
	 */
  void setRecordingTrack(RecordingTrack value);
} // RecordingResult
