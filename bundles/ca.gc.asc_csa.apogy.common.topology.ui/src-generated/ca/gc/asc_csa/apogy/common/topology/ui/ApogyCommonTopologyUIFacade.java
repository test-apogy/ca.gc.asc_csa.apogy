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
import ca.gc.asc_csa.apogy.common.math.Tuple3d;
import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFacadeImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facade</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage#getApogyCommonTopologyUIFacade()
 * @model
 * @generated
 */
public interface ApogyCommonTopologyUIFacade extends EObject 
{
	public static final ApogyCommonTopologyUIFacade INSTANCE = ApogyCommonTopologyUIFacadeImpl.getInstance();
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyRootUnique="false"
	 * @generated
	 */
	GraphicsContext createGraphicsContext(Node topologyRoot);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model rootUnique="false" topologyPresentationSetUnique="false" minUnique="false" maxUnique="false"
	 * @generated
	 */
	void findExtent(Node root, TopologyPresentationSet topologyPresentationSet, Tuple3d min, Tuple3d max);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyPresentationSetUnique="false" nodePresentationUnique="false" relativePositionDataType="ca.gc.asc_csa.apogy.common.topology.ui.Point3d" relativePositionUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, NodePresentation nodePresentation, Point3d relativePosition);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" topologyPresentationSetUnique="false" nodeUnique="false" relativePositionDataType="ca.gc.asc_csa.apogy.common.topology.ui.Point3d" relativePositionUnique="false" relativeNormalDataType="ca.gc.asc_csa.apogy.common.topology.ui.Vector3f" relativeNormalUnique="false"
	 * @generated
	 */
	NodeSelection createNodeSelection(TopologyPresentationSet topologyPresentationSet, Node node, Point3d relativePosition, Vector3f relativeNormal);

} // ApogyCommonTopologyUIFacade
