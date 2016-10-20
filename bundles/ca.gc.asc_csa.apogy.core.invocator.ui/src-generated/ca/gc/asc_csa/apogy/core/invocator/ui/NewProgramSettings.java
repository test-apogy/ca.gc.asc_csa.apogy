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
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.ui;

import ca.gc.asc_csa.apogy.core.invocator.ProgramSettings;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Program Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getEClass <em>EClass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getProgramSettings <em>Program Settings</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getNewProgramSettings()
 * @model
 * @generated
 */
public interface NewProgramSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EClass of the program
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EClass</em>' containment reference.
	 * @see #setEClass(EClass)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getNewProgramSettings_EClass()
	 * @model containment="true"
	 * @generated
	 */
	EClass getEClass();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getEClass <em>EClass</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EClass</em>' containment reference.
	 * @see #getEClass()
	 * @generated
	 */
	void setEClass(EClass value);

	/**
	 * Returns the value of the '<em><b>Program Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Settings of the program.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Program Settings</em>' containment reference.
	 * @see #setProgramSettings(ProgramSettings)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getNewProgramSettings_ProgramSettings()
	 * @model containment="true"
	 * @generated
	 */
	ProgramSettings getProgramSettings();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getProgramSettings <em>Program Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Program Settings</em>' containment reference.
	 * @see #getProgramSettings()
	 * @generated
	 */
	void setProgramSettings(ProgramSettings value);

} // NewProgramSettings
