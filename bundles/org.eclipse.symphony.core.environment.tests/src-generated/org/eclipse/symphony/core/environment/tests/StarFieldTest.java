/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package org.eclipse.symphony.core.environment.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.environment.StarField;
import org.eclipse.symphony.core.environment.Symphony__CoreEnvironmentFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Star Field</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StarFieldTest extends TestCase {

	/**
	 * The fixture for this Star Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StarField fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StarFieldTest.class);
	}

	/**
	 * Constructs a new Star Field test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StarFieldTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Star Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StarField fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Star Field test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StarField getFixture() {
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
		setFixture(Symphony__CoreEnvironmentFactory.eINSTANCE.createStarField());
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

	public void testGetStars()
	{
		try 
		{							
			getFixture().setStarFieldFileName("bright_star_catalog_5.txt");			
			assertEquals(9096, getFixture().getStars().size()); 
			
			getFixture().setStarFieldFileName("bright_star_catalog_ursa_minor.txt");
			assertEquals(7, getFixture().getStars().size()); 
		} 
		catch (Exception e) 
		{			
			e.printStackTrace();
			fail(e.getMessage());
		}					
	}
} //StarFieldTest
