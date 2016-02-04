package ca.gc.asc_csa.apogy.common.io.jinput;
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
 * A representation of the model object '<em><b>EComponent Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier()
 * @model
 * @generated
 */
public interface EComponentQualifier extends EObject {
	/**
	 * Returns the value of the '<em><b>EComponent Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EComponent Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EComponent Name</em>' attribute.
	 * @see #setEComponentName(String)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier_EComponentName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEComponentName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEComponentName <em>EComponent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EComponent Name</em>' attribute.
	 * @see #getEComponentName()
	 * @generated
	 */
	void setEComponentName(String value);

	/**
	 * Returns the value of the '<em><b>EController Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EController Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EController Name</em>' attribute.
	 * @see #setEControllerName(String)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponentQualifier_EControllerName()
	 * @model unique="false" required="true"
	 * @generated
	 */
	String getEControllerName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponentQualifier#getEControllerName <em>EController Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EController Name</em>' attribute.
	 * @see #getEControllerName()
	 * @generated
	 */
	void setEControllerName(String value);

} // EComponentQualifier
