/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EClassArgument;
import org.eclipse.symphony.core.invocator.Symphony__CoreInvocatorFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>EClass Argument</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EClassArgumentTest extends ArgumentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EClassArgumentTest.class);
	}

	/**
	 * Constructs a new EClass Argument test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClassArgumentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this EClass Argument test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClassArgument getFixture() {
		return (EClassArgument)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Symphony__CoreInvocatorFactory.eINSTANCE.createEClassArgument());
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

} //EClassArgumentTest
