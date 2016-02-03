package ca.gc.asc_csa.apogy.core.invocator;
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

import ca.gc.asc_csa.apogy.common.emf.ListRootNode;
import ca.gc.asc_csa.apogy.common.emf.Named;


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
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableFeatureReference()
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableFeatureReference_Variable()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Variable getVariable();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getVariable <em>Variable</em>}' reference.
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableFeatureReference_TypeMemberReferenceListElement()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  TypeMemberReferenceListElement getTypeMemberReferenceListElement();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getTypeMemberReferenceListElement <em>Type Member Reference List Element</em>}' containment reference.
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getVariableFeatureReference_FeatureRoot()
	 * @model containment="true"
	 * @generated
	 */
  ListRootNode getFeatureRoot();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.VariableFeatureReference#getFeatureRoot <em>Feature Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature Root</em>' containment reference.
	 * @see #getFeatureRoot()
	 * @generated
	 */
	void setFeatureRoot(ListRootNode value);

} // VariableFeatureReference
