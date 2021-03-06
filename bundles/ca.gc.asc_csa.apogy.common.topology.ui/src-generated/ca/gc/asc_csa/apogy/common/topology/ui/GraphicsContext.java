package ca.gc.asc_csa.apogy.common.topology.ui;
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

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graphics Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class used to keep a the relationship between a given topology and its associated TopologyPresentationSet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopology <em>Topology</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getGraphicsContext()
 * @model
 * @generated
 */
public interface GraphicsContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The root of the topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology</em>' reference.
	 * @see #setTopology(Node)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getGraphicsContext_Topology()
	 * @model
	 * @generated
	 */
	Node getTopology();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopology <em>Topology</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology</em>' reference.
	 * @see #getTopology()
	 * @generated
	 */
	void setTopology(Node value);

	/**
	 * Returns the value of the '<em><b>Topology Presentation Set</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext <em>Graphics Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The TopologyPresentationSet associated with the root of the topology.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Topology Presentation Set</em>' reference.
	 * @see #setTopologyPresentationSet(TopologyPresentationSet)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getGraphicsContext_TopologyPresentationSet()
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.TopologyPresentationSet#getGraphicsContext
	 * @model opposite="graphicsContext"
	 * @generated
	 */
	TopologyPresentationSet getTopologyPresentationSet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.GraphicsContext#getTopologyPresentationSet <em>Topology Presentation Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Presentation Set</em>' reference.
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	void setTopologyPresentationSet(TopologyPresentationSet value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dispose of this GraphicsContext.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void dispose();

} // GraphicsContext
