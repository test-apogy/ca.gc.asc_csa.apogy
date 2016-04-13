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

import java.util.Date;

import ca.gc.asc_csa.apogy.core.environment.EarthSky;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksiteNode;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getEarthSky() <em>Earth Sky</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates) <em>Convert To XYZ Position</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EarthSurfaceWorksiteTest extends SurfaceWorksiteTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarthSurfaceWorksiteTest.class);
	}

	/**
	 * Constructs a new Earth Surface Worksite test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceWorksiteTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Earth Surface Worksite test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EarthSurfaceWorksite getFixture() {
		return (EarthSurfaceWorksite)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getEarthSky() <em>Earth Sky</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#getEarthSky()
	 * @generated_NOT
	 */
	public void testGetEarthSky() {
		setFixture(ApogyCoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite());
		assertNotNull(getFixture().getEarthSky());	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#setEarthSky(ca.gc.asc_csa.apogy.core.environment.EarthSky) <em>Earth Sky</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#setEarthSky(ca.gc.asc_csa.apogy.core.environment.EarthSky)
	 * @generated_NOT
	 */
	public void testSetEarthSky() 
	{
		EarthSky sky = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSky();
		getFixture().setEarthSky(sky);
		sky.setTime(new Date());
		assertNotNull(getFixture().getSky());
		assertNotNull(getFixture().getEarthSky());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(ca.gc.asc_csa.apogy.common.math.Tuple3d)
	 * @generated_NOT
	 */
	public void testConvertToGeographicCoordinates__Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates) <em>Convert To XYZ Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite#convertToXYZPosition(ca.gc.asc_csa.apogy.core.environment.GeographicCoordinates)
	 * @generated_NOT
	 */
	public void testConvertToXYZPosition__GeographicCoordinates() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	public void testGetWorksiteNode()
	{
		assertNotNull(getFixture().getWorksiteNode());
		assertTrue(getFixture().getWorksiteNode() instanceof EarthSurfaceWorksiteNode);
	}
} //EarthSurfaceWorksiteTest
