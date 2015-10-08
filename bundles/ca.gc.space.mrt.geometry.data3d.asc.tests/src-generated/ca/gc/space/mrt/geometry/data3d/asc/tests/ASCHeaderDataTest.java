/**
 * Agence spatiale canadienne / Canadian Space Agency 2013 Copyrights (c)
 */
package ca.gc.space.mrt.geometry.data3d.asc.tests;

import ca.gc.space.mrt.geometry.data3d.asc.ASCHeaderData;
import ca.gc.space.mrt.geometry.data3d.asc.Data3DASCFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ASC Header Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ASCHeaderDataTest extends TestCase {

	/**
	 * The fixture for this ASC Header Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASCHeaderData fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ASCHeaderDataTest.class);
	}

	/**
	 * Constructs a new ASC Header Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASCHeaderDataTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this ASC Header Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ASCHeaderData fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this ASC Header Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ASCHeaderData getFixture() {
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
		setFixture(Data3DASCFactory.eINSTANCE.createASCHeaderData());
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

} //ASCHeaderDataTest
