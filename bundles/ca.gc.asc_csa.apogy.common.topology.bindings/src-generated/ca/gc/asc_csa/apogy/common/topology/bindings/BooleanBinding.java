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

import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Boolean Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * *
 * Binding that attaches two different sub-topology to a GroupNode based
 * on the feature value. The feature must be a Boolean.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#isCurrentValue <em>Current Value</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getTrueCase <em>True Case</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getFalseCase <em>False Case</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanBinding()
 * @model
 * @generated
 */
public interface BooleanBinding extends AbstractTopologyBinding {
	/**
	 * Returns the value of the '<em><b>Current Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Current Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Value</em>' attribute.
	 * @see #setCurrentValue(boolean)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanBinding_CurrentValue()
	 * @model unique="false"
	 * @generated
	 */
	boolean isCurrentValue();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#isCurrentValue <em>Current Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Value</em>' attribute.
	 * @see #isCurrentValue()
	 * @generated
	 */
	void setCurrentValue(boolean value);

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node under which to attach the sub-topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Node</em>' reference.
	 * @see #setParentNode(GroupNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanBinding_ParentNode()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
	GroupNode getParentNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getParentNode <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' reference.
	 * @see #getParentNode()
	 * @generated
	 */
	void setParentNode(GroupNode value);

	/**
	 * Returns the value of the '<em><b>True Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The true case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>True Case</em>' containment reference.
	 * @see #setTrueCase(TrueBooleanCase)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanBinding_TrueCase()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	TrueBooleanCase getTrueCase();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getTrueCase <em>True Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>True Case</em>' containment reference.
	 * @see #getTrueCase()
	 * @generated
	 */
	void setTrueCase(TrueBooleanCase value);

	/**
	 * Returns the value of the '<em><b>False Case</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The false case.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>False Case</em>' containment reference.
	 * @see #setFalseCase(FalseBooleanCase)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBooleanBinding_FalseCase()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel children='true'"
	 * @generated
	 */
	FalseBooleanCase getFalseCase();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BooleanBinding#getFalseCase <em>False Case</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>False Case</em>' containment reference.
	 * @see #getFalseCase()
	 * @generated
	 */
	void setFalseCase(FalseBooleanCase value);

} // BooleanBinding
