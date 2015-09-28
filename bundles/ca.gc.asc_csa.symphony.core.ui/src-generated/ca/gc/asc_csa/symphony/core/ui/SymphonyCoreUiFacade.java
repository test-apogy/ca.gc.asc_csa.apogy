/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.symphony.core.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.eclipse.emf.ecore.invocator.InvocatorSession;
import ca.gc.asc_csa.symphony.core.SymphonySystem;
import ca.gc.asc_csa.symphony.core.ui.impl.SymphonyCoreUiFacadeImpl;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Facade</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonyProjectNamePrefix <em>Default Symphony Project Name Prefix</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilename <em>Default Symphony Session Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFilenameExtension <em>Default Symphony Session Filename Extension</em>}</li>
 *   <li>{@link ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiFacade#getDefaultSymphonySessionFolderName <em>Default Symphony Session Folder Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyCoreUiFacade()
 * @model
 * @generated
 */
public interface SymphonyCoreUiFacade extends EObject {

	/**
	 * Returns the value of the '<em><b>Default Symphony Project Name Prefix</b></em>' attribute.
	 * The default value is <code>"Project"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Default Symphony Project Name Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Project Name Prefix</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyCoreUiFacade_DefaultSymphonyProjectNamePrefix()
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
	 * * Default Symphony Session Filename Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Filename</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyCoreUiFacade_DefaultSymphonySessionFilename()
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
	 * * Default Symphony Session Filename Extension Prefix.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Filename Extension</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyCoreUiFacade_DefaultSymphonySessionFilenameExtension()
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
	 * * Default Symphony Sessions Directory.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Symphony Session Folder Name</em>' attribute.
	 * @see ca.gc.asc_csa.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyCoreUiFacade_DefaultSymphonySessionFolderName()
	 * @model default="Sessions" unique="false" changeable="false"
	 * @generated
	 */
	String getDefaultSymphonySessionFolderName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.core.ui.IProject" unique="false" settingsUnique="false"
	 * @generated
	 */
	IProject createSymphonyProject(NewSymphonyProjectSettings settings);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.core.ui.IFolder" unique="false" settingsUnique="false"
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
	 * @model dataType="ca.gc.asc_csa.symphony.core.ui.IFile" unique="false" exceptions="ca.gc.asc_csa.eclipse.emf.ecore.Exception" resourceContainerDataType="ca.gc.asc_csa.symphony.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false" sessionUnique="false"
	 * @generated
	 */
	IFile createSymphonySessionFile(IContainer resourceContainer, String filename, InvocatorSession session) throws Exception;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="ca.gc.asc_csa.symphony.core.ui.IFile" unique="false" resourceContainerDataType="ca.gc.asc_csa.symphony.core.ui.IContainer" resourceContainerUnique="false" filenameUnique="false"
	 * @generated
	 */
	IFile getSymphonySessionFile(IContainer resourceContainer, String filename);

	/**
	 * @generated_NOT
	 */
	public static SymphonyCoreUiFacade INSTANCE = SymphonyCoreUiFacadeImpl
			.getInstance();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" systemSettingsUnique="false"
	 * @generated
	 */
	SymphonySystem createSymphonySystem(NewSymphonySystemSettings systemSettings);
} // SymphonyCoreUiFacade
