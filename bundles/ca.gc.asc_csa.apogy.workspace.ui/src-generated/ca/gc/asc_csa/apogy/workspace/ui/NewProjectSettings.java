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
package ca.gc.asc_csa.apogy.workspace.ui;

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Project Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class used to contain the settings used to create the new project.
 * <!-- end-model-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiPackage#getNewProjectSettings()
 * @model
 * @generated
 */
public interface NewProjectSettings extends Named, Described {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies and sets the default values.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void applyDefaultValues();
} // NewProjectSettings
