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
 * A representation of the model object '<em><b>Time Source</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Time Sources.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.TimeSource#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getTimeSource()
 * @model abstract="true"
 * @generated
 */
public interface TimeSource extends Named, Described, Timed, Disposable {

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * *
	 * Offset in milliseconds
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(int)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getTimeSource_Offset()
	 * @model default="0" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel apogy_units='ms' notify='true' property='Editable'"
	 * @generated
	 */
	int getOffset();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.TimeSource#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(int value);
} // TimeSource
