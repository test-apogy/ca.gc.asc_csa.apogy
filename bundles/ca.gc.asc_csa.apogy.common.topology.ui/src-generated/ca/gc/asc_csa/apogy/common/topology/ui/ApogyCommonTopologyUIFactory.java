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

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see ca.gc.asc_csa.apogy.common.topology.ui.ApogyCommonTopologyUIPackage
 * @generated
 */
public interface ApogyCommonTopologyUIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ApogyCommonTopologyUIFactory eINSTANCE = ca.gc.asc_csa.apogy.common.topology.ui.impl.ApogyCommonTopologyUIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Topology Presentation Registry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Presentation Registry</em>'.
	 * @generated
	 */
	TopologyPresentationRegistry createTopologyPresentationRegistry();

	/**
	 * Returns a new object of class '<em>Graphics Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Graphics Context</em>'.
	 * @generated
	 */
	GraphicsContext createGraphicsContext();

	/**
	 * Returns a new object of class '<em>Node Selection</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Selection</em>'.
	 * @generated
	 */
	NodeSelection createNodeSelection();

	/**
	 * Returns a new object of class '<em>Topology Presentation Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Topology Presentation Set</em>'.
	 * @generated
	 */
	TopologyPresentationSet createTopologyPresentationSet();

	/**
	 * Returns a new object of class '<em>Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Presentation</em>'.
	 * @generated
	 */
	NodePresentation createNodePresentation();

	/**
	 * Returns a new object of class '<em>Transform Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transform Node Presentation</em>'.
	 * @generated
	 */
	TransformNodePresentation createTransformNodePresentation();

	/**
	 * Returns a new object of class '<em>Rotation Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotation Node Presentation</em>'.
	 * @generated
	 */
	RotationNodePresentation createRotationNodePresentation();

	/**
	 * Returns a new object of class '<em>Position Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Position Node Presentation</em>'.
	 * @generated
	 */
	PositionNodePresentation createPositionNodePresentation();

	/**
	 * Returns a new object of class '<em>URL Node Presentation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>URL Node Presentation</em>'.
	 * @generated
	 */
	URLNodePresentation createURLNodePresentation();

	/**
	 * Returns a new object of class '<em>Facade</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facade</em>'.
	 * @generated
	 */
	ApogyCommonTopologyUIFacade createApogyCommonTopologyUIFacade();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ApogyCommonTopologyUIPackage getApogyCommonTopologyUIPackage();

} //ApogyCommonTopologyUIFactory
