/**
 * Canadian Space Agency / Agence spatiale canadienne 2015 Copyrights (c)
 */
package org.eclipse.symphony.common.geometry.data3d.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent;
import org.eclipse.symphony.common.geometry.data3d.Symphony__CommonGeometryData3DFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Cartesian Coordinates Set Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension() <em>XDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension() <em>YDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension() <em>ZDimension</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class CartesianCoordinatesSetExtentTest extends TestCase {

	/**
	 * The fixture for this Cartesian Coordinates Set Extent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetExtent fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CartesianCoordinatesSetExtentTest.class);
	}

	/**
	 * Constructs a new Cartesian Coordinates Set Extent test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CartesianCoordinatesSetExtentTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Cartesian Coordinates Set Extent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CartesianCoordinatesSetExtent fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Cartesian Coordinates Set Extent test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CartesianCoordinatesSetExtent getFixture() {
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
		setFixture(Symphony__CommonGeometryData3DFactory.eINSTANCE.createCartesianCoordinatesSetExtent());
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
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension() <em>XDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getXDimension()
	 * @generated_NOT
	 */
	public void testGetXDimension() 
	{		
		getFixture().setXMin(-1);
		getFixture().setXMax(10);
		
		assertEquals(11, getFixture().getXDimension(), 1E-10);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension() <em>YDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getYDimension()
	 * @generated_NOT
	 */
	public void testGetYDimension() 
	{
		getFixture().setYMin(-50);
		getFixture().setYMax(100);
				
		assertEquals(150, getFixture().getYDimension(), 1E-10);
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension() <em>ZDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.common.geometry.data3d.CartesianCoordinatesSetExtent#getZDimension()
	 * @generated_NOT
	 */
	public void testGetZDimension() 
	{
		getFixture().setZMin(-150);
		getFixture().setZMax(10);
				
		assertEquals(160, getFixture().getZDimension(), 1E-10);
	}

} //CartesianCoordinatesSetExtentTest
