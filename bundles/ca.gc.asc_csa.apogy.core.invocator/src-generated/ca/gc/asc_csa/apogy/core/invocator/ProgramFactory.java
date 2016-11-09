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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getProgramFactory()
 * @model abstract="true"
 * @generated
 */
public interface ProgramFactory extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates the program
	 * <!-- end-model-doc -->
	 * @model unique="false"
	 * @generated
	 */
	Program createProgram();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applies the settings to the program
	 * <!-- end-model-doc -->
	 * @model programUnique="false" settingsUnique="false"
	 * @generated
	 */
	void applySettings(Program program, ProgramSettings settings);
} // ProgramFactory
