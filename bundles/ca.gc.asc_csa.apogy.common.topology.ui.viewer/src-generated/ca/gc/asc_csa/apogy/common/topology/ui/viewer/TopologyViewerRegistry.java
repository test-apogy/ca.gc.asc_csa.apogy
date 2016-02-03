package ca.gc.asc_csa.apogy.common.topology.ui.viewer;
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
import ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection;
import ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose <em>Verbose</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry#getITopologyViewers <em>ITopology Viewers</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection <em>Latest Node Selection</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage#getTopologyViewerRegistry()
 * @model
 * @generated
 */
public interface TopologyViewerRegistry extends EObject {
	/**
	 * Returns the value of the '<em><b>Verbose</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verbose</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verbose</em>' attribute.
	 * @see #setVerbose(boolean)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage#getTopologyViewerRegistry_Verbose()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isVerbose();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry#isVerbose <em>Verbose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbose</em>' attribute.
	 * @see #isVerbose()
	 * @generated
	 */
	void setVerbose(boolean value);

	/**
	 * Returns the value of the '<em><b>ITopology Viewers</b></em>' attribute list.
	 * The list contents are of type {@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ITopology Viewers</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ITopology Viewers</em>' attribute list.
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage#getTopologyViewerRegistry_ITopologyViewers()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer"
	 * @generated
	 */
	EList<ITopologyViewer> getITopologyViewers();

	/**
	 * Returns the value of the '<em><b>Latest Node Selection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Latest Node Selection</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Latest Node Selection</em>' reference.
	 * @see #setLatestNodeSelection(NodeSelection)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.viewer.ApogyCommonTopologyUIViewerPackage#getTopologyViewerRegistry_LatestNodeSelection()
	 * @model transient="true"
	 * @generated
	 */
	NodeSelection getLatestNodeSelection();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.viewer.TopologyViewerRegistry#getLatestNodeSelection <em>Latest Node Selection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Latest Node Selection</em>' reference.
	 * @see #getLatestNodeSelection()
	 * @generated
	 */
	void setLatestNodeSelection(NodeSelection value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iTopologyViewerDataType="ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer" iTopologyViewerUnique="false"
	 * @generated
	 */
	void registerITopologyViewer(ITopologyViewer iTopologyViewer);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model iTopologyViewerDataType="ca.gc.asc_csa.apogy.common.topology.ui.viewer.ITopologyViewer" iTopologyViewerUnique="false"
	 * @generated
	 */
	void unRegisterITopologyViewer(ITopologyViewer iTopologyViewer);

} // TopologyViewerRegistry
