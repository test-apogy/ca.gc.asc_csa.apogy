/**
 * Canadian Space Agency / Agence spatiale canadienne 2012-2015 Copyrights (c)
 */
package org.eclipse.symphony.core.invocator.tests;

import junit.textui.TestRunner;

import org.eclipse.symphony.core.invocator.EMFEcoreInvocatorFactory;
import org.eclipse.symphony.core.invocator.InitializationData;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Initialization Data</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InitializationDataTest extends AbstractInitializationDataTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(InitializationDataTest.class);
	}

	/**
	 * Constructs a new Initialization Data test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitializationDataTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Initialization Data test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected InitializationData getFixture() {
		return (InitializationData)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(EMFEcoreInvocatorFactory.eINSTANCE.createInitializationData());
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

} //InitializationDataTest
