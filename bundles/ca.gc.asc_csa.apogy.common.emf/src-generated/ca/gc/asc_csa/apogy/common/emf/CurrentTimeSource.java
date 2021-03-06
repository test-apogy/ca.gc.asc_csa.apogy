package ca.gc.asc_csa.apogy.common.emf;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Current Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Time source that provides the current time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCurrentTimeSource()
 * @model
 * @generated
 */
public interface CurrentTimeSource extends TimeSource {
	/**
	 * Returns the value of the '<em><b>Update Period</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The update period of the time, in milliseconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Period</em>' attribute.
	 * @see #setUpdatePeriod(int)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCurrentTimeSource_UpdatePeriod()
	 * @model default="1000" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='ms' notify='true' property='Editable'"
	 * @generated
	 */
	int getUpdatePeriod();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#getUpdatePeriod <em>Update Period</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Period</em>' attribute.
	 * @see #getUpdatePeriod()
	 * @generated
	 */
	void setUpdatePeriod(int value);

	/**
	 * Returns the value of the '<em><b>Paused</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the time source has been paused.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Paused</em>' attribute.
	 * @see #setPaused(boolean)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getCurrentTimeSource_Paused()
	 * @model default="false" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true' property='Readonly'"
	 * @generated
	 */
	boolean isPaused();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.CurrentTimeSource#isPaused <em>Paused</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paused</em>' attribute.
	 * @see #isPaused()
	 * @generated
	 */
	void setPaused(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Pause the time.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void pause();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Resume time update.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void resume();

} // CurrentTimeSource
