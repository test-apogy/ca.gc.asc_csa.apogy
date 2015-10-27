/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.symphony.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.Type#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}</li>
 * </ul>
 *
 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Named, AbstractType
{
  /**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.symphony.core.invocator.TypeMember}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getType_Members()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EList<TypeMember> getMembers();

  /**
	 * Returns the value of the '<em><b>Interface Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interface Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Class</em>' reference.
	 * @see #setInterfaceClass(EClass)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getType_InterfaceClass()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getInterfaceClass();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interface Class</em>' reference.
	 * @see #getInterfaceClass()
	 * @generated
	 */
  void setInterfaceClass(EClass value);

  /**
	 * Returns the value of the '<em><b>Type Api Adapter Class</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Api Adapter Class</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Api Adapter Class</em>' reference.
	 * @see #setTypeApiAdapterClass(EClass)
	 * @see org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorPackage#getType_TypeApiAdapterClass()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getTypeApiAdapterClass();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Api Adapter Class</em>' reference.
	 * @see #getTypeApiAdapterClass()
	 * @generated
	 */
  void setTypeApiAdapterClass(EClass value);

} // Type
