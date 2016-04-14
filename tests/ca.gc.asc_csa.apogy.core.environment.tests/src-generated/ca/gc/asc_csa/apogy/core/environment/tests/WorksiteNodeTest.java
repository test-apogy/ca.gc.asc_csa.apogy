package ca.gc.asc_csa.apogy.core.environment.tests;
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

import junit.framework.TestCase;

import junit.textui.TestRunner;

import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;
import ca.gc.asc_csa.apogy.core.environment.WorksiteNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Worksite Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class WorksiteNodeTest extends TestCase {

	/**
	 * The fixture for this Worksite Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorksiteNode fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(WorksiteNodeTest.class);
	}

	/**
	 * Constructs a new Worksite Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorksiteNodeTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Worksite Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(WorksiteNode fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Worksite Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorksiteNode getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createWorksiteNode());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Test nothing.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
} //WorksiteNodeTest
