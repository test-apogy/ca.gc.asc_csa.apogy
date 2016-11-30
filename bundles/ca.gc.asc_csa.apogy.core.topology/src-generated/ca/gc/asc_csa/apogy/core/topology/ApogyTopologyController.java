/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.topology;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.core.ApogyTopology;
import ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorFacade;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.topology.impl.ApogyTopologyControllerImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Topology Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This controller listens the {@link ApogyCoreInvocatorFacade#activeInvocatorSession} and
 * sets the {@link ApogyTopology}
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyTopologyController()
 * @model
 * @generated
 */
public interface ApogyTopologyController extends EObject {
	
	/*
	 * {@link ApogyTopologyController} singleton.
	 * @generated_NOT
	 */
	public ApogyTopologyController INSTANCE = ApogyTopologyControllerImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes the {@link ApogyCoreInvocatorFacade#activeInvocatorSession} listener.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Disposes the {@link ApogyCoreInvocatorFacade#activeInvocatorSession} listener.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Initializes or clear the active Apogy Topology
	 * @param session Reference to the session.  If not null, the topology will be initialized.
	 * Otherwise, the topology will be disposed.
	 * <!-- end-model-doc -->
	 * @model sessionUnique="false"
	 * @generated
	 */
	void initApogyTopology(InvocatorSession session);

} // ApogyTopologyController
