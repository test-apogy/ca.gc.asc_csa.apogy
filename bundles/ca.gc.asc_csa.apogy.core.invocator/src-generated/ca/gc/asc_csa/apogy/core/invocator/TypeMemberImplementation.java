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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Member Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation#getTypeMember <em>Type Member</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberImplementation()
 * @model
 * @generated
 */
public interface TypeMemberImplementation extends AbstractTypeImplementation
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMemberImplementation_TypeMember()
	 * @model required="true"
	 * @generated
	 */
  TypeMember getTypeMember();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.TypeMemberImplementation#getTypeMember <em>Type Member</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Member</em>' reference.
	 * @see #getTypeMember()
	 * @generated
	 */
  void setTypeMember(TypeMember value);

} // TypeMemberImplementation
