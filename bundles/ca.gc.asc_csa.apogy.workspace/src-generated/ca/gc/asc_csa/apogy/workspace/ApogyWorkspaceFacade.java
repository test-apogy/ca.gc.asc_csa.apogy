/**
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
package ca.gc.asc_csa.apogy.workspace;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc --> Types definitions. <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade()
 * @model
 * @generated
 */
public interface ApogyWorkspaceFacade extends EObject {
	/**
	 * @generated_NOT
	 */
	public static ApogyWorkspaceFacade INSTANCE = ApogyWorkspaceFacadeImpl.getInstance();
} // ApogyWorkspaceFacade
