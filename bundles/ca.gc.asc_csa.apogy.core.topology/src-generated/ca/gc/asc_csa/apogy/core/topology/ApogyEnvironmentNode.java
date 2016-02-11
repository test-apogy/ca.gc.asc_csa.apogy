package ca.gc.asc_csa.apogy.core.topology;
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

import ca.gc.asc_csa.apogy.common.topology.ReferencedGroupNode;
import ca.gc.asc_csa.apogy.core.ResultsListNode;
import ca.gc.asc_csa.apogy.core.ApogyEnvironment;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy Environment Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogyEnvironment <em>Apogy Environment</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getResultsListNode <em>Results List Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogySystemAPIsNode <em>Apogy System AP Is Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyEnvironmentNode()
 * @model
 * @generated
 */
public interface ApogyEnvironmentNode extends ReferencedGroupNode
{
  /**
	 * Returns the value of the '<em><b>Apogy Environment</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apogy Environment</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Apogy Environment</em>' reference.
	 * @see #setApogyEnvironment(ApogyEnvironment)
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyEnvironmentNode_ApogyEnvironment()
	 * @model transient="true"
	 * @generated
	 */
  ApogyEnvironment getApogyEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getApogyEnvironment <em>Apogy Environment</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy Environment</em>' reference.
	 * @see #getApogyEnvironment()
	 * @generated
	 */
  void setApogyEnvironment(ApogyEnvironment value);

  /**
	 * Returns the value of the '<em><b>Worksite Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Worksite Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Worksite Node</em>' reference.
	 * @see #setWorksiteNode(WorksiteNode)
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyEnvironmentNode_WorksiteNode()
	 * @model required="true" transient="true" derived="true"
	 * @generated
	 */
  WorksiteNode getWorksiteNode();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.ApogyEnvironmentNode#getWorksiteNode <em>Worksite Node</em>}' reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Worksite Node</em>' reference.
	 * @see #getWorksiteNode()
	 * @generated
	 */
  void setWorksiteNode(WorksiteNode value);

  /**
	 * Returns the value of the '<em><b>Results List Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results List Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Results List Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyEnvironmentNode_ResultsListNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  ResultsListNode getResultsListNode();

  /**
	 * Returns the value of the '<em><b>Apogy System AP Is Node</b></em>' reference.
	 * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Apogy System AP Is Node</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
	 * @return the value of the '<em>Apogy System AP Is Node</em>' reference.
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogyEnvironmentNode_ApogySystemAPIsNode()
	 * @model required="true" transient="true" changeable="false" derived="true"
	 * @generated
	 */
  ApogySystemAPIsNode getApogySystemAPIsNode();

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
  void dispose();

} // ApogyEnvironmentNode
