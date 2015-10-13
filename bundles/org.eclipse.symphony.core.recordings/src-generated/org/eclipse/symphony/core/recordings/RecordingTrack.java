/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording Track</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getChannel <em>Channel</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getRecording <em>Recording</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getResults <em>Results</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getEndDate <em>End Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.RecordingTrack#getDuration <em>Duration</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack()
 * @model
 * @generated
 */
public interface RecordingTrack extends EObject
{
  /**
	 * Returns the value of the '<em><b>Channel</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Channel</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Channel</em>' reference.
	 * @see #setChannel(Channel)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_Channel()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
  Channel getChannel();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getChannel <em>Channel</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channel</em>' reference.
	 * @see #getChannel()
	 * @generated
	 */
  void setChannel(Channel value);

  /**
	 * Returns the value of the '<em><b>Recording</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.recordings.Recording#getRecordingTracks <em>Recording Tracks</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recording</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording</em>' container reference.
	 * @see #setRecording(Recording)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_Recording()
	 * @see org.eclipse.symphony.core.recordings.Recording#getRecordingTracks
	 * @model opposite="recordingTracks" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
  Recording getRecording();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getRecording <em>Recording</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording</em>' container reference.
	 * @see #getRecording()
	 * @generated
	 */
  void setRecording(Recording value);

  /**
	 * Returns the value of the '<em><b>Results</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.recordings.RecordingResult}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack <em>Recording Track</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of result associated with this track.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Results</em>' containment reference list.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_Results()
	 * @see org.eclipse.symphony.core.recordings.RecordingResult#getRecordingTrack
	 * @model opposite="recordingTrack" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EList<RecordingResult> getResults();

		/**
	 * Returns the value of the '<em><b>Start Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The earliest date found in this track.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Start Date</em>' attribute.
	 * @see #setStartDate(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_StartDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	Date getStartDate();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getStartDate <em>Start Date</em>}' attribute.
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
	 * The latest date found in this track.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>End Date</em>' attribute.
	 * @see #setEndDate(Date)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_EndDate()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' notify='true'"
	 * @generated
	 */
	Date getEndDate();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getEndDate <em>End Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Date</em>' attribute.
	 * @see #getEndDate()
	 * @generated
	 */
	void setEndDate(Date value);

		/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The duration of the track.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(double)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecordingTrack_Duration()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel csa_units='s' property='Readonly' notify='true'"
	 * @generated
	 */
	double getDuration();

		/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.RecordingTrack#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(double value);

} // RecordingTrack
