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
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.TypeMembersListProvider#getTypeMembers <em>Type Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMembersListProvider()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TypeMembersListProvider extends EObject
{

  /**
   * Returns the value of the '<em><b>Type Members</b></em>' reference list.
   * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.TypeMember}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Members</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Members</em>' reference list.
   * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getTypeMembersListProvider_TypeMembers()
   * @model transient="true" volatile="true" derived="true"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
   * @generated
   */
  EList<TypeMember> getTypeMembers();
} // TypeMembersListProvider
