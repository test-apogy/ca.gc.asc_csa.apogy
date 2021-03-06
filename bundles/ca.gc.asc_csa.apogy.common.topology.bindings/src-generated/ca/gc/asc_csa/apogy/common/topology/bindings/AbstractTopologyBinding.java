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

import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.emf.AbstractFeatureNode;
import ca.gc.asc_csa.apogy.common.emf.FeatureNodeAdapter;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Topology Binding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abstract base class representing a binding relationship between a topology and a feature.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#isBinded <em>Binded</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getName <em>Name</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getSource <em>Source</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNode <em>Feature Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNodeAdapter <em>Feature Node Adapter</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding()
 * @model abstract="true"
 * @generated
 */
public interface AbstractTopologyBinding extends EObject
{
  /**
	 * Returns the value of the '<em><b>Binded</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Binded</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether or not the binding is bound.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Binded</em>' attribute.
	 * @see #setBinded(boolean)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_Binded()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly' propertyCategory='INFORMATION'"
	 * @generated
	 */
  boolean isBinded();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#isBinded <em>Binded</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binded</em>' attribute.
	 * @see #isBinded()
	 * @generated
	 */
  void setBinded(boolean value);

  /**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The description of the binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_Description()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='INFORMATION'"
	 * @generated
	 */
  String getDescription();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
  void setDescription(String value);

  /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the binding.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_Name()
	 * @model unique="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='INFORMATION'"
	 * @generated
	 */
  String getName();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
  void setName(String value);

  /**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Source</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The source object onto which the feature must be resolved.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(EObject)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_Source()
	 * @model transient="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' propertyCategory='SOURCE'"
	 * @generated
	 */
  EObject getSource();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
  void setSource(EObject value);

  /**
	 * Returns the value of the '<em><b>Feature Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The feature the binding is associated with.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Node</em>' reference.
	 * @see #setFeatureNode(AbstractFeatureNode)
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_FeatureNode()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel propertyCategory='SOURCE'"
	 * @generated
	 */
  AbstractFeatureNode getFeatureNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.bindings.AbstractTopologyBinding#getFeatureNode <em>Feature Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Node</em>' reference.
	 * @see #getFeatureNode()
	 * @generated
	 */
	void setFeatureNode(AbstractFeatureNode value);

		/**
	 * Returns the value of the '<em><b>Feature Node Adapter</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Node Adapter</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adapter used to listens for changes of the feature value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Node Adapter</em>' reference.
	 * @see ca.gc.asc_csa.apogy.common.topology.bindings.ApogyCommonTopologyBindingsPackage#getAbstractTopologyBinding_FeatureNodeAdapter()
	 * @model transient="true" changeable="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  FeatureNodeAdapter getFeatureNodeAdapter();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Binds the binding to its feature. If successful, binded will change to true.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void bind();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Un-binds the binding from its feature. If successful, binded will change to false.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
  void unbind();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Clones the current Binding. This method must copy this Binding parameters and set
	 * the Binding copy associated Node(s) to the Node(s) copy(ies) associated with
	 * this Binding.
	 * @param originalToCopyNodeMap Maps original Nodes to copied ones.
	 * @return A copy of this Binding.
	 * <!-- end-model-doc -->
	 * @model unique="false" originalToCopyNodeMapDataType="ca.gc.asc_csa.apogy.common.topology.bindings.Map<ca.gc.asc_csa.apogy.common.topology.Node, ca.gc.asc_csa.apogy.common.topology.Node>" originalToCopyNodeMapUnique="false"
	 * @generated
	 */
  AbstractTopologyBinding clone(Map<Node, Node> originalToCopyNodeMap);

} // AbstractTopologyBinding
