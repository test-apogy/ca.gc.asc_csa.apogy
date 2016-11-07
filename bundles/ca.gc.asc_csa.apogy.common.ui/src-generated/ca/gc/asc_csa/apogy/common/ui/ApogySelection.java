/**
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
package ca.gc.asc_csa.apogy.common.ui;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.jface.viewers.ISelection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.ui.ApogySelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.ui.ApogySelection#getPartID <em>Part ID</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage#getApogySelection()
 * @model
 * @generated
 */
public interface ApogySelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(ISelection)
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage#getApogySelection_Selection()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.ui.ISelection"
	 * @generated
	 */
	ISelection getSelection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.ui.ApogySelection#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(ISelection value);

	/**
	 * Returns the value of the '<em><b>Part ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Part ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Part ID</em>' attribute.
	 * @see #setPartID(String)
	 * @see ca.gc.asc_csa.apogy.common.ui.ApogyCommonUiPackage#getApogySelection_PartID()
	 * @model unique="false"
	 * @generated
	 */
	String getPartID();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.ui.ApogySelection#getPartID <em>Part ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Part ID</em>' attribute.
	 * @see #getPartID()
	 * @generated
	 */
	void setPartID(String value);

} // ApogySelection
