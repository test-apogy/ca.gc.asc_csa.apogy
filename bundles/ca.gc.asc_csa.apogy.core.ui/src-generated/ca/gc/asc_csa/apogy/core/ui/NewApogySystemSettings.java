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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Apogy System Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFolder <em>Folder</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFilename <em>Filename</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySystemSettings()
 * @model
 * @generated
 */
public interface NewApogySystemSettings extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySystemSettings_Folder()
	 * @model unique="false"
	 * @generated
	 */
	String getFolder();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFolder <em>Folder</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getNewApogySystemSettings_Filename()
	 * @model unique="false"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.NewApogySystemSettings#getFilename <em>Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

} // NewApogySystemSettings
