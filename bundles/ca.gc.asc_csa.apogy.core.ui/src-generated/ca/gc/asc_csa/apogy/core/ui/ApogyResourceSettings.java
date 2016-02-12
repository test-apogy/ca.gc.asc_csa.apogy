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
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Resource Settings</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to support Apogy wizards.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceProject <em>Resource Project</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceFile <em>Resource File</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceContainer <em>Resource Container</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyResourceSettings()
 * @model
 * @generated
 */
public interface ApogyResourceSettings extends EObject {
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyResourceSettings_ResourceProject()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.ui.IProject"
	 * @generated
	 */
	IProject getResourceProject();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceProject <em>Resource Project</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyResourceSettings_ResourceFile()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.ui.IFile"
	 * @generated
	 */
	IFile getResourceFile();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceFile <em>Resource File</em>}' attribute.
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
	 * @see ca.gc.asc_csa.apogy.core.ui.ApogyCoreUIPackage#getApogyResourceSettings_ResourceContainer()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.core.ui.IContainer"
	 * @generated
	 */
	IContainer getResourceContainer();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ui.ApogyResourceSettings#getResourceContainer <em>Resource Container</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Container</em>' attribute.
	 * @see #getResourceContainer()
	 * @generated
	 */
	void setResourceContainer(IContainer value);

} // ApogyResourceSettings
