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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
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
 *     Olivier L. Larouche (Olivier.LLarouche@canad.ca),
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyCoreInvocatorUI' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\n All rights reserved. This program and the accompanying materials\n are made available under the terms of the Eclipse Public License v1.0\n which accompanies this distribution, and is available at\n http://www.eclipse.org/legal/epl-v10.html\n \n Contributors:\n     Pierre Allard (Pierre.Allard@canada.ca), \n     Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n     Sebastien Gemme (Sebastien.Gemme@canada.ca),\n     Olivier L. Larouche (Olivier.LLarouche@canada.ca),\n     Canadian Space Agency (CSA) - Initial API and implementation' childCreationExtenders='true' modelName='ApogyCoreInvocatorUI' modelDirectory='/ca.gc.asc_csa.apogy.core.invocator.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.core.invocator.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.core.invocator'"
 * @generated
 */
public interface ApogyCoreInvocatorUIPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "ui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.core.invocator.ui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "ui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCoreInvocatorUIPackage eINSTANCE = ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl <em>New Program Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getNewProgramSettings()
	 * @generated
	 */
	int NEW_PROGRAM_SETTINGS = 0;

	/**
	 * The feature id for the '<em><b>EClass</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROGRAM_SETTINGS__ECLASS = 0;

	/**
	 * The feature id for the '<em><b>Program Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS = 1;

	/**
	 * The number of structural features of the '<em>New Program Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROGRAM_SETTINGS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>New Program Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROGRAM_SETTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getApogyCoreInvocatorUIFacade()
	 * @generated
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE = 1;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = 0;

	/**
	 * The operation id for the '<em>Copy Initialization Data</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = 1;

	/**
	 * The operation id for the '<em>Init Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE___INIT_SESSION = 2;

	/**
	 * The operation id for the '<em>Dispose Session</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE___DISPOSE_SESSION = 3;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_CORE_INVOCATOR_UI_FACADE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '<em>Compound Command</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.command.CompoundCommand
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getCompoundCommand()
	 * @generated
	 */
	int COMPOUND_COMMAND = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings <em>New Program Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Program Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings
	 * @generated
	 */
	EClass getNewProgramSettings();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getEClass <em>EClass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>EClass</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getEClass()
	 * @see #getNewProgramSettings()
	 * @generated
	 */
	EReference getNewProgramSettings_EClass();

	/**
	 * Returns the meta object for the containment reference '{@link ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getProgramSettings <em>Program Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Program Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.NewProgramSettings#getProgramSettings()
	 * @see #getNewProgramSettings()
	 * @generated
	 */
	EReference getNewProgramSettings_ProgramSettings();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade
	 * @generated
	 */
	EClass getApogyCoreInvocatorUIFacade();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#copyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Context, ca.gc.asc_csa.apogy.core.invocator.Context) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#copyInitializationData(ca.gc.asc_csa.apogy.core.invocator.Context, ca.gc.asc_csa.apogy.core.invocator.Context)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#copyInitializationData(ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation, ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand) <em>Copy Initialization Data</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy Initialization Data</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#copyInitializationData(ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation, ca.gc.asc_csa.apogy.core.invocator.AbstractTypeImplementation, org.eclipse.emf.common.command.CompoundCommand)
	 * @generated
	 */
	EOperation getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#initSession() <em>Init Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Init Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#initSession()
	 * @generated
	 */
	EOperation getApogyCoreInvocatorUIFacade__InitSession();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#disposeSession() <em>Dispose Session</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose Session</em>' operation.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIFacade#disposeSession()
	 * @generated
	 */
	EOperation getApogyCoreInvocatorUIFacade__DisposeSession();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.command.CompoundCommand <em>Compound Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Compound Command</em>'.
	 * @see org.eclipse.emf.common.command.CompoundCommand
	 * @model instanceClass="org.eclipse.emf.common.command.CompoundCommand"
	 * @generated
	 */
	EDataType getCompoundCommand();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyCoreInvocatorUIFactory getApogyCoreInvocatorUIFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl <em>New Program Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.NewProgramSettingsImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getNewProgramSettings()
		 * @generated
		 */
		EClass NEW_PROGRAM_SETTINGS = eINSTANCE.getNewProgramSettings();
		/**
		 * The meta object literal for the '<em><b>EClass</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_PROGRAM_SETTINGS__ECLASS = eINSTANCE.getNewProgramSettings_EClass();
		/**
		 * The meta object literal for the '<em><b>Program Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NEW_PROGRAM_SETTINGS__PROGRAM_SETTINGS = eINSTANCE.getNewProgramSettings_ProgramSettings();
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIFacadeImpl
		 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getApogyCoreInvocatorUIFacade()
		 * @generated
		 */
		EClass APOGY_CORE_INVOCATOR_UI_FACADE = eINSTANCE.getApogyCoreInvocatorUIFacade();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__CONTEXT_CONTEXT = eINSTANCE.getApogyCoreInvocatorUIFacade__CopyInitializationData__Context_Context();
		/**
		 * The meta object literal for the '<em><b>Copy Initialization Data</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_UI_FACADE___COPY_INITIALIZATION_DATA__ABSTRACTTYPEIMPLEMENTATION_ABSTRACTTYPEIMPLEMENTATION_COMPOUNDCOMMAND = eINSTANCE.getApogyCoreInvocatorUIFacade__CopyInitializationData__AbstractTypeImplementation_AbstractTypeImplementation_CompoundCommand();
		/**
		 * The meta object literal for the '<em><b>Init Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_UI_FACADE___INIT_SESSION = eINSTANCE.getApogyCoreInvocatorUIFacade__InitSession();
		/**
		 * The meta object literal for the '<em><b>Dispose Session</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_CORE_INVOCATOR_UI_FACADE___DISPOSE_SESSION = eINSTANCE.getApogyCoreInvocatorUIFacade__DisposeSession();
		/**
		 * The meta object literal for the '<em>Compound Command</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.command.CompoundCommand
		 * @see ca.gc.asc_csa.apogy.core.invocator.ui.impl.ApogyCoreInvocatorUIPackageImpl#getCompoundCommand()
		 * @generated
		 */
		EDataType COMPOUND_COMMAND = eINSTANCE.getCompoundCommand();

	}

} //ApogyCoreInvocatorUIPackage
