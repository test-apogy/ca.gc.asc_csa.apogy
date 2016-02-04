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
import org.eclipse.emf.ecore.EClass;
import ca.gc.asc_csa.apogy.common.emf.Named;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Type#getMembers <em>Members</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Named, AbstractType
{
  /**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.core.invocator.TypeMember}.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getType_Members()
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getType_InterfaceClass()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getInterfaceClass();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Type#getInterfaceClass <em>Interface Class</em>}' reference.
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
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getType_TypeApiAdapterClass()
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  EClass getTypeApiAdapterClass();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Type#getTypeApiAdapterClass <em>Type Api Adapter Class</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type Api Adapter Class</em>' reference.
	 * @see #getTypeApiAdapterClass()
	 * @generated
	 */
  void setTypeApiAdapterClass(EClass value);

} // Type
