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

import ca.gc.asc_csa.apogy.common.topology.Node;
import ca.gc.asc_csa.apogy.common.topology.TransformNode;
import ca.gc.asc_csa.apogy.core.environment.EarthSurfaceWorksite;
import ca.gc.asc_csa.apogy.core.environment.Sky;
import ca.gc.asc_csa.apogy.core.environment.StarField;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFacade;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode() <em>Sky Node</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSun() <em>Sun</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunHorizontalCoordinates() <em>Sun Horizontal Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getStarField() <em>Star Field</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunAngularDiameter() <em>Get Sun Angular Diameter</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SkyTest extends TestCase {

	/**
	 * The fixture for this Sky test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sky fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SkyTest.class);
	}

	/**
	 * Constructs a new Sky test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SkyTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sky test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sky fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sky test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sky getFixture() {
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createSky());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode() <em>Sky Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSkyNode()
	 * @generated_NOT
	 */
	public void testGetSkyNode() 
	{
		  // Ensures the Sky has a worksite associated to it.
		  EarthSurfaceWorksite worksite = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();	  
		  getFixture().setSurfaceWorksite(worksite);
		  
		  // Sets a time.
		  getFixture().setTime(new Date());
		  
		  assertNotNull(getFixture().getSkyNode());	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSun() <em>Sun</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSun()
	 * @generated_NOT
	 */
	public void testGetSun() 
	{
		// Checks these are not null upon initialization.
		assertNotNull(getFixture().getSunHorizontalCoordinates());
		
		// Checks these are not null even after a set to null.
		getFixture().setSunHorizontalCoordinates(null);		
		assertNotNull(getFixture().getSunHorizontalCoordinates());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunHorizontalCoordinates() <em>Sun Horizontal Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSunHorizontalCoordinates()
	 * @generated_NOT
	 */
	public void testGetSunHorizontalCoordinates() 
	{
		// Checks these are not null upon initialization.
		assertNotNull(getFixture().getSunHorizontalCoordinates());
		
		// Checks these are not null even after a set to null.
		getFixture().setSunHorizontalCoordinates(null);		
		assertNotNull(getFixture().getSunHorizontalCoordinates());
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#setSunHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates) <em>Sun Horizontal Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#setSunHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates)
	 * @generated_NOT
	 */
	public void testSetSunHorizontalCoordinates() {
		// Nothing to test.
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getStarField() <em>Star Field</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getStarField()
	 * @generated_NOT
	 */
	public void testGetStarField() 
	{
		// Ensures the Sky has a worksite associated to it.
		EarthSurfaceWorksite worksite = ApogyCoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();
		getFixture().setSurfaceWorksite(worksite);

		// Sets a time.
		getFixture().setTime(new Date());

		// Initialize the SkyNode.
		getFixture().getSkyNode();

		// Verifies that the StarField is not null.
		StarField starField = getFixture().getStarField();
		assertNotNull(starField);

		// Verifies that the StarField is connected to the sky via a
		// TransformNode.
		Node starFieldParent = starField.getParent();
		getFixture().getSkyNode().getChildren().contains(starFieldParent);
		assertTrue(starFieldParent instanceof TransformNode);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.Sky#getSunAngularDiameter() <em>Get Sun Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.Sky#getSunAngularDiameter()
	 * @generated_NOT
	 */
	public void testGetSunAngularDiameter() 
	{
		// Creates a fully initialise EarthSurfaceWorksite.
		Date now = new Date();
		EarthSurfaceWorksite earthSurfaceWorksite = ApogyCoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite();		
		setFixture(earthSurfaceWorksite.getEarthSky());
				
		// Angular size goes from 31.6′ to 32.7′ (these are arc-minutes).
		double averageAngularSize = 0.535833333; // deg
		double expectedDelta = 0.545 - 0.526666667; // deg
				
		// Test over an entire year.
		long oneDayDuration = 24 * 60 * 60 * 1000;		
		@SuppressWarnings("unused")
		long time = now.getTime();
		for(int day = 0; day < 366; day++)
		{						
			getFixture().setTime(now);
			double sunAngularSize = getFixture().getSunAngularDiameter();
			assertEquals(averageAngularSize, Math.toDegrees(sunAngularSize), expectedDelta);
						
			time += oneDayDuration;					
		}
	}

} //SkyTest
