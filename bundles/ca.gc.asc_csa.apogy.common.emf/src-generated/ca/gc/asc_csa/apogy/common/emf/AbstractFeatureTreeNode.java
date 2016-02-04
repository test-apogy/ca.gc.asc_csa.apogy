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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Feature Tree Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines an AbstractFeatureNode that is part of a Tree.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureTreeNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureTreeNode extends AbstractFeatureNode
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node of this TreeNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractFeatureTreeNode)
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureTreeNode_Parent()
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getChildren
	 * @model opposite="children" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  AbstractFeatureTreeNode getParent();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(AbstractFeatureTreeNode value);

  /**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode}.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The children node(s) of this TreeNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.common.emf.ApogyCommonEMFPackage#getAbstractFeatureTreeNode_Children()
	 * @see ca.gc.asc_csa.apogy.common.emf.AbstractFeatureTreeNode#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  EList<AbstractFeatureTreeNode> getChildren();

} // AbstractFeatureTreeNode
