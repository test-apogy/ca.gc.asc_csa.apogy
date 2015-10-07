/**
 * Canadian Space Agency / Agence spatiale canadienne 2012 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.OperationCallsList;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Calls List</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OperationCallsListTest extends ProgramTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationCallsListTest.class);
	}

	/**
	 * Constructs a new Operation Calls List test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallsListTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation Calls List test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationCallsList getFixture() {
		return (OperationCallsList)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createOperationCallsList());
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

} //OperationCallsListTest
