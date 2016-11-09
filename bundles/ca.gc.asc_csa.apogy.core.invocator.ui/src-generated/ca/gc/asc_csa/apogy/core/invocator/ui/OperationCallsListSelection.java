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

import ca.gc.asc_csa.apogy.core.invocator.OperationCallsList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Calls List Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.ui.OperationCallsListSelection#getOperationCallsList <em>Operation Calls List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getOperationCallsListSelection()
 * @model
 * @generated
 */
public interface OperationCallsListSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation Calls List</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Calls List</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Calls List</em>' reference.
	 * @see #setOperationCallsList(OperationCallsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ui.ApogyCoreInvocatorUIPackage#getOperationCallsListSelection_OperationCallsList()
	 * @model
	 * @generated
	 */
	OperationCallsList getOperationCallsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.ui.OperationCallsListSelection#getOperationCallsList <em>Operation Calls List</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Calls List</em>' reference.
	 * @see #getOperationCallsList()
	 * @generated
	 */
	void setOperationCallsList(OperationCallsList value);

} // OperationCallsListSelection
