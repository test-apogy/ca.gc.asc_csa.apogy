/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package org.eclipse.symphony.core.ui;


import org.eclipse.core.resources.IContainer;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Symphony Session Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFolder <em>Folder</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateEnvironment <em>Create Environment</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreatePrograms <em>Create Programs</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateDataProducts <em>Create Data Products</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateTools <em>Create Tools</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings()
 * @model
 * @generated
 */
public interface NewSymphonySessionSettings extends EObject
{
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
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_Folder()
	 * @model unique="false"
	 * @generated
	 */
  String getFolder();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFolder <em>Folder</em>}' attribute.
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
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_Filename()
	 * @model unique="false"
	 * @generated
	 */
  String getFilename();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
  void setFilename(String value);

  /**
	 * Returns the value of the '<em><b>Create Environment</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Environment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Environment</em>' attribute.
	 * @see #setCreateEnvironment(boolean)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_CreateEnvironment()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateEnvironment();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateEnvironment <em>Create Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Environment</em>' attribute.
	 * @see #isCreateEnvironment()
	 * @generated
	 */
  void setCreateEnvironment(boolean value);

  /**
	 * Returns the value of the '<em><b>Create Programs</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Programs</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Programs</em>' attribute.
	 * @see #setCreatePrograms(boolean)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_CreatePrograms()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreatePrograms();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreatePrograms <em>Create Programs</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Programs</em>' attribute.
	 * @see #isCreatePrograms()
	 * @generated
	 */
  void setCreatePrograms(boolean value);

  /**
	 * Returns the value of the '<em><b>Create Data Products</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Data Products</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Data Products</em>' attribute.
	 * @see #setCreateDataProducts(boolean)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_CreateDataProducts()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateDataProducts();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateDataProducts <em>Create Data Products</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Data Products</em>' attribute.
	 * @see #isCreateDataProducts()
	 * @generated
	 */
  void setCreateDataProducts(boolean value);

  /**
	 * Returns the value of the '<em><b>Create Tools</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Create Tools</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Tools</em>' attribute.
	 * @see #setCreateTools(boolean)
	 * @see org.eclipse.symphony.core.ui.SymphonyCoreUiPackage#getNewSymphonySessionSettings_CreateTools()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateTools();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.ui.NewSymphonySessionSettings#isCreateTools <em>Create Tools</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Tools</em>' attribute.
	 * @see #isCreateTools()
	 * @generated
	 */
  void setCreateTools(boolean value);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Returns an available session filename.
	 * <!-- end-model-doc -->
	 * @model unique="false" resourceContainerDataType="org.eclipse.symphony.core.ui.IContainer" resourceContainerUnique="false"
	 * @generated
	 */
	String getDefaultFilename(IContainer resourceContainer);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * * Sets the default values of the instance.
	 * <!-- end-model-doc -->
	 * @model resourceContainerDataType="org.eclipse.symphony.core.ui.IContainer" resourceContainerUnique="false"
	 * @generated
	 */
	void setDefaultValues(IContainer resourceContainer);

} // NewSymphonySessionSettings
