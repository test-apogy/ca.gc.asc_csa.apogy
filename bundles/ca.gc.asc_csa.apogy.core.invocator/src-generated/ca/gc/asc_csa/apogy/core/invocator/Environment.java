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

import ca.gc.asc_csa.apogy.common.emf.Described;
import ca.gc.asc_csa.apogy.common.emf.Named;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * Environment.
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getLocalTypesList <em>Local Types List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getVariablesList <em>Variables List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getContextsList <em>Contexts List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getActiveContext <em>Active Context</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment()
 * @model
 * @generated
 */
public interface Environment extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Invocator Session</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Invocator Session</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocator Session</em>' container reference.
	 * @see #setInvocatorSession(InvocatorSession)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment_InvocatorSession()
	 * @see ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment
	 * @model opposite="environment" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
  InvocatorSession getInvocatorSession();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}' container reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocator Session</em>' container reference.
	 * @see #getInvocatorSession()
	 * @generated
	 */
  void setInvocatorSession(InvocatorSession value);

  /**
	 * Returns the value of the '<em><b>Local Types List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Types List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Types List</em>' containment reference.
	 * @see #setLocalTypesList(LocalTypesList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment_LocalTypesList()
	 * @model containment="true"
	 * @generated
	 */
	LocalTypesList getLocalTypesList();

		/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getLocalTypesList <em>Local Types List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Types List</em>' containment reference.
	 * @see #getLocalTypesList()
	 * @generated
	 */
	void setLocalTypesList(LocalTypesList value);

		/**
	 * Returns the value of the '<em><b>Variables List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.VariablesList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables List</em>' containment reference.
	 * @see #setVariablesList(VariablesList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment_VariablesList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.VariablesList#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
  VariablesList getVariablesList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getVariablesList <em>Variables List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variables List</em>' containment reference.
	 * @see #getVariablesList()
	 * @generated
	 */
  void setVariablesList(VariablesList value);

  /**
	 * Returns the value of the '<em><b>Contexts List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ContextsList#getEnvironment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Contexts List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Contexts List</em>' containment reference.
	 * @see #setContextsList(ContextsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment_ContextsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ContextsList#getEnvironment
	 * @model opposite="environment" containment="true"
	 * @generated
	 */
  ContextsList getContextsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getContextsList <em>Contexts List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contexts List</em>' containment reference.
	 * @see #getContextsList()
	 * @generated
	 */
  void setContextsList(ContextsList value);

  /**
	 * Returns the value of the '<em><b>Active Context</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Active Context</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Active Context</em>' reference.
	 * @see #setActiveContext(Context)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getEnvironment_ActiveContext()
	 * @model required="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel notify='true'"
	 * @generated
	 */
  Context getActiveContext();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getActiveContext <em>Active Context</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Active Context</em>' reference.
	 * @see #getActiveContext()
	 * @generated
	 */
  void setActiveContext(Context value);

} // Environment
