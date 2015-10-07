/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.recordings;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList;
import ca.gc.asc_csa.eclipse.emf.ecore.invocator.DataProductsList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recorder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Recorder
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recorder#getDestination <em>Destination</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recorder#getChannelsLists <em>Channels Lists</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recorder#getRecorderState <em>Recorder State</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.recordings.Recorder#getRecording <em>Recording</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorder()
 * @model
 * @generated
 */
public interface Recorder extends AbstractRecorder
{

  /**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Destination</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The destination where to write the Recording.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(DataProductsList)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorder_Destination()
	 * @model required="true"
	 * @generated
	 */
  DataProductsList getDestination();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recorder#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
  void setDestination(DataProductsList value);

  /**
	 * Returns the value of the '<em><b>Channels Lists</b></em>' reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of channels list recorder by this Recorder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Channels Lists</em>' reference list.
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorder_ChannelsLists()
	 * @model
	 * @generated
	 */
	EList<ChannelsList> getChannelsLists();

		/**
	 * Returns the value of the '<em><b>Recorder State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.symphony.core.recordings.RecorderState}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recorder State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current state of the Recorder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Recorder State</em>' attribute.
	 * @see org.eclipse.symphony.core.recordings.RecorderState
	 * @see #setRecorderState(RecorderState)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorder_RecorderState()
	 * @model unique="false" transient="true"
	 * @generated
	 */
  RecorderState getRecorderState();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recorder#getRecorderState <em>Recorder State</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder State</em>' attribute.
	 * @see org.eclipse.symphony.core.recordings.RecorderState
	 * @see #getRecorderState()
	 * @generated
	 */
  void setRecorderState(RecorderState value);

  /**
	 * Returns the value of the '<em><b>Recording</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recording</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording</em>' reference.
	 * @see #setRecording(Recording)
	 * @see org.eclipse.symphony.core.recordings.EMFEcoreInvocatorRecordingsPackage#getRecorder_Recording()
	 * @model
	 * @generated
	 */
  Recording getRecording();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.recordings.Recorder#getRecording <em>Recording</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording</em>' reference.
	 * @see #getRecording()
	 * @generated
	 */
  void setRecording(Recording value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops recording data defined in the channels.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void stop();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts recording data defined in the channels.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void record();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pause recording the data to the source.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void pause();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resume recording the data to the source.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void resume();

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.symphony.core.recordings.List<org.eclipse.symphony.core.recordings.Channel>" unique="false" many="false"
	 * @generated
	 */
	List<Channel> getAllChannels();
} // Recorder
