package ca.gc.asc_csa.apogy.core.invocator.ui.impl;
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

import ca.gc.asc_csa.apogy.core.invocator.Variable;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import ca.gc.asc_csa.apogy.core.invocator.ui.*;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApogyCoreInvocatorUIFactoryImpl extends EFactoryImpl implements ApogyCoreInvocatorUIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApogyCoreInvocatorUIFactory init() {
		try {
			ApogyCoreInvocatorUIFactory theApogyCoreInvocatorUIFactory = (ApogyCoreInvocatorUIFactory)EPackage.Registry.INSTANCE.getEFactory(ApogyCoreInvocatorUIPackage.eNS_URI);
			if (theApogyCoreInvocatorUIFactory != null) {
				return theApogyCoreInvocatorUIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApogyCoreInvocatorUIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApogyCoreInvocatorUIPackage.APOGY_CORE_INVOCATOR_UI_FACADE: return createApogyCoreInvocatorUIFacade();
			case ApogyCoreInvocatorUIPackage.SCRIPT_BASED_PROGRAMS_LIST_PART_SELECTION: return createScriptBasedProgramsListPartSelection();
			case ApogyCoreInvocatorUIPackage.PROGRAM_PART_SELECTION: return createProgramPartSelection();
			case ApogyCoreInvocatorUIPackage.PROGRAM_ARGUMENTS_PART_SELECTION: return createProgramArgumentsPartSelection();
			case ApogyCoreInvocatorUIPackage.APOGY_ADVANCED_EDITOR_PART_SELECTION: return createApogyAdvancedEditorPartSelection();
			case ApogyCoreInvocatorUIPackage.VARIABLES_LIST_PART_SELECTION: return createVariablesListPartSelection();
			case ApogyCoreInvocatorUIPackage.NEW_PROGRAM_SETTINGS: return createNewProgramSettings();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreInvocatorUIPackage.COMPOUND_COMMAND:
				return createCompoundCommandFromString(eDataType, initialValue);
			case ApogyCoreInvocatorUIPackage.LIST_VARIABLES:
				return createListVariablesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ApogyCoreInvocatorUIPackage.COMPOUND_COMMAND:
				return convertCompoundCommandToString(eDataType, instanceValue);
			case ApogyCoreInvocatorUIPackage.LIST_VARIABLES:
				return convertListVariablesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScriptBasedProgramsListPartSelection createScriptBasedProgramsListPartSelection() {
		ScriptBasedProgramsListPartSelectionImpl scriptBasedProgramsListPartSelection = new ScriptBasedProgramsListPartSelectionImpl();
		return scriptBasedProgramsListPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramPartSelection createProgramPartSelection() {
		ProgramPartSelectionImpl programPartSelection = new ProgramPartSelectionImpl();
		return programPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramArgumentsPartSelection createProgramArgumentsPartSelection() {
		ProgramArgumentsPartSelectionImpl programArgumentsPartSelection = new ProgramArgumentsPartSelectionImpl();
		return programArgumentsPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyAdvancedEditorPartSelection createApogyAdvancedEditorPartSelection() {
		ApogyAdvancedEditorPartSelectionImpl apogyAdvancedEditorPartSelection = new ApogyAdvancedEditorPartSelectionImpl();
		return apogyAdvancedEditorPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariablesListPartSelection createVariablesListPartSelection() {
		VariablesListPartSelectionImpl variablesListPartSelection = new VariablesListPartSelectionImpl();
		return variablesListPartSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewProgramSettings createNewProgramSettings() {
		NewProgramSettingsImpl newProgramSettings = new NewProgramSettingsImpl();
		return newProgramSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUIFacade createApogyCoreInvocatorUIFacade() {
		ApogyCoreInvocatorUIFacadeImpl apogyCoreInvocatorUIFacade = new ApogyCoreInvocatorUIFacadeImpl();
		return apogyCoreInvocatorUIFacade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCommand createCompoundCommandFromString(EDataType eDataType, String initialValue) {
		return (CompoundCommand)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundCommandToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public List<Variable> createListVariablesFromString(EDataType eDataType, String initialValue) {
		return (List<Variable>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListVariablesToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApogyCoreInvocatorUIPackage getApogyCoreInvocatorUIPackage() {
		return (ApogyCoreInvocatorUIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApogyCoreInvocatorUIPackage getPackage() {
		return ApogyCoreInvocatorUIPackage.eINSTANCE;
	}

} //ApogyCoreInvocatorUIFactoryImpl
