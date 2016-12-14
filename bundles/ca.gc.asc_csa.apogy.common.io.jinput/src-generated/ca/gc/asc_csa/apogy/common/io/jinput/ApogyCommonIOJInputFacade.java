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
package ca.gc.asc_csa.apogy.common.io.jinput;

import org.eclipse.emf.ecore.EObject;

import ca.gc.asc_csa.apogy.common.io.jinput.impl.ApogyCommonIOJInputFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade#isSelectingComponent <em>Selecting Component</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getApogyCommonIOJInputFacade()
 * @model
 * @generated
 */
public interface ApogyCommonIOJInputFacade extends EObject {
	/**
	 * Returns the value of the '<em><b>Selecting Component</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selecting Component</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selecting Component</em>' attribute.
	 * @see #setSelectingComponent(boolean)
	 * @see ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputPackage#getApogyCommonIOJInputFacade_SelectingComponent()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isSelectingComponent();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.io.jinput.ApogyCommonIOJInputFacade#isSelectingComponent <em>Selecting Component</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selecting Component</em>' attribute.
	 * @see #isSelectingComponent()
	 * @generated
	 */
	void setSelectingComponent(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Starts the component selection.
	 * @param eComponentQualifier The {@link EComponentQualifier} to save the selection.
	 * <!-- end-model-doc -->
	 * @model eComponentQualifierUnique="false"
	 * @generated
	 */
	void startSelectComponent(EComponentQualifier eComponentQualifier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stops the component selection.
	 * @param eComponentQualifier The {@link EComponentQualifier} that was being selected.
	 * <!-- end-model-doc -->
	 * @model eComponentQualifierUnique="false"
	 * @generated
	 */
	void stopSelectComponent(EComponentQualifier eComponentQualifier);

	/**
	 * @generated_NOT
	 */
	public static ApogyCommonIOJInputFacade INSTANCE = ApogyCommonIOJInputFacadeImpl.getInstance();

} // ApogyCommonIOJInputFacade
