package ca.gc.asc_csa.apogy.common.topology.ui.tests;
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

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>ui</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class TopologyUITests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new TopologyUITests("ui Tests");
		suite.addTestSuite(TopologyPresentationRegistryTest.class);
		suite.addTestSuite(GraphicsContextTest.class);
		suite.addTestSuite(TopologyPresentationSetTest.class);
		suite.addTestSuite(NodePresentationTest.class);
		suite.addTestSuite(TransformNodePresentationTest.class);
		suite.addTestSuite(RotationNodePresentationTest.class);
		suite.addTestSuite(PositionNodePresentationTest.class);
		suite.addTestSuite(URLNodePresentationTest.class);
		suite.addTestSuite(TopologyUIFacadeTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TopologyUITests(String name) {
		super(name);
	}

} //TopologyUITests
