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
 * A representation of the model object '<em><b>Abstract Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Player
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractPlayer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractPlayer extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Recording Tools Container</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getPlayer <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Recording Tools Container</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #setRecordingToolsContainer(RecordingToolsContainer)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getAbstractPlayer_RecordingToolsContainer()
	 * @see ca.gc.asc_csa.apogy.core.invocator.RecordingToolsContainer#getPlayer
	 * @model opposite="player" transient="false"
	 * @generated
	 */
	RecordingToolsContainer getRecordingToolsContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.AbstractPlayer#getRecordingToolsContainer <em>Recording Tools Container</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Recording Tools Container</em>' container reference.
	 * @see #getRecordingToolsContainer()
	 * @generated
	 */
	void setRecordingToolsContainer(RecordingToolsContainer value);

} // AbstractPlayer
