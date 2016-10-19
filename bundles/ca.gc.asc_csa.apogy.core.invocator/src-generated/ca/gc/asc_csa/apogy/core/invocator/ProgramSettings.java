/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator;

import ca.gc.asc_csa.apogy.common.emf.Archivable;
import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ProgramSettings#getSpecificProgramSettings <em>Specific Program Settings</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramSettings()
 * @model
 * @generated
 */
public interface ProgramSettings extends Named, Described, Archivable {

	/**
	 * Returns the value of the '<em><b>Specific Program Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specific Program Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specific Program Settings</em>' containment reference.
	 * @see #setSpecificProgramSettings(SpecificProgramSettings)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramSettings_SpecificProgramSettings()
	 * @model containment="true"
	 * @generated
	 */
	SpecificProgramSettings getSpecificProgramSettings();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramSettings#getSpecificProgramSettings <em>Specific Program Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specific Program Settings</em>' containment reference.
	 * @see #getSpecificProgramSettings()
	 * @generated
	 */
	void setSpecificProgramSettings(SpecificProgramSettings value);
} // ProgramSettings
