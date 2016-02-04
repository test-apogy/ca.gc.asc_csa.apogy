package ca.gc.asc_csa.apogy.common.topology.bindings;
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
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enumeration Switch Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binding that attached different sub-topology to a GroupNode based
 * on the feature value. The feature must be an EEnum.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getCases <em>Cases</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getActiveCase <em>Active Case</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationSwitchBinding()
 * @model
 * @generated
 */
public interface EnumerationSwitchBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Parent Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node under which the switch should attached sub-topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent Node</em>' reference.
	 * @see #setParentNode(GroupNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationSwitchBinding_ParentNode()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  GroupNode getParentNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getParentNode <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' reference.
	 * @see #getParentNode()
	 * @generated
	 */
  void setParentNode(GroupNode value);

  /**
	 * Returns the value of the '<em><b>Cases</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationCase}.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of cases defined for the switch.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cases</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationSwitchBinding_Cases()
	 * @model containment="true" required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='ENUMERATION'"
	 * @generated
	 */
  EList<EnumerationCase> getCases();

  /**
	 * Returns the value of the '<em><b>Active Case</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The case currently active.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Active Case</em>' reference.
	 * @see #setActiveCase(EnumerationCase)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getEnumerationSwitchBinding_ActiveCase()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='ENUMERATION'"
	 * @generated
	 */
  EnumerationCase getActiveCase();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.EnumerationSwitchBinding#getActiveCase <em>Active Case</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Case</em>' reference.
	 * @see #getActiveCase()
	 * @generated
	 */
  void setActiveCase(EnumerationCase value);

} // EnumerationSwitchBinding
