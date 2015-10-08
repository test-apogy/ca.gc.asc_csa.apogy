/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import org.eclipse.symphony.core.invocator.AbstractResult;

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
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingResult()
 * @model
 * @generated
 */
public interface RecordingResult extends AbstractResult
{

  /**
	 * Returns the value of the '<em><b>Recording Track</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getResults <em>Results</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Channel that created the result.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recording Track</em>' container reference.
	 * @see #setRecordingTrack(RecordingTrack)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingResult_RecordingTrack()
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getResults
	 * @model opposite="results" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
  RecordingTrack getRecordingTrack();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Track</em>' container reference.
	 * @see #getRecordingTrack()
	 * @generated
	 */
  void setRecordingTrack(RecordingTrack value);
} // RecordingResult
