/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator;

import ca.gc.asc_csa.eclipse.emf.ecore.ListRootNode;
import ca.gc.asc_csa.eclipse.emf.ecore.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Feature Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to the EMF feature of a specific variable and chain of {@link TypeMember}
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariableFeatureReference()
 * @model
 * @generated
 */
public interface VariableFeatureReference extends Named
{
  /**
	 * Returns the value of the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the variable.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variable</em>' reference.
	 * @see #setVariable(Variable)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariableFeatureReference_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' reference.
	 * @see #getVariable()
	 * @generated
	 */
  void setVariable(Variable value);

  /**
	 * Returns the value of the '<em><b>Type Member Reference List Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the {@link TypeMember}
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Member Reference List Element</em>' containment reference.
	 * @see #setTypeMemberReferenceListElement(TypeMemberReferenceListElement)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariableFeatureReference_TypeMemberReferenceListElement()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getTypeMemberReferenceListElement();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Member Reference List Element</em>' containment reference.
	 * @see #getTypeMemberReferenceListElement()
	 * @generated
	 */
  void setTypeMemberReferenceListElement(TypeMemberReferenceListElement value);

  /**
	 * Returns the value of the '<em><b>Feature Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the EMF feature.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Feature Root</em>' containment reference.
	 * @see #setFeatureRoot(ListRootNode)
	 * @see org.eclipse.symphony.core.invocator.EMFEcoreInvocatorPackage#getVariableFeatureReference_FeatureRoot()
	 * @model containment="true"
	 * @generated
	 */
  ListRootNode getFeatureRoot();

  /**
	 * Sets the value of the '{@link org.eclipse.symphony.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Root</em>' containment reference.
	 * @see #getFeatureRoot()
	 * @generated
	 */
  void setFeatureRoot(ListRootNode value);

} // VariableFeatureReference
