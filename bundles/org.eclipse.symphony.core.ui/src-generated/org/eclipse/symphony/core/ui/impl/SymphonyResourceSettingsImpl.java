/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui.impl;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.symphony.core.ui.SymphonyCoreUiPackage;
import org.eclipse.symphony.core.ui.SymphonyResourceSettings;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symphony Resource Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl#getResourceProject <em>Resource Project</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl#getResourceFile <em>Resource File</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.impl.SymphonyResourceSettingsImpl#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SymphonyResourceSettingsImpl extends MinimalEObjectImpl.Container implements SymphonyResourceSettings {
	/**
	 * The default value of the '{@link #getResourceProject() <em>Resource Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProject()
	 * @generated
	 * @ordered
	 */
	protected static final IProject RESOURCE_PROJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceProject() <em>Resource Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceProject()
	 * @generated
	 * @ordered
	 */
	protected IProject resourceProject = RESOURCE_PROJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceFile() <em>Resource File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceFile()
	 * @generated
	 * @ordered
	 */
	protected static final IFile RESOURCE_FILE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceFile() <em>Resource File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceFile()
	 * @generated
	 * @ordered
	 */
	protected IFile resourceFile = RESOURCE_FILE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceContainer() <em>Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected static final IContainer RESOURCE_CONTAINER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceContainer() <em>Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceContainer()
	 * @generated
	 * @ordered
	 */
	protected IContainer resourceContainer = RESOURCE_CONTAINER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SymphonyResourceSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SymphonyCoreUiPackage.Literals.SYMPHONY_RESOURCE_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IProject getResourceProject() {
		return resourceProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceProject(IProject newResourceProject) {
		IProject oldResourceProject = resourceProject;
		resourceProject = newResourceProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT, oldResourceProject, resourceProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IFile getResourceFile() {
		return resourceFile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceFile(IFile newResourceFile) {
		IFile oldResourceFile = resourceFile;
		resourceFile = newResourceFile;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE, oldResourceFile, resourceFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IContainer getResourceContainer() {
		return resourceContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceContainer(IContainer newResourceContainer) {
		IContainer oldResourceContainer = resourceContainer;
		resourceContainer = newResourceContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER, oldResourceContainer, resourceContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT:
				return getResourceProject();
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE:
				return getResourceFile();
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER:
				return getResourceContainer();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT:
				setResourceProject((IProject)newValue);
				return;
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE:
				setResourceFile((IFile)newValue);
				return;
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER:
				setResourceContainer((IContainer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT:
				setResourceProject(RESOURCE_PROJECT_EDEFAULT);
				return;
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE:
				setResourceFile(RESOURCE_FILE_EDEFAULT);
				return;
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER:
				setResourceContainer(RESOURCE_CONTAINER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_PROJECT:
				return RESOURCE_PROJECT_EDEFAULT == null ? resourceProject != null : !RESOURCE_PROJECT_EDEFAULT.equals(resourceProject);
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_FILE:
				return RESOURCE_FILE_EDEFAULT == null ? resourceFile != null : !RESOURCE_FILE_EDEFAULT.equals(resourceFile);
			case SymphonyCoreUiPackage.SYMPHONY_RESOURCE_SETTINGS__RESOURCE_CONTAINER:
				return RESOURCE_CONTAINER_EDEFAULT == null ? resourceContainer != null : !RESOURCE_CONTAINER_EDEFAULT.equals(resourceContainer);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resourceProject: ");
		result.append(resourceProject);
		result.append(", resourceFile: ");
		result.append(resourceFile);
		result.append(", resourceContainer: ");
		result.append(resourceContainer);
		result.append(')');
		return result.toString();
	}

} //SymphonyResourceSettingsImpl
