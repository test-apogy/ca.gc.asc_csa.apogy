/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSet;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianCoordinatesSetShapeSampler;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.SphereSamplingShape;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Coordinates Set Shape Sampler</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CartesianCoordinatesSetShapeSamplerTest extends TestCase {

	/**
	 * The fixture for this Cartesian Coordinates Set Shape Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetShapeSampler fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianCoordinatesSetShapeSamplerTest.class);
	}

	/**
	 * Constructs a new Cartesian Coordinates Set Shape Sampler test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetShapeSamplerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Coordinates Set Shape Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianCoordinatesSetShapeSampler fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Coordinates Set Shape Sampler test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetShapeSampler getFixture() {
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSetShapeSampler());
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
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void testProcess()
	{
		try
		{
			// Use the SphericalSamplingShape for the test.
			SphereSamplingShape sphericalSamplingShape = ApogyCommonGeometryData3DFactory.eINSTANCE.createSphereSamplingShape();
			sphericalSamplingShape.setRadius(10.0);
			sphericalSamplingShape.setCenter(ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 1));
			
			getFixture().getCoordinatesSamplingShapes().add(sphericalSamplingShape);
			
			CartesianCoordinatesSet input = ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSet();								
			
			// First, test on an empty set.
			try 
			{
				CartesianCoordinatesSet sampled = (CartesianCoordinatesSet) getFixture().process(input);
				assertNotNull(sampled);
				assertEquals(0, sampled.getPoints().size());
			} 
			catch (Exception e) 
			{			
				e.printStackTrace();
				fail();
			}
			
			
			// Test on a non-empty set.
			CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 1);
			input.getPoints().add(p0);
			CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 11);
			input.getPoints().add(p1);
			CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 1, 12);
			input.getPoints().add(p2);
			
			try 
			{
				CartesianCoordinatesSet sampled = (CartesianCoordinatesSet) getFixture().process(input);
				assertNotNull(sampled);
				assertEquals(2, sampled.getPoints().size());
				assertTrue(sampled.getPoints().get(0).equals(p0));
				assertTrue(sampled.getPoints().get(1).equals(p1));
			} 
			catch (Exception e) 
			{			
				e.printStackTrace();
				fail();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

} //CartesianCoordinatesSetShapeSamplerTest
