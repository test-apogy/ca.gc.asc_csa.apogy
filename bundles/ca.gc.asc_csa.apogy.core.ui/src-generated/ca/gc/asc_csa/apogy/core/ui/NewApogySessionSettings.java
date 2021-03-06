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
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Apogy Session Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFolder <em>Folder</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFilename <em>Filename</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateEnvironment <em>Create Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreatePrograms <em>Create Programs</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateDataProducts <em>Create Data Products</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateTools <em>Create Tools</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings()
 * @model
 * @generated
 */
public interface NewApogySessionSettings extends EObject
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_Folder()
	 * @model unique="false"
	 * @generated
	 */
  String getFolder();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFolder <em>Folder</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_Filename()
	 * @model unique="false"
	 * @generated
	 */
  String getFilename();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#getFilename <em>Filename</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_CreateEnvironment()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateEnvironment <em>Create Environment</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_CreatePrograms()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreatePrograms();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreatePrograms <em>Create Programs</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_CreateDataProducts()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateDataProducts();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateDataProducts <em>Create Data Products</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySessionSettings_CreateTools()
	 * @model default="true" unique="false"
	 * @generated
	 */
  boolean isCreateTools();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySessionSettings#isCreateTools <em>Create Tools</em>}' attribute.
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
	 * Returns an available session filename.
	 * <!-- end-model-doc -->
	 * @model unique="false" resourceContainerDataType="ca.gc.asc_csa.apogy.core.ui.IContainer" resourceContainerUnique="false"
	 * @generated
	 */
	String getDefaultFilename(IContainer resourceContainer);

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets the default values of the instance.
	 * <!-- end-model-doc -->
	 * @model resourceContainerDataType="ca.gc.asc_csa.apogy.core.ui.IContainer" resourceContainerUnique="false"
	 * @generated
	 */
	void setDefaultValues(IContainer resourceContainer);

} // NewApogySessionSettings
