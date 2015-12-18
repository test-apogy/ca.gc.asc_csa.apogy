/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.EarthSurfaceEnvironment;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Surface Environment</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthSurfaceEnvironmentTest extends SurfaceEnvironmentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarthSurfaceEnvironmentTest.class);
	}

	/**
	 * Constructs a new Earth Surface Environment test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSurfaceEnvironmentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Earth Surface Environment test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EarthSurfaceEnvironment getFixture() {
		return (EarthSurfaceEnvironment)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSurfaceEnvironment());
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
	 * Test nothing.
	 */
	public void testNothing()
	{
		assertTrue(true);
	}
	
} //EarthSurfaceEnvironmentTest
