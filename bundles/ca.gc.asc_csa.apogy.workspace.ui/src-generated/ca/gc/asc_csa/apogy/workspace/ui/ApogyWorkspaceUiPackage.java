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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 *     Canadian Space Agency (CSA) - Initial API and implementation
 * <!-- end-model-doc -->
 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyWorkspaceUi' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyWorkspaceUi' modelDirectory='/ca.gc.asc_csa.apogy.workspace.ui/src-generated' editDirectory='/ca.gc.asc_csa.apogy.workspace.ui/src-generated' basePackage='ca.gc.asc_csa.apogy.workspace'"
 * @generated
 */
public interface ApogyWorkspaceUiPackage extends EPackage {
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
	String eNS_URI = "ca.gc.asc_csa.apogy.workspace.ui";

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
	ApogyWorkspaceUiPackage eINSTANCE = ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getApogyWorkspaceUiFacade()
	 * @generated
	 */
	int APOGY_WORKSPACE_UI_FACADE = 0;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_UI_FACADE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.NewProjectSettingsImpl <em>New Project Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.NewProjectSettingsImpl
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getNewProjectSettings()
	 * @generated
	 */
	int NEW_PROJECT_SETTINGS = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROJECT_SETTINGS__NAME = ApogyCommonEMFPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROJECT_SETTINGS__DESCRIPTION = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>New Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROJECT_SETTINGS_FEATURE_COUNT = ApogyCommonEMFPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply Default Values</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROJECT_SETTINGS___APPLY_DEFAULT_VALUES = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>New Project Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NEW_PROJECT_SETTINGS_OPERATION_COUNT = ApogyCommonEMFPackage.NAMED_OPERATION_COUNT + 1;


	/**
	 * The meta object id for the '<em>IProject</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.core.resources.IProject
	 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.ApogyWorkspaceUiFacade
	 * @generated
	 */
	EClass getApogyWorkspaceUiFacade();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings <em>New Project Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Project Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings
	 * @generated
	 */
	EClass getNewProjectSettings();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings#applyDefaultValues() <em>Apply Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Default Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ui.NewProjectSettings#applyDefaultValues()
	 * @generated
	 */
	EOperation getNewProjectSettings__ApplyDefaultValues();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.core.resources.IProject <em>IProject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>IProject</em>'.
	 * @see org.eclipse.core.resources.IProject
	 * @model instanceClass="org.eclipse.core.resources.IProject"
	 * @generated
	 */
	EDataType getIProject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ApogyWorkspaceUiFactory getApogyWorkspaceUiFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiFacadeImpl
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getApogyWorkspaceUiFacade()
		 * @generated
		 */
		EClass APOGY_WORKSPACE_UI_FACADE = eINSTANCE.getApogyWorkspaceUiFacade();
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.ui.impl.NewProjectSettingsImpl <em>New Project Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.NewProjectSettingsImpl
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getNewProjectSettings()
		 * @generated
		 */
		EClass NEW_PROJECT_SETTINGS = eINSTANCE.getNewProjectSettings();
		/**
		 * The meta object literal for the '<em><b>Apply Default Values</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NEW_PROJECT_SETTINGS___APPLY_DEFAULT_VALUES = eINSTANCE.getNewProjectSettings__ApplyDefaultValues();
		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see ca.gc.asc_csa.apogy.workspace.ui.impl.ApogyWorkspaceUiPackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

	}

} //ApogyWorkspaceUiPackage
