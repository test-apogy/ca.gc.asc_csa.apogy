/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractResult;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recording#getRecordingTracks <em>Recording Tracks</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recording#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recording#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recording#getEndDate <em>End Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecording()
 * @model
 * @generated
 */
public interface Recording extends AbstractResult, Named, Described
{
  /**
	 * Returns the value of the '<em><b>Recording Tracks</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.recordings.RecordingTrack}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getRecording <em>Recording</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recording Tracks</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Tracks</em>' containment reference list.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecording_RecordingTracks()
	 * @see org.eclipse.symphony.core.recordings.RecordingTrack#getRecording
	 * @model opposite="recording" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  EList<RecordingTrack> getRecordingTracks();

  /**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecording_Duration()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='s' property='Readonly' notify='true'"
	 * @generated
	 */
	double getDuration();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recording#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

		/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earliest date found in this recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecording_StartDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	Date getStartDate();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recording#getStartDate <em>Start Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Date</em>' attribute.
	 * @see #getStartDate()
	 * @generated
	 */
	void setStartDate(Date value);

		/**
	 * Returns the value of the '<em><b>End Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The latest date found in this recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecording_EndDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	Date getEndDate();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recording#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.recordings.List<org.eclipse.symphony.core.recordings.RecordingResult>" unique="false" many="false"
	 * @generated
	 */
  List<RecordingResult> getRecordingResults();

} // Recording
