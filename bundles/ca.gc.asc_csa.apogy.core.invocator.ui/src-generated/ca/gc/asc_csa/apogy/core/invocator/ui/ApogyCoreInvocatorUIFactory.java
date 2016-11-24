package ca.gc.asc_csa.apogy.core.invocator.ui;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage
 * @generated
 */
public interface ApogyCoreInvocatorUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreInvocatorUIFactory eINSTANCE = ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Script Based Programs List Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Script Based Programs List Part Selection</em>'.
	 * @generated
	 */
	ScriptBasedProgramsListPartSelection createScriptBasedProgramsListPartSelection();

	/**
	 * Returns a new object of class '<em>Program Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Part Selection</em>'.
	 * @generated
	 */
	ProgramPartSelection createProgramPartSelection();

	/**
	 * Returns a new object of class '<em>Program Arguments Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Program Arguments Part Selection</em>'.
	 * @generated
	 */
	ProgramArgumentsPartSelection createProgramArgumentsPartSelection();

	/**
	 * Returns a new object of class '<em>Apogy Advanced Editor Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Apogy Advanced Editor Part Selection</em>'.
	 * @generated
	 */
	ApogyAdvancedEditorPartSelection createApogyAdvancedEditorPartSelection();

	/**
	 * Returns a new object of class '<em>Variables List Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variables List Part Selection</em>'.
	 * @generated
	 */
	VariablesListPartSelection createVariablesListPartSelection();

	/**
	 * Returns a new object of class '<em>Variable Runtime Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Runtime Part Selection</em>'.
	 * @generated
	 */
	VariableRuntimePartSelection createVariableRuntimePartSelection();

	/**
	 * Returns a new object of class '<em>New Program Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>New Program Settings</em>'.
	 * @generated
	 */
	NewProgramSettings createNewProgramSettings();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCoreInvocatorUIFacade createApogyCoreInvocatorUIFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCoreInvocatorUIPackage getApogyCoreInvocatorUIPackage();

} //ApogyCoreInvocatorUIFactory
