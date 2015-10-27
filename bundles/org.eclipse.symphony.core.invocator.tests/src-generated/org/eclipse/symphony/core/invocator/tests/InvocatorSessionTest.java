/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import org.eclipse.symphony.core.invocator.InvocatorSession;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Invocator Session</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InvocatorSessionTest extends TestCase {

	/**
	 * The fixture for this Invocator Session test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocatorSession fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InvocatorSessionTest.class);
	}

	/**
	 * Constructs a new Invocator Session test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocatorSessionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Invocator Session test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(InvocatorSession fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Invocator Session test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InvocatorSession getFixture() {
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
		setFixture(Symphony__CoreInvocatorFactory.eINSTANCE.createInvocatorSession());
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

} //InvocatorSessionTest
