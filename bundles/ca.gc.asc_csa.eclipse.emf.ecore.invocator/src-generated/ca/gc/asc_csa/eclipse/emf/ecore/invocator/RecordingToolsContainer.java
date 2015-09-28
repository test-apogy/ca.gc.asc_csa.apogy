/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.eclipse.emf.ecore.invocator;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recording Tools Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * RecordersListContainer
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getRecorder <em>Recorder</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getChannelsLists <em>Channels Lists</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getRecordingToolsContainer()
 * @model
 * @generated
 */
public interface RecordingToolsContainer extends AbstractToolsListContainer {
	/**
	 * Returns the value of the '<em><b>Recorder</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recorder</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recorder</em>' containment reference.
	 * @see #setRecorder(AbstractRecorder)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getRecordingToolsContainer_Recorder()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractRecorder#getRecordingToolsContainer
	 * @model opposite="recordingToolsContainer" containment="true" required="true"
	 * @generated
	 */
	AbstractRecorder getRecorder();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getRecorder <em>Recorder</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recorder</em>' containment reference.
	 * @see #getRecorder()
	 * @generated
	 */
	void setRecorder(AbstractRecorder value);

	/**
	 * Returns the value of the '<em><b>Player</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Player</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player</em>' containment reference.
	 * @see #setPlayer(AbstractPlayer)
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getRecordingToolsContainer_Player()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.AbstractPlayer#getRecordingToolsContainer
	 * @model opposite="recordingToolsContainer" containment="true" required="true"
	 * @generated
	 */
	AbstractPlayer getPlayer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player</em>' containment reference.
	 * @see #getPlayer()
	 * @generated
	 */
	void setPlayer(AbstractPlayer value);

	/**
	 * Returns the value of the '<em><b>Channels Lists</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList#getRecordingToolsContainer <em>Recording Tools Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels Lists</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels Lists</em>' containment reference list.
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.EMFEcoreInvocatorPackage#getRecordingToolsContainer_ChannelsLists()
	 * @see ca.gc.asc_csa.eclipse.emf.ecore.invocator.ChannelsList#getRecordingToolsContainer
	 * @model opposite="recordingToolsContainer" containment="true"
	 * @generated
	 */
	EList<ChannelsList> getChannelsLists();

} // RecordingToolsContainer
