package ca.gc.asc_csa.apogy.common.topology;
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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.ApogyCommonTopologyPackage
 * @generated
 */
public interface ApogyCommonTopologyFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonTopologyFactory eINSTANCE = ca.gc.asc_csa.apogy.common.topology.impl.ApogyCommonTopologyFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Link</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link</em>'.
	 * @generated
	 */
	Link createLink();

	/**
	 * Returns a new object of class '<em>Leaf</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Leaf</em>'.
	 * @generated
	 */
	Leaf createLeaf();

	/**
	 * Returns a new object of class '<em>URL Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Node</em>'.
	 * @generated
	 */
	URLNode createURLNode();

	/**
	 * Returns a new object of class '<em>CAD Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CAD Node</em>'.
	 * @generated
	 */
	CADNode createCADNode();

	/**
	 * Returns a new object of class '<em>Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Content Node</em>'.
	 * @generated
	 */
	<T> ContentNode<T> createContentNode();

	/**
	 * Returns a new object of class '<em>Referenced Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Content Node</em>'.
	 * @generated
	 */
	<T> ReferencedContentNode<T> createReferencedContentNode();

	/**
	 * Returns a new object of class '<em>Aggregate Content Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Content Node</em>'.
	 * @generated
	 */
	<T> AggregateContentNode<T> createAggregateContentNode();

	/**
	 * Returns a new object of class '<em>Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Group Node</em>'.
	 * @generated
	 */
	GroupNode createGroupNode();

	/**
	 * Returns a new object of class '<em>Referenced Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Referenced Group Node</em>'.
	 * @generated
	 */
	ReferencedGroupNode createReferencedGroupNode();

	/**
	 * Returns a new object of class '<em>Aggregate Group Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aggregate Group Node</em>'.
	 * @generated
	 */
	AggregateGroupNode createAggregateGroupNode();

	/**
	 * Returns a new object of class '<em>Position Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Node</em>'.
	 * @generated
	 */
	PositionNode createPositionNode();

	/**
	 * Returns a new object of class '<em>Rotation Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Node</em>'.
	 * @generated
	 */
	RotationNode createRotationNode();

	/**
	 * Returns a new object of class '<em>Transform Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Node</em>'.
	 * @generated
	 */
	TransformNode createTransformNode();

	/**
	 * Returns a new object of class '<em>Pick And Place Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pick And Place Node</em>'.
	 * @generated
	 */
	PickAndPlaceNode createPickAndPlaceNode();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonTopologyFacade createApogyCommonTopologyFacade();

	/**
	 * Returns a new object of class '<em>Node Filter Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Filter Chain</em>'.
	 * @generated
	 */
	NodeFilterChain createNodeFilterChain();

	/**
	 * Returns a new object of class '<em>Node Type Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Type Filter</em>'.
	 * @generated
	 */
	NodeTypeFilter createNodeTypeFilter();

	/**
	 * Returns a new object of class '<em>Node Id Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Id Filter</em>'.
	 * @generated
	 */
	NodeIdFilter createNodeIdFilter();

	/**
	 * Returns a new object of class '<em>Node Description Filter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Description Filter</em>'.
	 * @generated
	 */
	NodeDescriptionFilter createNodeDescriptionFilter();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonTopologyPackage getApogyCommonTopologyPackage();

} //ApogyCommonTopologyFactory
