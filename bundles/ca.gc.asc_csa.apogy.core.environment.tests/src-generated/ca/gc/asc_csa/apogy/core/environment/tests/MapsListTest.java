/**
 * Agence spatiale canadienne / Canadian Space Agency 2015 Copyrights (c)
 */
package ca.gc.asc_csa.apogy.core.environment.tests;

import ca.gc.asc_csa.apogy.core.environment.MapsList;
import ca.gc.asc_csa.apogy.core.environment.ApogyCoreEnvironmentFactory;

import junit.framework.TestCase;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Maps List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link ca.gc.asc_csa.apogy.core.environment.MapsList#getMapsListNode() <em>Maps List Node</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class MapsListTest extends TestCase {

	/**
	 * The fixture for this Maps List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapsList fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MapsListTest.class);
	}

	/**
	 * Constructs a new Maps List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MapsListTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Maps List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(MapsList fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Maps List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MapsList getFixture() {
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
		setFixture(ApogyCoreEnvironmentFactory.eINSTANCE.createMapsList());
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
	 * Tests the '{@link ca.gc.asc_csa.apogy.core.environment.MapsList#getMapsListNode() <em>Maps List Node</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.gc.asc_csa.apogy.core.environment.MapsList#getMapsListNode()
	 * @generated_NOT
	 */
	public void testGetMapsListNode() 
	{
		assertNotNull(getFixture().getMapsListNode());
	}

} //MapsListTest
