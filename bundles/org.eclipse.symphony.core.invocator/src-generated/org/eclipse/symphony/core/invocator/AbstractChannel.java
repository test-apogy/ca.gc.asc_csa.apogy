/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Described;
import org.eclipse.symphony.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractChannel()
 * @model abstract="true"
 * @generated
 */
public interface AbstractChannel extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Channels List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.ChannelsList#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels List</em>' container reference.
	 * @see #setChannelsList(ChannelsList)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getAbstractChannel_ChannelsList()
	 * @see org.eclipse.symphony.core.invocator.ChannelsList#getChannels
	 * @model opposite="channels" transient="false"
	 * @generated
	 */
	ChannelsList getChannelsList();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels List</em>' container reference.
	 * @see #getChannelsList()
	 * @generated
	 */
	void setChannelsList(ChannelsList value);

} // AbstractChannel
