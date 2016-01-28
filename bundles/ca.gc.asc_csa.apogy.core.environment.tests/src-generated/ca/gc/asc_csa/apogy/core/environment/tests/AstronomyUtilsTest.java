/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.vecmath.Point3d;

import ca.gc.asc_csa.apogy.core.environment.AstronomyUtils;
import ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates;
import ca.gc.asc_csa.apogy.core.environment.EnvironmentUtilities;
import ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates;
import ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Astronomy Utils</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunEquatorialPosition(double) <em>Get Sun Equatorial Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double) <em>Get Horizontal Sun Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonEquatorialPosition(double) <em>Get Moon Equatorial Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double) <em>Get Moon Topocentric Equatorial Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double) <em>Get Horizontal Moon Position</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getTimeSinceJ2000(double) <em>Get Time Since J2000</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getLocalSideralTime(java.util.Date, double) <em>Get Local Sideral Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getUTCDecimalHours(java.util.Date) <em>Get UTC Decimal Hours</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date) <em>Convert To Horizontal Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertTimeToAngle(int, int, int) <em>Convert Time To Angle</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#clampAngleToZero2PI(double) <em>Clamp Angle To Zero2 PI</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates) <em>Convert To Equatorial Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert To Ecliptic Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates) <em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertAUtoMeters(double) <em>Convert AUto Meters</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMaximumSunAltitude(double) <em>Get Maximum Sun Altitude</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHHmmssString(double) <em>Convert To HHmmss String</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunRiseTime(java.util.Date, double, double) <em>Get Sun Rise Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunSetTime(java.util.Date, double, double) <em>Get Sun Set Time</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double) <em>Get Sun Highest Elevation Time</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AstronomyUtilsTest extends TestCase {

	/**
	 * The fixture for this Astronomy Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstronomyUtils fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AstronomyUtilsTest.class);
	}

	/**
	 * Constructs a new Astronomy Utils test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AstronomyUtilsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Astronomy Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AstronomyUtils fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Astronomy Utils test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AstronomyUtils getFixture() {
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createAstronomyUtils());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunEquatorialPosition(double) <em>Get Sun Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunEquatorialPosition(double)
	 * @generated_NOT
	 */
	public void testGetSunEquatorialPosition__double() 
	{
		// Format : Date, expectedRightAscension, expectedDeclination
		String[][] testVector = new String[][]{{"1990.04.19 00:00:00 UTC", "26.658", "11.008"},		
											   {"2000.01.01 12:00:00 UTC", "281.292", "-23.0332"},
											   {"2050.01.01 12:00:00 UTC", "282.2425", "-22.9556"}
												};								
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Test:                          : " + getName());
		System.out.println("------------------------------------------------------------");

		
		for(int i = 0; i < testVector.length; i++)
		{
			try
			{
				Date date = format.parse(testVector[i][0]);
				double julianDay = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);
				
				double expectedRightAscension = Double.parseDouble(testVector[i][1]);
				double expectedDeclination = Double.parseDouble(testVector[i][2]);
				
				EquatorialCoordinates equatorialCoordinates = getFixture().getSunEquatorialPosition(julianDay);
							
				System.out.println("------------------------------------------------------------");				
				System.out.println("Date                           : " + testVector[i][0]);
				System.out.println("Expected Right Ascension (deg) : " + expectedRightAscension);
				System.out.println("Actual Right Ascension (deg)   : " + Math.toDegrees(equatorialCoordinates.getRightAscension()));				
				System.out.println("Expected Declination (deg)     : " + expectedDeclination);
				System.out.println("Actual Declination (deg)       : " + Math.toDegrees(equatorialCoordinates.getDeclination()));
					
				assertEquals(expectedRightAscension, Math.toDegrees(equatorialCoordinates.getRightAscension()), 1E-2);
				assertEquals(expectedDeclination, Math.toDegrees(equatorialCoordinates.getDeclination()), 1E-2);
			}
			catch(Exception e)
			{
				fail(e.getMessage());
			}
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double) <em>Get Horizontal Sun Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalSunPosition(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetHorizontalSunPosition__Date_double_double() 
	{
		// Data taken from http://www.esrl.noaa.gov/gmd/grad/solcalc/azel.html
		// Format : Location, Date, observerLongitude, observerLatitude, expectedAzimuth, expectedAltitude
		String[][] testVector = new String[][]{{"London, UK","2000.01.01 12:00:00 UTC", "-0.17", "51.500", "179.37" , "15.52"}, // London UK
											   {"Ottawa, Canada","2000.01.01 12:00:00 EDT", "-75.72", "45.42", "178.63" , "21.59"}, // Ottawa, Canada											   
								 			   {"Canberra, Australia","2011.02.18 00:46:31 UTC", "149.13", "-35.3", "46.857" , "58.78"}, // Canberra, Australia
								 			   {"0N-0E","2011.03.03 19:21:08 UTC", "0.0", "0.0", "−97.0451" , "-17.177348"} // O deg North, 0 deg East
											   };		
						
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Test:                    : " + getName());
		System.out.println("------------------------------------------------------------");
		
		for(int i = 0; i < testVector.length; i++)
		{
			try
			{
				String dateString = testVector[i][1];
				Date date = format.parse(dateString);										
				
				double observerLongitude = Double.parseDouble(testVector[i][2]);
				double observerLatitude = Double.parseDouble(testVector[i][3]);
				
				double expectedAzimuth = Double.parseDouble(testVector[i][4]);
				double expectedAltitude = Double.parseDouble(testVector[i][5]);
												
				HorizontalCoordinates horizontalCoordinates = getFixture().getHorizontalSunPosition(date, Math.toRadians(observerLongitude), Math.toRadians(observerLatitude));
				System.out.println("------------------------------------------------------------");								
				System.out.println("Date                     : " + dateString);
				System.out.println("Location                 : " + testVector[i][0]);
				System.out.println("Observer Longitude (deg) : " + observerLongitude);
				System.out.println("Observer Latitude  (deg) : " + observerLatitude);
				System.out.println("Actual Azimuth     (deg) : " + Math.toDegrees(horizontalCoordinates.getAzimuth()));
				System.out.println("Expected Azimuth   (deg) : " + expectedAzimuth + "\n");
				System.out.println("Actual Altitude    (deg) : " + Math.toDegrees(horizontalCoordinates.getAltitude()));
				System.out.println("Expected Altitude  (deg) : " + expectedAltitude);		
				
				assertEquals(expectedAzimuth, Math.toDegrees(horizontalCoordinates.getAzimuth()), 0.5);
				assertEquals(expectedAltitude, Math.toDegrees(horizontalCoordinates.getAltitude()), 1.0);
			}
			catch(Exception e)
			{
				// fail(e.getMessage());
			}
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonEquatorialPosition(double) <em>Get Moon Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonEquatorialPosition(double)
	 * @generated_NOT
	 */
	public void testGetMoonEquatorialPosition__double() 
	{
		// Format : Date, expectedRightAscension, expectedDeclination
		String[][] testVector = new String[][]{{"1990.04.19 00:00:00 UTC", "309.5011", "-19.1032"},
											   {"2000.01.01 12:00:00 UTC", "222.479", "-10.897"},
											   {"2050.01.01 12:00:00 UTC", "22.446", "12.4947"}
												};								
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Test:                          : " + getName());
		System.out.println("------------------------------------------------------------");

		
		for(int i = 0; i < testVector.length; i++)
		{
			try
			{
				Date date = format.parse(testVector[i][0]);
				double julianDay = EnvironmentUtilities.INSTANCE.convertToJulianDate(date);
				
				double expectedRightAscension = Double.parseDouble(testVector[i][1]);
				double expectedDeclination = Double.parseDouble(testVector[i][2]);
				
				EquatorialCoordinates equatorialCoordinates = getFixture().getMoonEquatorialPosition(julianDay);
							
				System.out.println("------------------------------------------------------------");				
				System.out.println("Date                           : " + testVector[i][0]);
				System.out.println("Expected Right Ascension (deg) : " + expectedRightAscension);
				System.out.println("Actual Right Ascension (deg)   : " + Math.toDegrees(equatorialCoordinates.getRightAscension()));				
				System.out.println("Expected Declination (deg)     : " + expectedDeclination);
				System.out.println("Actual Declination (deg)       : " + Math.toDegrees(equatorialCoordinates.getDeclination()));
					
				assertEquals(expectedRightAscension, Math.toDegrees(equatorialCoordinates.getRightAscension()), 1E-2);
				assertEquals(expectedDeclination, Math.toDegrees(equatorialCoordinates.getDeclination()), 1E-2);
			}
			catch(Exception e)
			{
				fail(e.getMessage());
			}
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double) <em>Get Moon Topocentric Equatorial Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMoonTopocentricEquatorialPosition(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetMoonTopocentricEquatorialPosition__Date_double_double() 
	{
		String dateString = "1990.04.19 00:00:00 UTC";				
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		double observerLongitude = Math.toRadians(15.0);
		double observerLatitude = Math.toRadians(60.0);
		
		try
		{
			Date date = format.parse(dateString);					
			EquatorialCoordinates equatorialCoordinates = getFixture().getMoonTopocentricEquatorialPosition(date, observerLongitude, observerLatitude);
			System.out.println("RA (deg)   : " + Math.toDegrees(equatorialCoordinates.getRightAscension()));
			System.out.println("Decl (deg) : " + Math.toDegrees(equatorialCoordinates.getDeclination()));
			
			assertEquals(310.0017, Math.toDegrees(equatorialCoordinates.getRightAscension()), 1E-2);
			assertEquals(-19.8790, Math.toDegrees(equatorialCoordinates.getDeclination()), 1E-2);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double) <em>Get Horizontal Moon Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getHorizontalMoonPosition(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetHorizontalMoonPosition__Date_double_double() 
	{
		// Format : Location, Date, observerLongitude, observerLatitude, expectedAzimuth, expectedGeometricAltitude
		String[][] testVector = new String[][]{{"London, UK", "2000.01.01 12:00:00 UTC", "-0.17", "51.500", "237.620" , "9.338"}, // London UK
											   {"Ottawa, Canada","2000.01.01 12:00:00 UTC", "-75.7", "45.416", "159.47" , "30.681"}, // Ottawa, Canada
											   {"Canberra, Australia","2011.02.18 00:46:31 UTC", "149.13", "-35.3", "214.997" , "-60.454"}, // Canberra, Australia
											   {"0N-0E","2011.03.03 19:21:08 UTC", "0.0", "0.0", "262.05318235656426" , "-30.3516695"} // ON, OE
												};		
						
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		System.out.println("------------------------------------------------------------");
		System.out.println("Test:                    : " + getName());
		System.out.println("------------------------------------------------------------");

		
		for(int i = 0; i < testVector.length; i++)
		{
			try
			{
				String dateString = testVector[i][1];
				Date date = format.parse(dateString);										
				
				double observerLongitude = Double.parseDouble(testVector[i][2]);
				double observerLatitude = Double.parseDouble(testVector[i][3]);
				
				double expectedAzimuth = Double.parseDouble(testVector[i][4]);
				double expectedAltitude = Double.parseDouble(testVector[i][5]);
												
				HorizontalCoordinates horizontalCoordinates = getFixture().getHorizontalMoonPosition(date, Math.toRadians(observerLongitude), Math.toRadians(observerLatitude));
				System.out.println("------------------------------------------------------------");
				System.out.println("Date                     : " + dateString);
				System.out.println("Location                 : " + testVector[i][0]);				
				System.out.println("Observer Longitude (deg) : " + observerLongitude);
				System.out.println("Observer Latitude  (deg) : " + observerLatitude);
				System.out.println("Actual Azimuth     (deg) : " + Math.toDegrees(horizontalCoordinates.getAzimuth()));
				System.out.println("Expected Azimuth   (deg) : " + expectedAzimuth + "\n");
				System.out.println("Actual Altitude    (deg) : " + Math.toDegrees(horizontalCoordinates.getAltitude()));
				System.out.println("Expected Altitude  (deg) : " + expectedAltitude);		
				
				assertEquals(expectedAzimuth, Math.toDegrees(horizontalCoordinates.getAzimuth()), 0.1);
				assertEquals(expectedAltitude, Math.toDegrees(horizontalCoordinates.getAltitude()), 0.1);
			}
			catch(Exception e)
			{
				// fail(e.getMessage());
			}
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getTimeSinceJ2000(double) <em>Get Time Since J2000</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getTimeSinceJ2000(double)
	 * @generated_NOT
	 */
	public void testGetTimeSinceJ2000__double() 
	{
	  	double J2000 = 2451545.0;
		
		// Test with J2000.
		assertEquals(0, getFixture().getTimeSinceJ2000(J2000), 1E-6);
		
		// Test before J2000.
		double d = J2000 - 1.0;
		assertEquals(-1, getFixture().getTimeSinceJ2000(d), 1E-6);
		
		// Test before J2000.
		d = J2000 + 1.2;
		assertEquals(1.2, getFixture().getTimeSinceJ2000(d), 1E-6);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getLocalSideralTime(java.util.Date, double) <em>Get Local Sideral Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getLocalSideralTime(java.util.Date, double)
	 * @generated_NOT
	 */
	public void testGetLocalSideralTime__Date_double() 
	{
		// Test vector : date, observerLongitude, expected hours, expected min, expected seconds. 
		String[][] testVector = new String[][]{{"2011.02.08 10:30:00 EST", "-73.61", "19","49","52" },
											   {"2000.01.01 12:00:00 UTC", "-0.1", "18","41","45" }};				
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");								
		for(int i =0; i < testVector.length; i++)
		{
			try
			{
				String dateString = testVector[i][0];
				Date date = format.parse(dateString);
				
				double observerLongitude = Math.toRadians(Double.parseDouble(testVector[i][1])); 
				int expectedLocalSiderealTimeHours = Integer.parseInt(testVector[i][2]);
				int expectedLocalSiderealTimeMin = Integer.parseInt(testVector[i][3]);
				int expectedLocalSiderealTimeSec = Integer.parseInt(testVector[i][4]);
				
				double actualSideralTime = getFixture().getLocalSideralTime(date, observerLongitude);
				
				double expectedLocalSiderealTime = getFixture().convertTimeToAngle(expectedLocalSiderealTimeHours, expectedLocalSiderealTimeMin, expectedLocalSiderealTimeSec);
								
				System.out.println("------------------------------------------------------------------------");
				System.out.println("Date                                  : " + dateString);
				System.out.println("Observer Longitude (deg)              : " + Math.toDegrees(observerLongitude));
				System.out.println("expectedLocalSiderealTime (HH:mm:ss)  : " + expectedLocalSiderealTimeHours + ":" + expectedLocalSiderealTimeMin + ":" + expectedLocalSiderealTimeSec);
				System.out.println("expectedLocalSiderealTime (deg)       : " + Math.toDegrees(expectedLocalSiderealTime));
				System.out.println("actualSideralTime         (deg)       : " + Math.toDegrees(actualSideralTime));
				
				assertEquals(Math.toDegrees(expectedLocalSiderealTime), Math.toDegrees(actualSideralTime), 0.25);
			}
			catch(Exception e)
			{
				fail(e.getMessage());
			}	
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getUTCDecimalHours(java.util.Date) <em>Get UTC Decimal Hours</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getUTCDecimalHours(java.util.Date)
	 * @generated_NOT
	 */
	public void testGetUTCDecimalHours__Date() 
	{
		String dateString = "2011.02.09 10:30:00 EST";
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		double expectedDecimalUTC = 15.0 + (30.0 / 60); // 15:30:00

		try
		{
			Date date = format.parse(dateString);
			double decimalUTCTime = getFixture().getUTCDecimalHours(date);
			
			assertEquals(expectedDecimalUTC, decimalUTCTime, 1E-6);
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date) <em>Convert To Horizontal Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHorizontalCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates, double, double, java.util.Date)
	 * @generated_NOT
	 */
	public void testConvertToHorizontalCoordinates__EquatorialCoordinates_double_double_Date() 
	{
		// Test case taken from http://www.jgiesen.de/elevaz/basics/index.htm
		// An observer O at geogr. latitude beta=50° N and longitude 10° E, on 1991/05/19 at 13:00 UT,
		// will see a star of right ascension RA=55.8° and declination delta=19.7°
		// at azimuth az = 223.6° from North and altitude h=53.4°
		// (Sidereal time is 81.7°, hour angle is 25.9°)
		
		String dateString = "1991.05.19 13:00:00 UTC";
		double observerLongitude = Math.toRadians(10);
		double observerLatitude = Math.toRadians(50);
		
		EquatorialCoordinates equatorialCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		equatorialCoordinates.setRightAscension(Math.toRadians(55.8));
		equatorialCoordinates.setDeclination(Math.toRadians(19.7));
		
		double expectedAzimuth = -136.4;  // 223.6° from North which is equivalent to -136.4  
		double expectedAltitude = 53.4; // In degrees.
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		try
		{
			Date date = format.parse(dateString);
			
			HorizontalCoordinates horizontalCoordinates = getFixture().convertToHorizontalCoordinates(equatorialCoordinates, observerLongitude, observerLatitude, date);
			
			System.out.println("Altitude (deg) " + Math.toDegrees(horizontalCoordinates.getAltitude()));
			System.out.println("Azimuth  (deg) " + Math.toDegrees(horizontalCoordinates.getAzimuth()));
		
			assertEquals(expectedAltitude, Math.toDegrees(horizontalCoordinates.getAltitude()), 0.1);
			assertEquals(expectedAzimuth, Math.toDegrees(horizontalCoordinates.getAzimuth()), 0.1);						
		}
		catch(Exception e)
		{
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertTimeToAngle(int, int, int) <em>Convert Time To Angle</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertTimeToAngle(int, int, int)
	 * @generated_NOT
	 */
	public void testConvertTimeToAngle__int_int_int() 
	{
		// Test extremes
		assertEquals(0.0, getFixture().convertTimeToAngle(0, 0, 0), 1E-6);		
		assertEquals(Math.toRadians(360.0), getFixture().convertTimeToAngle(24, 0, 0), 1E-6);
		
		// Test in between.
		assertEquals(Math.toRadians(180.0), getFixture().convertTimeToAngle(12, 0, 0), 1E-6);
		
		assertEquals(Math.toRadians(15.0), getFixture().convertTimeToAngle(1, 0, 0), 1E-6);	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#clampAngleToZero2PI(double) <em>Clamp Angle To Zero2 PI</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#clampAngleToZero2PI(double)
	 * @generated_NOT
	 */
	public void testClampAngleToZero2PI__double() 
	{
		assertEquals(Math.toRadians(0), getFixture().clampAngleToZero2PI(0), 1E-6);
		assertEquals(Math.toRadians(360), getFixture().clampAngleToZero2PI(Math.toRadians(360)), 1E-6);
		assertEquals(Math.toRadians(45), getFixture().clampAngleToZero2PI(Math.toRadians(405)), 1E-6);
		assertEquals(Math.toRadians(315), getFixture().clampAngleToZero2PI(Math.toRadians(-45)), 1E-6);
		assertEquals(Math.toRadians(90), getFixture().clampAngleToZero2PI(Math.toRadians(-270)), 1E-6);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates) <em>Convert To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEquatorialCoordinates(ca.gc.asc_csa.apogy.core.environment.EclipticCoordinates)
	 * @generated_NOT
	 */
	public void testConvertToEquatorialCoordinates__EclipticCoordinates() 
	{
		// longitude 306.94 deg,  latitude -0.55 deg,  distance 60.793 Earth radii
		// converts to :
		//  Right Acension = 309.5011 deg and Declination = -19.1032 deg
		
		EclipticCoordinates eclipticCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createEclipticCoordinates();
		eclipticCoordinates.setLatitude(Math.toRadians(-0.55));
		eclipticCoordinates.setLongitude(Math.toRadians(306.94));
		eclipticCoordinates.setRadius(60.793);
		
		EquatorialCoordinates equatorialCoordinates = getFixture().convertToEquatorialCoordinates(eclipticCoordinates);
		double actualRightAscension = getFixture().clampAngleToZero2PI(equatorialCoordinates.getRightAscension());
		assertEquals(309.5011, Math.toDegrees(actualRightAscension), 0.1);
		assertEquals(-19.1032, Math.toDegrees(equatorialCoordinates.getDeclination()), 0.1);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToEclipticCoordinates(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated_NOT
	 */
	public void testConvertToEclipticCoordinates__EquatorialCoordinates() 
	{
		//  Right Acension = 309.5011 deg and Declination = -19.1032 deg
		// converts to
		// longitude 306.94 deg,  latitude -0.55 deg,  distance 60.793 Earth radii		
		
		EquatorialCoordinates equatorialCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();		
		equatorialCoordinates.setRightAscension(Math.toRadians(309.5011));
		equatorialCoordinates.setDeclination(Math.toRadians(-19.1032));
		
		EclipticCoordinates eclipticCoordinates = getFixture().convertToEclipticCoordinates(equatorialCoordinates);
		double longitude = getFixture().clampAngleToZero2PI(eclipticCoordinates.getLongitude());
		assertEquals(306.94, Math.toDegrees(longitude), 0.1);
		assertEquals(-0.55, Math.toDegrees(eclipticCoordinates.getLatitude()), 0.1);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Ecliptic Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEclipticRectangular(javax.vecmath.Point3d)
	 * @generated_NOT
	 */
	public void testConvertFromEquatorialRectangularToEclipticRectangular__Point3d() 
	{
		// Equatorial coordinates x = 0.0, y = 1.0 z = 0.0
		// converts to
		// Ecliptic coordinates x = 0.0, y = 0.9178, z = 0.3971
		
		Point3d equatorialCoord = new Point3d(0, 0.9178, 0.3971);
		Point3d expectedEclipticCoord = new Point3d(0.0, 1.0, 0.0);
		Point3d actualEclipticCoord = getFixture().convertFromEquatorialRectangularToEclipticRectangular(equatorialCoord);
		
		System.out.println("Expected Ecliptic Coordinates : " + expectedEclipticCoord.toString());
		System.out.println("Actual Ecliptic Coordinates   : " + actualEclipticCoord.toString());
		
		assertEquals(expectedEclipticCoord.x, actualEclipticCoord.x, 1E-3);
		assertEquals(expectedEclipticCoord.y, actualEclipticCoord.y, 1E-3);
		assertEquals(expectedEclipticCoord.z, actualEclipticCoord.z, 1E-3);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEquatorialRectangular(javax.vecmath.Point3d)
	 * @generated_NOT
	 */
	public void testConvertFromEclipticRectangularToEquatorialRectangular__Point3d() 
	{
		// Ecliptic coordinates x = 0.0, y = 1.0, z = 0.0
		// converts to
		// Equatorial coordinates x = 0.0, y = 0.9178 z = 0.3971
		Point3d eclipticCoord = new Point3d(0.0, 1.0, 0.0);
		Point3d expectedEquatorialCoord = new Point3d(0, 0.9178, 0.3971);
		Point3d actualEquatorialCoord = getFixture().convertFromEclipticRectangularToEquatorialRectangular(eclipticCoord);
		
		System.out.println("Expected Equatorial Coordinates : " + expectedEquatorialCoord.toString());
		System.out.println("Actual Equatorial Coordinates   : " + actualEquatorialCoord.toString());
		
		assertEquals(expectedEquatorialCoord.x, actualEquatorialCoord.x, 1E-3);
		assertEquals(expectedEquatorialCoord.y, actualEquatorialCoord.y, 1E-3);
		assertEquals(expectedEquatorialCoord.z, actualEquatorialCoord.z, 1E-3);	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d) <em>Convert From Ecliptic Rectangular To Ecliptic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEclipticRectangularToEclipticCoordinates(javax.vecmath.Point3d)
	 * @generated_NOT
	 */
	public void testConvertFromEclipticRectangularToEclipticCoordinates__Point3d() 
	{
		//	    xeclip = +37.65311
		//	    yeclip = -47.57180
		//	    zeclip =  -0.41687
		//
		//	Convert to ecliptic longitude, latitude, and distance:
		//
		//	    long = 308.3616_deg
		//	    lat  =  -0.3937_deg
		//	    r    =  60.6713		
		Point3d eclipticCoord = new Point3d(37.65311, -47.57180,  -0.41687);
		EclipticCoordinates result = getFixture().convertFromEclipticRectangularToEclipticCoordinates(eclipticCoord);
		
		double longitude = getFixture().clampAngleToZero2PI(result.getLongitude());
		assertEquals(308.3616, Math.toDegrees(longitude), 1E-3);
		assertEquals(-0.3937, Math.toDegrees(result.getLatitude()), 1E-3);
		assertEquals(60.6713, result.getRadius(), 1E-3);		
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d) <em>Convert From Equatorial Rectangular To Equatorial Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialRectangularToEquatorialCoordinates(javax.vecmath.Point3d)
	 * @generated_NOT
	 */
	public void testConvertFromEquatorialRectangularToEquatorialCoordinates__Point3d() 
	{
		//	    xequat = 0.881048
		//	    yequat = 0.442312
		//	    zequat = 0.191778
		//
		//	    Convert to RA and Decl:
		//
		//	    r    =   1.004323  (unchanged)
		//	    RA   =  26.6580_deg = 26.6580/15 h = 1.77720 h = 1h 46m 37.9s
		//	    Decl = +11.0084_deg = +11_deg 0' 30"
	    
		Point3d equatorialCoord = new Point3d(0.881048, 0.442312, 0.191778);
		EquatorialCoordinates result = getFixture().convertFromEquatorialRectangularToEquatorialCoordinates(equatorialCoord);
		
		double rightAscension = getFixture().clampAngleToZero2PI(result.getRightAscension());
		assertEquals(26.6580, Math.toDegrees(rightAscension), 1E-3);
		assertEquals(11.0084, Math.toDegrees(result.getDeclination()), 1E-3);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates) <em>Convert From Horizontal Coordinates To Horizontal Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromHorizontalCoordinatesToHorizontalRectangular(ca.gc.asc_csa.apogy.core.environment.HorizontalCoordinates)
	 * @generated_NOT
	 */
	public void testConvertFromHorizontalCoordinatesToHorizontalRectangular__HorizontalCoordinates() 
	{
		// Test vector : azimuth (deg), altitude (deg), radius, xExpected, yExpected, zExpected 
		Double[][] testVector = new Double[][]{{0.0, 0.0, 1.0,    1.0, 0.0, 0.0},
											   {90.0, 0.0, 1.0,   0.0, -1.0, 0.0},
											   {180.0, 0.0, 1.0,  -1.0, 0.0, 0.0},
											   {270.0, 0.0, 1.0,  0.0, 1.0, 0.0},
											   {360.0, 0.0, 1.0,  1.0, 0.0, 0.0},
											   {45.0, 45.0, 1.0,  0.5, -0.5, 0.707106781},};

		
		HorizontalCoordinates horizontalCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createHorizontalCoordinates();
		Point3d expected = new Point3d();
		Point3d actual = new Point3d();
		
		for(int i =0; i < testVector.length; i++)
		{
			horizontalCoordinates.setAzimuth(Math.toRadians(testVector[i][0]));
			horizontalCoordinates.setAltitude(Math.toRadians(testVector[i][1]));			
			horizontalCoordinates.setRadius(testVector[i][2]);
			
			expected = new Point3d(testVector[i][3],testVector[i][4],testVector[i][5]);	
			actual = getFixture().convertFromHorizontalCoordinatesToHorizontalRectangular(horizontalCoordinates);
			System.out.println("-------------------------------------------------");
			System.out.println("Expected Position : " + expected.toString());
			System.out.println("Actual Position   : " + actual.toString());
			
			assertEquals(expected.x, actual.x, 1E-9);
			assertEquals(expected.y, actual.y, 1E-9);
			assertEquals(expected.z, actual.z, 1E-9);
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates) <em>Convert From Equatorial Coordinates To Equatorial Rectangular</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertFromEquatorialCoordinatesToEquatorialRectangular(ca.gc.asc_csa.apogy.core.environment.EquatorialCoordinates)
	 * @generated_NOT
	 */
	public void testConvertFromEquatorialCoordinatesToEquatorialRectangular__EquatorialCoordinates() 
	{
		EquatorialCoordinates equatorialCoordinates = ApogyCoreEnvironmentFactory.eINSTANCE.createEquatorialCoordinates();
		equatorialCoordinates.setRightAscension(0.0);
		equatorialCoordinates.setDeclination(0.0);
		equatorialCoordinates.setRadius(1.0);
		
		// Test with zero right ascension and declination.
		Point3d p = getFixture().convertFromEquatorialCoordinatesToEquatorialRectangular(equatorialCoordinates);
		System.out.println("p : " + p.toString());
		assertEquals(1.0, p.x, 0);
		assertEquals(0.0, p.y, 0);
		assertEquals(0.0, p.z, 0);
		
		// Test with right ascension 90 degrees, declination 0 degrees.
		equatorialCoordinates.setRightAscension(Math.toRadians(90.0));
		p = getFixture().convertFromEquatorialCoordinatesToEquatorialRectangular(equatorialCoordinates);
		System.out.println("p : " + p.toString());
		assertEquals(0.0, p.x, 1E-6);
		assertEquals(1.0, p.y, 1E-6);
		assertEquals(0.0, p.z, 1E-6);
		
		// Test with right ascension 90 degrees, declination 90 degrees.
		equatorialCoordinates.setRightAscension(Math.toRadians(90.0));
		equatorialCoordinates.setDeclination(Math.toRadians(90.0));
		p = getFixture().convertFromEquatorialCoordinatesToEquatorialRectangular(equatorialCoordinates);
		System.out.println("p : " + p.toString());
		assertEquals(0.0, p.x, 1E-6);
		assertEquals(0.0, p.y, 1E-6);
		assertEquals(1.0, p.z, 1E-6);
		
		// Test with right ascension 180 degrees, declination 0 degrees.
		equatorialCoordinates.setRightAscension(Math.toRadians(180.0));
		equatorialCoordinates.setDeclination(Math.toRadians(0.0));
		p = getFixture().convertFromEquatorialCoordinatesToEquatorialRectangular(equatorialCoordinates);
		System.out.println("p : " + p.toString());
		assertEquals(-1.0, p.x, 1E-6);
		assertEquals(0.0, p.y, 1E-6);
		assertEquals(0.0, p.z, 1E-6);
		
		// Test with right ascension 0 degrees, declination -45 degrees.
		equatorialCoordinates.setRightAscension(Math.toRadians(0));
		equatorialCoordinates.setDeclination(Math.toRadians(-45.0));
		p = getFixture().convertFromEquatorialCoordinatesToEquatorialRectangular(equatorialCoordinates);
		System.out.println("p : " + p.toString());
		assertEquals(Math.sqrt(2.0) / 2.0, p.x, 1E-6);
		assertEquals(0.0, p.y, 1E-6);
		assertEquals(-Math.sqrt(2.0) / 2.0, p.z, 1E-6);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertAUtoMeters(double) <em>Convert AUto Meters</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertAUtoMeters(double)
	 * @generated_NOT
	 */
	public void testConvertAUtoMeters__double() 
	{
		assertEquals(0, getFixture().convertAUtoMeters(0), 0);
		assertEquals(149597870.7 * 1E3, getFixture().convertAUtoMeters(1), 1);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMaximumSunAltitude(double) <em>Get Maximum Sun Altitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getMaximumSunAltitude(double)
	 * @generated_NOT
	 */
	public void testGetMaximumSunAltitude__double() 
	{
		// {observerLatitude (rad), expected maximum Sun Altitude, (rad)}
		// see http://www.physicalgeography.net/fundamentals/6h.html
		double[][] testVector = new double[][]{{Math.toRadians(90), Math.toRadians(23.5)},
											   {Math.toRadians(70), Math.toRadians(43.5)},
											   {Math.toRadians(66.5), Math.toRadians(47)},
											   {Math.toRadians(60), Math.toRadians(53.5)},
											   {Math.toRadians(50), Math.toRadians(63.5)},
											   {Math.toRadians(23.5), Math.toRadians(90)},
											   {Math.toRadians(0), Math.toRadians(90)},
											   {Math.toRadians(-23.5), Math.toRadians(90)},
											   {Math.toRadians(-50), Math.toRadians(63.5)},
											   {Math.toRadians(-60), Math.toRadians(53.5)},
											   {Math.toRadians(-66.5), Math.toRadians(47)},
											   {Math.toRadians(-70), Math.toRadians(43.5)},
											   {Math.toRadians(-90), Math.toRadians(23.5)}};
		
		for(int i = 0; i < testVector.length; i++)
		{
			double maximumSunAltitude = getFixture().getMaximumSunAltitude(testVector[i][0]);
			assertEquals(Math.toDegrees(testVector[i][1]), Math.toDegrees(maximumSunAltitude), 0.1);
		}
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHHmmssString(double) <em>Convert To HHmmss String</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#convertToHHmmssString(double)
	 * @generated_NOT
	 */
	public void testConvertToHHmmssString__double() 
	{		
		double sideralTime = 0.0;
		String actual = getFixture().convertToHHmmssString(sideralTime);
		String expected = new String("00:00:00");
		assertEquals(expected, actual);
		
		sideralTime = Math.toRadians(90);
		actual = getFixture().convertToHHmmssString(sideralTime);
		expected = new String("06:00:00");
		assertEquals(expected, actual);
		
		sideralTime = Math.toRadians(180);
		actual = getFixture().convertToHHmmssString(sideralTime);
		expected = new String("12:00:00");
		assertEquals(expected, actual);
		
		sideralTime = Math.toRadians(270);
		actual = getFixture().convertToHHmmssString(sideralTime);
		expected = new String("18:00:00");
		assertEquals(expected, actual);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunRiseTime(java.util.Date, double, double) <em>Get Sun Rise Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunRiseTime(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetSunRiseTime__Date_double_double() 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		String dateString = "2014.01.01 10:00:00 EST";
		double observerLongitude = Math.toRadians(-73.39);
		double observerLatitude = Math.toRadians(45.51);
		
		try 
		{
			Date day = dateFormat.parse(dateString);
			Date sunrise = getFixture().getSunRiseTime(day, observerLongitude, observerLatitude);
			System.out.println("Sunrise " + sunrise);			
		} 
		catch (ParseException e) 
		{			
			fail(e.getMessage());
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunSetTime(java.util.Date, double, double) <em>Get Sun Set Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunSetTime(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetSunSetTime__Date_double_double() 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		String dateString = "2014.01.01 10:00:00 EST";
		double observerLongitude = Math.toRadians(-73.39);
		double observerLatitude = Math.toRadians(45.51);
		//double observerLatitude = Math.toRadians(90);
		
		try 
		{
			Date day = dateFormat.parse(dateString);
			Date sunset = getFixture().getSunSetTime(day, observerLongitude, observerLatitude);
			System.out.println("Sunset " + sunset);
			
		} 
		catch (ParseException e) 
		{
			
			fail(e.getMessage());
		}	
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double) <em>Get Sun Highest Elevation Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.AstronomyUtils#getSunHighestElevationTime(java.util.Date, double, double)
	 * @generated_NOT
	 */
	public void testGetSunHighestElevationTime__Date_double_double() 
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss z");
		
		String dateString = "2014.01.01 10:00:00 EST";
		double observerLongitude = Math.toRadians(-73.39);
		double observerLatitude = Math.toRadians(45.51);
		//double observerLatitude = Math.toRadians(90);
		
		try 
		{
			Date day = dateFormat.parse(dateString);
			Date sunset = getFixture().getSunHighestElevationTime(day, observerLongitude, observerLatitude);
			System.out.println("Highest Elevation time: " + sunset);
			
		} 
		catch (ParseException e) 
		{			
			fail(e.getMessage());
		}
	}

} //AstronomyUtilsTest
