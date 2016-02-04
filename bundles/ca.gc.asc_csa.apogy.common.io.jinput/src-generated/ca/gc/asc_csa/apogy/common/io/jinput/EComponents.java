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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComponents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getComponents <em>Components</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getEController <em>EController</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponents()
 * @model
 * @generated
 */
public interface EComponents extends EObject {
	/**
	 * Returns the value of the '<em><b>Components</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Components</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Components</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponents_Components()
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.EComponent#getEComponents
	 * @model opposite="eComponents" containment="true" transient="true" changeable="false"
	 * @generated
	 */
	EList<EComponent> getComponents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponents_Name()
	 * @model default="" unique="false" transient="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>EController</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.io.jinput.EController#getEComponents <em>EComponents</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EController</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EController</em>' container reference.
	 * @see #setEController(EController)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getEComponents_EController()
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.EController#getEComponents
	 * @model opposite="eComponents"
	 * @generated
	 */
	EController getEController();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.EComponents#getEController <em>EController</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EController</em>' container reference.
	 * @see #getEController()
	 * @generated
	 */
	void setEController(EController value);

} // EComponents
