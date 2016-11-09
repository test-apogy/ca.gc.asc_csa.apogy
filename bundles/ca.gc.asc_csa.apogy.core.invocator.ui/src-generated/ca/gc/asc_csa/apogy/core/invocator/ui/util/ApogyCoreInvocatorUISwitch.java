package ca.gc.asc_csa.apogy.core.invocator.ui.util;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import ca.gc.asc_csa.apogy.core.invocator.ui.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage
 * @generated
 */
public class ApogyCoreInvocatorUISwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ApogyCoreInvocatorUIPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUISwitch() {
		if (modelPackage == null) {
			modelPackage = ApogyCoreInvocatorUIPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE: {
				ApogyCoreInvocatorUIFacade apogyCoreInvocatorUIFacade = (ApogyCoreInvocatorUIFacade)theEObject;
				T result = caseApogyCoreInvocatorUIFacade(apogyCoreInvocatorUIFacade);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreInvocatorUIPackage.SCRIPT_BASED_PROGRAMS_LIST_PART_SELECTION: {
				ScriptBasedProgramsListPartSelection scriptBasedProgramsListPartSelection = (ScriptBasedProgramsListPartSelection)theEObject;
				T result = caseScriptBasedProgramsListPartSelection(scriptBasedProgramsListPartSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreInvocatorUIPackage.PROGRAM_DETAILS_PART_SELECTION: {
				ProgramDetailsPartSelection programDetailsPartSelection = (ProgramDetailsPartSelection)theEObject;
				T result = caseProgramDetailsPartSelection(programDetailsPartSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreInvocatorUIPackage.APOGY_ADVANCED_EDITOR_PART_SELECTION: {
				ApogyAdvancedEditorPartSelection apogyAdvancedEditorPartSelection = (ApogyAdvancedEditorPartSelection)theEObject;
				T result = caseApogyAdvancedEditorPartSelection(apogyAdvancedEditorPartSelection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS: {
				NewProgramSettings newProgramSettings = (NewProgramSettings)theEObject;
				T result = caseNewProgramSettings(newProgramSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Script Based Programs List Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Script Based Programs List Part Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScriptBasedProgramsListPartSelection(ScriptBasedProgramsListPartSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program Details Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program Details Part Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramDetailsPartSelection(ProgramDetailsPartSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Apogy Advanced Editor Part Selection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Apogy Advanced Editor Part Selection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyAdvancedEditorPartSelection(ApogyAdvancedEditorPartSelection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>New Program Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>New Program Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNewProgramSettings(NewProgramSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facade</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApogyCoreInvocatorUIFacade(ApogyCoreInvocatorUIFacade object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ApogyCoreInvocatorUISwitch
