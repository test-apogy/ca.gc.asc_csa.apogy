/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Members List Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.TypeMembersListProvider#getTypeMembers <em>Type Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMembersListProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypeMembersListProvider extends EObject
{

  /**
   * Returns the value of the '<em><b>Type Members</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.symphony.core.invocator.TypeMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Members</em>' reference list.
   * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getTypeMembersListProvider_TypeMembers()
   * @model transient="true" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
   * @generated
   */
  EList<TypeMember> getTypeMembers();
} // TypeMembersListProvider
