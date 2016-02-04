package ca.gc.asc_csa.apogy.core.ui;
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

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.core.ApogySystem;
import ca.gc.asc_csa.apogy.core.invocator.InvocatorSession;
import ca.gc.asc_csa.apogy.core.ui.impl.ApogyCoreUIFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogyProjectNamePrefix <em>Default Apogy Project Name Prefix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilename <em>Default Apogy Session Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFilenameExtension <em>Default Apogy Session Filename Extension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade#getDefaultApogySessionFolderName <em>Default Apogy Session Folder Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyCoreUIFacade()
 * @model
 * @generated
 */
public interface ApogyCoreUIFacade extends EObject {

	/**
	 * Returns the value of the '<em><b>Default Apogy Project Name Prefix</b></em>' attribute.
	 * The default value is <code>"Project"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Project Name Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Apogy Project Name Prefix</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyCoreUIFacade_DefaultApogyProjectNamePrefix()
	 * @model default="Project" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultApogyProjectNamePrefix();

	/**
	 * Returns the value of the '<em><b>Default Apogy Session Filename</b></em>' attribute.
	 * The default value is <code>"session"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Session Filename Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Apogy Session Filename</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyCoreUIFacade_DefaultApogySessionFilename()
	 * @model default="session" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultApogySessionFilename();

	/**
	 * Returns the value of the '<em><b>Default Apogy Session Filename Extension</b></em>' attribute.
	 * The default value is <code>"sym"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Session Filename Extension Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Apogy Session Filename Extension</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyCoreUIFacade_DefaultApogySessionFilenameExtension()
	 * @model default="sym" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultApogySessionFilenameExtension();

	/**
	 * Returns the value of the '<em><b>Default Apogy Session Folder Name</b></em>' attribute.
	 * The default value is <code>"Sessions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Apogy Sessions Directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Apogy Session Folder Name</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyCoreUIFacade_DefaultApogySessionFolderName()
	 * @model default="Sessions" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultApogySessionFolderName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.ui.IProject" unique="false" settingsUnique="false"
	 * @generated
	 */
	IProject createApogyProject(NewApogyProjectSettings settings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.ui.IFolder" unique="false" settingsUnique="false"
	 * @generated
	 */
	IFolder createApogySessionFolder(NewApogyProjectSettings settings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" sessionSettingsUnique="false"
	 * @generated
	 */
	InvocatorSession createApogySession(NewApogySessionSettings sessionSettings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.ui.IFile" unique="false" exceptions="ca.gc.asc_csa.apogy.common.emf.Exception" resourceContainerDataType="ca.gc.asc_csa.apogy.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false" sessionUnique="false"
	 * @generated
	 */
	IFile createApogySessionFile(IContainer resourceContainer, String filename, InvocatorSession session) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.apogy.core.ui.IFile" unique="false" resourceContainerDataType="ca.gc.asc_csa.apogy.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false"
	 * @generated
	 */
	IFile getApogySessionFile(IContainer resourceContainer, String filename);

	/**
	 * @generated_NOT
	 */
	public static ApogyCoreUIFacade INSTANCE = ApogyCoreUIFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" systemSettingsUnique="false"
	 * @generated
	 */
	ApogySystem createApogySystem(NewApogySystemSettings systemSettings);
} // ApogyCoreUIFacade
