/**
 */
package org.eclipse.symphony.common.emf;

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
 *   <li>{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getAbstractFeatureTreeNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureTreeNode extends AbstractFeatureNode
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node of this TreeNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractFeatureTreeNode)
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getAbstractFeatureTreeNode_Parent()
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getChildren
	 * @model opposite="children" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  AbstractFeatureTreeNode getParent();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(AbstractFeatureTreeNode value);

  /**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The children node(s) of this TreeNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.symphony.common.emf.Symphony__CommonEMFPackage#getAbstractFeatureTreeNode_Children()
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureTreeNode#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  EList<AbstractFeatureTreeNode> getChildren();

} // AbstractFeatureTreeNode
