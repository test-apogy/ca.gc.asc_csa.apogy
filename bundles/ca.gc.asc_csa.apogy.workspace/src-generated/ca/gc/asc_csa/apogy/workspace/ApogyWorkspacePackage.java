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

import ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage;
import org.eclipse.emf.ecore.EAttribute;
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
 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel prefix='ApogyWorkspace' childCreationExtenders='true' extensibleProviderFactory='true' copyrightText='Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).\nAll rights reserved. This program and the accompanying materials\nare made available under the terms of the Eclipse Public License v1.0\nwhich accompanies this distribution, and is available at\nhttp://www.eclipse.org/legal/epl-v10.html\n\nContributors:\n    Pierre Allard (Pierre.Allard@canada.ca), \n    Regent L\'Archeveque (Regent.Larcheveque@canada.ca),\n    Sebastien Gemme (Sebastien.Gemme@canada.ca),\n    Canadian Space Agency (CSA) - Initial API and implementation' modelName='ApogyWorkspace' modelDirectory='/ca.gc.asc_csa.apogy.workspace/src-generated' editDirectory='/ca.gc.asc_csa.apogy.workspace.edit/src-generated' basePackage='ca.gc.asc_csa.apogy'"
 * @generated
 */
public interface ApogyWorkspacePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "workspace";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ca.gc.asc_csa.apogy.workspace";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "workspace";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyWorkspacePackage eINSTANCE = ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl <em>Facade</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getApogyWorkspaceFacade()
	 * @generated
	 */
	int APOGY_WORKSPACE_FACADE = 0;

	/**
	 * The feature id for the '<em><b>Default Project Name Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX = 0;

	/**
	 * The feature id for the '<em><b>Default Session Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME = 1;

	/**
	 * The feature id for the '<em><b>Default Session Filename Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Default Session Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FOLDER_NAME = 3;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Get Default Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME = 0;

	/**
	 * The operation id for the '<em>Create Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE_OPERATION_COUNT = 2;


	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.impl.NewProjectSettingsImpl <em>New Project Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.impl.NewProjectSettingsImpl
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getNewProjectSettings()
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
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getIProject()
	 * @generated
	 */
	int IPROJECT = 2;


	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade <em>Facade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facade</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade
	 * @generated
	 */
	EClass getApogyWorkspaceFacade();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProjectNamePrefix <em>Default Project Name Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Project Name Prefix</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProjectNamePrefix()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultProjectNamePrefix();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilename <em>Default Session Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Session Filename</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilename()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultSessionFilename();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilenameExtension <em>Default Session Filename Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Session Filename Extension</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilenameExtension()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultSessionFilenameExtension();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFolderName <em>Default Session Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Session Folder Name</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFolderName()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultSessionFolderName();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProjectName() <em>Get Default Project Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Default Project Name</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProjectName()
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__GetDefaultProjectName();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#createApogyProject(java.lang.String, java.lang.String) <em>Create Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#createApogyProject(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__CreateApogyProject__String_String();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.NewProjectSettings <em>New Project Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>New Project Settings</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.NewProjectSettings
	 * @generated
	 */
	EClass getNewProjectSettings();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.NewProjectSettings#applyDefaultValues() <em>Apply Default Values</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply Default Values</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.NewProjectSettings#applyDefaultValues()
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
	ApogyWorkspaceFactory getApogyWorkspaceFactory();

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
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl <em>Facade</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getApogyWorkspaceFacade()
		 * @generated
		 */
		EClass APOGY_WORKSPACE_FACADE = eINSTANCE.getApogyWorkspaceFacade();
		/**
		 * The meta object literal for the '<em><b>Default Project Name Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_PROJECT_NAME_PREFIX = eINSTANCE.getApogyWorkspaceFacade_DefaultProjectNamePrefix();
		/**
		 * The meta object literal for the '<em><b>Default Session Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME = eINSTANCE.getApogyWorkspaceFacade_DefaultSessionFilename();
		/**
		 * The meta object literal for the '<em><b>Default Session Filename Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FILENAME_EXTENSION = eINSTANCE.getApogyWorkspaceFacade_DefaultSessionFilenameExtension();
		/**
		 * The meta object literal for the '<em><b>Default Session Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_SESSION_FOLDER_NAME = eINSTANCE.getApogyWorkspaceFacade_DefaultSessionFolderName();
		/**
		 * The meta object literal for the '<em><b>Get Default Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME = eINSTANCE.getApogyWorkspaceFacade__GetDefaultProjectName();
		/**
		 * The meta object literal for the '<em><b>Create Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING = eINSTANCE.getApogyWorkspaceFacade__CreateApogyProject__String_String();
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.impl.NewProjectSettingsImpl <em>New Project Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.impl.NewProjectSettingsImpl
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getNewProjectSettings()
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
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();

	}

} //ApogyWorkspacePackage
