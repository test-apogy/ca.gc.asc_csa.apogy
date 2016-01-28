/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.symphony.common.emf.TreeRootNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Member Reference Tree Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getChild <em>Child</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode <em>Feature Root Node</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isRoot <em>Root</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getRootElement <em>Root Element</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#isLeaf <em>Leaf</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement()
 * @model
 * @generated
 */
public interface TypeMemberReferenceTreeElement extends TypeMemberReference
{
  /**
	 * Returns the value of the '<em><b>Child</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Child</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_Child()
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent
	 * @model opposite="parent" containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  EList<TypeMemberReferenceTreeElement> getChild();

  /**
	 * Returns the value of the '<em><b>Parent</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getChild <em>Child</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' container reference.
	 * @see #setParent(TypeMemberReferenceTreeElement)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_Parent()
	 * @see org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getChild
	 * @model opposite="child" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceTreeElement getParent();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getParent <em>Parent</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' container reference.
	 * @see #getParent()
	 * @generated
	 */
  void setParent(TypeMemberReferenceTreeElement value);

  /**
	 * Returns the value of the '<em><b>Feature Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Feature Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Root Node</em>' containment reference.
	 * @see #setFeatureRootNode(TreeRootNode)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_FeatureRootNode()
	 * @model containment="true"
	 * @generated
	 */
  TreeRootNode getFeatureRootNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement#getFeatureRootNode <em>Feature Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Root Node</em>' containment reference.
	 * @see #getFeatureRootNode()
	 * @generated
	 */
	void setFeatureRootNode(TreeRootNode value);

		/**
	 * Returns the value of the '<em><b>Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' attribute.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_Root()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement%> _parent = this.getParent();\nreturn <%com.google.common.base.Objects%>.equal(_parent, null);'"
	 * @generated
	 */
  boolean isRoot();

  /**
	 * Returns the value of the '<em><b>Root Element</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Root Element</em>' reference.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_RootElement()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement%> _xifexpression = null;\nboolean _isRoot = this.isRoot();\nif (_isRoot)\n{\n\treturn this;\n}\nelse\n{\n\t<%org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement%> _parent = this.getParent();\n\t_xifexpression = _parent.getRootElement();\n}\nreturn _xifexpression;'"
	 * @generated
	 */
  TypeMemberReferenceTreeElement getRootElement();

  /**
	 * Returns the value of the '<em><b>Leaf</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Leaf</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Leaf</em>' attribute.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMemberReferenceTreeElement_Leaf()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None' get='<%org.eclipse.emf.common.util.EList%><<%org.eclipse.symphony.core.invocator.TypeMemberReferenceTreeElement%>> _child = this.getChild();\nreturn <%com.google.common.base.Objects%>.equal(_child, null);'"
	 * @generated
	 */
  boolean isLeaf();

} // TypeMemberReferenceTreeElement
