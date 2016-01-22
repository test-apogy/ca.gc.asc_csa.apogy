/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.EarthSkyNode;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Earth Sky Node</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EarthSkyNodeTest extends SkyNodeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EarthSkyNodeTest.class);
	}

	/**
	 * Constructs a new Earth Sky Node test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EarthSkyNodeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Earth Sky Node test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EarthSkyNode getFixture() {
		return (EarthSkyNode)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createEarthSkyNode());
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
} //EarthSkyNodeTest