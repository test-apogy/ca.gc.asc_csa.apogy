/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Symphony System Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySystemSettings()
 * @model
 * @generated
 */
public interface NewSymphonySystemSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Folder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Folder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Folder</em>' attribute.
	 * @see #setFolder(String)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySystemSettings_Folder()
	 * @model unique="false"
	 * @generated
	 */
	String getFolder();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFolder <em>Folder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Folder</em>' attribute.
	 * @see #getFolder()
	 * @generated
	 */
	void setFolder(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySystemSettings_Filename()
	 * @model unique="false"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySystemSettings#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // NewSymphonySystemSettings
