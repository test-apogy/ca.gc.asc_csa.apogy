/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;

import ca.gc.asc_csa.eclipse.emf.ecore.Described;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Channels List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.ChannelsList#getChannels <em>Channels</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.ChannelsList#getRecordingToolsContainer <em>Recording Tools Container</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getChannelsList()
 * @model
 * @generated
 */
public interface ChannelsList extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Channels</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.AbstractChannel}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getChannelsList_Channels()
	 * @see org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList
	 * @model opposite="channelsList" containment="true"
	 * @generated
	 */
	EList<AbstractChannel> getChannels();

	/**
	 * Returns the value of the '<em><b>Recording Tools Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.RecordingToolsContainer#getChannelsLists <em>Channels Lists</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Tools Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #setRecordingToolsContainer(RecordingToolsContainer)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getChannelsList_RecordingToolsContainer()
	 * @see org.eclipse.symphony.core.invocator.RecordingToolsContainer#getChannelsLists
	 * @model opposite="channelsLists" transient="false"
	 * @generated
	 */
	RecordingToolsContainer getRecordingToolsContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.ChannelsList#getRecordingToolsContainer <em>Recording Tools Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	void setRecordingToolsContainer(RecordingToolsContainer value);

} // ChannelsList
