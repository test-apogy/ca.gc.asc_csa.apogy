package ca.gc.asc_csa.apogy.common.file.csv;
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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Csv Columns Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumnsSet#getColumns <em>Columns</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumnsSet#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumnsSet()
 * @model
 * @generated
 */
public interface CsvColumnsSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' attribute.
	 * @see #setColumns(Map)
	 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumnsSet_Columns()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.file.csv.CsvColumnMap" transient="true"
	 * @generated
	 */
	Map<String, CsvColumn> getColumns();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumnsSet#getColumns <em>Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Columns</em>' attribute.
	 * @see #getColumns()
	 * @generated
	 */
	void setColumns(Map<String, CsvColumn> value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.common.file.csv.ApogyCommonFileCSVPackage#getCsvColumnsSet_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.file.csv.CsvColumnsSet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CsvColumnsSet
