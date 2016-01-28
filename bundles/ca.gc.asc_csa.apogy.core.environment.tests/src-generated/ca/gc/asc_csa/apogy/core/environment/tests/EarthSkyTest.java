/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.common.topology.Node;
import org.eclipse.symphony.common.topology.TransformNode;
import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSkyNode;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.Moon;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Sky</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSky#getMoon() <em>Moon</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSky#getMoonHorizontalCoordinates() <em>Moon Horizontal Coordinates</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSky#getMoonAngularDiameter() <em>Get Moon Angular Diameter</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class EarthSkyTest extends SkyTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarthSkyTest.class);
	}

	/**
	 * Constructs a new Earth Sky test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSkyTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Earth Sky test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EarthSky getFixture() {
		return (EarthSky)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSky());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSky#getMoon() <em>Moon</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSky#getMoon()
	 * @generated_NOT
	 */
	public void testGetMoon() 
	{
	  	EarthSurfaceWorksite earthSurfaceWorksite = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite();
	  	earthSurfaceWorksite.setSky(getFixture());
	  	
	  	EarthSkyNode earthSkyNode = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSkyNode();
	  	Symphony__CoreEnvironmentFacade.INSTANCE.initializeEarthSkyNode(getFixture(), earthSkyNode);		
		
		// Verifies that the Moon is not null.
		Moon moon = getFixture().getMoon();
		assertNotNull(moon);
		
		// Verifies that the Moon is connected to the sky via a TransformNode.
		Node moonParent = moon.getParent();
		getFixture().getSkyNode().getChildren().contains(moonParent);
		assertTrue(moonParent instanceof TransformNode);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSky#getMoonHorizontalCoordinates() <em>Moon Horizontal Coordinates</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSky#getMoonHorizontalCoordinates()
	 * @generated_NOT
	 */
	public void testGetMoonHorizontalCoordinates() 
	{
		assertNotNull(getFixture().getMoonHorizontalCoordinates());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSky#setMoonHorizontalCoordinates(org.eclipse.symphony.core.environment.HorizontalCoordinates) <em>Moon Horizontal Coordinates</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSky#setMoonHorizontalCoordinates(org.eclipse.symphony.core.environment.HorizontalCoordinates)
	 * @generated_NOT
	 */
	public void testSetMoonHorizontalCoordinates() 
	{
		// Nothing to test.
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSky#getMoonAngularDiameter() <em>Get Moon Angular Diameter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSky#getMoonAngularDiameter()
	 * @generated_NOT
	 */
	public void testGetMoonAngularDiameter() 
	{
		// Creates a fully initialise EarthSurfaceWorksite.		
		EarthSurfaceWorksite earthSurfaceWorksite = Symphony__CoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite();		
		setFixture(earthSurfaceWorksite.getEarthSky());
		
		double moonAngularSize = getFixture().getMoonAngularDiameter();
		
		// Angular size goes from 29.3′ to 34.1′ (these are arc-minutes).
		double expectedAngularSize = 0.528333333; // average, in degrees
		double expectedDelta = 0.568333333 - 0.488333333; // 
		System.out.println("Moon Angular Diameter (deg) : " + Math.toDegrees(moonAngularSize));
		
		assertEquals(expectedAngularSize, Math.toDegrees(moonAngularSize), expectedDelta);
	}

} //EarthSkyTest
