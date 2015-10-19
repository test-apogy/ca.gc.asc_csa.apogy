/**
 */
package org.eclipse.symphony.common.emf;


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
 *   <li>{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getAbstractFeatureListNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractFeatureListNode extends AbstractFeatureNode
{
  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The parent node of this ListNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(AbstractFeatureListNode)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getAbstractFeatureListNode_Parent()
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild
	 * @model opposite="child" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
	 * @generated
	 */
  AbstractFeatureListNode getParent();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(AbstractFeatureListNode value);

  /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The child node of this ListNode.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Child</em>' containment reference.
	 * @see #setChild(AbstractFeatureListNode)
	 * @see org.eclipse.symphony.common.emf.EMFEcorePackage#getAbstractFeatureListNode_Child()
	 * @see org.eclipse.symphony.common.emf.AbstractFeatureListNode#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  AbstractFeatureListNode getChild();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.common.emf.AbstractFeatureListNode#getChild <em>Child</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Child</em>' containment reference.
	 * @see #getChild()
	 * @generated
	 */
  void setChild(AbstractFeatureListNode value);

} // AbstractFeatureListNode
