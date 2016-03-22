/**
 * Copyright (c) 2015-2016 Canadian Space Agency (CSA) / Agence spatiale canadienne (ASC).
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
package ca.gc.asc_csa.apogy.core.environment.orbit.earth.tests;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import ca.gc.asc_csa.apogy.core.environment.orbit.SpacecraftState;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ApogyCoreEnvironmentOrbitEarthFactory;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.ConstantElevationMask;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.EarthSurfaceLocation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.Eclipse;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.GroundStation;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLE;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPass;
import ca.gc.asc_csa.apogy.core.environment.orbit.earth.VisibilityPassSpacecraftPosition;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>TLE Earth Orbit Model</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TLEEarthOrbitModelTest extends EarthOrbitModelTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TLEEarthOrbitModelTest.class);
	}

	/**
	 * Constructs a new TLE Earth Orbit Model test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TLEEarthOrbitModelTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this TLE Earth Orbit Model test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TLEEarthOrbitModel getFixture() {
		return (TLEEarthOrbitModel)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated_NOT
	 */
	@Override
	protected void setUp() throws Exception 
	{
		// Sets a TLE of the ISS.
		//1 25544U 98067A   16078.17209663  .00016717  00000-0  10270-3 0  9047
		//2 25544  51.6394 151.9546 0002062 315.4376  44.6611 15.54170069 30823

		//Epoch (UTC): 	18 March 2016 04:07:49
		//Eccentricity: 	0.0002062
		//inclination: 	51.6394°
		//perigee height: 	403 km
		//apogee height: 	406 km
		//right ascension of ascending node: 	151.9546°
		//argument of perigee: 	315.4376°
		//revolutions per day: 	15.54170069
		//mean anomaly at epoch: 	44.6611°
		//orbit number at epoch: 	3082
		
		TLE tle = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createTLE();
		tle.setFirstLine("1 25544U 98067A   16077.22498784  .00011633  00000-0  18251-3 0  9999");
		tle.setSecondLine("2 25544  51.6438 156.6708 0001478 307.3798 150.1482 15.54156238990671");		
		
		TLEEarthOrbitModel tleEarthOrbitModel = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createTLEEarthOrbitModel();
		tleEarthOrbitModel.setTle(tle);
		
		setFixture(tleEarthOrbitModel);
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getOreKitTLEPropagator() <em>Get Ore Kit TLE Propagator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.orbit.earth.TLEEarthOrbitModel#getOreKitTLEPropagator()
	 * @generated_NOT
	 */
	public void testGetOreKitPropagator() 
	{
		assertNotNull(getFixture().getOreKitPropagator());
	}

	@Override
	public void testGetSpacecraftStates__Date_Date_double() 
	{
		try
		{
			Date fromDate = getFixture().getFromValidDate();
			Date toDate = new Date(fromDate.getTime() + 60 * 60 * 1000);		
	
			List<SpacecraftState> states = getFixture().getSpacecraftStates(fromDate, toDate, 60);
			assertNotNull(states);
			assertTrue(states.size() > 0);
			
			for(SpacecraftState ss : states)
			{
				System.out.println(ss.getTime() + ", " + ss.getCoordinates());
			}		
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			fail(t.getMessage());
		}
	}
	
	@Override
	public void testGetGroundStationPasses__GroundStation_Date_Date() 
	{
		try
		{
			Date fromDate = getFixture().getFromValidDate();
			Date toDate = getFixture().getToValidDate();		
			
			GroundStation groundStation = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createGroundStation();
			groundStation.setElevation(0);
			groundStation.setLatitude(Math.toRadians(51.47));
			groundStation.setLongitude(Math.toRadians(-88.15));
			
			ConstantElevationMask constantElevationMask = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createConstantElevationMask();
			constantElevationMask.setConstantElevation(Math.toRadians(10.0));
			groundStation.setElevationMask(constantElevationMask);
			
			List<VisibilityPass> passes = getFixture().getGroundStationPasses(groundStation, fromDate, toDate);
			assertTrue(passes.size() > 0);
			
			int i = 0;
			for(VisibilityPass visibilityPass : passes)
			{
				System.out.println("VisibilityPass #" + Integer.toString(i));
				System.out.println(visibilityPass.getSurfaceLocation());
				System.out.println(visibilityPass.getStartTime());			
				System.out.println("Pass History");
				
				assertNotNull(visibilityPass.getPositionHistory());
				
				for(VisibilityPassSpacecraftPosition position : visibilityPass.getPositionHistory().getPositions())
				{
					System.out.println("\t Altitude (km)   : " + position.getSpacecraftCoordinates().getElevation() / 1000.0);
					System.out.println("\t Latitude (deg)  : " + Math.toDegrees(position.getSpacecraftCoordinates().getLatitude()));
					System.out.println("\t Longitude (deg) : " + Math.toDegrees(position.getSpacecraftCoordinates().getLongitude()));
				}
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			fail(t.getMessage());
		}
	}
	
	@Override
	public void testGetTargetPasses__EarthSurfaceLocation_Date_Date_ElevationMask() 
	{
		try
		{
			Date fromDate = getFixture().getFromValidDate();
			Date toDate = getFixture().getToValidDate();		
			
			EarthSurfaceLocation earthSurfaceLocation = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createEarthSurfaceLocation();
			earthSurfaceLocation.setElevation(0);
			earthSurfaceLocation.setLatitude(Math.toRadians(51.47));
			earthSurfaceLocation.setLongitude(Math.toRadians(-88.15));
			
			ConstantElevationMask constantElevationMask = ApogyCoreEnvironmentOrbitEarthFactory.eINSTANCE.createConstantElevationMask();
			constantElevationMask.setConstantElevation(Math.toRadians(10.0));			
			
			List<VisibilityPass> passes = getFixture().getTargetPasses(earthSurfaceLocation, fromDate, toDate, constantElevationMask);
			assertTrue(passes.size() > 0);
			
			int i = 0;
			for(VisibilityPass visibilityPass : passes)
			{
				System.out.println("VisibilityPass #" + Integer.toString(i));
				System.out.println(visibilityPass.getSurfaceLocation());
				System.out.println(visibilityPass.getStartTime());			
				System.out.println("Pass History");
				
				assertNotNull(visibilityPass.getPositionHistory());
				
				for(VisibilityPassSpacecraftPosition position : visibilityPass.getPositionHistory().getPositions())
				{
					System.out.println("\t Altitude (km)   : " + position.getSpacecraftCoordinates().getElevation() / 1000.0);
					System.out.println("\t Latitude (deg)  : " + Math.toDegrees(position.getSpacecraftCoordinates().getLatitude()));
					System.out.println("\t Longitude (deg) : " + Math.toDegrees(position.getSpacecraftCoordinates().getLongitude()));
					System.out.println();
				}
				System.out.println();
			}
		}
		catch(Throwable t)
		{
			t.printStackTrace();
			fail(t.getMessage());
		}
	}
	
	@Override
	public void testGetEclipses__Date_Date() 
	{
		Date fromDate = getFixture().getFromValidDate();
		Date toDate = getFixture().getToValidDate();
		
		System.out.println("Start time : " + fromDate);
		System.out.println("End time   : " + toDate);
		
		try 
		{
			long starTime = System.currentTimeMillis();
			List<Eclipse> eclipses = getFixture().getEclipses(fromDate, toDate);
						
			assertEquals(15, eclipses.size());
			
			long endTime = System.currentTimeMillis();
			long duration = endTime-starTime;
			
			System.out.println("getEclipses() duration (ms) : " + duration);
			
			System.out.println(getAsCSV(eclipses));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}
	
	protected String getAsCSV(List<Eclipse> eclipses)
	{
		String string = "Eclipse, Penumbra Entry, Umbra Entry, Umbra Exit, Penumbra Exit \n";
		int i = 0;
		for(Eclipse eclipse : eclipses)
		{
			string += Integer.toString(i) + ",";			
			string += getEclipseAsString(eclipse) + "\n";							
			i++;
		}
		
		return string;
	}
	
	protected String getEclipseAsString(Eclipse eclipse)
	{
		String string = new String(); //"Eclipse, Penumbra Entry, Umbra Entry, Umbra Exit, Penumbra Exit";
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
					
		if(eclipse.getPenumbraEntry() == null)
		{
			string+= ",";
		}
		else
		{
			string+= dateFormat.format(eclipse.getPenumbraEntry().getTime()) + ",";
		}
		
		if(eclipse.getUmbraEntry() == null)
		{
			string+= ",";
		}
		else
		{
			string+= dateFormat.format(eclipse.getUmbraEntry().getTime()) + ",";
		}
		
		if(eclipse.getUmbraExit() == null)
		{
			string+= ",";
		}
		else
		{
			string+= dateFormat.format(eclipse.getUmbraExit().getTime()) + ",";
		}
		
		if(eclipse.getPenumbraExit() == null)
		{
			string+= "";
		}
		else
		{
			string+= dateFormat.format(eclipse.getPenumbraExit().getTime()) + "";
		}
		
		return string;
	}
} //TLEEarthOrbitModelTest
