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
 * A representation of the model object '<em><b>Invocator Session</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 *  -------------------------------------------------------------------------
 * 
 * Run Environment.
 * 
 * -------------------------------------------------------------------------
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getInvocatorSession()
 * @model
 * @generated
 */
public interface InvocatorSession extends Named, Described
{
  /**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Environment</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference.
	 * @see #setEnvironment(Environment)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getInvocatorSession_Environment()
	 * @see ca.gc.asc_csa.apogy.core.invocator.Environment#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  Environment getEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getEnvironment <em>Environment</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' containment reference.
	 * @see #getEnvironment()
	 * @generated
	 */
  void setEnvironment(Environment value);

  /**
	 * Returns the value of the '<em><b>Programs List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Programs List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Programs List</em>' containment reference.
	 * @see #setProgramsList(ProgramsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getInvocatorSession_ProgramsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ProgramsList#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  ProgramsList getProgramsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getProgramsList <em>Programs List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programs List</em>' containment reference.
	 * @see #getProgramsList()
	 * @generated
	 */
  void setProgramsList(ProgramsList value);

  /**
	 * Returns the value of the '<em><b>Data Products List Container</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Data Products List Container</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Products List Container</em>' containment reference.
	 * @see #setDataProductsListContainer(DataProductsListsContainer)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getInvocatorSession_DataProductsListContainer()
	 * @see ca.gc.asc_csa.apogy.core.invocator.DataProductsListsContainer#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  DataProductsListsContainer getDataProductsListContainer();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getDataProductsListContainer <em>Data Products List Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Products List Container</em>' containment reference.
	 * @see #getDataProductsListContainer()
	 * @generated
	 */
  void setDataProductsListContainer(DataProductsListsContainer value);

  /**
	 * Returns the value of the '<em><b>Tools List</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.invocator.ToolsList#getInvocatorSession <em>Invocator Session</em>}'.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Tools List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Tools List</em>' containment reference.
	 * @see #setToolsList(ToolsList)
	 * @see ca.gc.asc_csa.apogy.core.invocator.ApogyCoreInvocatorPackage#getInvocatorSession_ToolsList()
	 * @see ca.gc.asc_csa.apogy.core.invocator.ToolsList#getInvocatorSession
	 * @model opposite="invocatorSession" containment="true"
	 * @generated
	 */
  ToolsList getToolsList();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.invocator.InvocatorSession#getToolsList <em>Tools List</em>}' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tools List</em>' containment reference.
	 * @see #getToolsList()
	 * @generated
	 */
  void setToolsList(ToolsList value);

} // InvocatorSession
