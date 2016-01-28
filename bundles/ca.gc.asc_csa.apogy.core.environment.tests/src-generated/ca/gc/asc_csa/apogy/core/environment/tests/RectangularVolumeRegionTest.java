/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.RectangularVolumeRegion;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Rectangular Volume Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZDimension() <em>ZDimension</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class RectangularVolumeRegionTest extends RectangularRegionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RectangularVolumeRegionTest.class);
	}

	/**
	 * Constructs a new Rectangular Volume Region test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RectangularVolumeRegionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Rectangular Volume Region test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected RectangularVolumeRegion getFixture() {
		return (RectangularVolumeRegion)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createRectangularVolumeRegion());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZDimension() <em>ZDimension</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.RectangularVolumeRegion#getZDimension()
	 * @generated_NOT
	 */
	public void testGetZDimension() 
	{
		  getFixture().setXMin(-10);
		  getFixture().setXMax(50);
		  getFixture().setYMin(0);
		  getFixture().setYMax(75);
		  getFixture().setZMin(-500);
		  getFixture().setZMax(0.9);
		  		  
		  assertEquals(500.9, getFixture().getZDimension());
	}

} //RectangularVolumeRegionTest
