/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.common.geometry.data3d.tests;

import javax.vecmath.Vector3d;

import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon;
import ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPositionCoordinates;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFacade;
import ca.gc.asc_csa.apogy.common.geometry.data3d.ApogyCommonGeometryData3DFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Polygon</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface() <em>Surface</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal() <em>Normal</em>}</li>
 *   <li>{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid() <em>Centroid</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianPolygonTest extends TestCase 
{

	/**
	 * The fixture for this Cartesian Polygon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPolygon fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianPolygonTest.class);
	}

	/**
	 * Constructs a new Cartesian Polygon test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianPolygonTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Polygon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianPolygon fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Polygon test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianPolygon getFixture() {
		return fixture;
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
		setFixture(ApogyCommonGeometryData3DFactory.eINSTANCE.createCartesianPolygon());
			
		CartesianPositionCoordinates p0 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 0, 0);
		CartesianPositionCoordinates p1 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(1, 0, 0);
		CartesianPositionCoordinates p2 = ApogyCommonGeometryData3DFacade.INSTANCE.createCartesianPositionCoordinates(0, 1, 0);
		
		getFixture().getVertices().add(p0);
		getFixture().getVertices().add(p1);
		getFixture().getVertices().add(p2);
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface() <em>Surface</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getSurface()
	 * @generated_NOT
	 */
	public void testGetSurface() {
		assertEquals(0.5, getFixture().getSurface(), 1e-6);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal() <em>Normal</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getNormal()
	 * @generated_NOT
	 */
	public void testGetNormal() 
	{
		Vector3d normal = getFixture().getNormal();
		
		assertEquals(0.0, normal.x);
		assertEquals(0.0, normal.y);
		assertEquals(1.0, normal.z);
	}

	/**
	 * Tests the '{@link ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid() <em>Centroid</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.common.geometry.data3d.CartesianPolygon#getCentroid()
	 * @generated_NOT
	 */
	public void testGetCentroid() 
	{
		CartesianPositionCoordinates centroid = getFixture().getCentroid();
		assertEquals(1.0/3.0, centroid.getX(), 1e-6);
		assertEquals(1.0/3.0, centroid.getY(), 1e-6);
		assertEquals(0.0, centroid.getZ(), 0.0);
	}

} //CartesianPolygonTest
