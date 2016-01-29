/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.ui.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIFacade;
import ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Apogy Project Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.impl.NewApogyProjectSettingsImpl#isImportRegisteredProject <em>Import Registered Project</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NewApogyProjectSettingsImpl extends MinimalEObjectImpl.Container implements NewApogyProjectSettings {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isImportRegisteredProject() <em>Import Registered Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImportRegisteredProject()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IMPORT_REGISTERED_PROJECT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImportRegisteredProject() <em>Import Registered Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImportRegisteredProject()
	 * @generated
	 * @ordered
	 */
	protected boolean importRegisteredProject = IMPORT_REGISTERED_PROJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewApogyProjectSettingsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApogyCoreUIPackage.Literals.NEW_APOGY_PROJECT_SETTINGS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImportRegisteredProject() {
		return importRegisteredProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportRegisteredProject(boolean newImportRegisteredProject) {
		boolean oldImportRegisteredProject = importRegisteredProject;
		importRegisteredProject = newImportRegisteredProject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT, oldImportRegisteredProject, importRegisteredProject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public String getDefaultProjectName() {
		String result = null;
		int index = 0;
		IWorkspaceRoot workspace = ResourcesPlugin.getWorkspace().getRoot();		
		String name = ApogyCoreUIFacade.INSTANCE.getDefaultApogyProjectNamePrefix();
				
		while (result == null){
			IProject project = workspace.getProject(name);
			if (!project.exists()){
				result = name;
			}
			index++;
			name = ApogyCoreUIFacade.INSTANCE.getDefaultApogyProjectNamePrefix() + "_" + index;
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated_NOT
	 */
	public void setDefaultValues() {
		setName(getDefaultProjectName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__NAME:
				return getName();
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT:
				return isImportRegisteredProject();
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
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__NAME:
				setName((String)newValue);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT:
				setImportRegisteredProject((Boolean)newValue);
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
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT:
				setImportRegisteredProject(IMPORT_REGISTERED_PROJECT_EDEFAULT);
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
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS__IMPORT_REGISTERED_PROJECT:
				return importRegisteredProject != IMPORT_REGISTERED_PROJECT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS___GET_DEFAULT_PROJECT_NAME:
				return getDefaultProjectName();
			case ApogyCoreUIPackage.NEW_APOGY_PROJECT_SETTINGS___SET_DEFAULT_VALUES:
				setDefaultValues();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", importRegisteredProject: ");
		result.append(importRegisteredProject);
		result.append(')');
		return result.toString();
	}

} //NewApogyProjectSettingsImpl
