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

import ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Atmosphere Utils</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAirMass(double) <em>Get Air Mass</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDirectSunIntensity(double, double) <em>Get Direct Sun Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDiffuseSunIntensity(double, double) <em>Get Diffuse Sun Intensity</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAtmosphereRefractionCorrection(double) <em>Get Atmosphere Refraction Correction</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AtmosphereUtilsTest extends TestCase {

	/**
	 * The fixture for this Atmosphere Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmosphereUtils fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AtmosphereUtilsTest.class);
	}

	/**
	 * Constructs a new Atmosphere Utils test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtmosphereUtilsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Atmosphere Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AtmosphereUtils fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Atmosphere Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AtmosphereUtils getFixture() {
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createAtmosphereUtils());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAirMass(double) <em>Get Air Mass</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAirMass(double)
	 * @generated_NOT
	 */
	public void testGetAirMass__double() 
	{
		// {sunAltitudeAngle (rad), expected air mass} 
		// see AtmposphereAttenuation.xlxs in /data.
		double[][] testVector = new double[][]{{Math.toRadians(-15), Double.POSITIVE_INFINITY},
											   {Math.toRadians(0), 37.919608}, 
											   {Math.toRadians(10), 5.5860},
											   {Math.toRadians(20), 2.9031466},
											   {Math.toRadians(30), 1.99429},
											   {Math.toRadians(40), 1.5534},
											   {Math.toRadians(50), 1.30422},
											   {Math.toRadians(60), 1.15399},
											   {Math.toRadians(70), 1.0636999},
											   {Math.toRadians(80), 1.0150711},
											   {Math.toRadians(90), 0.999711}};
		
		for(int i = 0; i < testVector.length; i++)
		{
			double actualAirMass = getFixture().getAirMass(testVector[i][0]);
			assertEquals(testVector[i][1], actualAirMass, 1E-3);
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDirectSunIntensity(double, double) <em>Get Direct Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDirectSunIntensity(double, double)
	 * @generated_NOT
	 */
	public void testGetDirectSunIntensity__double_double() 
	{
		// {sunAltitudeAngle (rad), altitudeAboveSeeLevel (meters), expected direct sun intensity} 
		// see AtmposphereAttenuation.xlxs in /data.
		double[][] testVector = new double[][]{{Math.toRadians(-10), 0, 0.0},
											   {Math.toRadians(0), 0, 10.1943}, // Divide by 2 since sun at the horizon
											   {Math.toRadians(45), 0, 862.020},
											   {Math.toRadians(90), 0, 947.1659},
											   {Math.toRadians(0), 1500, 150.1185}, // Divide by 2 since sun at the horizon
											   {Math.toRadians(45), 1500, 965.126},
											   {Math.toRadians(90), 1500, 1032.3911}};
		
		for(int i = 0; i < testVector.length; i++)
		{
			double directSunIntensity = getFixture().getDirectSunIntensity(testVector[i][0], testVector[i][1]);
			assertEquals(testVector[i][2], directSunIntensity, 1E-3);
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDiffuseSunIntensity(double, double) <em>Get Diffuse Sun Intensity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getDiffuseSunIntensity(double, double)
	 * @generated_NOT
	 */
	public void testGetDiffuseSunIntensity__double_double() 
	{
		// {sunAltitudeAngle (rad), altitudeAboveSeeLevel (meters), expected direct sun intensity} 
		// see AtmposphereAttenuation.xlxs in /data.
		double[][] testVector = new double[][]{{Math.toRadians(0), 0, 1.01943},// Divide by 2 since sun at the horizon
											   {Math.toRadians(45), 0, 86.2020},
											   {Math.toRadians(90), 0, 94.71659},
											   {Math.toRadians(0), 1500, 15.01185}, // Divide by 2 since sun at the horizon
											   {Math.toRadians(45), 1500, 96.5126},
											   {Math.toRadians(90), 1500, 103.23911}};
		
		for(int i = 0; i < testVector.length; i++)
		{
			double directSunIntensity = getFixture().getDiffuseSunIntensity(testVector[i][0], testVector[i][1]);
			assertEquals(testVector[i][2], directSunIntensity, 1E-3);
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAtmosphereRefractionCorrection(double) <em>Get Atmosphere Refraction Correction</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AtmosphereUtils#getAtmosphereRefractionCorrection(double)
	 * @generated_NOT
	 */
	public void testGetAtmosphereRefractionCorrection__double() 
	{
		// Test the boundaries of the ranges.
		
		// Around -0.575 degrees.
		double geometricElevation = Math.toRadians(-0.574999);
		double expectedCorrection = 0.575; // Degrees
		double actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
		
		geometricElevation = Math.toRadians(-0.575001);		
		actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
		
		// Around 5 degrees.
		expectedCorrection = 0.16; // Degrees.
		geometricElevation = Math.toRadians(4.99999);		
		actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
		
		geometricElevation = Math.toRadians(5.0001);		
		actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
		
		// Around 85 degrees
		expectedCorrection = 0.001; // Degrees.
		geometricElevation = Math.toRadians(84.9999);		
		actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
		
		geometricElevation = Math.toRadians(85.0001);		
		actualCorrection = Math.toDegrees(getFixture().getAtmosphereRefractionCorrection(geometricElevation));
		assertEquals(expectedCorrection, actualCorrection, 0.01);
	}

	
	/**
	 * Generated an air mass vs sunAltitudeAngle csv file.
	 */
	public void testGenerateAirMassGraph() 
	{
		double sunAltitudeAngle = Math.toRadians(-15.0);
		double sunAltitudeAngleIncrement = Math.toRadians(0.01);
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("Sun Altitude Angle (deg), Air Mass\n");
		
		// from -15 to + 1 at high resolution
		while(sunAltitudeAngle < Math.toRadians(1))
		{
			double airMass = getFixture().getAirMass(sunAltitudeAngle);
			stringBuffer.append(Math.toDegrees(sunAltitudeAngle) + " , " + airMass + "\n");
			
			sunAltitudeAngle += sunAltitudeAngleIncrement;
		}
		
		// from +1 to + 90 at low resolution
		sunAltitudeAngleIncrement = Math.toRadians(1);
		while(sunAltitudeAngle < Math.toRadians(90))
		{
			double airMass = getFixture().getAirMass(sunAltitudeAngle);
			stringBuffer.append(Math.toDegrees(sunAltitudeAngle) + " , " + airMass + "\n");
			
			sunAltitudeAngle += sunAltitudeAngleIncrement;
		}
		
		
		Activator.getDefault().saveToFile(stringBuffer.toString(), "testGenerateAirMassGraph.csv");		
	}
	
	/**
	 * Generates a CSV of the atmosphere refraction correction as a function of elevation.
	 */
	public void testGenerateAtmosphereRefractionCorrectionGraph() 
	{
		double geometricElevation = Math.toRadians(-10.0);
		double atmosphereRefractionCorrection = 0.0;
		StringBuffer buffer = new StringBuffer();
		
		// Adds description line.
		buffer.append("Elevation (deg),Refraction Correction(deg)\n");
		
		while(geometricElevation <= Math.toRadians(90.0))
		{			
			atmosphereRefractionCorrection = getFixture().getAtmosphereRefractionCorrection(geometricElevation);
			buffer.append(Double.toString(Math.toDegrees(geometricElevation)) + "," + Double.toString(Math.toDegrees(atmosphereRefractionCorrection)) + "\n");			
			geometricElevation += Math.toRadians(0.1);
		}
				
		//System.out.println(buffer.toString());
		
		Activator.getDefault().saveToFile(buffer.toString(),"testGenerateAtmosphereRefractionCorrectionGraph.csv");
	}
} //AtmosphereUtilsTest
