/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.core.environment.RectangularRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rectangular Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getXDimension() <em>XDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getYDimension() <em>YDimension</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerLeftCorner() <em>Lower Left Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperLeftCorner() <em>Upper Left Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerRightCorner() <em>Lower Right Corner</em>}</li>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperRightCorner() <em>Upper Right Corner</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RectangularRegionTest extends RegionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RectangularRegionTest.class);
	}

	/**
	 * Constructs a new Rectangular Region test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularRegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rectangular Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RectangularRegion getFixture() {
		return (RectangularRegion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularRegion());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getXDimension() <em>XDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getXDimension()
	 * @generated_NOT
	 */
	public void testGetXDimension() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertEquals(60.0, getFixture().getXDimension());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getYDimension() <em>YDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getYDimension()
	 * @generated_NOT
	 */
	public void testGetYDimension() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertEquals(75.0, getFixture().getYDimension());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerLeftCorner() <em>Lower Left Corner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getLowerLeftCorner()
	 * @generated_NOT
	 */
	public void testGetLowerLeftCorner() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertNotNull(getFixture().getLowerLeftCorner());
		  assertEquals(-10.0, getFixture().getLowerLeftCorner().getX());
		  assertEquals(0.0, getFixture().getLowerLeftCorner().getY());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperLeftCorner() <em>Upper Left Corner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getUpperLeftCorner()
	 * @generated_NOT
	 */
	public void testGetUpperLeftCorner() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertNotNull(getFixture().getUpperLeftCorner());
		  assertEquals(-10.0, getFixture().getUpperLeftCorner().getX());
		  assertEquals(75.0, getFixture().getUpperLeftCorner().getY());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getLowerRightCorner() <em>Lower Right Corner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getLowerRightCorner()
	 * @generated_NOT
	 */
	public void testGetLowerRightCorner() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertNotNull(getFixture().getLowerRightCorner());
		  assertEquals(50.0, getFixture().getLowerRightCorner().getX());
		  assertEquals(0.0, getFixture().getLowerRightCorner().getY());
	}

	/**
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularRegion#getUpperRightCorner() <em>Upper Right Corner</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularRegion#getUpperRightCorner()
	 * @generated_NOT
	 */
	public void testGetUpperRightCorner() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  
		  assertNotNull(getFixture().getUpperRightCorner());
		  assertEquals(50.0, getFixture().getUpperRightCorner().getX());
		  assertEquals(75.0, getFixture().getUpperRightCorner().getY());
	}

} //RectangularRegionTest
