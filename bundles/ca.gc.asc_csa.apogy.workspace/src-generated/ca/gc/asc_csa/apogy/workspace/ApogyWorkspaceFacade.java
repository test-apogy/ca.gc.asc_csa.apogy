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

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.workspace.impl.ApogyWorkspaceFacadeImpl;
import org.eclipse.core.resources.IProject;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Apogy Workspace Facade.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultProjectNamePrefix <em>Default Project Name Prefix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilename <em>Default Session Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFilenameExtension <em>Default Session Filename Extension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.workspace.ApogyWorkspaceFacade#getDefaultSessionFolderName <em>Default Session Folder Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade()
 * @model
 * @generated
 */
public interface ApogyWorkspaceFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Project Name Prefix</b></em>' attribute.
	 * The default value is <code>"Project"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Project Name Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Project Name Prefix</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade_DefaultProjectNamePrefix()
	 * @model default="Project" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getDefaultProjectNamePrefix();

	/**
	 * Returns the value of the '<em><b>Default Session Filename</b></em>' attribute.
	 * The default value is <code>"session"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Session Filename Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Session Filename</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade_DefaultSessionFilename()
	 * @model default="session" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getDefaultSessionFilename();

	/**
	 * Returns the value of the '<em><b>Default Session Filename Extension</b></em>' attribute.
	 * The default value is <code>"sym"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Session Filename Extension Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Session Filename Extension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade_DefaultSessionFilenameExtension()
	 * @model default="sym" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getDefaultSessionFilenameExtension();

	/**
	 * Returns the value of the '<em><b>Default Session Folder Name</b></em>' attribute.
	 * The default value is <code>"Sessions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Sessions Directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Session Folder Name</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.workspace.ApogyWorkspacePackage#getApogyWorkspaceFacade_DefaultSessionFolderName()
	 * @model default="Sessions" unique="false" transient="true" changeable="false"
	 * @generated
	 */
	String getDefaultSessionFolderName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an available project name according to the current workspace.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getDefaultProjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates and initialized a new Apogy project.
	 * @param name Name of the project.
	 * @param description Description of the project.
	 * @return Reference to the project or null if not created.
	 * @throws Exception Reference to the exception stack.
	 * <!-- end-model-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.workspace.IProject" unique="false" exceptions="ca.gc.asc_csa.apogy.core.Exception" nameUnique="false" descriptionUnique="false"
	 * @generated
	 */
	IProject createApogyProject(String name, String description) throws Exception;

	/**
	 * @generated_NOT
	 */
	public static ApogyWorkspaceFacade INSTANCE = ApogyWorkspaceFacadeImpl.getInstance();
} // ApogyWorkspaceFacade
