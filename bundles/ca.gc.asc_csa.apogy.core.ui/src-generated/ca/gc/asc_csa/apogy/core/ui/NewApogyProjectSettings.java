/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.ui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Apogy Project Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#isImportRegisteredProject <em>Import Registered Project</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogyProjectSettings()
 * @model
 * @generated
 */
public interface NewApogyProjectSettings extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name of the project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogyProjectSettings_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Import Registered Project</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Import an existing registered project.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Import Registered Project</em>' attribute.
	 * @see #setImportRegisteredProject(boolean)
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogyProjectSettings_ImportRegisteredProject()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isImportRegisteredProject();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogyProjectSettings#isImportRegisteredProject <em>Import Registered Project</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Registered Project</em>' attribute.
	 * @see #isImportRegisteredProject()
	 * @generated
	 */
	void setImportRegisteredProject(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns an available project name.
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	String getDefaultProjectName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default values of the instance.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void setDefaultValues();

} // NewApogyProjectSettings
