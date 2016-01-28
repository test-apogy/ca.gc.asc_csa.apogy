/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import org.eclipse.symphony.core.environment.AstronomyUtils;
import org.eclipse.symphony.core.environment.Sun;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sun</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.environment.Sun#getIrradiance(double) <em>Get Irradiance</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class SunTest extends TestCase {

	/**
	 * The fixture for this Sun test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sun fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SunTest.class);
	}

	/**
	 * Constructs a new Sun test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SunTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Sun test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Sun fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Sun test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Sun getFixture() {
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createSun());
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
	 * Tests the '{@link org.eclipse.symphony.core.environment.Sun#getIrradiance(double) <em>Get Irradiance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.environment.Sun#getIrradiance(double)
	 * @generated_NOT
	 */
	public void testGetIrradiance__double() 
	{
		// Power is about 1366 W/m2 at 1 A.U.
		double distance = AstronomyUtils.INSTANCE.convertAUtoMeters(1.0);
		double powerAtEarth = getFixture().getIrradiance(distance);
		assertEquals(1366, powerAtEarth, 10);
	}

} //SunTest
