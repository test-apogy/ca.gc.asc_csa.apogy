/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.common.topology.bindings;

import ca.gc.asc_csa.apogy.common.topology.AggregateGroupNode;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase#isCaseValue <em>Case Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase#getTopologyRoot <em>Topology Root</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanCase()
 * @model
 * @generated
 */
public interface BooleanCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Value</em>' attribute.
	 * @see #setCaseValue(boolean)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanCase_CaseValue()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Editable' children='false'"
	 * @generated
	 */
	boolean isCaseValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase#isCaseValue <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Value</em>' attribute.
	 * @see #isCaseValue()
	 * @generated
	 */
	void setCaseValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Topology Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the topology to add to the parent Node
	 * when this case is activated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Root</em>' containment reference.
	 * @see #setTopologyRoot(AggregateGroupNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanCase_TopologyRoot()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	AggregateGroupNode getTopologyRoot();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanCase#getTopologyRoot <em>Topology Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Root</em>' containment reference.
	 * @see #getTopologyRoot()
	 * @generated
	 */
	void setTopologyRoot(AggregateGroupNode value);

} // BooleanCase
