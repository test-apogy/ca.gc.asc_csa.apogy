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
import ca.gc.asc_csa.apogy.core.environment.ApogyEnvironment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Apogy System AP Is Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment <em>Apogy Environment</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogySystemAPIsNode()
 * @model
 * @generated
 */
public interface ApogySystemAPIsNode extends ReferencedGroupNode
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
	 * @see ca.gc.asc_csa.apogy.core.topology.ApogyCoreTopologyPackage#getApogySystemAPIsNode_ApogyEnvironment()
	 * @model transient="true"
	 * @generated
	 */
  ApogyEnvironment getApogyEnvironment();

  /**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.topology.ApogySystemAPIsNode#getApogyEnvironment <em>Apogy Environment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Apogy Environment</em>' reference.
	 * @see #getApogyEnvironment()
	 * @generated
	 */
	void setApogyEnvironment(ApogyEnvironment value);

} // ApogySystemAPIsNode
