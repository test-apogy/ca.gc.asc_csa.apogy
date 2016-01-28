/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.symphony.core.environment.EnvironmentUtilities;
import org.eclipse.symphony.core.environment.Star;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Environment Utilities</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#convertToJulianDate(java.util.Date) <em>Convert To Julian Date</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#parseRightAscension(java.lang.String) <em>Parse Right Ascension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#parseDegMinSec(java.lang.String) <em>Parse Deg Min Sec</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#sortByMagnitude(java.util.List) <em>Sort By Magnitude</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EnvironmentUtilitiesTest extends TestCase {

	/**
	 * The fixture for this Environment Utilities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentUtilities fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EnvironmentUtilitiesTest.class);
	}

	/**
	 * Constructs a new Environment Utilities test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvironmentUtilitiesTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Environment Utilities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(EnvironmentUtilities fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Environment Utilities test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvironmentUtilities getFixture() {
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEnvironmentUtilities());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#convertToJulianDate(java.util.Date) <em>Convert To Julian Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EnvironmentUtilities#convertToJulianDate(java.util.Date)
	 * @generated_NOT
	 */
	public void testConvertToJulianDate__Date() 
	{
		SimpleDateFormat simpleDateFormat =  new SimpleDateFormat("yyyy-MMM-dd kk:mm:ss.SSS z");
		
		try
		{
			// Sample data created using Calendar Date to Julian Date Converter developed by USNO.
			// see : http://www.usno.navy.mil/USNO/astronomical-applications/data-services/cal-to-jd-conv/?searchterm=Julian%20Date
			Date date = simpleDateFormat.parse("2000-Jan-1 12:00:00.000 GMT-00:00");						
			double expected = 2451545.0;
			double actual = getFixture().convertToJulianDate(date);
			assertEquals(expected, actual, 0.001);
			
			date = simpleDateFormat.parse("2010-Sep-23 10:15:01.500 GMT-00:00");
			expected = 2455462.92710;
			actual = getFixture().convertToJulianDate(date);
			assertEquals(expected, actual, 0.001);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#parseRightAscension(java.lang.String) <em>Parse Right Ascension</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EnvironmentUtilities#parseRightAscension(java.lang.String)
	 * @generated_NOT
	 */
	public void testParseRightAscension__String() 
	{
		String rightAscensionString = "00:00:00.00";	
		float expected = 0;
		float actual = 0;
		
		try 
		{
			rightAscensionString = "00:00:00.00";	
			actual = getFixture().parseRightAscension(rightAscensionString);
			expected = 0.0f;
			assertEquals(expected, actual, 1E-3);
			
			rightAscensionString = "24:00:00.00";	
			actual = getFixture().parseRightAscension(rightAscensionString);
			expected = (float) (2.0 * Math.PI);
			assertEquals(expected, actual, 1E-3);
			
			rightAscensionString = "12:00:00.00";	
			actual = getFixture().parseRightAscension(rightAscensionString);
			expected = (float) (Math.PI);
			assertEquals(expected, actual, 1E-3);
			
			rightAscensionString = "00:01:00.00";	
			actual = getFixture().parseRightAscension(rightAscensionString);
			expected = 0.0044f;
			assertEquals(expected, actual, 1E-3);
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#parseDegMinSec(java.lang.String) <em>Parse Deg Min Sec</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EnvironmentUtilities#parseDegMinSec(java.lang.String)
	 * @generated_NOT
	 */
	public void testParseDegMinSec__String() 
	{
		String degMinSecAngleString = "00:00:00.00";	
		float expected = 0;
		float actual = 0;
		
		try 
		{
			degMinSecAngleString = "00:00:00.00";	
			actual = getFixture().parseDegMinSec(degMinSecAngleString);
			expected = 0.0f;
			assertEquals(expected, actual, 1E-3);
			
			degMinSecAngleString = "90:00:00.00";	
			actual = getFixture().parseDegMinSec(degMinSecAngleString);
			expected = (float) (Math.PI / 2.0);
			assertEquals(expected, actual, 1E-3);
			
			degMinSecAngleString = "-90:00:00.00";	
			actual = getFixture().parseDegMinSec(degMinSecAngleString);
			expected = (float) (-Math.PI / 2.0);
			assertEquals(expected, actual, 1E-3);
			
			degMinSecAngleString = "-00:30:00.00";	
			actual = getFixture().parseDegMinSec(degMinSecAngleString);
			expected = (float) (-Math.toRadians(0.5));
			assertEquals(expected, actual, 1E-3);
			
			degMinSecAngleString = "-00:00:01.00";	
			actual = getFixture().parseDegMinSec(degMinSecAngleString);
			expected = (float) (-Math.toRadians(0.0003));
			assertEquals(expected, actual, 1E-3);			
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EnvironmentUtilities#sortByMagnitude(java.util.List) <em>Sort By Magnitude</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EnvironmentUtilities#sortByMagnitude(java.util.List)
	 * @generated_NOT
	 */
	public void testSortByMagnitude__List() 
	{
	  	List<Star> stars = new ArrayList<Star>();
		
		// Test with empty list.
		SortedSet<Star> sortedStars = getFixture().sortByMagnitude(stars);
		assertNotNull(sortedStars);
		
		// Test with one star.
		Star star1 = Symphony__CoreEnvironmentFacade.INSTANCE.createStar(1.0f, 0, 0);		
		stars.add(star1);
		sortedStars = getFixture().sortByMagnitude(stars);
		assertNotNull(sortedStars);
		assertEquals(1, sortedStars.size());
		
		// Test with 3 stars.
		Star star2 = Symphony__CoreEnvironmentFacade.INSTANCE.createStar(2.0f, 0, 0);	
		stars.add(star2);

		Star star3 = Symphony__CoreEnvironmentFacade.INSTANCE.createStar(0.1f, 0, 0);	
		stars.add(star3);
		
		sortedStars = getFixture().sortByMagnitude(stars);
		assertNotNull(sortedStars);
		assertEquals(3, sortedStars.size());
		
		assertEquals(star3, sortedStars.first());
		assertEquals(star2, sortedStars.last());
		
		// Test with two stars with the same magnitude but different Right Ascension.
		stars.clear();
		star1 = Symphony__CoreEnvironmentFacade.INSTANCE.createStar(1.1f, Math.toRadians(20), 0);
		stars.add(star1);
		
		star2 = Symphony__CoreEnvironmentFacade.INSTANCE.createStar(1.1f, Math.toRadians(10), 0);		
		stars.add(star2);
		
		sortedStars = getFixture().sortByMagnitude(stars);
		assertNotNull(sortedStars);
		assertEquals(2, sortedStars.size());
		
		assertEquals(star2, sortedStars.first());
		assertEquals(star1, sortedStars.last());
	}

} //EnvironmentUtilitiesTest
