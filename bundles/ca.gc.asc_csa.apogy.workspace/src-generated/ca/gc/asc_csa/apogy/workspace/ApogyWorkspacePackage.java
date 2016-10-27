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
	 * The feature id for the '<em><b>Default Sessions Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME = 3;

	/**
	 * The feature id for the '<em><b>Default Programs Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME = 4;

	/**
	 * The feature id for the '<em><b>Default Data Folder Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME = 5;

	/**
	 * The feature id for the '<em><b>Active Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT = 6;

	/**
	 * The number of structural features of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Get Default Project Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME = 0;

	/**
	 * The operation id for the '<em>Create Apogy Project Template</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT_TEMPLATE__STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Create Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Workspace Apogy Projects</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECTS = 3;

	/**
	 * The operation id for the '<em>Get Workspace Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECT__STRING = 4;

	/**
	 * The operation id for the '<em>Open Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___OPEN_APOGY_PROJECT__IPROJECT = 5;

	/**
	 * The operation id for the '<em>Import Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___IMPORT_APOGY_PROJECT__BUNDLE = 6;

	/**
	 * The operation id for the '<em>Close Apogy Project</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE___CLOSE_APOGY_PROJECT__IPROJECT = 7;

	/**
	 * The number of operations of the '<em>Facade</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APOGY_WORKSPACE_FACADE_OPERATION_COUNT = 8;


	/**
	 * The meta object id for the '{@link ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl <em>Project Providers Registry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getProjectProvidersRegistry()
	 * @generated
	 */
	int PROJECT_PROVIDERS_REGISTRY = 1;

	/**
	 * The feature id for the '<em><b>PROJECT PROVIDERS CONTRIBUTORS POINT ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROVIDERS_REGISTRY__PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID = 0;

	/**
	 * The feature id for the '<em><b>Apogy Project Providers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS = 1;

	/**
	 * The number of structural features of the '<em>Project Providers Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROVIDERS_REGISTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project Providers Registry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PROVIDERS_REGISTRY_OPERATION_COUNT = 0;

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
	 * The meta object id for the '<em>List Apogy Projects</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getListApogyProjects()
	 * @generated
	 */
	int LIST_APOGY_PROJECTS = 3;


	/**
	 * The meta object id for the '<em>List Apogy Project Bundles</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getListApogyProjectBundles()
	 * @generated
	 */
	int LIST_APOGY_PROJECT_BUNDLES = 4;


	/**
	 * The meta object id for the '<em>Bundle</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.osgi.framework.Bundle
	 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getBundle()
	 * @generated
	 */
	int BUNDLE = 5;


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
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionsFolderName <em>Default Sessions Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Sessions Folder Name</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionsFolderName()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultSessionsFolderName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProgramsFolderName <em>Default Programs Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Programs Folder Name</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProgramsFolderName()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultProgramsFolderName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultDataFolderName <em>Default Data Folder Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Data Folder Name</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultDataFolderName()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_DefaultDataFolderName();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getActiveProject <em>Active Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active Project</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getActiveProject()
	 * @see #getApogyWorkspaceFacade()
	 * @generated
	 */
	EAttribute getApogyWorkspaceFacade_ActiveProject();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#createApogyProjectTemplate(java.lang.String, java.lang.String) <em>Create Apogy Project Template</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Apogy Project Template</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#createApogyProjectTemplate(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__CreateApogyProjectTemplate__String_String();

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
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getWorkspaceApogyProjects() <em>Get Workspace Apogy Projects</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workspace Apogy Projects</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getWorkspaceApogyProjects()
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__GetWorkspaceApogyProjects();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getWorkspaceApogyProject(java.lang.String) <em>Get Workspace Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Workspace Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getWorkspaceApogyProject(java.lang.String)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__GetWorkspaceApogyProject__String();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#openApogyProject(org.eclipse.core.resources.IProject) <em>Open Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Open Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#openApogyProject(org.eclipse.core.resources.IProject)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__OpenApogyProject__IProject();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#importApogyProject(org.osgi.framework.Bundle) <em>Import Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Import Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#importApogyProject(org.osgi.framework.Bundle)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__ImportApogyProject__Bundle();

	/**
	 * Returns the meta object for the '{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#closeApogyProject(org.eclipse.core.resources.IProject) <em>Close Apogy Project</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Close Apogy Project</em>' operation.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#closeApogyProject(org.eclipse.core.resources.IProject)
	 * @generated
	 */
	EOperation getApogyWorkspaceFacade__CloseApogyProject__IProject();

	/**
	 * Returns the meta object for class '{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry <em>Project Providers Registry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Providers Registry</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry
	 * @generated
	 */
	EClass getProjectProvidersRegistry();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID <em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PROJECT PROVIDERS CONTRIBUTORS POINT ID</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getPROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID()
	 * @see #getProjectProvidersRegistry()
	 * @generated
	 */
	EAttribute getProjectProvidersRegistry_PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID();

	/**
	 * Returns the meta object for the attribute '{@link ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getApogyProjectProviders <em>Apogy Project Providers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Apogy Project Providers</em>'.
	 * @see ca.gc.asc_csa.apogy.workspace.ProjectProvidersRegistry#getApogyProjectProviders()
	 * @see #getProjectProvidersRegistry()
	 * @generated
	 */
	EAttribute getProjectProvidersRegistry_ApogyProjectProviders();

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
	 * Returns the meta object for data type '{@link java.util.List <em>List Apogy Projects</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Apogy Projects</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<org.eclipse.core.resources.IProject>"
	 * @generated
	 */
	EDataType getListApogyProjects();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>List Apogy Project Bundles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>List Apogy Project Bundles</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List<org.osgi.framework.Bundle>"
	 * @generated
	 */
	EDataType getListApogyProjectBundles();

	/**
	 * Returns the meta object for data type '{@link org.osgi.framework.Bundle <em>Bundle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Bundle</em>'.
	 * @see org.osgi.framework.Bundle
	 * @model instanceClass="org.osgi.framework.Bundle"
	 * @generated
	 */
	EDataType getBundle();

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
		 * The meta object literal for the '<em><b>Default Sessions Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_SESSIONS_FOLDER_NAME = eINSTANCE.getApogyWorkspaceFacade_DefaultSessionsFolderName();
		/**
		 * The meta object literal for the '<em><b>Default Programs Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_PROGRAMS_FOLDER_NAME = eINSTANCE.getApogyWorkspaceFacade_DefaultProgramsFolderName();
		/**
		 * The meta object literal for the '<em><b>Default Data Folder Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__DEFAULT_DATA_FOLDER_NAME = eINSTANCE.getApogyWorkspaceFacade_DefaultDataFolderName();
		/**
		 * The meta object literal for the '<em><b>Active Project</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APOGY_WORKSPACE_FACADE__ACTIVE_PROJECT = eINSTANCE.getApogyWorkspaceFacade_ActiveProject();
		/**
		 * The meta object literal for the '<em><b>Get Default Project Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___GET_DEFAULT_PROJECT_NAME = eINSTANCE.getApogyWorkspaceFacade__GetDefaultProjectName();
		/**
		 * The meta object literal for the '<em><b>Create Apogy Project Template</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT_TEMPLATE__STRING_STRING = eINSTANCE.getApogyWorkspaceFacade__CreateApogyProjectTemplate__String_String();
		/**
		 * The meta object literal for the '<em><b>Create Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___CREATE_APOGY_PROJECT__STRING_STRING = eINSTANCE.getApogyWorkspaceFacade__CreateApogyProject__String_String();
		/**
		 * The meta object literal for the '<em><b>Get Workspace Apogy Projects</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECTS = eINSTANCE.getApogyWorkspaceFacade__GetWorkspaceApogyProjects();
		/**
		 * The meta object literal for the '<em><b>Get Workspace Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___GET_WORKSPACE_APOGY_PROJECT__STRING = eINSTANCE.getApogyWorkspaceFacade__GetWorkspaceApogyProject__String();
		/**
		 * The meta object literal for the '<em><b>Open Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___OPEN_APOGY_PROJECT__IPROJECT = eINSTANCE.getApogyWorkspaceFacade__OpenApogyProject__IProject();
		/**
		 * The meta object literal for the '<em><b>Import Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___IMPORT_APOGY_PROJECT__BUNDLE = eINSTANCE.getApogyWorkspaceFacade__ImportApogyProject__Bundle();
		/**
		 * The meta object literal for the '<em><b>Close Apogy Project</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APOGY_WORKSPACE_FACADE___CLOSE_APOGY_PROJECT__IPROJECT = eINSTANCE.getApogyWorkspaceFacade__CloseApogyProject__IProject();
		/**
		 * The meta object literal for the '{@link ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl <em>Project Providers Registry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ProjectProvidersRegistryImpl
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getProjectProvidersRegistry()
		 * @generated
		 */
		EClass PROJECT_PROVIDERS_REGISTRY = eINSTANCE.getProjectProvidersRegistry();
		/**
		 * The meta object literal for the '<em><b>PROJECT PROVIDERS CONTRIBUTORS POINT ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PROVIDERS_REGISTRY__PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID = eINSTANCE.getProjectProvidersRegistry_PROJECT_PROVIDERS_CONTRIBUTORS_POINT_ID();
		/**
		 * The meta object literal for the '<em><b>Apogy Project Providers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT_PROVIDERS_REGISTRY__APOGY_PROJECT_PROVIDERS = eINSTANCE.getProjectProvidersRegistry_ApogyProjectProviders();
		/**
		 * The meta object literal for the '<em>IProject</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.core.resources.IProject
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getIProject()
		 * @generated
		 */
		EDataType IPROJECT = eINSTANCE.getIProject();
		/**
		 * The meta object literal for the '<em>List Apogy Projects</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getListApogyProjects()
		 * @generated
		 */
		EDataType LIST_APOGY_PROJECTS = eINSTANCE.getListApogyProjects();
		/**
		 * The meta object literal for the '<em>List Apogy Project Bundles</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getListApogyProjectBundles()
		 * @generated
		 */
		EDataType LIST_APOGY_PROJECT_BUNDLES = eINSTANCE.getListApogyProjectBundles();
		/**
		 * The meta object literal for the '<em>Bundle</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.osgi.framework.Bundle
		 * @see ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspacePackageImpl#getBundle()
		 * @generated
		 */
		EDataType BUNDLE = eINSTANCE.getBundle();

	}

} //ApogyWorkspacePackage
