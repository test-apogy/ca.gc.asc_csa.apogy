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


import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bindings Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a set of bindings. The Binding set can be bound
 * and unbound as a group.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getFeatureRootsList <em>Feature Roots List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getBindingsList <em>Bindings List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBindingsSet()
 * @model
 * @generated
 */
public interface BindingsSet extends EObject
{
  /**
	 * Returns the value of the '<em><b>Feature Roots List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Roots List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of features used in the Bindings definitions.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Roots List</em>' containment reference.
	 * @see #setFeatureRootsList(FeatureRootsList)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBindingsSet_FeatureRootsList()
	 * @model containment="true" required="true"
	 * @generated
	 */
  FeatureRootsList getFeatureRootsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getFeatureRootsList <em>Feature Roots List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Roots List</em>' containment reference.
	 * @see #getFeatureRootsList()
	 * @generated
	 */
  void setFeatureRootsList(FeatureRootsList value);

  /**
	 * Returns the value of the '<em><b>Bindings List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bindings List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The list of Bindings.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bindings List</em>' containment reference.
	 * @see #setBindingsList(BindingsList)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getBindingsSet_BindingsList()
	 * @model containment="true" required="true"
	 * @generated
	 */
  BindingsList getBindingsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.BindingsSet#getBindingsList <em>Bindings List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bindings List</em>' containment reference.
	 * @see #getBindingsList()
	 * @generated
	 */
  void setBindingsList(BindingsList value);

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds all the Bindings contained in the bindingsList.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void bind();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unbinds all the Bindings contained in the bindingsList.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void unbind();

} // BindingsSet
