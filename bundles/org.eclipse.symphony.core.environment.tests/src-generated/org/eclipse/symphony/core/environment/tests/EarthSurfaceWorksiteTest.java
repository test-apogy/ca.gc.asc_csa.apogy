/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import java.util.Date;

import org.eclipse.symphony.core.environment.EarthSky;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksite;
import org.eclipse.symphony.core.environment.EarthSurfaceWorksiteNode;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFacade;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Surface Worksite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getEarthSky() <em>Earth Sky</em>}</li>
 * </ul>
 * </p>
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(org.eclipse.symphony.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToXYZPosition(org.eclipse.symphony.core.environment.GeographicCoordinates) <em>Convert To XYZ Position</em>}</li>
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceWorksite());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getEarthSky() <em>Earth Sky</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSurfaceWorksite#getEarthSky()
	 * @generated_NOT
	 */
	public void testGetEarthSky() {
		setFixture(Symphony__CoreEnvironmentFacade.INSTANCE.createAndInitializeDefaultCSAWorksite());
		assertNotNull(getFixture().getEarthSky());	
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#setEarthSky(org.eclipse.symphony.core.environment.EarthSky) <em>Earth Sky</em>}' feature setter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSurfaceWorksite#setEarthSky(org.eclipse.symphony.core.environment.EarthSky)
	 * @generated_NOT
	 */
	public void testSetEarthSky() 
	{
		EarthSky sky = Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSky();
		getFixture().setEarthSky(sky);
		sky.setTime(new Date());
		assertNotNull(getFixture().getSky());
		assertNotNull(getFixture().getEarthSky());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(org.eclipse.symphony.common.math.Tuple3d) <em>Convert To Geographic Coordinates</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToGeographicCoordinates(org.eclipse.symphony.common.math.Tuple3d)
	 * @generated_NOT
	 */
	public void testConvertToGeographicCoordinates__Tuple3d() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToXYZPosition(org.eclipse.symphony.core.environment.GeographicCoordinates) <em>Convert To XYZ Position</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.EarthSurfaceWorksite#convertToXYZPosition(org.eclipse.symphony.core.environment.GeographicCoordinates)
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
