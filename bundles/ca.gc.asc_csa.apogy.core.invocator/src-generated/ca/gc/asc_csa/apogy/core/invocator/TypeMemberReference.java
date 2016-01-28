/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.invocator;

import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Member Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference#getTypeMember <em>Type Member</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReference()
 * @model
 * @generated
 */
public interface TypeMemberReference extends EObject
{
  /**
	 * Returns the value of the '<em><b>Type Member</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Member</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Type Member</em>' reference.
	 * @see #setTypeMember(TypeMember)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberReference_TypeMember()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  TypeMember getTypeMember();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberReference#getTypeMember <em>Type Member</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Member</em>' reference.
	 * @see #getTypeMember()
	 * @generated
	 */
  void setTypeMember(TypeMember value);

} // TypeMemberReference
