/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symphony Resource Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * * This class is used to support Symphony wizards.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceProject <em>Resource Project</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceFile <em>Resource File</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyResourceSettings()
 * @model
 * @generated
 */
public interface SymphonyResourceSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Resource Project</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Project</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Project</em>' attribute.
	 * @see #setResourceProject(IProject)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyResourceSettings_ResourceProject()
	 * @model unique="false" dataType="org.eclipse.symphony.core.ui.IProject"
	 * @generated
	 */
	IProject getResourceProject();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceProject <em>Resource Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Project</em>' attribute.
	 * @see #getResourceProject()
	 * @generated
	 */
	void setResourceProject(IProject value);

	/**
	 * Returns the value of the '<em><b>Resource File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource File</em>' attribute.
	 * @see #setResourceFile(IFile)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyResourceSettings_ResourceFile()
	 * @model unique="false" dataType="org.eclipse.symphony.core.ui.IFile"
	 * @generated
	 */
	IFile getResourceFile();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceFile <em>Resource File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource File</em>' attribute.
	 * @see #getResourceFile()
	 * @generated
	 */
	void setResourceFile(IFile value);

	/**
	 * Returns the value of the '<em><b>Resource Container</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Container</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Container</em>' attribute.
	 * @see #setResourceContainer(IContainer)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getSymphonyResourceSettings_ResourceContainer()
	 * @model unique="false" dataType="org.eclipse.symphony.core.ui.IContainer"
	 * @generated
	 */
	IContainer getResourceContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.SymphonyResourceSettings#getResourceContainer <em>Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container</em>' attribute.
	 * @see #getResourceContainer()
	 * @generated
	 */
	void setResourceContainer(IContainer value);

} // SymphonyResourceSettings
