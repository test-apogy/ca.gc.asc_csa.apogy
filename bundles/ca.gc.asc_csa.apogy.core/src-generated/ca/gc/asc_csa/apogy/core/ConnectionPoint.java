package ca.gc.asc_csa.apogy.core;
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
import ca.gc.asc_csa.apogy.common.topology.GroupNode;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Connection Point</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint()
 * @model
 * @generated
 */
public interface ConnectionPoint extends Named, Described {
	/**
	 * Returns the value of the '<em><b>Points List</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints <em>Connection Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points List</em>' container reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points List</em>' container reference.
	 * @see #setPointsList(ConnectionPointsList)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint_PointsList()
	 * @see ca.gc.asc_csa.apogy.core.ConnectionPointsList#getConnectionPoints
	 * @model opposite="connectionPoints" required="true" transient="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel property='None'"
	 * @generated
	 */
	ConnectionPointsList getPointsList();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getPointsList <em>Points List</em>}' container reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Points List</em>' container reference.
	 * @see #getPointsList()
	 * @generated
	 */
	void setPointsList(ConnectionPointsList value);

	/**
	 * Returns the value of the '<em><b>Node</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Node</em>' reference.
	 * @see #setNode(GroupNode)
	 * @see ca.gc.asc_csa.apogy.core.ApogyCorePackage#getConnectionPoint_Node()
	 * @model
	 * @generated
	 */
	GroupNode getNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.core.ConnectionPoint#getNode <em>Node</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(GroupNode value);

} // ConnectionPoint
