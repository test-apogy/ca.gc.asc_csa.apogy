/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.symphony.core.SymphonySystem;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.ui.impl.Symphony__CoreUIFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.Symphony__CoreUIFacade#getDefaultSymphonyProjectNamePrefix <em>Default Symphony Project Name Prefix</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.Symphony__CoreUIFacade#getDefaultSymphonySessionFilename <em>Default Symphony Session Filename</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.Symphony__CoreUIFacade#getDefaultSymphonySessionFilenameExtension <em>Default Symphony Session Filename Extension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.Symphony__CoreUIFacade#getDefaultSymphonySessionFolderName <em>Default Symphony Session Folder Name</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getSymphony__CoreUIFacade()
 * @model
 * @generated
 */
public interface Symphony__CoreUIFacade extends EObject {

	/**
	 * Returns the value of the '<em><b>Default Symphony Project Name Prefix</b></em>' attribute.
	 * The default value is <code>"Project"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Symphony Project Name Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Project Name Prefix</em>' attribute.
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getSymphony__CoreUIFacade_DefaultSymphonyProjectNamePrefix()
	 * @model default="Project" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultSymphonyProjectNamePrefix();

	/**
	 * Returns the value of the '<em><b>Default Symphony Session Filename</b></em>' attribute.
	 * The default value is <code>"session"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Symphony Session Filename Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Filename</em>' attribute.
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getSymphony__CoreUIFacade_DefaultSymphonySessionFilename()
	 * @model default="session" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultSymphonySessionFilename();

	/**
	 * Returns the value of the '<em><b>Default Symphony Session Filename Extension</b></em>' attribute.
	 * The default value is <code>"sym"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Symphony Session Filename Extension Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Filename Extension</em>' attribute.
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getSymphony__CoreUIFacade_DefaultSymphonySessionFilenameExtension()
	 * @model default="sym" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultSymphonySessionFilenameExtension();

	/**
	 * Returns the value of the '<em><b>Default Symphony Session Folder Name</b></em>' attribute.
	 * The default value is <code>"Sessions"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Default Symphony Sessions Directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Folder Name</em>' attribute.
	 * @see org.eclipse.symphony.core.ui.Symphony__CoreUIPackage#getSymphony__CoreUIFacade_DefaultSymphonySessionFolderName()
	 * @model default="Sessions" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultSymphonySessionFolderName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.ui.IProject" unique="false" settingsUnique="false"
	 * @generated
	 */
	IProject createSymphonyProject(NewSymphonyProjectSettings settings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.ui.IFolder" unique="false" settingsUnique="false"
	 * @generated
	 */
	IFolder createSymphonySessionFolder(NewSymphonyProjectSettings settings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" sessionSettingsUnique="false"
	 * @generated
	 */
	InvocatorSession createSymphonySession(NewSymphonySessionSettings sessionSettings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.ui.IFile" unique="false" exceptions="org.eclipse.symphony.common.emf.Exception" resourceContainerDataType="org.eclipse.symphony.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false" sessionUnique="false"
	 * @generated
	 */
	IFile createSymphonySessionFile(IContainer resourceContainer, String filename, InvocatorSession session) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.symphony.core.ui.IFile" unique="false" resourceContainerDataType="org.eclipse.symphony.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false"
	 * @generated
	 */
	IFile getSymphonySessionFile(IContainer resourceContainer, String filename);

	/**
	 * @generated_NOT
	 */
	public static Symphony__CoreUIFacade INSTANCE = Symphony__CoreUIFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" systemSettingsUnique="false"
	 * @generated
	 */
	SymphonySystem createSymphonySystem(NewSymphonySystemSettings systemSettings);
} // Symphony__CoreUIFacade