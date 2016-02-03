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

import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.SurfaceWorksiteNode;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class SurfaceWorksiteTest extends WorksiteTest {

	/**
	 * Constructs a new Surface Worksite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurfaceWorksiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Surface Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SurfaceWorksite getFixture() {
		return (SurfaceWorksite)fixture;
	}

	public void testGetWorksiteNode()
	{
		assertNotNull(getFixture().getWorksiteNode());
		assertTrue(getFixture().getWorksiteNode() instanceof SurfaceWorksiteNode);
	}
} //SurfaceWorksiteTest
