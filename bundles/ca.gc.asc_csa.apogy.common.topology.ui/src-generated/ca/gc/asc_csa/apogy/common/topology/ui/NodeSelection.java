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

import javax.vecmath.Point3d;
import javax.vecmath.Vector3f;

import org.eclipse.emf.ecore.EObject;
import ca.gc.asc_csa.apogy.common.topology.Node;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Class that represent the result of a selection in a topology.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getTopologyPresentationSet <em>Topology Presentation Set</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getSelectedNode <em>Selected Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getNodePresentation <em>Node Presentation</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionPoint <em>Relative Intersection Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint <em>Absolute Intersection Point</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionNormal <em>Relative Intersection Normal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal <em>Absolute Intersection Normal</em>}</li>
 * </ul>
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection()
 * @model
 * @generated
 */
public interface NodeSelection extends EObject {
	/**
	 * Returns the value of the '<em><b>Topology Presentation Set</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Topology Presentation Set</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Topology Presentation Set</em>' reference.
	 * @see #setTopologyPresentationSet(TopologyPresentationSet)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_TopologyPresentationSet()
	 * @model transient="true"
	 * @generated
	 */
	TopologyPresentationSet getTopologyPresentationSet();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getTopologyPresentationSet <em>Topology Presentation Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Topology Presentation Set</em>' reference.
	 * @see #getTopologyPresentationSet()
	 * @generated
	 */
	void setTopologyPresentationSet(TopologyPresentationSet value);

	/**
	 * Returns the value of the '<em><b>Selected Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selected Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected Node</em>' reference.
	 * @see #setSelectedNode(Node)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_SelectedNode()
	 * @model transient="true"
	 * @generated
	 */
	Node getSelectedNode();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getSelectedNode <em>Selected Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected Node</em>' reference.
	 * @see #getSelectedNode()
	 * @generated
	 */
	void setSelectedNode(Node value);

	/**
	 * Returns the value of the '<em><b>Node Presentation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Presentation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Presentation</em>' reference.
	 * @see #setNodePresentation(NodePresentation)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_NodePresentation()
	 * @model transient="true"
	 * @generated
	 */
	NodePresentation getNodePresentation();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getNodePresentation <em>Node Presentation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node Presentation</em>' reference.
	 * @see #getNodePresentation()
	 * @generated
	 */
	void setNodePresentation(NodePresentation value);

	/**
	 * Returns the value of the '<em><b>Relative Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Intersection Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Intersection Point</em>' attribute.
	 * @see #setRelativeIntersectionPoint(Point3d)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_RelativeIntersectionPoint()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.Point3d"
	 * @generated
	 */
	Point3d getRelativeIntersectionPoint();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionPoint <em>Relative Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Intersection Point</em>' attribute.
	 * @see #getRelativeIntersectionPoint()
	 * @generated
	 */
	void setRelativeIntersectionPoint(Point3d value);

	/**
	 * Returns the value of the '<em><b>Absolute Intersection Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Intersection Point</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Intersection Point</em>' attribute.
	 * @see #setAbsoluteIntersectionPoint(Point3d)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_AbsoluteIntersectionPoint()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.Point3d"
	 * @generated
	 */
	Point3d getAbsoluteIntersectionPoint();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionPoint <em>Absolute Intersection Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Intersection Point</em>' attribute.
	 * @see #getAbsoluteIntersectionPoint()
	 * @generated
	 */
	void setAbsoluteIntersectionPoint(Point3d value);

	/**
	 * Returns the value of the '<em><b>Relative Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Intersection Normal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Intersection Normal</em>' attribute.
	 * @see #setRelativeIntersectionNormal(Vector3f)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_RelativeIntersectionNormal()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.Vector3f"
	 * @generated
	 */
	Vector3f getRelativeIntersectionNormal();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getRelativeIntersectionNormal <em>Relative Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Intersection Normal</em>' attribute.
	 * @see #getRelativeIntersectionNormal()
	 * @generated
	 */
	void setRelativeIntersectionNormal(Vector3f value);

	/**
	 * Returns the value of the '<em><b>Absolute Intersection Normal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Absolute Intersection Normal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Absolute Intersection Normal</em>' attribute.
	 * @see #setAbsoluteIntersectionNormal(Vector3f)
	 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getNodeSelection_AbsoluteIntersectionNormal()
	 * @model unique="false" dataType="ca.gc.asc_csa.apogy.common.topology.ui.Vector3f"
	 * @generated
	 */
	Vector3f getAbsoluteIntersectionNormal();

	/**
	 * Sets the value of the '{@link ca.gc.asc_csa.apogy.common.topology.ui.NodeSelection#getAbsoluteIntersectionNormal <em>Absolute Intersection Normal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Absolute Intersection Normal</em>' attribute.
	 * @see #getAbsoluteIntersectionNormal()
	 * @generated
	 */
	void setAbsoluteIntersectionNormal(Vector3f value);

} // NodeSelection
