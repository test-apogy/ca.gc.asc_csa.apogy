/**
 */
package ca.gc.asc_csa.eclipse.emf.ecore;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract List Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getParent <em>Parent</em>}</li>
 *   <li>{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getChild <em>Child</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractListNode()
 * @model abstract="true"
 * @generated
 */
public interface AbstractListNode extends EObject
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The parent node of this ListNode.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(AbstractListNode)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractListNode_Parent()
   * @see ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getChild
   * @model opposite="child" transient="false"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='Readonly'"
   * @generated
   */
  AbstractListNode getParent();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(AbstractListNode value);

  /**
   * Returns the value of the '<em><b>Child</b></em>' containment reference.
   * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getParent <em>Parent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * The child node of this ListNode.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Child</em>' containment reference.
   * @see #setChild(AbstractListNode)
   * @see ca.gc.asc_csa.eclipse.emf.ecore.EMFEcorePackage#getAbstractListNode_Child()
   * @see ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getParent
   * @model opposite="parent" containment="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
   * @generated
   */
  AbstractListNode getChild();

  /**
   * Sets the value of the '{@link ca.gc.asc_csa.eclipse.emf.ecore.AbstractListNode#getChild <em>Child</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child</em>' containment reference.
   * @see #getChild()
   * @generated
   */
  void setChild(AbstractListNode value);

} // AbstractListNode
