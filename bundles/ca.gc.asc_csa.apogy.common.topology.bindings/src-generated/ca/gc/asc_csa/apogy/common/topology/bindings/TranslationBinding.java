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

import ca.gc.asc_csa.apogy.common.topology.PositionNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Translation Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Binding that binds a PositionNode translation along one axis to the feature value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getTranslationBinding()
 * @model
 * @generated
 */
public interface TranslationBinding extends AbstractTopologyBinding
{
  /**
	 * Returns the value of the '<em><b>Translation Axis</b></em>' attribute.
	 * The default value is <code>"X_AXIS"</code>.
	 * The literals are from the enumeration {@link ca.gc.asc_csa.apogy.common.topology.bindings.Axis}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Translation Axis</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The axis along which the translation occurs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Translation Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @see #setTranslationAxis(Axis)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getTranslationBinding_TranslationAxis()
	 * @model default="X_AXIS" unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  Axis getTranslationAxis();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getTranslationAxis <em>Translation Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Translation Axis</em>' attribute.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.Axis
	 * @see #getTranslationAxis()
	 * @generated
	 */
  void setTranslationAxis(Axis value);

  /**
	 * Returns the value of the '<em><b>Position Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Position Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The PositionNode that will be updated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position Node</em>' reference.
	 * @see #setPositionNode(PositionNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getTranslationBinding_PositionNode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='DESTINATION'"
	 * @generated
	 */
  PositionNode getPositionNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.TranslationBinding#getPositionNode <em>Position Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position Node</em>' reference.
	 * @see #getPositionNode()
	 * @generated
	 */
  void setPositionNode(PositionNode value);

} // TranslationBinding
