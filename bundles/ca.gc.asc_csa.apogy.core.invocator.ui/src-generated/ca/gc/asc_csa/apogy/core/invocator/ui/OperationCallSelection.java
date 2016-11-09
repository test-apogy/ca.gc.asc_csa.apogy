/**
 * Copyright (c) 2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *  
 *  Contributors:
 *      Pierre Allard (Pierre.Allard@canada.ca), 
 *      Regent L'Archeveque (Regent.Larcheveque@canada.ca),
 *      Sebastien Gemme (Sebastien.Gemme@canada.ca),
 *      Olivier L. Larouche (Olivier.LLarouche@canada.ca),
 *      Canadian Space Agency (CSA) - Initial API and implementation
 */
package ca.gc.asc_csa.apogy.core.invocator.ui;

import ca.gc.asc_csa.apogy.core.invocator.OperationCall;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.OperationCallSelection#getOperationCall <em>Operation Call</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getOperationCallSelection()
 * @model
 * @generated
 */
public interface OperationCallSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Call</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Call</em>' reference.
	 * @see #setOperationCall(OperationCall)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getOperationCallSelection_OperationCall()
	 * @model
	 * @generated
	 */
	OperationCall getOperationCall();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.OperationCallSelection#getOperationCall <em>Operation Call</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Call</em>' reference.
	 * @see #getOperationCall()
	 * @generated
	 */
	void setOperationCall(OperationCall value);

} // OperationCallSelection
