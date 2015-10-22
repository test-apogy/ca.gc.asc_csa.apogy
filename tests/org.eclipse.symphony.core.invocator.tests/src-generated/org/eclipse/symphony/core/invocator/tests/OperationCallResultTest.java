/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.OperationCallResult;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Operation Call Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are tested:
 * <ul>
 *   <li>{@link org.eclipse.symphony.core.invocator.OperationCallResult#getOperationCall() <em>Operation Call</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class OperationCallResultTest extends AbstractResultTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(OperationCallResultTest.class);
	}

	/**
	 * Constructs a new Operation Call Result test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OperationCallResultTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Operation Call Result test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected OperationCallResult getFixture() {
		return (OperationCallResult)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createOperationCallResult());
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
	 * Tests the '{@link org.eclipse.symphony.core.invocator.OperationCallResult#getOperationCall() <em>Operation Call</em>}' feature getter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.symphony.core.invocator.OperationCallResult#getOperationCall()
	 * @generated
	 */
	public void testGetOperationCall() {
		// TODO: implement this feature getter test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //OperationCallResultTest
