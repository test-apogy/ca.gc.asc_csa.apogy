/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.symphony.common.emf.Named;
import org.eclipse.symphony.common.emf.TreeRootNode;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMember#getMemberType <em>Member Type</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMember#getTypeFeatureRootNode <em>Type Feature Root Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypeMember()
 * @model
 * @generated
 */
public interface TypeMember extends Named, AbstractType
{
  /**
	 * Returns the value of the '<em><b>Member Type</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Member Type</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Member Type</em>' reference.
	 * @see #setMemberType(Type)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypeMember_MemberType()
	 * @model
	 * @generated
	 */
  Type getMemberType();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypeMember#getMemberType <em>Member Type</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Member Type</em>' reference.
	 * @see #getMemberType()
	 * @generated
	 */
  void setMemberType(Type value);

  /**
	 * Returns the value of the '<em><b>Type Feature Root Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Feature Root Node</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Feature Root Node</em>' containment reference.
	 * @see #setTypeFeatureRootNode(TreeRootNode)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getTypeMember_TypeFeatureRootNode()
	 * @model containment="true"
	 * @generated
	 */
  TreeRootNode getTypeFeatureRootNode();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.TypeMember#getTypeFeatureRootNode <em>Type Feature Root Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Feature Root Node</em>' containment reference.
	 * @see #getTypeFeatureRootNode()
	 * @generated
	 */
	void setTypeFeatureRootNode(TreeRootNode value);

} // TypeMember
