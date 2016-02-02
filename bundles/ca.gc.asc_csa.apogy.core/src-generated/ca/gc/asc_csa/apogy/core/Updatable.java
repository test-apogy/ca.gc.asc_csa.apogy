package ca.gc.asc_csa.apogy.core;
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
 * A representation of the model object '<em><b>Updatable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Other Generic Classes.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.Updatable#isUpdating <em>Updating</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.Updatable#isAutoUpdateEnabled <em>Auto Update Enabled</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getUpdatable()
 * @model abstract="true"
 * @generated
 */
public interface Updatable extends EObject {
	/**
	 * Returns the value of the '<em><b>Updating</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the object is busy updating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Updating</em>' attribute.
	 * @see #setUpdating(boolean)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getUpdatable_Updating()
	 * @model default="false" unique="false" transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='UPDATABLE'"
	 * @generated
	 */
	boolean isUpdating();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.Updatable#isUpdating <em>Updating</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Updating</em>' attribute.
	 * @see #isUpdating()
	 * @generated
	 */
	void setUpdating(boolean value);

	/**
	 * Returns the value of the '<em><b>Auto Update Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the object auto update is enabled.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Update Enabled</em>' attribute.
	 * @see #setAutoUpdateEnabled(boolean)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getUpdatable_AutoUpdateEnabled()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='UPDATABLE'"
	 * @generated
	 */
	boolean isAutoUpdateEnabled();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.Updatable#isAutoUpdateEnabled <em>Auto Update Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Update Enabled</em>' attribute.
	 * @see #isAutoUpdateEnabled()
	 * @generated
	 */
	void setAutoUpdateEnabled(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Returns the default value of autoUpdateEnabled;
	 * <!-- end-model-doc -->
	 * @model kind="operation" unique="false"
	 * @generated
	 */
	boolean getDefaultAutoUpdateEnabled();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Update method.
	 * <!-- end-model-doc -->
	 * @model exceptions="ca.gc.asc_csa.apogy.core.Exception"
	 * @generated
	 */
	void update() throws Exception;

} // Updatable
