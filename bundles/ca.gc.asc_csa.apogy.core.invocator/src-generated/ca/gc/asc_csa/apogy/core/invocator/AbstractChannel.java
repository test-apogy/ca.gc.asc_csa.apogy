package ca.gc.asc_csa.apogy.core.invocator;
/*
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Pierre Allard (Pierre.Allard@canada.ca), 
 *     Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *     Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 */

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Channel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractChannel()
 * @model abstract="true"
 * @generated
 */
public interface AbstractChannel extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Channels List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getChannels <em>Channels</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Channels List</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Channels List</em>' container reference.
	 * @see #setChannelsList(ChannelsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractChannel_ChannelsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ChannelsList#getChannels
	 * @model opposite="channels" transient="false"
	 * @generated
	 */
	ChannelsList getChannelsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractChannel#getChannelsList <em>Channels List</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Channels List</em>' container reference.
	 * @see #getChannelsList()
	 * @generated
	 */
	void setChannelsList(ChannelsList value);

} // AbstractChannel
