package ca.gc.asc_csa.apogy.common.emf;
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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an AbstractFeatureNode that is part of a List.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureListNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureListNode extends AbstractFeatureNode
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node of this ListNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractFeatureListNode)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureListNode_Parent()
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild
	 * @model opposite="child" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  AbstractFeatureListNode getParent();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(AbstractFeatureListNode value);

  /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child node of this ListNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(AbstractFeatureListNode)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureListNode_Child()
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  AbstractFeatureListNode getChild();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
  void setChild(AbstractFeatureListNode value);

} // AbstractFeatureListNode
