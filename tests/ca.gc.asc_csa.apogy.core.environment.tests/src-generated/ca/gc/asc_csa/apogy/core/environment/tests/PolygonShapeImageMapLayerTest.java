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

import org.eclipse.core.runtime.NullProgressMonitor;
import ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Polygon Shape Image Map Layer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class PolygonShapeImageMapLayerTest extends AbstractShapeImageLayerTest {

	/**
	 * Constructs a new Polygon Shape Image Map Layer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PolygonShapeImageMapLayerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Polygon Shape Image Map Layer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected PolygonShapeImageMapLayer getFixture() {
		return (PolygonShapeImageMapLayer)fixture;
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices() <em>Get Vertices</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.PolygonShapeImageMapLayer#getVertices()
	 * @generated_NOT
	 */
	public void testGetVertices() {
		// This test should be implemented by sib-classes.
	}
	
	@Override
	public void testGetResolution() 
	{
		// Updates the image.
		getFixture().updateImage(new NullProgressMonitor());
		
		// Should be equal to the required resolution
		assertEquals(getFixture().getRequiredResolution(), getFixture().getResolution(), 1E-6);
	}

} //PolygonShapeImageMapLayerTest
